package net.drenough.create_chocolate.item;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

public enum ModToolTiers implements Tier {
    ROYAL_CHOCOLATE(3, 1800, 9.0F, 3.0F, 15);

    private final int level;
    private final int uses;
    private final float speed;
    private final float attackDamageBonus;
    private final int enchantmentValue;

    ModToolTiers(int level, int uses, float speed, float attackDamageBonus, int enchantmentValue) {
        this.level = level;
        this.uses = uses;
        this.speed = speed;
        this.attackDamageBonus = attackDamageBonus;
        this.enchantmentValue = enchantmentValue;
    }

    @Override
    public int getUses() {
        return this.uses;
    }

    @Override
    public float getSpeed() {
        return this.speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.attackDamageBonus;
    }

    @Override
    @SuppressWarnings("deprecation") // Suppress the deprecation warning
    public int getLevel() {
        return this.level;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public @NotNull Ingredient getRepairIngredient() {
        return Ingredient.of(ModItems.BAR_OF_ROYAL_CHOCOLATE.get());
    }
}