package com.themastergeneral.wgiyv;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.themastergeneral.wgiyv.items.ModItems;

import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;

@Mod("wgiyv")
public class WGIYV {
	
	public static WGIYV instance;
	private static final Logger LOGGER = LogManager.getLogger();

	public static final String MODID = "wgiyv";

	public WGIYV() {
		instance = this;
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        // Register ourselves for server, registry and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }
	
	private void setup(final FMLCommonSetupEvent event)
    {
		LOGGER.info("We get it... you vape...");
    }
	
	@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class Registration
    {
		@SubscribeEvent
        public static void registerItems(final RegistryEvent.Register<Item> event)
        {
			IForgeRegistry<Item> itemRegistry = event.getRegistry();

			itemRegistry.registerAll(ModItems.fullmod, ModItems.tank, ModItems.mod);
        }
    }
}
