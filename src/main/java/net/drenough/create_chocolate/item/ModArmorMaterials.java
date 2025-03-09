package net.drenough.create_chocolate.item;

import com.simibubi.create.AllItems;
import net.drenough.create_chocolate.CreateChocolate;
import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {

    // Hard Chocolate Armor Material
    public static final Holder<ArmorMaterial> HARD_CHOCOLATE_ARMOR = register("hard_chocolate",
            Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.CHESTPLATE, 5);
                map.put(ArmorItem.Type.LEGGINGS, 3);
                map.put(ArmorItem.Type.BOOTS, 2);
            }),
            14, // Enchantability
            1.0F, // Toughness
            0.0F, // Knockback resistance
            AllItems.BAR_OF_CHOCOLATE, // Repair material
            Holder.direct(SoundEvents.ARMOR_EQUIP_LEATHER.value()) // Sound when equipping
    );

    // Royal Chocolate Armor Material
    public static final Holder<ArmorMaterial> ROYAL_CHOCOLATE_ARMOR = register("royal_chocolate",
            Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.BOOTS, 3);
            }),
            15, // Enchantability
            3.0F, // Toughness
            0.1F, // Knockback resistance
            ModItems.BAR_OF_ROYAL_CHOCOLATE, // Repair material
            Holder.direct(SoundEvents.ARMOR_EQUIP_NETHERITE.value()) // Sound when equipping
    );


    private static Holder<ArmorMaterial> register(String name, EnumMap<ArmorItem.Type, Integer> typeProtection,
                                                  int enchantability, float toughness, float knockbackResistance,
                                                  Supplier<Item> ingredientItem, Holder<SoundEvent> equipSound) {
        ResourceLocation location = ResourceLocation.fromNamespaceAndPath(CreateChocolate.MOD_ID, name);
        Supplier<Ingredient> ingredient = () -> Ingredient.of(ingredientItem.get());
        List<ArmorMaterial.Layer> layers = List.of(new ArmorMaterial.Layer(location));

        return Registry.registerForHolder(BuiltInRegistries.ARMOR_MATERIAL, location,
                new ArmorMaterial(typeProtection, enchantability, equipSound, ingredient, layers, toughness, knockbackResistance));
    }
}