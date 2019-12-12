package com.pam.desertcraft.setup;

import com.pam.desertcraft.Desertcraft;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModSetup {

	public ItemGroup itemGroup = new ItemGroup("tabDesertcraft") {
		@Override
		public ItemStack createIcon() {
			return new ItemStack(Desertcraft.glasssteel);
		}
	};

	public void init() {

	}

}
