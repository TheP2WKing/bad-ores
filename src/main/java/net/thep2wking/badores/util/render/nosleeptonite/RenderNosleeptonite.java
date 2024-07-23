package net.thep2wking.badores.util.render.nosleeptonite;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.badores.BadOres;
import net.thep2wking.badores.content.entities.EntityNosleeptonite;

@SideOnly(Side.CLIENT)
public class RenderNosleeptonite extends RenderLiving<EntityNosleeptonite> {
	public static final ResourceLocation TEXTURE = new ResourceLocation(BadOres.MODID,
			"textures/entity/nosleeptonite.png");

	public RenderNosleeptonite(RenderManager renderManagerIn) {
		super(renderManagerIn, new ModelNosleeptonite(), 0.75f);
	}

	@Override
	public ResourceLocation getEntityTexture(EntityNosleeptonite entity) {
		return TEXTURE;
	}

	public static final RenderNosleeptonite.Factory FACTORY = new RenderNosleeptonite.Factory();

	public static class Factory implements IRenderFactory<EntityNosleeptonite> {
		@Override
		public Render<? super EntityNosleeptonite> createRenderFor(RenderManager manager) {
			return new RenderNosleeptonite(manager);
		}
	}
}