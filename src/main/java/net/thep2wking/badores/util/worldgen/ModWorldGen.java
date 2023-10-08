package net.thep2wking.badores.util.worldgen;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.thep2wking.badores.BadOres;
import net.thep2wking.reloadedlib.util.ModLogger;

public class ModWorldGen {
	public static void registerModWorldGen() {
		ModLogger.registeredWorldGenLogger(BadOres.MODID);

		GameRegistry.registerWorldGenerator(new WorldGenOverworldOres(), 1);
	}
}
