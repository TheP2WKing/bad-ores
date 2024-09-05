package net.thep2wking.badores.content.block;

import java.util.Random;

import com.google.common.collect.Iterables;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;
import net.thep2wking.badores.BadOres;
import net.thep2wking.badores.config.BadOresConfig;
import net.thep2wking.oedldoedlcore.api.block.ModBlockOreBase;
import net.thep2wking.oedldoedlcore.util.ModRandomUtil;
import net.thep2wking.oedldoedlcore.util.ModToolTypes;

public class BlockMisleadium extends ModBlockOreBase {
	public BlockMisleadium(String modid, String name, CreativeTabs tab, int minXp, int maxXp, Material material,
			SoundType sound, MapColor mapColor, int harvestLevel, ModToolTypes toolType, float hardness,
			float resistance, int lightLevel) {
		super(modid, name, tab, minXp, maxXp, material, sound, mapColor, harvestLevel, toolType, hardness, resistance,
				lightLevel);
	}

	@Override
	public void onBlockHarvested(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player) {
		super.onBlockHarvested(worldIn, pos, state, player);
		if (!worldIn.isRemote && !player.capabilities.isCreativeMode && BadOresConfig.EVENTS.MISLEADIUM_CHAT_MESSAGES) {
			int numItems = Item.REGISTRY.getKeys().size();
			Item item;
			int sideRange = 500;
			Random random = new Random();
			NonNullList<ItemStack> cache = NonNullList.create();
			cache.clear();
			do {
				do {
					int itemIdx = random.nextInt(numItems);
					item = (Item) Iterables.get(Item.REGISTRY, itemIdx);
				} while (item.getCreativeTab() == null);
				item.getSubItems(CreativeTabs.SEARCH, cache);
			} while (cache.isEmpty());
			ItemStack stack = ModRandomUtil.selectRandom(random, cache);
			int fX = (pos.getX() + random.nextInt(sideRange) - random.nextInt(sideRange));
			int fY = (random.nextInt(100) + 10);
			int fZ = (pos.getY() + random.nextInt(sideRange) - random.nextInt(sideRange));

			int message = new Random().nextInt(7);
			if (!worldIn.isRemote) {
				ITextComponent translatedMessage = new TextComponentTranslation(
						"tile." + BadOres.MODID + ".misleadium.baseMessage." + message,
						stack.getDisplayName(), Integer.toString(fX), Integer.toString(fY), Integer.toString(fZ));
				player.sendMessage(translatedMessage);
			}
		}
	}
}