package net.thep2wking.badores.content.block;

import java.util.List;
import javax.annotation.Nullable;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeEventFactory;
import net.thep2wking.badores.config.BadOresConfig;
import net.thep2wking.oedldoedlcore.api.block.ModBlockOreBase;
import net.thep2wking.oedldoedlcore.util.ModToolTypes;

public class BlockGhostium extends ModBlockOreBase {
	public BlockGhostium(String modid, String name, CreativeTabs tab, int minXp, int maxXp, Material material,
			SoundType sound, MapColor mapColor, int harvestLevel, ModToolTypes toolType, float hardness,
			float resistance, int lightLevel) {
		super(modid, name, tab, minXp, maxXp, material, sound, mapColor, harvestLevel, toolType, hardness, resistance,
				lightLevel);
	}

	@Override
	public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state,
			@Nullable TileEntity te, ItemStack stack) {
		player.addStat(StatList.getBlockStats(this));
		if (this.canSilkHarvest(worldIn, pos, state, player)
				&& EnchantmentHelper.getEnchantmentLevel(Enchantments.SILK_TOUCH, stack) > 0
				&& BadOresConfig.EVENTS.GHOSTIUM_NOT_COLLECTABLE) {
			List<ItemStack> items = new java.util.ArrayList<ItemStack>();
			ItemStack itemstack = this.getSilkTouchDrop(state);
			if (!itemstack.isEmpty()) {
				items.add(itemstack);
			}
			ForgeEventFactory.fireBlockHarvesting(items, worldIn, pos, state, 0, 1.0f, true,
					player);
			for (ItemStack item : items) {
				spawnAsGhostEntity(worldIn, pos, item);
			}
		} else {
			harvesters.set(player);
			int i = EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE, stack);
			this.dropBlockAsItem(worldIn, pos, state, i);
			harvesters.set(null);
		}
	}

	@SuppressWarnings("deprecation")
	@Override
	public void dropBlockAsItemWithChance(World worldIn, BlockPos pos, IBlockState state, float chance, int fortune) {
		if (!worldIn.isRemote && !worldIn.restoringBlockSnapshots && BadOresConfig.EVENTS.GHOSTIUM_NOT_COLLECTABLE) {
			List<ItemStack> drops = getDrops(worldIn, pos, state, fortune);
			chance = ForgeEventFactory.fireBlockHarvesting(drops, worldIn, pos, state, fortune, chance, false,
					harvesters.get());
			for (ItemStack drop : drops) {
				if (worldIn.rand.nextFloat() <= chance) {
					spawnAsGhostEntity(worldIn, pos, drop);
				}
			}
		} else {
			super.dropBlockAsItemWithChance(worldIn, pos, state, chance, fortune);
		}
	}

	public void spawnAsGhostEntity(World worldIn, BlockPos pos, ItemStack stack) {
		if (!worldIn.isRemote && !stack.isEmpty() && worldIn.getGameRules().getBoolean("doTileDrops")
				&& !worldIn.restoringBlockSnapshots) {
			if (captureDrops.get()) {
				capturedDrops.get().add(stack);
				return;
			}
			double d0 = (double) (worldIn.rand.nextFloat() * 0.5F) + 0.25D;
			double d1 = (double) (worldIn.rand.nextFloat() * 0.5F) + 0.25D;
			double d2 = (double) (worldIn.rand.nextFloat() * 0.5F) + 0.25D;
			EntityItem entityitem = new EntityItem(worldIn, (double) pos.getX() + d0, (double) pos.getY() + d1,
					(double) pos.getZ() + d2, stack);
			entityitem.setPickupDelay(Integer.MAX_VALUE);
			worldIn.spawnEntity(entityitem);
		}
	}
}