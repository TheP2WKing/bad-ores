package net.thep2wking.badores.content.block;

import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.thep2wking.badores.config.BadOresConfig;
import net.thep2wking.badores.content.entities.EntityFleesonsite;
import net.thep2wking.oedldoedlcore.api.block.ModBlockOreBase;
import net.thep2wking.oedldoedlcore.util.ModToolTypes;

public class BlockFleesonsite extends ModBlockOreBase {
	public BlockFleesonsite(String modid, String name, CreativeTabs tab, int minXp, int maxXp, Material material,
			SoundType sound, MapColor mapColor, int harvestLevel, ModToolTypes toolType, float hardness,
			float resistance, int lightLevel) {
		super(modid, name, tab, minXp, maxXp, material, sound, mapColor, harvestLevel, toolType, hardness, resistance,
				lightLevel);
		setTickRandomly(true);
	}

	@Override
	public int tickRate(World worldIn) {
		return 40;
	}

	@Override
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
		EntityPlayer player = worldIn.getClosestPlayer(pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, 6.0,
				false);
		if (player != null && BadOresConfig.EVENTS.FLEESONSITE_SPAWNS_ITSELF) {
			flee(worldIn, pos.getX(), pos.getY(), pos.getZ(), player);
		}
	}

	public void flee(World world, int x, int y, int z, EntityPlayer player) {
		world.setBlockToAir(new BlockPos(x, y, z));
		EntityFleesonsite fleeingBlock = new EntityFleesonsite(world);
		fleeingBlock.setPosition(x + 0.5, y, z + 0.5);
		fleeingBlock.setRevengeTarget(player);
		fleeingBlock.setAttackTarget(player);
		world.spawnEntity(fleeingBlock);
		fleeingBlock.playLivingSound();
	}

	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player,
			EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		if (!worldIn.isRemote && !player.capabilities.isCreativeMode
				&& BadOresConfig.EVENTS.FLEESONSITE_SPAWNS_ITSELF) {
			flee(worldIn, pos.getX(), pos.getY(), pos.getZ(), player);
		}
		return true;
	}

	@Override
	public void onBlockClicked(World worldIn, BlockPos pos, EntityPlayer player) {
		if (!worldIn.isRemote && !player.capabilities.isCreativeMode
				&& BadOresConfig.EVENTS.FLEESONSITE_SPAWNS_ITSELF) {
			flee(worldIn, pos.getX(), pos.getY(), pos.getZ(), player);
		}
	}
}