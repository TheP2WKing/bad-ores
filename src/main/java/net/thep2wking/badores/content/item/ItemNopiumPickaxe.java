package net.thep2wking.badores.content.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.thep2wking.badores.util.events.ModItemEvents;
import net.thep2wking.oedldoedlcore.api.tool.ModItemPickaxeBase;

public class ItemNopiumPickaxe extends ModItemPickaxeBase {
	public ItemNopiumPickaxe(String modid, String name, CreativeTabs tab, ToolMaterial material, float attackDamage,
			float attackSpeed, EnumRarity rarity, boolean hasEffect, int tooltipLines, int annotationLines) {
		super(modid, name, tab, material, attackDamage, attackSpeed, rarity, hasEffect, tooltipLines, annotationLines);
	}

	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		EntityPlayer player = (EntityPlayer) entityIn;
		ModItemEvents.nopiumToolTickDrop(worldIn, player, stack, itemSlot);
	}
}