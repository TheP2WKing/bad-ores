package net.thep2wking.badores.content.block;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.thep2wking.badores.config.BadOresConfig;
import net.thep2wking.oedldoedlcore.api.block.ModBlockOreBase;
import net.thep2wking.oedldoedlcore.util.ModToolTypes;

public class BlockStreetscum extends ModBlockOreBase {
	public BlockStreetscum(String modid, String name, CreativeTabs tab, int minXp, int maxXp, Material material,
			SoundType sound, MapColor mapColor, int harvestLevel, ModToolTypes toolType, float hardness,
			float resistance, int lightLevel) {
		super(modid, name, tab, minXp, maxXp, material, sound, mapColor, harvestLevel, toolType, hardness, resistance,
				lightLevel);
	}

	@Override
	public void onBlockHarvested(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player) {
		if (!player.capabilities.isCreativeMode && !worldIn.isRemote && BadOresConfig.EVENTS.STREETSCUM_CAN_DELETE_ITEMS) {
			Random random = new Random();
			List<Integer> availableItems = new ArrayList<Integer>();
			for (int i = 0; i < player.inventory.getSizeInventory(); i++) {
				if (player.inventory.getStackInSlot(i) != null)
					availableItems.add(i);
			}
			int remove = random.nextInt(availableItems.size() / 3 + 1);
			for (int i = 0; i < remove; i++) {
				int removeSlot = availableItems.remove(random.nextInt(availableItems.size()));
				player.inventory.setInventorySlotContents(removeSlot, ItemStack.EMPTY);
			}
		}
	}
}