package net.thep2wking.badores.content.block;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.thep2wking.badores.config.BadOresConfig;
import net.thep2wking.badores.init.ModItems;
import net.thep2wking.oedldoedlcore.api.block.ModBlockOreBase;
import net.thep2wking.oedldoedlcore.util.ModToolTypes;

public class BlockKakkarite extends ModBlockOreBase {
	public BlockKakkarite(String modid, String name, CreativeTabs tab, int minXp, int maxXp, Material material,
			SoundType sound, MapColor mapColor, int harvestLevel, ModToolTypes toolType, float hardness,
			float resistance, int lightLevel) {
		super(modid, name, tab, minXp, maxXp, material, sound, mapColor, harvestLevel, toolType, hardness, resistance,
				lightLevel);
	}

	@Override
	public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state,
			int fortune) {
		ItemStack stack;
		if (BadOresConfig.EVENTS.KAKKARITE_DROPS_SHIT) {
			for (int items = BadOresConfig.EVENTS.KAKKARITE_DROP_COUNT; items > 0; items -= stack.getMaxStackSize()) {
				stack = new ItemStack(ModItems.KAKKARITE_GEMSTONE);
				stack.setCount(Math.min(64, items));
				drops.add(stack);
			}
		} else {
			drops.add(new ItemStack(ModItems.KAKKARITE_GEMSTONE, 1, 0));
		}
	}
}
