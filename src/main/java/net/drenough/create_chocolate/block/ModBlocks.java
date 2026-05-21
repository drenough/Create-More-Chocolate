package net.drenough.create_chocolate.block;

import net.drenough.create_chocolate.CreateChocolate;
import net.drenough.create_chocolate.block.almond.AlmondLeavesBlock;
import net.drenough.create_chocolate.block.almond.ModFlammableRotatedPillarBlock;
import net.drenough.create_chocolate.fluid.ModFluids;
import net.drenough.create_chocolate.item.ModItems;
import net.drenough.create_chocolate.worldgen.tree.ModTreeGrowers;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.function.Function;


public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(CreateChocolate.MOD_ID);

    // Chocolate Bricks
    public static final DeferredBlock<Block> CHOCOLATE_BRICKS = registerBlock("chocolate_bricks",
            properties -> new Block(properties.strength(1.5F).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    // Chocolate Brick Stairs
    public static final DeferredBlock<Block> CHOCOLATE_BRICK_STAIRS = registerBlock("chocolate_brick_stairs",
            properties -> new StairBlock(ModBlocks.CHOCOLATE_BRICKS.get().defaultBlockState(),
                    properties.strength(1.5F).requiresCorrectToolForDrops().sound(SoundType.STONE).noOcclusion()));
    // Chocolate Brick Slab
    public static final DeferredBlock<Block> CHOCOLATE_BRICK_SLAB = registerBlock("chocolate_brick_slab",
            properties -> new SlabBlock(properties.strength(2.0F).requiresCorrectToolForDrops().sound(SoundType.STONE).noOcclusion()));
    // Chocolate Brick Door
    public static final DeferredBlock<Block> CHOCOLATE_BRICK_DOOR = registerBlock("chocolate_brick_door",
            properties -> new DoorBlock(BlockSetType.STONE, properties.strength(3.0F).requiresCorrectToolForDrops().sound(SoundType.STONE).noOcclusion()));
    // Chocolate Brick Trapdoor
    public static final DeferredBlock<Block> CHOCOLATE_BRICK_TRAPDOOR = registerBlock("chocolate_brick_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.STONE, properties.strength(3.0F).requiresCorrectToolForDrops().sound(SoundType.STONE).noOcclusion()));
    // Chocolate Brick Wall
    public static final DeferredBlock<Block> CHOCOLATE_BRICK_WALL = registerBlock("chocolate_brick_wall",
            properties -> new WallBlock(properties.strength(2.0F).requiresCorrectToolForDrops().sound(SoundType.STONE).noOcclusion()));
    // Chocolate Brick Fence
    public static final DeferredBlock<Block> CHOCOLATE_BRICK_FENCE = registerBlock("chocolate_brick_fence",
            properties -> new FenceBlock(properties.strength(2.0F).requiresCorrectToolForDrops().sound(SoundType.STONE).noOcclusion()));
    // Chocolate Brick FenceGate
    public static final DeferredBlock<Block> CHOCOLATE_BRICK_FENCE_GATE = registerBlock("chocolate_brick_fence_gate",
            properties -> new FenceGateBlock(
                    properties.strength(3.0F).requiresCorrectToolForDrops().sound(SoundType.STONE).noOcclusion(),
                    SoundEvents.FENCE_GATE_OPEN,
                    SoundEvents.FENCE_GATE_CLOSE));
    // Chocolate Cake
    public static final DeferredBlock<Block> CHOCOLATE_CAKE = registerBlockWithoutItem("chocolate_cake",
            properties -> new EffectCakeBlock(properties.strength(0.5F).sound(SoundType.WOOL),
                    8, 0.6f, new MobEffectInstance(MobEffects.REGENERATION, 200, 0)));



    // Dark Chocolate Bricks
    public static final DeferredBlock<Block> DARK_CHOCOLATE_BRICKS = registerBlock("dark_chocolate_bricks",
            properties -> new Block(properties.strength(1.5F).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    // Dark Chocolate Stairs
    public static final DeferredBlock<Block> DARK_CHOCOLATE_STAIRS = registerBlock("dark_chocolate_stairs",
            properties -> new StairBlock(ModBlocks.DARK_CHOCOLATE_BRICKS.get().defaultBlockState(),
                    properties.strength(1.5F).requiresCorrectToolForDrops().sound(SoundType.STONE).noOcclusion()));
    // Dark Chocolate Slab
    public static final DeferredBlock<Block> DARK_CHOCOLATE_SLAB = registerBlock("dark_chocolate_slab",
            properties -> new SlabBlock(properties.strength(2.0F).requiresCorrectToolForDrops().sound(SoundType.STONE).noOcclusion()));
    // Dark Chocolate Door
    public static final DeferredBlock<Block> DARK_CHOCOLATE_DOOR = registerBlock("dark_chocolate_door",
            properties -> new DoorBlock(BlockSetType.STONE, properties.strength(3.0F).requiresCorrectToolForDrops().sound(SoundType.STONE).noOcclusion()));
    // Dark Chocolate Trapdoor
    public static final DeferredBlock<Block> DARK_CHOCOLATE_TRAPDOOR = registerBlock("dark_chocolate_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.STONE, properties.strength(3.0F).requiresCorrectToolForDrops().sound(SoundType.STONE).noOcclusion()));
    // Dark Chocolate Wall
    public static final DeferredBlock<Block> DARK_CHOCOLATE_WALL = registerBlock("dark_chocolate_wall",
            properties -> new WallBlock(properties.strength(2.0F).requiresCorrectToolForDrops().sound(SoundType.STONE).noOcclusion()));
    // Dark Chocolate Fence
    public static final DeferredBlock<Block> DARK_CHOCOLATE_FENCE = registerBlock("dark_chocolate_fence",
            properties -> new FenceBlock(properties.strength(2.0F).requiresCorrectToolForDrops().sound(SoundType.STONE).noOcclusion()));
    // Dark Chocolate FenceGate
    public static final DeferredBlock<Block> DARK_CHOCOLATE_FENCE_GATE = registerBlock("dark_chocolate_fence_gate",
            properties -> new FenceGateBlock(
                    properties.strength(3.0F).requiresCorrectToolForDrops().sound(SoundType.STONE).noOcclusion(),
                    SoundEvents.FENCE_GATE_OPEN,
                    SoundEvents.FENCE_GATE_CLOSE));
    // Dark Chocolate Block
    public static final DeferredBlock<LiquidBlock> DARK_CHOCOLATE_BLOCK = registerBlockWithoutItem("dark_chocolate_block",
            props -> new LiquidBlock(ModFluids.SOURCE_DARK_CHOCOLATE_FLUID.get(),
                    props.liquid().replaceable().noCollision()));
    // Dark Chocolate Cake
    public static final DeferredBlock<Block> DARK_CHOCOLATE_CAKE = registerBlockWithoutItem("dark_chocolate_cake",
            properties -> new EffectCakeBlock(properties.strength(0.5F).sound(SoundType.WOOL),
                    8, 0.7f, new MobEffectInstance(MobEffects.ABSORPTION, 1200, 0)));


    // White Chocolate Bricks
    public static final DeferredBlock<Block> WHITE_CHOCOLATE_BRICKS = registerBlock("white_chocolate_bricks",
            properties -> new Block(properties.strength(1.5F).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    // White Chocolate Stairs
    public static final DeferredBlock<Block> WHITE_CHOCOLATE_STAIRS = registerBlock("white_chocolate_stairs",
            properties -> new StairBlock(ModBlocks.WHITE_CHOCOLATE_BRICKS.get().defaultBlockState(),
                    properties.strength(1.5F).requiresCorrectToolForDrops().sound(SoundType.STONE).noOcclusion()));
    // White Chocolate Slab
    public static final DeferredBlock<Block> WHITE_CHOCOLATE_SLAB = registerBlock("white_chocolate_slab",
            properties -> new SlabBlock(properties.strength(2.0F).requiresCorrectToolForDrops().sound(SoundType.STONE).noOcclusion()));
    // White Chocolate Door
    public static final DeferredBlock<Block> WHITE_CHOCOLATE_DOOR = registerBlock("white_chocolate_door",
            properties -> new DoorBlock(BlockSetType.STONE, properties.strength(3.0F).requiresCorrectToolForDrops().sound(SoundType.STONE).noOcclusion()));
    // White Chocolate Trapdoor
    public static final DeferredBlock<Block> WHITE_CHOCOLATE_TRAPDOOR = registerBlock("white_chocolate_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.STONE, properties.strength(3.0F).requiresCorrectToolForDrops().sound(SoundType.STONE).noOcclusion()));
    // White Chocolate Wall
    public static final DeferredBlock<Block> WHITE_CHOCOLATE_WALL = registerBlock("white_chocolate_wall",
            properties -> new WallBlock(properties.strength(2.0F).requiresCorrectToolForDrops().sound(SoundType.STONE).noOcclusion()));
    // White Chocolate Fence
    public static final DeferredBlock<Block> WHITE_CHOCOLATE_FENCE = registerBlock("white_chocolate_fence",
            properties -> new FenceBlock(properties.strength(2.0F).requiresCorrectToolForDrops().sound(SoundType.STONE).noOcclusion()));
    // White Chocolate FenceGate
    public static final DeferredBlock<Block> WHITE_CHOCOLATE_FENCE_GATE = registerBlock("white_chocolate_fence_gate",
            properties -> new FenceGateBlock(
                    properties.strength(3.0F).requiresCorrectToolForDrops().sound(SoundType.STONE).noOcclusion(),
                    SoundEvents.FENCE_GATE_OPEN,
                    SoundEvents.FENCE_GATE_CLOSE));
    // White Chocolate Block
    public static final DeferredBlock<LiquidBlock> WHITE_CHOCOLATE_BLOCK = registerBlockWithoutItem("white_chocolate_block",
            props -> new LiquidBlock(ModFluids.SOURCE_WHITE_CHOCOLATE_FLUID.get(), props.liquid().replaceable().noCollision()));
    // White Chocolate Cake
    public static final DeferredBlock<Block> WHITE_CHOCOLATE_CAKE = registerBlockWithoutItem("white_chocolate_cake",
            properties -> new EffectCakeBlock(properties.strength(0.5F).sound(SoundType.WOOL),
                    8, 0.6f, new MobEffectInstance(MobEffects.NIGHT_VISION, 1200, 0)));


    // Caramel Bricks
    public static final DeferredBlock<Block> CARAMEL_BRICKS = registerBlock("caramel_bricks",
            properties -> new Block(properties.strength(1.5F).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    // Caramel Stairs
    public static final DeferredBlock<Block> CARAMEL_STAIRS = registerBlock("caramel_stairs",
            properties -> new StairBlock(ModBlocks.CARAMEL_BRICKS.get().defaultBlockState(),
                    properties.strength(1.5F).requiresCorrectToolForDrops().sound(SoundType.STONE).noOcclusion()));
    // Caramel Slab
    public static final DeferredBlock<Block> CARAMEL_SLAB = registerBlock("caramel_slab",
            properties -> new SlabBlock(properties.strength(2.0F).requiresCorrectToolForDrops().sound(SoundType.STONE).noOcclusion()));
    // Caramel Door
    public static final DeferredBlock<Block> CARAMEL_DOOR = registerBlock("caramel_door",
            properties -> new DoorBlock(BlockSetType.STONE, properties.strength(3.0F).requiresCorrectToolForDrops().sound(SoundType.STONE).noOcclusion()));
    // Caramel Trapdoor
    public static final DeferredBlock<Block> CARAMEL_TRAPDOOR = registerBlock("caramel_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.STONE, properties.strength(3.0F).requiresCorrectToolForDrops().sound(SoundType.STONE).noOcclusion()));
    // Caramel Wall
    public static final DeferredBlock<Block> CARAMEL_WALL = registerBlock("caramel_wall",
            properties -> new WallBlock(properties.strength(2.0F).requiresCorrectToolForDrops().sound(SoundType.STONE).noOcclusion()));
    // Caramel Fence
    public static final DeferredBlock<Block> CARAMEL_FENCE = registerBlock("caramel_fence",
            properties -> new FenceBlock(properties.strength(2.0F).requiresCorrectToolForDrops().sound(SoundType.STONE).noOcclusion()));
    // Caramel FenceGate
    public static final DeferredBlock<Block> CARAMEL_FENCE_GATE = registerBlock("caramel_fence_gate",
            properties -> new FenceGateBlock(
                    properties.strength(3.0F).requiresCorrectToolForDrops().sound(SoundType.STONE).noOcclusion(),
                    SoundEvents.FENCE_GATE_OPEN,
                    SoundEvents.FENCE_GATE_CLOSE));
    // Caramel Block
    public static final DeferredBlock<LiquidBlock> CARAMEL_BLOCK = registerBlockWithoutItem("caramel_block",
            props -> new LiquidBlock(ModFluids.SOURCE_CARAMEL_FLUID.get(), props.liquid().replaceable().noCollision()));
    // Caramel Cake
    public static final DeferredBlock<Block> CARAMEL_CAKE = registerBlockWithoutItem("caramel_cake",
            properties -> new EffectCakeBlock(properties.strength(0.5F).sound(SoundType.WOOL),
                    8, 0.7f, new MobEffectInstance(MobEffects.HEALTH_BOOST, 1200, 0)));

    // Cardboard Boxes of Chocolate types
    public static final DeferredBlock<Block> CARDBOARD_BOX_OF_CHOCOLATE = registerBlock("cardboard_box_of_chocolate",
            properties -> new Block(properties.strength(0.8f).requiresCorrectToolForDrops().sound(SoundType.WOOL)));
    public static final DeferredBlock<Block> CARDBOARD_BOX_OF_DARK_CHOCOLATE = registerBlock("cardboard_box_of_dark_chocolate",
            properties -> new Block(properties.strength(0.8f).requiresCorrectToolForDrops().sound(SoundType.WOOL)));
    public static final DeferredBlock<Block> CARDBOARD_BOX_OF_WHITE_CHOCOLATE = registerBlock("cardboard_box_of_white_chocolate",
            properties -> new Block(properties.strength(0.8f).requiresCorrectToolForDrops().sound(SoundType.WOOL)));
    public static final DeferredBlock<Block> CARDBOARD_BOX_OF_CARAMEL = registerBlock("cardboard_box_of_caramel",
            properties -> new Block(properties.strength(0.8f).requiresCorrectToolForDrops().sound(SoundType.WOOL)));
    public static final DeferredBlock<Block> CARDBOARD_BOX_OF_ROYAL_CHOCOLATE = registerBlock("cardboard_box_of_royal_chocolate",
            properties -> new Block(properties.strength(0.8f).requiresCorrectToolForDrops().sound(SoundType.WOOL)));
    public static final DeferredBlock<Block> CARDBOARD_BOX_OF_VEGAN_CHOCOLATE = registerBlock("cardboard_box_of_vegan_chocolate",
            properties -> new Block(properties.strength(0.8f).requiresCorrectToolForDrops().sound(SoundType.WOOL)));

    // Pallets with Chocolate Boxes
    public static final DeferredBlock<Block> PALLET_OF_CHOCOLATE = registerBlock("pallet_of_chocolate",
            properties -> new Block(properties
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> PALLET_OF_DARK_CHOCOLATE = registerBlock("pallet_of_dark_chocolate",
            properties -> new Block(properties
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> PALLET_OF_WHITE_CHOCOLATE = registerBlock("pallet_of_white_chocolate",
            properties -> new Block(properties
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> PALLET_OF_CARAMEL = registerBlock("pallet_of_caramel",
            properties -> new Block(properties
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> PALLET_OF_ROYAL_CHOCOLATE = registerBlock("pallet_of_royal_chocolate",
            properties -> new Block(properties
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> PALLET_OF_VEGAN_CHOCOLATE = registerBlock("pallet_of_vegan_chocolate",
            properties -> new Block(properties
                    .strength(2.0f, 3.0f)
                    .sound(SoundType.WOOD)
                    .requiresCorrectToolForDrops()));

    // Royal Chocolate Fluid Block
    public static final DeferredBlock<LiquidBlock> ROYAL_CHOCOLATE_BLOCK = registerBlockWithoutItem("royal_chocolate_block",
            props -> new LiquidBlock(ModFluids.SOURCE_ROYAL_CHOCOLATE_FLUID.get(), props.liquid().replaceable().noCollision()));
    // Royal Chocolate Bricks
    public static final DeferredBlock<Block> ROYAL_CHOCOLATE_BRICKS = registerBlock("royal_chocolate_bricks",
            properties -> new Block(properties.strength(1.5F).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    // Royal Chocolate Stairs
    public static final DeferredBlock<Block> ROYAL_CHOCOLATE_STAIRS = registerBlock("royal_chocolate_stairs",
            properties -> new StairBlock(ModBlocks.ROYAL_CHOCOLATE_BRICKS.get().defaultBlockState(),
                    properties.strength(1.5F).requiresCorrectToolForDrops().sound(SoundType.STONE).noOcclusion()));
    // Royal Chocolate Slab
    public static final DeferredBlock<Block> ROYAL_CHOCOLATE_SLAB = registerBlock("royal_chocolate_slab",
            properties -> new SlabBlock(properties.strength(2.0F).requiresCorrectToolForDrops().sound(SoundType.STONE).noOcclusion()));
    // Royal Chocolate Door
    public static final DeferredBlock<Block> ROYAL_CHOCOLATE_DOOR = registerBlock("royal_chocolate_door",
            properties -> new DoorBlock(BlockSetType.STONE, properties.strength(3.0F).requiresCorrectToolForDrops().sound(SoundType.STONE).noOcclusion()));
    // Royal Chocolate Trapdoor
    public static final DeferredBlock<Block> ROYAL_CHOCOLATE_TRAPDOOR = registerBlock("royal_chocolate_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.STONE, properties.strength(3.0F).requiresCorrectToolForDrops().sound(SoundType.STONE).noOcclusion()));
    // Royal Chocolate Wall
    public static final DeferredBlock<Block> ROYAL_CHOCOLATE_WALL = registerBlock("royal_chocolate_wall",
            properties -> new WallBlock(properties.strength(2.0F).requiresCorrectToolForDrops().sound(SoundType.STONE).noOcclusion()));
    // Royal Chocolate Fence
    public static final DeferredBlock<Block> ROYAL_CHOCOLATE_FENCE = registerBlock("royal_chocolate_fence",
            properties -> new FenceBlock(properties.strength(2.0F).requiresCorrectToolForDrops().sound(SoundType.STONE).noOcclusion()));
    // Royal Chocolate Fence Gate
    public static final DeferredBlock<Block> ROYAL_CHOCOLATE_FENCE_GATE = registerBlock("royal_chocolate_fence_gate",
            properties -> new FenceGateBlock(
                    properties.strength(3.0F).requiresCorrectToolForDrops().sound(SoundType.STONE).noOcclusion(),
                    SoundEvents.FENCE_GATE_OPEN,
                    SoundEvents.FENCE_GATE_CLOSE));
    // Royal Chocolate Food
    public static final DeferredBlock<Block> ROYAL_CHOCOLATE_CAKE = registerBlockWithoutItem("royal_chocolate_cake",
            properties -> new EffectCakeBlock(properties.strength(0.5F).sound(SoundType.WOOL),
                    16, 1.6f, List.of(
                    new MobEffectInstance(MobEffects.ABSORPTION, 1200, 1),
                    new MobEffectInstance(MobEffects.SPEED, 1200, 1)
            )));

    // Almond Tree
    public static final DeferredBlock<Block> ALMOND_LOG = registerBlock("almond_log",
            props -> new ModFlammableRotatedPillarBlock(props.strength(2.0F).sound(SoundType.WOOD).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> ALMOND_WOOD = registerBlock("almond_wood",
            props -> new ModFlammableRotatedPillarBlock(props.strength(2.0F).sound(SoundType.WOOD).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> STRIPPED_ALMOND_LOG = registerBlock("stripped_almond_log",
            props -> new ModFlammableRotatedPillarBlock(props.strength(2.0F).sound(SoundType.WOOD).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> STRIPPED_ALMOND_WOOD = registerBlock("stripped_almond_wood",
            props -> new ModFlammableRotatedPillarBlock(props.strength(2.0F).sound(SoundType.WOOD).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> ALMOND_PLANKS = registerBlock("almond_planks",
            props -> new Block(props.strength(2.0F).sound(SoundType.WOOD)) {
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
    public static final DeferredBlock<Block> ALMOND_LEAVES = registerBlock("almond_leaves",
            props -> new AlmondLeavesBlock(0.05f, props.strength(0.2F).sound(SoundType.GRASS).noOcclusion()) {
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
    public static final DeferredBlock<Block> ALMOND_SAPLING = registerBlock("almond_sapling",
            props -> new SaplingBlock(ModTreeGrowers.ALMOND,
                    props.strength(0.0F).sound(SoundType.GRASS).noOcclusion()));

    // Vanilla Crop
    public static final DeferredBlock<Block> VANILLA_CROP = registerBlockWithoutItem("vanilla_crop",
            props -> new VanillaCropBlock(props
                    .randomTicks()      // Enable random ticks for growth
                    .noCollision()      // Can walk through (not noOcclusion!)
                    .instabreak()       // Breaks instantly
                    .sound(SoundType.CROP)));

    // Vegan Chocolate
    public static final DeferredBlock<LiquidBlock> VEGAN_CHOCOLATE_BLOCK = registerBlockWithoutItem("vegan_chocolate_block",
            props -> new LiquidBlock(ModFluids.SOURCE_VEGAN_CHOCOLATE_FLUID.get(),
                    props.liquid().replaceable().noCollision()));
    // Vegan Chocolate Cake - Glowing
    public static final DeferredBlock<Block> VEGAN_CHOCOLATE_CAKE = registerBlockWithoutItem("vegan_chocolate_cake",
            properties -> new EffectCakeBlock(properties.strength(0.5F).sound(SoundType.WOOL),
                    8, 1.2f, new MobEffectInstance(MobEffects.GLOWING, 1200, 0)));
    // Vegan Chocolate Bricks
    public static final DeferredBlock<Block> VEGAN_CHOCOLATE_BRICKS = registerBlock("vegan_chocolate_bricks",
            properties -> new Block(properties.strength(1.5F).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    // Vegan Chocolate Stairs
    public static final DeferredBlock<Block> VEGAN_CHOCOLATE_STAIRS = registerBlock("vegan_chocolate_stairs",
            properties -> new StairBlock(ModBlocks.VEGAN_CHOCOLATE_BRICKS.get().defaultBlockState(),
                    properties.strength(1.5F).requiresCorrectToolForDrops().sound(SoundType.STONE).noOcclusion()));
    // Vegan Chocolate Slab
    public static final DeferredBlock<Block> VEGAN_CHOCOLATE_SLAB = registerBlock("vegan_chocolate_slab",
            properties -> new SlabBlock(properties.strength(2.0F).requiresCorrectToolForDrops().sound(SoundType.STONE).noOcclusion()));
    // Vegan Chocolate Door
    public static final DeferredBlock<Block> VEGAN_CHOCOLATE_DOOR = registerBlock("vegan_chocolate_door",
            properties -> new DoorBlock(BlockSetType.STONE, properties.strength(3.0F).requiresCorrectToolForDrops().sound(SoundType.STONE).noOcclusion()));
    // Vegan Chocolate Trapdoor
    public static final DeferredBlock<Block> VEGAN_CHOCOLATE_TRAPDOOR = registerBlock("vegan_chocolate_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.STONE, properties.strength(3.0F).requiresCorrectToolForDrops().sound(SoundType.STONE).noOcclusion()));
    // Vegan Chocolate Wall
    public static final DeferredBlock<Block> VEGAN_CHOCOLATE_WALL = registerBlock("vegan_chocolate_wall",
            properties -> new WallBlock(properties.strength(2.0F).requiresCorrectToolForDrops().sound(SoundType.STONE).noOcclusion()));
    // Vegan Chocolate Fence
    public static final DeferredBlock<Block> VEGAN_CHOCOLATE_FENCE = registerBlock("vegan_chocolate_fence",
            properties -> new FenceBlock(properties.strength(2.0F).requiresCorrectToolForDrops().sound(SoundType.STONE).noOcclusion()));
    // Vegan Chocolate Fence Gate
    public static final DeferredBlock<Block> VEGAN_CHOCOLATE_FENCE_GATE = registerBlock("vegan_chocolate_fence_gate",
            properties -> new FenceGateBlock(
                    properties.strength(3.0F).requiresCorrectToolForDrops().sound(SoundType.STONE).noOcclusion(),
                    SoundEvents.FENCE_GATE_OPEN,
                    SoundEvents.FENCE_GATE_CLOSE));

    // Apple Sauce
    public static final DeferredBlock<LiquidBlock> APPLE_SAUCE_BLOCK = registerBlockWithoutItem("apple_sauce_block",
            props -> new LiquidBlock(ModFluids.SOURCE_APPLE_SAUCE_FLUID.get(),
                    props.liquid().replaceable().noCollision()));

    // Almond Milk
    public static final DeferredBlock<LiquidBlock> ALMOND_MILK_BLOCK = registerBlockWithoutItem("almond_milk_block",
            props -> new LiquidBlock(ModFluids.SOURCE_ALMOND_MILK_FLUID.get(),
                    props.liquid().replaceable().noCollision()));



    // Helper methods
    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Function<BlockBehaviour.Properties, T> function) {
        DeferredBlock<T> toReturn = BLOCKS.registerBlock(name, function);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.registerItem(name, properties -> new BlockItem(block.get(), properties.useBlockDescriptionPrefix()));
    }
    // Helper for blocks without auto BlockItem
    private static <T extends Block> DeferredBlock<T> registerBlockWithoutItem(String name, Function<BlockBehaviour.Properties, T> function) {
        return BLOCKS.registerBlock(name, function);
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}