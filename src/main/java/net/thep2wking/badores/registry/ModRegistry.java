package net.thep2wking.badores.registry;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.thep2wking.reloadedlib.util.ModLogger;
import net.thep2wking.badores.BadOres;

@Mod.EventBusSubscriber
public class ModRegistry {
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event) {
		ModLogger.registeredBlocksLogger(BadOres.MODID);

		// ModRegistryHelper.registerBlock(event, ModBlocks.JUTE_BALE);
	}

	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		ModLogger.registeredItemsLogger(BadOres.MODID);

		// ModRegistryHelper.registerItem(event, ModItems.JUTE_BALE_BLOCK);

		// ModRegistryHelper.registerItem(event, ModItems.JUTE_STALK);
	}
}