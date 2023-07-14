package net.bruhcraft.fabrictinkering.registries;

import net.bruhcraft.fabrictinkering.registries.material.*;
import net.bruhcraft.fabrictinkering.supers.Material;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static net.bruhcraft.fabrictinkering.MainClass.MOD_ID;
import static net.bruhcraft.fabrictinkering.registries.ModRegisters.MATERIAL_REGISTRY;

public class ModMaterials {
    //Material Vars
    public static Material NO_MATERIAL = new no_material();
    public static Material ALUMINUM = new aluminum();
    public static Material AMETHYST_BRONZE = new amethyst_bronze();
    public static Material BAMBOO = new bamboo();
    public static Material BLAZING_BONE = new blazing_bone();
    public static Material BLOODBONE = new bloodbone();
    public static Material BONE = new bone();
    public static Material BRONZE = new bronze();
    public static Material CHORUS = new chorus();
    public static Material COBALT = new cobalt();
    public static Material CONSTANTAN = new constantan();
    public static Material COPPER = new copper();
    public static Material COPPER_OXIDIZED = new copper_oxidized();
    public static Material DARKTHREAD = new darkthread();
    public static Material ELECTRUM = new electrum();
    public static Material ENDER_PEARL = new ender_pearl();
    public static Material ENDERSLIME = new enderslime();
    public static Material FLINT = new flint();
    public static Material FLINT_BASALT = new flint_basalt();
    public static Material GLASS = new glass();
    public static Material GOLD = new gold();
    public static Material HEPATIZON = new hepatizon();
    public static Material INVAR = new invar();
    public static Material IRON = new iron();
    public static Material IRON_OXIDIZED = new iron_oxidized();
    public static Material LEAD = new lead();
    public static Material LEATHER = new leather();
    public static Material MANYULLYN = new manyullyn();
    public static Material NAHUATI = new nahuati();
    public static Material NECRONIUM = new necronium();
    public static Material NECROTIC_BONE = new necrotic_bone();
    public static Material OSMIUM = new osmium();
    public static Material PHANTOM = new phantom();
    public static Material PIG_IRON = new pig_iron();
    public static Material PLATED_SLIMEWOOD = new plated_slimewood();
    public static Material PLATINUM = new platinum();
    public static Material QUEENS_SLIME = new queens_slime();
    public static Material ROCK_ANDESITE = new rock_andesite();
    public static Material ROCK_BLACKSTONE = new rock_blackstone();
    public static Material ROCK_DEEPSLATE = new rock_deepslate();
    public static Material ROCK_DIORITE = new rock_diorite();
    public static Material ROCK_GRANITE = new rock_granite();
    public static Material ROCK_STONE = new rock_stone();
    public static Material ROSE_GOLD = new rose_gold();
    public static Material ROTTEN_FLESH = new rotten_flesh();
    public static Material SCORCHED_STONE = new scorched_stone();
    public static Material SEARED_STONE = new seared_stone();
    public static Material SILVER = new silver();
    public static Material SLIMESTEEL = new slimesteel();
    public static Material SLIMEWOOD_BLOODSHROOM = new slimewood_bloodshroom();
    public static Material SLIMEWOOD_GREENHEART = new slimewood_greenheart();
    public static Material SLIMEWOOD_SKYROOT = new slimewood_skyroot();
    public static Material STEEL = new steel();
    public static Material STRING = new string();
    public static Material TUNGSTEN = new tungsten();
    public static Material WHITESTONE = new whitestone();
    public static Material WHITESTONE_END = new whitestone_end();
    public static Material WOOD = new wood();
    public static Material WOOD_ACACIA = new wood_acacia();
    public static Material WOOD_BIRCH = new wood_birch();
    public static Material WOOD_CRIMSON = new wood_crimson();
    public static Material WOOD_DARK_OAK = new wood_dark_oak();
    public static Material WOOD_JUNGLE = new wood_jungle();
    public static Material WOOD_OAK = new wood_oak();
    public static Material WOOD_SPRUCE = new wood_spruce();
    public static Material WOOD_WARPED = new wood_warped();

