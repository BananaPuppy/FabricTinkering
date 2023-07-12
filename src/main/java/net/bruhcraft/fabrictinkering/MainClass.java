package net.bruhcraft.fabrictinkering;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.bruhcraft.fabrictinkering.util.ModRegistries.registerModStuff;

public class MainClass implements ModInitializer {
	public static final String MOD_ID = "fabrictinkering";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Fabric Tinkering Initializing");

		registerModStuff();

		LOGGER.info("Fabric Tinkering Initialized");
	}
}