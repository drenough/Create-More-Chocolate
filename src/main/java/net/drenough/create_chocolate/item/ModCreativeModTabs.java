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
                        output.accept(ModItems.BAR_OF_DARK_CHOCOLATE.get());
                        output.accept(ModItems.BAR_OF_WHITE_CHOCOLATE.get());

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

                        output.accept(ModItems.HARD_CHOCOLATE_STICK.get());
                        output.accept(ModItems.DARK_CHOCOLATE_STICK.get());
                        output.accept(ModItems.HARD_CHOCOLATE_PICKAXE.get());
                        output.accept(ModItems.HARD_CHOCOLATE_AXE.get());
                        output.accept(ModItems.HARD_CHOCOLATE_SWORD.get());
                        output.accept(ModItems.HARD_CHOCOLATE_SHOVEL.get());
                        output.accept(ModItems.HARD_CHOCOLATE_HOE.get());
                        output.accept(ModItems.HARD_CHOCOLATE_HELMET.get());
                        output.accept(ModItems.HARD_CHOCOLATE_CHESTPLATE.get());
                        output.accept(ModItems.HARD_CHOCOLATE_LEGGINGS.get());
                        output.accept(ModItems.HARD_CHOCOLATE_BOOTS.get());
                    })
                    .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
