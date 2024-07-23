package net.thep2wking.badores.util;

import net.minecraft.item.Item.ToolMaterial;
import net.thep2wking.badores.BadOres;
import net.thep2wking.badores.init.ModItems;
import net.thep2wking.oedldoedlcore.api.tool.ModToolMaterialBase;

public class ModToolMaterial {
	public static final ToolMaterial POLITE = ModToolMaterialBase.addToolMaterial(BadOres.MODID, "polite", 200, 1, 5f,
			2f, 15, ModItems.POLITE_INGOT, 0);
	public static final ToolMaterial CRAPPIUM = ModToolMaterialBase.addToolMaterial(BadOres.MODID, "crappium", 1, 1, 2f,
			0f, 15, ModItems.CRAPPIUM_INGOT, 0);
	public static final ToolMaterial ENDERITE = ModToolMaterialBase.addToolMaterial(BadOres.MODID, "enderite", 120, 1,
			4f, 1f, 15, ModItems.ENDERITE_INGOT, 0);
	public static final ToolMaterial AMADEUM = ModToolMaterialBase.addToolMaterial(BadOres.MODID, "amadeum", 250, 2, 6f,
			2f, 20, ModItems.AMADEUM_INGOT, 0);
	public static final ToolMaterial COPPER = ModToolMaterialBase.addToolMaterial(BadOres.MODID, "copper", 200, 1, 5f,
			1f, 15, ModItems.COPPER_INGOT, 0);
	public static final ToolMaterial NOPIUM = ModToolMaterialBase.addToolMaterial(BadOres.MODID, "nopium", 800, 2, 0.5f,
			1f, 0, ModItems.NOPIUM_INGOT, 0);
	public static final ToolMaterial CRASHIUM = ModToolMaterialBase.addToolMaterial(BadOres.MODID, "crashium", 250, 2,
			8f, 2f, 8, ModItems.CRASHIUM_GEMSTONE, 0);
	public static final ToolMaterial SMITE = ModToolMaterialBase.addToolMaterial(BadOres.MODID, "smite", 220, 2, 5f, 2f,
			8, ModItems.SMITE_GEMSTONE, 0);
	public static final ToolMaterial DIAMOND = ModToolMaterialBase.addToolMaterial(BadOres.MODID, "diamond", 1, 0, 2f,
			0f, 0, ModItems.DIAMOND, 0);
}
