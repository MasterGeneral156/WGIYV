/**
	Project:	WGIYV 26.2 Neoforge
	File:		com.themastergeneral.wgiyv.items.VapeItem
	Author:		TheMasterGeneral
	Website: 	https://github.com/MasterGeneral156/WGIYV
	License:	MIT License

				Copyright (c) 2026 MasterGeneral156

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

import net.minecraft.advancements.AdvancementHolder;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.resources.Identifier;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

import java.util.Objects;

public class VapeItem extends Item {

	public VapeItem(Item.Properties prop) {
		super(prop);
	}

	@Override
	public InteractionResult use(Level level, Player player, InteractionHand hand)
    {
		Vec3 look = player.getLookAngle();

		for (int i = 0; i < 20; i++) {

			double distance = i * 0.5D;

			double x = player.getX() + look.x * distance;
			double y = player.getEyeY() + look.y * distance;
			double z = player.getZ() + look.z * distance;

			level.addParticle(
					ParticleTypes.CLOUD,
					x, y, z,
					look.x * 0.1D,
					look.y * 0.1D,
					look.z * 0.1D
			);
		}
		if (player instanceof ServerPlayer serverPlayer) {
			var advancement = Objects.requireNonNull(level.getServer()).getAdvancements()
					.get(Identifier.fromNamespaceAndPath(
							"wgiyv",
							"use_mod"));

			if (advancement != null) {
				serverPlayer.getAdvancements()
						.award(advancement, "used");
			}
		}
		return InteractionResult.PASS;
    }

}
