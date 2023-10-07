package net.thep2wking.badores.content.itemblock;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.thep2wking.badores.BadOres;
import net.thep2wking.reloadedlib.api.item.ModItemBlockBase;

public class ItemBlockKillium extends ModItemBlockBase {
	public static final DamageSource DAMAGE_SOURCE = new DamageSource(BadOres.MODID + ".killium")
			.setDamageBypassesArmor().setDamageIsAbsolute();

	public ItemBlockKillium(Block block, EnumRarity rarity, boolean hasEffect, int tooltipLines) {
		super(block, rarity, hasEffect, tooltipLines);
	}

	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		Random random = new Random();
		EntityPlayer player = (EntityPlayer) entityIn;
		if (!player.capabilities.isCreativeMode) {
			if (random.nextInt(1000) == 0) {
				player.attackEntityFrom(DAMAGE_SOURCE, Integer.MAX_VALUE);
			}
		}
	}
}
