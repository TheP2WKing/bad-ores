package net.thep2wking.badores.content.itemblock;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.thep2wking.reloadedlib.api.item.ModItemBlockBase;

public class ItemBlockFleesonsite extends ModItemBlockBase {
	public ItemBlockFleesonsite(Block block, EnumRarity rarity, boolean hasEffect, int tooltipLines) {
		super(block, rarity, hasEffect, tooltipLines);
	}

	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		EntityPlayer player = (EntityPlayer) entityIn;
		if (!player.capabilities.isCreativeMode && !worldIn.isRemote) {
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
				targetSlot = (Slot) selectRandom(random, c.inventorySlots);
				if (++count == 15) {
					return;
				}
			} while (targetSlot == slot || slot.getHasStack() || !slot.isItemValid(stack));
			slot.putStack(ItemStack.EMPTY);
			targetSlot.putStack(stack);
		}
	}

	public static <T> T selectRandom(Random r, List<T> list) {
		return list.get(r.nextInt(list.size()));
	}
}