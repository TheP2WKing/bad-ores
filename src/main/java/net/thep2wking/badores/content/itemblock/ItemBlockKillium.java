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
import net.thep2wking.badores.config.BadOresConfig;
import net.thep2wking.oedldoedlcore.api.item.ModItemBlockBase;

public class ItemBlockKillium extends ModItemBlockBase {
	public static final DamageSource DAMAGE_SOURCE = new DamageSource(BadOres.MODID + ".killium")
			.setDamageBypassesArmor().setDamageIsAbsolute();

	public ItemBlockKillium(Block block, EnumRarity rarity, boolean hasEffect, int tooltipLines, int annotationLines) {
		super(block, rarity, hasEffect, tooltipLines, annotationLines);
	}

	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		Random random = new Random();
		EntityPlayer player = (EntityPlayer) entityIn;
		if (!player.capabilities.isCreativeMode && BadOresConfig.EVENTS.KILLIUM_CAN_KILL_PLAYERS) {
			if (random.nextInt(1000) == 0) {
				player.attackEntityFrom(DAMAGE_SOURCE, Integer.MAX_VALUE);
			}
		}
	}
}
