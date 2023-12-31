package net.bruhcraft.fabrictinkering.registries.blocks.chests;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

import java.util.stream.Stream;

public class tinkers_chest extends HorizontalFacingBlock {

    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;

    public tinkers_chest(FabricBlockSettings settings) {
        super(settings);
    }

    /*Make sure to
        MainClassClient BlockRenderLayerMap.INSTANCE.putBlock(ExampleMod.MY_BLOCK, RenderLayer.getCutout());
    or  MainClassClient BlockRenderLayerMap.INSTANCE.putBlock(ExampleMod.MY_BLOCK, RenderLayer.getTranslucent());
     */
    private static final VoxelShape SHAPE = Stream.of(
            Block.createCuboidShape(0, 15, 0, 16, 16, 16),
            Block.createCuboidShape(1, 3, 1, 15, 15, 15),
            Block.createCuboidShape(0.5, 0, 0.5, 2.5, 15, 2.5),
            Block.createCuboidShape(0.5, 0, 13.5, 2.5, 15, 15.5),
            Block.createCuboidShape(13.5, 0, 13.5, 15.5, 15, 15.5),
            Block.createCuboidShape(13.5, 0, 0.5, 15.5, 15, 2.5)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    @SuppressWarnings("deprecation")
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}
