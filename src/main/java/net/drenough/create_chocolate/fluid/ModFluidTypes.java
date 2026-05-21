package net.drenough.create_chocolate.fluid;

import net.drenough.create_chocolate.CreateChocolate;
import net.minecraft.client.Camera;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.block.FluidModel;
import net.minecraft.client.renderer.fog.FogData;
import net.minecraft.client.renderer.fog.environment.FogEnvironment;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvents;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.client.event.RegisterFluidModelsEvent;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.common.SoundAction;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import org.jetbrains.annotations.NotNull;
import org.joml.Vector4f;


public class ModFluidTypes {
    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, CreateChocolate.MOD_ID);

    // Texture paths for dark chocolate fluid
    public static final Identifier DARK_CHOCOLATE_STILL_RL = Identifier.fromNamespaceAndPath(CreateChocolate.MOD_ID, "block/dark_chocolate_still");
    public static final Identifier DARK_CHOCOLATE_FLOWING_RL = Identifier.fromNamespaceAndPath(CreateChocolate.MOD_ID, "block/dark_chocolate_flow");
    public static final Identifier DARK_CHOCOLATE_OVERLAY_RL = Identifier.fromNamespaceAndPath(CreateChocolate.MOD_ID, "block/dark_chocolate_overlay");

    // Texture paths for white chocolate fluid
    public static final Identifier WHITE_CHOCOLATE_STILL_RL = Identifier.fromNamespaceAndPath(CreateChocolate.MOD_ID, "block/white_chocolate_still");
    public static final Identifier WHITE_CHOCOLATE_FLOWING_RL = Identifier.fromNamespaceAndPath(CreateChocolate.MOD_ID, "block/white_chocolate_flow");
    public static final Identifier WHITE_CHOCOLATE_OVERLAY_RL = Identifier.fromNamespaceAndPath(CreateChocolate.MOD_ID, "block/white_chocolate_overlay");

    // Texture paths for caramel fluid
    public static final Identifier CARAMEL_STILL_RL = Identifier.fromNamespaceAndPath(CreateChocolate.MOD_ID, "block/caramel_still");
    public static final Identifier CARAMEL_FLOWING_RL = Identifier.fromNamespaceAndPath(CreateChocolate.MOD_ID, "block/caramel_flow");
    public static final Identifier CARAMEL_OVERLAY_RL = Identifier.fromNamespaceAndPath(CreateChocolate.MOD_ID, "block/caramel_overlay");

    // Texture paths for royal chocolate
    public static final Identifier ROYAL_CHOCOLATE_STILL_RL = Identifier.fromNamespaceAndPath(CreateChocolate.MOD_ID, "block/royal_chocolate_still");
    public static final Identifier ROYAL_CHOCOLATE_FLOWING_RL = Identifier.fromNamespaceAndPath(CreateChocolate.MOD_ID, "block/royal_chocolate_flow");
    public static final Identifier ROYAL_CHOCOLATE_OVERLAY_RL = Identifier.fromNamespaceAndPath(CreateChocolate.MOD_ID, "block/royal_chocolate_overlay");

    // Texture paths for vegan chocolate fluid
    public static final Identifier VEGAN_CHOCOLATE_STILL_RL = Identifier.fromNamespaceAndPath(CreateChocolate.MOD_ID, "block/vegan_chocolate_still");
    public static final Identifier VEGAN_CHOCOLATE_FLOWING_RL = Identifier.fromNamespaceAndPath(CreateChocolate.MOD_ID, "block/vegan_chocolate_flow");
    public static final Identifier VEGAN_CHOCOLATE_OVERLAY_RL = Identifier.fromNamespaceAndPath(CreateChocolate.MOD_ID, "block/vegan_chocolate_overlay");

    // Texture paths for apple sauce fluid
    public static final Identifier APPLE_SAUCE_STILL_RL = Identifier.fromNamespaceAndPath(CreateChocolate.MOD_ID, "block/apple_sauce_still");
    public static final Identifier APPLE_SAUCE_FLOWING_RL = Identifier.fromNamespaceAndPath(CreateChocolate.MOD_ID, "block/apple_sauce_flow");
    public static final Identifier APPLE_SAUCE_OVERLAY_RL = Identifier.fromNamespaceAndPath(CreateChocolate.MOD_ID, "block/apple_sauce_overlay");

    // Texture paths for almond milk fluid
    public static final Identifier ALMOND_MILK_STILL_RL = Identifier.fromNamespaceAndPath(CreateChocolate.MOD_ID, "block/almond_milk_still");
    public static final Identifier ALMOND_MILK_FLOWING_RL = Identifier.fromNamespaceAndPath(CreateChocolate.MOD_ID, "block/almond_milk_flow");
    public static final Identifier ALMOND_MILK_OVERLAY_RL = Identifier.fromNamespaceAndPath(CreateChocolate.MOD_ID, "block/almond_milk_overlay");

    // Register almond milk fluid type
    public static final DeferredHolder<FluidType, FluidType> ALMOND_MILK_FLUID_TYPE = FLUID_TYPES.register("almond_milk_fluid_type",
            () -> new FluidType(FluidType.Properties.create()
                    .canSwim(true)
                    .canDrown(true)
                    .canHydrate(true)
                    .lightLevel(0)
                    .density(1050)
                    .viscosity(1100)
                    .sound(SoundAction.get("drink"), SoundEvents.HONEY_DRINK.value())));

    // Register apple sauce fluid type
    public static final DeferredHolder<FluidType, FluidType> APPLE_SAUCE_FLUID_TYPE = FLUID_TYPES.register("apple_sauce_fluid_type",
            () -> new FluidType(FluidType.Properties.create()
                    .canSwim(true)
                    .canDrown(true)
                    .canHydrate(true)
                    .lightLevel(0)
                    .density(1300)
                    .viscosity(1400)
                    .sound(SoundAction.get("drink"), SoundEvents.HONEY_DRINK.value())));

    // Register vegan chocolate fluid type
    public static final DeferredHolder<FluidType, FluidType> VEGAN_CHOCOLATE_FLUID_TYPE = FLUID_TYPES.register("vegan_chocolate_fluid_type",
            () -> new FluidType(FluidType.Properties.create()
                    .canSwim(true)
                    .canDrown(true)
                    .canHydrate(true)
                    .lightLevel(2)
                    .density(1400)
                    .viscosity(1500)
                    .sound(SoundAction.get("drink"), SoundEvents.HONEY_DRINK.value())));

    // Register dark chocolate fluid type
    public static final DeferredHolder<FluidType, FluidType> DARK_CHOCOLATE_FLUID_TYPE = FLUID_TYPES.register("dark_chocolate_fluid_type",
            () -> new FluidType(FluidType.Properties.create()
                    .canSwim(true)
                    .canDrown(true)
                    .canHydrate(true)
                    .lightLevel(2)
                    .density(1400)
                    .viscosity(1500)
                    .sound(SoundAction.get("drink"), SoundEvents.HONEY_DRINK.value())));

    // Register white chocolate fluid type
    public static final DeferredHolder<FluidType, FluidType> WHITE_CHOCOLATE_FLUID_TYPE = FLUID_TYPES.register("white_chocolate_fluid_type",
            () -> new FluidType(FluidType.Properties.create()
                    .canSwim(true)
                    .canDrown(true)
                    .canHydrate(true)
                    .lightLevel(2)
                    .density(1400)
                    .viscosity(1500)
                    .sound(SoundAction.get("drink"), SoundEvents.HONEY_DRINK.value())));

    // Register caramel fluid type
    public static final DeferredHolder<FluidType, FluidType> CARAMEL_FLUID_TYPE = FLUID_TYPES.register("caramel_fluid_type",
            () -> new FluidType(FluidType.Properties.create()
                    .canSwim(true)
                    .canDrown(true)
                    .canHydrate(true)
                    .lightLevel(1)
                    .density(1600)
                    .viscosity(2000)
                    .sound(SoundAction.get("drink"), SoundEvents.HONEY_DRINK.value())));

    // Register royal chocolate fluid type
    public static final DeferredHolder<FluidType, FluidType> ROYAL_CHOCOLATE_FLUID_TYPE = FLUID_TYPES.register("royal_chocolate_fluid_type",
            () -> new FluidType(FluidType.Properties.create()
                    .canSwim(true)
                    .canDrown(true)
                    .canHydrate(true)
                    .lightLevel(2)
                    .density(1400)
                    .viscosity(1500)
                    .sound(SoundAction.get("drink"), SoundEvents.HONEY_DRINK.value())));

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);

        // Register client extensions for fluid types
        eventBus.addListener(ModFluidTypes::registerClientExtensions);

        // Register fluid models for textures
        eventBus.addListener(ModFluidTypes::registerFluidModels);
    }

    private static void registerFluidModels(RegisterFluidModelsEvent event) {
        // Dark Chocolate
        event.register(
                new FluidModel.Unbaked(
                        new Material(DARK_CHOCOLATE_STILL_RL),
                        new Material(DARK_CHOCOLATE_FLOWING_RL),
                        new Material(DARK_CHOCOLATE_OVERLAY_RL),
                        null
                ),
                ModFluids.SOURCE_DARK_CHOCOLATE_FLUID,
                ModFluids.FLOWING_DARK_CHOCOLATE_FLUID
        );

        // White Chocolate
        event.register(
                new FluidModel.Unbaked(
                        new Material(WHITE_CHOCOLATE_STILL_RL),
                        new Material(WHITE_CHOCOLATE_FLOWING_RL),
                        new Material(WHITE_CHOCOLATE_OVERLAY_RL),
                        null
                ),
                ModFluids.SOURCE_WHITE_CHOCOLATE_FLUID,
                ModFluids.FLOWING_WHITE_CHOCOLATE_FLUID
        );

        // Caramel
        event.register(
                new FluidModel.Unbaked(
                        new Material(CARAMEL_STILL_RL),
                        new Material(CARAMEL_FLOWING_RL),
                        new Material(CARAMEL_OVERLAY_RL),
                        null
                ),
                ModFluids.SOURCE_CARAMEL_FLUID,
                ModFluids.FLOWING_CARAMEL_FLUID
        );

        // Royal Chocolate
        event.register(
                new FluidModel.Unbaked(
                        new Material(ROYAL_CHOCOLATE_STILL_RL),
                        new Material(ROYAL_CHOCOLATE_FLOWING_RL),
                        new Material(ROYAL_CHOCOLATE_OVERLAY_RL),
                        null
                ),
                ModFluids.SOURCE_ROYAL_CHOCOLATE_FLUID,
                ModFluids.FLOWING_ROYAL_CHOCOLATE_FLUID
        );

        // Vegan Chocolate
        event.register(
                new FluidModel.Unbaked(
                        new Material(VEGAN_CHOCOLATE_STILL_RL),
                        new Material(VEGAN_CHOCOLATE_FLOWING_RL),
                        new Material(VEGAN_CHOCOLATE_OVERLAY_RL),
                        null
                ),
                ModFluids.SOURCE_VEGAN_CHOCOLATE_FLUID,
                ModFluids.FLOWING_VEGAN_CHOCOLATE_FLUID
        );

        // Apple Sauce
        event.register(
                new FluidModel.Unbaked(
                        new Material(APPLE_SAUCE_STILL_RL),
                        new Material(APPLE_SAUCE_FLOWING_RL),
                        new Material(APPLE_SAUCE_OVERLAY_RL),
                        null
                ),
                ModFluids.SOURCE_APPLE_SAUCE_FLUID,
                ModFluids.FLOWING_APPLE_SAUCE_FLUID
        );

        // Almond Milk
        event.register(
                new FluidModel.Unbaked(
                        new Material(ALMOND_MILK_STILL_RL),
                        new Material(ALMOND_MILK_FLOWING_RL),
                        new Material(ALMOND_MILK_OVERLAY_RL),
                        null
                ),
                ModFluids.SOURCE_ALMOND_MILK_FLUID,
                ModFluids.FLOWING_ALMOND_MILK_FLUID
        );
    }

    private static void registerClientExtensions(RegisterClientExtensionsEvent event) {
        // Dark Chocolate
        event.registerFluidType(new IClientFluidTypeExtensions() {
            @Override
            public void modifyFogColor(@NotNull Camera camera, float partialTick, @NotNull ClientLevel level, int renderDistance, float darkenWorldAmount, @NotNull Vector4f fluidFogColor) {
                fluidFogColor.set(0.231f, 0.184f, 0.184f, 1.0f);
            }

            @Override
            public void modifyFogRender(@NotNull Camera camera, FogEnvironment environment, float renderDistance, float partialTick, @NotNull FogData fogData) {
                fogData.environmentalStart = 0.2f;
                fogData.renderDistanceStart = 0.2f;
                fogData.environmentalEnd = 1.5f;
                fogData.renderDistanceEnd = 1.5f;
            }
        }, DARK_CHOCOLATE_FLUID_TYPE.get());

        // White Chocolate
        event.registerFluidType(new IClientFluidTypeExtensions() {
            @Override
            public void modifyFogColor(@NotNull Camera camera, float partialTick, @NotNull ClientLevel level, int renderDistance, float darkenWorldAmount, @NotNull Vector4f fluidFogColor) {
                fluidFogColor.set(1.0f, 0.973f, 0.941f, 1.0f);
            }

            @Override
            public void modifyFogRender(@NotNull Camera camera, FogEnvironment environment, float renderDistance, float partialTick, @NotNull FogData fogData) {
                fogData.environmentalStart = 0.2f;
                fogData.renderDistanceStart = 0.2f;
                fogData.environmentalEnd = 1.5f;
                fogData.renderDistanceEnd = 1.5f;
            }
        }, WHITE_CHOCOLATE_FLUID_TYPE.get());

        // Caramel
        event.registerFluidType(new IClientFluidTypeExtensions() {
            @Override
            public void modifyFogColor(@NotNull Camera camera, float partialTick, @NotNull ClientLevel level, int renderDistance, float darkenWorldAmount, @NotNull Vector4f fluidFogColor) {
                fluidFogColor.set(1.0f, 0.94f, 0.5f, 1.0f);
            }

            @Override
            public void modifyFogRender(@NotNull Camera camera, FogEnvironment environment, float renderDistance, float partialTick, @NotNull FogData fogData) {
                fogData.environmentalStart = 0.2f;
                fogData.renderDistanceStart = 0.2f;
                fogData.environmentalEnd = 1.5f;
                fogData.renderDistanceEnd = 1.5f;
            }
        }, CARAMEL_FLUID_TYPE.get());

        // Royal Chocolate
        event.registerFluidType(new IClientFluidTypeExtensions() {
            @Override
            public void modifyFogColor(@NotNull Camera camera, float partialTick, @NotNull ClientLevel level, int renderDistance, float darkenWorldAmount, @NotNull Vector4f fluidFogColor) {
                fluidFogColor.set(0.29f, 0.0f, 0.51f, 1.0f);
            }

            @Override
            public void modifyFogRender(@NotNull Camera camera, FogEnvironment environment, float renderDistance, float partialTick, @NotNull FogData fogData) {
                fogData.environmentalStart = 0.2f;
                fogData.renderDistanceStart = 0.2f;
                fogData.environmentalEnd = 1.5f;
                fogData.renderDistanceEnd = 1.5f;
            }
        }, ROYAL_CHOCOLATE_FLUID_TYPE.get());

        // Vegan Chocolate
        event.registerFluidType(new IClientFluidTypeExtensions() {
            @Override
            public void modifyFogColor(@NotNull Camera camera, float partialTick, @NotNull ClientLevel level, int renderDistance, float darkenWorldAmount, @NotNull Vector4f fluidFogColor) {
                fluidFogColor.set(0.18f, 0.09f, 0.05f, 1.0f);
            }

            @Override
            public void modifyFogRender(@NotNull Camera camera, FogEnvironment environment, float renderDistance, float partialTick, @NotNull FogData fogData) {
                fogData.environmentalStart = 0.2f;
                fogData.renderDistanceStart = 0.2f;
                fogData.environmentalEnd = 1.5f;
                fogData.renderDistanceEnd = 1.5f;
            }
        }, VEGAN_CHOCOLATE_FLUID_TYPE.get());

        // Apple Sauce
        event.registerFluidType(new IClientFluidTypeExtensions() {
            @Override
            public void modifyFogColor(@NotNull Camera camera, float partialTick, @NotNull ClientLevel level, int renderDistance, float darkenWorldAmount, @NotNull Vector4f fluidFogColor) {
                fluidFogColor.set(0.8f, 0.4f, 0.2f, 1.0f);
            }

            @Override
            public void modifyFogRender(@NotNull Camera camera, FogEnvironment environment, float renderDistance, float partialTick, @NotNull FogData fogData) {
                fogData.environmentalStart = 0.2f;
                fogData.renderDistanceStart = 0.2f;
                fogData.environmentalEnd = 1.5f;
                fogData.renderDistanceEnd = 1.5f;
            }
        }, APPLE_SAUCE_FLUID_TYPE.get());

        // Almond Milk
        event.registerFluidType(new IClientFluidTypeExtensions() {
            @Override
            public void modifyFogColor(@NotNull Camera camera, float partialTick, @NotNull ClientLevel level, int renderDistance, float darkenWorldAmount, @NotNull Vector4f fluidFogColor) {
                fluidFogColor.set(0.95f, 0.9f, 0.8f, 1.0f);
            }

            @Override
            public void modifyFogRender(@NotNull Camera camera, FogEnvironment environment, float renderDistance, float partialTick, @NotNull FogData fogData) {
                fogData.environmentalStart = 0.2f;
                fogData.renderDistanceStart = 0.2f;
                fogData.environmentalEnd = 1.5f;
                fogData.renderDistanceEnd = 1.5f;
            }
        }, ALMOND_MILK_FLUID_TYPE.get());
    }
}