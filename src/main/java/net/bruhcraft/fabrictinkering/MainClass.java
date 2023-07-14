package net.bruhcraft.fabrictinkering;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.bruhcraft.fabrictinkering.registries.ModBlocks.registerModBlocks;
import static net.bruhcraft.fabrictinkering.registries.ModItems.registerModItems;
import static net.bruhcraft.fabrictinkering.registries.ModMaterials.registerModMaterials;
import static net.bruhcraft.fabrictinkering.registries.ModParts.registerModParts;

public class MainClass implements ModInitializer {
	public static final String MOD_ID = "fabrictinkering";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Fabric Tinkering Initializing");

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

		LOGGER.info("Fabric Tinkering Initialized");
	}
}