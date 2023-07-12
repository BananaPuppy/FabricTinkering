package net.bruhcraft.fabrictinkering.registries;

import net.bruhcraft.fabrictinkering.registries.blocks.tables.part_builder;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

import static net.bruhcraft.fabrictinkering.MainClass.MOD_ID;

public class ModBlocks {

    //Item Vars
        //Introduction TODO: Make textures work
    public static final Block PART_BUILDER = new part_builder();

    //registerModStuff
    public static void registerModBlocks(){
        //Introduction
        registerBlock("part_builder", PART_BUILDER);
    }

    //Util
    public static void registerBlock(String name, Block block) {
        Registry.register(Registries.BLOCK, new Identifier(MOD_ID, name), block);
    }
    public static void registerBlockToGroup(RegistryKey<ItemGroup> group, Block block){
        ItemGroupEvents.modifyEntriesEvent(group).register(content -> content.add(block));
    }
}
