package net.thep2wking.badores.content.entity;

import javax.annotation.Nullable;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.thep2wking.badores.BadOres;
import net.thep2wking.badores.init.ModSounds;

public class EntityNosleeptonite extends EntityMob {
	public static final ResourceLocation LOOT_TABLE = new ResourceLocation(BadOres.MODID, "entities/nosleeptonite");
	public static final int EXPERIENCE_VALUE = 20;

	public EntityNosleeptonite(World world) {
		super(world);
		setSize(1.0f, 1.0f);
		this.experienceValue = EXPERIENCE_VALUE;
		this.stepHeight = 1.0f;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void initEntityAI() {
		super.initEntityAI();
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIAttackMelee(this, 1.0D, false));
		this.tasks.addTask(2, new EntityAIWander(this, 0.8D));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
	}

	@Override
	@Nullable
	public ResourceLocation getLootTable() {
		return LOOT_TABLE;
	}

	@Override
	public boolean canPickUpLoot() {
		return false;
	}

	@Override
	public SoundCategory getSoundCategory() {
		return SoundCategory.HOSTILE;
	}

	@Override
	public void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(40.0D);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(5.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(15.0);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.4);
	}

	@Override
	@Nullable
	public SoundEvent getAmbientSound() {
		return ModSounds.NOSLEEPTONITE_IDLE;
	}

	@Override
	@Nullable
	public SoundEvent getHurtSound(DamageSource damageSourceIn) {
		return ModSounds.NOSLEEPTONITE_HURT;
	}

	@Override
	@Nullable
	public SoundEvent getDeathSound() {
		return ModSounds.NOSLEEPTONITE_DEATH;
	}
}