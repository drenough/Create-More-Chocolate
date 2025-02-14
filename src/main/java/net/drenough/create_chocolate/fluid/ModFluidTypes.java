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
                            return 0xFF3B2F2F; // Dark brown tint
                        }

                        @Override
                        public Vector3f modifyFogColor(Camera camera, float partialTick, ClientLevel level, int renderDistance, float darkenWorldAmount, Vector3f fluidFogColor) {
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
                        public Vector3f modifyFogColor(Camera camera, float partialTick, ClientLevel level, int renderDistance, float darkenWorldAmount, Vector3f fluidFogColor) {
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

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}