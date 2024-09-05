package net.thep2wking.badores.util.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.thep2wking.badores.integration.jer.BadOresJERPlugin;
import net.thep2wking.badores.util.render.ModRenderer;
import net.thep2wking.oedldoedlcore.api.integration.ModJERPluginBase;

public class ClientProxy extends CommonProxy {
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
		ModRenderer.registerEntityRender();
	}

	public void init(FMLInitializationEvent event) {
		super.init(event);
		ModJERPluginBase.registerPlugin(new BadOresJERPlugin());
	}

	public void postInit(FMLPostInitializationEvent event) {
		super.postInit(event);
	}
}