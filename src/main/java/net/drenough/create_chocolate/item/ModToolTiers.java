package net.drenough.create_chocolate.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

public class ModToolTiers {
    // Hard Chocolate Tier
    public static final Tier HARD_CHOCOLATE_TOOL = new Tier() {
        @Override
        public int getUses() {
            return 500; // Durability
        }

        @Override
        public float getSpeed() {
            return 6.0F; // Mining speed
        }

        @Override
        public float getAttackDamageBonus() {
            return 2.0F; // Base attack damage
        }

        @Override
        public int getLevel() {
            return 2; // Harvest level (e.g., 2 = iron level)
        }

        @Override
        public int getEnchantmentValue() {
            return 14; // Enchantability
        }

        @Override
        public @NotNull Ingredient getRepairIngredient() {
            return Ingredient.of(ModItems.HARD_CHOCOLATE_STICK.get()); // Repair material
        }

        @Override
        public TagKey<Block> getTag() {
            return BlockTags.NEEDS_IRON_TOOL; // Blocks this tier can mine
        }
        @Override
        public @NotNull TagKey<Block> getIncorrectBlocksForDrops() {
            return BlockTags.INCORRECT_FOR_IRON_TOOL; // Blocks that won't drop items when mined
        }
    };

    // Royal Chocolate Tier
    public static final Tier ROYAL_CHOCOLATE_TOOL = new Tier() {
        @Override
        public int getUses() {
            return 1561; // Durability
        }

        @Override
        public float getSpeed() {
            return 9.0F; // Mining speed
        }

        @Override
        public float getAttackDamageBonus() {
            return 4.0F; // Base attack damage
        }

        @Override
        public int getLevel() {
            return 3; // Harvest level (e.g., 3 = diamond level)
        }

        @Override
        public int getEnchantmentValue() {
            return 15; // Enchantability
        }

        @Override
        public @NotNull Ingredient getRepairIngredient() {
            return Ingredient.of(ModItems.BAR_OF_ROYAL_CHOCOLATE.get()); // Repair material
        }

        @Override
        public TagKey<Block> getTag() {
            return BlockTags.NEEDS_DIAMOND_TOOL; // Blocks this tier can mine
        }
        @Override
        public @NotNull TagKey<Block> getIncorrectBlocksForDrops() {
            return BlockTags.INCORRECT_FOR_DIAMOND_TOOL; // Blocks that won't drop items when mined
        }
    };
}