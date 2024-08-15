package net.thep2wking.badores.integration.jer;

import jeresources.api.conditionals.LightLevel;
import jeresources.api.drop.LootDrop;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.thep2wking.badores.BadOres;
import net.thep2wking.badores.config.BadOresConfig;
import net.thep2wking.badores.content.entity.EntityFleesonsite;
import net.thep2wking.badores.content.entity.EntityNosleeptonite;
import net.thep2wking.badores.init.ModBlocks;
import net.thep2wking.badores.init.ModItems;
import net.thep2wking.oedldoedlcore.api.integration.ModJERPluginBase;

public class BadOresJERPlugin extends ModJERPluginBase {
	@Override
	public String getModId() {
		return BadOres.MODID;
	}

	@Override
	public void register() {
		if (BadOresConfig.INTEGRATION.JER_INTEGRATION) {
			addMob(new EntityFleesonsite(getWorld()), LightLevel.any, EntityFleesonsite.EXPERIENCE_VALUE, EntityFleesonsite.LOOT_TABLE);
			addMob(new EntityNosleeptonite(getWorld()), LightLevel.any, EntityNosleeptonite.EXPERIENCE_VALUE, EntityNosleeptonite.LOOT_TABLE);

			addOreGen(ModBlocks.POLITE_ORE, 6, 6, 1, 64);
			addOreGen(ModBlocks.WANNAFITE_ORE, 6, 6, 1, 64, new LootDrop[] { 
				new LootDrop(new ItemStack(Items.IRON_SWORD, 1, 0)) });
			addOreGen(ModBlocks.BREAKIUM_ORE, 6, 6, 1, 64);
			addOreGen(ModBlocks.STONIUM_ORE, 15, 60, 32, 256, new LootDrop[] { 
				new LootDrop(new ItemStack(Blocks.COBBLESTONE, 1, 0)) });
			addOreGen(ModBlocks.CRAPPIUM_ORE, 8, 8, 40, 120);
			addOreGen(ModBlocks.ENDERITE_ORE, 6, 6, 1, 64);
			addOreGen(ModBlocks.WEBSITE_ORE, 6, 6, 1, 64);
			addOreGen(ModBlocks.LITE_ORE, 4, 4, 1, 48, new LootDrop[] { 
				new LootDrop(new ItemStack(Items.GLOWSTONE_DUST, 1, 0)) });
			addOreGen(ModBlocks.MISLEADIUM_ORE, 6, 6, 1, 64);
			addOreGen(ModBlocks.GHOSTIUM_ORE, 6, 6, 1, 64);
			addOreGen(ModBlocks.AMADEUM_ORE, 5, 6, 4, 64);
			addOreGen(ModBlocks.BARELYGENERITE_ORE, 1, 3, 1, 64);
			addOreGen(ModBlocks.UNOBTAINIUM_ORE, 6, 5, 1, 64);
			addOreGen(ModBlocks.COPPER_ORE, 10, 12, 20, 100);
			addOreGen(ModBlocks.USELESSIUM_ORE, 10, 6, 1, 128);
			addOreGen(ModBlocks.KILLIUM_ORE, 6, 6, 1, 64);
			addOreGen(ModBlocks.MOVIUM_ORE, 6, 6, 1, 64);
			addOreGen(ModBlocks.BALANCIUM_ORE, 4, 3, 1, 48, new LootDrop[] {
				new LootDrop(new ItemStack(Items.COAL, 5, 0)), new LootDrop(new ItemStack(Items.IRON_INGOT, 5, 0)),
				new LootDrop(new ItemStack(Items.GOLD_INGOT, 5, 0)),
				new LootDrop(new ItemStack(Items.DIAMOND, 5, 0)), new LootDrop(new ItemStack(Items.EMERALD, 5, 0)),
				new LootDrop(new ItemStack(Items.QUARTZ, 5, 0)),
				new LootDrop(new ItemStack(Items.GOLDEN_APPLE, 5, 0)) });
			addOreGen(ModBlocks.EXPLODEITMITE_ORE, 2, 3, 1, 48);
			addSpikeOreGen(ModBlocks.MARMITE_ORE, 55, 20, 0.0001f);
			addOreGen(ModBlocks.SHIFTIUM_ORE, 6, 6, 1, 64);
			addOreGen(ModBlocks.WANTARITE_ORE, 5, 5, 16, 64);
			addSpikeOreGen(ModBlocks.IDLIKEABITE_ORE, 65, 15, 0.0003f);
			addOreGen(ModBlocks.METEORITE_ORE, 8, 8, 80, 220);
			addOreGen(ModBlocks.STREETSCUM_ORE, 5, 6, 1, 48);
			addOreGen(ModBlocks.FLEESONSITE_ORE, 5, 5, 1, 64);
			addOreGen(ModBlocks.NOPIUM_ORE, 6, 6, 1, 64);
			addOreGen(ModBlocks.ZOMBIEUNITE_ORE, 4, 6, 1, 64, new LootDrop[] { 
				new LootDrop(new ItemStack(Items.SKULL, 1, 2)) });
			addSpikeOreGen(ModBlocks.PAINTITWHITE_ORE, 60, 40, 0.0002f, new LootDrop[] { 
				new LootDrop(new ItemStack(Items.DYE, 1, 15)) });
			addOreGen(ModBlocks.IWONTFITE_ORE, 6, 6, 1, 64);
			addOreGen(ModBlocks.TAUNTUM_ORE, 4, 4, 1, 48);
			addOreGen(ModBlocks.PANDAEMONIUM_ORE, 4, 6, 1, 10, new LootDrop[] { 
				new LootDrop(new ItemStack(Blocks.NETHERRACK, 2, 0)),
				new LootDrop(new ItemStack(Blocks.SOUL_SAND, 2, 0)),
				new LootDrop(new ItemStack(Blocks.OBSIDIAN, 2, 0)),
				new LootDrop(new ItemStack(Items.FIRE_CHARGE, 2, 0)),
				new LootDrop(new ItemStack(Items.BLAZE_ROD, 2, 0)),
				new LootDrop(new ItemStack(Items.MAGMA_CREAM, 2, 0)),
				new LootDrop(new ItemStack(Items.NETHER_WART, 2, 0)) });
			addOreGen(ModBlocks.NOSLEEPTONITE_ORE, 2, 3, 1, 40);
			addSpikeOreGen(ModBlocks.APPETITE_ORE, 55, 20, 0.0002f);
			addOreGen(ModBlocks.CRASHIUM_ORE, 6, 5, 1, 64);
			addOreGen(ModBlocks.SMITE_ORE, 6, 6, 1, 64);
			addOreGen(ModBlocks.DIAMOND_ORE, 6, 6, 1, 64, new LootDrop[] {
				new LootDrop(new ItemStack(ModItems.DIAMOND, 1, 0)) });
			addOreGen(ModBlocks.KAKKARITE_ORE, 6, 5, 1, 64, new LootDrop[] { 
				new LootDrop(new ItemStack(ModItems.KAKKARITE_GEMSTONE, BadOresConfig.EVENTS.KAKKARITE_DROP_COUNT, 0)) });
		}
	}
}