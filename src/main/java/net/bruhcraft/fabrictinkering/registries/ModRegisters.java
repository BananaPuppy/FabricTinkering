package net.bruhcraft.fabrictinkering.registries;

import net.bruhcraft.fabrictinkering.types.Material;
import net.bruhcraft.fabrictinkering.types.Part;
import net.fabricmc.fabric.api.event.registry.FabricRegistryBuilder;
import net.fabricmc.fabric.api.event.registry.RegistryAttribute;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

import static net.bruhcraft.fabrictinkering.MainClass.MOD_ID;

public class ModRegisters {
        //MATERIAL REGISTRY
    static RegistryKey<Registry<Material>> materialsRegistryKey = RegistryKey.ofRegistry(
            new Identifier(MOD_ID, "materials")
        );
    public static Registry<Material> MATERIAL_REGISTRY = FabricRegistryBuilder.createSimple(materialsRegistryKey).attribute(RegistryAttribute.SYNCED).buildAndRegister();
        //PART REGISTRY
    static RegistryKey<Registry<Part>> partRegistryKey = RegistryKey.ofRegistry(
            new Identifier(MOD_ID, "parts")
        );
    public static Registry<Part> PART_REGISTRY = FabricRegistryBuilder.createSimple(partRegistryKey).attribute(RegistryAttribute.SYNCED).buildAndRegister();

}
