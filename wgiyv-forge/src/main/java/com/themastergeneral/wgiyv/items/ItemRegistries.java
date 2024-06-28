/*
	Project:	WGIYV
	File:		com.themastergeneral.wgiyv.items.ItemRegistries
	Author:		TheMasterGeneral
	Website: 	https://github.com/MasterGeneral156/WGIYV
	License:	MIT License

				Copyright (c) 2024 MasterGeneral156
				
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
package com.themastergeneral.wgiyv.items;

import com.themastergeneral.wgiyv.WGIYV;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistries {
public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, WGIYV.MODID);
	
	//Base items
	public static final RegistryObject<Item> fullmod = ITEMS.register("built_mod", () -> ModItems.fullmod);
	public static final RegistryObject<Item> mod = ITEMS.register("part_mod", () -> ModItems.mod);
	public static final RegistryObject<Item> tank = ITEMS.register("part_tank", () -> ModItems.tank);
}
