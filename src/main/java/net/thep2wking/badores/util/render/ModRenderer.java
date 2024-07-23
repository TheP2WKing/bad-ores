package net.thep2wking.badores.util.render;

import net.thep2wking.badores.content.entities.EntityFleesonsite;
import net.thep2wking.badores.content.entities.EntityNosleeptonite;
import net.thep2wking.badores.util.render.fleesonite.RenderFleesonsite;
import net.thep2wking.badores.util.render.nosleeptonite.RenderNosleeptonite;
import net.thep2wking.oedldoedlcore.util.ModRenderHelper;

public class ModRenderer {
	public static void registerEntityRender() {
		ModRenderHelper.addEntityRender(EntityFleesonsite.class, RenderFleesonsite.FACTORY);
		ModRenderHelper.addEntityRender(EntityNosleeptonite.class, RenderNosleeptonite.FACTORY);
	}
}