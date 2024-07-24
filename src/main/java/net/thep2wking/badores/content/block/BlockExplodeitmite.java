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
import net.thep2wking.badores.config.BadOresConfig;
import net.thep2wking.oedldoedlcore.api.block.ModBlockOreBase;
import net.thep2wking.oedldoedlcore.util.ModToolTypes;

public class BlockExplodeitmite extends ModBlockOreBase {
	public BlockExplodeitmite(String modid, String name, CreativeTabs tab, int minXp, int maxXp, Material material,
			SoundType sound, MapColor mapColor, int harvestLevel, ModToolTypes toolType, float hardness,
			float resistance, int lightLevel) {
		super(modid, name, tab, minXp, maxXp, material, sound, mapColor, harvestLevel, toolType, hardness, resistance,
				lightLevel);
	}

	@Override
	public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state) {
		super.onBlockAdded(worldIn, pos, state);
		worldIn.scheduleUpdate(pos, this, 10000);
	}

	@Override
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
		super.updateTick(worldIn, pos, state, rand);
		worldIn.scheduleUpdate(pos, this, 10000);
		if (!worldIn.isRemote && BadOresConfig.EVENTS.EXPLODEITMITE_EXPLOSIONS) {
			if (rand.nextInt(5) == 0) {
				worldIn.newExplosion(null, pos.getX() + 0.5, pos.getY() + 1.5, pos.getZ() + 0.5,
						2.0f + rand.nextFloat() * 2.0f, false, BadOresConfig.EVENTS.EXPLODEITMITE_EXPLOSION_DAMAGE);
				worldIn.setBlockToAir(new BlockPos(pos.getX() + 0.5, pos.getY() + 1.5, pos.getZ()));
			}
		}
	}

	@Override
	public void onBlockHarvested(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player) {
		Random random = new Random();
		if (!worldIn.isRemote && !player.capabilities.isCreativeMode && BadOresConfig.EVENTS.EXPLODEITMITE_EXPLOSIONS) {
			if (random.nextInt(5) == 0) {
				worldIn.newExplosion(null, pos.getX() + 0.5, pos.getY() + 1.5, pos.getZ() + 0.5,
						2.0f + random.nextFloat() * 2.0f, false, BadOresConfig.EVENTS.EXPLODEITMITE_EXPLOSION_DAMAGE);
			}
		}
	}
}