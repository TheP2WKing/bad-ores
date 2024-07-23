package net.thep2wking.badores.content.block;

import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.I18n;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.thep2wking.badores.BadOres;
import net.thep2wking.badores.config.BadOresConfig;
import net.thep2wking.badores.util.events.ModEventHandler;
import net.thep2wking.oedldoedlcore.api.block.ModBlockOreBase;
import net.thep2wking.oedldoedlcore.util.ModToolTypes;

public class BlockCrashium extends ModBlockOreBase {
	public BlockCrashium(String modid, String name, CreativeTabs tab, int minXp, int maxXp, Material material,
			SoundType sound, MapColor mapColor, int harvestLevel, ModToolTypes toolType, float hardness,
			float resistance, int lightLevel) {
		super(modid, name, tab, minXp, maxXp, material, sound, mapColor, harvestLevel, toolType, hardness, resistance,
				lightLevel);
	}

	@Override
	public void onBlockHarvested(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player) {
		if (!player.capabilities.isCreativeMode && BadOresConfig.EVENTS.CRASHIUM_CAN_CRASH_GAME) {
			doCrash(player, worldIn);
		}
	}

	public static void doCrash(EntityPlayer player, World world) {
		if (!world.isRemote) {
			int precrashMessage = new Random().nextInt(7);
			player.sendMessage(new TextComponentString(
					I18n.format("tile." + BadOres.MODID + ".crashium.precrash." + precrashMessage)));
			ModEventHandler.INSTANCE.schedule(new Runnable() {
				@Override
				public void run() {
					int crashMessage = new Random().nextInt(11);
					int nocrashMessage = new Random().nextInt(5);
					int crashProbability = new Random().nextInt(5);
					if (crashProbability == 0) {
						if (!world.isRemote) {
							player.sendMessage(new TextComponentString(
									I18n.format("tile." + BadOres.MODID + ".crashium.crash." + crashMessage)));
						}
						ModEventHandler.INSTANCE.schedule(new Runnable() {
							@Override
							public void run() {
								throw new RuntimeException(
										I18n.format("tile." + BadOres.MODID + ".crashium.runtime_exception"));
							}
						}, 80);
					} else {
						if (!world.isRemote) {
							player.sendMessage(new TextComponentString(
									I18n.format("tile." + BadOres.MODID + ".crashium.nocrash." + nocrashMessage)));
						}
					}
				}
			}, 80);
		}
	}
}