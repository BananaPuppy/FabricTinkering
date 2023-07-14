package net.bruhcraft.fabrictinkering.registries;

import net.bruhcraft.fabrictinkering.registries.items.materials_and_you;
import net.bruhcraft.fabrictinkering.registries.items.parts.*;
import net.bruhcraft.fabrictinkering.registries.items.puny_smelting;
import net.bruhcraft.fabrictinkering.registries.items.smeltery.seared.grout;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.List;

import static net.bruhcraft.fabrictinkering.MainClass.MOD_ID;
import static net.bruhcraft.fabrictinkering.util.ItemGroupRegister.registerItemGroup;

public class ModItems {

    //Item Vars
        //Materials & You
    public static final Item MATERIALS_AND_YOU = new materials_and_you(new FabricItemSettings().maxCount(1));
    public static final Item PATTERN = new Item(new FabricItemSettings().maxCount(64));
    public static final BlockItem PART_BUILDER = new BlockItem(ModBlocks.PART_BUILDER, new FabricItemSettings().maxCount(64));
    public static final BlockItem TINKER_STATION = new BlockItem(ModBlocks.TINKER_STATION, new FabricItemSettings().maxCount(64));
    public static final BlockItem PART_CHEST = new BlockItem(ModBlocks.PART_CHEST, new FabricItemSettings().maxCount(64));
    public static final BlockItem TINKERS_CHEST = new BlockItem(ModBlocks.TINKERS_CHEST, new FabricItemSettings().maxCount(64));
    public static final BlockItem GROUT = new grout(ModBlocks.GROUT, new FabricItemSettings().maxCount(64));
    public static RegistryKey<ItemGroup> MATERIALS_AND_YOU_GROUP = registerItemGroup("materials_and_you", MATERIALS_AND_YOU, Text.translatable("itemgroup.fabrictinkering.materials_and_you"));
        //Puny Smelting
    public static final Item PUNY_SMELTING = new puny_smelting(new FabricItemSettings().maxCount(1));
    public static RegistryKey<ItemGroup> PUNY_SMELTING_GROUP = registerItemGroup("puny_smelting", PUNY_SMELTING, Text.translatable("itemgroup.fabrictinkering.puny_smelting"));
        //Tool Parts
    public static final Item REPAIR_KIT = new repair_kit(new FabricItemSettings().maxCount(64));
    public static final Item PICK_HEAD = new pick_head(new FabricItemSettings().maxCount(64));
    public static final Item HAMMER_HEAD = new hammer_head(new FabricItemSettings().maxCount(64));
    public static final Item SMALL_AXE_HEAD = new small_axe_head(new FabricItemSettings().maxCount(64));
    public static final Item BROAD_AXE_HEAD = new broad_axe_head(new FabricItemSettings().maxCount(64));
    public static final Item SMALL_BLADE = new small_blade(new FabricItemSettings().maxCount(64));
    public static final Item BROAD_BLADE = new broad_blade(new FabricItemSettings().maxCount(64));
    public static final Item ROUND_PLATE = new round_plate(new FabricItemSettings().maxCount(64));
    public static final Item LARGE_PLATE = new large_plate(new FabricItemSettings().maxCount(64));
    public static final Item BOW_LIMB = new bow_limb(new FabricItemSettings().maxCount(64));
    public static final Item BOW_GRIP = new bow_grip(new FabricItemSettings().maxCount(64));
    public static final Item BOWSTRING = new bowstring(new FabricItemSettings().maxCount(64));
    public static final Item TOOL_BINDING = new tool_binding(new FabricItemSettings().maxCount(64));
    public static final Item TOOL_HANDLE = new tool_handle(new FabricItemSettings().maxCount(64));
    public static final Item TOUGH_HANDLE = new tough_handle(new FabricItemSettings().maxCount(64));
    public static RegistryKey<ItemGroup> PARTS_GROUP = registerItemGroup("tinkers_toolparts", PICK_HEAD, Text.translatable("itemgroup.fabrictinkering.tinkers_toolparts"));
        //Tools
    public static final Item TEST_TOOL = new Item(new FabricItemSettings());


    //registerModStuff TODO: Figure out Creative Tab Ordering
    public static void registerModItems(){

            //Materials & You
        registerItemsToGroup(MATERIALS_AND_YOU_GROUP, List.of(
                registerItem("materials_and_you", MATERIALS_AND_YOU),
                registerItem("pattern", PATTERN),
                registerItem("part_builder", PART_BUILDER),
                registerItem("tinker_station", TINKER_STATION),
                registerItem("part_chest", PART_CHEST),
                registerItem("tinkers_chest", TINKERS_CHEST),
                registerItem("grout", GROUT)
        ));
            //Puny Smelting
        registerItemsToGroup(PUNY_SMELTING_GROUP, List.of(
                registerItem("puny_smelting", PUNY_SMELTING)
        ));
            //Parts
        registerItemsToGroup(PARTS_GROUP, List.of(
                registerItem("repair_kit", REPAIR_KIT), //
                registerItem("pick_head", PICK_HEAD),
                registerItem("hammer_head", HAMMER_HEAD),
                registerItem("small_axe_head", SMALL_AXE_HEAD),
                registerItem("broad_axe_head", BROAD_AXE_HEAD),
                registerItem("small_blade", SMALL_BLADE), //
                registerItem("broad_blade", BROAD_BLADE),
                registerItem("round_plate", ROUND_PLATE), //
                registerItem("large_plate", LARGE_PLATE), //
                registerItem("bow_limb", BOW_LIMB),
                registerItem("bow_grip", BOW_GRIP),
                registerItem("bowstring", BOWSTRING), //
                registerItem("tool_binding", TOOL_BINDING), //
                registerItem("tool_handle", TOOL_HANDLE), //
                registerItem("tough_handle", TOUGH_HANDLE) //
        ));
            //Tools
        registerItem("test_tool", TEST_TOOL);
    }

    //Util
    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MOD_ID, name), item);
    }

    public static void registerItemToGroup(RegistryKey<ItemGroup> group, Item item){
        ItemGroupEvents.modifyEntriesEvent(group).register(content -> content.add(item));
    }

    public static void registerItemsToGroup(RegistryKey<ItemGroup> group, List<Item> items){
        for(Item item : items){
            registerItemToGroup(group, item);
        }
    }
}
