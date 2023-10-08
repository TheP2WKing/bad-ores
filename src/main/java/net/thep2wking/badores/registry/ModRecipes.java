package net.thep2wking.badores.registry;

import net.thep2wking.reloadedlib.util.ModLogger;
import net.thep2wking.reloadedlib.util.ModRecipeHelper;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.thep2wking.badores.BadOres;
import net.thep2wking.badores.init.ModBlocks;
import net.thep2wking.badores.init.ModItems;

public class ModRecipes {
	public static void registerRecipes() {
		ModLogger.registeredRecipesLogger(BadOres.MODID);

		ModRecipeHelper.addOreDictSmeltingRecipe(new ItemStack(ModItems.POLITE_INGOT, 1, 0), "orePolite", 0.7f);
		ModRecipeHelper.addOreDictSmeltingRecipe(new ItemStack(ModItems.CRAPPIUM_INGOT, 1, 0), "oreCrappium", 0.7f);
		ModRecipeHelper.addOreDictSmeltingRecipe(new ItemStack(ModItems.ENDERITE_INGOT, 1, 0), "oreEnderite", 0.7f);
		ModRecipeHelper.addOreDictSmeltingRecipe(new ItemStack(ModItems.AMADEUM_INGOT, 1, 0), "oreAmadeum", 0.7f);
		ModRecipeHelper.addOreDictSmeltingRecipe(new ItemStack(ModItems.BARELYGENERITE_INGOT, 1, 0),
				"oreBarelygenerite", 0.7f);
		ModRecipeHelper.addOreDictSmeltingRecipe(new ItemStack(ModItems.COPPER_INGOT, 1, 0), "oreCopper", 0.7f);
		ModRecipeHelper.addOreDictSmeltingRecipe(new ItemStack(ModItems.USELESSIUM_INGOT, 1, 0), "oreUselessium", 0.7f);
		ModRecipeHelper.addOreDictSmeltingRecipe(new ItemStack(ModItems.MARMITE_INGOT, 1, 0), "oreMarmite", 0.7f);
		ModRecipeHelper.addOreDictSmeltingRecipe(new ItemStack(ModItems.FLEESONSITE_INGOT, 1, 0), "oreFleesonsite",
				0.7f);
		ModRecipeHelper.addOreDictSmeltingRecipe(new ItemStack(ModItems.NOPIUM_INGOT, 1, 0), "oreNopium", 0.7f);
		ModRecipeHelper.addOreDictSmeltingRecipe(new ItemStack(ModItems.NOSLEEPTONITE_INGOT, 1, 0), "oreNosleeptonite",
				0.7f);
		ModRecipeHelper.addOreDictSmeltingRecipe(new ItemStack(ModItems.CRASHIUM_GEMSTONE, 1, 0), "oreCrashium", 1.0f);
		ModRecipeHelper.addOreDictSmeltingRecipe(new ItemStack(ModItems.SMITE_GEMSTONE, 1, 0), "oreSmite", 1.0f);
		ModRecipeHelper.addOreDictSmeltingRecipe(new ItemStack(ModItems.DIAMOND, 1, 0), "oreDiamondFake", 1.0f);
		ModRecipeHelper.addOreDictSmeltingRecipe(new ItemStack(ModItems.KAKKARITE_GEMSTONE, 64, 0), "oreKakkarite",
				0.1f);

		ModRecipeHelper.addOreDictSmeltingRecipe(new ItemStack(Items.IRON_SWORD, 1, 0), "oreWannafite", 0.7f);
		ModRecipeHelper.addOreDictSmeltingRecipe(new ItemStack(Blocks.COBBLESTONE, 1, 0), "oreStonium", 0.1f);
		ModRecipeHelper.addOreDictSmeltingRecipe(new ItemStack(Items.GLOWSTONE_DUST, 1, 0), "oreLite", 0.7f);
		ModRecipeHelper.addOreDictSmeltingRecipe(new ItemStack(Items.GUNPOWDER, 1, 0), "oreExplodeitmite", 0.7f);
		ModRecipeHelper.addOreDictSmeltingRecipe(new ItemStack(Items.PORKCHOP, 1, 0), "oreWantarite", 0.35f);
		ModRecipeHelper.addOreDictSmeltingRecipe(new ItemStack(Items.SKULL, 1, 2), "oreZombieunite", 0.7f);
		ModRecipeHelper.addOreDictSmeltingRecipe(new ItemStack(Items.DYE, 1, 15), "orePaintitwhite", 0.35f);

		ModRecipeHelper.add9xBlockCompressRecipe(BadOres.MODID, "polite", ModBlocks.POLITE_BLOCK, "ingotPolite");
		ModRecipeHelper.add9xBlockCompressRecipe(BadOres.MODID, "crappium", ModBlocks.CRAPPIUM_BLOCK, "ingotCrappium");
		ModRecipeHelper.add9xBlockCompressRecipe(BadOres.MODID, "enderite", ModBlocks.ENDERITE_BLOCK, "ingotEnderite");
		ModRecipeHelper.add9xBlockCompressRecipe(BadOres.MODID, "amadeum", ModBlocks.AMADEUM_BLOCK, "ingotAmadeum");
		ModRecipeHelper.add9xBlockCompressRecipe(BadOres.MODID, "barelygenerite", ModBlocks.BARELYGENERITE_BLOCK,
				"ingotBarelygenerite");
		ModRecipeHelper.add9xBlockCompressRecipe(BadOres.MODID, "copper", ModBlocks.COPPER_BLOCK, "ingotCopper");
		ModRecipeHelper.add9xBlockCompressRecipe(BadOres.MODID, "marmite", ModBlocks.MARMITE_BLOCK, "ingotMarmite");
		ModRecipeHelper.add9xBlockCompressRecipe(BadOres.MODID, "fleesonsite", ModBlocks.FLEESONSITE_BLOCK,
				"ingotFleesonsite");
		ModRecipeHelper.add9xBlockCompressRecipe(BadOres.MODID, "nopium", ModBlocks.NOPIUM_BLOCK, "ingotNopium");
		ModRecipeHelper.add9xBlockCompressRecipe(BadOres.MODID, "nosleeptonite", ModBlocks.NOSLEEPTONITE_BLOCK,
				"ingotNosleeptonite");
		ModRecipeHelper.add9xBlockCompressRecipe(BadOres.MODID, "crashium", ModBlocks.CRASHIUM_BLOCK, "gemCrashium");
		ModRecipeHelper.add9xBlockCompressRecipe(BadOres.MODID, "smite", ModBlocks.SMITE_BLOCK, "gemSmite");
		ModRecipeHelper.add9xBlockCompressRecipe(BadOres.MODID, "diamond", ModBlocks.DIAMOND_BLOCK, "gemDiamondFake");
		ModRecipeHelper.add9xBlockCompressRecipe(BadOres.MODID, "kakkarite", ModBlocks.KAKKARITE_BLOCK, "gemKakkarite");

		ModRecipeHelper.add9xIngotUncompressRecipe(BadOres.MODID, "polite", ModItems.POLITE_INGOT, "blockPolite");
		ModRecipeHelper.add9xIngotUncompressRecipe(BadOres.MODID, "crappium", ModItems.CRAPPIUM_INGOT, "blockCrappium");
		ModRecipeHelper.add9xIngotUncompressRecipe(BadOres.MODID, "enderite", ModItems.ENDERITE_INGOT, "blockEnderite");
		ModRecipeHelper.add9xIngotUncompressRecipe(BadOres.MODID, "amadeum", ModItems.AMADEUM_INGOT, "blockAmadeum");
		ModRecipeHelper.add9xIngotUncompressRecipe(BadOres.MODID, "barelygenerite", ModItems.BARELYGENERITE_INGOT,
				"blockBarelygenerite");
		ModRecipeHelper.add9xIngotUncompressRecipe(BadOres.MODID, "copper", ModItems.COPPER_INGOT, "blockCopper");
		ModRecipeHelper.add9xIngotUncompressRecipe(BadOres.MODID, "marmite", ModItems.MARMITE_INGOT, "blockMarmite");
		ModRecipeHelper.add9xIngotUncompressRecipe(BadOres.MODID, "fleesonsite", ModItems.FLEESONSITE_INGOT,
				"blockFleesonsite");
		ModRecipeHelper.add9xIngotUncompressRecipe(BadOres.MODID, "nopium", ModItems.NOPIUM_INGOT, "blockNopium");
		ModRecipeHelper.add9xIngotUncompressRecipe(BadOres.MODID, "nosleeptonite", ModItems.NOSLEEPTONITE_INGOT,
				"blockNosleeptonite");
		ModRecipeHelper.add9xIngotUncompressRecipe(BadOres.MODID, "crashium", ModItems.CRASHIUM_GEMSTONE,
				"blockCrashium");
		ModRecipeHelper.add9xIngotUncompressRecipe(BadOres.MODID, "smite", ModItems.SMITE_GEMSTONE, "blockSmite");
		ModRecipeHelper.add9xIngotUncompressRecipe(BadOres.MODID, "diamond", ModItems.DIAMOND, "blockDiamondFake");
		ModRecipeHelper.add9xIngotUncompressRecipe(BadOres.MODID, "kakkarite", ModItems.KAKKARITE_GEMSTONE,
				"blockKakkarite");

		ModRecipeHelper.addFullToolRecipe(BadOres.MODID, "polite", new ItemStack(ModItems.POLITE_SWORD),
				new ItemStack(ModItems.POLITE_SHOVEL), new ItemStack(ModItems.POLITE_PICKAXE),
				new ItemStack(ModItems.POLITE_AXE), new ItemStack(ModItems.POLITE_HOE), "stickWood", "ingotPolite");
		ModRecipeHelper.addFullArmorRecipe(BadOres.MODID, "polite", new ItemStack(ModItems.POLITE_HELMET),
				new ItemStack(ModItems.POLITE_CHESTPLATE), new ItemStack(ModItems.POLITE_LEGGINGS),
				new ItemStack(ModItems.POLITE_BOOTS), "ingotPolite");

		ModRecipeHelper.addFullToolRecipe(BadOres.MODID, "crappium", new ItemStack(ModItems.CRAPPIUM_SWORD),
				new ItemStack(ModItems.CRAPPIUM_SHOVEL), new ItemStack(ModItems.CRAPPIUM_PICKAXE),
				new ItemStack(ModItems.CRAPPIUM_AXE), new ItemStack(ModItems.CRAPPIUM_HOE), "stickWood",
				"ingotCrappium");
		ModRecipeHelper.addFullArmorRecipe(BadOres.MODID, "crappium", new ItemStack(ModItems.CRAPPIUM_HELMET),
				new ItemStack(ModItems.CRAPPIUM_CHESTPLATE), new ItemStack(ModItems.CRAPPIUM_LEGGINGS),
				new ItemStack(ModItems.CRAPPIUM_BOOTS), "ingotCrappium");

		ModRecipeHelper.addFullToolRecipe(BadOres.MODID, "enderite", new ItemStack(ModItems.ENDERITE_SWORD),
				new ItemStack(ModItems.ENDERITE_SHOVEL), new ItemStack(ModItems.ENDERITE_PICKAXE),
				new ItemStack(ModItems.ENDERITE_AXE), new ItemStack(ModItems.ENDERITE_HOE), "stickWood",
				"ingotEnderite");
		ModRecipeHelper.addFullArmorRecipe(BadOres.MODID, "enderite", new ItemStack(ModItems.ENDERITE_HELMET),
				new ItemStack(ModItems.ENDERITE_CHESTPLATE), new ItemStack(ModItems.ENDERITE_LEGGINGS),
				new ItemStack(ModItems.ENDERITE_BOOTS), "ingotEnderite");

		ModRecipeHelper.addFullToolRecipe(BadOres.MODID, "amadeum", new ItemStack(ModItems.AMADEUM_SWORD),
				new ItemStack(ModItems.AMADEUM_SHOVEL), new ItemStack(ModItems.AMADEUM_PICKAXE),
				new ItemStack(ModItems.AMADEUM_AXE), new ItemStack(ModItems.AMADEUM_HOE), "stickWood",
				"ingotAmadeum");
		ModRecipeHelper.addFullArmorRecipe(BadOres.MODID, "amadeum", new ItemStack(ModItems.AMADEUM_HELMET),
				new ItemStack(ModItems.AMADEUM_CHESTPLATE), new ItemStack(ModItems.AMADEUM_LEGGINGS),
				new ItemStack(ModItems.AMADEUM_BOOTS), "ingotAmadeum");

		ModRecipeHelper.addFullToolRecipe(BadOres.MODID, "copper", new ItemStack(ModItems.COPPER_SWORD),
				new ItemStack(ModItems.COPPER_SHOVEL), new ItemStack(ModItems.COPPER_PICKAXE),
				new ItemStack(ModItems.COPPER_AXE), new ItemStack(ModItems.COPPER_HOE), "stickWood",
				"ingotCopper");
		ModRecipeHelper.addFullArmorRecipe(BadOres.MODID, "copper", new ItemStack(ModItems.COPPER_HELMET),
				new ItemStack(ModItems.COPPER_CHESTPLATE), new ItemStack(ModItems.COPPER_LEGGINGS),
				new ItemStack(ModItems.COPPER_BOOTS), "ingotCopper");

		ModRecipeHelper.addFullToolRecipe(BadOres.MODID, "nopium", new ItemStack(ModItems.NOPIUM_SWORD),
				new ItemStack(ModItems.NOPIUM_SHOVEL), new ItemStack(ModItems.NOPIUM_PICKAXE),
				new ItemStack(ModItems.NOPIUM_AXE), new ItemStack(ModItems.NOPIUM_HOE), "stickWood",
				"ingotNopium");
		ModRecipeHelper.addFullArmorRecipe(BadOres.MODID, "nopium", new ItemStack(ModItems.NOPIUM_HELMET),
				new ItemStack(ModItems.NOPIUM_CHESTPLATE), new ItemStack(ModItems.NOPIUM_LEGGINGS),
				new ItemStack(ModItems.NOPIUM_BOOTS), "ingotNopium");

		ModRecipeHelper.addFullToolRecipe(BadOres.MODID, "crashium", new ItemStack(ModItems.CRASHIUM_SWORD),
				new ItemStack(ModItems.CRASHIUM_SHOVEL), new ItemStack(ModItems.CRASHIUM_PICKAXE),
				new ItemStack(ModItems.CRASHIUM_AXE), new ItemStack(ModItems.CRASHIUM_HOE), "stickWood",
				"gemCrashium");
		ModRecipeHelper.addFullArmorRecipe(BadOres.MODID, "crashium", new ItemStack(ModItems.CRASHIUM_HELMET),
				new ItemStack(ModItems.CRASHIUM_CHESTPLATE), new ItemStack(ModItems.CRASHIUM_LEGGINGS),
				new ItemStack(ModItems.CRASHIUM_BOOTS), "gemCrashium");

		ModRecipeHelper.addFullToolRecipe(BadOres.MODID, "smite", new ItemStack(ModItems.SMITE_SWORD),
				new ItemStack(ModItems.SMITE_SHOVEL), new ItemStack(ModItems.SMITE_PICKAXE),
				new ItemStack(ModItems.SMITE_AXE), new ItemStack(ModItems.SMITE_HOE), "stickWood",
				"gemSmite");
		ModRecipeHelper.addFullArmorRecipe(BadOres.MODID, "smite", new ItemStack(ModItems.SMITE_HELMET),
				new ItemStack(ModItems.SMITE_CHESTPLATE), new ItemStack(ModItems.SMITE_LEGGINGS),
				new ItemStack(ModItems.SMITE_BOOTS), "gemSmite");

		ModRecipeHelper.addFullToolRecipe(BadOres.MODID, "diamond", new ItemStack(ModItems.DIAMOND_SWORD),
				new ItemStack(ModItems.DIAMOND_SHOVEL), new ItemStack(ModItems.DIAMOND_PICKAXE),
				new ItemStack(ModItems.DIAMOND_AXE), new ItemStack(ModItems.DIAMOND_HOE), "stickWood",
				"gemDiamondFake");
		ModRecipeHelper.addFullArmorRecipe(BadOres.MODID, "diamond", new ItemStack(ModItems.DIAMOND_HELMET),
				new ItemStack(ModItems.DIAMOND_CHESTPLATE), new ItemStack(ModItems.DIAMOND_LEGGINGS),
				new ItemStack(ModItems.DIAMOND_BOOTS), "gemDiamondFake");

		GameRegistry.addShapelessRecipe(new ResourceLocation(BadOres.MODID, "marmite_bread"), null,
				new ItemStack(ModItems.MARMITE_BREAD, 1, 0), Ingredient.fromItem(Items.BREAD),
				Ingredient.fromItem(ModItems.MARMITE_INGOT));

	}
}