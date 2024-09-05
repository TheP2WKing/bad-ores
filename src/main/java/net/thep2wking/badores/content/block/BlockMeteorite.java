package net.thep2wking.badores.content.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityFallingBlock;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.thep2wking.badores.config.BadOresConfig;
import net.thep2wking.oedldoedlcore.api.block.ModBlockOreBase;
import net.thep2wking.oedldoedlcore.util.ModToolTypes;

public class BlockMeteorite extends ModBlockOreBase {
	public BlockMeteorite(String modid, String name, CreativeTabs tab, int minXp, int maxXp, Material material,
			SoundType sound, MapColor mapColor, int harvestLevel, ModToolTypes toolType, float hardness,
			float resistance, int lightLevel) {
		super(modid, name, tab, minXp, maxXp, material, sound, mapColor, harvestLevel, toolType, hardness, resistance,
				lightLevel);
	}

	@Override
	public void onBlockHarvested(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player) {
		super.onBlockHarvested(worldIn, pos, state, player);
		if (!player.capabilities.isCreativeMode && !worldIn.isRemote && BadOresConfig.EVENTS.METEORITE_SPAWNS_BLOCKS) {
			Random random = new Random();
			int number = random.nextInt(20) + 3;
			int spawnSide = 50;
			Block fallingBlock = random.nextBoolean() ? Blocks.STONE : Blocks.NETHERRACK;
			for (int i = 0; i < number; i++) {
				double spawnX = pos.getX() + spawnSide * (random.nextDouble() - random.nextDouble());
				double spawnY = 250.0;
				double spawnZ = pos.getZ() + spawnSide * (random.nextDouble() - random.nextDouble());
				EntityFallingBlock entity = new EntityFallingBlock(worldIn, spawnX, spawnY, spawnZ,
						fallingBlock.getDefaultState());
				entity.fallTime = 2;
				entity.motionX = random.nextDouble() - random.nextDouble();
				entity.motionZ = random.nextDouble() - random.nextDouble();
				worldIn.spawnEntity(entity);
			}
		}
	}

	@Override
	public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state,
			int fortune) {
	}
}