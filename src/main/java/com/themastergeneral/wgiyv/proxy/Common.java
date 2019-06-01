package com.themastergeneral.wgiyv.proxy;

import com.themastergeneral.wgiyv.items.ModItems;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class Common {
	public void preInit(FMLPreInitializationEvent e) {
		ModItems.loadItems();
	}

	public void init(FMLInitializationEvent e) {
		
	}

	public void postInit(FMLPostInitializationEvent e) {

	}
}
