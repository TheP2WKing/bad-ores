package net.thep2wking.badores.content.item;

import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.thep2wking.badores.util.events.ModItemEvents;
import net.thep2wking.oedldoedlcore.api.tool.ModItemSwordBase;

public class ItemPoliteSword extends ModItemSwordBase {
	public ItemPoliteSword(String modid, String name, CreativeTabs tab, ToolMaterial material, float attackDamage,
			float attackSpeed, EnumRarity rarity, boolean hasEffect, int tooltipLines, int annotationLines) {
		super(modid, name, tab, material, attackDamage, attackSpeed, rarity, hasEffect, tooltipLines, annotationLines);
	}

	@Override
	public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
		World world = entity.getEntityWorld();
		ModItemEvents.politeAttackMessage(world, player);
		return super.onLeftClickEntity(stack, player, entity);
	}

	@Override
	public boolean onBlockDestroyed(ItemStack stack, World worldIn, IBlockState state, BlockPos pos,
			EntityLivingBase entityLiving) {
		EntityPlayer player = (EntityPlayer) entityLiving;
		ModItemEvents.politeUseMessage(worldIn, player);
		return super.onBlockDestroyed(stack, worldIn, state, pos, entityLiving);
	}
}