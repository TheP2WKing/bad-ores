package net.thep2wking.badores.content.block;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.thep2wking.reloadedlib.api.block.ModBlockOreBase;
import net.thep2wking.reloadedlib.util.ModToolTypes;

public class BlockMovium extends ModBlockOreBase {
	public BlockMovium(String modid, String name, CreativeTabs tab, int minXp, int maxXp, Material material,
			SoundType sound, MapColor mapColor, int harvestLevel, ModToolTypes toolType, float hardness,
			float resistance, int lightLevel) {
		super(modid, name, tab, minXp, maxXp, material, sound, mapColor, harvestLevel, toolType, hardness, resistance,
				lightLevel);
	}

	@Override
	public void onBlockHarvested(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player) {
		Random random = new Random();
		EnumFacing dir = selectRandom(random, EnumFacing.VALUES);
		if (!player.capabilities.isCreativeMode && !worldIn.isRemote) {
			int tX = pos.getX() + dir.getFrontOffsetX();
			int tY = pos.getY() + dir.getFrontOffsetY();
			int tZ = pos.getZ() + dir.getFrontOffsetZ();
			worldIn.setBlockToAir(pos);
			worldIn.setBlockState(new BlockPos(tX, tY, tZ), this.getDefaultState());
		}
	}

	public static <T> T selectRandom(Random r, List<T> list) {
		return list.get(r.nextInt(list.size()));
	}

	@SuppressWarnings("all")
	public static <T> T selectRandom(Random r, T... list) {
		return selectRandom(r, Arrays.asList(list));
	}

	@Override
	public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
	}
}