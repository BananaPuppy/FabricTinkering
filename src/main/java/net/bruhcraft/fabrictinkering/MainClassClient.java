package net.bruhcraft.fabrictinkering;

import net.bruhcraft.fabrictinkering.registries.ModItems;
import net.bruhcraft.fabrictinkering.registries.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.Block;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;

import java.util.List;

import static net.bruhcraft.fabrictinkering.util.MaterialUtil.predicateFromItemStack;

@Environment(EnvType.CLIENT)
public class MainClassClient implements ClientModInitializer {

	//RenderLayerCutout Blocks
	List<Block> toCutOut = List.of(
			ModBlocks.PART_BUILDER,
			ModBlocks.TINKER_STATION,
			ModBlocks.PART_CHEST,
			ModBlocks.TINKERS_CHEST
	);

	//Init
	@Override
	public void onInitializeClient() {
		renderLayerCutout(toCutOut);

		//TODO: Put Predicate Provider into its own method for organization
		ModelPredicateProviderRegistry.register(ModItems.REPAIR_KIT, new Identifier("material"), (itemStack, clientWorld, livingEntity, i) -> {
			if (itemStack == null) {
				return 0.0f;
			}
			//Get&Set Custom Item Var?
			return predicateFromItemStack(itemStack);
		});

	}

	//Util
	public void renderLayerCutout(List<Block> blocks){
		for(Block block : blocks){
			BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutout());
		}
	}
}