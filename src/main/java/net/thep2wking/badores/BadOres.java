package net.thep2wking.badores;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLLoadCompleteEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.oedldoedlcore.api.integration.ModJERPluginBase;
import net.thep2wking.oedldoedlcore.api.tab.ModCreativeTabBase;
import net.thep2wking.oedldoedlcore.util.ModLogInUtil;
import net.thep2wking.oedldoedlcore.util.ModLogger;
import net.thep2wking.oedldoedlcore.util.ModReferences;
import net.thep2wking.badores.init.ModBlocks;
import net.thep2wking.badores.init.ModEntities;
import net.thep2wking.badores.integration.jer.BadOresJERPlugin;
import net.thep2wking.badores.registry.ModOreDict;
import net.thep2wking.badores.registry.ModRecipes;
import net.thep2wking.badores.util.events.ModEventHandler;
import net.thep2wking.badores.util.proxy.CommonProxy;
import net.thep2wking.badores.util.world.ModOreGen;

@Mod(modid = BadOres.MODID, name = BadOres.NAME, version = BadOres.VERSION, dependencies = BadOres.DEPENDENCIES)
public class BadOres {
    public static final String MODID = "badores";
    public static final String PREFIX = MODID + ":";
    public static final String MC_VERSION = "1.12.2";
    public static final String NAME = "Bad Ores Reloaded";
    public static final String VERSION = MC_VERSION + "-" + "1.0.0";
    public static final String DEPENDENCIES = "required-after:forge@[14.23.5.2847,);required-after:oedldoedlcore@[1.12.2-4.2.0,);" + ModReferences.OEDLDOEDL_MODS_FIRST;
    public static final String CLIENT_PROXY_CLASS = "net.thep2wking.badores.util.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "net.thep2wking.badores.util.proxy.ServerProxy";

    @Mod.Instance(MODID)
    public static BadOres INSTANCE;

    @SidedProxy(clientSide = CLIENT_PROXY_CLASS, serverSide = SERVER_PROXY_CLASS)
    public static CommonProxy PROXY;

    public static final CreativeTabs TAB = new ModCreativeTabBase(MODID, ModReferences.CREATIVE_TAB_LIGHT, false,
            true) {
        @Override
        @SideOnly(Side.CLIENT)
        public ItemStack getTabIconItem() {
            return new ItemStack(ModBlocks.FLEESONSITE_ORE);
        };
    };

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModLogger.preInitLogger(MODID);
        ModEntities.registerEntities();
        PROXY.preInit(event);
    }
    
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        ModLogger.initLogger(MODID);
        ModOreDict.registerOreDict();
        ModRecipes.registerRecipes();
        ModOreGen.registerModOredGen();
        MinecraftForge.EVENT_BUS.register(ModEventHandler.INSTANCE);
        ModJERPluginBase.registerPlugin(new BadOresJERPlugin());
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

    @Mod.EventBusSubscriber
    public static class ModJoinMessage {
        @SubscribeEvent
        public static void addJoinMessage(PlayerLoggedInEvent event) {
            ModLogInUtil.addJoinMessage(event, NAME, "bad-ores-reloaded", VERSION, true);
        }
    }
}