package net.thep2wking.badores.content.block;

import java.util.Random;

import javax.annotation.Nullable;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.thep2wking.badores.config.BadOresConfig;
import net.thep2wking.badores.content.entities.EntityNosleeptonite;
import net.thep2wking.badores.init.ModSounds;
import net.thep2wking.oedldoedlcore.api.block.ModBlockOreBase;
import net.thep2wking.oedldoedlcore.util.ModToolTypes;

public class BlockNosleeptonite extends ModBlockOreBase {
	public BlockNosleeptonite(String modid, String name, CreativeTabs tab, int minXp, int maxXp, Material material,
			SoundType sound, MapColor mapColor, int harvestLevel, ModToolTypes toolType, float hardness,
			float resistance, int lightLevel) {
		super(modid, name, tab, minXp, maxXp, material, sound, mapColor, harvestLevel, toolType, hardness, resistance,
				lightLevel);
		setTickRandomly(true);
	}

	@Override
	public int tickRate(World worldIn) {
		return 1000;
	}

	@Override
	public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state,
			@Nullable TileEntity te, ItemStack stack) {
		if (!worldIn.isRemote && !player.capabilities.isCreativeMode
				&& BadOresConfig.EVENTS.NOSLEEPTONITE_SPAWNS_ITSELF) {
			EntityNosleeptonite blockEntity = new EntityNosleeptonite(worldIn);
			blockEntity.setPosition(pos.getX() + 0.5, pos.getY(), pos.getZ() + 0.5);
			blockEntity.setRevengeTarget(player);
			blockEntity.setAttackTarget(player);
			worldIn.spawnEntity(blockEntity);
			blockEntity.playLivingSound();
			player.addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, 400, 0));
		} else {
			super.harvestBlock(worldIn, player, pos, state, te, stack);
		}
	}

	@Override
	public void randomTick(World worldIn, BlockPos pos, IBlockState state, Random random) {
		if (!worldIn.isRemote && random.nextInt(10) == 0 && BadOresConfig.EVENTS.NOSLEEPTONITE_SOUNDS) {
			worldIn.playSound(null, pos.getX() + 0.5D, pos.getY() + 0.5D, pos.getZ() + 0.5D,
					ModSounds.NOSLEEPTONITE_BLOCK, SoundCategory.BLOCKS, 0.75f, 1.0f);
		}
	}
}