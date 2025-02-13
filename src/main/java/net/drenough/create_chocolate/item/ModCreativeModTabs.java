package net.drenough.create_chocolate.item;

import net.drenough.create_chocolate.CreateChocolate;
import net.drenough.create_chocolate.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateChocolate.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CREATE_CHOCOLATE_TAB = CREATIVE_MODE_TABS.register("create_chocolate_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BAR_OF_DARK_CHOCOLATE.get()))
                    .title(Component.translatable("creativetab.create_chocolate_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.COCOA_POWDER.get());
                        output.accept(ModItems.COCOA_SMASHED_BEANS.get());
                        output.accept(ModItems.GINGER_DOUGH.get());
                        output.accept(ModItems.DARK_CHOCOLATE_DOUGH.get());
                        output.accept(ModItems.WHITE_CHOCOLATE_DOUGH.get());
                        output.accept(ModItems.CARAMEL_DOUGH.get());
                        output.accept(ModItems.CHOCOLATE_MARSHMALLOW.get());
                        output.accept(ModItems.DARK_CHOCOLATE_MARSHMALLOW.get());
                        output.accept(ModItems.WHITE_CHOCOLATE_MARSHMALLOW.get());
                        output.accept(ModItems.CARAMEL_MARSHMALLOW.get());
                        output.accept(ModItems.CHOCOLATE_BUNNY.get());
                        output.accept(ModItems.DARK_CHOCOLATE_BUNNY.get());
                        output.accept(ModItems.WHITE_CHOCOLATE_BUNNY.get());
                        output.accept(ModItems.CARAMEL_BUNNY.get());
                        output.accept(ModItems.CHOCOLATE_EGG.get());
                        output.accept(ModItems.DARK_CHOCOLATE_EGG.get());
                        output.accept(ModItems.WHITE_CHOCOLATE_EGG.get());
                        output.accept(ModItems.CARAMEL_EGG.get());
                        output.accept(ModItems.CHOCOLATE_PRALINE.get());
                        output.accept(ModItems.DARK_CHOCOLATE_PRALINE.get());
                        output.accept(ModItems.WHITE_CHOCOLATE_PRALINE.get());
                        output.accept(ModItems.CARAMEL_PRALINE.get());
                        output.accept(ModItems.DARK_CHOCOLATE_GLAZED_BERRIES.get());
                        output.accept(ModItems.WHITE_CHOCOLATE_GLAZED_BERRIES.get());
                        output.accept(ModItems.CARAMEL_GLAZED_BERRIES.get());
                        output.accept(ModItems.CHOCOLATE_TRUFFLE.get());
                        output.accept(ModItems.DARK_CHOCOLATE_TRUFFLE.get());
                        output.accept(ModItems.WHITE_CHOCOLATE_TRUFFLE.get());
                        output.accept(ModItems.CARAMEL_TRUFFLE.get());
                        output.accept(ModItems.FULL_CHOCOLATE_BAR.get());
                        output.accept(ModItems.BAR_OF_DARK_CHOCOLATE.get());
                        output.accept(ModItems.FULL_DARK_CHOCOLATE_BAR.get());
                        output.accept(ModItems.BAR_OF_WHITE_CHOCOLATE.get());
                        output.accept(ModItems.FULL_WHITE_CHOCOLATE_BAR.get());
                        output.accept(ModItems.BAR_OF_CARAMEL.get());
                        output.accept(ModItems.FULL_CARAMEL_BAR.get());
                        output.accept(ModItems.HOT_CHOCOLATE_DRINK.get());
                        output.accept(ModItems.HOT_DARK_CHOCOLATE_DRINK.get());
                        output.accept(ModItems.HOT_WHITE_CHOCOLATE_DRINK.get());
                        output.accept(ModItems.HOT_CARAMEL_DRINK.get());
                        output.accept(ModItems.SWEET_HOT_CHOCOLATE_DRINK.get());
                        output.accept(ModItems.GINGER_BREAD_MAN.get());
                        output.accept(ModItems.GINGER_BREAD.get());
                        output.accept(ModItems.DARK_CHOCOLATE_COOKIE.get());
                        output.accept(ModItems.WHITE_CHOCOLATE_COOKIE.get());
                        output.accept(ModItems.CARAMEL_COOKIE.get());

                        output.accept(ModBlocks.CHOCOLATE_BRICKS.get());
                        output.accept(ModBlocks.CHOCOLATE_BRICK_SLAB.get());
                        output.accept(ModBlocks.CHOCOLATE_BRICK_STAIRS.get());
                        output.accept(ModBlocks.CHOCOLATE_BRICK_WALL.get());
                        output.accept(ModBlocks.CHOCOLATE_BRICK_DOOR.get());
                        output.accept(ModBlocks.CHOCOLATE_BRICK_TRAPDOOR.get());
                        output.accept(ModBlocks.CHOCOLATE_BRICK_FENCE.get());
                        output.accept(ModBlocks.CHOCOLATE_BRICK_FENCE_GATE.get());
                        output.accept(ModBlocks.DARK_CHOCOLATE_BRICKS.get());
                        output.accept(ModBlocks.DARK_CHOCOLATE_SLAB.get());
                        output.accept(ModBlocks.DARK_CHOCOLATE_STAIRS.get());
                        output.accept(ModBlocks.DARK_CHOCOLATE_WALL.get());
                        output.accept(ModBlocks.DARK_CHOCOLATE_DOOR.get());
                        output.accept(ModBlocks.DARK_CHOCOLATE_TRAPDOOR.get());
                        output.accept(ModBlocks.DARK_CHOCOLATE_FENCE.get());
                        output.accept(ModBlocks.DARK_CHOCOLATE_FENCE_GATE.get());
                        output.accept(ModBlocks.WHITE_CHOCOLATE_BRICKS.get());
                        output.accept(ModBlocks.WHITE_CHOCOLATE_SLAB.get());
                        output.accept(ModBlocks.WHITE_CHOCOLATE_STAIRS.get());
                        output.accept(ModBlocks.WHITE_CHOCOLATE_WALL.get());
                        output.accept(ModBlocks.WHITE_CHOCOLATE_DOOR.get());
                        output.accept(ModBlocks.WHITE_CHOCOLATE_TRAPDOOR.get());
                        output.accept(ModBlocks.WHITE_CHOCOLATE_FENCE.get());
                        output.accept(ModBlocks.WHITE_CHOCOLATE_FENCE_GATE.get());
                        output.accept(ModBlocks.CARAMEL_BRICKS.get());
                        output.accept(ModBlocks.CARAMEL_SLAB.get());
                        output.accept(ModBlocks.CARAMEL_STAIRS.get());
                        output.accept(ModBlocks.CARAMEL_WALL.get());
                        output.accept(ModBlocks.CARAMEL_DOOR.get());
                        output.accept(ModBlocks.CARAMEL_TRAPDOOR.get());
                        output.accept(ModBlocks.CARAMEL_FENCE.get());
                        output.accept(ModBlocks.CARAMEL_FENCE_GATE.get());

                        output.accept(ModItems.HARD_CHOCOLATE_STICK.get());
                        output.accept(ModItems.DARK_CHOCOLATE_STICK.get());
                        output.accept(ModItems.WHITE_CHOCOLATE_STICK.get());
                        output.accept(ModItems.CARAMEL_STICK.get());
                        output.accept(ModItems.HARD_CHOCOLATE_PICKAXE.get());
                        output.accept(ModItems.HARD_CHOCOLATE_AXE.get());
                        output.accept(ModItems.HARD_CHOCOLATE_SWORD.get());
                        output.accept(ModItems.HARD_CHOCOLATE_SHOVEL.get());
                        output.accept(ModItems.HARD_CHOCOLATE_HOE.get());
                        output.accept(ModItems.HARD_CHOCOLATE_HELMET.get());
                        output.accept(ModItems.HARD_CHOCOLATE_CHESTPLATE.get());
                        output.accept(ModItems.HARD_CHOCOLATE_LEGGINGS.get());
                        output.accept(ModItems.HARD_CHOCOLATE_BOOTS.get());

                        output.accept(ModItems.DARK_CHOCOLATE_BUCKET.get());
                    })
                    .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
