package net.thep2wking.badores.content.block;

import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.thep2wking.badores.config.BadOresConfig;
import net.thep2wking.oedldoedlcore.api.block.ModBlockOreBase;
import net.thep2wking.oedldoedlcore.util.ModToolTypes;

public class BlockEnderite extends ModBlockOreBase {
	public BlockEnderite(String modid, String name, CreativeTabs tab, int minXp, int maxXp, Material material,
			SoundType sound, MapColor mapColor, int harvestLevel, ModToolTypes toolType, float hardness,
			float resistance, int lightLevel) {
		super(modid, name, tab, minXp, maxXp, material, sound, mapColor, harvestLevel, toolType, hardness, resistance,
				lightLevel);
	}

	@Override
	public void onBlockHarvested(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player) {
		super.onBlockHarvested(worldIn, pos, state, player);
		if (!worldIn.isRemote && !player.capabilities.isCreativeMode && BadOresConfig.EVENTS.ENDERITE_TELEPORTATION) {
			teleportTo(worldIn, player, findRandomSpot(worldIn, pos.getX(), pos.getY(), pos.getZ()));
		}
	}

	public static BlockPos findRandomSpot(World world, int x, int y, int z) {
		Random random = new Random();
		int radius = 40;
		int rX = x - radius + random.nextInt(radius * 2);
		int rY = y + random.nextInt(256 - y);
		int rZ = z - radius + random.nextInt(radius * 2);
		return new BlockPos(rX, rY, rZ);
	}

	public static void teleportTo(World world, EntityPlayer player, BlockPos coords) {
		short short1 = 128;
		for (int l = 0; l < short1; ++l) {
			Random random = new Random();
			double d6 = (double) l / ((double) short1 - 1.0D);
			float f = (random.nextFloat() - 0.5F) * 0.2F;
			float f1 = (random.nextFloat() - 0.5F) * 0.2F;
			float f2 = (random.nextFloat() - 0.5F) * 0.2F;
			double d7 = coords.getX() + (player.posX - coords.getX()) * d6
					+ (random.nextDouble() - 0.5D) * (double) player.width * 2.0D;
			double d8 = coords.getY() + (player.posY - coords.getY()) * d6
					+ random.nextDouble() * (double) player.height;
			double d9 = coords.getZ() + (player.posZ - coords.getZ()) * d6
					+ (random.nextDouble() - 0.5D) * (double) player.width * 2.0D;
			world.spawnParticle(EnumParticleTypes.PORTAL, d7, d8, d9, (double) f, (double) f1, (double) f2);
		}
		player.setPositionAndUpdate(coords.getX(), coords.getY(), coords.getZ());
		world.playSound(null, coords.getX(), coords.getY(), coords.getZ(), SoundEvents.ENTITY_ENDERMEN_TELEPORT,
				SoundCategory.BLOCKS, 1.0f, 1.0f);
	}
}