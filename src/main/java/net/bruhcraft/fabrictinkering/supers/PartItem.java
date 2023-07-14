package net.bruhcraft.fabrictinkering.supers;

import net.bruhcraft.fabrictinkering.MainClass;
import net.bruhcraft.fabrictinkering.registries.ModMaterials;
import net.bruhcraft.fabrictinkering.registries.ModParts;
import net.bruhcraft.fabrictinkering.util.MaterialUtil;
import net.bruhcraft.fabrictinkering.util.PartUtil;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class PartItem extends Item {
    public PartItem(FabricItemSettings settings) {
        super(settings);
    }

    @Override
    public ItemStack getDefaultStack() {
        return MaterialUtil.setMaterial(super.getDefaultStack(), ModMaterials.NO_MATERIAL);
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
        String key = "item.fabrictinkering";
        Part part = PartUtil.partFromItemStack(itemStack);
        Material material = MaterialUtil.materialFromItemStack(itemStack);

        if(part != ModParts.NO_PART) {
            if (material != ModMaterials.NO_MATERIAL) {
                key += "." + part.getID().getPath() + "." + material.getID().getPath();
            } else {
                key += "." + part.getID().getPath();
            }
        } else {
            key += "." + ModParts.NO_PART.getID().getPath() + "." + ModMaterials.NO_MATERIAL.getID().getPath();
        }
        return key;
    }

    //TODO: CREATIVE INVENTORY RANDOM FROM NO_PART & NO_MATERIAL
    //@Override
    //public boolean onStackClicked(ItemStack stack, Slot slot, ClickType clickType, PlayerEntity player) {
    //TODO: How to check if player is actually creating/spawning an item through the creative inventory?
}
