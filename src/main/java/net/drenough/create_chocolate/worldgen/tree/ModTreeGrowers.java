package net.drenough.create_chocolate.worldgen.tree;

import net.drenough.create_chocolate.worldgen.ModConfiguredFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import org.jetbrains.annotations.NotNull;

public class ModTreeGrowers {
    public static final AbstractTreeGrower ALMOND = new AbstractTreeGrower() {
        @Override
        protected @NotNull ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(@NotNull RandomSource random, boolean hasFlowers) {
            return ModConfiguredFeatures.ALMOND_KEY;
        }
    };
}