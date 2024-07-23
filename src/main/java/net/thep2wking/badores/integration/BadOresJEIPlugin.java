package net.thep2wking.badores.integration;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.IModRegistry;
import net.minecraft.block.Block;
import net.minecraft.client.resources.I18n;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Loader;
import net.thep2wking.badores.BadOres;
import net.thep2wking.badores.config.BadOresConfig;
import net.thep2wking.badores.init.ModBlocks;
import net.thep2wking.oedldoedlcore.util.ModLogger;

@mezz.jei.api.JEIPlugin
public class BadOresJEIPlugin implements IModPlugin {
	@Override
	public void register(IModRegistry registry) {
		if (Loader.isModLoaded("jei")) {
			ModLogger.registeredIntegration("JEI", BadOres.MODID);
		}

		addDesc(registry, ModBlocks.POLITE_ORE, "polite");
		addDesc(registry, ModBlocks.WANNAFITE_ORE, "wannafite");
		addDesc(registry, ModBlocks.BREAKIUM_ORE, "breakium");
		addDesc(registry, ModBlocks.CRASHIUM_ORE, "crashium");
		addDesc(registry, ModBlocks.STONIUM_ORE, "stonium");
		addDesc(registry, ModBlocks.CRAPPIUM_ORE, "crappium");
		addDesc(registry, ModBlocks.ENDERITE_ORE, "enderite");
		addDesc(registry, ModBlocks.WEBSITE_ORE, "website");
		addDesc(registry, ModBlocks.LITE_ORE, "lite");
		addDesc(registry, ModBlocks.MISLEADIUM_ORE, "misleadium");
		addDesc(registry, ModBlocks.GHOSTIUM_ORE, "ghostium");
		addDesc(registry, ModBlocks.AMADEUM_ORE, "amadeum");
		addDesc(registry, ModBlocks.BARELYGENERITE_ORE, "barelygenerite");
		addDesc(registry, ModBlocks.UNOBTAINIUM_ORE, "unobtainium");
		addDesc(registry, ModBlocks.COPPER_ORE, "copper_ore");
		addDesc(registry, ModBlocks.USELESSIUM_ORE, "uselessium");
		addDesc(registry, ModBlocks.KILLIUM_ORE, "killium");
		addDesc(registry, ModBlocks.MOVIUM_ORE, "movium");
		addDesc(registry, ModBlocks.BALANCIUM_ORE, "balancium");
		addDesc(registry, ModBlocks.EXPLODEITMITE_ORE, "explodeitmite");
		addDesc(registry, ModBlocks.MARMITE_ORE, "marmite");
		addDesc(registry, ModBlocks.SHIFTIUM_ORE, "shiftium");
		addDesc(registry, ModBlocks.SMITE_ORE, "smite");
		addDesc(registry, ModBlocks.WANTARITE_ORE, "wantarite");
		addDesc(registry, ModBlocks.IDLIKEABITE_ORE, "idlikeabite");
		addDesc(registry, ModBlocks.METEORITE_ORE, "meteorite");
		addDesc(registry, ModBlocks.STREETSCUM_ORE, "streetscum");
		addDesc(registry, ModBlocks.FLEESONSITE_ORE, "fleesonsite");
		addDesc(registry, ModBlocks.NOPIUM_ORE, "nopium");
		addDesc(registry, ModBlocks.ZOMBIEUNITE_ORE, "zombieunite");
		addDesc(registry, ModBlocks.PAINTITWHITE_ORE, "paintitwhite");
		addDesc(registry, ModBlocks.IWONTFITE_ORE, "iwontfite");
		addDesc(registry, ModBlocks.DIAMOND_ORE, "diamond_ore");
		addDesc(registry, ModBlocks.TAUNTUM_ORE, "tauntum");
		addDesc(registry, ModBlocks.KAKKARITE_ORE, "kakkarite");
		addDesc(registry, ModBlocks.PANDAEMONIUM_ORE, "pandaemonium");
		addDesc(registry, ModBlocks.NOSLEEPTONITE_ORE, "nosleeptonite");
		addDesc(registry, ModBlocks.APPETITE_ORE, "appetite");
	}

	@SuppressWarnings("deprecation")
	public static void addDesc(IModRegistry registry, Block block, String name) {
		if (BadOresConfig.INTEGRATION.JEI_INTEGRATION) {
			registry.addIngredientInfo(new ItemStack(block), ItemStack.class,
					I18n.format("tile." + BadOres.MODID + "." + name + ".jei"));
		}
	}
}