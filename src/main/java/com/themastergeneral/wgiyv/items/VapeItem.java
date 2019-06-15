package com.themastergeneral.wgiyv.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Particles;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class VapeItem extends BasicItem {

	public VapeItem(String name) {
		super(name);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
    {
		worldIn.spawnParticle(Particles.CLOUD, playerIn.posX, playerIn.posY+1.3, playerIn.posZ, 0.0D, 0.5D, 0.0D);
		worldIn.spawnParticle(Particles.CLOUD, playerIn.posX, playerIn.posY+1.3, playerIn.posZ, 0.0D, 0.5D, 0.0D);
		worldIn.spawnParticle(Particles.CLOUD, playerIn.posX, playerIn.posY+1.3, playerIn.posZ, 0.0D, 0.5D, 0.0D);
		worldIn.spawnParticle(Particles.CLOUD, playerIn.posX, playerIn.posY+1.3, playerIn.posZ, 0.0D, 0.5D, 0.0D);
		worldIn.spawnParticle(Particles.CLOUD, playerIn.posX, playerIn.posY+1.3, playerIn.posZ, 0.0D, 0.5D, 0.0D);
		worldIn.spawnParticle(Particles.CLOUD, playerIn.posX, playerIn.posY+1.3, playerIn.posZ, 0.0D, 0.4D, 0.0D);
		worldIn.spawnParticle(Particles.CLOUD, playerIn.posX, playerIn.posY+1.3, playerIn.posZ, 0.0D, 0.3D, 0.0D);
        return new ActionResult<ItemStack>(EnumActionResult.PASS, playerIn.getHeldItem(handIn));
    }

}
