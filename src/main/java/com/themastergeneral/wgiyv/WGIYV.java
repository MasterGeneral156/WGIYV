/*
	Project:	WGIYV
	File:		com.themastergeneral.wgiyv.WGIYV
	Author:		TheMasterGeneral
	Website: 	https://github.com/MasterGeneral156/WGIYV
	License:	MIT License

				Copyright (c) 2022 MasterGeneral156
				
				Permission is hereby granted, free of charge, to any person obtaining a copy
				of this software and associated documentation files (the "Software"), to deal
				in the Software without restriction, including without limitation the rights
				to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
				copies of the Software, and to permit persons to whom the Software is
				furnished to do so, subject to the following conditions:
				
				The above copyright notice and this permission notice shall be included in all
				copies or substantial portions of the Software.
				
				THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
				IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
				FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
				AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
				LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
				OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
				SOFTWARE.
*/
package com.themastergeneral.wgiyv;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.themastergeneral.wgiyv.items.ItemRegistries;
import com.themastergeneral.wgiyv.items.ModItems;

import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

@Mod("wgiyv")
public class WGIYV {
	
	public static WGIYV instance;
	private static final Logger LOGGER = LogManager.getLogger();

	public static final String MODID = "wgiyv";

	public WGIYV(IEventBus modEventBus) {
		instance = this;
        // Register the setup method for modloading
        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::fillTab);

        // Register ourselves for server, registry and other game events we are interested in
        ItemRegistries.ITEMS.register(modEventBus);
    }
	
	private void setup(final FMLCommonSetupEvent event)
    {
		LOGGER.info("We get it... you vape...");
    }
	
	private void fillTab(BuildCreativeModeTabContentsEvent ev)
	{
		if (ev.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES)
		{
			ev.accept(ModItems.fullmod);
			ev.accept(ModItems.mod);
			ev.accept(ModItems.tank);
		}
	}
}
