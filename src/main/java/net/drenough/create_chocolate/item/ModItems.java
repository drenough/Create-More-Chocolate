package net.drenough.create_chocolate.item;

import net.drenough.create_chocolate.CreateChocolate;
import net.drenough.create_chocolate.fluid.ModFluids;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

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
    public static final RegistryObject<Item> CHOCOLATE_GLAZED_BERRIES = ITEMS.register("chocolate_glazed_berries",
            () -> new Item(new Item.Properties().food(ModFoods.CHOCOLATE_GLAZED_BERRIES)));
    public static final RegistryObject<Item> CHOCOLATE_PRALINE = ITEMS.register("chocolate_praline",
            () -> new Item(new Item.Properties().food(ModFoods.CHOCOLATE_PRALINE)));
    public static final RegistryObject<Item> CHOCOLATE_TRUFFLE = ITEMS.register("chocolate_truffle",
            () -> new Item(new Item.Properties().food(ModFoods.CHOCOLATE_TRUFFLE)));
    public static final RegistryObject<Item> HOT_CHOCOLATE_DRINK = ITEMS.register("hot_chocolate_drink",
            () -> new Item(new Item.Properties().food(ModFoods.HOT_CHOCOLATE_DRINK)));
    public static final RegistryObject<Item> SWEET_HOT_CHOCOLATE_DRINK = ITEMS.register("sweet_hot_chocolate_drink",
            () -> new Item(new Item.Properties().food(ModFoods.SWEET_HOT_CHOCOLATE_DRINK)));
    public static final RegistryObject<Item> GINGER_BREAD_MAN = ITEMS.register("ginger_bread_man",
            () -> new Item(new Item.Properties().food(ModFoods.GINGER_BREAD_MAN)));
    public static final RegistryObject<Item> GINGER_BREAD = ITEMS.register("ginger_bread",
            () -> new Item(new Item.Properties().food(ModFoods.GINGER_BREAD)));

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
            () -> new Item(new Item.Properties().food(ModFoods.HOT_DARK_CHOCOLATE_DRINK)));
    public static final RegistryObject<Item> DARK_CHOCOLATE_COOKIE = ITEMS.register("dark_chocolate_cookie",
            () -> new Item(new Item.Properties().food(ModFoods.DARK_CHOCOLATE_COOKIE)));

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
            () -> new Item(new Item.Properties().food(ModFoods.HOT_WHITE_CHOCOLATE_DRINK)));
    public static final RegistryObject<Item> WHITE_CHOCOLATE_COOKIE = ITEMS.register("white_chocolate_cookie",
            () -> new Item(new Item.Properties().food(ModFoods.WHITE_CHOCOLATE_COOKIE)));

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
            () -> new Item(new Item.Properties().food(ModFoods.HOT_CARAMEL_DRINK)));
    public static final RegistryObject<Item> CARAMEL_COOKIE = ITEMS.register("caramel_cookie",
            () -> new Item(new Item.Properties().food(ModFoods.CARAMEL_COOKIE)));

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

    // Dark Chocolate Stick
    public static final RegistryObject<Item> DARK_CHOCOLATE_STICK = ITEMS.register("dark_chocolate_stick",
            () -> new Item(new Item.Properties()));

    // White Chocolate Stick
    public static final RegistryObject<Item> WHITE_CHOCOLATE_STICK = ITEMS.register("white_chocolate_stick",
            () -> new Item(new Item.Properties()));

    // Caramel Stick
    public static final RegistryObject<Item> CARAMEL_STICK = ITEMS.register("caramel_stick",
            () -> new Item(new Item.Properties()));

    /// Hard Chocolate Tools

    // Hard Chocolate Stick
    public static final RegistryObject<Item> HARD_CHOCOLATE_STICK = ITEMS.register("hard_chocolate_stick",
            () -> new Item(new Item.Properties()));
    // Hard Chocolate Pickaxe
    public static final RegistryObject<Item> HARD_CHOCOLATE_PICKAXE = ITEMS.register("hard_chocolate_pickaxe",
            () -> new PickaxeItem(Tiers.STONE, 1, -2, new Item.Properties().defaultDurability(175)));
    // Hard Chocolate Axe
    public static final RegistryObject<Item> HARD_CHOCOLATE_AXE = ITEMS.register("hard_chocolate_axe",
            () -> new AxeItem(Tiers.STONE, 7, -3, new Item.Properties().defaultDurability(175)));
    // Hard Chocolate Sword
    public static final RegistryObject<Item> HARD_CHOCOLATE_SWORD = ITEMS.register("hard_chocolate_sword",
            () -> new SwordItem(Tiers.STONE, 3, -2, new Item.Properties().defaultDurability(175)));
    // Hard Chocolate Shovel
    public static final RegistryObject<Item> HARD_CHOCOLATE_SHOVEL = ITEMS.register("hard_chocolate_shovel",
            () -> new ShovelItem(Tiers.STONE, 2, -3, new Item.Properties().defaultDurability(175)));
    // Hard Chocolate Hoe
    public static final RegistryObject<Item> HARD_CHOCOLATE_HOE = ITEMS.register("hard_chocolate_hoe",
            () -> new HoeItem(Tiers.STONE, 0, -1, new Item.Properties().defaultDurability(175)));

    /// Hard Chocolate Armor

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


    public static final RegistryObject<Item> DARK_CHOCOLATE_BUCKET = ITEMS.register("dark_chocolate_bucket",
            () -> new BucketItem(ModFluids.SOURCE_DARK_CHOCOLATE_FLUID, new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
