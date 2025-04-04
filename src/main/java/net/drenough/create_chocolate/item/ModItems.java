package net.drenough.create_chocolate.item;

import com.simibubi.create.AllItems;
import net.drenough.create_chocolate.CreateChocolate;
import net.drenough.create_chocolate.block.ModBlocks;
import net.drenough.create_chocolate.fluid.ModFluids;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CreateChocolate.MOD_ID);

    // Chocolate Releated Items
    public static final RegistryObject<Item> FULL_CHOCOLATE_BAR = ITEMS.register("full_chocolate_bar",
            () -> new Item(new Item.Properties().food(ModFoods.FULL_CHOCOLATE_BAR)));
    public static final RegistryObject<Item> CHOCOLATE_MARSHMALLOW = ITEMS.register("chocolate_marshmallow",
            () -> new Item(new Item.Properties().food(ModFoods.CHOCOLATE_MARSHMALLOW)));
    public static final RegistryObject<Item> CHOCOLATE_BUNNY = ITEMS.register("chocolate_bunny",
            () -> new Item(new Item.Properties().food(ModFoods.CHOCOLATE_BUNNY)));
    public static final RegistryObject<Item> CHOCOLATE_EGG = ITEMS.register("chocolate_egg",
            () -> new Item(new Item.Properties().food(ModFoods.CHOCOLATE_EGG)));
    public static final RegistryObject<Item> CHOCOLATE_PRALINE = ITEMS.register("chocolate_praline",
            () -> new Item(new Item.Properties().food(ModFoods.CHOCOLATE_PRALINE)));
    public static final RegistryObject<Item> CHOCOLATE_TRUFFLE = ITEMS.register("chocolate_truffle",
            () -> new Item(new Item.Properties().food(ModFoods.CHOCOLATE_TRUFFLE)));
    public static final RegistryObject<Item> HOT_CHOCOLATE_DRINK = ITEMS.register("hot_chocolate_drink",
            () -> new DrinkItem(new Item.Properties().food(ModFoods.HOT_CHOCOLATE_DRINK).craftRemainder(Items.GLASS_BOTTLE)));
    public static final RegistryObject<Item> GINGER_BREAD_MAN = ITEMS.register("ginger_bread_man",
            () -> new Item(new Item.Properties().food(ModFoods.GINGER_BREAD_MAN)));
    public static final RegistryObject<Item> GINGER_BREAD = ITEMS.register("ginger_bread",
            () -> new Item(new Item.Properties().food(ModFoods.GINGER_BREAD)));
    public static final RegistryObject<Item> CHOCOLATED_APPLE = ITEMS.register("chocolated_apple",
            () -> new Item(new Item.Properties().food(ModFoods.CHOCOLATED_APPLE)));
    // Chocolate Cake
    public static final RegistryObject<Item> CHOCOLATE_CAKE_ITEM = ITEMS.register("chocolate_cake",
            () -> new BlockItem(ModBlocks.CHOCOLATE_CAKE.get(),
                    new Item.Properties().food(ModFoods.CHOCOLATE_CAKE_FOOD)));

    // Dark Chocolate Releated Items
    public static final RegistryObject<Item> BAR_OF_DARK_CHOCOLATE = ITEMS.register("bar_of_dark_chocolate",
            () -> new Item(new Item.Properties().food(ModFoods.BAR_OF_DARK_CHOCOLATE)));
    public static final RegistryObject<Item> FULL_DARK_CHOCOLATE_BAR = ITEMS.register("full_dark_chocolate_bar",
            () -> new Item(new Item.Properties().food(ModFoods.FULL_DARK_CHOCOLATE_BAR)));
    public static final RegistryObject<Item> DARK_CHOCOLATE_MARSHMALLOW = ITEMS.register("dark_chocolate_marshmallow",
            () -> new Item(new Item.Properties().food(ModFoods.DARK_CHOCOLATE_MARSHMALLOW)));
    public static final RegistryObject<Item> DARK_CHOCOLATE_BUNNY = ITEMS.register("dark_chocolate_bunny",
            () -> new Item(new Item.Properties().food(ModFoods.DARK_CHOCOLATE_BUNNY)));
    public static final RegistryObject<Item> DARK_CHOCOLATE_EGG = ITEMS.register("dark_chocolate_egg",
            () -> new Item(new Item.Properties().food(ModFoods.DARK_CHOCOLATE_EGG)));
    public static final RegistryObject<Item> DARK_CHOCOLATE_GLAZED_BERRIES = ITEMS.register("dark_chocolate_glazed_berries",
            () -> new Item(new Item.Properties().food(ModFoods.DARK_CHOCOLATE_GLAZED_BERRIES)));
    public static final RegistryObject<Item> DARK_CHOCOLATE_PRALINE = ITEMS.register("dark_chocolate_praline",
            () -> new Item(new Item.Properties().food(ModFoods.DARK_CHOCOLATE_PRALINE)));
    public static final RegistryObject<Item> DARK_CHOCOLATE_TRUFFLE = ITEMS.register("dark_chocolate_truffle",
            () -> new Item(new Item.Properties().food(ModFoods.DARK_CHOCOLATE_TRUFFLE)));
    public static final RegistryObject<Item> HOT_DARK_CHOCOLATE_DRINK = ITEMS.register("hot_dark_chocolate_drink",
            () -> new DrinkItem(new Item.Properties().food(ModFoods.HOT_DARK_CHOCOLATE_DRINK).craftRemainder(Items.GLASS_BOTTLE)));
    public static final RegistryObject<Item> DARK_CHOCOLATE_COOKIE = ITEMS.register("dark_chocolate_cookie",
            () -> new Item(new Item.Properties().food(ModFoods.DARK_CHOCOLATE_COOKIE)));
    public static final RegistryObject<Item> DARK_CHOCOLATE_BUCKET = ITEMS.register("dark_chocolate_bucket",
            () -> new BucketItem(ModFluids.SOURCE_DARK_CHOCOLATE_FLUID, new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET)));
    public static final RegistryObject<Item> DARK_CHOCOLATED_APPLE = ITEMS.register("dark_chocolated_apple",
            () -> new Item(new Item.Properties().food(ModFoods.DARK_CHOCOLATED_APPLE)));
    // Dark Chocolate Cake
    public static final RegistryObject<Item> DARK_CHOCOLATE_CAKE_ITEM = ITEMS.register("dark_chocolate_cake",
            () -> new BlockItem(ModBlocks.DARK_CHOCOLATE_CAKE.get(),
                    new Item.Properties().food(ModFoods.DARK_CHOCOLATE_CAKE_FOOD)));

    // White Chocolate Related Items
    public static final RegistryObject<Item> BAR_OF_WHITE_CHOCOLATE = ITEMS.register("bar_of_white_chocolate",
            () -> new Item(new Item.Properties().food(ModFoods.BAR_OF_WHITE_CHOCOLATE)));
    public static final RegistryObject<Item> FULL_WHITE_CHOCOLATE_BAR = ITEMS.register("full_white_chocolate_bar",
            () -> new Item(new Item.Properties().food(ModFoods.FULL_WHITE_CHOCOLATE_BAR)));
    public static final RegistryObject<Item> WHITE_CHOCOLATE_MARSHMALLOW = ITEMS.register("white_chocolate_marshmallow",
            () -> new Item(new Item.Properties().food(ModFoods.WHITE_CHOCOLATE_MARSHMALLOW)));
    public static final RegistryObject<Item> WHITE_CHOCOLATE_BUNNY = ITEMS.register("white_chocolate_bunny",
            () -> new Item(new Item.Properties().food(ModFoods.WHITE_CHOCOLATE_BUNNY)));
    public static final RegistryObject<Item> WHITE_CHOCOLATE_EGG = ITEMS.register("white_chocolate_egg",
            () -> new Item(new Item.Properties().food(ModFoods.WHITE_CHOCOLATE_EGG)));
    public static final RegistryObject<Item> WHITE_CHOCOLATE_GLAZED_BERRIES = ITEMS.register("white_chocolate_glazed_berries",
            () -> new Item(new Item.Properties().food(ModFoods.WHITE_CHOCOLATE_GLAZED_BERRIES)));
    public static final RegistryObject<Item> WHITE_CHOCOLATE_PRALINE = ITEMS.register("white_chocolate_praline",
            () -> new Item(new Item.Properties().food(ModFoods.WHITE_CHOCOLATE_PRALINE)));
    public static final RegistryObject<Item> WHITE_CHOCOLATE_TRUFFLE = ITEMS.register("white_chocolate_truffle",
            () -> new Item(new Item.Properties().food(ModFoods.WHITE_CHOCOLATE_TRUFFLE)));
    public static final RegistryObject<Item> HOT_WHITE_CHOCOLATE_DRINK = ITEMS.register("hot_white_chocolate_drink",
            () -> new DrinkItem(new Item.Properties().food(ModFoods.HOT_WHITE_CHOCOLATE_DRINK).craftRemainder(Items.GLASS_BOTTLE)));
    public static final RegistryObject<Item> WHITE_CHOCOLATE_COOKIE = ITEMS.register("white_chocolate_cookie",
            () -> new Item(new Item.Properties().food(ModFoods.WHITE_CHOCOLATE_COOKIE)));
    public static final RegistryObject<Item> WHITE_CHOCOLATE_BUCKET = ITEMS.register("white_chocolate_bucket",
            () -> new BucketItem(ModFluids.SOURCE_WHITE_CHOCOLATE_FLUID, new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET)));
    public static final RegistryObject<Item> WHITE_CHOCOLATED_APPLE = ITEMS.register("white_chocolated_apple",
            () -> new Item(new Item.Properties().food(ModFoods.WHITE_CHOCOLATED_APPLE)));
    // White Chocolate Cake
    public static final RegistryObject<Item> WHITE_CHOCOLATE_CAKE_ITEM = ITEMS.register("white_chocolate_cake",
            () -> new BlockItem(ModBlocks.WHITE_CHOCOLATE_CAKE.get(),
                    new Item.Properties().food(ModFoods.WHITE_CHOCOLATE_CAKE_FOOD)));

    // Caramel Related Items
    public static final RegistryObject<Item> BAR_OF_CARAMEL = ITEMS.register("bar_of_caramel",
            () -> new Item(new Item.Properties().food(ModFoods.BAR_OF_CARAMEL)));
    public static final RegistryObject<Item> FULL_CARAMEL_BAR = ITEMS.register("full_caramel_bar",
            () -> new Item(new Item.Properties().food(ModFoods.FULL_CARAMEL_BAR)));
    public static final RegistryObject<Item> CARAMEL_MARSHMALLOW = ITEMS.register("caramel_marshmallow",
            () -> new Item(new Item.Properties().food(ModFoods.CARAMEL_MARSHMALLOW)));
    public static final RegistryObject<Item> CARAMEL_BUNNY = ITEMS.register("caramel_bunny",
            () -> new Item(new Item.Properties().food(ModFoods.CARAMEL_BUNNY)));
    public static final RegistryObject<Item> CARAMEL_EGG = ITEMS.register("caramel_egg",
            () -> new Item(new Item.Properties().food(ModFoods.CARAMEL_EGG)));
    public static final RegistryObject<Item> CARAMEL_GLAZED_BERRIES = ITEMS.register("caramel_glazed_berries",
            () -> new Item(new Item.Properties().food(ModFoods.CARAMEL_GLAZED_BERRIES)));
    public static final RegistryObject<Item> CARAMEL_PRALINE = ITEMS.register("caramel_praline",
            () -> new Item(new Item.Properties().food(ModFoods.CARAMEL_PRALINE)));
    public static final RegistryObject<Item> CARAMEL_TRUFFLE = ITEMS.register("caramel_truffle",
            () -> new Item(new Item.Properties().food(ModFoods.CARAMEL_TRUFFLE)));
    public static final RegistryObject<Item> HOT_CARAMEL_DRINK = ITEMS.register("hot_caramel_drink",
            () -> new DrinkItem(new Item.Properties().food(ModFoods.HOT_CARAMEL_DRINK).craftRemainder(Items.GLASS_BOTTLE)));
    public static final RegistryObject<Item> CARAMEL_COOKIE = ITEMS.register("caramel_cookie",
            () -> new Item(new Item.Properties().food(ModFoods.CARAMEL_COOKIE)));
    public static final RegistryObject<Item> CARAMEL_BUCKET = ITEMS.register("caramel_bucket",
            () -> new BucketItem(ModFluids.SOURCE_CARAMEL_FLUID, new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET)));
    public static final RegistryObject<Item> CARAMELIZED_APPLE = ITEMS.register("caramelized_apple",
            () -> new Item(new Item.Properties().food(ModFoods.CARAMELIZED_APPLE)));
    // Caramel Cake
    public static final RegistryObject<Item> CARAMEL_CAKE_ITEM = ITEMS.register("caramel_cake",
            () -> new BlockItem(ModBlocks.CARAMEL_CAKE.get(),
                    new Item.Properties().food(ModFoods.CARAMEL_CAKE_FOOD)));

    // Cooking Ingredients
    public static final RegistryObject<Item> COCOA_POWDER = ITEMS.register("cocoa_powder",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COCOA_SMASHED_BEANS = ITEMS.register("cocoa_smashed_beans",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GINGER_DOUGH = ITEMS.register("ginger_dough",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DARK_CHOCOLATE_DOUGH = ITEMS.register("dark_chocolate_dough",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WHITE_CHOCOLATE_DOUGH = ITEMS.register("white_chocolate_dough",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CARAMEL_DOUGH = ITEMS.register("caramel_dough",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHOCOLATE_DOUGH = ITEMS.register("chocolate_dough",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROYAL_CHOCOLATE_DOUGH = ITEMS.register("royal_chocolate_dough",
            () -> new Item(new Item.Properties()));

    // Dark Chocolate Stick
    public static final RegistryObject<Item> DARK_CHOCOLATE_STICK = ITEMS.register("dark_chocolate_stick",
            () -> new Item(new Item.Properties()));

    // White Chocolate Stick
    public static final RegistryObject<Item> WHITE_CHOCOLATE_STICK = ITEMS.register("white_chocolate_stick",
            () -> new Item(new Item.Properties()));

    // Caramel Stick
    public static final RegistryObject<Item> CARAMEL_STICK = ITEMS.register("caramel_stick",
            () -> new Item(new Item.Properties()));

    // Hard Chocolate Tools

    // Hard Chocolate Stick
    public static final RegistryObject<Item> HARD_CHOCOLATE_STICK = ITEMS.register("hard_chocolate_stick",
            () -> new Item(new Item.Properties()));
    // Hard Chocolate Pickaxe
    public static final RegistryObject<Item> HARD_CHOCOLATE_PICKAXE = ITEMS.register("hard_chocolate_pickaxe",
            () -> new PickaxeItem(Tiers.STONE, 1, -2, new Item.Properties().defaultDurability(175)) {
                @Override
                public boolean isValidRepairItem(@NotNull ItemStack toRepair, @NotNull ItemStack repair) {
                    return repair.getItem() == AllItems.BAR_OF_CHOCOLATE.get();
                }
            });
    // Hard Chocolate Axe
    public static final RegistryObject<Item> HARD_CHOCOLATE_AXE = ITEMS.register("hard_chocolate_axe",
            () -> new AxeItem(Tiers.STONE, 7, -3, new Item.Properties().defaultDurability(175)) {
                @Override
                public boolean isValidRepairItem(@NotNull ItemStack toRepair, @NotNull ItemStack repair) {
                    return repair.getItem() == AllItems.BAR_OF_CHOCOLATE.get();
                }
            });
    // Hard Chocolate Sword
    public static final RegistryObject<Item> HARD_CHOCOLATE_SWORD = ITEMS.register("hard_chocolate_sword",
            () -> new SwordItem(Tiers.STONE, 3, -2, new Item.Properties().defaultDurability(175)) {
                @Override
                public boolean isValidRepairItem(@NotNull ItemStack toRepair, @NotNull ItemStack repair) {
                    return repair.getItem() == AllItems.BAR_OF_CHOCOLATE.get();
                }
            });
    // Hard Chocolate Shovel
    public static final RegistryObject<Item> HARD_CHOCOLATE_SHOVEL = ITEMS.register("hard_chocolate_shovel",
            () -> new ShovelItem(Tiers.STONE, 2, -3, new Item.Properties().defaultDurability(175)) {
                @Override
                public boolean isValidRepairItem(@NotNull ItemStack toRepair, @NotNull ItemStack repair) {
                    return repair.getItem() == AllItems.BAR_OF_CHOCOLATE.get();
                }
            });
    // Hard Chocolate Hoe
    public static final RegistryObject<Item> HARD_CHOCOLATE_HOE = ITEMS.register("hard_chocolate_hoe",
            () -> new HoeItem(Tiers.STONE, 0, -1, new Item.Properties().defaultDurability(175)) {
                @Override
                public boolean isValidRepairItem(@NotNull ItemStack toRepair, @NotNull ItemStack repair) {
                    return repair.getItem() == AllItems.BAR_OF_CHOCOLATE.get();
                }
            });

    // Hard Chocolate Armor

    // Hard Chocolate Helmet
    public static final RegistryObject<Item> HARD_CHOCOLATE_HELMET = ITEMS.register("hard_chocolate_helmet",
            () -> new ArmorItem(ModArmorMaterials.HARD_CHOCOLATE, ArmorItem.Type.HELMET, new Item.Properties()));
    // Hard Chocolate Chestplate
    public static final RegistryObject<Item> HARD_CHOCOLATE_CHESTPLATE = ITEMS.register("hard_chocolate_chestplate",
            () -> new ArmorItem(ModArmorMaterials.HARD_CHOCOLATE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    // Hard Chocolate Leggings
    public static final RegistryObject<Item> HARD_CHOCOLATE_LEGGINGS = ITEMS.register("hard_chocolate_leggings",
            () -> new ArmorItem(ModArmorMaterials.HARD_CHOCOLATE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    // Hard Chocolate Boots
    public static final RegistryObject<Item> HARD_CHOCOLATE_BOOTS = ITEMS.register("hard_chocolate_boots",
            () -> new ArmorItem(ModArmorMaterials.HARD_CHOCOLATE, ArmorItem.Type.BOOTS, new Item.Properties()));

    // Food Ingredients
    public static final RegistryObject<Item> BUTTER = ITEMS.register("butter",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COCOA_BUTTER = ITEMS.register("cocoa_butter",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MILK_POWDER = ITEMS.register("milk_powder",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CAKE_BASE = ITEMS.register("cake_base",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CAKE_BASE_BAKED = ITEMS.register("cake_base_baked",
            () -> new Item(new Item.Properties()));

    // Royal Chocolate Related Items
    public static final RegistryObject<Item> BAR_OF_ROYAL_CHOCOLATE = ITEMS.register("bar_of_royal_chocolate",
            () -> new Item(new Item.Properties().food(ModFoods.BAR_OF_ROYAL_CHOCOLATE)));
    public static final RegistryObject<Item> FULL_ROYAL_CHOCOLATE_BAR = ITEMS.register("full_royal_chocolate_bar",
            () -> new Item(new Item.Properties().food(ModFoods.FULL_ROYAL_CHOCOLATE_BAR)));
    public static final RegistryObject<Item> ROYAL_CHOCOLATE_BUCKET = ITEMS.register("royal_chocolate_bucket",
            () -> new BucketItem(ModFluids.SOURCE_ROYAL_CHOCOLATE_FLUID, new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET)));

    // Royal Chocolate Armor
    // Royal Chocolate Helmet
    public static final RegistryObject<Item> ROYAL_CHOCOLATE_HELMET = ITEMS.register("royal_chocolate_helmet",
            () -> new ArmorItem(ModArmorMaterials.ROYAL_CHOCOLATE, ArmorItem.Type.HELMET, new Item.Properties()));
    // Royal Chocolate Chestplate
    public static final RegistryObject<Item> ROYAL_CHOCOLATE_CHESTPLATE = ITEMS.register("royal_chocolate_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ROYAL_CHOCOLATE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    // Royal Chocolate Leggings
    public static final RegistryObject<Item> ROYAL_CHOCOLATE_LEGGINGS = ITEMS.register("royal_chocolate_leggings",
            () -> new ArmorItem(ModArmorMaterials.ROYAL_CHOCOLATE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    // Royal Chocolate Boots
    public static final RegistryObject<Item> ROYAL_CHOCOLATE_BOOTS = ITEMS.register("royal_chocolate_boots",
            () -> new ArmorItem(ModArmorMaterials.ROYAL_CHOCOLATE, ArmorItem.Type.BOOTS, new Item.Properties()));

    // Royal Chocolate Tools
    // Royal Chocolate Stick
    public static final RegistryObject<Item> ROYAL_CHOCOLATE_STICK = ITEMS.register("royal_chocolate_stick",
            () -> new Item(new Item.Properties()));
    // Royal Chocolate Pickaxe
    public static final RegistryObject<Item> ROYAL_CHOCOLATE_PICKAXE = ITEMS.register("royal_chocolate_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ROYAL_CHOCOLATE, 1, -2.8F, new Item.Properties()));
    // Royal Chocolate Shovel
    public static final RegistryObject<Item> ROYAL_CHOCOLATE_SHOVEL = ITEMS.register("royal_chocolate_shovel",
            () -> new ShovelItem(ModToolTiers.ROYAL_CHOCOLATE, 1.5F, -3.0F, new Item.Properties()));
    // Royal Chocolate Hoe
    public static final RegistryObject<Item> ROYAL_CHOCOLATE_HOE = ITEMS.register("royal_chocolate_hoe",
            () -> new HoeItem(ModToolTiers.ROYAL_CHOCOLATE, -1, -2.0F, new Item.Properties()));
    // Royal Chocolate Axe
    public static final RegistryObject<Item> ROYAL_CHOCOLATE_AXE = ITEMS.register("royal_chocolate_axe",
            () -> new AxeItem(ModToolTiers.ROYAL_CHOCOLATE, 5.5F, -3.0F, new Item.Properties()));
    // Royal Chocolate Sword
    public static final RegistryObject<Item> ROYAL_CHOCOLATE_SWORD = ITEMS.register("royal_chocolate_sword",
            () -> new SwordItem(ModToolTiers.ROYAL_CHOCOLATE, 3, -2.4F, new Item.Properties()));

    // Royal Chocolate Food
    public static final RegistryObject<Item> ROYAL_CHOCOLATE_CAKE_ITEM = ITEMS.register("royal_chocolate_cake",
            () -> new BlockItem(ModBlocks.ROYAL_CHOCOLATE_CAKE.get(),
                    new Item.Properties().food(ModFoods.ROYAL_CHOCOLATE_CAKE_FOOD)));
    public static final RegistryObject<Item> ROYAL_CHOCOLATE_MARSHMALLOW = ITEMS.register("royal_chocolate_marshmallow",
            () -> new Item(new Item.Properties().food(ModFoods.ROYAL_CHOCOLATE_MARSHMALLOW)));
    public static final RegistryObject<Item> ROYAL_CHOCOLATE_BUNNY = ITEMS.register("royal_chocolate_bunny",
            () -> new Item(new Item.Properties().food(ModFoods.ROYAL_CHOCOLATE_BUNNY)));
    public static final RegistryObject<Item> ROYAL_CHOCOLATE_EGG =  ITEMS.register("royal_chocolate_egg",
            () -> new Item(new Item.Properties().food(ModFoods.ROYAL_CHOCOLATE_EGG)));
    public static final RegistryObject<Item> ROYAL_CHOCOLATE_GLAZED_BERRIES = ITEMS.register("royal_chocolate_glazed_berries",
            () -> new Item(new Item.Properties().food(ModFoods.ROYAL_CHOCOLATE_GLAZED_BERRIES)));
    public static final RegistryObject<Item> ROYAL_CHOCOLATE_PRALINE = ITEMS.register("royal_chocolate_praline",
            () -> new Item(new Item.Properties().food(ModFoods.ROYAL_CHOCOLATE_PRALINE)));
    public static final RegistryObject<Item> ROYAL_CHOCOLATE_TRUFFLE = ITEMS.register("royal_chocolate_truffle",
            () -> new Item(new Item.Properties().food(ModFoods.ROYAL_CHOCOLATE_TRUFFLE)));
    public static final RegistryObject<Item> HOT_ROYAL_CHOCOLATE_DRINK = ITEMS.register("hot_royal_chocolate_drink",
            () -> new DrinkItem(new Item.Properties().food(ModFoods.HOT_ROYAL_CHOCOLATE_DRINK).craftRemainder(Items.GLASS_BOTTLE)));
    public static final RegistryObject<Item> ROYAL_CHOCOLATE_COOKIE = ITEMS.register("royal_chocolate_cookie",
            () -> new Item(new Item.Properties().food(ModFoods.ROYAL_CHOCOLATE_COOKIE)));
    public static final RegistryObject<Item> ROYAL_CHOCOLATED_APPLE = ITEMS.register("royal_chocolated_apple",
            () -> new Item(new Item.Properties().food(ModFoods.ROYAL_CHOCOLATED_APPLE)));

    // Vegan Chocolate
    public static final RegistryObject<Item> VEGAN_CHOCOLATE_BUCKET = ITEMS.register("vegan_chocolate_bucket",
            () -> new BucketItem(ModFluids.SOURCE_VEGAN_CHOCOLATE_FLUID.get(), new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET)));
    public static final RegistryObject<Item> VEGAN_CHOCOLATE_CAKE_ITEM = ITEMS.register("vegan_chocolate_cake",
            () -> new BlockItem(ModBlocks.VEGAN_CHOCOLATE_CAKE.get(),
                    new Item.Properties().food(ModFoods.VEGAN_CHOCOLATE_CAKE_FOOD)));
    public static final RegistryObject<Item> VEGAN_CHOCOLATE_GLAZED_BERRIES = ITEMS.register("vegan_chocolate_glazed_berries",
            () -> new Item(new Item.Properties().food(ModFoods.VEGAN_CHOCOLATE_GLAZED_BERRIES)));
    public static final RegistryObject<Item> VEGAN_CHOCOLATE_PRALINE = ITEMS.register("vegan_chocolate_praline",
            () -> new Item(new Item.Properties().food(ModFoods.VEGAN_CHOCOLATE_PRALINE)));
    public static final RegistryObject<Item> VEGAN_CHOCOLATE_TRUFFLE = ITEMS.register("vegan_chocolate_truffle",
            () -> new Item(new Item.Properties().food(ModFoods.VEGAN_CHOCOLATE_TRUFFLE)));
    public static final RegistryObject<Item> HOT_VEGAN_CHOCOLATE_DRINK = ITEMS.register("hot_vegan_chocolate_drink",
            () -> new DrinkItem(new Item.Properties().food(ModFoods.HOT_VEGAN_CHOCOLATE_DRINK).craftRemainder(Items.GLASS_BOTTLE)));
    public static final RegistryObject<Item> VEGAN_CHOCOLATE_COOKIE = ITEMS.register("vegan_chocolate_cookie",
            () -> new Item(new Item.Properties().food(ModFoods.VEGAN_CHOCOLATE_COOKIE)));
    public static final RegistryObject<Item> VEGAN_CHOCOLATED_APPLE = ITEMS.register("vegan_chocolated_apple",
            () -> new Item(new Item.Properties().food(ModFoods.VEGAN_CHOCOLATED_APPLE)));
    public static final RegistryObject<Item> VEGAN_CHOCOLATE_MARSHMALLOW = ITEMS.register("vegan_chocolate_marshmallow",
            () -> new Item(new Item.Properties().food(ModFoods.VEGAN_CHOCOLATE_MARSHMALLOW)));
    public static final RegistryObject<Item> BAR_OF_VEGAN_CHOCOLATE = ITEMS.register("bar_of_vegan_chocolate",
            () -> new Item(new Item.Properties().food(ModFoods.BAR_OF_VEGAN_CHOCOLATE)));
    public static final RegistryObject<Item> FULL_VEGAN_CHOCOLATE_BAR = ITEMS.register("full_vegan_chocolate_bar",
            () -> new Item(new Item.Properties().food(ModFoods.FULL_VEGAN_CHOCOLATE_BAR)));
    public static final RegistryObject<Item> VEGAN_CHOCOLATE_DOUGH = ITEMS.register("vegan_chocolate_dough",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VEGAN_CHOCOLATE_STICK = ITEMS.register("vegan_chocolate_stick",
            () -> new Item(new Item.Properties()));

    // Almond
    public static final RegistryObject<Item> ALMOND_ITEM = ITEMS.register("almond",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALMOND_BUTTER = ITEMS.register("almond_butter",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALMOND_MILK_BUCKET = ITEMS.register("almond_milk_bucket",
            () -> new BucketItem(ModFluids.SOURCE_ALMOND_MILK_FLUID.get(), new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET)));

    // Register BlockItems for each block
    public static final RegistryObject<Item> ALMOND_LOG_ITEM = ITEMS.register("almond_log",
            () -> new BlockItem(ModBlocks.ALMOND_LOG.get(), new Item.Properties()));
    public static final RegistryObject<Item> ALMOND_WOOD_ITEM = ITEMS.register("almond_wood",
            () -> new BlockItem(ModBlocks.ALMOND_WOOD.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ALMOND_LOG_ITEM = ITEMS.register("stripped_almond_log",
            () -> new BlockItem(ModBlocks.STRIPPED_ALMOND_LOG.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ALMOND_WOOD_ITEM = ITEMS.register("stripped_almond_wood",
            () -> new BlockItem(ModBlocks.STRIPPED_ALMOND_WOOD.get(), new Item.Properties()));
    public static final RegistryObject<Item> ALMOND_PLANKS_ITEM = ITEMS.register("almond_planks",
            () -> new BlockItem(ModBlocks.ALMOND_PLANKS.get(), new Item.Properties()));
    public static final RegistryObject<Item> ALMOND_LEAVES_ITEM = ITEMS.register("almond_leaves",
            () -> new BlockItem(ModBlocks.ALMOND_LEAVES.get(), new Item.Properties()));
    public static final RegistryObject<Item> ALMOND_SAPLING_ITEM = ITEMS.register("almond_sapling",
            () -> new BlockItem(ModBlocks.ALMOND_SAPLING.get(), new Item.Properties()));

    // Vanilla Seed and stuff
    public static final RegistryObject<Item> VANILLA_SEED = ITEMS.register("vanilla_seed",
            () -> new ItemNameBlockItem(ModBlocks.VANILLA_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> VANILLA_LUSK = ITEMS.register("vanilla_lusk",
            () -> new Item(new Item.Properties().food(ModFoods.VANILLA_LUSK)));
    public static final RegistryObject<Item> VANILLA_BUTTER = ITEMS.register("vanilla_butter",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VANILLA_POWDER = ITEMS.register("vanilla_powder",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VANILLA_SUGAR = ITEMS.register("vanilla_sugar",
            () -> new Item(new Item.Properties()));
    // Apple Sauce
    public static final RegistryObject<Item> APPLE_SAUCE_DRINK = ITEMS.register("apple_sauce_drink",
            () -> new DrinkItem(new Item.Properties().food(ModFoods.APPLE_SAUCE_DRINK).craftRemainder(Items.GLASS_BOTTLE)));
    public static final RegistryObject<Item> APPLE_SAUCE_BUCKET = ITEMS.register("apple_sauce_bucket",
            () -> new BucketItem(ModFluids.SOURCE_APPLE_SAUCE_FLUID.get(), new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}