package net.drenough.create_chocolate.fluid;

import net.drenough.create_chocolate.CreateChocolate;
import net.drenough.create_chocolate.block.ModBlocks;
import net.drenough.create_chocolate.item.ModItems;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, CreateChocolate.MOD_ID);
    //Dark Chocolate Fluid
    public static final RegistryObject<FlowingFluid> SOURCE_DARK_CHOCOLATE_FLUID = FLUIDS.register("dark_chocolate_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.DARK_CHOCOLATE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_DARK_CHOCOLATE_FLUID = FLUIDS.register("flowing_dark_chocolate",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.DARK_CHOCOLATE_FLUID_PROPERTIES));

    public static final ForgeFlowingFluid.Properties DARK_CHOCOLATE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.DARK_CHOCOLATE_FLUID_TYPE, SOURCE_DARK_CHOCOLATE_FLUID, FLOWING_DARK_CHOCOLATE_FLUID)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.DARK_CHOCOLATE_BLOCK).bucket(ModItems.DARK_CHOCOLATE_BUCKET);

    //White Chocolate Fluid
    public static final RegistryObject<FlowingFluid> SOURCE_WHITE_CHOCOLATE_FLUID = FLUIDS.register("white_chocolate_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.WHITE_CHOCOLATE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_WHITE_CHOCOLATE_FLUID = FLUIDS.register("flowing_white_chocolate",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.WHITE_CHOCOLATE_FLUID_PROPERTIES));

    public static final ForgeFlowingFluid.Properties WHITE_CHOCOLATE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.WHITE_CHOCOLATE_FLUID_TYPE, SOURCE_WHITE_CHOCOLATE_FLUID, FLOWING_WHITE_CHOCOLATE_FLUID)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.WHITE_CHOCOLATE_BLOCK).bucket(ModItems.WHITE_CHOCOLATE_BUCKET);

    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
