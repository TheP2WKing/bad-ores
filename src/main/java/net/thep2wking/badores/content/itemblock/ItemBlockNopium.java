package net.thep2wking.badores.content.itemblock;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.thep2wking.badores.config.BadOresConfig;
import net.thep2wking.oedldoedlcore.api.item.ModItemBlockBase;

public class ItemBlockNopium extends ModItemBlockBase {
	public ItemBlockNopium(Block block, EnumRarity rarity, boolean hasEffect, int tooltipLines, int annotationLines) {
		super(block, rarity, hasEffect, tooltipLines, annotationLines);
	}

	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		EntityPlayer player = (EntityPlayer) entityIn;
		dropRandomly(stack, itemSlot, player, worldIn);
	}

	public static void dropRandomly(ItemStack stack, int slot, EntityPlayer player, World world) {
		Random random = new Random();
		if (!player.capabilities.isCreativeMode && !world.isRemote && random.nextInt(200) == 0
				&& BadOresConfig.EVENTS.NOPIUM_ITEM_DROPPING) {
			player.dropItem(stack, false, true);
			player.inventory.setInventorySlotContents(slot, ItemStack.EMPTY);
		}
	}
}