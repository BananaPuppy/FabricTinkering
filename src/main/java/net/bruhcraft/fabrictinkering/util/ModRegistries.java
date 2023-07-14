package net.bruhcraft.fabrictinkering.util;

import static net.bruhcraft.fabrictinkering.MainClass.*;
import static net.bruhcraft.fabrictinkering.registries.blocks.ModBlocks.registerModBlocks;
import static net.bruhcraft.fabrictinkering.registries.ModItems.registerModItems;

public class ModRegistries {
    public static void registerModStuff(){
        LOGGER.info("Fabric Tinkering: Items Registering");
        registerModItems();
        LOGGER.info("Fabric Tinkering: Items Registered");

        LOGGER.info("Fabric Tinkering: Blocks Registering");
        registerModBlocks();
        LOGGER.info("Fabric Tinkering: Blocks Registered");
    }
}
