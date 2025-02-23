package net.drenough.create_chocolate.item;

import net.minecraft.core.Holder;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public class ModArmorMaterials {
    // Hard Chocolate Armor Material
    public static final ArmorMaterial HARD_CHOCOLATE_ARMOR = new ArmorMaterial() {
        private static final int[] BASE_DURABILITY = {11, 16, 16, 13}; // Base durability for helmet, chestplate, leggings, boots

        @Override
        public int getDurabilityForType(ArmorItem.Type type) {
            return BASE_DURABILITY[type.ordinal()] * 25; // Durability multiplier
        }

        @Override
        public int getDefenseForType(ArmorItem.Type type) {
            return new int[]{2, 5, 6, 2}[type.ordinal()]; // Protection values for helmet, chestplate, leggings, boots
        }

        @Override
        public int getEnchantmentValue() {
            return 14; // Enchantability
        }

        @Override
        public Holder<SoundEvent> getEquipSound() {
            return SoundEvents.ARMOR_EQUIP_LEATHER; // Sound when equipping
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.of(ModItems.HARD_CHOCOLATE_STICK.get()); // Repair material
        }

        @Override
        public String getName() {
            return "hard_chocolate"; // Name of the armor material
        }

        @Override
        public float getToughness() {
            return 1.0F; // Toughness (extra protection)
        }

        @Override
        public float getKnockbackResistance() {
            return 0.0F; // Knockback resistance
        }
    };

    // Royal Chocolate Armor Material
    public static final ArmorMaterial ROYAL_CHOCOLATE_ARMOR = new ArmorMaterial() {
        private static final int[] BASE_DURABILITY = {11, 16, 16, 13}; // Base durability for helmet, chestplate, leggings, boots

        @Override
        public int getDurabilityForType(ArmorItem.Type type) {
            return BASE_DURABILITY[type.ordinal()] * 35; // Durability multiplier
        }

        @Override
        public int getDefenseForType(ArmorItem.Type type) {
            return new int[]{3, 6, 8, 3}[type.ordinal()]; // Protection values for helmet, chestplate, leggings, boots
        }

        @Override
        public int getEnchantmentValue() {
            return 15; // Enchantability
        }

        @Override
        public Holder<SoundEvent> getEquipSound() {
            return SoundEvents.ARMOR_EQUIP_NETHERITE; // Sound when equipping
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.of(ModItems.BAR_OF_ROYAL_CHOCOLATE.get()); // Repair material
        }

        @Override
        public String getName() {
            return "royal_chocolate"; // Name of the armor material
        }

        @Override
        public float getToughness() {
            return 3.0F; // Toughness (extra protection)
        }

        @Override
        public float getKnockbackResistance() {
            return 0.1F; // Knockback resistance
        }
    };
}
