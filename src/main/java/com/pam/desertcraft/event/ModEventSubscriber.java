package com.pam.desertcraft.event;

import static net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus.MOD;

import com.pam.desertcraft.Desertcraft;
import com.pam.desertcraft.config.ConfigHelper;
import com.pam.desertcraft.config.ConfigHolder;
import com.pam.desertcraft.worldgen.WorldGenDesertPlant;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@EventBusSubscriber(modid = Desertcraft.MODID, bus = MOD)
public final class ModEventSubscriber {

	@SubscribeEvent
	public static void onCommonSetup(final FMLCommonSetupEvent event) {
		WorldGenDesertPlant.setupDesertPlantGen();
			
	}

	@SubscribeEvent
	public static void onModConfigEvent(final ModConfig.ModConfigEvent event) {
		final ModConfig config = event.getConfig();

		if (config.getSpec() == ConfigHolder.SERVER_SPEC) {
			ConfigHelper.bakeServer(config);
		}
	}

}