package net.drenough.create_chocolate.worldgen;


import net.drenough.create_chocolate.CreateChocolate;
import net.drenough.create_chocolate.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ModPlacedFeatures {

    public static final ResourceKey<PlacedFeature> ALMOND_PLACED_KEY = registerKey("almond_placed");


    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        // Define the placement modifiers
        List<PlacementModifier> modifiers = List.of(
                RarityFilter.onAverageOnceEvery(5), // Spawn once every 5 chunks
                PlacementUtils.countExtra(1, 0.0f, 0), // Always spawn 1 tree when it does spawn
                InSquarePlacement.spread(), // Spread the placement within the chunk
                SurfaceWaterDepthFilter.forMaxDepth(0), // Only spawn on land (max water depth = 0)
                HeightmapPlacement.onHeightmap(Heightmap.Types.OCEAN_FLOOR), // Spawn on the ocean floor heightmap
                BiomeFilter.biome() // Only spawn in valid biomes
        );
        // Register the placed feature with the almond sapling
        register(context, ALMOND_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ALMOND_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.0f, 0),
                        ModBlocks.ALMOND_SAPLING.get()));
    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(CreateChocolate.MOD_ID, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}