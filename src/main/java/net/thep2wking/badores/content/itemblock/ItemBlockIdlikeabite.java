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

public class ItemBlockIdlikeabite extends ModItemBlockBase {
	public ItemBlockIdlikeabite(Block block, EnumRarity rarity, boolean hasEffect, int tooltipLines,
			int annotationLines) {
		super(block, rarity, hasEffect, tooltipLines, annotationLines);
	}

	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		Random random = new Random();
		EntityPlayer player = (EntityPlayer) entityIn;
		if (!player.capabilities.isCreativeMode && BadOresConfig.EVENTS.IDLIKEABITE_DECREASES_HUNGER) {
			if (!worldIn.isRemote && random.nextInt(200) == 0) {
				player.getFoodStats().addExhaustion(1.0f);
			}
		}
	}
}