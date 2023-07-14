package net.bruhcraft.fabrictinkering.util;

import static net.bruhcraft.fabrictinkering.MainClass.*;
import static net.bruhcraft.fabrictinkering.registries.ModBlocks.registerModBlocks;
import static net.bruhcraft.fabrictinkering.registries.ModItems.registerModItems;
import static net.bruhcraft.fabrictinkering.registries.ModMaterials.registerModMaterials;
import static net.bruhcraft.fabrictinkering.registries.ModParts.registerModParts;

public class ModRegistries {
    public static void registerModStuff(){

        LOGGER.info("Fabric Tinkering: Materials Registering");
        registerModMaterials();
        LOGGER.info("Fabric Tinkering: Materials Registered");

        LOGGER.info("Fabric Tinkering: Parts Registering");
        registerModParts();
        LOGGER.info("Fabric Tinkering: Parts Registered");

        LOGGER.info("Fabric Tinkering: Items Registering");
        registerModItems();
        LOGGER.info("Fabric Tinkering: Items Registered");

        LOGGER.info("Fabric Tinkering: Blocks Registering");
        registerModBlocks();
        LOGGER.info("Fabric Tinkering: Blocks Registered");
    }
}
