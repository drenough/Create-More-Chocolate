package net.drenough.create_chocolate.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.CakeBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.NotNull;

public class RoyalChocolateCakeBlock extends CakeBlock {
    public RoyalChocolateCakeBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    protected @NotNull InteractionResult useWithoutItem(@NotNull BlockState state, @NotNull Level level, @NotNull BlockPos pos, @NotNull Player player, @NotNull BlockHitResult hitResult) {
        InteractionResult result = super.useWithoutItem(state, level, pos, player, hitResult);
        if (result.consumesAction()) {
            player.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 1200, 1));
            player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 1));
        }
        return result;
    }
}