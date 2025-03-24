package net.drenough.create_chocolate.fluid;

import com.mojang.blaze3d.shaders.FogShape;
import com.mojang.blaze3d.systems.RenderSystem;
import net.drenough.create_chocolate.CreateChocolate;
import net.minecraft.client.Camera;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.FogRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.client.extensions.common.IClientFluidTypeExtensions;
import net.minecraftforge.common.SoundAction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;
import org.joml.Vector3f;

import java.util.function.Consumer;

public class ModFluidTypes {
    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, CreateChocolate.MOD_ID);

    // Texture paths for dark chocolate fluid
    public static final ResourceLocation DARK_CHOCOLATE_STILL_RL = new ResourceLocation(CreateChocolate.MOD_ID, "fluid/dark_chocolate_still");
    public static final ResourceLocation DARK_CHOCOLATE_FLOWING_RL = new ResourceLocation(CreateChocolate.MOD_ID, "fluid/dark_chocolate_flow");
    public static final ResourceLocation DARK_CHOCOLATE_OVERLAY_RL = new ResourceLocation(CreateChocolate.MOD_ID, "fluid/dark_chocolate_overlay");

    // Texture paths for white chocolate fluid
    public static final ResourceLocation WHITE_CHOCOLATE_STILL_RL = new ResourceLocation(CreateChocolate.MOD_ID, "fluid/white_chocolate_still");
    public static final ResourceLocation WHITE_CHOCOLATE_FLOWING_RL = new ResourceLocation(CreateChocolate.MOD_ID, "fluid/white_chocolate_flow");
    public static final ResourceLocation WHITE_CHOCOLATE_OVERLAY_RL = new ResourceLocation(CreateChocolate.MOD_ID, "fluid/white_chocolate_overlay");

    // Texture paths for caramel fluid
    public static final ResourceLocation CARAMEL_STILL_RL = new ResourceLocation(CreateChocolate.MOD_ID, "fluid/caramel_still");
    public static final ResourceLocation CARAMEL_FLOWING_RL = new ResourceLocation(CreateChocolate.MOD_ID, "fluid/caramel_flow");
    public static final ResourceLocation CARAMEL_OVERLAY_RL = new ResourceLocation(CreateChocolate.MOD_ID, "fluid/caramel_overlay");

    // Texture paths for royal chocolate
    public static final ResourceLocation ROYAL_CHOCOLATE_STILL_RL = new ResourceLocation(CreateChocolate.MOD_ID, "fluid/royal_chocolate_still");
    public static final ResourceLocation ROYAL_CHOCOLATE_FLOWING_RL = new ResourceLocation(CreateChocolate.MOD_ID, "fluid/royal_chocolate_flow");
    public static final ResourceLocation ROYAL_CHOCOLATE_OVERLAY_RL = new ResourceLocation(CreateChocolate.MOD_ID, "fluid/royal_chocolate_overlay");

    // Texture paths for vegan chocolate
    public static final ResourceLocation VEGAN_CHOCOLATE_STILL_RL = new ResourceLocation(CreateChocolate.MOD_ID, "fluid/vegan_chocolate_still");
    public static final ResourceLocation VEGAN_CHOCOLATE_FLOWING_RL = new ResourceLocation(CreateChocolate.MOD_ID, "fluid/vegan_chocolate_flow");
    public static final ResourceLocation VEGAN_CHOCOLATE_OVERLAY_RL = new ResourceLocation(CreateChocolate.MOD_ID, "fluid/vegan_chocolate_overlay");

    // Texture paths for apple sauce
    public static final ResourceLocation APPLE_SAUCE_STILL_RL = new ResourceLocation(CreateChocolate.MOD_ID, "fluid/apple_sauce_still");
    public static final ResourceLocation APPLE_SAUCE_FLOWING_RL = new ResourceLocation(CreateChocolate.MOD_ID, "fluid/apple_sauce_flow");
    public static final ResourceLocation APPLE_SAUCE_OVERLAY_RL = new ResourceLocation(CreateChocolate.MOD_ID, "fluid/apple_sauce_overlay");

    // Texture paths for almond milk
    public static final ResourceLocation ALMOND_MILK_STILL_RL = new ResourceLocation(CreateChocolate.MOD_ID, "fluid/almond_milk_still");
    public static final ResourceLocation ALMOND_MILK_FLOWING_RL = new ResourceLocation(CreateChocolate.MOD_ID, "fluid/almond_milk_flow");
    public static final ResourceLocation ALMOND_MILK_OVERLAY_RL = new ResourceLocation(CreateChocolate.MOD_ID, "fluid/almond_milk_overlay");

    // Register vegan chocolate fluid type
    public static final RegistryObject<FluidType> VEGAN_CHOCOLATE_FLUID_TYPE = FLUID_TYPES.register("vegan_chocolate_fluid_type",
            () -> new FluidType(FluidType.Properties.create()
                    .canSwim(true)
                    .canDrown(true)
                    .canHydrate(true)
                    .lightLevel(2)
                    .density(1400)
                    .viscosity(1500)
                    .sound(SoundAction.get("drink"), SoundEvents.HONEY_DRINK)) {
                @Override
                public void initializeClient(Consumer<IClientFluidTypeExtensions> consumer) {
                    consumer.accept(new IClientFluidTypeExtensions() {
                        @Override
                        public ResourceLocation getStillTexture() {
                            return VEGAN_CHOCOLATE_STILL_RL;
                        }

                        @Override
                        public ResourceLocation getFlowingTexture() {
                            return VEGAN_CHOCOLATE_FLOWING_RL;
                        }

                        @Override
                        public ResourceLocation getOverlayTexture() {
                            return VEGAN_CHOCOLATE_OVERLAY_RL;
                        }

                        @Override
                        public int getTintColor() {
                            return 0xFFFFFFFF; // No tint
                        }

                        @Override
                        public @NotNull Vector3f modifyFogColor(Camera camera, float partialTick, ClientLevel level, int renderDistance, float darkenWorldAmount, Vector3f fluidFogColor) {
                            return new Vector3f(0.18f, 0.09f, 0.05f); // Fog color
                        }

                        @Override
                        public void modifyFogRender(Camera camera, FogRenderer.FogMode mode, float renderDistance, float partialTick, float nearDistance, float farDistance, FogShape shape) {
                            RenderSystem.setShaderFogColor(0.18f, 0.09f, 0.05f); // Fog color
                            RenderSystem.setShaderFogStart(0.2f); // Adjust start distance
                            RenderSystem.setShaderFogEnd(1.5f);   // Adjust end distance
                            RenderSystem.setShaderFogShape(FogShape.CYLINDER); // Set the fog shape
                        }
                    });
                }
            });
    // Register apple sauce fluid type
    public static final RegistryObject<FluidType> APPLE_SAUCE_FLUID_TYPE = FLUID_TYPES.register("apple_sauce_fluid_type",
            () -> new FluidType(FluidType.Properties.create()
                    .canSwim(true)
                    .canDrown(true)
                    .canHydrate(true)
                    .lightLevel(2)
                    .density(1400)
                    .viscosity(1500)
                    .sound(SoundAction.get("drink"), SoundEvents.HONEY_DRINK)) {
                @Override
                public void initializeClient(Consumer<IClientFluidTypeExtensions> consumer) {
                    consumer.accept(new IClientFluidTypeExtensions() {
                        @Override
                        public ResourceLocation getStillTexture() {
                            return APPLE_SAUCE_STILL_RL;
                        }

                        @Override
                        public ResourceLocation getFlowingTexture() {
                            return APPLE_SAUCE_FLOWING_RL;
                        }

                        @Override
                        public ResourceLocation getOverlayTexture() {
                            return APPLE_SAUCE_OVERLAY_RL;
                        }

                        @Override
                        public int getTintColor() {
                            return 0xFFFFFFFF; // No tint
                        }

                        @Override
                        public @NotNull Vector3f modifyFogColor(Camera camera, float partialTick, ClientLevel level, int renderDistance, float darkenWorldAmount, Vector3f fluidFogColor) {
                            return new Vector3f(0.8f, 0.4f, 0.2f); // Fog color
                        }

                        @Override
                        public void modifyFogRender(Camera camera, FogRenderer.FogMode mode, float renderDistance, float partialTick, float nearDistance, float farDistance, FogShape shape) {
                            RenderSystem.setShaderFogColor(0.8f, 0.4f, 0.2f); // Fog color
                            RenderSystem.setShaderFogStart(0.2f); // Adjust start distance
                            RenderSystem.setShaderFogEnd(1.5f);   // Adjust end distance
                            RenderSystem.setShaderFogShape(FogShape.CYLINDER); // Set the fog shape
                        }
                    });
                }
            });
    // Register almond milk fluid type
    public static final RegistryObject<FluidType> ALMOND_MILK_FLUID_TYPE = FLUID_TYPES.register("almond_milk_fluid_type",
            () -> new FluidType(FluidType.Properties.create()
                    .canSwim(true)
                    .canDrown(true)
                    .canHydrate(true)
                    .lightLevel(2)
                    .density(1400)
                    .viscosity(1500)
                    .sound(SoundAction.get("drink"), SoundEvents.HONEY_DRINK)) {
                @Override
                public void initializeClient(Consumer<IClientFluidTypeExtensions> consumer) {
                    consumer.accept(new IClientFluidTypeExtensions() {
                        @Override
                        public ResourceLocation getStillTexture() {
                            return ALMOND_MILK_STILL_RL;
                        }

                        @Override
                        public ResourceLocation getFlowingTexture() {
                            return ALMOND_MILK_FLOWING_RL;
                        }

                        @Override
                        public ResourceLocation getOverlayTexture() {
                            return ALMOND_MILK_OVERLAY_RL;
                        }

                        @Override
                        public int getTintColor() {
                            return 0xFFFFFFFF; // No tint
                        }

                        @Override
                        public @NotNull Vector3f modifyFogColor(Camera camera, float partialTick, ClientLevel level, int renderDistance, float darkenWorldAmount, Vector3f fluidFogColor) {
                            return new Vector3f(0.95f, 0.9f, 0.8f); // Fog color
                        }

                        @Override
                        public void modifyFogRender(Camera camera, FogRenderer.FogMode mode, float renderDistance, float partialTick, float nearDistance, float farDistance, FogShape shape) {
                            RenderSystem.setShaderFogColor(0.95f, 0.9f, 0.8f); // Fog color
                            RenderSystem.setShaderFogStart(0.2f); // Adjust start distance
                            RenderSystem.setShaderFogEnd(1.5f);   // Adjust end distance
                            RenderSystem.setShaderFogShape(FogShape.CYLINDER); // Set the fog shape
                        }
                    });
                }
            });
    // Register dark chocolate fluid type
    public static final RegistryObject<FluidType> DARK_CHOCOLATE_FLUID_TYPE = FLUID_TYPES.register("dark_chocolate_fluid_type",
            () -> new FluidType(FluidType.Properties.create()
                    .canSwim(true)
                    .canDrown(true)
                    .canHydrate(true)
                    .lightLevel(2)
                    .density(1400)
                    .viscosity(1500)
                    .sound(SoundAction.get("drink"), SoundEvents.HONEY_DRINK)) {
                @Override
                public void initializeClient(Consumer<IClientFluidTypeExtensions> consumer) {
                    consumer.accept(new IClientFluidTypeExtensions() {
                        @Override
                        public ResourceLocation getStillTexture() {
                            return DARK_CHOCOLATE_STILL_RL;
                        }

                        @Override
                        public ResourceLocation getFlowingTexture() {
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
                        public @NotNull Vector3f modifyFogColor(Camera camera, float partialTick, ClientLevel level, int renderDistance, float darkenWorldAmount, Vector3f fluidFogColor) {
                            return new Vector3f(0.231f, 0.184f, 0.184f); // Fog color
                        }

                        @Override
                        public void modifyFogRender(Camera camera, FogRenderer.FogMode mode, float renderDistance, float partialTick, float nearDistance, float farDistance, FogShape shape) {
                            RenderSystem.setShaderFogColor(0.231f, 0.184f, 0.184f); // Fog color
                            RenderSystem.setShaderFogStart(0.2f); // Adjust start distance
                            RenderSystem.setShaderFogEnd(1.5f);   // Adjust end distance
                            RenderSystem.setShaderFogShape(FogShape.CYLINDER); // Set the fog shape
                        }
                    });
                }
            });
    // Register White Chocolate fluid type
    public static final RegistryObject<FluidType> WHITE_CHOCOLATE_FLUID_TYPE = FLUID_TYPES.register("white_chocolate_fluid_type",
            () -> new FluidType(FluidType.Properties.create()
                    .canSwim(true)
                    .canDrown(true)
                    .canHydrate(true)
                    .lightLevel(2)
                    .density(1400)
                    .viscosity(1500)
                    .sound(SoundAction.get("drink"), SoundEvents.HONEY_DRINK)) {
                @Override
                public void initializeClient(Consumer<IClientFluidTypeExtensions> consumer) {
                    consumer.accept(new IClientFluidTypeExtensions() {
                        @Override
                        public ResourceLocation getStillTexture() {
                            return WHITE_CHOCOLATE_STILL_RL;
                        }

                        @Override
                        public ResourceLocation getFlowingTexture() {
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
                        public @NotNull Vector3f modifyFogColor(Camera camera, float partialTick, ClientLevel level, int renderDistance, float darkenWorldAmount, Vector3f fluidFogColor) {
                            return new Vector3f(1.0f, 0.973f, 0.941f); // Creamy white fog color
                        }

                        @Override
                        public void modifyFogRender(Camera camera, FogRenderer.FogMode mode, float renderDistance, float partialTick, float nearDistance, float farDistance, FogShape shape) {
                            RenderSystem.setShaderFogColor(1.0f, 0.973f, 0.941f); // Creamy white fog color
                            RenderSystem.setShaderFogStart(0.2f); // Adjust start distance
                            RenderSystem.setShaderFogEnd(1.5f);   // Adjust end distance
                            RenderSystem.setShaderFogShape(FogShape.CYLINDER); // Set the fog shape
                        }
                    });
                }
    });
    // Register Caramel fluid type
    public static final RegistryObject<FluidType> CARAMEL_FLUID_TYPE = FLUID_TYPES.register("caramel_fluid_type",
            () -> new FluidType(FluidType.Properties.create()
                    .canSwim(true)
                    .canDrown(true)
                    .canHydrate(true)
                    .lightLevel(1) // Slightly less light than white chocolate
                    .density(1600) // Caramel is denser than white chocolate
                    .viscosity(2000) // Caramel is more viscous
                    .sound(SoundAction.get("drink"), SoundEvents.HONEY_DRINK)) {
                @Override
                public void initializeClient(Consumer<IClientFluidTypeExtensions> consumer) {
                    consumer.accept(new IClientFluidTypeExtensions() {
                        @Override
                        public ResourceLocation getStillTexture() {
                            return CARAMEL_STILL_RL;
                        }

                        @Override
                        public ResourceLocation getFlowingTexture() {
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
                        public @NotNull Vector3f modifyFogColor(Camera camera, float partialTick, ClientLevel level, int renderDistance, float darkenWorldAmount, Vector3f fluidFogColor) {
                            return new Vector3f(1.0f, 0.94f, 0.5f); // Light pastel yellow fog color
                        }

                        @Override
                        public void modifyFogRender(Camera camera, FogRenderer.FogMode mode, float renderDistance, float partialTick, float nearDistance, float farDistance, FogShape shape) {
                            RenderSystem.setShaderFogColor(1.0f, 0.94f, 0.5f); // Light pastel yellow fog color
                            RenderSystem.setShaderFogStart(0.2f); // Adjust start distance
                            RenderSystem.setShaderFogEnd(1.5f);   // Adjust end distance
                            RenderSystem.setShaderFogShape(FogShape.CYLINDER); // Set the fog shape
                        }
                    });
                }
            });
    // Register Royal Chocolate fluid type
    public static final RegistryObject<FluidType> ROYAL_CHOCOLATE_FLUID_TYPE = FLUID_TYPES.register("royal_chocolate_fluid_type",
            () -> new FluidType(FluidType.Properties.create()
                    .canSwim(true)
                    .canDrown(true)
                    .canHydrate(true)
                    .lightLevel(2) // Adjust light level if needed
                    .density(1400) // Adjust density if needed
                    .viscosity(1500) // Adjust viscosity if needed
                    .sound(SoundAction.get("drink"), SoundEvents.HONEY_DRINK)) {
                @Override
                public void initializeClient(Consumer<IClientFluidTypeExtensions> consumer) {
                    consumer.accept(new IClientFluidTypeExtensions() {
                        @Override
                        public ResourceLocation getStillTexture() {
                            return ROYAL_CHOCOLATE_STILL_RL;
                        }

                        @Override
                        public ResourceLocation getFlowingTexture() {
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
                        public @NotNull Vector3f modifyFogColor(Camera camera, float partialTick, ClientLevel level, int renderDistance, float darkenWorldAmount, Vector3f fluidFogColor) {
                            return new Vector3f(0.29f, 0.0f, 0.51f); // Royal Purple fog color
                        }

                        @Override
                        public void modifyFogRender(Camera camera, FogRenderer.FogMode mode, float renderDistance, float partialTick, float nearDistance, float farDistance, FogShape shape) {
                            RenderSystem.setShaderFogColor(0.29f, 0.0f, 0.51f); // Royal Purple fog color
                            RenderSystem.setShaderFogStart(0.2f); // Adjust start distance
                            RenderSystem.setShaderFogEnd(1.5f);   // Adjust end distance
                            RenderSystem.setShaderFogShape(FogShape.CYLINDER); // Set the fog shape
                        }
                    });
                }
            });

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}