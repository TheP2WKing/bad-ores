package net.thep2wking.badores.integration.jei;

import mezz.jei.api.IModRegistry;
import mezz.jei.api.JEIPlugin;
import net.thep2wking.badores.BadOres;
import net.thep2wking.badores.config.BadOresConfig;
import net.thep2wking.badores.init.ModBlocks;
import net.thep2wking.oedldoedlcore.api.integration.ModJEIPluginBase;

@JEIPlugin
public class BadOresJEIPlugin extends ModJEIPluginBase {
	@Override
	public String getModId() {
		return BadOres.MODID;
	}

	@Override
	public void register(IModRegistry registry) {
		if (BadOresConfig.INTEGRATION.JEI_INTEGRATION) {
			super.register(registry);

			addBlockInfo(registry, ModBlocks.POLITE_ORE, "polite");
			addBlockInfo(registry, ModBlocks.WANNAFITE_ORE, "wannafite");
			addBlockInfo(registry, ModBlocks.BREAKIUM_ORE, "breakium");
			addBlockInfo(registry, ModBlocks.CRASHIUM_ORE, "crashium");
			addBlockInfo(registry, ModBlocks.STONIUM_ORE, "stonium");
			addBlockInfo(registry, ModBlocks.CRAPPIUM_ORE, "crappium");
			addBlockInfo(registry, ModBlocks.ENDERITE_ORE, "enderite");
			addBlockInfo(registry, ModBlocks.WEBSITE_ORE, "website");
			addBlockInfo(registry, ModBlocks.LITE_ORE, "lite");
			addBlockInfo(registry, ModBlocks.MISLEADIUM_ORE, "misleadium");
			addBlockInfo(registry, ModBlocks.GHOSTIUM_ORE, "ghostium");
			addBlockInfo(registry, ModBlocks.AMADEUM_ORE, "amadeum");
			addBlockInfo(registry, ModBlocks.BARELYGENERITE_ORE, "barelygenerite");
			addBlockInfo(registry, ModBlocks.UNOBTAINIUM_ORE, "unobtainium");
			addBlockInfo(registry, ModBlocks.COPPER_ORE, "copper_ore");
			addBlockInfo(registry, ModBlocks.USELESSIUM_ORE, "uselessium");
			addBlockInfo(registry, ModBlocks.KILLIUM_ORE, "killium");
			addBlockInfo(registry, ModBlocks.MOVIUM_ORE, "movium");
			addBlockInfo(registry, ModBlocks.BALANCIUM_ORE, "balancium");
			addBlockInfo(registry, ModBlocks.EXPLODEITMITE_ORE, "explodeitmite");
			addBlockInfo(registry, ModBlocks.MARMITE_ORE, "marmite");
			addBlockInfo(registry, ModBlocks.SHIFTIUM_ORE, "shiftium");
			addBlockInfo(registry, ModBlocks.SMITE_ORE, "smite");
			addBlockInfo(registry, ModBlocks.WANTARITE_ORE, "wantarite");
			addBlockInfo(registry, ModBlocks.IDLIKEABITE_ORE, "idlikeabite");
			addBlockInfo(registry, ModBlocks.METEORITE_ORE, "meteorite");
			addBlockInfo(registry, ModBlocks.STREETSCUM_ORE, "streetscum");
			addBlockInfo(registry, ModBlocks.FLEESONSITE_ORE, "fleesonsite");
			addBlockInfo(registry, ModBlocks.NOPIUM_ORE, "nopium");
			addBlockInfo(registry, ModBlocks.ZOMBIEUNITE_ORE, "zombieunite");
			addBlockInfo(registry, ModBlocks.PAINTITWHITE_ORE, "paintitwhite");
			addBlockInfo(registry, ModBlocks.IWONTFITE_ORE, "iwontfite");
			addBlockInfo(registry, ModBlocks.DIAMOND_ORE, "diamond_ore");
			addBlockInfo(registry, ModBlocks.TAUNTUM_ORE, "tauntum");
			addBlockInfo(registry, ModBlocks.KAKKARITE_ORE, "kakkarite");
			addBlockInfo(registry, ModBlocks.PANDAEMONIUM_ORE, "pandaemonium");
			addBlockInfo(registry, ModBlocks.NOSLEEPTONITE_ORE, "nosleeptonite");
			addBlockInfo(registry, ModBlocks.APPETITE_ORE, "appetite");
		}
	}
}