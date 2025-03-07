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

public class CaramelCakeBlock extends CakeBlock {
    public CaramelCakeBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    protected @NotNull InteractionResult useWithoutItem(@NotNull BlockState state, @NotNull Level level, @NotNull BlockPos pos, @NotNull Player player, @NotNull BlockHitResult hitResult) {
        InteractionResult result = super.useWithoutItem(state, level, pos, player, hitResult);
        if (result.consumesAction()) {
            player.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 1200, 0));
        }
        return result;
    }
}
