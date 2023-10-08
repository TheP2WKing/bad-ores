package net.thep2wking.badores.content.entities;

import javax.annotation.Nullable;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.thep2wking.badores.init.ModBlocks;
import net.thep2wking.badores.init.ModSounds;

public class EntityNosleeptonite extends EntityMob {
	@SuppressWarnings("all")
	public EntityNosleeptonite(World world) {
		super(world);
		experienceValue = 4;
		setSize(1.0f, 1.0f);
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIAttackMelee(this, 1.0D, false));
		this.tasks.addTask(2, new EntityAIWander(this, 0.8D));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
	}

	@Override
	public boolean isAIDisabled() {
		return false;
	}

	@Override
	public boolean isMovementBlocked() {
		return false;
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(40.0D);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(5.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(15.0);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.4);
	}

	@Override
	protected void dropFewItems(boolean par1, int par2) {
		entityDropItem(new ItemStack(ModBlocks.NOSLEEPTONITE, 1, 0), 0.5f);
	}

	@Override
	public ItemStack getHeldItem(EnumHand hand) {
		return ItemStack.EMPTY;
	}

	@Override
	public ItemStack getItemStackFromSlot(EntityEquipmentSlot slotIn) {
		return ItemStack.EMPTY;
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
