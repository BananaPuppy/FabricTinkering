package net.bruhcraft.fabrictinkering.util;

import net.bruhcraft.fabrictinkering.registries.ModMaterials;
import net.bruhcraft.fabrictinkering.types.Material;
import net.bruhcraft.fabrictinkering.types.Part;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.List;

import static net.bruhcraft.fabrictinkering.registries.ModRegisters.MATERIAL_REGISTRY;

public class MaterialUtil {
    static String MATERIAL_KEY = "material";

    public static ItemStack setMaterial(ItemStack itemStack, Material material){
        if(material.getPath().equals("__null__")){
            itemStack.removeSubNbt(MATERIAL_KEY);
        } else {
            Identifier identifier = MATERIAL_REGISTRY.getId(material);
            //TODO: PLACE TO REDUCE NULL
            itemStack.getOrCreateNbt().putString(MATERIAL_KEY, identifier.toString());
            itemStack.setCustomName(Text.translatable(itemStack.getItem().getTranslationKey()));
        }
        return itemStack;
    }

    public static Material getMaterial(ItemStack itemStack){
        NbtCompound nbt = new NbtCompound(); //TODO:GETNBT??
        itemStack.writeNbt(nbt);
        if(nbt.contains(MATERIAL_KEY)){
            String identifier = nbt.getString(MATERIAL_KEY);
            return MATERIAL_REGISTRY.get(Identifier.tryParse(identifier));
        }
        return ModMaterials.__NULL__;
    }

    public static Material randomMaterial(Part part){
        List<Material> list = part.getMaterials();
        return list.get((int) Math.round(Math.random()*list.size()));
    }
}
