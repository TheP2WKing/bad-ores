package net.thep2wking.badores.registry;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.thep2wking.reloadedlib.util.ModLogger;
import net.thep2wking.reloadedlib.util.ModRegistryHelper;
import net.thep2wking.badores.BadOres;
import net.thep2wking.badores.content.entities.EntityFleesonsite;
import net.thep2wking.badores.content.entities.EntityNosleeptonite;
import net.thep2wking.badores.init.ModBlocks;
import net.thep2wking.badores.init.ModItems;
import net.thep2wking.badores.init.ModSounds;
import net.thep2wking.badores.util.render.RenderFleesonsite;
import net.thep2wking.badores.util.render.RenderNosleeptonite;

@Mod.EventBusSubscriber
public class ModRegistry {
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event) {
		ModLogger.registeredBlocksLogger(BadOres.MODID);

		ModRegistryHelper.registerBlock(event, ModBlocks.POLITE);
		ModRegistryHelper.registerBlock(event, ModBlocks.WANNAFITE);
		ModRegistryHelper.registerBlock(event, ModBlocks.BREAKIUM);
		ModRegistryHelper.registerBlock(event, ModBlocks.CRASHIUM);
		ModRegistryHelper.registerBlock(event, ModBlocks.STONIUM);
		ModRegistryHelper.registerBlock(event, ModBlocks.CRAPPIUM);
		ModRegistryHelper.registerBlock(event, ModBlocks.ENDERITE);
		ModRegistryHelper.registerBlock(event, ModBlocks.WEBSITE);
		ModRegistryHelper.registerBlock(event, ModBlocks.LITE);
		ModRegistryHelper.registerBlock(event, ModBlocks.MISLEADIUM);
		ModRegistryHelper.registerBlock(event, ModBlocks.GHOSTIUM);
		ModRegistryHelper.registerBlock(event, ModBlocks.AMADEUM);

		ModRegistryHelper.registerBlock(event, ModBlocks.BARELYGENERITE);
		ModRegistryHelper.registerBlock(event, ModBlocks.UNOBTAINIUM);
		ModRegistryHelper.registerBlock(event, ModBlocks.COPPER_ORE);
		ModRegistryHelper.registerBlock(event, ModBlocks.USELESSIUM);
		ModRegistryHelper.registerBlock(event, ModBlocks.KILLIUM);
		ModRegistryHelper.registerBlock(event, ModBlocks.MOVIUM);
		ModRegistryHelper.registerBlock(event, ModBlocks.BALANCIUM);
		ModRegistryHelper.registerBlock(event, ModBlocks.EXPLODEITMITE);
		ModRegistryHelper.registerBlock(event, ModBlocks.MARMITE);
		ModRegistryHelper.registerBlock(event, ModBlocks.SHIFTIUM);
		ModRegistryHelper.registerBlock(event, ModBlocks.SMITE);
		ModRegistryHelper.registerBlock(event, ModBlocks.WANTARITE);

		ModRegistryHelper.registerBlock(event, ModBlocks.IDLIKEABITE);
		ModRegistryHelper.registerBlock(event, ModBlocks.METEORITE);
		ModRegistryHelper.registerBlock(event, ModBlocks.STREETSCUM);
		ModRegistryHelper.registerBlock(event, ModBlocks.FLEESONSITE);
		ModRegistryHelper.registerBlock(event, ModBlocks.NOPIUM);
		ModRegistryHelper.registerBlock(event, ModBlocks.ZOMBIEUNITE);
		ModRegistryHelper.registerBlock(event, ModBlocks.PAINTITWHITE);
		ModRegistryHelper.registerBlock(event, ModBlocks.IWONTFITE);
		ModRegistryHelper.registerBlock(event, ModBlocks.DIAMOND_ORE);
		ModRegistryHelper.registerBlock(event, ModBlocks.TAUNTUM);
		ModRegistryHelper.registerBlock(event, ModBlocks.KAKKARITE);
		ModRegistryHelper.registerBlock(event, ModBlocks.PANDAEMONIUM);
		ModRegistryHelper.registerBlock(event, ModBlocks.NOSLEEPTONITE);
		ModRegistryHelper.registerBlock(event, ModBlocks.APPETITE);

		ModRegistryHelper.registerBlock(event, ModBlocks.POLITE_BLOCK);
		ModRegistryHelper.registerBlock(event, ModBlocks.CRASHIUM_BLOCK);
		ModRegistryHelper.registerBlock(event, ModBlocks.CRAPPIUM_BLOCK);
		ModRegistryHelper.registerBlock(event, ModBlocks.ENDERITE_BLOCK);
		ModRegistryHelper.registerBlock(event, ModBlocks.AMADEUM_BLOCK);
		ModRegistryHelper.registerBlock(event, ModBlocks.BARELYGENERITE_BLOCK);
		ModRegistryHelper.registerBlock(event, ModBlocks.COPPER_BLOCK);
		ModRegistryHelper.registerBlock(event, ModBlocks.MARMITE_BLOCK);
		ModRegistryHelper.registerBlock(event, ModBlocks.SMITE_BLOCK);
		ModRegistryHelper.registerBlock(event, ModBlocks.FLEESONSITE_BLOCK);
		ModRegistryHelper.registerBlock(event, ModBlocks.NOPIUM_BLOCK);
		ModRegistryHelper.registerBlock(event, ModBlocks.DIAMOND_BLOCK);
		ModRegistryHelper.registerBlock(event, ModBlocks.KAKKARITE_BLOCK);
		ModRegistryHelper.registerBlock(event, ModBlocks.NOSLEEPTONITE_BLOCK);
	}

	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		ModLogger.registeredItemsLogger(BadOres.MODID);

		ModRegistryHelper.registerItemBlock(event, ModItems.POLITE);
		ModRegistryHelper.registerItemBlock(event, ModItems.WANNAFITE);
		ModRegistryHelper.registerItemBlock(event, ModItems.BREAKIUM);
		ModRegistryHelper.registerItemBlock(event, ModItems.CRASHIUM);
		ModRegistryHelper.registerItemBlock(event, ModItems.STONIUM);
		ModRegistryHelper.registerItemBlock(event, ModItems.CRAPPIUM);
		ModRegistryHelper.registerItemBlock(event, ModItems.ENDERITE);
		ModRegistryHelper.registerItemBlock(event, ModItems.WEBSITE);
		ModRegistryHelper.registerItemBlock(event, ModItems.LITE);
		ModRegistryHelper.registerItemBlock(event, ModItems.MISLEADIUM);
		ModRegistryHelper.registerItemBlock(event, ModItems.GHOSTIUM);
		ModRegistryHelper.registerItemBlock(event, ModItems.AMADEUM);

		ModRegistryHelper.registerItemBlock(event, ModItems.BARELYGENERITE);
		ModRegistryHelper.registerItemBlock(event, ModItems.UNOBTAINIUM);
		ModRegistryHelper.registerItemBlock(event, ModItems.COPPER_ORE);
		ModRegistryHelper.registerItemBlock(event, ModItems.USELESSIUM);
		ModRegistryHelper.registerItemBlock(event, ModItems.KILLIUM);
		ModRegistryHelper.registerItemBlock(event, ModItems.MOVIUM);
		ModRegistryHelper.registerItemBlock(event, ModItems.BALANCIUM);
		ModRegistryHelper.registerItemBlock(event, ModItems.EXPLODEITMITE);
		ModRegistryHelper.registerItemBlock(event, ModItems.MARMITE);
		ModRegistryHelper.registerItemBlock(event, ModItems.SHIFTIUM);
		ModRegistryHelper.registerItemBlock(event, ModItems.SMITE);
		ModRegistryHelper.registerItemBlock(event, ModItems.WANTARITE);

		ModRegistryHelper.registerItemBlock(event, ModItems.IDLIKEABITE);
		ModRegistryHelper.registerItemBlock(event, ModItems.METEORITE);
		ModRegistryHelper.registerItemBlock(event, ModItems.STREETSCUM);
		ModRegistryHelper.registerItemBlock(event, ModItems.FLEESONSITE);
		ModRegistryHelper.registerItemBlock(event, ModItems.NOPIUM);
		ModRegistryHelper.registerItemBlock(event, ModItems.ZOMBIEUNITE);
		ModRegistryHelper.registerItemBlock(event, ModItems.PAINTITWHITE);
		ModRegistryHelper.registerItemBlock(event, ModItems.IWONTFITE);
		ModRegistryHelper.registerItemBlock(event, ModItems.DIAMOND_ORE);
		ModRegistryHelper.registerItemBlock(event, ModItems.TAUNTUM);
		ModRegistryHelper.registerItemBlock(event, ModItems.KAKKARITE);
		ModRegistryHelper.registerItemBlock(event, ModItems.PANDAEMONIUM);
		ModRegistryHelper.registerItemBlock(event, ModItems.NOSLEEPTONITE);
		ModRegistryHelper.registerItemBlock(event, ModItems.APPETITE);

		ModRegistryHelper.registerItemBlock(event, ModItems.POLITE_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.CRASHIUM_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.CRAPPIUM_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.ENDERITE_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.AMADEUM_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.BARELYGENERITE_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.COPPER_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.MARMITE_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.SMITE_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.FLEESONSITE_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.NOPIUM_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.DIAMOND_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.KAKKARITE_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.NOSLEEPTONITE_BLOCK);

		ModRegistryHelper.registerItem(event, ModItems.POLITE_INGOT);
		ModRegistryHelper.registerItem(event, ModItems.CRASHIUM_GEMSTONE);
		ModRegistryHelper.registerItem(event, ModItems.CRAPPIUM_INGOT);
		ModRegistryHelper.registerItem(event, ModItems.ENDERITE_INGOT);
		ModRegistryHelper.registerItem(event, ModItems.AMADEUM_INGOT);
		ModRegistryHelper.registerItem(event, ModItems.BARELYGENERITE_INGOT);
		ModRegistryHelper.registerItem(event, ModItems.COPPER_INGOT);
		ModRegistryHelper.registerItem(event, ModItems.USELESSIUM_INGOT);
		ModRegistryHelper.registerItem(event, ModItems.MARMITE_INGOT);
		ModRegistryHelper.registerItem(event, ModItems.SMITE_GEMSTONE);
		ModRegistryHelper.registerItem(event, ModItems.FLEESONSITE_INGOT);
		ModRegistryHelper.registerItem(event, ModItems.NOPIUM_INGOT);
		ModRegistryHelper.registerItem(event, ModItems.DIAMOND);
		ModRegistryHelper.registerItem(event, ModItems.KAKKARITE_GEMSTONE);
		ModRegistryHelper.registerItem(event, ModItems.NOSLEEPTONITE_INGOT);

		ModRegistryHelper.registerItem(event, ModItems.MARMITE_BREAD);
	}

	@SubscribeEvent
	public static void onSoundEventRegister(RegistryEvent.Register<SoundEvent> event) {
		ModLogger.registeredSoundEventsLogger(BadOres.MODID);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.NOSLEEPTONITE_BLOCK);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.NOSLEEPTONITE_IDLE);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.NOSLEEPTONITE_HURT);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.NOSLEEPTONITE_DEATH);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.FLEESONSITE_IDLE);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.FLEESONSITE_HURT);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.FLEESONSITE_DEATH);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.PANDAEMONIUM_MINE);
	}

	@SubscribeEvent
	public static void onSoundModelRegister(ModelRegistryEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(EntityFleesonsite.class, RenderFleesonsite.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityNosleeptonite.class, RenderNosleeptonite.FACTORY);
	}
}