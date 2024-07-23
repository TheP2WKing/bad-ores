package net.thep2wking.badores.integration;

import jeresources.api.IJERAPI;
import jeresources.api.conditionals.LightLevel;
import net.minecraftforge.fml.common.Loader;
import net.thep2wking.badores.BadOres;
import net.thep2wking.badores.config.BadOresConfig;
import net.thep2wking.badores.content.entities.EntityFleesonsite;
import net.thep2wking.badores.content.entities.EntityNosleeptonite;
import net.thep2wking.oedldoedlcore.util.ModLogger;

public class BadOresJERPlugin {
	@jeresources.api.JERPlugin
	public static IJERAPI api;

	public static void register() {
		if (api == null) {
			return;
		}

		if (Loader.isModLoaded("jeresources")) {
			ModLogger.registeredIntegration("JER", BadOres.MODID);
		}

		if (BadOresConfig.INTEGRATION.JER_INTEGRATION) {
			api.getMobRegistry().register(new EntityFleesonsite(api.getWorld()), LightLevel.any,
					EntityFleesonsite.EXPERIENCE_VALUE, EntityFleesonsite.LOOT_TABLE);
			api.getMobRegistry().register(new EntityNosleeptonite(api.getWorld()), LightLevel.any,
					EntityNosleeptonite.EXPERIENCE_VALUE, EntityNosleeptonite.LOOT_TABLE);
		}
	}

	public static void registerJERPlugin() {
		if (Loader.isModLoaded("jeresources")) {
			BadOresJERPlugin.register();
		}
	}
}