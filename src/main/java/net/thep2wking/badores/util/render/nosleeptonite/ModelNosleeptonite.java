package net.thep2wking.badores.util.render.nosleeptonite;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelNosleeptonite extends ModelBase {
	ModelRenderer bottom;
	ModelRenderer top;
	ModelRenderer mouthbottom;
	ModelRenderer mouthtop;
	ModelRenderer teethbottom1;
	ModelRenderer teethbottom2;
	ModelRenderer teethbottom3;
	ModelRenderer teethtop1;
	ModelRenderer teethtop2;
	ModelRenderer teethtop3;

	public ModelNosleeptonite() {
		textureWidth = 128;
		textureHeight = 64;

		bottom = new ModelRenderer(this, 0, 0);
		bottom.addBox(-8F, 0F, -14F, 16, 8, 16);
		bottom.setRotationPoint(0F, 16F, 6F);
		bottom.setTextureSize(128, 64);
		bottom.mirror = true;
		setRotation(bottom, 0.6320361F, 0F, 0F);
		top = new ModelRenderer(this, 0, 25);
		top.addBox(-8F, -8F, -14F, 16, 8, 16);
		top.setRotationPoint(0F, 16F, 6F);
		top.setTextureSize(128, 64);
		top.mirror = true;
		setRotation(top, -0.6320364F, 0F, 0F);
		mouthbottom = new ModelRenderer(this, 65, 0);
		mouthbottom.addBox(-7.5F, -2F, -13.5F, 15, 2, 15);
		mouthbottom.setRotationPoint(0F, 16F, 6F);
		mouthbottom.setTextureSize(128, 64);
		mouthbottom.mirror = true;
		setRotation(mouthbottom, 0.6320361F, 0F, 0F);
		mouthtop = new ModelRenderer(this, 65, 18);
		mouthtop.addBox(-7.5F, 0F, -13.5F, 15, 2, 15);
		mouthtop.setRotationPoint(0F, 16F, 6F);
		mouthtop.setTextureSize(128, 64);
		mouthtop.mirror = true;
		setRotation(mouthtop, -0.6320361F, 0F, 0F);
		teethbottom1 = new ModelRenderer(this, 65, 36);
		teethbottom1.addBox(-7F, -6F, -13F, 14, 5, 0);
		teethbottom1.setRotationPoint(0F, 16F, 6F);
		teethbottom1.setTextureSize(128, 64);
		teethbottom1.mirror = true;
		setRotation(teethbottom1, 0.7435719F, 0F, 0F);
		teethbottom2 = new ModelRenderer(this, 65, 28);
		teethbottom2.addBox(0F, -5F, -13F, 0, 5, 14);
		teethbottom2.setRotationPoint(-7F, 16F, 6F);
		teethbottom2.setTextureSize(128, 64);
		teethbottom2.mirror = true;
		setRotation(teethbottom2, 0.7063933F, 0.1115358F, -0.1487144F);
		teethbottom3 = new ModelRenderer(this, 65, 34);
		teethbottom3.addBox(0F, -5F, -13F, 0, 5, 14);
		teethbottom3.setRotationPoint(7F, 16F, 6F);
		teethbottom3.setTextureSize(128, 64);
		teethbottom3.mirror = true;
		setRotation(teethbottom3, 0.7063933F, -0.111544F, 0.1487195F);
		teethtop1 = new ModelRenderer(this, 95, 36);
		teethtop1.addBox(-7F, -1F, -13F, 14, 5, 0);
		teethtop1.setRotationPoint(0F, 16F, 6F);
		teethtop1.setTextureSize(128, 64);
		teethtop1.mirror = true;
		setRotation(teethtop1, -0.5576789F, 0F, 0F);
		teethtop2 = new ModelRenderer(this, 95, 28);
		teethtop2.addBox(0F, 0F, -13F, 0, 5, 14);
		teethtop2.setRotationPoint(-7F, 16F, 6F);
		teethtop2.setTextureSize(128, 64);
		teethtop2.mirror = true;
		setRotation(teethtop2, -0.6320361F, -0.1115358F, -0.1858931F);
		teethtop3 = new ModelRenderer(this, 95, 34);
		teethtop3.addBox(0F, 0F, -13F, 0, 5, 14);
		teethtop3.setRotationPoint(7F, 16F, 6F);
		teethtop3.setTextureSize(128, 64);
		teethtop3.mirror = true;
		setRotation(teethtop3, -0.6320361F, 0.111544F, 0.185895F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		bottom.render(f5);
		top.render(f5);
		mouthbottom.render(f5);
		mouthtop.render(f5);
		teethbottom1.render(f5);
		teethbottom2.render(f5);
		teethbottom3.render(f5);
		teethtop1.render(f5);
		teethtop2.render(f5);
		teethtop3.render(f5);
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
		mouthbottom.rotateAngleX = MathHelper.cos(par1 * 0.04F) * 50.0F * par2;
		mouthtop.rotateAngleX = -mouthbottom.rotateAngleX;
		bottom.rotateAngleX = mouthbottom.rotateAngleX;
		teethbottom1.rotateAngleX = mouthbottom.rotateAngleX;
		teethbottom2.rotateAngleX = mouthbottom.rotateAngleX;
		teethbottom3.rotateAngleX = mouthbottom.rotateAngleX;
		top.rotateAngleX = mouthtop.rotateAngleX;
		teethtop1.rotateAngleX = mouthtop.rotateAngleX;
		teethtop2.rotateAngleX = mouthtop.rotateAngleX;
		teethtop3.rotateAngleX = mouthtop.rotateAngleX;
	}
}