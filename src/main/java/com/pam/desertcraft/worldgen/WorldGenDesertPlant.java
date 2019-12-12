package com.pam.desertcraft.worldgen;

import com.pam.desertcraft.Desertcraft;
import com.pam.desertcraft.config.DesertcraftConfig;

import net.minecraft.world.gen.feature.BushConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.placement.ChanceRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;

public class WorldGenDesertPlant {
    private static final ChanceRangeConfig desertplant_chance = new ChanceRangeConfig(0.1F, 0, 0, 128);
 
    public static void setupDesertPlantGen() {
    	BiomeDictionary.getBiomes(BiomeDictionary.Type.DRY).forEach((biome) ->
                    {
                if (DesertcraftConfig.enableDesertPlant) {
                	biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
                            Biome.createDecoratedFeature(Feature.BUSH,
                                    new BushConfig(Desertcraft.desertplant1.getDefaultState()), Placement.CHANCE_RANGE,
                                    desertplant_chance));
                	biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
                            Biome.createDecoratedFeature(Feature.BUSH,
                                    new BushConfig(Desertcraft.desertplant2.getDefaultState()), Placement.CHANCE_RANGE,
                                    desertplant_chance));
                	biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
                            Biome.createDecoratedFeature(Feature.BUSH,
                                    new BushConfig(Desertcraft.desertplant3.getDefaultState()), Placement.CHANCE_RANGE,
                                    desertplant_chance));
                	biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
                            Biome.createDecoratedFeature(Feature.BUSH,
                                    new BushConfig(Desertcraft.desertplant4.getDefaultState()), Placement.CHANCE_RANGE,
                                    desertplant_chance));
                	biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
                            Biome.createDecoratedFeature(Feature.BUSH,
                                    new BushConfig(Desertcraft.desertplant5.getDefaultState()), Placement.CHANCE_RANGE,
                                    desertplant_chance));
                	biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
                            Biome.createDecoratedFeature(Feature.BUSH,
                                    new BushConfig(Desertcraft.desertplant6.getDefaultState()), Placement.CHANCE_RANGE,
                                    desertplant_chance));
                	biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
                            Biome.createDecoratedFeature(Feature.BUSH,
                                    new BushConfig(Desertcraft.desertplant7.getDefaultState()), Placement.CHANCE_RANGE,
                                    desertplant_chance));
                	biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
                            Biome.createDecoratedFeature(Feature.BUSH,
                                    new BushConfig(Desertcraft.desertplant8.getDefaultState()), Placement.CHANCE_RANGE,
                                    desertplant_chance));
                	biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
                            Biome.createDecoratedFeature(Feature.BUSH,
                                    new BushConfig(Desertcraft.desertplant9.getDefaultState()), Placement.CHANCE_RANGE,
                                    desertplant_chance));
                	biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
                            Biome.createDecoratedFeature(Feature.BUSH,
                                    new BushConfig(Desertcraft.desertplant10.getDefaultState()), Placement.CHANCE_RANGE,
                                    desertplant_chance));
                	biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
                            Biome.createDecoratedFeature(Feature.BUSH,
                                    new BushConfig(Desertcraft.desertplant11.getDefaultState()), Placement.CHANCE_RANGE,
                                    desertplant_chance));
                	biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
                            Biome.createDecoratedFeature(Feature.BUSH,
                                    new BushConfig(Desertcraft.desertplant12.getDefaultState()), Placement.CHANCE_RANGE,
                                    desertplant_chance));
                	biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
                            Biome.createDecoratedFeature(Feature.BUSH,
                                    new BushConfig(Desertcraft.desertplant13.getDefaultState()), Placement.CHANCE_RANGE,
                                    desertplant_chance));
                	biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
                            Biome.createDecoratedFeature(Feature.BUSH,
                                    new BushConfig(Desertcraft.desertplant14.getDefaultState()), Placement.CHANCE_RANGE,
                                    desertplant_chance));
                	biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
                            Biome.createDecoratedFeature(Feature.BUSH,
                                    new BushConfig(Desertcraft.desertplant15.getDefaultState()), Placement.CHANCE_RANGE,
                                    desertplant_chance));
                	biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
                            Biome.createDecoratedFeature(Feature.BUSH,
                                    new BushConfig(Desertcraft.desertplant16.getDefaultState()), Placement.CHANCE_RANGE,
                                    desertplant_chance));
                	biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
                            Biome.createDecoratedFeature(Feature.BUSH,
                                    new BushConfig(Desertcraft.desertplant17.getDefaultState()), Placement.CHANCE_RANGE,
                                    desertplant_chance));
                	biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
                            Biome.createDecoratedFeature(Feature.BUSH,
                                    new BushConfig(Desertcraft.desertplant18.getDefaultState()), Placement.CHANCE_RANGE,
                                    desertplant_chance));
                	biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
                            Biome.createDecoratedFeature(Feature.BUSH,
                                    new BushConfig(Desertcraft.desertplant19.getDefaultState()), Placement.CHANCE_RANGE,
                                    desertplant_chance));
                	biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
                            Biome.createDecoratedFeature(Feature.BUSH,
                                    new BushConfig(Desertcraft.desertplant20.getDefaultState()), Placement.CHANCE_RANGE,
                                    desertplant_chance));

                   }});}}
