package net.bruhcraft.fabrictinkering;

import net.bruhcraft.fabrictinkering.registries.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;

import java.util.List;

@Environment(EnvType.CLIENT)
public class MainClassClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		renderLayerCutout(List.of(
				ModBlocks.PART_BUILDER,
				ModBlocks.TINKER_STATION,
				ModBlocks.PART_CHEST,
				ModBlocks.TINKERS_CHEST
		));
	}

	public void renderLayerCutout(List<Block> blocks){
		for(Block block : blocks){
			BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutout());
		}
	}
}