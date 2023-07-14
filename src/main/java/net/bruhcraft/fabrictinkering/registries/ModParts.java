package net.bruhcraft.fabrictinkering.registries;

import net.bruhcraft.fabrictinkering.registries.part.*;
import net.bruhcraft.fabrictinkering.supers.Material;
import net.bruhcraft.fabrictinkering.supers.Part;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.Set;

import static net.bruhcraft.fabrictinkering.MainClass.MOD_ID;
import static net.bruhcraft.fabrictinkering.registries.ModRegisters.MATERIAL_REGISTRY;
import static net.bruhcraft.fabrictinkering.registries.ModRegisters.PART_REGISTRY;

public class ModParts {
    //Part Vars
    public static Part NO_PART = new no_part();
    public static Part BOW_GRIP = new bow_grip();
    public static Part BOW_LIMB = new bow_limb();
    public static Part BOWSTRING = new bowstring();
    public static Part BROAD_AXE_HEAD = new broad_axe_head();
    public static Part BROAD_BLADE = new broad_blade();
    public static Part HAMMER_HEAD = new hammer_head();
    public static Part LARGE_PLATE = new large_plate();
    public static Part PICK_HEAD = new pick_head();
    public static Part REPAIR_KIT = new repair_kit();
    public static Part ROUND_PLATE = new round_plate();
    public static Part SMALL_AXE_HEAD = new small_axe_head();
    public static Part SMALL_BLADE = new small_blade();
    public static Part TOOL_BINDING = new tool_binding();
    public static Part TOOL_HANDLE = new tool_handle();
    public static Part TOUGH_HANDLE = new tough_handle();

    //registerModStuff
    public static void registerModParts(){
        //Material Lists
            //REPAIR_KIT
        Set<RegistryKey<Material>> keys = MATERIAL_REGISTRY.getKeys();
        List<Material> list = new java.util.ArrayList<>(List.of());
        for(RegistryKey<Material> k : keys){
            Material m = MATERIAL_REGISTRY.get(k);
            list.add(m);
        }
        REPAIR_KIT.setMaterials(list);
        //Registering
        NO_PART = registerPart(NO_PART);
        BOW_GRIP = registerPart(BOW_GRIP);
        BOW_LIMB = registerPart(BOW_LIMB);
        BOWSTRING = registerPart(BOWSTRING);
        BROAD_AXE_HEAD = registerPart(BROAD_AXE_HEAD);
        BROAD_BLADE = registerPart(BROAD_BLADE);
        HAMMER_HEAD = registerPart(HAMMER_HEAD);
        LARGE_PLATE = registerPart(LARGE_PLATE);
        PICK_HEAD = registerPart(PICK_HEAD);
        REPAIR_KIT = registerPart(REPAIR_KIT);
        ROUND_PLATE = registerPart(ROUND_PLATE);
        SMALL_AXE_HEAD = registerPart(SMALL_AXE_HEAD);
        SMALL_BLADE = registerPart(SMALL_BLADE);
        TOOL_BINDING = registerPart(TOOL_BINDING);
        TOOL_HANDLE = registerPart(TOOL_HANDLE);
        TOUGH_HANDLE = registerPart(TOUGH_HANDLE);


    }

    //PART_REGISTRY.get(new Identifier(MOD_ID, "aluminum"));
    //Util
    //TODO: Material Groups
    public static Part registerPart(Part part) {
        return Registry.register(PART_REGISTRY, new Identifier(MOD_ID, part.getPath()), part);
    }
}
