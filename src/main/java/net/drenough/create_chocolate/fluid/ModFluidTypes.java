package net.drenough.create_chocolate.fluid;

import net.drenough.create_chocolate.CreateChocolate;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.common.SoundAction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.joml.Vector3f;

public class ModFluidTypes {
    // Texture paths for dark chocolate fluid
    public static final ResourceLocation DARK_CHOCOLATE_STILL_RL = new ResourceLocation(CreateChocolate.MOD_ID, "fluid/dark_chocolate_still");
    public static final ResourceLocation DARK_CHOCOLATE_FLOWING_RL = new ResourceLocation(CreateChocolate.MOD_ID, "fluid/dark_chocolate_flow");
    public static final ResourceLocation DARK_CHOCOLATE_OVERLAY_RL = new ResourceLocation(CreateChocolate.MOD_ID, "fluid/dark_chocolate_overlay");


        // Texture paths for white chocolate fluid
    public static final ResourceLocation WHITE_CHOCOLATE_STILL_RL = new ResourceLocation(CreateChocolate.MOD_ID, "fluid/white_chocolate_still");
    public static final ResourceLocation WHITE_CHOCOLATE_FLOWING_RL = new ResourceLocation(CreateChocolate.MOD_ID, "fluid/white_chocolate_flow");
    public static final ResourceLocation WHITE_CHOCOLATE_OVERLAY_RL = new ResourceLocation(CreateChocolate.MOD_ID, "fluid/white_chocolate_overlay");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, CreateChocolate.MOD_ID);

    // Register dark chocolate fluid type with its own textures
    public static final RegistryObject<FluidType> DARK_CHOCOLATE_FLUID_TYPE = register(
            "dark_chocolate_fluid",
            DARK_CHOCOLATE_STILL_RL,
            DARK_CHOCOLATE_FLOWING_RL,
            DARK_CHOCOLATE_OVERLAY_RL,
            0xFF3B2F2F, // Tint color (dark brown)
            new Vector3f(0.231f, 0.184f, 0.184f), // Fog color
            FluidType.Properties.create()
                    .lightLevel(2)
                    .density(1400)
                    .viscosity(1500)
                    .sound(SoundAction.get("drink"), SoundEvents.HONEY_DRINK)
    );

    // Register white chocolate fluid type with its own textures
   /// public static final RegistryObject<FluidType> WHITE_CHOCOLATE_FLUID_TYPE = register(
          //  "white_chocolate_fluid",
          //  WHITE_CHOCOLATE_STILL_RL,
          //  WHITE_CHOCOLATE_FLOWING_RL,
           // WHITE_CHOCOLATE_OVERLAY_RL,
          //  0xFFF5F5DC, // Tint color (light beige)
          //  new Vector3f(0.961f, 0.929f, 0.804f), // Fog color
          //  FluidType.Properties.create()
           //         .lightLevel(1)
           //         .density(1500)
            //        .viscosity(3000)
            //        .sound(SoundAction.get("drink"), SoundEvents.HONEY_DRINK)
  //  );

    // Helper method to register fluid types with custom textures
    private static RegistryObject<FluidType> register(String name, ResourceLocation stillTexture, ResourceLocation flowingTexture,
                                                      ResourceLocation overlayTexture, int tintColor, Vector3f fogColor, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(stillTexture, flowingTexture, overlayTexture, tintColor, fogColor, properties));
    }

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}