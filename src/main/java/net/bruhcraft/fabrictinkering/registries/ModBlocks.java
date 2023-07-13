package net.bruhcraft.fabrictinkering.registries;

import net.bruhcraft.fabrictinkering.registries.blocks.chests.part_chest;
import net.bruhcraft.fabrictinkering.registries.blocks.tables.part_builder;
import net.bruhcraft.fabrictinkering.registries.blocks.tables.tinker_station;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

import static net.bruhcraft.fabrictinkering.MainClass.MOD_ID;

public class ModBlocks {

    //Item Vars
        //Introduction
    public static final Block PART_BUILDER = new part_builder(FabricBlockSettings.create().burnable().nonOpaque());
    public static final Block TINKER_STATION = new tinker_station(FabricBlockSettings.create().burnable().nonOpaque());
    public static final Block PART_CHEST = new part_chest(FabricBlockSettings.create().burnable().nonOpaque());

    //registerModStuff
    public static void registerModBlocks(){
        //Introduction
        registerBlock("part_builder", PART_BUILDER);
        registerBlock("tinker_station", TINKER_STATION);
        registerBlock("part_chest", PART_CHEST);
    }

    //Util
    public static void registerBlock(String name, Block block) {
        Registry.register(Registries.BLOCK, new Identifier(MOD_ID, name), block);
    }
    public static void registerBlockToGroup(RegistryKey<ItemGroup> group, Block block){
        ItemGroupEvents.modifyEntriesEvent(group).register(content -> content.add(block));
    }
}
