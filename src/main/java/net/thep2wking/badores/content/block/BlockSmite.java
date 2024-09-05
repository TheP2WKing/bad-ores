package net.thep2wking.badores.content.block;

import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.thep2wking.badores.config.BadOresConfig;
import net.thep2wking.oedldoedlcore.api.block.ModBlockOreBase;
import net.thep2wking.oedldoedlcore.util.ModToolTypes;

public class BlockSmite extends ModBlockOreBase {
	public BlockSmite(String modid, String name, CreativeTabs tab, int minXp, int maxXp, Material material,
			SoundType sound, MapColor mapColor, int harvestLevel, ModToolTypes toolType, float hardness,
			float resistance, int lightLevel) {
		super(modid, name, tab, minXp, maxXp, material, sound, mapColor, harvestLevel, toolType, hardness, resistance,
				lightLevel);
	}

	@Override
	public void onBlockHarvested(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player) {
		super.onBlockHarvested(worldIn, pos, state, player);
		if (!worldIn.isRemote && !player.capabilities.isCreativeMode
				&& BadOresConfig.EVENTS.SMITE_CAN_SPAWN_LIGHTNING_BOLT) {
			Random random = new Random();
			if (random.nextInt(3) == 0) {
				worldIn.addWeatherEffect(
						new EntityLightningBolt(worldIn, player.posX, player.posY, player.posZ, false));
			}
		}
	}
}