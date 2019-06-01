package com.themastergeneral.wgiyv.items;

import com.themastergeneral.ctdcore.item.CTDItem;
import com.themastergeneral.wgiyv.ModInfo;
import com.themastergeneral.wgiyv.WGIYV;

import net.minecraft.creativetab.CreativeTabs;

public class BasicItem extends CTDItem {
	
	public BasicItem(String name) {
		super(name, ModInfo.MODID);
		this.setCreativeTab(CreativeTabs.TOOLS);
	}
}
