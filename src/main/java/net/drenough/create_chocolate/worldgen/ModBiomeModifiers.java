package net.drenough.create_chocolate.worldgen;

import net.drenough.create_chocolate.CreateChocolate;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class ModBiomeModifiers {

    public static final ResourceKey<BiomeModifier> ADD_TREE_ALMOND = registerKey("add_tree_almond");


    public static void bootstrap(BootstrapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);






    context.register(ADD_TREE_ALMOND, new BiomeModifiers.AddFeaturesBiomeModifier(
            HolderSet.direct(biomes.getOrThrow(Biomes.PLAINS), biomes.getOrThrow(Biomes.BIRCH_FOREST)),
            HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.ALMOND_PLACED_KEY)),
    GenerationStep.Decoration.VEGETAL_DECORATION));

}

private static ResourceKey<BiomeModifier> registerKey(String name) {
    return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(CreateChocolate.MOD_ID, name));
}
}