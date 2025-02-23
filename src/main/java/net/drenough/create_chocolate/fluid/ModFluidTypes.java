package net.drenough.create_chocolate.fluid;

import com.mojang.blaze3d.shaders.FogShape;
import com.mojang.blaze3d.systems.RenderSystem;
import net.drenough.create_chocolate.CreateChocolate;
import net.minecraft.client.Camera;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.FogRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.common.SoundAction;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import org.jetbrains.annotations.NotNull;
import org.joml.Vector3f;


public class ModFluidTypes {
    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, CreateChocolate.MOD_ID);

    // Texture paths for dark chocolate fluid
    public static final ResourceLocation DARK_CHOCOLATE_STILL_RL = ResourceLocation.fromNamespaceAndPath(CreateChocolate.MOD_ID, "fluid/dark_chocolate_still");
    public static final ResourceLocation DARK_CHOCOLATE_FLOWING_RL = ResourceLocation.fromNamespaceAndPath(CreateChocolate.MOD_ID, "fluid/dark_chocolate_flow");
    public static final ResourceLocation DARK_CHOCOLATE_OVERLAY_RL = ResourceLocation.fromNamespaceAndPath(CreateChocolate.MOD_ID, "fluid/dark_chocolate_overlay");

    // Texture paths for white chocolate fluid
    public static final ResourceLocation WHITE_CHOCOLATE_STILL_RL = ResourceLocation.fromNamespaceAndPath(CreateChocolate.MOD_ID, "fluid/white_chocolate_still");
    public static final ResourceLocation WHITE_CHOCOLATE_FLOWING_RL = ResourceLocation.fromNamespaceAndPath(CreateChocolate.MOD_ID, "fluid/white_chocolate_flow");
    public static final ResourceLocation WHITE_CHOCOLATE_OVERLAY_RL = ResourceLocation.fromNamespaceAndPath(CreateChocolate.MOD_ID, "fluid/white_chocolate_overlay");

    // Texture paths for caramel fluid
    public static final ResourceLocation CARAMEL_STILL_RL = ResourceLocation.fromNamespaceAndPath(CreateChocolate.MOD_ID, "fluid/caramel_still");
    public static final ResourceLocation CARAMEL_FLOWING_RL = ResourceLocation.fromNamespaceAndPath(CreateChocolate.MOD_ID, "fluid/caramel_flow");
    public static final ResourceLocation CARAMEL_OVERLAY_RL = ResourceLocation.fromNamespaceAndPath(CreateChocolate.MOD_ID, "fluid/caramel_overlay");

    // Texture paths for royal chocolate
    public static final ResourceLocation ROYAL_CHOCOLATE_STILL_RL = ResourceLocation.fromNamespaceAndPath(CreateChocolate.MOD_ID, "fluid/royal_chocolate_still");
    public static final ResourceLocation ROYAL_CHOCOLATE_FLOWING_RL = ResourceLocation.fromNamespaceAndPath(CreateChocolate.MOD_ID, "fluid/royal_chocolate_flow");
    public static final ResourceLocation ROYAL_CHOCOLATE_OVERLAY_RL = ResourceLocation.fromNamespaceAndPath(CreateChocolate.MOD_ID, "fluid/royal_chocolate_overlay");

    // Register dark chocolate fluid type
    // Register dark chocolate fluid type
    public static final DeferredHolder<FluidType, FluidType> DARK_CHOCOLATE_FLUID_TYPE = FLUID_TYPES.register("dark_chocolate_fluid_type",
            () -> new FluidType(FluidType.Properties.create()
                    .canSwim(true)
                    .canDrown(true)
                    .canHydrate(true)
                    .lightLevel(2)
                    .density(1400)
                    .viscosity(1500)
                    .sound(SoundAction.get("drink"), SoundEvents.HONEY_DRINK)));

    // Register white chocolate fluid type
    public static final DeferredHolder<FluidType, FluidType> WHITE_CHOCOLATE_FLUID_TYPE = FLUID_TYPES.register("white_chocolate_fluid_type",
            () -> new FluidType(FluidType.Properties.create()
                    .canSwim(true)
                    .canDrown(true)
                    .canHydrate(true)
                    .lightLevel(2)
                    .density(1400)
                    .viscosity(1500)
                    .sound(SoundAction.get("drink"), SoundEvents.HONEY_DRINK)));

    // Register caramel fluid type
    public static final DeferredHolder<FluidType, FluidType> CARAMEL_FLUID_TYPE = FLUID_TYPES.register("caramel_fluid_type",
            () -> new FluidType(FluidType.Properties.create()
                    .canSwim(true)
                    .canDrown(true)
                    .canHydrate(true)
                    .lightLevel(1)
                    .density(1600)
                    .viscosity(2000)
                    .sound(SoundAction.get("drink"), SoundEvents.HONEY_DRINK)));

    // Register royal chocolate fluid type
    public static final DeferredHolder<FluidType, FluidType> ROYAL_CHOCOLATE_FLUID_TYPE = FLUID_TYPES.register("royal_chocolate_fluid_type",
            () -> new FluidType(FluidType.Properties.create()
                    .canSwim(true)
                    .canDrown(true)
                    .canHydrate(true)
                    .lightLevel(2)
                    .density(1400)
                    .viscosity(1500)
                    .sound(SoundAction.get("drink"), SoundEvents.HONEY_DRINK)));

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);

        // Register client extensions for fluid types
        eventBus.addListener(ModFluidTypes::registerClientExtensions);
    }

    private static void registerClientExtensions(RegisterClientExtensionsEvent event) {
        // Register client extensions for dark chocolate fluid
        event.registerFluidType(new IClientFluidTypeExtensions() {
                    @Override
                    public @NotNull ResourceLocation getStillTexture() {
                        return DARK_CHOCOLATE_STILL_RL;
                    }

                    @Override
                    public @NotNull ResourceLocation getFlowingTexture() {
                        return DARK_CHOCOLATE_FLOWING_RL;
                    }

                    @Override
                    public ResourceLocation getOverlayTexture() {
                        return DARK_CHOCOLATE_OVERLAY_RL;
                    }

                    @Override
                    public int getTintColor() {
                        return 0xFFFFFFFF; // No tint
                    }

                    @Override
                    public @NotNull Vector3f modifyFogColor(@NotNull Camera camera, float partialTick, @NotNull ClientLevel level, int renderDistance, float darkenWorldAmount, @NotNull Vector3f fluidFogColor) {
                        return new Vector3f(0.231f, 0.184f, 0.184f); // Fog color
                    }

                    @Override
                    public void modifyFogRender(@NotNull Camera camera, FogRenderer.@NotNull FogMode mode, float renderDistance, float partialTick, float nearDistance, float farDistance, @NotNull FogShape shape) {
                        RenderSystem.setShaderFogColor(0.231f, 0.184f, 0.184f); // Fog color
                        RenderSystem.setShaderFogStart(0.2f); // Adjust start distance
                        RenderSystem.setShaderFogEnd(1.5f);   // Adjust end distance
                        RenderSystem.setShaderFogShape(FogShape.CYLINDER); // Set the fog shape
                    }
                }, DARK_CHOCOLATE_FLUID_TYPE.get());

        // Register client extensions for white chocolate fluid
        event.registerFluidType(new IClientFluidTypeExtensions() {
                    @Override
                    public @NotNull ResourceLocation getStillTexture() {
                        return WHITE_CHOCOLATE_STILL_RL;
                    }

                    @Override
                    public @NotNull ResourceLocation getFlowingTexture() {
                        return WHITE_CHOCOLATE_FLOWING_RL;
                    }

                    @Override
                    public ResourceLocation getOverlayTexture() {
                        return WHITE_CHOCOLATE_OVERLAY_RL;
                    }

                    @Override
                    public int getTintColor() {
                        return 0xFFFFF5E6; // Creamy white tint
                    }

                    @Override
                    public @NotNull Vector3f modifyFogColor(@NotNull Camera camera, float partialTick, @NotNull ClientLevel level, int renderDistance, float darkenWorldAmount, @NotNull Vector3f fluidFogColor) {
                        return new Vector3f(1.0f, 0.973f, 0.941f); // Creamy white fog color
                    }

                    @Override
                    public void modifyFogRender(@NotNull Camera camera, FogRenderer.@NotNull FogMode mode, float renderDistance, float partialTick, float nearDistance, float farDistance, @NotNull FogShape shape) {
                        RenderSystem.setShaderFogColor(1.0f, 0.973f, 0.941f); // Creamy white fog color
                        RenderSystem.setShaderFogStart(0.2f); // Adjust start distance
                        RenderSystem.setShaderFogEnd(1.5f);   // Adjust end distance
                        RenderSystem.setShaderFogShape(FogShape.CYLINDER); // Set the fog shape
                    }
                }, WHITE_CHOCOLATE_FLUID_TYPE.get());

        // Register client extensions for caramel fluid
        event.registerFluidType(new IClientFluidTypeExtensions() {
                    @Override
                    public @NotNull ResourceLocation getStillTexture() {
                        return CARAMEL_STILL_RL;
                    }

                    @Override
                    public @NotNull ResourceLocation getFlowingTexture() {
                        return CARAMEL_FLOWING_RL;
                    }

                    @Override
                    public ResourceLocation getOverlayTexture() {
                        return CARAMEL_OVERLAY_RL;
                    }

                    @Override
                    public int getTintColor() {
                        return 0xFFFFFF99; // Light pastel yellow tint for caramel
                    }

                    @Override
                    public @NotNull Vector3f modifyFogColor(@NotNull Camera camera, float partialTick, @NotNull ClientLevel level, int renderDistance, float darkenWorldAmount, @NotNull Vector3f fluidFogColor) {
                        return new Vector3f(1.0f, 0.94f, 0.5f); // Light pastel yellow fog color
                    }

                    @Override
                    public void modifyFogRender(@NotNull Camera camera, FogRenderer.@NotNull FogMode mode, float renderDistance, float partialTick, float nearDistance, float farDistance, @NotNull FogShape shape) {
                        RenderSystem.setShaderFogColor(1.0f, 0.94f, 0.5f); // Light pastel yellow fog color
                        RenderSystem.setShaderFogStart(0.2f); // Adjust start distance
                        RenderSystem.setShaderFogEnd(1.5f);   // Adjust end distance
                        RenderSystem.setShaderFogShape(FogShape.CYLINDER); // Set the fog shape
                    }
                }, CARAMEL_FLUID_TYPE.get());

        // Register client extensions for royal chocolate fluid
        event.registerFluidType(new IClientFluidTypeExtensions() {
                    @Override
                    public @NotNull ResourceLocation getStillTexture() {
                        return ROYAL_CHOCOLATE_STILL_RL;
                    }

                    @Override
                    public @NotNull ResourceLocation getFlowingTexture() {
                        return ROYAL_CHOCOLATE_FLOWING_RL;
                    }

                    @Override
                    public ResourceLocation getOverlayTexture() {
                        return ROYAL_CHOCOLATE_OVERLAY_RL;
                    }

                    @Override
                    public int getTintColor() {
                        return 0xFFFFFFFF; // No tint
                    }

                    @Override
                    public @NotNull Vector3f modifyFogColor(@NotNull Camera camera, float partialTick, @NotNull ClientLevel level, int renderDistance, float darkenWorldAmount, @NotNull Vector3f fluidFogColor) {
                        return new Vector3f(0.29f, 0.0f, 0.51f); // Royal Purple fog color
                    }

                    @Override
                    public void modifyFogRender(@NotNull Camera camera, FogRenderer.@NotNull FogMode mode, float renderDistance, float partialTick, float nearDistance, float farDistance, @NotNull FogShape shape) {
                        RenderSystem.setShaderFogColor(0.29f, 0.0f, 0.51f); // Royal Purple fog color
                        RenderSystem.setShaderFogStart(0.2f); // Adjust start distance
                        RenderSystem.setShaderFogEnd(1.5f);   // Adjust end distance
                        RenderSystem.setShaderFogShape(FogShape.CYLINDER); // Set the fog shape
                    }
                }, ROYAL_CHOCOLATE_FLUID_TYPE.get());
    }
}