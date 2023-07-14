package net.bruhcraft.fabrictinkering.util;

import net.bruhcraft.fabrictinkering.registries.ModMaterials;
import net.bruhcraft.fabrictinkering.supers.Material;
import net.bruhcraft.fabrictinkering.supers.Part;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.List;

import static net.bruhcraft.fabrictinkering.MainClass.MOD_ID;
import static net.bruhcraft.fabrictinkering.registries.ModRegisters.MATERIAL_REGISTRY;

public class MaterialUtil {
    static String MATERIAL_KEY = "material";

    public static ItemStack setMaterial(ItemStack itemStack, Material material){
        if(material.getPath().equals("__null__")){
            itemStack.removeSubNbt(MATERIAL_KEY);
        } else {
            Identifier identifier = MATERIAL_REGISTRY.getId(material);
            //TODO: PLACE TO REDUCE NULL
            itemStack.getOrCreateNbt().putString(MATERIAL_KEY, identifier.getPath());
            itemStack.setCustomName(Text.translatable(itemStack.getItem().getTranslationKey()));
        }
        return itemStack;
    }

    public static Identifier identifierFromPath(String path){
        path = path.replaceAll("[^a-z0-9/.-_]", "");
        return new Identifier(MOD_ID, path);
    }

    public static Material materialFromItemStack(ItemStack itemStack){
        NbtCompound nbt = new NbtCompound();
        itemStack.writeNbt(nbt);
        if(nbt.contains(MATERIAL_KEY)){
            String path = nbt.getString(MATERIAL_KEY);
            Identifier identifier = identifierFromPath(path);
            return MATERIAL_REGISTRY.get(identifier);
        }
        return ModMaterials.NO_MATERIAL;
    }

    public static float predicateFromItemStack(ItemStack itemStack){
        NbtCompound nbt = itemStack.getNbt();
        if(nbt != null && nbt.contains("material")){
            String path = nbt.getString("material");
            Identifier identifier = new Identifier(MOD_ID, path);
            if(MATERIAL_REGISTRY.get(identifier) != null){
                //TODO: NULL
                return MATERIAL_REGISTRY.get(identifier).getPredicate();
            }
        }
        return 0.0f;
    }

    public static Material randomMaterial(Part part){
        List<Material> list = part.getMaterials();
        return list.get((int) Math.round(Math.random()*list.size()));
    }
}
