package net.thep2wking.badores.util.worldgen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.thep2wking.badores.init.ModBlocks;

public class WorldGenOverworldOres implements IWorldGenerator {
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		switch (world.provider.getDimension()) {
			case 0:
				runGenerator(ModBlocks.POLITE, Blocks.STONE, world, random, chunkX, chunkZ, 1, 8, random.nextInt(6), 1, 64);
				runGenerator(ModBlocks.WANNAFITE, Blocks.STONE, world, random, chunkX, chunkZ, 1, 8, random.nextInt(6), 1, 64);
				runGenerator(ModBlocks.BREAKIUM, Blocks.STONE, world, random, chunkX, chunkZ, 1, 8, random.nextInt(6), 1, 64);
				runGenerator(ModBlocks.STONIUM, Blocks.STONE, world, random, chunkX, chunkZ, 1, 20, random.nextInt(80), 1, 128);
				runGenerator(ModBlocks.CRAPPIUM, Blocks.STONE, world, random, chunkX, chunkZ, 1, 8, random.nextInt(8), 40, 120);
				runGenerator(ModBlocks.ENDERITE, Blocks.STONE, world, random, chunkX, chunkZ, 1, 8, random.nextInt(6), 1, 64);
				runGenerator(ModBlocks.WEBSITE, Blocks.STONE, world, random, chunkX, chunkZ, 1, 8, random.nextInt(6), 1, 64);
				runGenerator(ModBlocks.LITE, Blocks.STONE, world, random, chunkX, chunkZ, 1, 4, random.nextInt(6), 1, 64);
				runGenerator(ModBlocks.MISLEADIUM, Blocks.STONE, world, random, chunkX, chunkZ, 1, 8, random.nextInt(6), 1, 64);
				runGenerator(ModBlocks.GHOSTIUM, Blocks.STONE, world, random, chunkX, chunkZ, 1, 8, random.nextInt(6), 1, 64);

				runGenerator(ModBlocks.AMADEUM, Blocks.STONE, world, random, chunkX, chunkZ, 1, 6, random.nextInt(3), 1, 64);
				runGenerator(ModBlocks.BARELYGENERITE, Blocks.STONE, world, random, chunkX, chunkZ, 1, 3, random.nextInt(2), 1, 64);
				runGenerator(ModBlocks.UNOBTAINIUM, Blocks.STONE, world, random, chunkX, chunkZ, 1, 8, random.nextInt(6), 1, 64);
				runGenerator(ModBlocks.COPPER_ORE, Blocks.STONE, world, random, chunkX, chunkZ, 1, 12, random.nextInt(10), 20, 100);
				runGenerator(ModBlocks.USELESSIUM, Blocks.STONE, world, random, chunkX, chunkZ, 1, 8, random.nextInt(6), 1, 64);
				runGenerator(ModBlocks.KILLIUM, Blocks.STONE, world, random, chunkX, chunkZ, 1, 8, random.nextInt(6), 1, 64);
				runGenerator(ModBlocks.MOVIUM, Blocks.STONE, world, random, chunkX, chunkZ, 1, 8, random.nextInt(6), 1, 64);
				runGenerator(ModBlocks.BALANCIUM, Blocks.STONE, world, random, chunkX, chunkZ, 1, 4, random.nextInt(3), 1, 64);
				runGenerator(ModBlocks.EXPLODEITMITE, Blocks.STONE, world, random, chunkX, chunkZ, 1, 4, random.nextInt(3), 1, 64);
				runGenerator(ModBlocks.MARMITE, Blocks.CLAY, world, random, chunkX, chunkZ, 1, 8, random.nextInt(16), 40, 100);

				runGenerator(ModBlocks.SHIFTIUM, Blocks.STONE, world, random, chunkX, chunkZ, 1, 8, random.nextInt(6), 1, 64);
				runGenerator(ModBlocks.WANTARITE, Blocks.STONE, world, random, chunkX, chunkZ, 1, 8, random.nextInt(6), 1, 64);
				runGenerator(ModBlocks.IDLIKEABITE, Blocks.DIRT, world, random, chunkX, chunkZ, 1, 8, random.nextInt(12), 50, 120);
				runGenerator(ModBlocks.METEORITE, Blocks.STONE, world, random, chunkX, chunkZ, 1, 8, random.nextInt(8), 80, 220);
				runGenerator(ModBlocks.STREETSCUM, Blocks.STONE, world, random, chunkX, chunkZ, 1, 8, random.nextInt(6), 1, 64);
				runGenerator(ModBlocks.FLEESONSITE, Blocks.STONE, world, random, chunkX, chunkZ, 1, 8, random.nextInt(6), 1, 64);
				runGenerator(ModBlocks.NOPIUM, Blocks.STONE, world, random, chunkX, chunkZ, 1, 8, random.nextInt(6), 1, 64);
				runGenerator(ModBlocks.ZOMBIEUNITE, Blocks.STONE, world, random, chunkX, chunkZ, 1, 6, random.nextInt(6), 1, 64);
				runGenerator(ModBlocks.PAINTITWHITE, Blocks.GRAVEL, world, random, chunkX, chunkZ, 1, 8, random.nextInt(12), 32, 128);
				runGenerator(ModBlocks.IWONTFITE, Blocks.STONE, world, random, chunkX, chunkZ, 1, 8, random.nextInt(6), 1, 64);

				runGenerator(ModBlocks.TAUNTUM, Blocks.STONE, world, random, chunkX, chunkZ, 1, 4, random.nextInt(3), 1, 64);
				runGenerator(ModBlocks.PANDAEMONIUM, Blocks.STONE, world, random, chunkX, chunkZ, 1, 4, random.nextInt(6), 1, 10);
				runGenerator(ModBlocks.NOSLEEPTONITE, Blocks.STONE, world, random, chunkX, chunkZ, 1, 3, random.nextInt(2), 1, 40);
				runGenerator(ModBlocks.APPETITE, Blocks.SAND, world, random, chunkX, chunkZ, 1, 8, random.nextInt(12), 32, 120);
				runGenerator(ModBlocks.CRASHIUM, Blocks.STONE, world, random, chunkX, chunkZ, 1, 8, random.nextInt(6), 1, 64);
				runGenerator(ModBlocks.SMITE, Blocks.STONE, world, random, chunkX, chunkZ, 1, 8, random.nextInt(6), 1, 64);
				runGenerator(ModBlocks.DIAMOND_ORE, Blocks.STONE, world, random, chunkX, chunkZ, 1, 8, random.nextInt(6), 1, 64);
				runGenerator(ModBlocks.KAKKARITE, Blocks.STONE, world, random, chunkX, chunkZ, 1, 8, random.nextInt(6), 1, 64);

				break;
		}
	}

	public void runGenerator(Block block, Block targetBlock, World world, Random random, int blockXPos, int blockZPos,
			int minSize, int maxSize, int chance, int minHeight, int maxHeight) {
		WorldGenMinable gen = new WorldGenMinable(block.getDefaultState(),
				(minSize + random.nextInt(maxSize - minSize + 1)), BlockMatcher.forBlock(targetBlock));
		if (minHeight > maxHeight || minHeight < 0 || maxHeight > 256)
			throw new IllegalArgumentException("Ore generated out of bounds");
		for (int i = 0; i < chance; i++) {
			int posX = blockXPos * 16 + random.nextInt(16);
			int posY = minHeight + random.nextInt(maxHeight - minHeight);
			int posZ = blockZPos * 16 + random.nextInt(16);
			gen.generate(world, random, new BlockPos(posX, posY, posZ));
		}
	}
}