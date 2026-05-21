package net.drenough.create_chocolate.block.almond;

import com.mojang.serialization.MapCodec;
import net.drenough.create_chocolate.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.NotNull;

public class AlmondLeavesBlock extends LeavesBlock {
    public static final BooleanProperty FULL = BooleanProperty.create("full");

    public static final MapCodec<AlmondLeavesBlock> CODEC = simpleCodec(
            props -> new AlmondLeavesBlock(0.05f, props)
    );

    public AlmondLeavesBlock(float leafParticleChance, BlockBehaviour.Properties properties) {
        super(leafParticleChance, properties);
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(FULL, false)
                .setValue(DISTANCE, 7)
                .setValue(PERSISTENT, false)
                .setValue(WATERLOGGED, false));
    }

    @Override
    public @NotNull MapCodec<? extends LeavesBlock> codec() {
        return CODEC;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.@NotNull Builder<@NotNull Block, @NotNull BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(FULL);
    }

    @Override
    protected @NotNull InteractionResult useWithoutItem(@NotNull BlockState state, @NotNull Level level, @NotNull BlockPos pos, @NotNull Player player, @NotNull BlockHitResult hitResult) {
        if (state.getValue(FULL)) {
            popResource(level, pos, new ItemStack(ModItems.ALMOND_ITEM.get()));
            level.setBlock(pos, state.setValue(FULL, false), 3);
            return InteractionResult.SUCCESS;
        }
        return InteractionResult.PASS;
    }

    @Override
    public boolean isRandomlyTicking(BlockState state) {
        return !state.getValue(FULL);
    }

    @Override
    protected void randomTick(@NotNull BlockState state, @NotNull ServerLevel level, @NotNull BlockPos pos, @NotNull RandomSource random) {
        if (!state.getValue(FULL)) {
            // 10% chance per tick (~6-8 minutes average growth time)
            // Change nextInt(10) to a lower number to increase growth speed:
            // - nextInt(5) = 20% chance (~3-4 minutes)
            // - nextInt(2) = 50% chance (~1-1.5 minutes)
            // - nextInt(1) = 100% chance (~40-50 seconds)
            if (random.nextInt(10) == 0) { // 10% chance per tick
                level.setBlock(pos, state.setValue(FULL, true), 3);
            }
        }
    }

    @Override
    protected void spawnFallingLeavesParticle(@NotNull Level level, @NotNull BlockPos pos, @NotNull RandomSource random) {
        // No particles - empty method
    }
}