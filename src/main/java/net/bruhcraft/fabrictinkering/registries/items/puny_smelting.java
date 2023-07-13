package net.bruhcraft.fabrictinkering.registries.items;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class puny_smelting extends Item {
    public puny_smelting(Settings settings) {
        super(settings);
    }

    /*TODO: add guidebook on-use menu, possibly look for a lib to handle this for me
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        return super.use(world, user, hand);
    }
     */

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("item.fabrictinkering.puny_smelting.tooltip").formatted(Formatting.GRAY));
        tooltip.add(Text.translatable("item.fabrictinkering.puny_smelting.tooltip2").formatted(Formatting.GRAY));
        super.appendTooltip(stack, world, tooltip, context);
    }
}
