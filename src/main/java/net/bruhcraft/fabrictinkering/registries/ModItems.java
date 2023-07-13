package net.bruhcraft.fabrictinkering.registries;

import net.bruhcraft.fabrictinkering.registries.items.materials_and_you;
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
import net.minecraft.util.Identifier;

import java.util.List;

import static net.bruhcraft.fabrictinkering.MainClass.MOD_ID;
import static net.bruhcraft.fabrictinkering.util.ItemGroupRegister.registerItemGroup;

public class ModItems {

    //Item Vars
        //Materials & You
    public static final Item MATERIALS_AND_YOU = new materials_and_you(new FabricItemSettings().maxCount(1));
    public static RegistryKey<ItemGroup> MATERIALS_AND_YOU_GROUP = registerItemGroup("Materials and You", MATERIALS_AND_YOU);
    public static final Item PATTERN = new Item(new FabricItemSettings().maxCount(64));
    public static final BlockItem PART_BUILDER = new BlockItem(ModBlocks.PART_BUILDER, new FabricItemSettings().maxCount(64));
    public static final BlockItem TINKER_STATION = new BlockItem(ModBlocks.TINKER_STATION, new FabricItemSettings().maxCount(64));
    public static final BlockItem PART_CHEST = new BlockItem(ModBlocks.PART_CHEST, new FabricItemSettings().maxCount(64));
    public static final BlockItem TINKERS_CHEST = new BlockItem(ModBlocks.TINKERS_CHEST, new FabricItemSettings().maxCount(64));
    public static final BlockItem GROUT = new grout(ModBlocks.GROUT, new FabricItemSettings().maxCount(64));
    //Puny Smelting
    public static final Item PUNY_SMELTING = new puny_smelting(new FabricItemSettings().maxCount(1));
    public static RegistryKey<ItemGroup> PUNY_SMELTING_GROUP = registerItemGroup("Puny Smelting", PUNY_SMELTING);

    //registerModStuff
    public static void registerModItems(){
            //Materials & You
        registerItem("materials_and_you", MATERIALS_AND_YOU);
        registerItemToGroup(MATERIALS_AND_YOU_GROUP, MATERIALS_AND_YOU);
        registerItemsToGroup(MATERIALS_AND_YOU_GROUP,
                List.of(
                        registerItem("pattern", PATTERN),
                        registerItem("part_builder", PART_BUILDER),
                        registerItem("tinker_station", TINKER_STATION),
                        registerItem("part_chest", PART_CHEST),
                        registerItem("tinkers_chest", TINKERS_CHEST),
                        registerItem("grout", GROUT)
                )
        );
        registerItem("puny_smelting", PUNY_SMELTING);
        registerItemToGroup(PUNY_SMELTING_GROUP, PUNY_SMELTING);
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
