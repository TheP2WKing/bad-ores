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

public class BlockTauntum extends ModBlockOreBase {
	public BlockTauntum(String modid, String name, CreativeTabs tab, int minXp, int maxXp, Material material,
			SoundType sound, MapColor mapColor, int harvestLevel, ModToolTypes toolType, float hardness,
			float resistance, int lightLevel) {
		super(modid, name, tab, minXp, maxXp, material, sound, mapColor, harvestLevel, toolType, hardness, resistance,
				lightLevel);
		setTickRandomly(true);
	}

	@Override
	public int tickRate(World worldIn) {
		return new Random().nextInt(400) + 40;
	}

	@Override
	public void randomTick(World worldIn, BlockPos pos, IBlockState state, Random random) {
		if (!worldIn.isRemote && BadOresConfig.EVENTS.TAUNTUM_SOUNDS) {
			playRandomSound(worldIn, pos.getX(), pos.getY(), pos.getZ(), random);
		}
	}

	public static final SoundEvent[] SOUND_EVENTS = {
			SoundEvents.ENTITY_CREEPER_PRIMED,
			SoundEvents.ENTITY_ZOMBIE_AMBIENT,
			SoundEvents.ENTITY_SKELETON_AMBIENT,
			SoundEvents.ENTITY_WITCH_AMBIENT,
			SoundEvents.ENTITY_SPIDER_AMBIENT,
			SoundEvents.ENTITY_GHAST_AMBIENT,
			SoundEvents.ENTITY_VILLAGER_AMBIENT,
			SoundEvents.VINDICATION_ILLAGER_AMBIENT,
	};

	public void playRandomSound(World world, double x, double y, double z, Random random) {
		int id = random.nextInt(8);
		SoundEvent sound = SOUND_EVENTS[id];
		world.playSound(null, x, y, z, sound, SoundCategory.BLOCKS, 3.0f, 1.0f);
	}
}