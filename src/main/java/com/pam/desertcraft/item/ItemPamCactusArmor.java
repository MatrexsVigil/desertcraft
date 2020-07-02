package com.pam.desertcraft.item;

import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemPamCactusArmor extends ArmorItem {
	public ItemPamCactusArmor(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builder) {
		super(materialIn, slot, builder);
	}

	public void onCreated(ItemStack ItemStack, World World, PlayerEntity PlayerEntity) {
		ItemStack.addEnchantment(Enchantments.THORNS, 1);
	}

}
