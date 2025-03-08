package net.drenough.create_chocolate.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    // Chocolate Food
    public static final FoodProperties FULL_CHOCOLATE_BAR = new FoodProperties.Builder()
            .nutrition(12)
            .saturationModifier(1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 1.0f) // Speed boost for 30 seconds
            .build();
    public static final FoodProperties CHOCOLATE_MARSHMALLOW = new FoodProperties.Builder().nutrition(6)
            .saturationModifier(0.6f).build();
    public static final FoodProperties CHOCOLATE_BUNNY = new FoodProperties.Builder().nutrition(8)
            .saturationModifier(0.8f).build();
    public static final FoodProperties CHOCOLATE_EGG = new FoodProperties.Builder().nutrition(4).fast()
            .saturationModifier(0.4f).build();
    public static final FoodProperties CHOCOLATE_PRALINE = new FoodProperties.Builder().nutrition(8)
            .saturationModifier(0.8f).build();
    public static final FoodProperties CHOCOLATE_TRUFFLE = new FoodProperties.Builder().nutrition(10)
            .saturationModifier(1.0f).build();
    public static final FoodProperties HOT_CHOCOLATE_DRINK = new FoodProperties.Builder().nutrition(4)
            .saturationModifier(0.4f).build();
    public static final FoodProperties GINGER_BREAD_MAN = new FoodProperties.Builder().nutrition(6)
            .saturationModifier(0.5f).build();
    public static final FoodProperties GINGER_BREAD = new FoodProperties.Builder().nutrition(5)
            .saturationModifier(0.4f).build();
    public static final FoodProperties CHOCOLATED_APPLE = new FoodProperties.Builder().nutrition(10)
            .saturationModifier(1.2f).build();
    public static final FoodProperties CHOCOLATE_CAKE_FOOD = new FoodProperties.Builder()
            .nutrition(8)
            .saturationModifier(0.6f)
            .build();
    // Dark Chocolate Food
    public static final FoodProperties BAR_OF_DARK_CHOCOLATE = new FoodProperties.Builder().nutrition(6)
            .saturationModifier(0.4f).build();
    public static final FoodProperties FULL_DARK_CHOCOLATE_BAR = new FoodProperties.Builder()
            .nutrition(12)
            .saturationModifier(1.2f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 0), 1.0f) // Resistance for 30 seconds
            .build();
    public static final FoodProperties DARK_CHOCOLATE_MARSHMALLOW = new FoodProperties.Builder().nutrition(6)
            .saturationModifier(0.7f).build();
    public static final FoodProperties DARK_CHOCOLATE_BUNNY = new FoodProperties.Builder().nutrition(8)
            .saturationModifier(1.0f).build();
    public static final FoodProperties DARK_CHOCOLATE_EGG = new FoodProperties.Builder().nutrition(4).fast()
            .saturationModifier(0.5f).build();
    public static final FoodProperties DARK_CHOCOLATE_GLAZED_BERRIES = new FoodProperties.Builder().nutrition(3).fast()
            .saturationModifier(0.4f).build();
    public static final FoodProperties DARK_CHOCOLATE_PRALINE = new FoodProperties.Builder().nutrition(8)
            .saturationModifier(0.9f).build();
    public static final FoodProperties DARK_CHOCOLATE_TRUFFLE = new FoodProperties.Builder().nutrition(10)
            .saturationModifier(1.2f).build();
    public static final FoodProperties HOT_DARK_CHOCOLATE_DRINK = new FoodProperties.Builder().nutrition(4)
            .saturationModifier(0.5f).build();
    public static final FoodProperties DARK_CHOCOLATE_COOKIE = new FoodProperties.Builder().nutrition(3)
            .saturationModifier(0.3f).build();
    public static final FoodProperties DARK_CHOCOLATED_APPLE = new FoodProperties.Builder().nutrition(10)
            .saturationModifier(1.4f).build();
    public static final FoodProperties DARK_CHOCOLATE_CAKE_FOOD = new FoodProperties.Builder()
            .nutrition(8)
            .saturationModifier(0.7f)
            .build();
    // White Chocolate Food
    public static final FoodProperties BAR_OF_WHITE_CHOCOLATE = new FoodProperties.Builder().nutrition(6)
            .saturationModifier(0.3f).build();
    public static final FoodProperties FULL_WHITE_CHOCOLATE_BAR = new FoodProperties.Builder()
            .nutrition(12)
            .saturationModifier(1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.JUMP, 600, 0), 1.0f) // Jump Boost for 30 seconds
            .build();
    public static final FoodProperties WHITE_CHOCOLATE_MARSHMALLOW = new FoodProperties.Builder().nutrition(6)
            .saturationModifier(0.6f).build();
    public static final FoodProperties WHITE_CHOCOLATE_BUNNY = new FoodProperties.Builder().nutrition(8)
            .saturationModifier(0.8f).build();
    public static final FoodProperties WHITE_CHOCOLATE_EGG = new FoodProperties.Builder().nutrition(4).fast()
            .saturationModifier(0.4f).build();
    public static final FoodProperties WHITE_CHOCOLATE_GLAZED_BERRIES = new FoodProperties.Builder().nutrition(3).fast()
            .saturationModifier(0.3f).build();
    public static final FoodProperties WHITE_CHOCOLATE_PRALINE = new FoodProperties.Builder().nutrition(8)
            .saturationModifier(0.8f).build();
    public static final FoodProperties WHITE_CHOCOLATE_TRUFFLE = new FoodProperties.Builder().nutrition(10)
            .saturationModifier(1.0f).build();
    public static final FoodProperties HOT_WHITE_CHOCOLATE_DRINK = new FoodProperties.Builder().nutrition(4)
            .saturationModifier(0.4f).build();
    public static final FoodProperties WHITE_CHOCOLATE_COOKIE = new FoodProperties.Builder().nutrition(3)
            .saturationModifier(0.2f).build();
    public static final FoodProperties WHITE_CHOCOLATED_APPLE = new FoodProperties.Builder().nutrition(10)
            .saturationModifier(1.2f).build();
    public static final FoodProperties WHITE_CHOCOLATE_CAKE_FOOD = new FoodProperties.Builder()
            .nutrition(8)
            .saturationModifier(0.6f)
            .build();
    // Caramel Food
    public static final FoodProperties BAR_OF_CARAMEL = new FoodProperties.Builder().nutrition(6)
            .saturationModifier(0.4f).build();
    public static final FoodProperties FULL_CARAMEL_BAR = new FoodProperties.Builder()
            .nutrition(12)
            .saturationModifier(1.2f)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 600, 0), 1.0f) // Fire Resistance for 30 seconds
            .build();
    public static final FoodProperties CARAMEL_MARSHMALLOW = new FoodProperties.Builder().nutrition(6)
            .saturationModifier(0.7f).build();
    public static final FoodProperties CARAMEL_BUNNY = new FoodProperties.Builder().nutrition(8)
            .saturationModifier(1.0f).build();
    public static final FoodProperties CARAMEL_EGG = new FoodProperties.Builder().nutrition(4).fast()
            .saturationModifier(0.5f).build();
    public static final FoodProperties CARAMEL_GLAZED_BERRIES = new FoodProperties.Builder().nutrition(3).fast()
            .saturationModifier(0.4f).build();
    public static final FoodProperties CARAMEL_PRALINE = new FoodProperties.Builder().nutrition(8)
            .saturationModifier(0.9f).build();
    public static final FoodProperties CARAMEL_TRUFFLE = new FoodProperties.Builder().nutrition(10)
            .saturationModifier(1.2f).build();
    public static final FoodProperties HOT_CARAMEL_DRINK = new FoodProperties.Builder().nutrition(4)
            .saturationModifier(0.5f).build();
    public static final FoodProperties CARAMEL_COOKIE = new FoodProperties.Builder().nutrition(3)
            .saturationModifier(0.3f).build();
    public static final FoodProperties CARAMELIZED_APPLE = new FoodProperties.Builder().nutrition(10)
            .saturationModifier(1.4f).build();
    public static final FoodProperties CARAMEL_CAKE_FOOD = new FoodProperties.Builder()
            .nutrition(8)
            .saturationModifier(0.7f)
            .build();
    // Royal Chocolate Food
    public static final FoodProperties BAR_OF_ROYAL_CHOCOLATE = new FoodProperties.Builder().nutrition(18)
            .saturationModifier(2.0f).build();
    public static final FoodProperties FULL_ROYAL_CHOCOLATE_BAR = new FoodProperties.Builder()
            .nutrition(32)
            .saturationModifier(4.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1200, 1), 1.0f) // Strength II for 60 seconds
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 600, 1), 1.0f) // Regeneration II for 30 seconds
            .build();
    public static final FoodProperties ROYAL_CHOCOLATE_CAKE_FOOD = new FoodProperties.Builder()
            .nutrition(16)
            .saturationModifier(1.6f)
            .build();
    public static final FoodProperties ROYAL_CHOCOLATE_MARSHMALLOW = new FoodProperties.Builder()
            .nutrition(12)
            .saturationModifier(1.2f)
            .build();
    public static final FoodProperties ROYAL_CHOCOLATE_BUNNY = new FoodProperties.Builder()
            .nutrition(14)
            .saturationModifier(1.8f)
            .build();
    public static final FoodProperties ROYAL_CHOCOLATE_EGG = new FoodProperties.Builder().fast()
            .nutrition(8)
            .saturationModifier(1.0f)
            .build();
    public static final FoodProperties ROYAL_CHOCOLATE_GLAZED_BERRIES = new FoodProperties.Builder().fast()
            .nutrition(6)
            .saturationModifier(0.8f)
            .build();
    public static final FoodProperties ROYAL_CHOCOLATE_PRALINE = new FoodProperties.Builder()
            .nutrition(16)
            .saturationModifier(1.6f)
            .build();
    public static final FoodProperties ROYAL_CHOCOLATE_TRUFFLE = new FoodProperties.Builder()
            .nutrition(18)
            .saturationModifier(2.0f)
            .build();
    public static final FoodProperties HOT_ROYAL_CHOCOLATE_DRINK = new FoodProperties.Builder()
            .nutrition(8)
            .saturationModifier(1.0f)
            .build();
    public static final FoodProperties ROYAL_CHOCOLATE_COOKIE = new FoodProperties.Builder()
            .nutrition(6)
            .saturationModifier(0.6f)
            .build();
    public static final FoodProperties ROYAL_CHOCOLATED_APPLE = new FoodProperties.Builder()
            .nutrition(20)
            .saturationModifier(3.0f)
            .build();
    // Vegan Chocolate
    public static final FoodProperties VEGAN_CHOCOLATE_CAKE_FOOD = new FoodProperties.Builder()
            .nutrition(8)
            .saturationModifier(1.2f)
            .build();
    public static final FoodProperties BAR_OF_VEGAN_CHOCOLATE = new FoodProperties.Builder()
            .nutrition(6)
            .saturationModifier(0.5f)
            .build();
    public static final FoodProperties FULL_VEGAN_CHOCOLATE_BAR = new FoodProperties.Builder()
            .nutrition(12)
            .saturationModifier(1.2f)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 600, 0), 1.0f) // Health Boost for 30 seconds
            .build();
    public static final FoodProperties VEGAN_CHOCOLATE_MARSHMALLOW = new FoodProperties.Builder()
            .nutrition(6)
            .saturationModifier(0.7f)
            .build();
    public static final FoodProperties VEGAN_CHOCOLATE_GLAZED_BERRIES = new FoodProperties.Builder().fast()
            .nutrition(3)
            .saturationModifier(0.4f)
            .build();
    public static final FoodProperties VEGAN_CHOCOLATE_PRALINE = new FoodProperties.Builder()
            .nutrition(8)
            .saturationModifier(0.9f)
            .build();
    public static final FoodProperties VEGAN_CHOCOLATE_TRUFFLE = new FoodProperties.Builder()
            .nutrition(10)
            .saturationModifier(1.2f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 200, 0), 1.0f) // Regeneration I for 10 seconds
            .build();
    public static final FoodProperties HOT_VEGAN_CHOCOLATE_DRINK = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(0.5f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 300, 0), 1.0f) // Speed I for 15 seconds
            .build();
    public static final FoodProperties VEGAN_CHOCOLATE_COOKIE = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(0.3f)
            .build();
    public static final FoodProperties VEGAN_CHOCOLATED_APPLE = new FoodProperties.Builder()
            .nutrition(10)
            .saturationModifier(1.4f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 600, 0), 1.0f) // Absorption I for 30 seconds
            .build();
    // Vanilla Lusk
    public static final FoodProperties VANILLA_LUSK = new FoodProperties.Builder().fast()
            .nutrition(4)
            .saturationModifier(0.4f)
            .effect(() -> new MobEffectInstance(MobEffects.LUCK, 300, 0), 1.0f) // Regeneration for 15 seconds
            .build();
    // Apple Sauce
    public static final FoodProperties APPLE_SAUCE_DRINK = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(0.6f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 0), 1.0f) // Speed I for 10 seconds
            .build();
}
