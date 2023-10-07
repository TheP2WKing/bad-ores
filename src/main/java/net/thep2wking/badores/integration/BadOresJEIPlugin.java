package net.thep2wking.badores.integration;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.IModRegistry;
import net.minecraft.block.Block;
import net.minecraft.client.resources.I18n;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Loader;
import net.thep2wking.badores.BadOres;
import net.thep2wking.badores.init.ModBlocks;
import net.thep2wking.reloadedlib.util.ModLogger;

@mezz.jei.api.JEIPlugin
public class BadOresJEIPlugin implements IModPlugin {
	@Override
	public void register(IModRegistry registry) {
		if (Loader.isModLoaded("jei")) {
			ModLogger.registeredIntegration("JEI", BadOres.MODID);
		}

		addDesc(registry, ModBlocks.POLITE, "polite");
		addDesc(registry, ModBlocks.WANNAFITE, "wannafite");
		addDesc(registry, ModBlocks.BREAKIUM, "breakium");
		addDesc(registry, ModBlocks.CRASHIUM, "crashium");
		addDesc(registry, ModBlocks.STONIUM, "stonium");
		addDesc(registry, ModBlocks.CRAPPIUM, "crappium");
		addDesc(registry, ModBlocks.ENDERITE, "enderite");
		addDesc(registry, ModBlocks.WEBSITE, "website");
		addDesc(registry, ModBlocks.LITE, "lite");
		addDesc(registry, ModBlocks.MISLEADIUM, "misleadium");
		addDesc(registry, ModBlocks.GHOSTIUM, "ghostium");
		addDesc(registry, ModBlocks.AMADEUM, "amadeum");
		addDesc(registry, ModBlocks.BARELYGENERITE, "barelygenerite");
		addDesc(registry, ModBlocks.UNOBTAINIUM, "unobtainium");
		addDesc(registry, ModBlocks.COPPER_ORE, "copper_ore");
		addDesc(registry, ModBlocks.USELESSIUM, "uselessium");
		addDesc(registry, ModBlocks.KILLIUM, "killium");
		addDesc(registry, ModBlocks.MOVIUM, "movium");
		addDesc(registry, ModBlocks.BALANCIUM, "balancium");
		addDesc(registry, ModBlocks.EXPLODEITMITE, "explodeitmite");
		addDesc(registry, ModBlocks.MARMITE, "marmite");
		addDesc(registry, ModBlocks.SHIFTIUM, "shiftium");
		addDesc(registry, ModBlocks.SMITE, "smite");
		addDesc(registry, ModBlocks.WANTARITE, "wantarite");
		addDesc(registry, ModBlocks.IDLIKEABITE, "idlikeabite");
		addDesc(registry, ModBlocks.METEORITE, "meteorite");
		addDesc(registry, ModBlocks.STREETSCUM, "streetscum");
		addDesc(registry, ModBlocks.FLEESONSITE, "fleesonsite");
		addDesc(registry, ModBlocks.NOPIUM, "nopium");
		addDesc(registry, ModBlocks.ZOMBIEUNITE, "zombieunite");
		addDesc(registry, ModBlocks.PAINTITWHITE, "paintitwhite");
		addDesc(registry, ModBlocks.IWONTFITE, "iwontfite");
		addDesc(registry, ModBlocks.DIAMOND_ORE, "diamond_ore");
		addDesc(registry, ModBlocks.TAUNTUM, "tauntum");
		addDesc(registry, ModBlocks.KAKKARITE, "kakkarite");
		addDesc(registry, ModBlocks.PANDAEMONIUM, "pandaemonium");
		addDesc(registry, ModBlocks.NOSLEEPTONITE, "nosleeptonite");
		addDesc(registry, ModBlocks.APPETITE, "appetite");
	}

	@SuppressWarnings("deprecation")
	public static void addDesc(IModRegistry registry, Block block, String name) {
		registry.addIngredientInfo(new ItemStack(block), ItemStack.class,
				I18n.format("tile." + BadOres.MODID + "." + name + ".jei"));
	}
}