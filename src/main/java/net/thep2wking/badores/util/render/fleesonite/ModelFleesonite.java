package net.thep2wking.badores.util.render.fleesonite;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelFleesonite extends ModelBase {
	ModelRenderer block;
	ModelRenderer footright;
	ModelRenderer toeright1;
	ModelRenderer toeright2;
	ModelRenderer toeright3;
	ModelRenderer footleft;
	ModelRenderer toeleft1;
	ModelRenderer toeleft2;
	ModelRenderer toeleft3;

	public ModelFleesonite() {
		textureWidth = 128;
		textureHeight = 64;

		block = new ModelRenderer(this, 0, 0);
		block.addBox(-8F, 0F, -6F, 16, 16, 16);
		block.setRotationPoint(0F, 5F, 0F);
		block.setTextureSize(128, 64);
		block.mirror = true;
		setRotation(block, -0.1115327F, 0F, 0F);
		footright = new ModelRenderer(this, 0, 33);
		footright.addBox(-3F, 0F, -3F, 6, 4, 6);
		footright.setRotationPoint(-4F, 20F, 0F);
		footright.setTextureSize(128, 64);
		footright.mirror = true;
		setRotation(footright, 0F, 0.37179F, 0F);
		toeright1 = new ModelRenderer(this, 0, 44);
		toeright1.addBox(-1.5F, 0F, -8F, 4, 4, 7);
		toeright1.setRotationPoint(-4F, 20F, 0F);
		toeright1.setTextureSize(128, 64);
		toeright1.mirror = true;
		setRotation(toeright1, 0.2230717F, 0.0720852F, 0F);
		toeright2 = new ModelRenderer(this, 70, 0);
		toeright2.addBox(-2F, 0.5F, -7.5F, 3, 3, 5);
		toeright2.setRotationPoint(-4F, 20F, 0F);
		toeright2.setTextureSize(128, 64);
		toeright2.mirror = true;
		setRotation(toeright2, 0.2230705F, 0.481055F, 0F);
		toeright3 = new ModelRenderer(this, 70, 9);
		toeright3.addBox(-2.5F, 0.5F, -6F, 3, 3, 5);
		toeright3.setRotationPoint(-4F, 20F, 0F);
		toeright3.setTextureSize(128, 64);
		toeright3.mirror = true;
		setRotation(toeright3, 0.2230705F, 0.9666439F, 0F);
		footleft = new ModelRenderer(this, 25, 33);
		footleft.addBox(-3F, 0F, -3F, 6, 4, 6);
		footleft.setRotationPoint(4F, 20F, 0F);
		footleft.setTextureSize(128, 64);
		footleft.mirror = true;
		setRotation(footleft, 0F, -0.3717931F, 0F);
		toeleft1 = new ModelRenderer(this, 25, 44);
		toeleft1.addBox(-2.5F, 0F, -8F, 4, 4, 7);
		toeleft1.setRotationPoint(4F, 20F, 0F);
		toeleft1.setTextureSize(128, 64);
		toeleft1.mirror = true;
		setRotation(toeleft1, 0.2230717F, -0.0720821F, 0F);
		toeleft2 = new ModelRenderer(this, 90, 0);
		toeleft2.addBox(-1F, 0.5F, -7.5F, 3, 3, 5);
		toeleft2.setRotationPoint(4F, 20F, 0F);
		toeleft2.setTextureSize(128, 64);
		toeleft2.mirror = true;
		setRotation(toeleft2, 0.2230705F, -0.4810476F, 0F);
		toeleft3 = new ModelRenderer(this, 90, 9);
		toeleft3.addBox(-0.5F, 0.5F, -6F, 3, 3, 5);
		toeleft3.setRotationPoint(4F, 20F, 0F);
		toeleft3.setTextureSize(128, 64);
		toeleft3.mirror = true;
		setRotation(toeleft3, 0.2230705F, -0.9666506F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		block.render(f5);
		footright.render(f5);
		toeright1.render(f5);
		toeright2.render(f5);
		toeright3.render(f5);
		footleft.render(f5);
		toeleft1.render(f5);
		toeleft2.render(f5);
		toeleft3.render(f5);
	}

	public void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6,
			Entity par7Entity) {
		super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
		block.setRotationPoint(0F, 5F + MathHelper.cos(par1 * 1.4F) * 2.5F * par2, 0F);
		this.footright.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		this.toeright1.rotateAngleX = this.footright.rotateAngleX;
		this.toeright2.rotateAngleX = this.footright.rotateAngleX;
		this.toeright3.rotateAngleX = this.footright.rotateAngleX;
		this.footleft.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float) Math.PI) * 1.4F * par2;
		this.toeleft1.rotateAngleX = this.footleft.rotateAngleX;
		this.toeleft2.rotateAngleX = this.footleft.rotateAngleX;
		this.toeleft3.rotateAngleX = this.footleft.rotateAngleX;
	}
}