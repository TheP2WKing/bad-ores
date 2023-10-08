package net.thep2wking.badores.content.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.thep2wking.badores.util.events.ModItemEvents;
import net.thep2wking.reloadedlib.api.armor.ModItemArmorBase;

public class ItemPoliteArmor extends ModItemArmorBase {
	public ItemPoliteArmor(String modid, String name, CreativeTabs tab, ArmorMaterial material, int renderIndex,
			EntityEquipmentSlot slot, EnumRarity rarity, boolean hasEffect, int tooltipLines) {
		super(modid, name, tab, material, renderIndex, slot, rarity, hasEffect, tooltipLines);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void onEntityAttacked(LivingAttackEvent event) {
		if (event.getEntityLiving() instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) event.getEntityLiving();
			World world = player.getEntityWorld();
			ItemStack head = player.getItemStackFromSlot(EntityEquipmentSlot.HEAD);
			ItemStack chest = player.getItemStackFromSlot(EntityEquipmentSlot.CHEST);
			ItemStack legs = player.getItemStackFromSlot(EntityEquipmentSlot.LEGS);
			ItemStack feet = player.getItemStackFromSlot(EntityEquipmentSlot.FEET);
			if (head != null && head.getItem() instanceof ItemPoliteArmor) {
				ModItemEvents.politeArmorMessage(world, player);
			}
			if (chest != null && chest.getItem() instanceof ItemPoliteArmor) {
				ModItemEvents.politeArmorMessage(world, player);
			}
			if (legs != null && legs.getItem() instanceof ItemPoliteArmor) {
				ModItemEvents.politeArmorMessage(world, player);
			}
			if (feet != null && feet.getItem() instanceof ItemPoliteArmor) {
				ModItemEvents.politeArmorMessage(world, player);
			}
		}
	}
}