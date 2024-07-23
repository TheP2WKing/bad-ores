package net.thep2wking.badores.content.entities;

import javax.annotation.Nullable;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.thep2wking.badores.BadOres;
import net.thep2wking.badores.init.ModBlocks;
import net.thep2wking.badores.init.ModSounds;

public class EntityFleesonsite extends EntityCreature {
	public static final ResourceLocation LOOT_TABLE = new ResourceLocation(BadOres.MODID, "entities/fleesonsite");
	public static final int EXPERIENCE_VALUE = 5;

	public EntityFleesonsite(World world) {
		super(world);
		setSize(1.0f, 1.0f);
		this.experienceValue = EXPERIENCE_VALUE;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void initEntityAI() {
		super.initEntityAI();
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIPanic(this, 1.33D));
		this.tasks.addTask(2, new EntityAIAvoidEntity(this, EntityPlayer.class, 16.0F, 0.8D, 1.33D));
		this.tasks.addTask(3, new EntityAIWander(this, 0.8D));
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
		return SoundCategory.NEUTRAL;
	}

	@Override
	public void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10.0);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.4);
	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		if (!world.isRemote && ticksExisted % 10 == 0) {
			if (world.getClosestPlayer(posX, posY, posZ, 10.0, false) == null) {
				world.setBlockState(
						new BlockPos(MathHelper.floor(posX), MathHelper.floor(posY), MathHelper.floor(posZ)),
						ModBlocks.FLEESONSITE_ORE.getDefaultState(), 3);
				world.playSound(null, MathHelper.floor(posX), MathHelper.floor(posY), MathHelper.floor(posZ),
						SoundEvents.ENTITY_CHICKEN_EGG, SoundCategory.BLOCKS, 1.0f, 0.5f);
				setDead();
			}
		}
	}

	@Override
	@Nullable
	public SoundEvent getAmbientSound() {
		return ModSounds.FLEESONSITE_IDLE;
	}

	@Override
	@Nullable
	public SoundEvent getHurtSound(DamageSource damageSourceIn) {
		return ModSounds.FLEESONSITE_HURT;
	}

	@Override
	@Nullable
	public SoundEvent getDeathSound() {
		return ModSounds.FLEESONSITE_DEATH;
	}
}