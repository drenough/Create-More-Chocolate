package net.drenough.create_chocolate.block.almond;

import net.drenough.create_chocolate.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
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
    // Custom block state property to track if leaves contain almonds
    public static final BooleanProperty FULL = BooleanProperty.create("full");

    public AlmondLeavesBlock(BlockBehaviour.Properties properties) {
        super(properties);
        // Default state is empty (no almonds)
        this.registerDefaultState(this.stateDefinition.any().setValue(FULL, false));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.@NotNull Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        // Add our custom FULL property to the block state
        builder.add(FULL);
    }

    @SuppressWarnings("deprecation")
    @Override
    public @NotNull InteractionResult use(@NotNull BlockState state, @NotNull Level level, @NotNull BlockPos pos,
                                          @NotNull Player player, @NotNull InteractionHand hand, @NotNull BlockHitResult hitResult) {
        if (state.getValue(FULL)) {
            // If leaves are full, drop almonds when right-clicked
            popResource(level, pos, new ItemStack(ModItems.ALMOND_ITEM.get()));
            // Set leaves back to empty state
            level.setBlock(pos, state.setValue(FULL, false), 3);
            // Return success on both client and server sides
            return InteractionResult.sidedSuccess(level.isClientSide);
        }
        // If leaves are empty, do nothing
        return InteractionResult.PASS;
    }

    @Override
    public void randomTick(BlockState state, @NotNull ServerLevel level, @NotNull BlockPos pos, @NotNull RandomSource random) {
        // Only process if leaves are empty
        if (!state.getValue(FULL)) {
            // 10% chance per tick to grow almonds
            if (random.nextInt(10) == 0) {
                // Set leaves to full state
                level.setBlock(pos, state.setValue(FULL, true), 3);
            }
        }
    }

    @Override
    public boolean isRandomlyTicking(BlockState state) {
        // Only tick randomly if leaves are empty (no almonds yet)
        return !state.getValue(FULL);
    }
}