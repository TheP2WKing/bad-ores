package net.thep2wking.badores.util.events;

import java.util.Random;

import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;
import net.thep2wking.badores.BadOres;
import net.thep2wking.badores.config.BadOresConfig;
import net.thep2wking.badores.content.block.BlockAmadeum;
import net.thep2wking.badores.content.block.BlockCrashium;
import net.thep2wking.badores.content.block.BlockEnderite;
import net.thep2wking.badores.content.itemblock.ItemBlockNopium;

public class ModItemEvents {
	public static void politeUseMessage(World world, EntityPlayer player) {
		Random random = new Random();
		int message = random.nextInt(9);
		if (!world.isRemote && !player.capabilities.isCreativeMode && BadOresConfig.EVENTS.POLITE_CHAT_MESSAGES) {
			player.sendMessage(new TextComponentTranslation("tile." + BadOres.MODID + ".polite.tool." + message));
		}
	}

	public static void politeAttackMessage(World world, EntityPlayer player) {
		int message = new Random().nextInt(13);
		if (!world.isRemote && !player.capabilities.isCreativeMode && BadOresConfig.EVENTS.POLITE_CHAT_MESSAGES) {
			player.sendMessage(new TextComponentTranslation("tile." + BadOres.MODID + ".polite.attack." + message));
		}
	}

	public static void politeArmorMessage(World world, EntityPlayer player) {
		int message = new Random().nextInt(9);
		if (!world.isRemote && !player.capabilities.isCreativeMode && BadOresConfig.EVENTS.POLITE_CHAT_MESSAGES) {
			player.sendMessage(new TextComponentTranslation("tile." + BadOres.MODID + ".polite.defend." + message));
		}
	}

	public static void enderiteUseTeleport(World world, EntityPlayer player, BlockPos pos) {
		Random random = new Random();
		if (!world.isRemote && random.nextInt(5) == 0 && !player.capabilities.isCreativeMode
				&& BadOresConfig.EVENTS.ENDERITE_TELEPORTATION) {
			BlockEnderite.teleportTo(world, player,
					BlockEnderite.findRandomSpot(world, pos.getX(), pos.getY(), pos.getZ()));
		}
	}

	public static void enderiteAttackTeleport(World world, EntityPlayer player, BlockPos pos) {
		Random random = new Random();
		if (!world.isRemote && random.nextInt(5) == 0 && !player.capabilities.isCreativeMode
				&& BadOresConfig.EVENTS.ENDERITE_TELEPORTATION) {
			BlockEnderite.teleportTo(world, player,
					BlockEnderite.findRandomSpot(world, pos.getX(), pos.getY(), pos.getZ()));
		}
	}

	public static void enderiteArmorTeleport(World world, EntityPlayer player, BlockPos pos) {
		Random random = new Random();
		if (!world.isRemote && random.nextInt(1000) == 0 && !player.capabilities.isCreativeMode
				&& BadOresConfig.EVENTS.ENDERITE_TELEPORTATION) {
			BlockEnderite.teleportTo(world, player,
					BlockEnderite.findRandomSpot(world, pos.getX(), pos.getY(), pos.getZ()));
		}
	}

	public static void amadeumToolTickSound(World world, EntityPlayer player) {
		Random random = new Random();
		if (!world.isRemote && random.nextInt(200) == 0 && !player.capabilities.isCreativeMode
				&& BadOresConfig.EVENTS.AMADEUM_SOUNDS) {
			BlockAmadeum.randomSound(world, player.posX, player.posY, player.posZ, random);
		}
	}

	public static void amadeumArmorTickSound(World world, EntityPlayer player) {
		Random random = new Random();
		if (!world.isRemote && random.nextInt(200) == 0 && !player.capabilities.isCreativeMode
				&& BadOresConfig.EVENTS.AMADEUM_SOUNDS) {
			BlockAmadeum.randomSound(world, player.posX, player.posY, player.posZ, random);
		}
	}

	public static void smiteUseStrike(World world, EntityPlayer player) {
		Random random = new Random();
		if (!world.isRemote && random.nextInt(4) == 0 && !player.capabilities.isCreativeMode
				&& BadOresConfig.EVENTS.SMITE_CAN_SPAWN_LIGHTNING_BOLT) {
			world.addWeatherEffect(new EntityLightningBolt(world, player.posX, player.posY, player.posZ, false));
		}
	}

	public static void smiteAttackStrike(World world, EntityPlayer player) {
		Random random = new Random();
		if (!world.isRemote && random.nextInt(2) == 0 && !player.capabilities.isCreativeMode
				&& BadOresConfig.EVENTS.SMITE_CAN_SPAWN_LIGHTNING_BOLT) {
			world.addWeatherEffect(new EntityLightningBolt(world, player.posX, player.posY, player.posZ, false));
		}
	}

	public static void smiteArmorTickStrike(World world, EntityPlayer player) {
		Random random = new Random();
		if (!world.isRemote && random.nextInt(200) == 0 && !player.capabilities.isCreativeMode
				&& BadOresConfig.EVENTS.SMITE_CAN_SPAWN_LIGHTNING_BOLT) {
			world.addWeatherEffect(new EntityLightningBolt(world, player.posX, player.posY, player.posZ, false));
		}
	}

	public static void nopiumToolTickDrop(World world, EntityPlayer player, ItemStack stack, int slot) {
		if (!world.isRemote && !player.capabilities.isCreativeMode && BadOresConfig.EVENTS.NOPIUM_ITEM_DROPPING) {
			ItemBlockNopium.dropRandomly(stack, slot, player, world);
		}
	}

	public static void nopiumArmorTickDrop(World world, EntityPlayer player, ItemStack stack, int slot) {
		Random random = new Random();
		if (!player.capabilities.isCreativeMode && !world.isRemote && random.nextInt(200) == 0
				&& BadOresConfig.EVENTS.NOPIUM_ITEM_DROPPING) {
			player.dropItem(stack, false, true);
			player.inventory.armorInventory.set(slot, ItemStack.EMPTY);
		}
	}

	public static void crashiumUseCrash(World world, EntityPlayer player) {
		if (!player.capabilities.isCreativeMode && BadOresConfig.EVENTS.CRASHIUM_CAN_CRASH_GAME) {
			BlockCrashium.doCrash(player, world);
		}
	}

	public static void crashiumAttackCrash(World world, EntityPlayer player) {
		if (!player.capabilities.isCreativeMode && BadOresConfig.EVENTS.CRASHIUM_CAN_CRASH_GAME) {
			BlockCrashium.doCrash(player, world);
		}
	}

	public static void crashiumArmorCrash(World world, EntityPlayer player) {
		if (!player.capabilities.isCreativeMode && BadOresConfig.EVENTS.CRASHIUM_CAN_CRASH_GAME) {
			BlockCrashium.doCrash(player, world);
		}
	}

	public static void crashiumArmorTickCrash(World world, EntityPlayer player) {
		Random random = new Random();
		if (!world.isRemote && random.nextInt(800) == 0 && !player.capabilities.isCreativeMode
				&& BadOresConfig.EVENTS.CRASHIUM_CAN_CRASH_GAME) {
			BlockCrashium.doCrash(player, world);
		}
	}
}