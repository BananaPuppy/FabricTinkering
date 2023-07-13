package net.bruhcraft.fabrictinkering.registries.items.smeltery.seared;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class grout extends BlockItem {

    public grout(Block block, FabricItemSettings settings) {
        super(block, settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("block.fabrictinkering.grout.tooltip").formatted(Formatting.GRAY));
        super.appendTooltip(stack, world, tooltip, context);
    }
}
