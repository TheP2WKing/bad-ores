package net.thep2wking.badores.init;

import net.thep2wking.badores.BadOres;
import net.thep2wking.badores.content.entity.EntityFleesonsite;
import net.thep2wking.badores.content.entity.EntityNosleeptonite;
import net.thep2wking.oedldoedlcore.util.ModLogger;
import net.thep2wking.oedldoedlcore.util.ModRegistryHelper;

public class ModEntities {
	public static void registerEntities() {
		ModLogger.registeredEntitiesLogger(BadOres.MODID);

		ModRegistryHelper.registerEntityWithSpawnEgg(BadOres.MODID, "fleesonsite", BadOres.INSTANCE, 0, EntityFleesonsite.class, 64, 3, true, 0x797979, 0x25c8d1);
		ModRegistryHelper.registerEntityWithSpawnEgg(BadOres.MODID, "nosleeptonite", BadOres.INSTANCE, 1, EntityNosleeptonite.class, 64, 3, true, 0x797979, 0xa33323);
	}
}