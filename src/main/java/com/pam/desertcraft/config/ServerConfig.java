package com.pam.desertcraft.config;

import com.pam.desertcraft.Desertcraft;

import net.minecraftforge.common.ForgeConfigSpec;

final class ServerConfig {

	final ForgeConfigSpec.BooleanValue serverEnableDesertPlant;

	ServerConfig(final ForgeConfigSpec.Builder builder) {
		builder.push("general");
		serverEnableDesertPlant = builder.comment("Enable desert plant generation in world?")
				.translation(Desertcraft.MODID + ".config.serverEnableDesertPlant")
				.define("serverEnableDesertPlant", true);
		
		builder.pop();
	}

}
