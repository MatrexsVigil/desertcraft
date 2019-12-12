package com.pam.desertcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.BushBlock;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.StateContainer;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.PlantType;

public class BlockDesertPlant extends BushBlock implements IPlantable{

	protected static final VoxelShape NORMAL = Block.makeCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 13.0D, 14.0D);

	public BlockDesertPlant(Properties properties) {
		super(properties);
	}

	@Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext selectionContext)
    {
        return NORMAL;
    }

	@Override
	public Block.OffsetType getOffsetType() {
		return Block.OffsetType.XZ;
	}

	@Override
	public boolean isValidPosition(BlockState state, IWorldReader worldIn, BlockPos pos) {
		@SuppressWarnings("unused")
		Block ground = worldIn.getBlockState(pos.down()).getBlock();

		return super.isValidPosition(state, worldIn, pos);
	}

	@Override
	public PlantType getPlantType(IBlockReader world, BlockPos pos) {
		@SuppressWarnings("unused")
		Block block = world.getBlockState(pos).getBlock();

		return PlantType.Desert;
	}
	
	protected boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos) {
	      Block block = state.getBlock();
	      return block == Blocks.SAND || block == Blocks.RED_SAND || block == Blocks.TERRACOTTA || block == Blocks.WHITE_TERRACOTTA || block == Blocks.ORANGE_TERRACOTTA || block == Blocks.MAGENTA_TERRACOTTA || block == Blocks.LIGHT_BLUE_TERRACOTTA || block == Blocks.YELLOW_TERRACOTTA || block == Blocks.LIME_TERRACOTTA || block == Blocks.PINK_TERRACOTTA || block == Blocks.GRAY_TERRACOTTA || block == Blocks.LIGHT_GRAY_TERRACOTTA || block == Blocks.CYAN_TERRACOTTA || block == Blocks.PURPLE_TERRACOTTA || block == Blocks.BLUE_TERRACOTTA || block == Blocks.BROWN_TERRACOTTA || block == Blocks.GREEN_TERRACOTTA || block == Blocks.RED_TERRACOTTA || block == Blocks.BLACK_TERRACOTTA || block == Blocks.DIRT || block == Blocks.COARSE_DIRT || block == Blocks.PODZOL;
	   }
	
	@Override
    public BlockRenderLayer getRenderLayer()
    {
       return BlockRenderLayer.CUTOUT;
    }


	 @Override
     public boolean allowsMovement(BlockState state, IBlockReader worldIn, BlockPos pos, PathType type)
     {
        return true;
     }
	
}
