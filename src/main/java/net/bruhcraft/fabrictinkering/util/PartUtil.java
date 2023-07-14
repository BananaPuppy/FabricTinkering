package net.bruhcraft.fabrictinkering.util;

import net.bruhcraft.fabrictinkering.registries.ModParts;
import net.bruhcraft.fabrictinkering.supers.Material;
import net.bruhcraft.fabrictinkering.supers.Part;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import static net.bruhcraft.fabrictinkering.MainClass.MOD_ID;
import static net.bruhcraft.fabrictinkering.registries.ModRegisters.PART_REGISTRY;

public class PartUtil {

    public static ItemStack setPart(ItemStack itemStack, Part part) {
        Material material = MaterialUtil.materialFromItemStack(itemStack);
        Item item = part.getBaseItem();

        ItemStack newItemStack = item.getDefaultStack();
        newItemStack = MaterialUtil.setMaterial(newItemStack, material);
        newItemStack.setCount(itemStack.getCount());

        return newItemStack;
    }

    public static Part partFromItemStack(ItemStack itemStack) {
        String path = Registries.ITEM.getId(itemStack.getItem()).getPath();
        Identifier identifier = Util.identifierFromPath(path);
        Part part = PART_REGISTRY.get(identifier);
        if(part != null){
            return part;
        }
        return ModParts.NO_PART;
    }
}
