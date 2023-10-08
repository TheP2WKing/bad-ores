package net.thep2wking.badores.content.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.thep2wking.badores.util.ModItemEvents;
import net.thep2wking.reloadedlib.api.armor.ModItemArmorBase;

public class ItemAmadeumArmor extends ModItemArmorBase {
	public ItemAmadeumArmor(String modid, String name, CreativeTabs tab, ArmorMaterial material, int renderIndex,
			EntityEquipmentSlot slot, EnumRarity rarity, boolean hasEffect, int tooltipLines) {
		super(modid, name, tab, material, renderIndex, slot, rarity, hasEffect, tooltipLines);
	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		ModItemEvents.amadeumToolTickSound(world, player);
	}

	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		EntityPlayer player = (EntityPlayer) entityIn;
		ModItemEvents.amadeumToolTickSound(worldIn, player);
	}
}