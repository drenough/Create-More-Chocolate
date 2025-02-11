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
    public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("block/water_flow");
    public static final ResourceLocation WATER_OVERLAY_RL = new ResourceLocation(CreateChocolate.MOD_ID, "misc/dark_chocolate_fluid");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, CreateChocolate.MOD_ID);

    public static final RegistryObject<FluidType> DARK_CHOCOLATE_FLUID_TYPE = register("dark_chocolate_fluid",
            FluidType.Properties.create().lightLevel(2).density(1400).viscosity(1500).sound(SoundAction.get("drink"),
                    SoundEvents.HONEY_DRINK));




    private static RegistryObject<FluidType> register(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, WATER_OVERLAY_RL,
                0xFF3B2F2F, new Vector3f(0.231f, 0.184f, 0.184f), properties));
    }

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}