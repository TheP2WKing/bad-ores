package net.thep2wking.badores.content.itemblock;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.thep2wking.badores.config.BadOresConfig;
import net.thep2wking.oedldoedlcore.api.item.ModItemBlockBase;

public class ItemBlockIwontfite extends ModItemBlockBase {
	public ItemBlockIwontfite(Block block, EnumRarity rarity, boolean hasEffect, int tooltipLines, int annotationLines) {
		super(block, rarity, hasEffect, tooltipLines, annotationLines);
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	@SubscribeEvent
	public void onPlayerAttack(LivingHurtEvent event) {
        Entity entity = event.getSource().getTrueSource();
        if (!(entity instanceof EntityPlayer)) {
            return;
        }
        EntityPlayer player = (EntityPlayer) entity;
        if (player.capabilities.isCreativeMode || !BadOresConfig.EVENTS.IWONTFITE_DISABLES_DAMAGE) {
            return;
        }
        IInventory inv = player.inventory;
        int len = inv.getSizeInventory();
        Random random = new Random();
        for (int i = 0; i < len; ++i) {
            ItemStack stack = inv.getStackInSlot(i);
            if (stack != null && stack.getItem() instanceof ItemBlockIwontfite) {
                event.setAmount(random.nextInt(1000) == 0 ? 1 : 0);
                break;
            }
        }
    }
}