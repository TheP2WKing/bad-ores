package net.thep2wking.badores.util;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.thep2wking.badores.BadOres;
import net.thep2wking.badores.init.ModItems;
import net.thep2wking.oedldoedlcore.api.armor.ModArmorMaterialBase;

public class ModArmorMaterial {
	public static final ArmorMaterial POLITE = ModArmorMaterialBase.addArmorMaterial(BadOres.MODID, "polite", 8,
			new int[] { 1, 3, 4, 2 }, 0f, 8, SoundEvents.ITEM_ARMOR_EQUIP_IRON, ModItems.POLITE_INGOT, 0);
	public static final ArmorMaterial CRAPPIUM = ModArmorMaterialBase.addArmorMaterial(BadOres.MODID, "crappium", 1,
			new int[] { 1, 1, 1, 1 }, 0f, 0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, ModItems.CRAPPIUM_INGOT, 0);
	public static final ArmorMaterial ENDERITE = ModArmorMaterialBase.addArmorMaterial(BadOres.MODID, "enderite", 17,
			new int[] { 1, 4, 5, 2 }, 0f, 20, SoundEvents.ITEM_ARMOR_EQUIP_IRON, ModItems.ENDERITE_INGOT, 0);
	public static final ArmorMaterial AMADEUM = ModArmorMaterialBase.addArmorMaterial(BadOres.MODID, "amadeum", 10,
			new int[] { 2, 5, 6, 2 }, 0f, 20, SoundEvents.ITEM_ARMOR_EQUIP_IRON, ModItems.AMADEUM_INGOT, 0);
	public static final ArmorMaterial COPPER = ModArmorMaterialBase.addArmorMaterial(BadOres.MODID, "copper", 8,
			new int[] { 1, 3, 4, 1 }, 0f, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, ModItems.COPPER_INGOT, 0);
	public static final ArmorMaterial NOPIUM = ModArmorMaterialBase.addArmorMaterial(BadOres.MODID, "nopium", 15,
			new int[] { 2, 5, 6, 2 }, 0f, 0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, ModItems.NOPIUM_INGOT, 0);
	public static final ArmorMaterial CRASHIUM = ModArmorMaterialBase.addArmorMaterial(BadOres.MODID, "crashium", 8,
			new int[] { 2, 5, 7, 2 }, 0f, 9, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, ModItems.CRASHIUM_GEMSTONE, 0);
	public static final ArmorMaterial SMITE = ModArmorMaterialBase.addArmorMaterial(BadOres.MODID, "smite", 8,
			new int[] { 2, 4, 5, 2 }, 0f, 8, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, ModItems.SMITE_GEMSTONE, 0);
	public static final ArmorMaterial DIAMOND = ModArmorMaterialBase.addArmorMaterial(BadOres.MODID, "diamond", 1,
			new int[] { 1, 1, 1, 1 }, 0f, 0, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, ModItems.DIAMOND, 0);
}