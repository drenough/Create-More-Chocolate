package net.drenough.create_chocolate.block;

import net.drenough.create_chocolate.CreateChocolate;
import net.drenough.create_chocolate.block.almond.AlmondLeavesBlock;
import net.drenough.create_chocolate.block.almond.ModFlammableRotatedPillarBlock;
import net.drenough.create_chocolate.fluid.ModFluids;
import net.drenough.create_chocolate.worldgen.tree.ModTreeGrowers;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

import static net.drenough.create_chocolate.item.ModItems.ITEMS;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(CreateChocolate.MOD_ID);

    // Chocolate Bricks
    public static final DeferredBlock<Block> CHOCOLATE_BRICKS = registerBlock("chocolate_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    // Chocolate Brick Stairs
    public static final DeferredBlock<Block> CHOCOLATE_BRICK_STAIRS = registerBlock("chocolate_brick_stairs",
            () -> new StairBlock(ModBlocks.CHOCOLATE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_STAIRS)));
    // Chocolate Brick Slab
    public static final DeferredBlock<Block> CHOCOLATE_BRICK_SLAB = registerBlock("chocolate_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_SLAB)));
    // Chocolate Brick Door
    public static final DeferredBlock<Block> CHOCOLATE_BRICK_DOOR = registerBlock("chocolate_brick_door",
            () -> new DoorBlock(BlockSetType.STONE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion()));
    // Chocolate Brick Trapdoor
    public static final DeferredBlock<Block> CHOCOLATE_BRICK_TRAPDOOR = registerBlock("chocolate_brick_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.STONE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).noOcclusion()));
    // Chocolate Brick Wall
    public static final DeferredBlock<Block> CHOCOLATE_BRICK_WALL = registerBlock("chocolate_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)));
    // Chocolate Brick Fence
    public static final DeferredBlock<Block> CHOCOLATE_BRICK_FENCE = registerBlock("chocolate_brick_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    // Chocolate Brick FenceGate
    public static final DeferredBlock<Block> CHOCOLATE_BRICK_FENCE_GATE = registerBlock("chocolate_brick_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    // Chocolate Cake
    public static final DeferredBlock<Block> CHOCOLATE_CAKE = BLOCKS.register("chocolate_cake",
            () -> new ChocolateCakeBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE)));



    // Dark Chocolate Bricks
    public static final DeferredBlock<Block> DARK_CHOCOLATE_BRICKS = registerBlock("dark_chocolate_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    // Dark Chocolate Stairs
    public static final DeferredBlock<Block> DARK_CHOCOLATE_STAIRS = registerBlock("dark_chocolate_stairs",
            () -> new StairBlock(ModBlocks.DARK_CHOCOLATE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_STAIRS)));
    // Dark Chocolate Slab
    public static final DeferredBlock<Block> DARK_CHOCOLATE_SLAB = registerBlock("dark_chocolate_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_SLAB)));
    // Dark Chocolate Door
    public static final DeferredBlock<Block> DARK_CHOCOLATE_DOOR = registerBlock("dark_chocolate_door",
            () -> new DoorBlock(BlockSetType.STONE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion()));
    // Dark Chocolate Trapdoor
    public static final DeferredBlock<Block> DARK_CHOCOLATE_TRAPDOOR = registerBlock("dark_chocolate_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.STONE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).noOcclusion()));
    // Dark Chocolate Wall
    public static final DeferredBlock<Block> DARK_CHOCOLATE_WALL = registerBlock("dark_chocolate_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)));
    // Dark Chocolate Fence
    public static final DeferredBlock<Block> DARK_CHOCOLATE_FENCE = registerBlock("dark_chocolate_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    // Dark Chocolate FenceGate
    public static final DeferredBlock<Block> DARK_CHOCOLATE_FENCE_GATE = registerBlock("dark_chocolate_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    // Dark Chocolate Block
    public static final DeferredBlock<LiquidBlock> DARK_CHOCOLATE_BLOCK = BLOCKS.register("dark_chocolate_block",
            () -> new LiquidBlock(ModFluids.SOURCE_DARK_CHOCOLATE_FLUID.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER).noOcclusion()));
    // Dark Chocolate Cake
    public static final DeferredBlock<Block> DARK_CHOCOLATE_CAKE = BLOCKS.register("dark_chocolate_cake",
            () -> new DarkChocolateCakeBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE)));


    // White Chocolate Bricks
    public static final DeferredBlock<Block> WHITE_CHOCOLATE_BRICKS = registerBlock("white_chocolate_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    // White Chocolate Stairs
    public static final DeferredBlock<Block> WHITE_CHOCOLATE_STAIRS = registerBlock("white_chocolate_stairs",
            () -> new StairBlock(ModBlocks.WHITE_CHOCOLATE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_STAIRS)));
    // White Chocolate Slab
    public static final DeferredBlock<Block> WHITE_CHOCOLATE_SLAB = registerBlock("white_chocolate_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_SLAB)));
    // White Chocolate Door
    public static final DeferredBlock<Block> WHITE_CHOCOLATE_DOOR = registerBlock("white_chocolate_door",
            () -> new DoorBlock(BlockSetType.STONE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion()));
    // White Chocolate Trapdoor
    public static final DeferredBlock<Block> WHITE_CHOCOLATE_TRAPDOOR = registerBlock("white_chocolate_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.STONE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).noOcclusion()));
    // White Chocolate Wall
    public static final DeferredBlock<Block> WHITE_CHOCOLATE_WALL = registerBlock("white_chocolate_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)));
    // White Chocolate Fence
    public static final DeferredBlock<Block> WHITE_CHOCOLATE_FENCE = registerBlock("white_chocolate_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    // White Chocolate FenceGate
    public static final DeferredBlock<Block> WHITE_CHOCOLATE_FENCE_GATE = registerBlock("white_chocolate_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    // White Chocolate Block
    public static final DeferredBlock<LiquidBlock> WHITE_CHOCOLATE_BLOCK = BLOCKS.register("white_chocolate_block",
            () -> new LiquidBlock(ModFluids.SOURCE_WHITE_CHOCOLATE_FLUID.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER).noOcclusion()));
    // White Chocolate Cake
    public static final DeferredBlock<Block> WHITE_CHOCOLATE_CAKE = BLOCKS.register("white_chocolate_cake",
            () -> new WhiteChocolateCakeBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE)));


    // Caramel Bricks
    public static final DeferredBlock<Block> CARAMEL_BRICKS = registerBlock("caramel_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    // Caramel Stairs
    public static final DeferredBlock<Block> CARAMEL_STAIRS = registerBlock("caramel_stairs",
            () -> new StairBlock(ModBlocks.CARAMEL_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_STAIRS)));
    // Caramel Slab
    public static final DeferredBlock<Block> CARAMEL_SLAB = registerBlock("caramel_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_SLAB)));
    // Caramel Door
    public static final DeferredBlock<Block> CARAMEL_DOOR = registerBlock("caramel_door",
            () -> new DoorBlock(BlockSetType.STONE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion()));
    // Caramel Trapdoor
    public static final DeferredBlock<Block> CARAMEL_TRAPDOOR = registerBlock("caramel_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.STONE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).noOcclusion()));
    // Caramel Wall
    public static final DeferredBlock<Block> CARAMEL_WALL = registerBlock("caramel_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)));
    // Caramel Fence
    public static final DeferredBlock<Block> CARAMEL_FENCE = registerBlock("caramel_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    // Caramel FenceGate
    public static final DeferredBlock<Block> CARAMEL_FENCE_GATE = registerBlock("caramel_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    // Caramel Block
    public static final DeferredBlock<LiquidBlock> CARAMEL_BLOCK = BLOCKS.register("caramel_block",
            () -> new LiquidBlock(ModFluids.SOURCE_CARAMEL_FLUID.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER).noOcclusion()));
    // Caramel Cake
    public static final DeferredBlock<Block> CARAMEL_CAKE = BLOCKS.register("caramel_cake",
            () -> new CaramelCakeBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE)));

    // Cardboard Boxes of Chocolate types
    public static final DeferredBlock<Block> CARDBOARD_BOX_OF_CHOCOLATE = registerBlock("cardboard_box_of_chocolate",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_WOOL)));
    public static final DeferredBlock<Block> CARDBOARD_BOX_OF_DARK_CHOCOLATE = registerBlock("cardboard_box_of_dark_chocolate",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_WOOL)));
    public static final DeferredBlock<Block> CARDBOARD_BOX_OF_WHITE_CHOCOLATE = registerBlock("cardboard_box_of_white_chocolate",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_WOOL)));
    public static final DeferredBlock<Block> CARDBOARD_BOX_OF_CARAMEL = registerBlock("cardboard_box_of_caramel",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_WOOL)));
    public static final DeferredBlock<Block> CARDBOARD_BOX_OF_ROYAL_CHOCOLATE = registerBlock("cardboard_box_of_royal_chocolate",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_WOOL)));
    public static final DeferredBlock<Block> CARDBOARD_BOX_OF_VEGAN_CHOCOLATE = registerBlock("cardboard_box_of_vegan_chocolate",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_WOOL)));

    // Pallets with Chocolate Boxes
    public static final DeferredBlock<Block> PALLET_OF_CHOCOLATE = registerBlock("pallet_of_chocolate",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> PALLET_OF_DARK_CHOCOLATE = registerBlock("pallet_of_dark_chocolate",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> PALLET_OF_WHITE_CHOCOLATE = registerBlock("pallet_of_white_chocolate",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> PALLET_OF_CARAMEL = registerBlock("pallet_of_caramel",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> PALLET_OF_ROYAL_CHOCOLATE = registerBlock("pallet_of_royal_chocolate",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> PALLET_OF_VEGAN_CHOCOLATE = registerBlock("pallet_of_vegan_chocolate",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 3.0f)
                    .sound(SoundType.WOOD)
                    .requiresCorrectToolForDrops()));

    // Royal Chocolate Fluid Block
    public static final DeferredBlock<LiquidBlock> ROYAL_CHOCOLATE_BLOCK = BLOCKS.register("royal_chocolate_block",
            () -> new LiquidBlock(ModFluids.SOURCE_ROYAL_CHOCOLATE_FLUID.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER).noCollission()));
    // Royal Chocolate Bricks
    public static final DeferredBlock<Block> ROYAL_CHOCOLATE_BRICKS = registerBlock("royal_chocolate_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    // Royal Chocolate Stairs
    public static final DeferredBlock<Block> ROYAL_CHOCOLATE_STAIRS = registerBlock("royal_chocolate_stairs",
            () -> new StairBlock(ModBlocks.ROYAL_CHOCOLATE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_STAIRS)));
    // Royal Chocolate Slab
    public static final DeferredBlock<Block> ROYAL_CHOCOLATE_SLAB = registerBlock("royal_chocolate_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_SLAB)));
    // Royal Chocolate Door
    public static final DeferredBlock<Block> ROYAL_CHOCOLATE_DOOR = registerBlock("royal_chocolate_door",
            () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion()));
    // Royal Chocolate Trapdoor
    public static final DeferredBlock<Block> ROYAL_CHOCOLATE_TRAPDOOR = registerBlock("royal_chocolate_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).noOcclusion()));
    // Royal Chocolate Wall
    public static final DeferredBlock<Block> ROYAL_CHOCOLATE_WALL = registerBlock("royal_chocolate_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)));
    // Royal Chocolate Fence
    public static final DeferredBlock<Block> ROYAL_CHOCOLATE_FENCE = registerBlock("royal_chocolate_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    // Royal Chocolate Fence Gate
    public static final DeferredBlock<Block> ROYAL_CHOCOLATE_FENCE_GATE = registerBlock("royal_chocolate_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    // Royal Chocolate Food
    public static final DeferredBlock<Block> ROYAL_CHOCOLATE_CAKE = BLOCKS.register("royal_chocolate_cake",
            () -> new RoyalChocolateCakeBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE)));

    // Almond Tree
    public static final DeferredBlock<Block> ALMOND_LOG = BLOCKS.register("almond_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> ALMOND_WOOD = BLOCKS.register("almond_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<Block> STRIPPED_ALMOND_LOG = BLOCKS.register("stripped_almond_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<Block> STRIPPED_ALMOND_WOOD = BLOCKS.register("stripped_almond_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));

    public static final DeferredBlock<Block> ALMOND_PLANKS = BLOCKS.register("almond_planks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)){
                @Override
                public boolean isFlammable(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos, @NotNull Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos, @NotNull Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos, @NotNull Direction direction) {
                    return 5;
                }
            });
    public static final DeferredBlock<Block> ALMOND_LEAVES = BLOCKS.register("almond_leaves",
            () -> new AlmondLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)){
                @Override
                public boolean isFlammable(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos, @NotNull Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos, @NotNull Direction direction) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos, @NotNull Direction direction) {
                    return 30;
                }
            });
    public static final DeferredBlock<Block> ALMOND_SAPLING = BLOCKS.register("almond_sapling",
            () -> new SaplingBlock(ModTreeGrowers.ALMOND, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));

    // Register BlockItems for each block
    public static final DeferredItem<Item> ALMOND_LOG_ITEM = ITEMS.register("almond_log",
            () -> new BlockItem(ALMOND_LOG.get(), new Item.Properties()));
    public static final DeferredItem<Item> ALMOND_WOOD_ITEM = ITEMS.register("almond_wood",
            () -> new BlockItem(ALMOND_WOOD.get(), new Item.Properties()));
    public static final DeferredItem<Item> STRIPPED_ALMOND_LOG_ITEM = ITEMS.register("stripped_almond_log",
            () -> new BlockItem(STRIPPED_ALMOND_LOG.get(), new Item.Properties()));
    public static final DeferredItem<Item> STRIPPED_ALMOND_WOOD_ITEM = ITEMS.register("stripped_almond_wood",
            () -> new BlockItem(STRIPPED_ALMOND_WOOD.get(), new Item.Properties()));
    public static final DeferredItem<Item> ALMOND_PLANKS_ITEM = ITEMS.register("almond_planks",
            () -> new BlockItem(ALMOND_PLANKS.get(), new Item.Properties()));
    public static final DeferredItem<Item> ALMOND_LEAVES_ITEM = ITEMS.register("almond_leaves",
            () -> new BlockItem(ALMOND_LEAVES.get(), new Item.Properties()));
    public static final DeferredItem<Item> ALMOND_SAPLING_ITEM = ITEMS.register("almond_sapling",
            () -> new BlockItem(ALMOND_SAPLING.get(), new Item.Properties()));

    // Vanilla Crop
    public static final DeferredBlock<Block> VANILLA_CROP = BLOCKS.register("vanilla_crop",
            () -> new VanillaCropBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT)));

    // Vegan Chocolate
    public static final DeferredBlock<LiquidBlock> VEGAN_CHOCOLATE_BLOCK = BLOCKS.register("vegan_chocolate_block",
            () -> new LiquidBlock(ModFluids.SOURCE_VEGAN_CHOCOLATE_FLUID.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER).noCollission()));
    public static final DeferredBlock<Block> VEGAN_CHOCOLATE_CAKE = BLOCKS.register("vegan_chocolate_cake",
            () -> new VeganChocolateCakeBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE)));
    // Vegan Chocolate Bricks
    public static final DeferredBlock<Block> VEGAN_CHOCOLATE_BRICKS = registerBlock("vegan_chocolate_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    // Vegan Chocolate Stairs
    public static final DeferredBlock<Block> VEGAN_CHOCOLATE_STAIRS = registerBlock("vegan_chocolate_stairs",
            () -> new StairBlock(ModBlocks.VEGAN_CHOCOLATE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_STAIRS)));
    // Vegan Chocolate Slab
    public static final DeferredBlock<Block> VEGAN_CHOCOLATE_SLAB = registerBlock("vegan_chocolate_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_SLAB)));
    // Vegan Chocolate Door
    public static final DeferredBlock<Block> VEGAN_CHOCOLATE_DOOR = registerBlock("vegan_chocolate_door",
            () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion()));
    // Vegan Chocolate Trapdoor
    public static final DeferredBlock<Block> VEGAN_CHOCOLATE_TRAPDOOR = registerBlock("vegan_chocolate_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).noOcclusion()));
    // Vegan Chocolate Wall
    public static final DeferredBlock<Block> VEGAN_CHOCOLATE_WALL = registerBlock("vegan_chocolate_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)));
    // Vegan Chocolate Fence
    public static final DeferredBlock<Block> VEGAN_CHOCOLATE_FENCE = registerBlock("vegan_chocolate_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    // Vegan Chocolate Fence Gate
    public static final DeferredBlock<Block> VEGAN_CHOCOLATE_FENCE_GATE = registerBlock("vegan_chocolate_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    // Apple Sauce
    public static final DeferredBlock<LiquidBlock> APPLE_SAUCE_BLOCK = BLOCKS.register("apple_sauce_block",
            () -> new LiquidBlock(ModFluids.SOURCE_APPLE_SAUCE_FLUID.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER).noCollission()));

    // Almond Milk
    public static final DeferredBlock<LiquidBlock> ALMOND_MILK_BLOCK = BLOCKS.register("almond_milk_block",
            () -> new LiquidBlock(ModFluids.SOURCE_ALMOND_MILK_FLUID.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER).noCollission()));



    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}