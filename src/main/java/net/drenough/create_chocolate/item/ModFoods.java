package net.drenough.create_chocolate.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;

import java.util.List;

public class ModFoods {
    // Chocolate Food
    public static final FoodProperties FULL_CHOCOLATE_BAR = new FoodProperties.Builder()
            .nutrition(12)
            .saturationModifier(1.0f)
            .build();
    public static final Consumable FULL_CHOCOLATE_BAR_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SPEED, 600, 0))).build();

    public static final FoodProperties CHOCOLATE_MARSHMALLOW = new FoodProperties.Builder().nutrition(6)
            .saturationModifier(0.6f).build();
    public static final FoodProperties CHOCOLATE_BUNNY = new FoodProperties.Builder().nutrition(8)
            .saturationModifier(0.8f).build();

    public static final FoodProperties CHOCOLATE_EGG = new FoodProperties.Builder().nutrition(4)
            .saturationModifier(0.4f).build();
    public static final Consumable CHOCOLATE_EGG_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(0.8f).build();

    public static final FoodProperties CHOCOLATE_PRALINE = new FoodProperties.Builder().nutrition(8)
            .saturationModifier(0.8f).build();
    public static final FoodProperties CHOCOLATE_TRUFFLE = new FoodProperties.Builder().nutrition(10)
            .saturationModifier(1.0f).build();

    public static final FoodProperties HOT_CHOCOLATE_DRINK = new FoodProperties.Builder().nutrition(4)
            .saturationModifier(0.4f).build();
    public static final Consumable HOT_CHOCOLATE_DRINK_CONSUMABLE = Consumables.defaultDrink().build();

    public static final FoodProperties GINGER_BREAD_MAN = new FoodProperties.Builder().nutrition(6)
            .saturationModifier(0.5f).build();
    public static final FoodProperties GINGER_BREAD = new FoodProperties.Builder().nutrition(5)
            .saturationModifier(0.4f).build();
    public static final FoodProperties CHOCOLATED_APPLE = new FoodProperties.Builder().nutrition(10)
            .saturationModifier(1.2f).build();
    // Dark Chocolate Food

    // Bar of Dark Chocolate
    public static final FoodProperties BAR_OF_DARK_CHOCOLATE = new FoodProperties.Builder().nutrition(6)
            .saturationModifier(0.4f).build();
    // Full Dark Chocolate Bar
    public static final FoodProperties FULL_DARK_CHOCOLATE_BAR = new FoodProperties.Builder()
            .nutrition(12)
            .saturationModifier(1.2f)
            .build();
    public static final Consumable FULL_DARK_CHOCOLATE_BAR_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.RESISTANCE, 600, 0))).build();
    // Dark Chocolate Marshmallow
    public static final FoodProperties DARK_CHOCOLATE_MARSHMALLOW = new FoodProperties.Builder().nutrition(6)
            .saturationModifier(0.7f).build();
    public static final FoodProperties DARK_CHOCOLATE_BUNNY = new FoodProperties.Builder().nutrition(8)
            .saturationModifier(1.0f).build();
    // Dark Chocolate Egg
    public static final FoodProperties DARK_CHOCOLATE_EGG = new FoodProperties.Builder().nutrition(4)
            .saturationModifier(0.5f).build();
    public static final Consumable DARK_CHOCOLATE_EGG_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(0.8f).build();
    // Dark Chocolate Glazed Berries
    public static final FoodProperties DARK_CHOCOLATE_GLAZED_BERRIES = new FoodProperties.Builder().nutrition(3)
            .saturationModifier(0.4f).build();
    public static final Consumable DARK_CHOCOLATE_GLAZED_BERRIES_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(0.8f).build();
    // Dark Chocolate Praline
    public static final FoodProperties DARK_CHOCOLATE_PRALINE = new FoodProperties.Builder().nutrition(8)
            .saturationModifier(0.9f).build();
    // Dark Chocolate Truffle
    public static final FoodProperties DARK_CHOCOLATE_TRUFFLE = new FoodProperties.Builder().nutrition(10)
            .saturationModifier(1.2f).build();
    // Hot Dark Chocolate Drink
    public static final FoodProperties HOT_DARK_CHOCOLATE_DRINK = new FoodProperties.Builder().nutrition(4)
            .saturationModifier(0.5f).build();
    public static final Consumable HOT_DARK_CHOCOLATE_DRINK_CONSUMABLE = Consumables.defaultDrink().build();
    // Dark Chocolate Cookie
    public static final FoodProperties DARK_CHOCOLATE_COOKIE = new FoodProperties.Builder().nutrition(3)
            .saturationModifier(0.3f).build();
    // Dark Chocolate Apple
    public static final FoodProperties DARK_CHOCOLATED_APPLE = new FoodProperties.Builder().nutrition(10)
            .saturationModifier(1.4f).build();

    // White Chocolate Food

    // Bar of White Chocolate
    public static final FoodProperties BAR_OF_WHITE_CHOCOLATE = new FoodProperties.Builder().nutrition(6)
            .saturationModifier(0.3f).build();
    // Full White Chocolate Bar
    public static final FoodProperties FULL_WHITE_CHOCOLATE_BAR = new FoodProperties.Builder()
            .nutrition(12)
            .saturationModifier(1.0f)
            .build();
    public static final Consumable FULL_WHITE_CHOCOLATE_BAR_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.JUMP_BOOST, 600, 0))).build();
    // White Chocolate Marshmallow
    public static final FoodProperties WHITE_CHOCOLATE_MARSHMALLOW = new FoodProperties.Builder().nutrition(6)
            .saturationModifier(0.6f).build();
    // White Chocolate Bunny
    public static final FoodProperties WHITE_CHOCOLATE_BUNNY = new FoodProperties.Builder().nutrition(8)
            .saturationModifier(0.8f).build();
    // White Chocolate Egg
    public static final FoodProperties WHITE_CHOCOLATE_EGG = new FoodProperties.Builder().nutrition(4)
            .saturationModifier(0.4f).build();
    public static final Consumable WHITE_CHOCOLATE_EGG_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(0.8f).build();
    // White Chocolate Glazed Berries
    public static final FoodProperties WHITE_CHOCOLATE_GLAZED_BERRIES = new FoodProperties.Builder().nutrition(3)
            .saturationModifier(0.3f).build();
    public static final Consumable WHITE_CHOCOLATE_GLAZED_BERRIES_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(0.8f).build();
    // White Chocolate Praline
    public static final FoodProperties WHITE_CHOCOLATE_PRALINE = new FoodProperties.Builder().nutrition(8)
            .saturationModifier(0.8f).build();
    // White Chocolate Truffle
    public static final FoodProperties WHITE_CHOCOLATE_TRUFFLE = new FoodProperties.Builder().nutrition(10)
            .saturationModifier(1.0f).build();
    // Hot White Chocolate Drink
    public static final FoodProperties HOT_WHITE_CHOCOLATE_DRINK = new FoodProperties.Builder().nutrition(4)
            .saturationModifier(0.4f).build();
    public static final Consumable HOT_WHITE_CHOCOLATE_DRINK_CONSUMABLE = Consumables.defaultDrink().build();
    // White Chocolate Cookie
    public static final FoodProperties WHITE_CHOCOLATE_COOKIE = new FoodProperties.Builder().nutrition(3)
            .saturationModifier(0.2f).build();
    // White Chocolate Apple
    public static final FoodProperties WHITE_CHOCOLATED_APPLE = new FoodProperties.Builder().nutrition(10)
            .saturationModifier(1.2f).build();

    // Caramel Food
    // Bar of Caramel
    public static final FoodProperties BAR_OF_CARAMEL = new FoodProperties.Builder().nutrition(6)
            .saturationModifier(0.4f).build();
    // Full Caramel Bar
    public static final FoodProperties FULL_CARAMEL_BAR = new FoodProperties.Builder()
            .nutrition(12)
            .saturationModifier(1.2f)
            .build();
    public static final Consumable FULL_CARAMEL_BAR_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 600, 0))).build();
    // Caramel Marshmallow
    public static final FoodProperties CARAMEL_MARSHMALLOW = new FoodProperties.Builder().nutrition(6)
            .saturationModifier(0.7f).build();
    // Caramel Bunny
    public static final FoodProperties CARAMEL_BUNNY = new FoodProperties.Builder().nutrition(8)
            .saturationModifier(1.0f).build();
    // Caramel Egg
    public static final FoodProperties CARAMEL_EGG = new FoodProperties.Builder().nutrition(4)
            .saturationModifier(0.5f).build();
    public static final Consumable CARAMEL_EGG_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(0.8f).build();
    // Caramel Glazed Berries
    public static final FoodProperties CARAMEL_GLAZED_BERRIES = new FoodProperties.Builder().nutrition(3)
            .saturationModifier(0.4f).build();
    public static final Consumable CARAMEL_GLAZED_BERRIES_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(0.8f).build();
    // Caramel Praline
    public static final FoodProperties CARAMEL_PRALINE = new FoodProperties.Builder().nutrition(8)
            .saturationModifier(0.9f).build();
    // Caramel Truffle
    public static final FoodProperties CARAMEL_TRUFFLE = new FoodProperties.Builder().nutrition(10)
            .saturationModifier(1.2f).build();
    // Hot Caramel Drink
    public static final FoodProperties HOT_CARAMEL_DRINK = new FoodProperties.Builder().nutrition(4)
            .saturationModifier(0.5f).build();
    public static final Consumable HOT_CARAMEL_DRINK_CONSUMABLE = Consumables.defaultDrink().build();
    // Caramel Cookie
    public static final FoodProperties CARAMEL_COOKIE = new FoodProperties.Builder().nutrition(3)
            .saturationModifier(0.3f).build();
    // Caramelized Apple
    public static final FoodProperties CARAMELIZED_APPLE = new FoodProperties.Builder().nutrition(10)
            .saturationModifier(1.4f).build();

    // Royal Chocolate Food
    // Bar of Royal Chocolate
    public static final FoodProperties BAR_OF_ROYAL_CHOCOLATE = new FoodProperties.Builder().nutrition(18)
            .saturationModifier(2.0f).build();
    // Full Royal Chocolate Bar
    public static final FoodProperties FULL_ROYAL_CHOCOLATE_BAR = new FoodProperties.Builder()
            .nutrition(32)
            .saturationModifier(4.0f)
            .build();
    public static final Consumable FULL_ROYAL_CHOCOLATE_BAR_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(List.of(
                    new MobEffectInstance(MobEffects.STRENGTH, 1200, 1),
                    new MobEffectInstance(MobEffects.REGENERATION, 600, 1)))).build();
    // Royal Chocolate Marshmallow
    public static final FoodProperties ROYAL_CHOCOLATE_MARSHMALLOW = new FoodProperties.Builder()
            .nutrition(12)
            .saturationModifier(1.2f)
            .build();
    // Royal Chocolate Bunny
    public static final FoodProperties ROYAL_CHOCOLATE_BUNNY = new FoodProperties.Builder()
            .nutrition(14)
            .saturationModifier(1.8f)
            .build();
    // Royal Chocolate Egg
    public static final FoodProperties ROYAL_CHOCOLATE_EGG = new FoodProperties.Builder()
            .nutrition(8)
            .saturationModifier(1.0f)
            .build();
    public static final Consumable ROYAL_CHOCOLATE_EGG_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(0.8f).build();
    // Royal Chocolate Glazed Berries
    public static final FoodProperties ROYAL_CHOCOLATE_GLAZED_BERRIES = new FoodProperties.Builder()
            .nutrition(6)
            .saturationModifier(0.8f)
            .build();
    public static final Consumable ROYAL_CHOCOLATE_GLAZED_BERRIES_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(0.8f).build();
    // Royal Chocolate Praline
    public static final FoodProperties ROYAL_CHOCOLATE_PRALINE = new FoodProperties.Builder()
            .nutrition(16)
            .saturationModifier(1.6f)
            .build();
    // Royal Chocolate Truffle
    public static final FoodProperties ROYAL_CHOCOLATE_TRUFFLE = new FoodProperties.Builder()
            .nutrition(18)
            .saturationModifier(2.0f)
            .build();
    // Hot Royal Chocolate Drink
    public static final FoodProperties HOT_ROYAL_CHOCOLATE_DRINK = new FoodProperties.Builder()
            .nutrition(8)
            .saturationModifier(1.0f)
            .build();
    public static final Consumable HOT_ROYAL_CHOCOLATE_DRINK_CONSUMABLE = Consumables.defaultDrink().build();
    // Royal Chocolate Cookie
    public static final FoodProperties ROYAL_CHOCOLATE_COOKIE = new FoodProperties.Builder()
            .nutrition(6)
            .saturationModifier(0.6f)
            .build();
    // Royal Chocolated Apple
    public static final FoodProperties ROYAL_CHOCOLATED_APPLE = new FoodProperties.Builder()
            .nutrition(20)
            .saturationModifier(3.0f)
            .build();

    // Vegan Chocolate
    // Bar of Vegan Chocolate
    public static final FoodProperties BAR_OF_VEGAN_CHOCOLATE = new FoodProperties.Builder()
            .nutrition(6)
            .saturationModifier(0.5f)
            .build();
    // Full Vegan Chocolate Bar
    public static final FoodProperties FULL_VEGAN_CHOCOLATE_BAR = new FoodProperties.Builder()
            .nutrition(12)
            .saturationModifier(1.2f)
            .build();
    public static final Consumable FULL_VEGAN_CHOCOLATE_BAR_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 600, 0))).build();
    // Vegan Chocolate Marshmallow
    public static final FoodProperties VEGAN_CHOCOLATE_MARSHMALLOW = new FoodProperties.Builder()
            .nutrition(6)
            .saturationModifier(0.7f)
            .build();
    // Vegan Chocolate Glazed Berries
    public static final FoodProperties VEGAN_CHOCOLATE_GLAZED_BERRIES = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(0.4f)
            .build();
    public static final Consumable VEGAN_CHOCOLATE_GLAZED_BERRIES_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(0.8f).build();
    // Vegan Chocolate Praline
    public static final FoodProperties VEGAN_CHOCOLATE_PRALINE = new FoodProperties.Builder()
            .nutrition(8)
            .saturationModifier(0.9f)
            .build();
    // Vegan Chocolate Truffle
    public static final FoodProperties VEGAN_CHOCOLATE_TRUFFLE = new FoodProperties.Builder()
            .nutrition(10)
            .saturationModifier(1.2f)
            .build();
    public static final Consumable VEGAN_CHOCOLATE_TRUFFLE_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.REGENERATION, 200, 1))).build();
    // Hot Vegan Chocolate Drink
    public static final FoodProperties HOT_VEGAN_CHOCOLATE_DRINK = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(0.5f)
            .build();
    public static final Consumable HOT_VEGAN_CHOCOLATE_DRINK_CONSUMABLE = Consumables.defaultDrink()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SPEED, 300, 0))).build();
    // Vegan Chocolate Cookie
    public static final FoodProperties VEGAN_CHOCOLATE_COOKIE = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(0.3f)
            .build();
    // Vegan Chocolated Apple
    public static final FoodProperties VEGAN_CHOCOLATED_APPLE = new FoodProperties.Builder()
            .nutrition(10)
            .saturationModifier(1.4f)
            .build();
    public static final Consumable VEGAN_CHOCOLATED_APPLE_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.ABSORPTION, 600, 0))).build();
    // Vanilla Lusk
    public static final FoodProperties VANILLA_LUSK = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(0.4f)
            .build();
    public static final Consumable VANILLA_LUSK_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(0.8f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.LUCK, 300, 0))).build();
    // Apple Sauce
    public static final FoodProperties APPLE_SAUCE_DRINK = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(0.6f)
            .build();
    public static final Consumable APPLE_SAUCE_DRINK_CONSUMABLE = Consumables.defaultDrink()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SPEED, 200, 0))).build();
}
