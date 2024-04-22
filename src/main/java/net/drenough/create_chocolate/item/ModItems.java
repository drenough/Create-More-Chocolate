package net.drenough.create_chocolate.item;

import net.drenough.create_chocolate.CreateChocolate;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CreateChocolate.MOD_ID);

    public static final RegistryObject<Item> BAR_OF_DARK_CHOCOLATE = ITEMS.register("bar_of_dark_chocolate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BAR_OF_WHITE_CHOCOLATE = ITEMS.register("bar_of_white_chocolate",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
