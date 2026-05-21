package net.drenough.create_chocolate.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.CakeBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class EffectCakeBlock extends CakeBlock {
    private final int nutrition;
    private final float saturation;
    private final List<MobEffectInstance> effects;

    // For single effect
    public EffectCakeBlock(BlockBehaviour.Properties properties, int nutrition, float saturation, MobEffectInstance effect) {
        this(properties, nutrition, saturation, List.of(effect));
    }

    // For multiple effects
    public EffectCakeBlock(BlockBehaviour.Properties properties, int nutrition, float saturation, List<MobEffectInstance> effects) {
        super(properties);
        this.nutrition = nutrition;
        this.saturation = saturation;
        this.effects = effects;
    }

    @Override
    protected @NotNull InteractionResult useWithoutItem(@NotNull BlockState state, @NotNull Level level, @NotNull BlockPos pos, @NotNull Player player, @NotNull BlockHitResult hitResult) {
        if (player.canEat(false)) {
            // Apply nutrition and saturation
            player.getFoodData().eat(nutrition, saturation);

            // Apply effects
            for (MobEffectInstance effect : effects) {
                player.addEffect(new MobEffectInstance(effect.getEffect(), effect.getDuration(), effect.getAmplifier()));
            }

            // Remove one cake slice
            int bites = state.getValue(BITES);
            if (bites < 6) {
                level.setBlock(pos, state.setValue(BITES, bites + 1), 3);
            } else {
                level.removeBlock(pos, false);
            }
            return InteractionResult.SUCCESS;
        }
        return InteractionResult.PASS;
    }
}