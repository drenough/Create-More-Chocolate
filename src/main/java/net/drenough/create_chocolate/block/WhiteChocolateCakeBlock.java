package net.drenough.create_chocolate.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
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

public class WhiteChocolateCakeBlock extends CakeBlock {
    public WhiteChocolateCakeBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    public @NotNull InteractionResult use(@NotNull BlockState state, @NotNull Level level, @NotNull BlockPos pos,
                                          @NotNull Player player, @NotNull InteractionHand hand, @NotNull BlockHitResult hitResult) {
        InteractionResult result = super.use(state, level, pos, player, hand, hitResult);
        if (result.consumesAction()) {
            player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 1200, 0));
        }
        return result;
    }
}
