package net.bruhcraft.fabrictinkering.registries.items;

import net.bruhcraft.fabrictinkering.registries.ModMaterials;
import net.bruhcraft.fabrictinkering.registries.ModParts;
import net.bruhcraft.fabrictinkering.types.Material;
import net.bruhcraft.fabrictinkering.util.MaterialUtil;
import net.bruhcraft.fabrictinkering.util.PartUtil;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionUtil;
import net.minecraft.registry.Registries;
import net.minecraft.screen.slot.Slot;
import net.minecraft.text.Text;
import net.minecraft.util.ClickType;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class PartItem extends Item {
    public PartItem(FabricItemSettings settings) {
        super(settings);
    }

    @Override
    public boolean onStackClicked(ItemStack stack, Slot slot, ClickType clickType, PlayerEntity player) {
        //TODO: Check if player is actually creating an item through the creative inventory?
        //TODO: Fixed Errors and now it's broken again lol
        if(clickType.equals(ClickType.LEFT) && player.isCreative()){
            if(PartUtil.getPart(stack).getBaseItem() == stack.getItem() && MaterialUtil.getMaterial(stack) != ModMaterials.__NULL__){
                MaterialUtil.setMaterial(stack, MaterialUtil.randomMaterial(PartUtil.getPart(stack)));
            }
        }
        return super.onStackClicked(stack, slot, clickType, player);
    }

    @Override
    public ItemStack getDefaultStack() {
        return MaterialUtil.setMaterial(super.getDefaultStack(), ModMaterials.__NULL__);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("item.fabrictinkering.base.tooltip").formatted(Formatting.GRAY));
        super.appendTooltip(stack, world, tooltip, context);
    }
    /*
    @Override //TODO: test appendTooltip NBT check
    public void appendTooltip(ItemStack itemStack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        NbtCompound nbt = new NbtCompound();
        itemStack.writeNbt(nbt);
        if(nbt != null && !nbt.contains("material")){
            tooltip.add(Text.translatable("item.fabrictinkering.base.tooltip").formatted(Formatting.GRAY));
        }
        super.appendTooltip(itemStack, world, tooltip, context);
    }
     */

    @Override
    public String getTranslationKey(ItemStack itemStack) {
        String keybase = "item.fabrictinkering.";
        Material m = MaterialUtil.getMaterial(itemStack);
        if(PartUtil.getPart(itemStack) != null) {
            if (m.getPath() != null && PartUtil.getPart(itemStack).getPath() != null) {
                String mpath = m.getPath();
                String ppath = PartUtil.getPart(itemStack).getPath();
                if (!mpath.equals("__null__")) {
                    //TODO: Check part names against TC
                    return keybase + ppath + "." + mpath;
                } else {
                    return keybase + ppath;
                }
            }
        }
        return keybase + Registries.ITEM.getId(itemStack.getItem()).getPath();
    }
}
