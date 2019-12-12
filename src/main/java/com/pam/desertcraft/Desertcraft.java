package com.pam.desertcraft;

import com.pam.desertcraft.block.BlockDesertPlant;
import com.pam.desertcraft.block.BlockGlassSteel;
import com.pam.desertcraft.item.CactusArmorMaterial;
import com.pam.desertcraft.item.ItemPamAxe;
import com.pam.desertcraft.item.ItemPamCactusArmor;
import com.pam.desertcraft.item.ItemPamHoe;
import com.pam.desertcraft.item.ItemPamPickaxe;
import com.pam.desertcraft.item.ItemPamShovel;
import com.pam.desertcraft.item.ItemPamSword;
import com.pam.desertcraft.setup.ModSetup;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ObjectHolder;

@Mod(Desertcraft.MODID)
public class Desertcraft {

	public static final String MODID = "desertcraft";

	public static ModSetup setup = new ModSetup();

	public Desertcraft() {
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		@SuppressWarnings("unused")
		final ModLoadingContext modLoadingContext = ModLoadingContext.get();
	}

	private void setup(final FMLCommonSetupEvent event) {
		setup.init();
	}

	@ObjectHolder("desertcraft:glasssteel")
	public static final BlockGlassSteel glasssteel = null;
	@ObjectHolder("desertcraft:desertplant1")
	public static final BlockDesertPlant desertplant1 = null;
	@ObjectHolder("desertcraft:desertplant2")
	public static final BlockDesertPlant desertplant2 = null;
	@ObjectHolder("desertcraft:desertplant3")
	public static final BlockDesertPlant desertplant3 = null;
	@ObjectHolder("desertcraft:desertplant4")
	public static final BlockDesertPlant desertplant4 = null;
	@ObjectHolder("desertcraft:desertplant5")
	public static final BlockDesertPlant desertplant5 = null;
	@ObjectHolder("desertcraft:desertplant6")
	public static final BlockDesertPlant desertplant6 = null;
	@ObjectHolder("desertcraft:desertplant7")
	public static final BlockDesertPlant desertplant7 = null;
	@ObjectHolder("desertcraft:desertplant8")
	public static final BlockDesertPlant desertplant8 = null;
	@ObjectHolder("desertcraft:desertplant9")
	public static final BlockDesertPlant desertplant9 = null;
	@ObjectHolder("desertcraft:desertplant10")
	public static final BlockDesertPlant desertplant10 = null;
	@ObjectHolder("desertcraft:desertplant11")
	public static final BlockDesertPlant desertplant11 = null;
	@ObjectHolder("desertcraft:desertplant12")
	public static final BlockDesertPlant desertplant12 = null;
	@ObjectHolder("desertcraft:desertplant13")
	public static final BlockDesertPlant desertplant13 = null;
	@ObjectHolder("desertcraft:desertplant14")
	public static final BlockDesertPlant desertplant14 = null;
	@ObjectHolder("desertcraft:desertplant15")
	public static final BlockDesertPlant desertplant15 = null;
	@ObjectHolder("desertcraft:desertplant16")
	public static final BlockDesertPlant desertplant16 = null;
	@ObjectHolder("desertcraft:desertplant17")
	public static final BlockDesertPlant desertplant17 = null;
	@ObjectHolder("desertcraft:desertplant18")
	public static final BlockDesertPlant desertplant18 = null;
	@ObjectHolder("desertcraft:desertplant19")
	public static final BlockDesertPlant desertplant19 = null;
	@ObjectHolder("desertcraft:desertplant20")
	public static final BlockDesertPlant desertplant20 = null;

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents {

		@SubscribeEvent
		public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {

			//Glass Steel Block
			event.getRegistry().register(new BlockGlassSteel(Block.Properties.create(Material.GLASS)).setRegistryName("glasssteel"));
			
			//Desert Plants
			event.getRegistry().register(new BlockDesertPlant(Block.Properties.create(Material.PLANTS)).setRegistryName("desertplant1"));
			event.getRegistry().register(new BlockDesertPlant(Block.Properties.create(Material.PLANTS)).setRegistryName("desertplant2"));
			event.getRegistry().register(new BlockDesertPlant(Block.Properties.create(Material.PLANTS)).setRegistryName("desertplant3"));
			event.getRegistry().register(new BlockDesertPlant(Block.Properties.create(Material.PLANTS)).setRegistryName("desertplant4"));
			event.getRegistry().register(new BlockDesertPlant(Block.Properties.create(Material.PLANTS)).setRegistryName("desertplant5"));
			event.getRegistry().register(new BlockDesertPlant(Block.Properties.create(Material.PLANTS)).setRegistryName("desertplant6"));
			event.getRegistry().register(new BlockDesertPlant(Block.Properties.create(Material.PLANTS)).setRegistryName("desertplant7"));
			event.getRegistry().register(new BlockDesertPlant(Block.Properties.create(Material.PLANTS)).setRegistryName("desertplant8"));
			event.getRegistry().register(new BlockDesertPlant(Block.Properties.create(Material.PLANTS)).setRegistryName("desertplant9"));
			event.getRegistry().register(new BlockDesertPlant(Block.Properties.create(Material.PLANTS)).setRegistryName("desertplant10"));
			event.getRegistry().register(new BlockDesertPlant(Block.Properties.create(Material.PLANTS)).setRegistryName("desertplant11"));
			event.getRegistry().register(new BlockDesertPlant(Block.Properties.create(Material.PLANTS)).setRegistryName("desertplant12"));
			event.getRegistry().register(new BlockDesertPlant(Block.Properties.create(Material.PLANTS)).setRegistryName("desertplant13"));
			event.getRegistry().register(new BlockDesertPlant(Block.Properties.create(Material.PLANTS)).setRegistryName("desertplant14"));
			event.getRegistry().register(new BlockDesertPlant(Block.Properties.create(Material.PLANTS)).setRegistryName("desertplant15"));
			event.getRegistry().register(new BlockDesertPlant(Block.Properties.create(Material.PLANTS)).setRegistryName("desertplant16"));
			event.getRegistry().register(new BlockDesertPlant(Block.Properties.create(Material.PLANTS)).setRegistryName("desertplant17"));
			event.getRegistry().register(new BlockDesertPlant(Block.Properties.create(Material.PLANTS)).setRegistryName("desertplant18"));
			event.getRegistry().register(new BlockDesertPlant(Block.Properties.create(Material.PLANTS)).setRegistryName("desertplant19"));
			event.getRegistry().register(new BlockDesertPlant(Block.Properties.create(Material.PLANTS)).setRegistryName("desertplant20"));
		}

		@SubscribeEvent
		public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {

			@SuppressWarnings("unused")
			net.minecraft.item.Item.Properties properties = new Item.Properties().group(setup.itemGroup);

			//Cactus Arnor & Tools
			event.getRegistry().register(new ItemPamCactusArmor(CactusArmorMaterial.CACTUS, EquipmentSlotType.HEAD,new Item.Properties().maxStackSize(1).group(setup.itemGroup))
				.setRegistryName("cactushelmitem"));
			event.getRegistry().register(new ItemPamCactusArmor(CactusArmorMaterial.CACTUS, EquipmentSlotType.CHEST,new Item.Properties().maxStackSize(1).group(setup.itemGroup))
				.setRegistryName("cactuschestitem"));
			event.getRegistry().register(new ItemPamCactusArmor(CactusArmorMaterial.CACTUS, EquipmentSlotType.LEGS,new Item.Properties().maxStackSize(1).group(setup.itemGroup))
				.setRegistryName("cactuslegsitem"));
			event.getRegistry().register(new ItemPamCactusArmor(CactusArmorMaterial.CACTUS, EquipmentSlotType.FEET,new Item.Properties().maxStackSize(1).group(setup.itemGroup))
				.setRegistryName("cactusbootsitem"));
			
			event.getRegistry().register(new ItemPamAxe(ItemTier.WOOD, 7, 0.8F, new Item.Properties().maxStackSize(1).group(setup.itemGroup))
				.setRegistryName("cactusaxeitem"));
			event.getRegistry().register(new ItemPamHoe(ItemTier.WOOD, 1, new Item.Properties().maxStackSize(1).group(setup.itemGroup))
				.setRegistryName("cactushoeitem"));
			event.getRegistry().register(new ItemPamPickaxe(ItemTier.WOOD, 2, 1.2F,new Item.Properties().maxStackSize(1).group(setup.itemGroup))
				.setRegistryName("cactuspickaxeitem"));
			event.getRegistry().register(new ItemPamShovel(ItemTier.WOOD, 2.5F, 1F,new Item.Properties().maxStackSize(1).group(setup.itemGroup))
				.setRegistryName("cactusshovelitem"));
			event.getRegistry().register(new ItemPamSword(ItemTier.WOOD, 4, 1.6F,new Item.Properties().maxStackSize(1).group(setup.itemGroup))
				.setRegistryName("cactussworditem"));
			
			//Sandstone Tools
			event.getRegistry().register(new ItemPamAxe(ItemTier.STONE, 9, 0.8F,new Item.Properties().maxStackSize(1).group(setup.itemGroup))
				.setRegistryName("sandstoneaxeitem"));
			event.getRegistry().register(new ItemPamHoe(ItemTier.STONE, 1, new Item.Properties().maxStackSize(1).group(setup.itemGroup))
				.setRegistryName("sandstonehoeitem"));
			event.getRegistry().register(new ItemPamPickaxe(ItemTier.STONE, 3, 1.2F,new Item.Properties().maxStackSize(1).group(setup.itemGroup))
				.setRegistryName("sandstonepickaxeitem"));
			event.getRegistry().register(new ItemPamShovel(ItemTier.STONE, 3.5F, 1F,new Item.Properties().maxStackSize(1).group(setup.itemGroup))
				.setRegistryName("sandstoneshovelitem"));
			event.getRegistry().register(new ItemPamSword(ItemTier.STONE, 5, 1.6F,new Item.Properties().maxStackSize(1).group(setup.itemGroup))
				.setRegistryName("sandstonesworditem"));

			//Glass Steel Tools & Ingot & Block
			event.getRegistry().register(new ItemPamAxe(ItemTier.GOLD, 7, 1.0F, new Item.Properties().maxStackSize(1).group(setup.itemGroup))
				.setRegistryName("glasssteelaxeitem"));
			event.getRegistry().register(new ItemPamHoe(ItemTier.GOLD, 1, new Item.Properties().maxStackSize(1).group(setup.itemGroup))
				.setRegistryName("glasssteelhoeitem"));
			event.getRegistry().register(new ItemPamPickaxe(ItemTier.GOLD, 2, 1.2F,new Item.Properties().maxStackSize(1).group(setup.itemGroup))
				.setRegistryName("glasssteelpickaxeitem"));
			event.getRegistry().register(new ItemPamShovel(ItemTier.GOLD, 2.5F, 1F,new Item.Properties().maxStackSize(1).group(setup.itemGroup))
				.setRegistryName("glasssteelshovelitem"));
			event.getRegistry().register(new ItemPamSword(ItemTier.GOLD, 4, 1.6F,new Item.Properties().maxStackSize(1).group(setup.itemGroup))
				.setRegistryName("glasssteelsworditem"));

			event.getRegistry().register(new Item(new Item.Properties().group(setup.itemGroup))
				.setRegistryName("glasssteelingotitem"));

			event.getRegistry().register(new BlockItem(Desertcraft.glasssteel, new Item.Properties().group(setup.itemGroup))
				.setRegistryName("glasssteel"));

			//Desert Plants
			event.getRegistry().register(new BlockItem(Desertcraft.desertplant1, new Item.Properties().group(setup.itemGroup))
				.setRegistryName("desertplant1"));
			event.getRegistry().register(new BlockItem(Desertcraft.desertplant2, new Item.Properties().group(setup.itemGroup))
				.setRegistryName("desertplant2"));
			event.getRegistry().register(new BlockItem(Desertcraft.desertplant3, new Item.Properties().group(setup.itemGroup))
				.setRegistryName("desertplant3"));
			event.getRegistry().register(new BlockItem(Desertcraft.desertplant4, new Item.Properties().group(setup.itemGroup))
				.setRegistryName("desertplant4"));
			event.getRegistry().register(new BlockItem(Desertcraft.desertplant5, new Item.Properties().group(setup.itemGroup))
				.setRegistryName("desertplant5"));
			event.getRegistry().register(new BlockItem(Desertcraft.desertplant6, new Item.Properties().group(setup.itemGroup))
				.setRegistryName("desertplant6"));
			event.getRegistry().register(new BlockItem(Desertcraft.desertplant7, new Item.Properties().group(setup.itemGroup))
				.setRegistryName("desertplant7"));
			event.getRegistry().register(new BlockItem(Desertcraft.desertplant8, new Item.Properties().group(setup.itemGroup))
				.setRegistryName("desertplant8"));
			event.getRegistry().register(new BlockItem(Desertcraft.desertplant9, new Item.Properties().group(setup.itemGroup))
				.setRegistryName("desertplant9"));
			event.getRegistry().register(new BlockItem(Desertcraft.desertplant10, new Item.Properties().group(setup.itemGroup))
				.setRegistryName("desertplant10"));
			event.getRegistry().register(new BlockItem(Desertcraft.desertplant11, new Item.Properties().group(setup.itemGroup))
				.setRegistryName("desertplant11"));
			event.getRegistry().register(new BlockItem(Desertcraft.desertplant12, new Item.Properties().group(setup.itemGroup))
				.setRegistryName("desertplant12"));
			event.getRegistry().register(new BlockItem(Desertcraft.desertplant13, new Item.Properties().group(setup.itemGroup))
				.setRegistryName("desertplant13"));
			event.getRegistry().register(new BlockItem(Desertcraft.desertplant14, new Item.Properties().group(setup.itemGroup))
				.setRegistryName("desertplant14"));
			event.getRegistry().register(new BlockItem(Desertcraft.desertplant15, new Item.Properties().group(setup.itemGroup))
				.setRegistryName("desertplant15"));
			event.getRegistry().register(new BlockItem(Desertcraft.desertplant16, new Item.Properties().group(setup.itemGroup))
				.setRegistryName("desertplant16"));
			event.getRegistry().register(new BlockItem(Desertcraft.desertplant17, new Item.Properties().group(setup.itemGroup))
				.setRegistryName("desertplant17"));
			event.getRegistry().register(new BlockItem(Desertcraft.desertplant18, new Item.Properties().group(setup.itemGroup))
				.setRegistryName("desertplant18"));
			event.getRegistry().register(new BlockItem(Desertcraft.desertplant19, new Item.Properties().group(setup.itemGroup))
				.setRegistryName("desertplant19"));
			event.getRegistry().register(new BlockItem(Desertcraft.desertplant20, new Item.Properties().group(setup.itemGroup))
				.setRegistryName("desertplant20"));
			
		}

	}

}
