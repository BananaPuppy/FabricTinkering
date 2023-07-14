package net.bruhcraft.fabrictinkering.util;

import net.bruhcraft.fabrictinkering.MainClass;
import net.bruhcraft.fabrictinkering.registries.ModMaterials;
import net.bruhcraft.fabrictinkering.supers.Material;
import net.bruhcraft.fabrictinkering.supers.Part;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.Identifier;

import java.util.List;

import static net.bruhcraft.fabrictinkering.registries.ModRegisters.MATERIAL_REGISTRY;

public class MaterialUtil {
    static String MATERIAL_KEY = "material";

    public static ItemStack setMaterial(ItemStack itemStack, Material material) {
        if (material != null) {
            String path = material.getID().getPath();
            itemStack.getOrCreateNbt().putString(MATERIAL_KEY, path);
            //TODO: Dynamic Translation Key here?
        }
        return itemStack;
    }

    public static Material materialFromItemStack(ItemStack itemStack){
        NbtCompound nbt = itemStack.getNbt();
        if(nbt != null && nbt.getString(MATERIAL_KEY) != null){
            MainClass.LOGGER.info("LINE CHECKER");
            String path = nbt.getString(MATERIAL_KEY);
            Identifier identifier = Util.identifierFromPath(path);
            Material material = MATERIAL_REGISTRY.get(identifier);
            if(material != null){
                return material;
            }
        }
        return ModMaterials.NO_MATERIAL;
    }

    public static float predicateFromItemStack(ItemStack itemStack){
        NbtCompound nbt = itemStack.getNbt();
        if(nbt != null && nbt.contains("material")){
            String path = nbt.getString("material");
            Identifier identifier = Util.identifierFromPath(path);
            Material material = MATERIAL_REGISTRY.get(identifier);
            if(material != null){
                return material.getPredicate();
            }
        }
        return 0.0f;
    }

    public static Material randomMaterial(Part part){
        List<Material> list = part.getMaterials();
        return list.get((int) Math.round(Math.random()*list.size()));
    }
}
