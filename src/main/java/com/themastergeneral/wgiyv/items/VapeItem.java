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
		worldIn.addParticle(ParticleTypes.CLOUD, playerIn.posX, playerIn.posY+1.3, playerIn.posZ, 0.0D, 0.5D, 0.0D);
		worldIn.addParticle(ParticleTypes.CLOUD, playerIn.posX, playerIn.posY+1.3, playerIn.posZ, 0.0D, 0.5D, 0.0D);
		worldIn.addParticle(ParticleTypes.CLOUD, playerIn.posX, playerIn.posY+1.3, playerIn.posZ, 0.0D, 0.5D, 0.0D);
		worldIn.addParticle(ParticleTypes.CLOUD, playerIn.posX, playerIn.posY+1.3, playerIn.posZ, 0.0D, 0.5D, 0.0D);
		worldIn.addParticle(ParticleTypes.CLOUD, playerIn.posX, playerIn.posY+1.3, playerIn.posZ, 0.0D, 0.5D, 0.0D);
		worldIn.addParticle(ParticleTypes.CLOUD, playerIn.posX, playerIn.posY+1.3, playerIn.posZ, 0.0D, 0.4D, 0.0D);
		worldIn.addParticle(ParticleTypes.CLOUD, playerIn.posX, playerIn.posY+1.3, playerIn.posZ, 0.0D, 0.3D, 0.0D);
		return new ActionResult<>(ActionResultType.PASS, playerIn.getHeldItem(handIn));
    }

}
