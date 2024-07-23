package net.thep2wking.badores.content.itemblock;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.thep2wking.badores.config.BadOresConfig;
import net.thep2wking.oedldoedlcore.api.item.ModItemBlockBase;
import net.thep2wking.oedldoedlcore.util.ModRandomUtil;

public class ItemBlockFleesonsite extends ModItemBlockBase {
	public ItemBlockFleesonsite(Block block, EnumRarity rarity, boolean hasEffect, int tooltipLines,
			int annotationLines) {
		super(block, rarity, hasEffect, tooltipLines, annotationLines);
	}

	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		EntityPlayer player = (EntityPlayer) entityIn;
		if (!player.capabilities.isCreativeMode && !worldIn.isRemote && BadOresConfig.EVENTS.FLEESONSITE_JUMPING) {
			jumpRandomly(player.inventoryContainer,
					player.inventoryContainer.getSlotFromInventory(player.inventory, itemSlot));
		}
	}

	public void jumpRandomly(Container c, Slot slot) {
		Random random = new Random();
		ItemStack stack = slot.getStack();
		if (random.nextInt(150) == 0) {
			Slot targetSlot;
			int count = 0;
			do {
				targetSlot = (Slot) ModRandomUtil.selectRandom(random, c.inventorySlots);
				if (++count == 15) {
					return;
				}
			} while (targetSlot == slot || slot.getHasStack() || !slot.isItemValid(stack));
			slot.putStack(ItemStack.EMPTY);
			targetSlot.putStack(stack);
		}
	}
}