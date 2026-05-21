package net.drenough.create_chocolate.item;

import net.drenough.create_chocolate.CreateChocolate;
import net.drenough.create_chocolate.block.ModBlocks;
import net.drenough.create_chocolate.fluid.ModFluids;
import net.minecraft.world.item.*;
import net.minecraft.world.item.equipment.ArmorType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;
import java.util.function.Supplier;

@SuppressWarnings("all")
public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CreateChocolate.MOD_ID);

    // Chocolate Related Items

    public static final DeferredItem<Item> FULL_CHOCOLATE_BAR = registerItem("full_chocolate_bar",
            props -> new Item(props.food(ModFoods.FULL_CHOCOLATE_BAR, ModFoods.FULL_CHOCOLATE_BAR_CONSUMABLE)),
            () -> new Item.Properties());

    public static final DeferredItem<Item> CHOCOLATE_MARSHMALLOW = registerSimpleItem("chocolate_marshmallow",
            () -> new Item.Properties().food(ModFoods.CHOCOLATE_MARSHMALLOW));
    public static final DeferredItem<Item> CHOCOLATE_BUNNY = registerSimpleItem("chocolate_bunny",
            () -> new Item.Properties().food(ModFoods.CHOCOLATE_BUNNY));

    public static final DeferredItem<Item> CHOCOLATE_EGG = registerItem("chocolate_egg",
            props -> new Item(props.food(ModFoods.CHOCOLATE_EGG, ModFoods.CHOCOLATE_EGG_CONSUMABLE)),
            () -> new Item.Properties());

    public static final DeferredItem<Item> CHOCOLATE_PRALINE = registerSimpleItem("chocolate_praline",
            () -> new Item.Properties().food(ModFoods.CHOCOLATE_PRALINE));
    public static final DeferredItem<Item> CHOCOLATE_TRUFFLE = registerSimpleItem("chocolate_truffle",
            () -> new Item.Properties().food(ModFoods.CHOCOLATE_TRUFFLE));

    public static final DeferredItem<Item> HOT_CHOCOLATE_DRINK = registerItem("hot_chocolate_drink",
            props -> new Item(props
                    .food(ModFoods.HOT_CHOCOLATE_DRINK, ModFoods.HOT_CHOCOLATE_DRINK_CONSUMABLE)
                    .craftRemainder(Items.GLASS_BOTTLE)),
            () -> new Item.Properties());

    public static final DeferredItem<Item> GINGER_BREAD_MAN = registerSimpleItem("ginger_bread_man",
            () -> new Item.Properties().food(ModFoods.GINGER_BREAD_MAN));
    public static final DeferredItem<Item> GINGER_BREAD = registerSimpleItem("ginger_bread",
            () -> new Item.Properties().food(ModFoods.GINGER_BREAD));
    public static final DeferredItem<Item> CHOCOLATED_APPLE = registerSimpleItem("chocolated_apple",
            () -> new Item.Properties().food(ModFoods.CHOCOLATED_APPLE));
    // Chocolate Cake
    public static final DeferredItem<Item> CHOCOLATE_CAKE_ITEM = registerItem("chocolate_cake",
            props -> new BlockItem(ModBlocks.CHOCOLATE_CAKE.get(), props),
            () -> new Item.Properties());

    // Dark Chocolate Items
    // Bar of Dark Chocolate
    public static final DeferredItem<Item> BAR_OF_DARK_CHOCOLATE = registerSimpleItem("bar_of_dark_chocolate",
            () -> new Item.Properties().food(ModFoods.BAR_OF_DARK_CHOCOLATE));
    // Full Dark Chocolate Bar
    public static final DeferredItem<Item> FULL_DARK_CHOCOLATE_BAR = registerItem("full_dark_chocolate_bar",
            props -> new Item(props.food(ModFoods.FULL_DARK_CHOCOLATE_BAR, ModFoods.FULL_DARK_CHOCOLATE_BAR_CONSUMABLE)),
            () -> new Item.Properties());
    // Dark Chocolate Marshmallow
    public static final DeferredItem<Item> DARK_CHOCOLATE_MARSHMALLOW = registerSimpleItem("dark_chocolate_marshmallow",
            () -> new Item.Properties().food(ModFoods.DARK_CHOCOLATE_MARSHMALLOW));
    public static final DeferredItem<Item> DARK_CHOCOLATE_BUNNY = registerSimpleItem("dark_chocolate_bunny",
            () -> new Item.Properties().food(ModFoods.DARK_CHOCOLATE_BUNNY));
    // Dark Chocolate Egg
    public static final DeferredItem<Item> DARK_CHOCOLATE_EGG = registerItem("dark_chocolate_egg",
            props -> new Item(props.food(ModFoods.DARK_CHOCOLATE_EGG, ModFoods.DARK_CHOCOLATE_EGG_CONSUMABLE)),
            () -> new Item.Properties());
    // Dark Chocolate Glazed Berries
    public static final DeferredItem<Item> DARK_CHOCOLATE_GLAZED_BERRIES = registerItem("dark_chocolate_glazed_berries",
            props -> new Item(props.food(ModFoods.DARK_CHOCOLATE_GLAZED_BERRIES, ModFoods.DARK_CHOCOLATE_GLAZED_BERRIES_CONSUMABLE)),
            () -> new Item.Properties());
    // Dark Chocolate Praline
    public static final DeferredItem<Item> DARK_CHOCOLATE_PRALINE = registerSimpleItem("dark_chocolate_praline",
            () -> new Item.Properties().food(ModFoods.DARK_CHOCOLATE_PRALINE));
    // Dark Chocolate Truffle
    public static final DeferredItem<Item> DARK_CHOCOLATE_TRUFFLE = registerSimpleItem("dark_chocolate_truffle",
            () -> new Item.Properties().food(ModFoods.DARK_CHOCOLATE_TRUFFLE));
    // Hot Dark Chocolate Drink
    public static final DeferredItem<Item> HOT_DARK_CHOCOLATE_DRINK = registerItem("hot_dark_chocolate_drink",
            props -> new Item(props
                    .food(ModFoods.HOT_DARK_CHOCOLATE_DRINK, ModFoods.HOT_DARK_CHOCOLATE_DRINK_CONSUMABLE)
                    .craftRemainder(Items.GLASS_BOTTLE)),
            () -> new Item.Properties());
    // Dark Chocolate Cookie
    public static final DeferredItem<Item> DARK_CHOCOLATE_COOKIE = registerSimpleItem("dark_chocolate_cookie",
            () -> new Item.Properties().food(ModFoods.DARK_CHOCOLATE_COOKIE));
    // Dark Chocolate Bucket
    public static final DeferredItem<Item> DARK_CHOCOLATE_BUCKET = registerItem("dark_chocolate_bucket",
            props -> new BucketItem(ModFluids.SOURCE_DARK_CHOCOLATE_FLUID.get(), props.stacksTo(1).craftRemainder(Items.BUCKET)),
            () -> new Item.Properties());
    // Dark Chocolate Apple
    public static final DeferredItem<Item> DARK_CHOCOLATED_APPLE = registerSimpleItem("dark_chocolated_apple",
            () -> new Item.Properties().food(ModFoods.DARK_CHOCOLATED_APPLE));
    // Dark Chocolate Cake
    public static final DeferredItem<Item> DARK_CHOCOLATE_CAKE_ITEM = registerItem("dark_chocolate_cake",
            props -> new BlockItem(ModBlocks.DARK_CHOCOLATE_CAKE.get(), props),
            () -> new Item.Properties());

    // White Chocolate Related Items
    // Bar of White Chocolate
    public static final DeferredItem<Item> BAR_OF_WHITE_CHOCOLATE = registerSimpleItem("bar_of_white_chocolate",
            () -> new Item.Properties().food(ModFoods.BAR_OF_WHITE_CHOCOLATE));
    // Full White Chocolate Bar
    public static final DeferredItem<Item> FULL_WHITE_CHOCOLATE_BAR = registerItem("full_white_chocolate_bar",
            props -> new Item(props.food(ModFoods.FULL_WHITE_CHOCOLATE_BAR, ModFoods.FULL_WHITE_CHOCOLATE_BAR_CONSUMABLE)),
            () -> new Item.Properties());
    // White Chocolate Marshmallow
    public static final DeferredItem<Item> WHITE_CHOCOLATE_MARSHMALLOW = registerSimpleItem("white_chocolate_marshmallow",
            () -> new Item.Properties().food(ModFoods.WHITE_CHOCOLATE_MARSHMALLOW));
    // White Chocolate Bunny
    public static final DeferredItem<Item> WHITE_CHOCOLATE_BUNNY = registerSimpleItem("white_chocolate_bunny",
            () -> new Item.Properties().food(ModFoods.WHITE_CHOCOLATE_BUNNY));
    // White Chocolate Egg
    public static final DeferredItem<Item> WHITE_CHOCOLATE_EGG = registerItem("white_chocolate_egg",
            props -> new Item(props.food(ModFoods.WHITE_CHOCOLATE_EGG, ModFoods.WHITE_CHOCOLATE_EGG_CONSUMABLE)),
            () -> new Item.Properties());
    // White Chocolate Glazed Berries
    public static final DeferredItem<Item> WHITE_CHOCOLATE_GLAZED_BERRIES = registerItem("white_chocolate_glazed_berries",
            props -> new Item(props.food(ModFoods.WHITE_CHOCOLATE_GLAZED_BERRIES, ModFoods.WHITE_CHOCOLATE_GLAZED_BERRIES_CONSUMABLE)),
            () -> new Item.Properties());
    // White Chocolate Praline
    public static final DeferredItem<Item> WHITE_CHOCOLATE_PRALINE = registerSimpleItem("white_chocolate_praline",
            () -> new Item.Properties().food(ModFoods.WHITE_CHOCOLATE_PRALINE));
    // White Chocolate Truffle
    public static final DeferredItem<Item> WHITE_CHOCOLATE_TRUFFLE = registerSimpleItem("white_chocolate_truffle",
            () -> new Item.Properties().food(ModFoods.WHITE_CHOCOLATE_TRUFFLE));
    // Hot White Chocolate Drink
    public static final DeferredItem<Item> HOT_WHITE_CHOCOLATE_DRINK = registerItem("hot_white_chocolate_drink",
            props -> new Item(props
                    .food(ModFoods.HOT_WHITE_CHOCOLATE_DRINK, ModFoods.HOT_WHITE_CHOCOLATE_DRINK_CONSUMABLE)
                    .craftRemainder(Items.GLASS_BOTTLE)),
            () -> new Item.Properties());
    // White Chocolate Cookie
    public static final DeferredItem<Item> WHITE_CHOCOLATE_COOKIE = registerSimpleItem("white_chocolate_cookie",
            () -> new Item.Properties().food(ModFoods.WHITE_CHOCOLATE_COOKIE));
    // White Chocolate Bucket
    public static final DeferredItem<Item> WHITE_CHOCOLATE_BUCKET = registerItem("white_chocolate_bucket",
            props -> new BucketItem(ModFluids.SOURCE_WHITE_CHOCOLATE_FLUID.get(), props.stacksTo(1).craftRemainder(Items.BUCKET)),
            () -> new Item.Properties());
    // White Chocolate Apple
    public static final DeferredItem<Item> WHITE_CHOCOLATED_APPLE = registerSimpleItem("white_chocolated_apple",
            () -> new Item.Properties().food(ModFoods.WHITE_CHOCOLATED_APPLE));
    // White Chocolate Cake
    public static final DeferredItem<Item> WHITE_CHOCOLATE_CAKE_ITEM = registerItem("white_chocolate_cake",
            props -> new BlockItem(ModBlocks.WHITE_CHOCOLATE_CAKE.get(), props),
            () -> new Item.Properties());

    // Caramel Related Items
    // Bar of Caramel
    public static final DeferredItem<Item> BAR_OF_CARAMEL = registerSimpleItem("bar_of_caramel",
            () -> new Item.Properties().food(ModFoods.BAR_OF_CARAMEL));
    // Full Caramel Bar
    public static final DeferredItem<Item> FULL_CARAMEL_BAR = registerItem("full_caramel_bar",
            props -> new Item(props.food(ModFoods.FULL_CARAMEL_BAR, ModFoods.FULL_CARAMEL_BAR_CONSUMABLE)),
            () -> new Item.Properties());
    // Caramel Marshmallow
    public static final DeferredItem<Item> CARAMEL_MARSHMALLOW = registerSimpleItem("caramel_marshmallow",
            () -> new Item.Properties().food(ModFoods.CARAMEL_MARSHMALLOW));
    // Caramel Bunny
    public static final DeferredItem<Item> CARAMEL_BUNNY = registerSimpleItem("caramel_bunny",
            () -> new Item.Properties().food(ModFoods.CARAMEL_BUNNY));
    // Caramel Egg
    public static final DeferredItem<Item> CARAMEL_EGG = registerItem("caramel_egg",
            props -> new Item(props.food(ModFoods.CARAMEL_EGG, ModFoods.CARAMEL_EGG_CONSUMABLE)),
            () -> new Item.Properties());
    // Caramel Glazed Berries
    public static final DeferredItem<Item> CARAMEL_GLAZED_BERRIES = registerItem("caramel_glazed_berries",
            props -> new Item(props.food(ModFoods.CARAMEL_GLAZED_BERRIES, ModFoods.CARAMEL_GLAZED_BERRIES_CONSUMABLE)),
            () -> new Item.Properties());
    // Caramel Praline
    public static final DeferredItem<Item> CARAMEL_PRALINE = registerSimpleItem("caramel_praline",
            () -> new Item.Properties().food(ModFoods.CARAMEL_PRALINE));
    // Caramel Truffle
    public static final DeferredItem<Item> CARAMEL_TRUFFLE = registerSimpleItem("caramel_truffle",
            () -> new Item.Properties().food(ModFoods.CARAMEL_TRUFFLE));
    // Hot Caramel Drink
    public static final DeferredItem<Item> HOT_CARAMEL_DRINK = registerItem("hot_caramel_drink",
            props -> new Item(props.food(ModFoods.HOT_CARAMEL_DRINK, ModFoods.HOT_CARAMEL_DRINK_CONSUMABLE).craftRemainder(Items.GLASS_BOTTLE)),
            () -> new Item.Properties());
    // Caramel Cookie
    public static final DeferredItem<Item> CARAMEL_COOKIE = registerSimpleItem("caramel_cookie",
            () -> new Item.Properties().food(ModFoods.CARAMEL_COOKIE));
    // Caramel Bucket
    public static final DeferredItem<Item> CARAMEL_BUCKET = registerItem("caramel_bucket",
            props -> new BucketItem(ModFluids.SOURCE_CARAMEL_FLUID.get(), props.stacksTo(1).craftRemainder(Items.BUCKET)),
            () -> new Item.Properties());
    // Caramelized Apple
    public static final DeferredItem<Item> CARAMELIZED_APPLE = registerSimpleItem("caramelized_apple",
            () -> new Item.Properties().food(ModFoods.CARAMELIZED_APPLE));
    // Caramel Cake
    public static final DeferredItem<Item> CARAMEL_CAKE_ITEM = registerItem("caramel_cake",
            props -> new BlockItem(ModBlocks.CARAMEL_CAKE.get(), props),
            () -> new Item.Properties());

    // Cooking Ingredients
    public static final DeferredItem<Item> COCOA_POWDER = registerSimpleItem("cocoa_powder",
            () -> new Item.Properties());
    public static final DeferredItem<Item> COCOA_SMASHED_BEANS = registerSimpleItem("cocoa_smashed_beans",
            () -> new Item.Properties());
    public static final DeferredItem<Item> GINGER_DOUGH = registerSimpleItem("ginger_dough",
            () -> new Item.Properties());
    public static final DeferredItem<Item> DARK_CHOCOLATE_DOUGH = registerSimpleItem("dark_chocolate_dough",
            () -> new Item.Properties());
    public static final DeferredItem<Item> WHITE_CHOCOLATE_DOUGH = registerSimpleItem("white_chocolate_dough",
            () -> new Item.Properties());
    public static final DeferredItem<Item> CARAMEL_DOUGH = registerSimpleItem("caramel_dough",
            () -> new Item.Properties());
    public static final DeferredItem<Item> CHOCOLATE_DOUGH = registerSimpleItem("chocolate_dough",
            () -> new Item.Properties());
    public static final DeferredItem<Item> ROYAL_CHOCOLATE_DOUGH = registerSimpleItem("royal_chocolate_dough",
            () -> new Item.Properties());

    // Dark Chocolate Stick
    public static final DeferredItem<Item> DARK_CHOCOLATE_STICK = registerSimpleItem("dark_chocolate_stick",
            () -> new Item.Properties());

    // White Chocolate Stick
    public static final DeferredItem<Item> WHITE_CHOCOLATE_STICK = registerSimpleItem("white_chocolate_stick",
            () -> new Item.Properties());

    // Caramel Stick
    public static final DeferredItem<Item> CARAMEL_STICK = registerSimpleItem("caramel_stick",
            () -> new Item.Properties());

    // Hard Chocolate Tools

    // Hard Chocolate Stick
    public static final DeferredItem<Item> HARD_CHOCOLATE_STICK = registerSimpleItem("hard_chocolate_stick",
            () -> new Item.Properties());
    // Hard Chocolate Pickaxe
    public static final DeferredItem<Item> HARD_CHOCOLATE_PICKAXE = registerItem("hard_chocolate_pickaxe",
            props -> new Item(props.pickaxe(ModToolTiers.HARD_CHOCOLATE, 1.0F, -2.8F)),
            () -> new Item.Properties());
    // Hard Chocolate Axe
    public static final DeferredItem<Item> HARD_CHOCOLATE_AXE = registerItem("hard_chocolate_axe",
            props -> new AxeItem(ModToolTiers.HARD_CHOCOLATE, 6.0F, -3.0F, props),
            () -> new Item.Properties());
    // Hard Chocolate Sword
    public static final DeferredItem<Item> HARD_CHOCOLATE_SWORD = registerItem("hard_chocolate_sword",
            props -> new Item(props.sword(ModToolTiers.HARD_CHOCOLATE, 3, -2.4F)),
            () -> new Item.Properties());
    // Hard Chocolate Shovel
    public static final DeferredItem<Item> HARD_CHOCOLATE_SHOVEL = registerItem("hard_chocolate_shovel",
            props -> new ShovelItem(ModToolTiers.HARD_CHOCOLATE, 2.0F, -3.0F, props),
            () -> new Item.Properties());
    // Hard Chocolate Hoe
    public static final DeferredItem<Item> HARD_CHOCOLATE_HOE = registerItem("hard_chocolate_hoe",
            props -> new HoeItem(ModToolTiers.HARD_CHOCOLATE, 0.0F, -2.0F, props),
            () -> new Item.Properties());

    // Hard Chocolate Armor

    // Hard Chocolate Helmet
    public static final DeferredItem<Item> HARD_CHOCOLATE_HELMET = registerItem("hard_chocolate_helmet",
            props -> new Item(props.humanoidArmor(ModArmorMaterials.HARD_CHOCOLATE, ArmorType.HELMET)),
            () -> new Item.Properties());
    // Hard Chocolate Chestplate
    public static final DeferredItem<Item> HARD_CHOCOLATE_CHESTPLATE = registerItem("hard_chocolate_chestplate",
            props -> new Item(props.humanoidArmor(ModArmorMaterials.HARD_CHOCOLATE, ArmorType.CHESTPLATE)),
            () -> new Item.Properties());
    // Hard Chocolate Leggings
    public static final DeferredItem<Item> HARD_CHOCOLATE_LEGGINGS = registerItem("hard_chocolate_leggings",
            props -> new Item(props.humanoidArmor(ModArmorMaterials.HARD_CHOCOLATE, ArmorType.LEGGINGS)),
            () -> new Item.Properties());
    // Hard Chocolate Boots
    public static final DeferredItem<Item> HARD_CHOCOLATE_BOOTS = registerItem("hard_chocolate_boots",
            props -> new Item(props.humanoidArmor(ModArmorMaterials.HARD_CHOCOLATE, ArmorType.BOOTS)),
            () -> new Item.Properties());

    // Food Ingredients
    public static final DeferredItem<Item> BUTTER = registerSimpleItem("butter",
            () -> new Item.Properties());
    public static final DeferredItem<Item> COCOA_BUTTER = registerSimpleItem("cocoa_butter",
            () -> new Item.Properties());
    public static final DeferredItem<Item> MILK_POWDER = registerSimpleItem("milk_powder",
            () -> new Item.Properties());
    public static final DeferredItem<Item> CAKE_BASE = registerSimpleItem("cake_base",
            () -> new Item.Properties());
    public static final DeferredItem<Item> CAKE_BASE_BAKED = registerSimpleItem("cake_base_baked",
            () -> new Item.Properties());

    // Royal Chocolate Related Items
    // Bar of Royal Chocolate
    public static final DeferredItem<Item> BAR_OF_ROYAL_CHOCOLATE = registerSimpleItem("bar_of_royal_chocolate",
            () -> new Item.Properties().food(ModFoods.BAR_OF_ROYAL_CHOCOLATE));
    public static final DeferredItem<Item> FULL_ROYAL_CHOCOLATE_BAR = registerItem("full_royal_chocolate_bar",
            props -> new Item(props.food(ModFoods.FULL_ROYAL_CHOCOLATE_BAR, ModFoods.FULL_ROYAL_CHOCOLATE_BAR_CONSUMABLE)),
            () -> new Item.Properties());
    // Royal Chocolate Bucket
    public static final DeferredItem<Item> ROYAL_CHOCOLATE_BUCKET = registerItem("royal_chocolate_bucket",
            props -> new BucketItem(ModFluids.SOURCE_ROYAL_CHOCOLATE_FLUID.get(), props.stacksTo(1).craftRemainder(Items.BUCKET)),
            () -> new Item.Properties());

    // Royal Chocolate Armor
    // Royal Chocolate Helmet
    public static final DeferredItem<Item> ROYAL_CHOCOLATE_HELMET = registerItem("royal_chocolate_helmet",
            props -> new Item(props.humanoidArmor(ModArmorMaterials.ROYAL_CHOCOLATE, ArmorType.HELMET)),
            () -> new Item.Properties());
    // Royal Chocolate Chestplate
    public static final DeferredItem<Item> ROYAL_CHOCOLATE_CHESTPLATE = registerItem("royal_chocolate_chestplate",
            props -> new Item(props.humanoidArmor(ModArmorMaterials.ROYAL_CHOCOLATE, ArmorType.CHESTPLATE)),
            () -> new Item.Properties());
    // Royal Chocolate Leggings
    public static final DeferredItem<Item> ROYAL_CHOCOLATE_LEGGINGS = registerItem("royal_chocolate_leggings",
            props -> new Item(props.humanoidArmor(ModArmorMaterials.ROYAL_CHOCOLATE, ArmorType.LEGGINGS)),
            () -> new Item.Properties());
    // Royal Chocolate Boots
    public static final DeferredItem<Item> ROYAL_CHOCOLATE_BOOTS = registerItem("royal_chocolate_boots",
            props -> new Item(props.humanoidArmor(ModArmorMaterials.ROYAL_CHOCOLATE, ArmorType.BOOTS)),
            () -> new Item.Properties());

    // Royal Chocolate Tools

    // Royal Chocolate Stick
    public static final DeferredItem<Item> ROYAL_CHOCOLATE_STICK = registerSimpleItem("royal_chocolate_stick",
            () -> new Item.Properties());
    // Royal Chocolate Pickaxe
    public static final DeferredItem<Item> ROYAL_CHOCOLATE_PICKAXE = registerItem("royal_chocolate_pickaxe",
            props -> new Item(props.pickaxe(ModToolTiers.ROYAL_CHOCOLATE, 1, -2.8F)),
            () -> new Item.Properties());
    // Royal Chocolate Shovel
    public static final DeferredItem<Item> ROYAL_CHOCOLATE_SHOVEL = registerItem("royal_chocolate_shovel",
            props -> new ShovelItem(ModToolTiers.ROYAL_CHOCOLATE, 1.5F, 3.0F, props),
            () -> new Item.Properties());
    // Royal Chocolate Hoe
    public static final DeferredItem<Item> ROYAL_CHOCOLATE_HOE = registerItem("royal_chocolate_hoe",
            props -> new HoeItem(ModToolTiers.ROYAL_CHOCOLATE, -1, -2.0F, props),
            () -> new Item.Properties());
    // Royal Chocolate Axe
    public static final DeferredItem<Item> ROYAL_CHOCOLATE_AXE = registerItem("royal_chocolate_axe",
            props -> new AxeItem(ModToolTiers.ROYAL_CHOCOLATE, 5.5F, -3.0F, props),
            () -> new Item.Properties());
    // Royal Chocolate Sword
    public static final DeferredItem<Item> ROYAL_CHOCOLATE_SWORD = registerItem("royal_chocolate_sword",
            props -> new Item(props.sword(ModToolTiers.ROYAL_CHOCOLATE, 3, -2.4F)),
            () -> new Item.Properties());

    // Royal Chocolate Food
    // Royal Chocolate Cake
    public static final DeferredItem<Item> ROYAL_CHOCOLATE_CAKE_ITEM = registerItem("royal_chocolate_cake",
            props -> new BlockItem(ModBlocks.ROYAL_CHOCOLATE_CAKE.get(), props),
            () -> new Item.Properties());
    // Royal Chocolate Marshmallow
    public static final DeferredItem<Item> ROYAL_CHOCOLATE_MARSHMALLOW = registerSimpleItem("royal_chocolate_marshmallow",
            () -> new Item.Properties().food(ModFoods.ROYAL_CHOCOLATE_MARSHMALLOW));
    // Royal Chocolate Bunny
    public static final DeferredItem<Item> ROYAL_CHOCOLATE_BUNNY = registerSimpleItem("royal_chocolate_bunny",
            () -> new Item.Properties().food(ModFoods.ROYAL_CHOCOLATE_BUNNY));
    // Royal Chocolate Egg
    public static final DeferredItem<Item> ROYAL_CHOCOLATE_EGG =  registerSimpleItem("royal_chocolate_egg",
            () -> new Item.Properties().food(ModFoods.ROYAL_CHOCOLATE_EGG, ModFoods.ROYAL_CHOCOLATE_EGG_CONSUMABLE));
    // Royal Chocolate Glazed Berries
    public static final DeferredItem<Item> ROYAL_CHOCOLATE_GLAZED_BERRIES = registerSimpleItem("royal_chocolate_glazed_berries",
            () -> new Item.Properties().food(ModFoods.ROYAL_CHOCOLATE_GLAZED_BERRIES, ModFoods.ROYAL_CHOCOLATE_GLAZED_BERRIES_CONSUMABLE));
    // Royal Chocolate Praline
    public static final DeferredItem<Item> ROYAL_CHOCOLATE_PRALINE = registerSimpleItem("royal_chocolate_praline",
            () -> new Item.Properties().food(ModFoods.ROYAL_CHOCOLATE_PRALINE));
    // Royal Chocolate Truffle
    public static final DeferredItem<Item> ROYAL_CHOCOLATE_TRUFFLE = registerSimpleItem("royal_chocolate_truffle",
            () -> new Item.Properties().food(ModFoods.ROYAL_CHOCOLATE_TRUFFLE));
    // Hot Royal Chocolate Drink
    public static final DeferredItem<Item> HOT_ROYAL_CHOCOLATE_DRINK = registerItem("hot_royal_chocolate_drink",
            props -> new Item(props.food(ModFoods.HOT_ROYAL_CHOCOLATE_DRINK, ModFoods.HOT_ROYAL_CHOCOLATE_DRINK_CONSUMABLE).craftRemainder(Items.GLASS_BOTTLE)),
            () -> new Item.Properties());
    // Royal Chocolate Cookie
    public static final DeferredItem<Item> ROYAL_CHOCOLATE_COOKIE = registerSimpleItem("royal_chocolate_cookie",
            () -> new Item.Properties().food(ModFoods.ROYAL_CHOCOLATE_COOKIE));
    // Royal Chocolated Apple
    public static final DeferredItem<Item> ROYAL_CHOCOLATED_APPLE = registerSimpleItem("royal_chocolated_apple",
            () -> new Item.Properties().food(ModFoods.ROYAL_CHOCOLATED_APPLE));

    // Vegan Chocolate
    // Bucket
    public static final DeferredItem<Item> VEGAN_CHOCOLATE_BUCKET = registerItem("vegan_chocolate_bucket",
            props -> new BucketItem(ModFluids.SOURCE_VEGAN_CHOCOLATE_FLUID.get(), props.stacksTo(1).craftRemainder(Items.BUCKET)),
            () -> new Item.Properties());
    // Vegan Chocolate Cake
    public static final DeferredItem<Item> VEGAN_CHOCOLATE_CAKE_ITEM = registerItem("vegan_chocolate_cake",
            props -> new BlockItem(ModBlocks.VEGAN_CHOCOLATE_CAKE.get(), props),
            () -> new Item.Properties());
    // Vegan Chocolate Glazed Berries
    public static final DeferredItem<Item> VEGAN_CHOCOLATE_GLAZED_BERRIES = registerSimpleItem("vegan_chocolate_glazed_berries",
            () -> new Item.Properties().food(ModFoods.VEGAN_CHOCOLATE_GLAZED_BERRIES, ModFoods.VEGAN_CHOCOLATE_GLAZED_BERRIES_CONSUMABLE));
    // Vegan Chocolate Praline
    public static final DeferredItem<Item> VEGAN_CHOCOLATE_PRALINE = registerSimpleItem("vegan_chocolate_praline",
            () -> new Item.Properties().food(ModFoods.VEGAN_CHOCOLATE_PRALINE));
    // Vegan Chocolate Truffle
    public static final DeferredItem<Item> VEGAN_CHOCOLATE_TRUFFLE = registerSimpleItem("vegan_chocolate_truffle",
            () -> new Item.Properties().food(ModFoods.VEGAN_CHOCOLATE_TRUFFLE, ModFoods.VEGAN_CHOCOLATE_TRUFFLE_CONSUMABLE));
    // Hot Vegan Chocolate Drink
    public static final DeferredItem<Item> HOT_VEGAN_CHOCOLATE_DRINK = registerItem("hot_vegan_chocolate_drink",
            props -> new Item(props.food(ModFoods.HOT_VEGAN_CHOCOLATE_DRINK, ModFoods.HOT_VEGAN_CHOCOLATE_DRINK_CONSUMABLE).craftRemainder(Items.GLASS_BOTTLE)),
            () -> new Item.Properties());
    // Vegan Chocolate Cookie
    public static final DeferredItem<Item> VEGAN_CHOCOLATE_COOKIE = registerSimpleItem("vegan_chocolate_cookie",
            () -> new Item.Properties().food(ModFoods.VEGAN_CHOCOLATE_COOKIE));
    // Vegan Chocolated Apple
    public static final DeferredItem<Item> VEGAN_CHOCOLATED_APPLE = registerSimpleItem("vegan_chocolated_apple",
            () -> new Item.Properties().food(ModFoods.VEGAN_CHOCOLATED_APPLE, ModFoods.VEGAN_CHOCOLATED_APPLE_CONSUMABLE));
    // Vegan Chocolate Marshmallow
    public static final DeferredItem<Item> VEGAN_CHOCOLATE_MARSHMALLOW = registerSimpleItem("vegan_chocolate_marshmallow",
            () -> new Item.Properties().food(ModFoods.VEGAN_CHOCOLATE_MARSHMALLOW));
    // Bar of Vegan Chocolate
    public static final DeferredItem<Item> BAR_OF_VEGAN_CHOCOLATE = registerSimpleItem("bar_of_vegan_chocolate",
            () -> new Item.Properties().food(ModFoods.BAR_OF_VEGAN_CHOCOLATE));
    // Full Vegan Chocolate Bar
    public static final DeferredItem<Item> FULL_VEGAN_CHOCOLATE_BAR = registerSimpleItem("full_vegan_chocolate_bar",
            () -> new Item.Properties().food(ModFoods.FULL_VEGAN_CHOCOLATE_BAR, ModFoods.FULL_VEGAN_CHOCOLATE_BAR_CONSUMABLE));
    public static final DeferredItem<Item> VEGAN_CHOCOLATE_DOUGH = registerSimpleItem("vegan_chocolate_dough",
            () -> new Item.Properties());
    public static final DeferredItem<Item> VEGAN_CHOCOLATE_STICK = registerSimpleItem("vegan_chocolate_stick",
            () -> new Item.Properties());

    // Almond
    public static final DeferredItem<Item> ALMOND_ITEM = registerSimpleItem("almond",
            () -> new Item.Properties());
    public static final DeferredItem<Item> ALMOND_BUTTER = registerSimpleItem("almond_butter",
            () -> new Item.Properties());
    public static final DeferredItem<Item> ALMOND_MILK_BUCKET = registerItem("almond_milk_bucket",
            props -> new BucketItem(ModFluids.SOURCE_ALMOND_MILK_FLUID.get(), props.stacksTo(1).craftRemainder(Items.BUCKET)),
            () -> new Item.Properties());
    // Vanilla Seed and stuff
    public static final DeferredItem<Item> VANILLA_SEED = registerItem("vanilla_seed",
            props -> new BlockItem(ModBlocks.VANILLA_CROP.get(), props),
            () -> new Item.Properties());
    // Vanilla Lusk
    public static final DeferredItem<Item> VANILLA_LUSK = registerSimpleItem("vanilla_lusk",
            () -> new Item.Properties().food(ModFoods.VANILLA_LUSK, ModFoods.VANILLA_LUSK_CONSUMABLE));
    public static final DeferredItem<Item> VANILLA_BUTTER = registerSimpleItem("vanilla_butter",
            () -> new Item.Properties());
    public static final DeferredItem<Item> VANILLA_POWDER = registerSimpleItem("vanilla_powder",
            () -> new Item.Properties());
    public static final DeferredItem<Item> VANILLA_SUGAR = registerSimpleItem("vanilla_sugar",
            () -> new Item.Properties());
    // Apple Sauce
    public static final DeferredItem<Item> APPLE_SAUCE_DRINK = registerItem("apple_sauce_drink",
            props -> new Item(props.food(ModFoods.APPLE_SAUCE_DRINK, ModFoods.APPLE_SAUCE_DRINK_CONSUMABLE).craftRemainder(Items.GLASS_BOTTLE)),
            () -> new Item.Properties());
    // Apple Sauce Bucket
    public static final DeferredItem<Item> APPLE_SAUCE_BUCKET = registerItem("apple_sauce_bucket",
            props -> new BucketItem(ModFluids.SOURCE_APPLE_SAUCE_FLUID.get(), props.stacksTo(1).craftRemainder(Items.BUCKET)),
            () -> new Item.Properties());




    // For items with custom constructor (takes Properties)
    private static <I extends Item> DeferredItem<I> registerItem(String name, Function<Item.Properties, ? extends I> func, Supplier<Item.Properties> properties) {
        return ITEMS.registerItem(name, func, properties);
    }

    // For simple items that just use Item::new
    private static DeferredItem<Item> registerSimpleItem(String name, Supplier<Item.Properties> properties) {
        return ITEMS.registerSimpleItem(name, properties);
    }

    // For simple items with default properties
    private static DeferredItem<Item> registerSimpleItem(String name) {
        return ITEMS.registerSimpleItem(name);
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}