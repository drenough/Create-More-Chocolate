package net.drenough.create_chocolate.block;

import net.drenough.create_chocolate.CreateChocolate;
import net.drenough.create_chocolate.item.ModItems;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CreateChocolate.MOD_ID);
    // Chocolate Bricks (Already added)
    public static final RegistryObject<Block> CHOCOLATE_BRICKS = registerBlock("chocolate_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    // Chocolate Brick Stairs (Already added)
    public static final RegistryObject<Block> CHOCOLATE_BRICK_STAIRS = registerBlock("chocolate_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.CHOCOLATE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS)));
    // Chocolate Brick Slab (Already added)
    public static final RegistryObject<Block> CHOCOLATE_BRICK_SLAB = registerBlock("chocolate_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB)));
    // Chocolate Brick Door
    public static final RegistryObject<Block> CHOCOLATE_BRICK_DOOR = registerBlock("chocolate_brick_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).noOcclusion(), BlockSetType.STONE));
    // Chocolate Brick Trapdoor
    public static final RegistryObject<Block> CHOCOLATE_BRICK_TRAPDOOR = registerBlock("chocolate_brick_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).noOcclusion(), BlockSetType.STONE));
    // Chocolate Brick Wall (Already added) - not connecting to other blocks/missing tag
    public static final RegistryObject<Block> CHOCOLATE_BRICK_WALL = registerBlock("chocolate_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL)));
    // Chocolate Brick Fence (Already added) - not connecting to other blocks/missing tag
    public static final RegistryObject<Block> CHOCOLATE_BRICK_FENCE = registerBlock("chocolate_brick_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    // Chocolate Brick FenceGate (Already added)
    public static final RegistryObject<Block> CHOCOLATE_BRICK_FENCE_GATE = registerBlock("chocolate_brick_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));




    public static final RegistryObject<Block> DARK_CHOCOLATE_BRICKS = registerBlock("dark_chocolate_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));




    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void  register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
