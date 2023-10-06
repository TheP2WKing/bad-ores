package net.thep2wking.badores;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLLoadCompleteEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.reloadedlib.util.ModLogger;
import net.thep2wking.badores.registry.ModOreDict;
import net.thep2wking.badores.registry.ModRecipes;
import net.thep2wking.badores.util.proxy.CommonProxy;

@Mod(modid = BadOres.MODID, name = BadOres.NAME, version = BadOres.VERSION, dependencies = BadOres.DEPENDENCIES)
public class BadOres {
    public static final String MODID = "badores";
    public static final String PREFIX = MODID + ":";
    public static final String MC_VERSION = "1.12.2";
    public static final String NAME = "Bad Ores Reloaded";
    public static final String VERSION = MC_VERSION + "-" + "1.0.0";
    public static final String DEPENDENCIES = "required-after:forge@[14.23.5.2847,);required-after:reloadedlib@[1.12.2-1.0.0,);after:jei@[4.16.1.1000,);after:theoneprobe@[1.4.28,);";
    public static final String CLIENT_PROXY_CLASS = "net.thep2wking.badores.util.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "net.thep2wking.badores.util.proxy.ServerProxy";

    @Mod.Instance(MODID)
    public static BadOres INSTANCE;

    @SidedProxy(clientSide = CLIENT_PROXY_CLASS, serverSide = SERVER_PROXY_CLASS)
    public static CommonProxy PROXY;

    static {
        FluidRegistry.enableUniversalBucket();
    }

    public static final CreativeTabs TAB = new CreativeTabs(BadOres.MODID + ".name") {
        @Override
        @SideOnly(Side.CLIENT)
        public ItemStack getTabIconItem() {
            return new ItemStack(Items.AIR, 1, 0);
        }
    };

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModLogger.preInitLogger(MODID);
        PROXY.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        ModLogger.initLogger(MODID);
        ModOreDict.registerOreDict();
        ModRecipes.registerRecipes();
        PROXY.render();
        PROXY.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        ModLogger.postInitLogger(MODID);
        PROXY.postInit(event);
    }

    @Mod.EventHandler
    public void loadComplete(FMLLoadCompleteEvent event) {
        ModLogger.loadCompleteLogger(MODID, VERSION);
    }
}