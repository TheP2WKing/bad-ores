package net.thep2wking.badores.config;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.thep2wking.badores.BadOres;
import net.thep2wking.badores.config.categories.Events;
import net.thep2wking.badores.config.categories.Integration;
import net.thep2wking.badores.config.categories.World;

@Config(modid = BadOres.MODID, name = BadOres.MODID, category = BadOres.MODID)
public class BadOresConfig {
	@Config.Name("world")
	public static final World WORLD = new World();

	@Config.Name("events")
	public static final Events EVENTS = new Events();

	@Config.Name("integration")
	public static final Integration INTEGRATION = new Integration();

	@Mod.EventBusSubscriber
	public static class ConfigHolder {
		@SubscribeEvent
		public static void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
			if (event.getModID().equals(BadOres.MODID)) {
				ConfigManager.sync(BadOres.MODID, Config.Type.INSTANCE);
			}
		}
	}
}