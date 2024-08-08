package net.thep2wking.badores.util.render.fleesonite;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.badores.BadOres;
import net.thep2wking.badores.content.entity.EntityFleesonsite;

@SideOnly(Side.CLIENT)
public class RenderFleesonsite extends RenderLiving<EntityFleesonsite> {
	public static final ResourceLocation TEXTURE = new ResourceLocation(BadOres.MODID,
			"textures/entity/fleesonsite.png");

	public RenderFleesonsite(RenderManager renderManagerIn) {
		super(renderManagerIn, new ModelFleesonite(), 0.75f);
	}

	@Override
	public ResourceLocation getEntityTexture(EntityFleesonsite entity) {
		return TEXTURE;
	}

	public static final RenderFleesonsite.Factory FACTORY = new RenderFleesonsite.Factory();

	public static class Factory implements IRenderFactory<EntityFleesonsite> {
		@Override
		public Render<? super EntityFleesonsite> createRenderFor(RenderManager manager) {
			return new RenderFleesonsite(manager);
		}
	}
}