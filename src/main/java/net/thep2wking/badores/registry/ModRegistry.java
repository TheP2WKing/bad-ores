package net.thep2wking.badores.registry;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.thep2wking.oedldoedlcore.util.ModLogger;
import net.thep2wking.oedldoedlcore.util.ModRegistryHelper;
import net.thep2wking.badores.BadOres;
import net.thep2wking.badores.init.ModBlocks;
import net.thep2wking.badores.init.ModItems;
import net.thep2wking.badores.init.ModSounds;

@Mod.EventBusSubscriber
public class ModRegistry {
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event) {
		ModRegistryHelper.registerModels(event, BadOres.MODID);
	}

	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event) {
		ModLogger.registeredBlocksLogger(BadOres.MODID);

		ModRegistryHelper.registerBlock(event, ModBlocks.POLITE_ORE);
		ModRegistryHelper.registerBlock(event, ModBlocks.WANNAFITE_ORE);
		ModRegistryHelper.registerBlock(event, ModBlocks.BREAKIUM_ORE);
		ModRegistryHelper.registerBlock(event, ModBlocks.STONIUM_ORE);
		ModRegistryHelper.registerBlock(event, ModBlocks.CRAPPIUM_ORE);
		ModRegistryHelper.registerBlock(event, ModBlocks.ENDERITE_ORE);
		ModRegistryHelper.registerBlock(event, ModBlocks.WEBSITE_ORE);
		ModRegistryHelper.registerBlock(event, ModBlocks.LITE_ORE);
		ModRegistryHelper.registerBlock(event, ModBlocks.MISLEADIUM_ORE);
		ModRegistryHelper.registerBlock(event, ModBlocks.GHOSTIUM_ORE);
		ModRegistryHelper.registerBlock(event, ModBlocks.AMADEUM_ORE);
		ModRegistryHelper.registerBlock(event, ModBlocks.BARELYGENERITE_ORE);
		ModRegistryHelper.registerBlock(event, ModBlocks.UNOBTAINIUM_ORE);
		ModRegistryHelper.registerBlock(event, ModBlocks.COPPER_ORE);
		ModRegistryHelper.registerBlock(event, ModBlocks.USELESSIUM_ORE);
		ModRegistryHelper.registerBlock(event, ModBlocks.KILLIUM_ORE);
		ModRegistryHelper.registerBlock(event, ModBlocks.MOVIUM_ORE);
		ModRegistryHelper.registerBlock(event, ModBlocks.BALANCIUM_ORE);
		ModRegistryHelper.registerBlock(event, ModBlocks.EXPLODEITMITE_ORE);
		ModRegistryHelper.registerBlock(event, ModBlocks.MARMITE_ORE);
		ModRegistryHelper.registerBlock(event, ModBlocks.SHIFTIUM_ORE);
		ModRegistryHelper.registerBlock(event, ModBlocks.WANTARITE_ORE);
		ModRegistryHelper.registerBlock(event, ModBlocks.IDLIKEABITE_ORE);
		ModRegistryHelper.registerBlock(event, ModBlocks.METEORITE_ORE);
		ModRegistryHelper.registerBlock(event, ModBlocks.STREETSCUM_ORE);
		ModRegistryHelper.registerBlock(event, ModBlocks.FLEESONSITE_ORE);
		ModRegistryHelper.registerBlock(event, ModBlocks.NOPIUM_ORE);
		ModRegistryHelper.registerBlock(event, ModBlocks.ZOMBIEUNITE_ORE);
		ModRegistryHelper.registerBlock(event, ModBlocks.PAINTITWHITE_ORE);
		ModRegistryHelper.registerBlock(event, ModBlocks.IWONTFITE_ORE);
		ModRegistryHelper.registerBlock(event, ModBlocks.TAUNTUM_ORE);
		ModRegistryHelper.registerBlock(event, ModBlocks.PANDAEMONIUM_ORE);
		ModRegistryHelper.registerBlock(event, ModBlocks.NOSLEEPTONITE_ORE);
		ModRegistryHelper.registerBlock(event, ModBlocks.APPETITE_ORE);
		ModRegistryHelper.registerBlock(event, ModBlocks.CRASHIUM_ORE);
		ModRegistryHelper.registerBlock(event, ModBlocks.SMITE_ORE);
		ModRegistryHelper.registerBlock(event, ModBlocks.DIAMOND_ORE);
		ModRegistryHelper.registerBlock(event, ModBlocks.KAKKARITE_ORE);

		ModRegistryHelper.registerBlock(event, ModBlocks.POLITE_BLOCK);
		ModRegistryHelper.registerBlock(event, ModBlocks.CRAPPIUM_BLOCK);
		ModRegistryHelper.registerBlock(event, ModBlocks.ENDERITE_BLOCK);
		ModRegistryHelper.registerBlock(event, ModBlocks.AMADEUM_BLOCK);
		ModRegistryHelper.registerBlock(event, ModBlocks.BARELYGENERITE_BLOCK);
		ModRegistryHelper.registerBlock(event, ModBlocks.COPPER_BLOCK);
		ModRegistryHelper.registerBlock(event, ModBlocks.MARMITE_BLOCK);
		ModRegistryHelper.registerBlock(event, ModBlocks.FLEESONSITE_BLOCK);
		ModRegistryHelper.registerBlock(event, ModBlocks.NOPIUM_BLOCK);
		ModRegistryHelper.registerBlock(event, ModBlocks.NOSLEEPTONITE_BLOCK);
		ModRegistryHelper.registerBlock(event, ModBlocks.CRASHIUM_BLOCK);
		ModRegistryHelper.registerBlock(event, ModBlocks.SMITE_BLOCK);
		ModRegistryHelper.registerBlock(event, ModBlocks.DIAMOND_BLOCK);
		ModRegistryHelper.registerBlock(event, ModBlocks.KAKKARITE_BLOCK);
	}

	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		ModLogger.registeredItemsLogger(BadOres.MODID);

		ModRegistryHelper.registerItemBlock(event, ModItems.POLITE);
		ModRegistryHelper.registerItemBlock(event, ModItems.WANNAFITE);
		ModRegistryHelper.registerItemBlock(event, ModItems.BREAKIUM);
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
		ModRegistryHelper.registerItemBlock(event, ModItems.WANTARITE);
		ModRegistryHelper.registerItemBlock(event, ModItems.IDLIKEABITE);
		ModRegistryHelper.registerItemBlock(event, ModItems.METEORITE);
		ModRegistryHelper.registerItemBlock(event, ModItems.STREETSCUM);
		ModRegistryHelper.registerItemBlock(event, ModItems.FLEESONSITE);
		ModRegistryHelper.registerItemBlock(event, ModItems.NOPIUM);
		ModRegistryHelper.registerItemBlock(event, ModItems.ZOMBIEUNITE);
		ModRegistryHelper.registerItemBlock(event, ModItems.PAINTITWHITE);
		ModRegistryHelper.registerItemBlock(event, ModItems.IWONTFITE);
		ModRegistryHelper.registerItemBlock(event, ModItems.TAUNTUM);
		ModRegistryHelper.registerItemBlock(event, ModItems.PANDAEMONIUM);
		ModRegistryHelper.registerItemBlock(event, ModItems.NOSLEEPTONITE);
		ModRegistryHelper.registerItemBlock(event, ModItems.APPETITE);
		ModRegistryHelper.registerItemBlock(event, ModItems.CRASHIUM);
		ModRegistryHelper.registerItemBlock(event, ModItems.SMITE);
		ModRegistryHelper.registerItemBlock(event, ModItems.DIAMOND_ORE);
		ModRegistryHelper.registerItemBlock(event, ModItems.KAKKARITE);

		ModRegistryHelper.registerItemBlock(event, ModItems.POLITE_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.CRAPPIUM_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.ENDERITE_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.AMADEUM_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.BARELYGENERITE_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.COPPER_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.MARMITE_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.FLEESONSITE_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.NOPIUM_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.NOSLEEPTONITE_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.CRASHIUM_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.SMITE_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.DIAMOND_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.KAKKARITE_BLOCK);

		ModRegistryHelper.registerItem(event, ModItems.POLITE_INGOT);
		ModRegistryHelper.registerItem(event, ModItems.CRAPPIUM_INGOT);
		ModRegistryHelper.registerItem(event, ModItems.ENDERITE_INGOT);
		ModRegistryHelper.registerItem(event, ModItems.AMADEUM_INGOT);
		ModRegistryHelper.registerItem(event, ModItems.BARELYGENERITE_INGOT);
		ModRegistryHelper.registerItem(event, ModItems.COPPER_INGOT);
		ModRegistryHelper.registerItem(event, ModItems.USELESSIUM_INGOT);
		ModRegistryHelper.registerItem(event, ModItems.MARMITE_INGOT);
		ModRegistryHelper.registerItem(event, ModItems.FLEESONSITE_INGOT);
		ModRegistryHelper.registerItem(event, ModItems.NOPIUM_INGOT);
		ModRegistryHelper.registerItem(event, ModItems.NOSLEEPTONITE_INGOT);
		ModRegistryHelper.registerItem(event, ModItems.CRASHIUM_GEMSTONE);
		ModRegistryHelper.registerItem(event, ModItems.SMITE_GEMSTONE);
		ModRegistryHelper.registerItem(event, ModItems.DIAMOND);
		ModRegistryHelper.registerItem(event, ModItems.KAKKARITE_GEMSTONE);

		ModRegistryHelper.registerItem(event, ModItems.POLITE_SWORD);
		ModRegistryHelper.registerItem(event, ModItems.POLITE_SHOVEL);
		ModRegistryHelper.registerItem(event, ModItems.POLITE_PICKAXE);
		ModRegistryHelper.registerItem(event, ModItems.POLITE_AXE);
		ModRegistryHelper.registerItem(event, ModItems.POLITE_HOE);
		ModRegistryHelper.registerItem(event, ModItems.POLITE_HELMET);
		ModRegistryHelper.registerItem(event, ModItems.POLITE_CHESTPLATE);
		ModRegistryHelper.registerItem(event, ModItems.POLITE_LEGGINGS);
		ModRegistryHelper.registerItem(event, ModItems.POLITE_BOOTS);

		ModRegistryHelper.registerItem(event, ModItems.CRAPPIUM_SWORD);
		ModRegistryHelper.registerItem(event, ModItems.CRAPPIUM_SHOVEL);
		ModRegistryHelper.registerItem(event, ModItems.CRAPPIUM_PICKAXE);
		ModRegistryHelper.registerItem(event, ModItems.CRAPPIUM_AXE);
		ModRegistryHelper.registerItem(event, ModItems.CRAPPIUM_HOE);
		ModRegistryHelper.registerItem(event, ModItems.CRAPPIUM_HELMET);
		ModRegistryHelper.registerItem(event, ModItems.CRAPPIUM_CHESTPLATE);
		ModRegistryHelper.registerItem(event, ModItems.CRAPPIUM_LEGGINGS);
		ModRegistryHelper.registerItem(event, ModItems.CRAPPIUM_BOOTS);

		ModRegistryHelper.registerItem(event, ModItems.ENDERITE_SWORD);
		ModRegistryHelper.registerItem(event, ModItems.ENDERITE_SHOVEL);
		ModRegistryHelper.registerItem(event, ModItems.ENDERITE_PICKAXE);
		ModRegistryHelper.registerItem(event, ModItems.ENDERITE_AXE);
		ModRegistryHelper.registerItem(event, ModItems.ENDERITE_HOE);
		ModRegistryHelper.registerItem(event, ModItems.ENDERITE_HELMET);
		ModRegistryHelper.registerItem(event, ModItems.ENDERITE_CHESTPLATE);
		ModRegistryHelper.registerItem(event, ModItems.ENDERITE_LEGGINGS);
		ModRegistryHelper.registerItem(event, ModItems.ENDERITE_BOOTS);

		ModRegistryHelper.registerItem(event, ModItems.AMADEUM_SWORD);
		ModRegistryHelper.registerItem(event, ModItems.AMADEUM_SHOVEL);
		ModRegistryHelper.registerItem(event, ModItems.AMADEUM_PICKAXE);
		ModRegistryHelper.registerItem(event, ModItems.AMADEUM_AXE);
		ModRegistryHelper.registerItem(event, ModItems.AMADEUM_HOE);
		ModRegistryHelper.registerItem(event, ModItems.AMADEUM_HELMET);
		ModRegistryHelper.registerItem(event, ModItems.AMADEUM_CHESTPLATE);
		ModRegistryHelper.registerItem(event, ModItems.AMADEUM_LEGGINGS);
		ModRegistryHelper.registerItem(event, ModItems.AMADEUM_BOOTS);

		ModRegistryHelper.registerItem(event, ModItems.COPPER_SWORD);
		ModRegistryHelper.registerItem(event, ModItems.COPPER_SHOVEL);
		ModRegistryHelper.registerItem(event, ModItems.COPPER_PICKAXE);
		ModRegistryHelper.registerItem(event, ModItems.COPPER_AXE);
		ModRegistryHelper.registerItem(event, ModItems.COPPER_HOE);
		ModRegistryHelper.registerItem(event, ModItems.COPPER_HELMET);
		ModRegistryHelper.registerItem(event, ModItems.COPPER_CHESTPLATE);
		ModRegistryHelper.registerItem(event, ModItems.COPPER_LEGGINGS);
		ModRegistryHelper.registerItem(event, ModItems.COPPER_BOOTS);

		ModRegistryHelper.registerItem(event, ModItems.NOPIUM_SWORD);
		ModRegistryHelper.registerItem(event, ModItems.NOPIUM_SHOVEL);
		ModRegistryHelper.registerItem(event, ModItems.NOPIUM_PICKAXE);
		ModRegistryHelper.registerItem(event, ModItems.NOPIUM_AXE);
		ModRegistryHelper.registerItem(event, ModItems.NOPIUM_HOE);
		ModRegistryHelper.registerItem(event, ModItems.NOPIUM_HELMET);
		ModRegistryHelper.registerItem(event, ModItems.NOPIUM_CHESTPLATE);
		ModRegistryHelper.registerItem(event, ModItems.NOPIUM_LEGGINGS);
		ModRegistryHelper.registerItem(event, ModItems.NOPIUM_BOOTS);

		ModRegistryHelper.registerItem(event, ModItems.CRASHIUM_SWORD);
		ModRegistryHelper.registerItem(event, ModItems.CRASHIUM_SHOVEL);
		ModRegistryHelper.registerItem(event, ModItems.CRASHIUM_PICKAXE);
		ModRegistryHelper.registerItem(event, ModItems.CRASHIUM_AXE);
		ModRegistryHelper.registerItem(event, ModItems.CRASHIUM_HOE);
		ModRegistryHelper.registerItem(event, ModItems.CRASHIUM_HELMET);
		ModRegistryHelper.registerItem(event, ModItems.CRASHIUM_CHESTPLATE);
		ModRegistryHelper.registerItem(event, ModItems.CRASHIUM_LEGGINGS);
		ModRegistryHelper.registerItem(event, ModItems.CRASHIUM_BOOTS);

		ModRegistryHelper.registerItem(event, ModItems.SMITE_SWORD);
		ModRegistryHelper.registerItem(event, ModItems.SMITE_SHOVEL);
		ModRegistryHelper.registerItem(event, ModItems.SMITE_PICKAXE);
		ModRegistryHelper.registerItem(event, ModItems.SMITE_AXE);
		ModRegistryHelper.registerItem(event, ModItems.SMITE_HOE);
		ModRegistryHelper.registerItem(event, ModItems.SMITE_HELMET);
		ModRegistryHelper.registerItem(event, ModItems.SMITE_CHESTPLATE);
		ModRegistryHelper.registerItem(event, ModItems.SMITE_LEGGINGS);
		ModRegistryHelper.registerItem(event, ModItems.SMITE_BOOTS);

		ModRegistryHelper.registerItem(event, ModItems.DIAMOND_SWORD);
		ModRegistryHelper.registerItem(event, ModItems.DIAMOND_SHOVEL);
		ModRegistryHelper.registerItem(event, ModItems.DIAMOND_PICKAXE);
		ModRegistryHelper.registerItem(event, ModItems.DIAMOND_AXE);
		ModRegistryHelper.registerItem(event, ModItems.DIAMOND_HOE);
		ModRegistryHelper.registerItem(event, ModItems.DIAMOND_HELMET);
		ModRegistryHelper.registerItem(event, ModItems.DIAMOND_CHESTPLATE);
		ModRegistryHelper.registerItem(event, ModItems.DIAMOND_LEGGINGS);
		ModRegistryHelper.registerItem(event, ModItems.DIAMOND_BOOTS);

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
}