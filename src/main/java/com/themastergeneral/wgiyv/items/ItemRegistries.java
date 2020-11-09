package com.themastergeneral.wgiyv.items;

import com.themastergeneral.wgiyv.WGIYV;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistries {
public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, WGIYV.MODID);
	
	//Base items
	public static final RegistryObject<Item> fullmod = ITEMS.register("fullmod", () -> ModItems.fullmod);
	public static final RegistryObject<Item> mod = ITEMS.register("mod", () -> ModItems.mod);
	public static final RegistryObject<Item> tank = ITEMS.register("tank", () -> ModItems.tank);
}
