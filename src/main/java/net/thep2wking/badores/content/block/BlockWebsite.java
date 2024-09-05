package net.thep2wking.badores.content.block;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.badores.BadOres;
import net.thep2wking.badores.config.BadOresConfig;
import net.thep2wking.oedldoedlcore.api.block.ModBlockOreBase;
import net.thep2wking.oedldoedlcore.util.ModToolTypes;

import java.awt.Desktop;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class BlockWebsite extends ModBlockOreBase {
	public final List<String> WEBSITE_URLS = new ArrayList<>(Arrays.asList(BadOresConfig.EVENTS.WEBSITE_POSSIBLE_URLS));

	public BlockWebsite(String modid, String name, CreativeTabs tab, int minXp, int maxXp, Material material,
			SoundType sound, MapColor mapColor, int harvestLevel, ModToolTypes toolType, float hardness,
			float resistance, int lightLevel) {
		super(modid, name, tab, minXp, maxXp, material, sound, mapColor, harvestLevel, toolType, hardness, resistance,
				lightLevel);
	}

	@Override
	public void onBlockHarvested(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player) {
		super.onBlockHarvested(worldIn, pos, state, player);
		if (!player.capabilities.isCreativeMode && BadOresConfig.EVENTS.WEBSITE_OPENS_RANDOM_WEBSITES) {
			if (FMLCommonHandler.instance().getEffectiveSide().isClient()) {
				openRandomWebsite(player);
			}
		}
	}

	@SideOnly(Side.CLIENT)
	public void openRandomWebsite(EntityPlayer player) {
		Random random = new Random();
		try {
			Desktop.getDesktop().browse(new URL(WEBSITE_URLS.get(random.nextInt(WEBSITE_URLS.size()))).toURI());
		} catch (Exception e) {
			player.sendMessage(new TextComponentTranslation("tile." + BadOres.MODID + ".website.fail"));
		}
	}
}