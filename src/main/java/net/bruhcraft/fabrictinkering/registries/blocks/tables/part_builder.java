package net.bruhcraft.fabrictinkering.registries.blocks.tables;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;

public class part_builder extends Block {
    public part_builder() {
        super(
                FabricBlockSettings.create().burnable()
        );
    }
}
