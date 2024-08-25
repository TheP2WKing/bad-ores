package net.thep2wking.badores.util.proxy;

import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.thep2wking.badores.BadOres;
import net.thep2wking.badores.integration.top.TOPCompatibility;
import net.thep2wking.oedldoedlcore.util.ModLogger;

public class CommonProxy {
	public void preInit(FMLPreInitializationEvent event) {
	}

	public void init(FMLInitializationEvent event) {
		if (Loader.isModLoaded("theoneprobe")) {
			ModLogger.registeredIntegration("TheOneProbe", BadOres.MODID);
			TOPCompatibility.register();
		}
	}

	public void postInit(FMLPostInitializationEvent event) {
	}
}