package net.bruhcraft.fabrictinkering.registries.items.parts;

import net.bruhcraft.fabrictinkering.registries.items.PartItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.Identifier;

import static net.bruhcraft.fabrictinkering.MainClass.MOD_ID;
import static net.bruhcraft.fabrictinkering.registries.ModRegisters.MATERIAL_REGISTRY;

public class repair_kit extends PartItem {
    public repair_kit(FabricItemSettings settings) {
        super(settings);
    }


    public static float getMaterialNBT(ItemStack itemStack){
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
}
