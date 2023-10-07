package net.thep2wking.badores.content.block;

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
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.badores.BadOres;
import net.thep2wking.reloadedlib.api.block.ModBlockOreBase;
import net.thep2wking.reloadedlib.util.ModToolTypes;

import java.awt.Desktop;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class BlockWebsite extends ModBlockOreBase {
	public BlockWebsite(String modid, String name, CreativeTabs tab, int minXp, int maxXp, Material material,
			SoundType sound, MapColor mapColor, int harvestLevel, ModToolTypes toolType, float hardness,
			float resistance, int lightLevel) {
		super(modid, name, tab, minXp, maxXp, material, sound, mapColor, harvestLevel, toolType, hardness, resistance,
				lightLevel);
	}

	public static final List<String> WEBSITE_URLS = Arrays.asList(
			"https://www.google.com",
			"https://www.minecraft.net",
			"https://forums.minecraftforge.net",
			"https://minecraft.wiki",
			"https://www.minecraftforge.net",
			"https://www.curseforge.com",
			"https://www.youtube.com/watch?v=dQw4w9WgXcQ");

	@Override
	public void onBlockHarvested(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player) {
		if (!worldIn.isRemote && !player.capabilities.isCreativeMode) {
			openRandomWebsite(player);
		}
	}

	@SideOnly(Side.CLIENT)
	public void openRandomWebsite(EntityPlayer player) {
		Random random = new Random();
		try {
			Desktop.getDesktop().browse(new URL(WEBSITE_URLS.get(random.nextInt(WEBSITE_URLS.size()))).toURI());
		} catch (Exception e) {
			player.sendMessage(new TextComponentString(I18n.format("tile." + BadOres.MODID + ".website.fail")));
		}
	}
}