    //registerModStuff
    public static void registerModMaterials(){
        NO_MATERIAL = registerMaterial(NO_MATERIAL);
        ALUMINUM = registerMaterial(ALUMINUM);
        AMETHYST_BRONZE = registerMaterial(AMETHYST_BRONZE);
        BAMBOO = registerMaterial(BAMBOO);
        BLAZING_BONE = registerMaterial(BLAZING_BONE);
        BLOODBONE = registerMaterial(BLOODBONE);
        BONE = registerMaterial(BONE);
        BRONZE = registerMaterial(BRONZE);
        CHORUS = registerMaterial(CHORUS);
        COBALT = registerMaterial(COBALT);
        CONSTANTAN = registerMaterial(CONSTANTAN);
        COPPER = registerMaterial(COPPER);
        COPPER_OXIDIZED = registerMaterial(COPPER_OXIDIZED);
        DARKTHREAD = registerMaterial(DARKTHREAD);
        ELECTRUM = registerMaterial(ELECTRUM);
        ENDER_PEARL = registerMaterial(ENDER_PEARL);
        ENDERSLIME = registerMaterial(ENDERSLIME);
        FLINT = registerMaterial(FLINT);
        FLINT_BASALT = registerMaterial(FLINT_BASALT);
        GLASS = registerMaterial(GLASS);
        GOLD = registerMaterial(GOLD);
        HEPATIZON = registerMaterial(HEPATIZON);
        INVAR = registerMaterial(INVAR);
        IRON = registerMaterial(IRON);
        IRON_OXIDIZED = registerMaterial(IRON_OXIDIZED);
        LEAD = registerMaterial(LEAD);
        LEATHER = registerMaterial(LEATHER);
        MANYULLYN = registerMaterial(MANYULLYN);
        NAHUATI = registerMaterial(NAHUATI);
        NECRONIUM = registerMaterial(NECRONIUM);
        NECRONIUM = registerMaterial(NECROTIC_BONE);
        OSMIUM = registerMaterial(OSMIUM);
        PHANTOM = registerMaterial(PHANTOM);
        PIG_IRON = registerMaterial(PIG_IRON);
        PLATED_SLIMEWOOD = registerMaterial(PLATED_SLIMEWOOD);
        PLATINUM = registerMaterial(PLATINUM);
        QUEENS_SLIME = registerMaterial(QUEENS_SLIME);
        ROCK_ANDESITE = registerMaterial(ROCK_ANDESITE);
        ROCK_BLACKSTONE = registerMaterial(ROCK_BLACKSTONE);
        ROCK_DEEPSLATE = registerMaterial(ROCK_DEEPSLATE);
        ROCK_DIORITE = registerMaterial(ROCK_DIORITE);
        ROCK_GRANITE = registerMaterial(ROCK_GRANITE);
        ROCK_STONE = registerMaterial(ROCK_STONE);
        ROSE_GOLD = registerMaterial(ROSE_GOLD);
        ROTTEN_FLESH = registerMaterial(ROTTEN_FLESH);
        SCORCHED_STONE = registerMaterial(SCORCHED_STONE);
        SEARED_STONE = registerMaterial(SEARED_STONE);
        SILVER = registerMaterial(SILVER);
        SLIMESTEEL = registerMaterial(SLIMESTEEL);
        SLIMEWOOD_BLOODSHROOM = registerMaterial(SLIMEWOOD_BLOODSHROOM);
        SLIMEWOOD_GREENHEART = registerMaterial(SLIMEWOOD_GREENHEART);
        SLIMEWOOD_SKYROOT = registerMaterial(SLIMEWOOD_SKYROOT);
        STEEL = registerMaterial(STEEL);
        STRING = registerMaterial(STRING);
        TUNGSTEN = registerMaterial(TUNGSTEN);
        WHITESTONE = registerMaterial(WHITESTONE);
        WHITESTONE_END = registerMaterial(WHITESTONE_END);
        WOOD = registerMaterial(WOOD);
        WOOD_ACACIA = registerMaterial(WOOD_ACACIA);
        WOOD_BIRCH = registerMaterial(WOOD_BIRCH);
        WOOD_CRIMSON = registerMaterial(WOOD_CRIMSON);
        WOOD_DARK_OAK = registerMaterial(WOOD_DARK_OAK);
        WOOD_JUNGLE = registerMaterial(WOOD_JUNGLE);
        WOOD_OAK = registerMaterial(WOOD_OAK);
        WOOD_SPRUCE = registerMaterial(WOOD_SPRUCE);
        WOOD_WARPED = registerMaterial(WOOD_WARPED);
    }

    //MATERIAL_REGISTRY.get(new Identifier(MOD_ID, "aluminum"));
    //Util
    //TODO: Material Groups
    public static Material registerMaterial(Material material) {
        Identifier identifier = new Identifier(MOD_ID, material.getPath());
        return Registry.register(MATERIAL_REGISTRY, identifier, material);
    }
}
