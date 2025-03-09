package net.drenough.create_chocolate.block.almond;

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

    public AlmondLeavesBlock(BlockBehaviour.Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(FULL, false)); // Default state is empty
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.@NotNull Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(FULL); // Add the FULL property to the block state
    }

    @Override
    protected @NotNull InteractionResult useWithoutItem(@NotNull BlockState state, @NotNull Level level, @NotNull BlockPos pos, @NotNull Player player, @NotNull BlockHitResult hitResult) {
        if (state.getValue(FULL)) {
            // Drop almonds when right-clicked
            popResource(level, pos, new ItemStack(ModItems.ALMOND_ITEM.get()));
            level.setBlock(pos, state.setValue(FULL, false), 3); // Set leaves back to empty
            return InteractionResult.SUCCESS;
        }
        return InteractionResult.PASS;
    }

    @Override
    public void randomTick(BlockState state, @NotNull ServerLevel level, @NotNull BlockPos pos, @NotNull RandomSource random) {
        if (!state.getValue(FULL)) {
            // Transition to full leaves after some time
            if (random.nextInt(10) == 0) { // 10% chance per tick
                level.setBlock(pos, state.setValue(FULL, true), 3);
            }
        }
    }

    @Override
    public boolean isRandomlyTicking(BlockState state) {
        return !state.getValue(FULL); // Only tick if leaves are empty
    }
}
