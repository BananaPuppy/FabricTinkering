package net.bruhcraft.fabrictinkering.util;

import net.bruhcraft.fabrictinkering.registries.ModParts;
import net.bruhcraft.fabrictinkering.types.Part;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import static net.bruhcraft.fabrictinkering.MainClass.MOD_ID;
import static net.bruhcraft.fabrictinkering.registries.ModRegisters.PART_REGISTRY;

public class PartUtil {

    public static ItemStack setPart(ItemStack itemStack, Part part){
        if(!part.getPath().equals("__null__")){
            NbtCompound nbt = new NbtCompound();
            itemStack.writeNbt(nbt);

            Item item = part.getBaseItem();
            ItemStack newItemStack = item.getDefaultStack();
            newItemStack.setCount(itemStack.getCount());
            newItemStack.setNbt(nbt);

            return newItemStack;
        }
        return itemStack;
    }

    public static Part getPart(ItemStack itemStack) {
        //TODO: Work towards reducing null returns for this and getMaterial
        //TODO: Can prob do a better check than simply ItemStack != null lol
        if(itemStack != null){
            String path = Registries.ITEM.getId(itemStack.getItem()).getPath();
            return PART_REGISTRY.get(new Identifier(MOD_ID, path));
        } else {
            return ModParts.__NULL__;
        }
    }
}
