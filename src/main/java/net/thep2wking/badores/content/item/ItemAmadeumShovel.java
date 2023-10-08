package net.thep2wking.badores.content.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.thep2wking.badores.util.ModItemEvents;
import net.thep2wking.reloadedlib.api.tool.ModItemShovelBase;

public class ItemAmadeumShovel extends ModItemShovelBase {
	public ItemAmadeumShovel(String modid, String name, CreativeTabs tab, ToolMaterial material, float attackDamage,
			float attackSpeed, EnumRarity rarity, boolean hasEffect, int tooltipLines) {
		super(modid, name, tab, material, attackDamage, attackSpeed, rarity, hasEffect, tooltipLines);
	}

	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		EntityPlayer player = (EntityPlayer) entityIn;
		ModItemEvents.amadeumToolTickSound(worldIn, player);
	}
}