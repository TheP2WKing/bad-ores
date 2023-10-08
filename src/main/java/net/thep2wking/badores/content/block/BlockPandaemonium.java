package net.thep2wking.badores.content.block;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.thep2wking.badores.init.ModSounds;
import net.thep2wking.reloadedlib.api.block.ModBlockOreBase;
import net.thep2wking.reloadedlib.util.ModToolTypes;

public class BlockPandaemonium extends ModBlockOreBase {
	public final List<Item> ITEMS = Arrays.asList(Item.getItemFromBlock(Blocks.NETHERRACK),
			Item.getItemFromBlock(Blocks.SOUL_SAND), Item.getItemFromBlock(Blocks.NETHER_WART),
			Item.getItemFromBlock(Blocks.OBSIDIAN), Items.FIRE_CHARGE, Items.BLAZE_ROD, Items.MAGMA_CREAM);

	public BlockPandaemonium(String modid, String name, CreativeTabs tab, int minXp, int maxXp, Material material,
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
	public void randomTick(World worldIn, BlockPos pos, IBlockState state, Random random) {
		if (!worldIn.isRemote && random.nextInt(10) == 0) {
			worldIn.playSound(null, pos.getX(), pos.getY(), pos.getZ(), ModSounds.PANDAEMONIUM_MINE,
					SoundCategory.BLOCKS, 1.0F, 1.0f);
		}
	}

	public static void setBlockSafe(World world, int x, int y, int z, Block block) {
		if (world.getBlockState(new BlockPos(x, y, z)).getBlockHardness(world, new BlockPos(x, y, z)) >= 0f) {
			world.setBlockState(new BlockPos(x, y, z), block.getDefaultState(), 3);
		}
	}

	@Override
	public void onBlockHarvested(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player) {
		if (!worldIn.isRemote) {
			Random random = new Random();
			worldIn.playSound(null, pos.getX(), pos.getY(), pos.getZ(), ModSounds.PANDAEMONIUM_MINE,
					SoundCategory.BLOCKS, 1.0F, 1.0f);
			int pigmen = random.nextInt(4);
			for (int i = 0; i < pigmen; i++) {
				EntityPigZombie entityPigZombie = new EntityPigZombie(worldIn);
				entityPigZombie.setPosition(pos.getX() + 0.5, pos.getY(), pos.getZ() + 0.5);
				worldIn.spawnEntity(entityPigZombie);
			}
			int veins = random.nextInt(12) + 3;
			for (int i = 0; i < veins; i++) {
				float xP = random.nextFloat() - random.nextFloat();
				float yP = random.nextFloat() - random.nextFloat();
				float zP = random.nextFloat() - random.nextFloat();
				int length = random.nextInt(10) + 3;
				for (int iteration = 0; iteration < length; iteration++) {
					float curX = pos.getX() + 0.5f + xP * iteration;
					float curY = pos.getY() + 0.5f + yP * iteration;
					float curZ = pos.getZ() + 0.5f + zP * iteration;
					setBlockSafe(worldIn, MathHelper.floor(curX), MathHelper.floor(curY), MathHelper.floor(curZ),
							Blocks.NETHERRACK);
				}
			}
			int fireRange = random.nextInt(8);
			float fireChance = random.nextFloat() * random.nextFloat();
			for (int xP = -fireRange; xP <= fireRange; xP++)
				for (int yP = -fireRange; yP <= fireRange; yP++)
					for (int zP = -fireRange; zP <= fireRange; zP++) {
						if (random.nextFloat() < fireChance) {
							if (Blocks.FIRE.canPlaceBlockAt(worldIn,
									new BlockPos(pos.getX() + xP, pos.getY() + yP, pos.getZ() + zP)))
								setBlockSafe(worldIn, pos.getX() + xP, pos.getY() + yP, pos.getZ() + zP, Blocks.FIRE);
						}
					}
		}
	}

	@Override
	public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state,
			int fortune) {
		Random random = new Random();
		int num = random.nextInt(3);
		for (int i = 0; i < num; i++) {
			Item item = selectRandom(random, ITEMS);
			drops.add(new ItemStack(item, random.nextInt(5)));
		}
	}

	public static <T> T selectRandom(Random r, List<T> list) {
		return list.get(r.nextInt(list.size()));
	}
}