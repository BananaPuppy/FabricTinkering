package net.bruhcraft.fabrictinkering.util;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.MutableText;
import net.minecraft.util.Identifier;

import static net.bruhcraft.fabrictinkering.MainClass.MOD_ID;

public class ItemGroupRegister {
    public static RegistryKey<ItemGroup> registerItemGroup(String id, Item icon, MutableText displayName){
        RegistryKey<ItemGroup> itemGroup = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MOD_ID + id));
        Registry.register(Registries.ITEM_GROUP, itemGroup, FabricItemGroup.builder()
                .icon(() -> new ItemStack(icon))
                .displayName(displayName).build());
        return itemGroup;
    }
}
