package net.drenough.create_chocolate.block;

import net.drenough.create_chocolate.CreateChocolate;
import net.drenough.create_chocolate.fluid.ModFluids;
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

    // Chocolate Bricks
    public static final RegistryObject<Block> CHOCOLATE_BRICKS = registerBlock("chocolate_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    // Chocolate Brick Stairs
    public static final RegistryObject<Block> CHOCOLATE_BRICK_STAIRS = registerBlock("chocolate_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.CHOCOLATE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS)));
    // Chocolate Brick Slab
    public static final RegistryObject<Block> CHOCOLATE_BRICK_SLAB = registerBlock("chocolate_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB)));
    // Chocolate Brick Door
    public static final RegistryObject<Block> CHOCOLATE_BRICK_DOOR = registerBlock("chocolate_brick_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).noOcclusion(), BlockSetType.STONE));
    // Chocolate Brick Trapdoor
    public static final RegistryObject<Block> CHOCOLATE_BRICK_TRAPDOOR = registerBlock("chocolate_brick_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).noOcclusion(), BlockSetType.STONE));
    // Chocolate Brick Wall
    public static final RegistryObject<Block> CHOCOLATE_BRICK_WALL = registerBlock("chocolate_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL)));
    // Chocolate Brick Fence
    public static final RegistryObject<Block> CHOCOLATE_BRICK_FENCE = registerBlock("chocolate_brick_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    // Chocolate Brick FenceGate
    public static final RegistryObject<Block> CHOCOLATE_BRICK_FENCE_GATE = registerBlock("chocolate_brick_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    // Chocolate Cake
    public static final RegistryObject<Block> CHOCOLATE_CAKE = BLOCKS.register("chocolate_cake",
            () -> new ChocolateCakeBlock(BlockBehaviour.Properties.copy(Blocks.CAKE)));



    // Dark Chocolate Bricks
    public static final RegistryObject<Block> DARK_CHOCOLATE_BRICKS = registerBlock("dark_chocolate_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    // Dark Chocolate Stairs
    public static final RegistryObject<Block> DARK_CHOCOLATE_STAIRS = registerBlock("dark_chocolate_stairs",
            () -> new StairBlock(() -> ModBlocks.DARK_CHOCOLATE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS)));
    // Dark Chocolate Slab
    public static final RegistryObject<Block> DARK_CHOCOLATE_SLAB = registerBlock("dark_chocolate_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB)));
    // Dark Chocolate Door
    public static final RegistryObject<Block> DARK_CHOCOLATE_DOOR = registerBlock("dark_chocolate_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).noOcclusion(), BlockSetType.STONE));
    // Dark Chocolate Trapdoor
    public static final RegistryObject<Block> DARK_CHOCOLATE_TRAPDOOR = registerBlock("dark_chocolate_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).noOcclusion(), BlockSetType.STONE));
    // Dark Chocolate Wall
    public static final RegistryObject<Block> DARK_CHOCOLATE_WALL = registerBlock("dark_chocolate_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL)));
    // Dark Chocolate Fence
    public static final RegistryObject<Block> DARK_CHOCOLATE_FENCE = registerBlock("dark_chocolate_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    // Dark Chocolate FenceGate
    public static final RegistryObject<Block> DARK_CHOCOLATE_FENCE_GATE = registerBlock("dark_chocolate_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    // Dark Chocolate Block
    public static final RegistryObject<LiquidBlock> DARK_CHOCOLATE_BLOCK = BLOCKS.register("dark_chocolate_block",
            () -> new LiquidBlock(ModFluids.SOURCE_DARK_CHOCOLATE_FLUID, BlockBehaviour.Properties.copy(Blocks.WATER).noOcclusion()));
    // Dark Chocolate Cake
    public static final RegistryObject<Block> DARK_CHOCOLATE_CAKE = BLOCKS.register("dark_chocolate_cake",
            () -> new DarkChocolateCakeBlock(BlockBehaviour.Properties.copy(Blocks.CAKE)));


    // White Chocolate Bricks
    public static final RegistryObject<Block> WHITE_CHOCOLATE_BRICKS = registerBlock("white_chocolate_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    // White Chocolate Stairs
    public static final RegistryObject<Block> WHITE_CHOCOLATE_STAIRS = registerBlock("white_chocolate_stairs",
            () -> new StairBlock(() -> ModBlocks.WHITE_CHOCOLATE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS)));
    // White Chocolate Slab
    public static final RegistryObject<Block> WHITE_CHOCOLATE_SLAB = registerBlock("white_chocolate_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB)));
    // White Chocolate Door
    public static final RegistryObject<Block> WHITE_CHOCOLATE_DOOR = registerBlock("white_chocolate_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).noOcclusion(), BlockSetType.STONE));
    // White Chocolate Trapdoor
    public static final RegistryObject<Block> WHITE_CHOCOLATE_TRAPDOOR = registerBlock("white_chocolate_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).noOcclusion(), BlockSetType.STONE));
    // White Chocolate Wall
    public static final RegistryObject<Block> WHITE_CHOCOLATE_WALL = registerBlock("white_chocolate_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL)));
    // White Chocolate Fence
    public static final RegistryObject<Block> WHITE_CHOCOLATE_FENCE = registerBlock("white_chocolate_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    // White Chocolate FenceGate
    public static final RegistryObject<Block> WHITE_CHOCOLATE_FENCE_GATE = registerBlock("white_chocolate_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    // White Chocolate Block
    public static final RegistryObject<LiquidBlock> WHITE_CHOCOLATE_BLOCK = BLOCKS.register("white_chocolate_block",
            () -> new LiquidBlock(ModFluids.SOURCE_WHITE_CHOCOLATE_FLUID, BlockBehaviour.Properties.copy(Blocks.WATER).noOcclusion()));
    // White Chocolate Cake
    public static final RegistryObject<Block> WHITE_CHOCOLATE_CAKE = BLOCKS.register("white_chocolate_cake",
            () -> new WhiteChocolateCakeBlock(BlockBehaviour.Properties.copy(Blocks.CAKE)));


    // Caramel Bricks
    public static final RegistryObject<Block> CARAMEL_BRICKS = registerBlock("caramel_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    // Caramel Stairs
    public static final RegistryObject<Block> CARAMEL_STAIRS = registerBlock("caramel_stairs",
            () -> new StairBlock(() -> ModBlocks.CARAMEL_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS)));
    // Caramel Slab
    public static final RegistryObject<Block> CARAMEL_SLAB = registerBlock("caramel_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB)));
    // Caramel Door
    public static final RegistryObject<Block> CARAMEL_DOOR = registerBlock("caramel_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).noOcclusion(), BlockSetType.STONE));
    // Caramel Trapdoor
    public static final RegistryObject<Block> CARAMEL_TRAPDOOR = registerBlock("caramel_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).noOcclusion(), BlockSetType.STONE));
    // Caramel Wall
    public static final RegistryObject<Block> CARAMEL_WALL = registerBlock("caramel_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL)));
    // Caramel Fence
    public static final RegistryObject<Block> CARAMEL_FENCE = registerBlock("caramel_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    // Caramel FenceGate
    public static final RegistryObject<Block> CARAMEL_FENCE_GATE = registerBlock("caramel_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    // Caramel Block
    public static final RegistryObject<LiquidBlock> CARAMEL_BLOCK = BLOCKS.register("caramel_block",
            () -> new LiquidBlock(ModFluids.SOURCE_CARAMEL_FLUID, BlockBehaviour.Properties.copy(Blocks.WATER).noOcclusion()));
    // Caramel Cake
    public static final RegistryObject<Block> CARAMEL_CAKE = BLOCKS.register("caramel_cake",
            () -> new CaramelCakeBlock(BlockBehaviour.Properties.copy(Blocks.CAKE)));

    // Cardboard Boxes of Chocolate types
    public static final RegistryObject<Block> CARDBOARD_BOX_OF_CHOCOLATE = registerBlock("cardboard_box_of_chocolate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));
    public static final RegistryObject<Block> CARDBOARD_BOX_OF_DARK_CHOCOLATE = registerBlock("cardboard_box_of_dark_chocolate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));
    public static final RegistryObject<Block> CARDBOARD_BOX_OF_WHITE_CHOCOLATE = registerBlock("cardboard_box_of_white_chocolate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));
    public static final RegistryObject<Block> CARDBOARD_BOX_OF_CARAMEL = registerBlock("cardboard_box_of_caramel",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));
    public static final RegistryObject<Block> CARDBOARD_BOX_OF_ROYAL_CHOCOLATE = registerBlock("cardboard_box_of_royal_chocolate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));

    // Pallets with Chocolate Boxes
    public static final RegistryObject<Block> PALLET_OF_CHOCOLATE = registerBlock("pallet_of_chocolate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> PALLET_OF_DARK_CHOCOLATE = registerBlock("pallet_of_dark_chocolate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> PALLET_OF_WHITE_CHOCOLATE = registerBlock("pallet_of_white_chocolate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> PALLET_OF_CARAMEL = registerBlock("pallet_of_caramel",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> PALLET_OF_ROYAL_CHOCOLATE = registerBlock("pallet_of_royal_chocolate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    // Royal Chocolate Fluid Block
    public static final RegistryObject<LiquidBlock> ROYAL_CHOCOLATE_BLOCK = BLOCKS.register("royal_chocolate_block",
            () -> new LiquidBlock(ModFluids.SOURCE_ROYAL_CHOCOLATE_FLUID, BlockBehaviour.Properties.copy(Blocks.WATER).noCollission()));
    // Royal Chocolate Bricks
    public static final RegistryObject<Block> ROYAL_CHOCOLATE_BRICKS = registerBlock("royal_chocolate_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    // Royal Chocolate Stairs
    public static final RegistryObject<Block> ROYAL_CHOCOLATE_STAIRS = registerBlock("royal_chocolate_stairs",
            () -> new StairBlock(() -> ModBlocks.ROYAL_CHOCOLATE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS)));
    // Royal Chocolate Slab
    public static final RegistryObject<Block> ROYAL_CHOCOLATE_SLAB = registerBlock("royal_chocolate_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB)));
    // Royal Chocolate Door
    public static final RegistryObject<Block> ROYAL_CHOCOLATE_DOOR = registerBlock("royal_chocolate_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).noOcclusion(), BlockSetType.OAK));
    // Royal Chocolate Trapdoor
    public static final RegistryObject<Block> ROYAL_CHOCOLATE_TRAPDOOR = registerBlock("royal_chocolate_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).noOcclusion(), BlockSetType.OAK));
    // Royal Chocolate Wall
    public static final RegistryObject<Block> ROYAL_CHOCOLATE_WALL = registerBlock("royal_chocolate_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL)));
    // Royal Chocolate Fence
    public static final RegistryObject<Block> ROYAL_CHOCOLATE_FENCE = registerBlock("royal_chocolate_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    // Royal Chocolate Fence Gate
    public static final RegistryObject<Block> ROYAL_CHOCOLATE_FENCE_GATE = registerBlock("royal_chocolate_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    // Royal Chocolate Food
    public static final RegistryObject<Block> ROYAL_CHOCOLATE_CAKE = BLOCKS.register("royal_chocolate_cake",
            () -> new RoyalChocolateCakeBlock(BlockBehaviour.Properties.copy(Blocks.CAKE)));



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
