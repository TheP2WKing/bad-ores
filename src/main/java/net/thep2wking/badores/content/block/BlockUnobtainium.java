package net.thep2wking.badores.content.block;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.thep2wking.badores.config.BadOresConfig;
import net.thep2wking.oedldoedlcore.api.block.ModBlockOreBase;
import net.thep2wking.oedldoedlcore.util.ModToolTypes;

public class BlockUnobtainium extends ModBlockOreBase {
	public BlockUnobtainium(String modid, String name, CreativeTabs tab, int minXp, int maxXp, Material material,
			SoundType sound, MapColor mapColor, int harvestLevel, ModToolTypes toolType, float hardness,
			float resistance, int lightLevel) {
		super(modid, name, tab, minXp, maxXp, material, sound, mapColor, harvestLevel, toolType, hardness, resistance,
				lightLevel);
	}

	@Override
	public int getHarvestLevel(IBlockState state) {
		if (BadOresConfig.EVENTS.UNOBTAINIUM_NOT_HARVESTABLE) {
			return -1;
		} else {
			return this.harvestLevel;
		}
	}

	@Override
	public float getBlockHardness(IBlockState blockState, World worldIn, BlockPos pos) {
		if (BadOresConfig.EVENTS.UNOBTAINIUM_NOT_HARVESTABLE) {
			return -1;
		} else {
			return this.blockHardness;
		}
	}
}