package net.thep2wking.badores.util.world;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.DimensionType;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.thep2wking.badores.BadOres;
import net.thep2wking.badores.config.BadOresConfig;
import net.thep2wking.badores.init.ModBlocks;
import net.thep2wking.oedldoedlcore.util.ModLogger;
import net.thep2wking.oedldoedlcore.util.world.ModOreGenHelper;

public class ModOreGen implements IWorldGenerator {
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		if (BadOresConfig.WORLD.ENABLE_ALL_ORE_GENERATION) {
			ModOreGenHelper.addOreGenOverworld(world, random, chunkX, chunkZ, ModBlocks.POLITE_ORE, 6, random.nextInt(6), 1, 64, BadOresConfig.WORLD.POLITE);
			ModOreGenHelper.addOreGenOverworld(world, random, chunkX, chunkZ, ModBlocks.WANNAFITE_ORE, 6, random.nextInt(6), 1, 64, BadOresConfig.WORLD.WANNAFITE);
			ModOreGenHelper.addOreGenOverworld(world, random, chunkX, chunkZ, ModBlocks.BREAKIUM_ORE, 6, random.nextInt(6), 1, 64, BadOresConfig.WORLD.BREAKIUM);
			ModOreGenHelper.addOreGenOverworld(world, random, chunkX, chunkZ, ModBlocks.STONIUM_ORE, 15, random.nextInt(60), 32, 256, BadOresConfig.WORLD.STONIUM);
			ModOreGenHelper.addOreGenOverworld(world, random, chunkX, chunkZ, ModBlocks.CRAPPIUM_ORE, 8, random.nextInt(8), 40, 120, BadOresConfig.WORLD.CRAPPIUM);
			ModOreGenHelper.addOreGenOverworld(world, random, chunkX, chunkZ, ModBlocks.ENDERITE_ORE, 6, random.nextInt(6), 1, 64, BadOresConfig.WORLD.ENDERITE);
			ModOreGenHelper.addOreGenOverworld(world, random, chunkX, chunkZ, ModBlocks.WEBSITE_ORE, 6, random.nextInt(6), 1, 64, BadOresConfig.WORLD.WEBSITE);
			ModOreGenHelper.addOreGenOverworld(world, random, chunkX, chunkZ, ModBlocks.LITE_ORE, 4, random.nextInt(4), 1, 48, BadOresConfig.WORLD.LITE);
			ModOreGenHelper.addOreGenOverworld(world, random, chunkX, chunkZ, ModBlocks.MISLEADIUM_ORE, 6, random.nextInt(6), 1, 64, BadOresConfig.WORLD.MISLEADIUM);
			ModOreGenHelper.addOreGenOverworld(world, random, chunkX, chunkZ, ModBlocks.GHOSTIUM_ORE, 6, random.nextInt(6), 1, 64, BadOresConfig.WORLD.GHOSTIUM);
			ModOreGenHelper.addOreGenOverworld(world, random, chunkX, chunkZ, ModBlocks.AMADEUM_ORE, 5, random.nextInt(3), 1, 64, BadOresConfig.WORLD.AMADEUM);
			ModOreGenHelper.addOreGenOverworld(world, random, chunkX, chunkZ, ModBlocks.BARELYGENERITE_ORE, 3, random.nextInt(2), 1, 64, BadOresConfig.WORLD.BARELYGENERITE);
			ModOreGenHelper.addOreGenOverworld(world, random, chunkX, chunkZ, ModBlocks.UNOBTAINIUM_ORE, 6, random.nextInt(5), 1, 64, BadOresConfig.WORLD.UNOBTAINIUM);
			ModOreGenHelper.addOreGenOverworld(world, random, chunkX, chunkZ, ModBlocks.COPPER_ORE, 10, random.nextInt(12), 20, 100, BadOresConfig.WORLD.COPPER);
			ModOreGenHelper.addOreGenOverworld(world, random, chunkX, chunkZ, ModBlocks.USELESSIUM_ORE, 10, random.nextInt(6), 1, 128, BadOresConfig.WORLD.USELESSIUM);
			ModOreGenHelper.addOreGenOverworld(world, random, chunkX, chunkZ, ModBlocks.KILLIUM_ORE, 6, random.nextInt(6), 1, 64, BadOresConfig.WORLD.KILLIUM);
			ModOreGenHelper.addOreGenOverworld(world, random, chunkX, chunkZ, ModBlocks.MOVIUM_ORE, 6, random.nextInt(6), 1, 64, BadOresConfig.WORLD.MOVIUM);
			ModOreGenHelper.addOreGenOverworld(world, random, chunkX, chunkZ, ModBlocks.BALANCIUM_ORE, 4, random.nextInt(3), 1, 48, BadOresConfig.WORLD.BALANCIUM);
			ModOreGenHelper.addOreGenOverworld(world, random, chunkX, chunkZ, ModBlocks.EXPLODEITMITE_ORE, 3, random.nextInt(2), 1, 48, BadOresConfig.WORLD.EXPLODEITMITE);
			ModOreGenHelper.addOreGen(world, random, chunkX, chunkZ, ModBlocks.MARMITE_ORE, 8, random.nextInt(16), Blocks.CLAY, 40, 80, DimensionType.OVERWORLD.getId(), BadOresConfig.WORLD.MARMITE);
			ModOreGenHelper.addOreGenOverworld(world, random, chunkX, chunkZ, ModBlocks.SHIFTIUM_ORE, 6, random.nextInt(6), 1, 64, BadOresConfig.WORLD.SHIFTIUM);
			ModOreGenHelper.addOreGenOverworld(world, random, chunkX, chunkZ, ModBlocks.WANTARITE_ORE, 5, random.nextInt(5), 16, 64, BadOresConfig.WORLD.WANTARITE);
			ModOreGenHelper.addOreGen(world, random, chunkX, chunkZ, ModBlocks.IDLIKEABITE_ORE, 8, random.nextInt(8), Blocks.DIRT, 50, 80, DimensionType.OVERWORLD.getId(), BadOresConfig.WORLD.IDLIKEABITE);
			ModOreGenHelper.addOreGenOverworld(world, random, chunkX, chunkZ, ModBlocks.METEORITE_ORE, 8, random.nextInt(8), 80, 220, BadOresConfig.WORLD.METEORITE);
			ModOreGenHelper.addOreGenOverworld(world, random, chunkX, chunkZ, ModBlocks.STREETSCUM_ORE, 5, random.nextInt(6), 1, 48, BadOresConfig.WORLD.STREETSCUM);
			ModOreGenHelper.addOreGenOverworld(world, random, chunkX, chunkZ, ModBlocks.FLEESONSITE_ORE, 5, random.nextInt(6), 1, 64, BadOresConfig.WORLD.FLEESONSITE);
			ModOreGenHelper.addOreGenOverworld(world, random, chunkX, chunkZ, ModBlocks.NOPIUM_ORE, 6, random.nextInt(6), 1, 64, BadOresConfig.WORLD.NOPIUM);
			ModOreGenHelper.addOreGenOverworld(world, random, chunkX, chunkZ, ModBlocks.ZOMBIEUNITE_ORE, 4, random.nextInt(6), 1, 64, BadOresConfig.WORLD.ZOMBIEUNITE);
			ModOreGenHelper.addOreGen(world, random, chunkX, chunkZ, ModBlocks.PAINTITWHITE_ORE,  8, random.nextInt(10), Blocks.GRAVEL, 20, 100, DimensionType.OVERWORLD.getId(), BadOresConfig.WORLD.PAINTITWHITE);
			ModOreGenHelper.addOreGenOverworld(world, random, chunkX, chunkZ, ModBlocks.IWONTFITE_ORE, 6, random.nextInt(6), 1, 64, BadOresConfig.WORLD.IWONTFITE);
			ModOreGenHelper.addOreGenOverworld(world, random, chunkX, chunkZ, ModBlocks.TAUNTUM_ORE, 4, random.nextInt(4), 1, 48, BadOresConfig.WORLD.TAUNTUM);
			ModOreGenHelper.addOreGenOverworld(world, random, chunkX, chunkZ, ModBlocks.PANDAEMONIUM_ORE, 4, random.nextInt(6), 1, 10, BadOresConfig.WORLD.PANDAEMONIUM);
			ModOreGenHelper.addOreGenOverworld(world, random, chunkX, chunkZ, ModBlocks.NOSLEEPTONITE_ORE, 3, random.nextInt(2), 1, 40, BadOresConfig.WORLD.NOSLEEPTONITE);
			ModOreGenHelper.addOreGen(world, random, chunkX, chunkZ, ModBlocks.APPETITE_ORE, 8, random.nextInt(10), Blocks.SAND, 40, 80, DimensionType.OVERWORLD.getId(), BadOresConfig.WORLD.APPETITE);
			ModOreGenHelper.addOreGenOverworld(world, random, chunkX, chunkZ, ModBlocks.CRASHIUM_ORE, 6, random.nextInt(5), 1, 64, BadOresConfig.WORLD.CRASHIUM);
			ModOreGenHelper.addOreGenOverworld(world, random, chunkX, chunkZ, ModBlocks.SMITE_ORE, 6, random.nextInt(6), 1, 64, BadOresConfig.WORLD.SMITE);
			ModOreGenHelper.addOreGenOverworld(world, random, chunkX, chunkZ, ModBlocks.DIAMOND_ORE, 6, random.nextInt(6), 16, 64, BadOresConfig.WORLD.DIAMOND);
			ModOreGenHelper.addOreGenOverworld(world, random, chunkX, chunkZ, ModBlocks.KAKKARITE_ORE, 6, random.nextInt(5), 1, 64, BadOresConfig.WORLD.KAKKARITE);
		}
	}

	public static void registerModOredGen() {
		ModLogger.registeredWorldGenLogger(BadOres.MODID);

		ModOreGenHelper.registerOreGen(new ModOreGen());
	}
}