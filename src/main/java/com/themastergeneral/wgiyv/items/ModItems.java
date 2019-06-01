package com.themastergeneral.wgiyv.items;

import com.themastergeneral.ctdcore.item.RegisterItem;

public class ModItems extends RegisterItem {
	
	public static void loadItems()
	{
		register(new BasicItem("tank"));
		register(new BasicItem("mod"));
		register(new VapeItem("fullmod"));
	}

}
