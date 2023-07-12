package net.bruhcraft.fabrictinkering.registries;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static net.bruhcraft.fabrictinkering.MainClass.MOD_ID;
import static net.bruhcraft.fabrictinkering.registries.ModItems.MATERIALS_AND_YOU;

public class ModItemGroups {

    //Vars
    public static RegistryKey<ItemGroup> MATERIALS_AND_YOU_GROUP;

    //registerModStuff
    public static void registerModItemGroups(){
        MATERIALS_AND_YOU_GROUP = registerItemGroup("Materials and You", MATERIALS_AND_YOU);
    }

    //Util
    public static RegistryKey<ItemGroup> registerItemGroup(String name, Item icon){
        RegistryKey<ItemGroup> ITEMGROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MOD_ID + name.toLowerCase().replaceAll("\\s+", "_")));
        Registry.register(Registries.ITEM_GROUP, ITEMGROUP, FabricItemGroup.builder()
                .icon(() -> new ItemStack(icon))
                .displayName(Text.translatable(name)).build());
        return ITEMGROUP;
    }
}
