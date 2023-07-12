package net.bruhcraft.fabrictinkering;

import net.bruhcraft.fabrictinkering.registries.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.bruhcraft.fabrictinkering.util.ModRegistries.registerModStuff;

@Environment(EnvType.CLIENT)
public class MainClassClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PART_BUILDER, RenderLayer.getCutout());
	}
}