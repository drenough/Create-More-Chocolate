package net.drenough.create_chocolate.item;

import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties BAR_OF_DARK_CHOCOLATE = new FoodProperties.Builder().nutrition(6)
            .saturationMod(0.3f).build();
    public static final FoodProperties BAR_OF_WHITE_CHOCOLATE = new FoodProperties.Builder().nutrition(6)
            .saturationMod(0.3f).build();
}
