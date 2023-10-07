package net.thep2wking.badores.content.block;

import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.thep2wking.reloadedlib.api.block.ModBlockOreBase;
import net.thep2wking.reloadedlib.util.ModToolTypes;

public class BlockExplodeitmite extends ModBlockOreBase {
	public BlockExplodeitmite(String modid, String name, CreativeTabs tab, int minXp, int maxXp, Material material,
			SoundType sound, MapColor mapColor, int harvestLevel, ModToolTypes toolType, float hardness,
			float resistance, int lightLevel) {
		super(modid, name, tab, minXp, maxXp, material, sound, mapColor, harvestLevel, toolType, hardness, resistance,
				lightLevel);
		setTickRandomly(true);
	}

	@Override
	public int tickRate(World worldIn) {
		return 10000;
	}

	@Override
	public void onBlockHarvested(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player) {
		Random random = new Random();
		if (!worldIn.isRemote && !player.capabilities.isCreativeMode) {
			if (random.nextInt(4) == 0) {
				worldIn.newExplosion(null, pos.getX() + 0.5, pos.getY() + 1.5, pos.getZ() + 0.5,
						2.0f + random.nextFloat() * 3.0f, false, true);
			}
		}
	}

	@Override
	public void randomTick(World worldIn, BlockPos pos, IBlockState state, Random random) {
		if (!worldIn.isRemote) {
			if (random.nextInt(4) == 0) {
				worldIn.newExplosion(null, pos.getX() + 0.5, pos.getY() + 1.5, pos.getZ() + 0.5,
						2.0f + random.nextFloat() * 3.0f, false, true);
				worldIn.setBlockToAir(new BlockPos(pos.getX() + 0.5, pos.getY() + 1.5, pos.getZ()));
			}
		}
	}
}