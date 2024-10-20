package net.thep2wking.badores.content.block;

import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.thep2wking.badores.config.BadOresConfig;
import net.thep2wking.oedldoedlcore.api.block.ModBlockOreBase;
import net.thep2wking.oedldoedlcore.util.ModToolTypes;

public class BlockAmadeum extends ModBlockOreBase {
	public BlockAmadeum(String modid, String name, CreativeTabs tab, int minXp, int maxXp, Material material,
			SoundType sound, MapColor mapColor, int harvestLevel, ModToolTypes toolType, float hardness,
			float resistance, int lightLevel) {
		super(modid, name, tab, minXp, maxXp, material, sound, mapColor, harvestLevel, toolType, hardness, resistance,
				lightLevel);
		setTickRandomly(true);
	}

	@Override
	public void randomTick(World worldIn, BlockPos pos, IBlockState state, Random random) {
		if (BadOresConfig.EVENTS.AMADEUM_SOUNDS) {
			randomSound(worldIn, pos.getX(), pos.getY(), pos.getZ(), random);
		}
	}

	@Override
	public int tickRate(World worldIn) {
		return new Random().nextInt(6) + 18;
	}

	public static final SoundEvent[] SOUND_EVENTS = {
			SoundEvents.BLOCK_NOTE_BASEDRUM,
			SoundEvents.BLOCK_NOTE_BASS,
			SoundEvents.BLOCK_NOTE_HARP,
			SoundEvents.BLOCK_NOTE_HAT,
			SoundEvents.BLOCK_NOTE_SNARE,
	};

	public static void randomSound(World world, double x, double y, double z, Random random) {
		int id = random.nextInt(5);
		int note = random.nextInt(25);
		float f = (float) Math.pow(2.0D, (note - 12) / 12.0D);
		SoundEvent sound = SOUND_EVENTS[id];
		world.playSound(null, x + 0.5D, y + 0.5D, z + 0.5D, sound, SoundCategory.BLOCKS, 1.5f, f);
	}
}