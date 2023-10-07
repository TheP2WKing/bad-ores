package net.thep2wking.badores.content.block;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.thep2wking.reloadedlib.api.block.ModBlockOreBase;
import net.thep2wking.reloadedlib.util.ModToolTypes;

public class BlockBalancium extends ModBlockOreBase {
	public static final List<Item> DROPS = Arrays.asList(Items.COAL, Items.IRON_INGOT, Items.GOLD_INGOT, Items.DIAMOND,
			Items.EMERALD, Items.QUARTZ, Items.GOLDEN_APPLE);

	public BlockBalancium(String modid, String name, CreativeTabs tab, int minXp, int maxXp, Material material,
			SoundType sound, MapColor mapColor, int harvestLevel, ModToolTypes toolType, float hardness,
			float resistance, int lightLevel) {
		super(modid, name, tab, minXp, maxXp, material, sound, mapColor, harvestLevel, toolType, hardness, resistance,
				lightLevel);
	}

	@Override
	public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state,
			int fortune) {
		Random random = new Random();
		int num = random.nextInt(50) + 5;
		for (int i = 0; i < num; i++) {
			Item item = selectRandom(random, DROPS);
			drops.add(new ItemStack(item, 1));
		}
	}

	public static <T> T selectRandom(Random r, List<T> list) {
		return list.get(r.nextInt(list.size()));
	}
}