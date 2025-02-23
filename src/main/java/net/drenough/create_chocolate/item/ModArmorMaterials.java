package net.drenough.create_chocolate.item;

import net.minecraft.core.Holder;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.List;
import java.util.Map;

public class ModArmorMaterials {
    // Hard Chocolate Armor Material
    public static final ArmorMaterial HARD_CHOCOLATE_ARMOR = new ArmorMaterial(
            Map.of(
                    ArmorItem.Type.HELMET, 2,
                    ArmorItem.Type.CHESTPLATE, 5,
                    ArmorItem.Type.LEGGINGS, 6,
                    ArmorItem.Type.BOOTS, 2
            ),
            14, // Enchantability
            Holder.direct(SoundEvents.ARMOR_EQUIP_LEATHER.value()), // Sound when equipping
            () -> Ingredient.of(ModItems.HARD_CHOCOLATE_STICK.get()), // Repair material
            List.of(),
            1.0F, // Toughness
            0.0F // Knockback resistance
    );

    // Royal Chocolate Armor Material
    public static final ArmorMaterial ROYAL_CHOCOLATE_ARMOR = new ArmorMaterial(
            Map.of(
                    ArmorItem.Type.HELMET, 3,
                    ArmorItem.Type.CHESTPLATE, 6,
                    ArmorItem.Type.LEGGINGS, 8,
                    ArmorItem.Type.BOOTS, 3
            ),
            15, // Enchantability
            Holder.direct(SoundEvents.ARMOR_EQUIP_NETHERITE.value()), // Sound when equipping
            () -> Ingredient.of(ModItems.BAR_OF_ROYAL_CHOCOLATE.get()), // Repair material
            List.of(),
            3.0F, // Toughness
            0.1F // Knockback resistance
    );
}