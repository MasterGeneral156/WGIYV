/*
	Project:	Pumpkin Spice Latte 1.16
	File:		com.themastergeneral.wgiyv.items.VapeItem
	Author:		TheMasterGeneral
	Website: 	https://github.com/MasterGeneral156/WGIYV
	License:	MIT License

				Copyright (c) 2019 MasterGeneral156
				
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

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class VapeItem extends BasicItem {

	public VapeItem(String name) {
		super(name);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn)
    {
		worldIn.addParticle(ParticleTypes.CLOUD, playerIn.lastTickPosX, playerIn.lastTickPosY+1.3, playerIn.lastTickPosZ, 0.0D, 0.5D, 0.0D);
		worldIn.addParticle(ParticleTypes.CLOUD, playerIn.lastTickPosX, playerIn.lastTickPosY+1.3, playerIn.lastTickPosZ, 0.0D, 0.5D, 0.0D);
		worldIn.addParticle(ParticleTypes.CLOUD, playerIn.lastTickPosX, playerIn.lastTickPosY+1.3, playerIn.lastTickPosZ, 0.0D, 0.5D, 0.0D);
		worldIn.addParticle(ParticleTypes.CLOUD, playerIn.lastTickPosX, playerIn.lastTickPosY+1.3, playerIn.lastTickPosZ, 0.0D, 0.5D, 0.0D);
		worldIn.addParticle(ParticleTypes.CLOUD, playerIn.lastTickPosX, playerIn.lastTickPosY+1.3, playerIn.lastTickPosZ, 0.0D, 0.5D, 0.0D);
		worldIn.addParticle(ParticleTypes.CLOUD, playerIn.lastTickPosX, playerIn.lastTickPosY+1.3, playerIn.lastTickPosZ, 0.0D, 0.4D, 0.0D);
		worldIn.addParticle(ParticleTypes.CLOUD, playerIn.lastTickPosX, playerIn.lastTickPosY+1.3, playerIn.lastTickPosZ, 0.0D, 0.3D, 0.0D);
		return new ActionResult<>(ActionResultType.PASS, playerIn.getHeldItem(handIn));
    }

}
