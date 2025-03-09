package net.drenough.create_chocolate.item;

import net.drenough.create_chocolate.CreateChocolate;
import net.drenough.create_chocolate.block.ModBlocks;
import net.drenough.create_chocolate.fluid.ModFluids;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CreateChocolate.MOD_ID);

    // Chocolate Releated Items
    public static final DeferredItem<Item> FULL_CHOCOLATE_BAR = ITEMS.register("full_chocolate_bar",
            () -> new Item(new Item.Properties().food(ModFoods.FULL_CHOCOLATE_BAR)));
    public static final DeferredItem<Item> CHOCOLATE_MARSHMALLOW = ITEMS.register("chocolate_marshmallow",
            () -> new Item(new Item.Properties().food(ModFoods.CHOCOLATE_MARSHMALLOW)));
    public static final DeferredItem<Item> CHOCOLATE_BUNNY = ITEMS.register("chocolate_bunny",
            () -> new Item(new Item.Properties().food(ModFoods.CHOCOLATE_BUNNY)));
    public static final DeferredItem<Item> CHOCOLATE_EGG = ITEMS.register("chocolate_egg",
            () -> new Item(new Item.Properties().food(ModFoods.CHOCOLATE_EGG)));
    public static final DeferredItem<Item> CHOCOLATE_PRALINE = ITEMS.register("chocolate_praline",
            () -> new Item(new Item.Properties().food(ModFoods.CHOCOLATE_PRALINE)));
    public static final DeferredItem<Item> CHOCOLATE_TRUFFLE = ITEMS.register("chocolate_truffle",
            () -> new Item(new Item.Properties().food(ModFoods.CHOCOLATE_TRUFFLE)));
    public static final DeferredItem<Item> HOT_CHOCOLATE_DRINK = ITEMS.register("hot_chocolate_drink",
            () -> new DrinkItem(new Item.Properties().food(ModFoods.HOT_CHOCOLATE_DRINK).craftRemainder(Items.GLASS_BOTTLE)));
    public static final DeferredItem<Item> GINGER_BREAD_MAN = ITEMS.register("ginger_bread_man",
            () -> new Item(new Item.Properties().food(ModFoods.GINGER_BREAD_MAN)));
    public static final DeferredItem<Item> GINGER_BREAD = ITEMS.register("ginger_bread",
            () -> new Item(new Item.Properties().food(ModFoods.GINGER_BREAD)));
    public static final DeferredItem<Item> CHOCOLATED_APPLE = ITEMS.register("chocolated_apple",
            () -> new Item(new Item.Properties().food(ModFoods.CHOCOLATED_APPLE)));
    // Chocolate Cake
    public static final DeferredItem<Item> CHOCOLATE_CAKE_ITEM = ITEMS.register("chocolate_cake",
            () -> new BlockItem(ModBlocks.CHOCOLATE_CAKE.get(),
                    new Item.Properties().food(ModFoods.CHOCOLATE_CAKE_FOOD)));

    // Dark Chocolate Releated Items
    public static final DeferredItem<Item> BAR_OF_DARK_CHOCOLATE = ITEMS.register("bar_of_dark_chocolate",
            () -> new Item(new Item.Properties().food(ModFoods.BAR_OF_DARK_CHOCOLATE)));
    public static final DeferredItem<Item> FULL_DARK_CHOCOLATE_BAR = ITEMS.register("full_dark_chocolate_bar",
            () -> new Item(new Item.Properties().food(ModFoods.FULL_DARK_CHOCOLATE_BAR)));
    public static final DeferredItem<Item> DARK_CHOCOLATE_MARSHMALLOW = ITEMS.register("dark_chocolate_marshmallow",
            () -> new Item(new Item.Properties().food(ModFoods.DARK_CHOCOLATE_MARSHMALLOW)));
    public static final DeferredItem<Item> DARK_CHOCOLATE_BUNNY = ITEMS.register("dark_chocolate_bunny",
            () -> new Item(new Item.Properties().food(ModFoods.DARK_CHOCOLATE_BUNNY)));
    public static final DeferredItem<Item> DARK_CHOCOLATE_EGG = ITEMS.register("dark_chocolate_egg",
            () -> new Item(new Item.Properties().food(ModFoods.DARK_CHOCOLATE_EGG)));
    public static final DeferredItem<Item> DARK_CHOCOLATE_GLAZED_BERRIES = ITEMS.register("dark_chocolate_glazed_berries",
            () -> new Item(new Item.Properties().food(ModFoods.DARK_CHOCOLATE_GLAZED_BERRIES)));
    public static final DeferredItem<Item> DARK_CHOCOLATE_PRALINE = ITEMS.register("dark_chocolate_praline",
            () -> new Item(new Item.Properties().food(ModFoods.DARK_CHOCOLATE_PRALINE)));
    public static final DeferredItem<Item> DARK_CHOCOLATE_TRUFFLE = ITEMS.register("dark_chocolate_truffle",
            () -> new Item(new Item.Properties().food(ModFoods.DARK_CHOCOLATE_TRUFFLE)));
    public static final DeferredItem<Item> HOT_DARK_CHOCOLATE_DRINK = ITEMS.register("hot_dark_chocolate_drink",
            () -> new DrinkItem(new Item.Properties().food(ModFoods.HOT_DARK_CHOCOLATE_DRINK).craftRemainder(Items.GLASS_BOTTLE)));
    public static final DeferredItem<Item> DARK_CHOCOLATE_COOKIE = ITEMS.register("dark_chocolate_cookie",
            () -> new Item(new Item.Properties().food(ModFoods.DARK_CHOCOLATE_COOKIE)));
    public static final DeferredItem<Item> DARK_CHOCOLATE_BUCKET = ITEMS.register("dark_chocolate_bucket",
            () -> new BucketItem(ModFluids.SOURCE_DARK_CHOCOLATE_FLUID.get(), new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET)));
    public static final DeferredItem<Item> DARK_CHOCOLATED_APPLE = ITEMS.register("dark_chocolated_apple",
            () -> new Item(new Item.Properties().food(ModFoods.DARK_CHOCOLATED_APPLE)));
    // Dark Chocolate Cake
    public static final DeferredItem<Item> DARK_CHOCOLATE_CAKE_ITEM = ITEMS.register("dark_chocolate_cake",
            () -> new BlockItem(ModBlocks.DARK_CHOCOLATE_CAKE.get(),
                    new Item.Properties().food(ModFoods.DARK_CHOCOLATE_CAKE_FOOD)));

    // White Chocolate Related Items
    public static final DeferredItem<Item> BAR_OF_WHITE_CHOCOLATE = ITEMS.register("bar_of_white_chocolate",
            () -> new Item(new Item.Properties().food(ModFoods.BAR_OF_WHITE_CHOCOLATE)));
    public static final DeferredItem<Item> FULL_WHITE_CHOCOLATE_BAR = ITEMS.register("full_white_chocolate_bar",
            () -> new Item(new Item.Properties().food(ModFoods.FULL_WHITE_CHOCOLATE_BAR)));
    public static final DeferredItem<Item> WHITE_CHOCOLATE_MARSHMALLOW = ITEMS.register("white_chocolate_marshmallow",
            () -> new Item(new Item.Properties().food(ModFoods.WHITE_CHOCOLATE_MARSHMALLOW)));
    public static final DeferredItem<Item> WHITE_CHOCOLATE_BUNNY = ITEMS.register("white_chocolate_bunny",
            () -> new Item(new Item.Properties().food(ModFoods.WHITE_CHOCOLATE_BUNNY)));
    public static final DeferredItem<Item> WHITE_CHOCOLATE_EGG = ITEMS.register("white_chocolate_egg",
            () -> new Item(new Item.Properties().food(ModFoods.WHITE_CHOCOLATE_EGG)));
    public static final DeferredItem<Item> WHITE_CHOCOLATE_GLAZED_BERRIES = ITEMS.register("white_chocolate_glazed_berries",
            () -> new Item(new Item.Properties().food(ModFoods.WHITE_CHOCOLATE_GLAZED_BERRIES)));
    public static final DeferredItem<Item> WHITE_CHOCOLATE_PRALINE = ITEMS.register("white_chocolate_praline",
            () -> new Item(new Item.Properties().food(ModFoods.WHITE_CHOCOLATE_PRALINE)));
    public static final DeferredItem<Item> WHITE_CHOCOLATE_TRUFFLE = ITEMS.register("white_chocolate_truffle",
            () -> new Item(new Item.Properties().food(ModFoods.WHITE_CHOCOLATE_TRUFFLE)));
    public static final DeferredItem<Item> HOT_WHITE_CHOCOLATE_DRINK = ITEMS.register("hot_white_chocolate_drink",
            () -> new DrinkItem(new Item.Properties().food(ModFoods.HOT_WHITE_CHOCOLATE_DRINK).craftRemainder(Items.GLASS_BOTTLE)));
    public static final DeferredItem<Item> WHITE_CHOCOLATE_COOKIE = ITEMS.register("white_chocolate_cookie",
            () -> new Item(new Item.Properties().food(ModFoods.WHITE_CHOCOLATE_COOKIE)));
    public static final DeferredItem<Item> WHITE_CHOCOLATE_BUCKET = ITEMS.register("white_chocolate_bucket",
            () -> new BucketItem(ModFluids.SOURCE_WHITE_CHOCOLATE_FLUID.get(), new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET)));
    public static final DeferredItem<Item> WHITE_CHOCOLATED_APPLE = ITEMS.register("white_chocolated_apple",
            () -> new Item(new Item.Properties().food(ModFoods.WHITE_CHOCOLATED_APPLE)));
    // White Chocolate Cake
    public static final DeferredItem<Item> WHITE_CHOCOLATE_CAKE_ITEM = ITEMS.register("white_chocolate_cake",
            () -> new BlockItem(ModBlocks.WHITE_CHOCOLATE_CAKE.get(),
                    new Item.Properties().food(ModFoods.WHITE_CHOCOLATE_CAKE_FOOD)));

    // Caramel Related Items
    public static final DeferredItem<Item> BAR_OF_CARAMEL = ITEMS.register("bar_of_caramel",
            () -> new Item(new Item.Properties().food(ModFoods.BAR_OF_CARAMEL)));
    public static final DeferredItem<Item> FULL_CARAMEL_BAR = ITEMS.register("full_caramel_bar",
            () -> new Item(new Item.Properties().food(ModFoods.FULL_CARAMEL_BAR)));
    public static final DeferredItem<Item> CARAMEL_MARSHMALLOW = ITEMS.register("caramel_marshmallow",
            () -> new Item(new Item.Properties().food(ModFoods.CARAMEL_MARSHMALLOW)));
    public static final DeferredItem<Item> CARAMEL_BUNNY = ITEMS.register("caramel_bunny",
            () -> new Item(new Item.Properties().food(ModFoods.CARAMEL_BUNNY)));
    public static final DeferredItem<Item> CARAMEL_EGG = ITEMS.register("caramel_egg",
            () -> new Item(new Item.Properties().food(ModFoods.CARAMEL_EGG)));
    public static final DeferredItem<Item> CARAMEL_GLAZED_BERRIES = ITEMS.register("caramel_glazed_berries",
            () -> new Item(new Item.Properties().food(ModFoods.CARAMEL_GLAZED_BERRIES)));
    public static final DeferredItem<Item> CARAMEL_PRALINE = ITEMS.register("caramel_praline",
            () -> new Item(new Item.Properties().food(ModFoods.CARAMEL_PRALINE)));
    public static final DeferredItem<Item> CARAMEL_TRUFFLE = ITEMS.register("caramel_truffle",
            () -> new Item(new Item.Properties().food(ModFoods.CARAMEL_TRUFFLE)));
    public static final DeferredItem<Item> HOT_CARAMEL_DRINK = ITEMS.register("hot_caramel_drink",
            () -> new DrinkItem(new Item.Properties().food(ModFoods.HOT_CARAMEL_DRINK).craftRemainder(Items.GLASS_BOTTLE)));
    public static final DeferredItem<Item> CARAMEL_COOKIE = ITEMS.register("caramel_cookie",
            () -> new Item(new Item.Properties().food(ModFoods.CARAMEL_COOKIE)));
    public static final DeferredItem<Item> CARAMEL_BUCKET = ITEMS.register("caramel_bucket",
            () -> new BucketItem(ModFluids.SOURCE_CARAMEL_FLUID.get(), new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET)));
    public static final DeferredItem<Item> CARAMELIZED_APPLE = ITEMS.register("caramelized_apple",
            () -> new Item(new Item.Properties().food(ModFoods.CARAMELIZED_APPLE)));
    // Caramel Cake
    public static final DeferredItem<Item> CARAMEL_CAKE_ITEM = ITEMS.register("caramel_cake",
            () -> new BlockItem(ModBlocks.CARAMEL_CAKE.get(),
                    new Item.Properties().food(ModFoods.CARAMEL_CAKE_FOOD)));

    // Cooking Ingredients
    public static final DeferredItem<Item> COCOA_POWDER = ITEMS.register("cocoa_powder",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COCOA_SMASHED_BEANS = ITEMS.register("cocoa_smashed_beans",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GINGER_DOUGH = ITEMS.register("ginger_dough",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DARK_CHOCOLATE_DOUGH = ITEMS.register("dark_chocolate_dough",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WHITE_CHOCOLATE_DOUGH = ITEMS.register("white_chocolate_dough",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CARAMEL_DOUGH = ITEMS.register("caramel_dough",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHOCOLATE_DOUGH = ITEMS.register("chocolate_dough",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ROYAL_CHOCOLATE_DOUGH = ITEMS.register("royal_chocolate_dough",
            () -> new Item(new Item.Properties()));

    // Dark Chocolate Stick
    public static final DeferredItem<Item> DARK_CHOCOLATE_STICK = ITEMS.register("dark_chocolate_stick",
            () -> new Item(new Item.Properties()));

    // White Chocolate Stick
    public static final DeferredItem<Item> WHITE_CHOCOLATE_STICK = ITEMS.register("white_chocolate_stick",
            () -> new Item(new Item.Properties()));

    // Caramel Stick
    public static final DeferredItem<Item> CARAMEL_STICK = ITEMS.register("caramel_stick",
            () -> new Item(new Item.Properties()));

    // Hard Chocolate Tools

    // Hard Chocolate Stick
    public static final DeferredItem<Item> HARD_CHOCOLATE_STICK = ITEMS.register("hard_chocolate_stick",
            () -> new Item(new Item.Properties()));
    // Hard Chocolate Pickaxe
    public static final DeferredItem<Item> HARD_CHOCOLATE_PICKAXE = ITEMS.register("hard_chocolate_pickaxe",
            () -> new PickaxeItem(ModToolTiers.HARD_CHOCOLATE_TOOL, new Item.Properties().attributes(
                    PickaxeItem.createAttributes(ModToolTiers.HARD_CHOCOLATE_TOOL, 1.0F, -2.8F))));
    // Hard Chocolate Axe
    public static final DeferredItem<AxeItem> HARD_CHOCOLATE_AXE = ITEMS.register("hard_chocolate_axe",
            () -> new AxeItem(ModToolTiers.HARD_CHOCOLATE_TOOL, new Item.Properties().attributes(
                    AxeItem.createAttributes(ModToolTiers.HARD_CHOCOLATE_TOOL, 6.0F, -3.0F))));
    // Hard Chocolate Sword
    public static final DeferredItem<Item> HARD_CHOCOLATE_SWORD = ITEMS.register("hard_chocolate_sword",
            () -> new SwordItem(ModToolTiers.HARD_CHOCOLATE_TOOL, new Item.Properties().attributes(
                    SwordItem.createAttributes(ModToolTiers.HARD_CHOCOLATE_TOOL, 3, -2.4F))));
    // Hard Chocolate Shovel
    public static final DeferredItem<Item> HARD_CHOCOLATE_SHOVEL = ITEMS.register("hard_chocolate_shovel",
            () -> new ShovelItem(ModToolTiers.HARD_CHOCOLATE_TOOL, new Item.Properties().attributes(
                    ShovelItem.createAttributes(ModToolTiers.HARD_CHOCOLATE_TOOL, 2.0F, -3.0F))));
    // Hard Chocolate Hoe
    public static final DeferredItem<Item> HARD_CHOCOLATE_HOE = ITEMS.register("hard_chocolate_hoe",
            () -> new HoeItem(ModToolTiers.HARD_CHOCOLATE_TOOL, new Item.Properties().attributes(
                    HoeItem.createAttributes(ModToolTiers.HARD_CHOCOLATE_TOOL, 0.0F, -2.0F))));

    // Hard Chocolate Armor

    // Hard Chocolate Helmet
    public static final DeferredItem<ArmorItem> HARD_CHOCOLATE_HELMET = ITEMS.register("hard_chocolate_helmet",
            () -> new ArmorItem(ModArmorMaterials.HARD_CHOCOLATE_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(6))));

    // Hard Chocolate Chestplate
    public static final DeferredItem<ArmorItem> HARD_CHOCOLATE_CHESTPLATE = ITEMS.register("hard_chocolate_chestplate",
            () -> new ArmorItem(ModArmorMaterials.HARD_CHOCOLATE_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(5))));
    // Hard Chocolate Leggings
    public static final DeferredItem<ArmorItem> HARD_CHOCOLATE_LEGGINGS = ITEMS.register("hard_chocolate_leggings",
            () -> new ArmorItem(ModArmorMaterials.HARD_CHOCOLATE_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(5))));
    // Hard Chocolate Boots
    public static final DeferredItem<ArmorItem> HARD_CHOCOLATE_BOOTS = ITEMS.register("hard_chocolate_boots",
            () -> new ArmorItem(ModArmorMaterials.HARD_CHOCOLATE_ARMOR, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(3))));

    // Food Ingredients
    public static final DeferredItem<Item> BUTTER = ITEMS.register("butter",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COCOA_BUTTER = ITEMS.register("cocoa_butter",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MILK_POWDER = ITEMS.register("milk_powder",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CAKE_BASE = ITEMS.register("cake_base",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CAKE_BASE_BAKED = ITEMS.register("cake_base_baked",
            () -> new Item(new Item.Properties()));

    // Royal Chocolate Related Items
    public static final DeferredItem<Item> BAR_OF_ROYAL_CHOCOLATE = ITEMS.register("bar_of_royal_chocolate",
            () -> new Item(new Item.Properties().food(ModFoods.BAR_OF_ROYAL_CHOCOLATE)));
    public static final DeferredItem<Item> FULL_ROYAL_CHOCOLATE_BAR = ITEMS.register("full_royal_chocolate_bar",
            () -> new Item(new Item.Properties().food(ModFoods.FULL_ROYAL_CHOCOLATE_BAR)));
    public static final DeferredItem<Item> ROYAL_CHOCOLATE_BUCKET = ITEMS.register("royal_chocolate_bucket",
            () -> new BucketItem(ModFluids.SOURCE_ROYAL_CHOCOLATE_FLUID.get(), new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET)));

    // Royal Chocolate Armor
    // Royal Chocolate Helmet
    public static final DeferredItem<ArmorItem> ROYAL_CHOCOLATE_HELMET = ITEMS.register("royal_chocolate_helmet",
            () -> new ArmorItem(ModArmorMaterials.ROYAL_CHOCOLATE_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(35))));
    // Royal Chocolate Chestplate
    public static final DeferredItem<ArmorItem> ROYAL_CHOCOLATE_CHESTPLATE = ITEMS.register("royal_chocolate_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ROYAL_CHOCOLATE_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(35))));
    // Royal Chocolate Leggings
    public static final DeferredItem<ArmorItem> ROYAL_CHOCOLATE_LEGGINGS = ITEMS.register("royal_chocolate_leggings",
            () -> new ArmorItem(ModArmorMaterials.ROYAL_CHOCOLATE_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(35))));
    // Royal Chocolate Boots
    public static final DeferredItem<ArmorItem> ROYAL_CHOCOLATE_BOOTS = ITEMS.register("royal_chocolate_boots",
            () -> new ArmorItem(ModArmorMaterials.ROYAL_CHOCOLATE_ARMOR, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(35))));

    // Royal Chocolate Tools


    // Royal Chocolate Stick
    public static final DeferredItem<Item> ROYAL_CHOCOLATE_STICK = ITEMS.register("royal_chocolate_stick",
            () -> new Item(new Item.Properties()));
    // Royal Chocolate Pickaxe
    public static final DeferredItem<Item> ROYAL_CHOCOLATE_PICKAXE = ITEMS.register("royal_chocolate_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ROYAL_CHOCOLATE_TOOL, new Item.Properties().attributes(
                    PickaxeItem.createAttributes(ModToolTiers.ROYAL_CHOCOLATE_TOOL, 1, -2.8F))));
    // Royal Chocolate Shovel
    public static final DeferredItem<Item> ROYAL_CHOCOLATE_SHOVEL = ITEMS.register("royal_chocolate_shovel",
            () -> new ShovelItem(ModToolTiers.ROYAL_CHOCOLATE_TOOL, new Item.Properties().attributes(
                    ShovelItem.createAttributes(ModToolTiers.ROYAL_CHOCOLATE_TOOL, 1.5F, 3.0F))));
    // Royal Chocolate Hoe
    public static final DeferredItem<Item> ROYAL_CHOCOLATE_HOE = ITEMS.register("royal_chocolate_hoe",
            () -> new HoeItem(ModToolTiers.ROYAL_CHOCOLATE_TOOL, new Item.Properties().attributes(
                    HoeItem.createAttributes(ModToolTiers.ROYAL_CHOCOLATE_TOOL, -1, -2.0F))));
    // Royal Chocolate Axe
    public static final DeferredItem<Item> ROYAL_CHOCOLATE_AXE = ITEMS.register("royal_chocolate_axe",
            () -> new AxeItem(ModToolTiers.ROYAL_CHOCOLATE_TOOL, new Item.Properties().attributes(
                    AxeItem.createAttributes(ModToolTiers.ROYAL_CHOCOLATE_TOOL, 5.5F, -3.0F))));
    // Royal Chocolate Sword
    public static final DeferredItem<Item> ROYAL_CHOCOLATE_SWORD = ITEMS.register("royal_chocolate_sword",
            () -> new SwordItem(ModToolTiers.ROYAL_CHOCOLATE_TOOL, new Item.Properties().attributes(
                    SwordItem.createAttributes(ModToolTiers.ROYAL_CHOCOLATE_TOOL, 3, -2.4F))));

    // Royal Chocolate Food
    public static final DeferredItem<Item> ROYAL_CHOCOLATE_CAKE_ITEM = ITEMS.register("royal_chocolate_cake",
            () -> new BlockItem(ModBlocks.ROYAL_CHOCOLATE_CAKE.get(),
                    new Item.Properties().food(ModFoods.ROYAL_CHOCOLATE_CAKE_FOOD)));
    public static final DeferredItem<Item> ROYAL_CHOCOLATE_MARSHMALLOW = ITEMS.register("royal_chocolate_marshmallow",
            () -> new Item(new Item.Properties().food(ModFoods.ROYAL_CHOCOLATE_MARSHMALLOW)));
    public static final DeferredItem<Item> ROYAL_CHOCOLATE_BUNNY = ITEMS.register("royal_chocolate_bunny",
            () -> new Item(new Item.Properties().food(ModFoods.ROYAL_CHOCOLATE_BUNNY)));
    public static final DeferredItem<Item> ROYAL_CHOCOLATE_EGG =  ITEMS.register("royal_chocolate_egg",
            () -> new Item(new Item.Properties().food(ModFoods.ROYAL_CHOCOLATE_EGG)));
    public static final DeferredItem<Item> ROYAL_CHOCOLATE_GLAZED_BERRIES = ITEMS.register("royal_chocolate_glazed_berries",
            () -> new Item(new Item.Properties().food(ModFoods.ROYAL_CHOCOLATE_GLAZED_BERRIES)));
    public static final DeferredItem<Item> ROYAL_CHOCOLATE_PRALINE = ITEMS.register("royal_chocolate_praline",
            () -> new Item(new Item.Properties().food(ModFoods.ROYAL_CHOCOLATE_PRALINE)));
    public static final DeferredItem<Item> ROYAL_CHOCOLATE_TRUFFLE = ITEMS.register("royal_chocolate_truffle",
            () -> new Item(new Item.Properties().food(ModFoods.ROYAL_CHOCOLATE_TRUFFLE)));
    public static final DeferredItem<Item> HOT_ROYAL_CHOCOLATE_DRINK = ITEMS.register("hot_royal_chocolate_drink",
            () -> new DrinkItem(new Item.Properties().food(ModFoods.HOT_ROYAL_CHOCOLATE_DRINK).craftRemainder(Items.GLASS_BOTTLE)));
    public static final DeferredItem<Item> ROYAL_CHOCOLATE_COOKIE = ITEMS.register("royal_chocolate_cookie",
            () -> new Item(new Item.Properties().food(ModFoods.ROYAL_CHOCOLATE_COOKIE)));
    public static final DeferredItem<Item> ROYAL_CHOCOLATED_APPLE = ITEMS.register("royal_chocolated_apple",
            () -> new Item(new Item.Properties().food(ModFoods.ROYAL_CHOCOLATED_APPLE)));

    // Vegan Chocolate
    public static final DeferredItem<Item> VEGAN_CHOCOLATE_BUCKET = ITEMS.register("vegan_chocolate_bucket",
            () -> new BucketItem(ModFluids.SOURCE_VEGAN_CHOCOLATE_FLUID.get(), new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET)));
    public static final DeferredItem<Item> VEGAN_CHOCOLATE_CAKE_ITEM = ITEMS.register("vegan_chocolate_cake",
            () -> new BlockItem(ModBlocks.VEGAN_CHOCOLATE_CAKE.get(),
                    new Item.Properties().food(ModFoods.VEGAN_CHOCOLATE_CAKE_FOOD)));
    public static final DeferredItem<Item> VEGAN_CHOCOLATE_GLAZED_BERRIES = ITEMS.register("vegan_chocolate_glazed_berries",
            () -> new Item(new Item.Properties().food(ModFoods.VEGAN_CHOCOLATE_GLAZED_BERRIES)));
    public static final DeferredItem<Item> VEGAN_CHOCOLATE_PRALINE = ITEMS.register("vegan_chocolate_praline",
            () -> new Item(new Item.Properties().food(ModFoods.VEGAN_CHOCOLATE_PRALINE)));
    public static final DeferredItem<Item> VEGAN_CHOCOLATE_TRUFFLE = ITEMS.register("vegan_chocolate_truffle",
            () -> new Item(new Item.Properties().food(ModFoods.VEGAN_CHOCOLATE_TRUFFLE)));
    public static final DeferredItem<Item> HOT_VEGAN_CHOCOLATE_DRINK = ITEMS.register("hot_vegan_chocolate_drink",
            () -> new DrinkItem(new Item.Properties().food(ModFoods.HOT_VEGAN_CHOCOLATE_DRINK).craftRemainder(Items.GLASS_BOTTLE)));
    public static final DeferredItem<Item> VEGAN_CHOCOLATE_COOKIE = ITEMS.register("vegan_chocolate_cookie",
            () -> new Item(new Item.Properties().food(ModFoods.VEGAN_CHOCOLATE_COOKIE)));
    public static final DeferredItem<Item> VEGAN_CHOCOLATED_APPLE = ITEMS.register("vegan_chocolated_apple",
            () -> new Item(new Item.Properties().food(ModFoods.VEGAN_CHOCOLATED_APPLE)));
    public static final DeferredItem<Item> VEGAN_CHOCOLATE_MARSHMALLOW = ITEMS.register("vegan_chocolate_marshmallow",
            () -> new Item(new Item.Properties().food(ModFoods.VEGAN_CHOCOLATE_MARSHMALLOW)));
    public static final DeferredItem<Item> BAR_OF_VEGAN_CHOCOLATE = ITEMS.register("bar_of_vegan_chocolate",
            () -> new Item(new Item.Properties().food(ModFoods.BAR_OF_VEGAN_CHOCOLATE)));
    public static final DeferredItem<Item> FULL_VEGAN_CHOCOLATE_BAR = ITEMS.register("full_vegan_chocolate_bar",
            () -> new Item(new Item.Properties().food(ModFoods.FULL_VEGAN_CHOCOLATE_BAR)));
    public static final DeferredItem<Item> VEGAN_CHOCOLATE_DOUGH = ITEMS.register("vegan_chocolate_dough",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> VEGAN_CHOCOLATE_STICK = ITEMS.register("vegan_chocolate_stick",
            () -> new Item(new Item.Properties()));

    // Almond
    public static final DeferredItem<Item> ALMOND_ITEM = ITEMS.register("almond",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ALMOND_BUTTER = ITEMS.register("almond_butter",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ALMOND_MILK_BUCKET = ITEMS.register("almond_milk_bucket",
            () -> new BucketItem(ModFluids.SOURCE_ALMOND_MILK_FLUID.get(), new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET)));

    // Vanilla Seed and stuff
    public static final DeferredItem<Item> VANILLA_SEED = ITEMS.register("vanilla_seed",
            () -> new ItemNameBlockItem(ModBlocks.VANILLA_CROP.get(), new Item.Properties()));
    public static final DeferredItem<Item> VANILLA_LUSK = ITEMS.register("vanilla_lusk",
            () -> new Item(new Item.Properties().food(ModFoods.VANILLA_LUSK)));
    public static final DeferredItem<Item> VANILLA_BUTTER = ITEMS.register("vanilla_butter",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> VANILLA_POWDER = ITEMS.register("vanilla_powder",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> VANILLA_SUGAR = ITEMS.register("vanilla_sugar",
            () -> new Item(new Item.Properties()));
    // Apple Sauce
    public static final DeferredItem<Item> APPLE_SAUCE_DRINK = ITEMS.register("apple_sauce_drink",
            () -> new DrinkItem(new Item.Properties().food(ModFoods.APPLE_SAUCE_DRINK).craftRemainder(Items.GLASS_BOTTLE)));
    public static final DeferredItem<Item> APPLE_SAUCE_BUCKET = ITEMS.register("apple_sauce_bucket",
            () -> new BucketItem(ModFluids.SOURCE_APPLE_SAUCE_FLUID.get(), new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}