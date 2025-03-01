package net.drenough.create_chocolate.item;

import com.simibubi.create.AllItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
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
            return 2.0F; // Mining speed
        }

        @Override
        public float getAttackDamageBonus() {
            return 1.0F; // Base attack damage
        }

        @Override
        public int getEnchantmentValue() {
            return 14; // Enchantability
        }

        @Override
        public @NotNull Ingredient getRepairIngredient() {
            return Ingredient.of(AllItems.BAR_OF_CHOCOLATE.get()); // Repair material
        }

        @Override
        public @NotNull TagKey<Block> getIncorrectBlocksForDrops() {
            return BlockTags.NEEDS_IRON_TOOL; // Blocks that won't drop items when mined
        }
    };

    // Royal Chocolate Tier
    public static final Tier ROYAL_CHOCOLATE_TOOL = new Tier() {
        @Override
        public int getUses() {
            return 1800; // Durability
        }

        @Override
        public float getSpeed() {
            return 9.0F; // Mining speed
        }

        @Override
        public float getAttackDamageBonus() {
            return 3.0F; // Base attack damage
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
        public @NotNull TagKey<Block> getIncorrectBlocksForDrops() {
            // Use a custom tag to allow mining all blocks
            return TagKey.create(Registries.BLOCK, ResourceLocation.parse("create_chocolate:needs_royal_chocolate_tool"));
    }
    };
}