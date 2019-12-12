package com.pam.desertcraft.block;

import net.minecraft.block.GlassBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockGlassSteel extends GlassBlock {

	public BlockGlassSteel(Properties properties) {
		super(Properties.create(Material.GLASS).sound(SoundType.GLASS).hardnessAndResistance(50.0F));
	}

}
