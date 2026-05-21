package net.drenough.create_chocolate.item;


import net.drenough.create_chocolate.CreateChocolate;
import net.drenough.create_chocolate.util.ModTags;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;
import org.jetbrains.annotations.NotNull;


import java.util.EnumMap;
import java.util.Map;

public class ModArmorMaterials {

    // Hard Chocolate Armor Material
    public static final ArmorMaterial HARD_CHOCOLATE = new ArmorMaterial(
            250,
            makeDefense(2, 3, 5, 2),
            14,
            SoundEvents.ARMOR_EQUIP_LEATHER,
            1.0F,
            0.0F,
            ModTags.Items.REPAIRS_HARD_CHOCOLATE,
            createAssetId("hard_chocolate")
    );

    // Royal Chocolate Armor Material
    public static final ArmorMaterial ROYAL_CHOCOLATE = new ArmorMaterial(
            350,
            makeDefense(3, 6, 8, 3),
            15,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            3.0F,
            0.1F,
            ModTags.Items.REPAIRS_ROYAL_CHOCOLATE,
            createAssetId("royal_chocolate")
    );

    // Helper method to create defense map
    private static Map<ArmorType, Integer> makeDefense(int boots, int legs, int chest, int helmet) {
        Map<ArmorType, Integer> defense = new EnumMap<>(ArmorType.class);
        defense.put(ArmorType.BOOTS, boots);
        defense.put(ArmorType.LEGGINGS, legs);
        defense.put(ArmorType.CHESTPLATE, chest);
        defense.put(ArmorType.HELMET, helmet);
        return defense;
    }

    // Helper method to create equipment asset ID
    private static ResourceKey<@NotNull EquipmentAsset> createAssetId(String name) {
        return ResourceKey.create(
                EquipmentAssets.ROOT_ID,
                Identifier.fromNamespaceAndPath(CreateChocolate.MOD_ID, name)
        );
    }
}