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
            .slopeFindDistance(3).levelDecreasePerBlock(2).block(ModBlocks.DARK_CHOCOLATE_BLOCK).bucket(ModItems.DARK_CHOCOLATE_BUCKET).tickRate(25);

    //White Chocolate Fluid
    public static final RegistryObject<FlowingFluid> SOURCE_WHITE_CHOCOLATE_FLUID = FLUIDS.register("white_chocolate_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.WHITE_CHOCOLATE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_WHITE_CHOCOLATE_FLUID = FLUIDS.register("flowing_white_chocolate",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.WHITE_CHOCOLATE_FLUID_PROPERTIES));

    public static final ForgeFlowingFluid.Properties WHITE_CHOCOLATE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.WHITE_CHOCOLATE_FLUID_TYPE, SOURCE_WHITE_CHOCOLATE_FLUID, FLOWING_WHITE_CHOCOLATE_FLUID)
            .slopeFindDistance(3).levelDecreasePerBlock(2).block(ModBlocks.WHITE_CHOCOLATE_BLOCK).bucket(ModItems.WHITE_CHOCOLATE_BUCKET).tickRate(25);

    //Caramel Fluid
    public static final RegistryObject<FlowingFluid> SOURCE_CARAMEL_FLUID = FLUIDS.register("caramel_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.CARAMEL_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_CARAMEL_FLUID = FLUIDS.register("flowing_caramel",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.CARAMEL_FLUID_PROPERTIES));

    public static final ForgeFlowingFluid.Properties CARAMEL_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.CARAMEL_FLUID_TYPE, SOURCE_CARAMEL_FLUID, FLOWING_CARAMEL_FLUID)
            .slopeFindDistance(3).levelDecreasePerBlock(2).block(ModBlocks.CARAMEL_BLOCK).bucket(ModItems.CARAMEL_BUCKET).tickRate(25);

    //Royal Chocolate Fluid
    public static final RegistryObject<FlowingFluid> SOURCE_ROYAL_CHOCOLATE_FLUID = FLUIDS.register("royal_chocolate_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.ROYAL_CHOCOLATE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_ROYAL_CHOCOLATE_FLUID = FLUIDS.register("flowing_royal_chocolate",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.ROYAL_CHOCOLATE_FLUID_PROPERTIES));

    public static final ForgeFlowingFluid.Properties ROYAL_CHOCOLATE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.ROYAL_CHOCOLATE_FLUID_TYPE, SOURCE_ROYAL_CHOCOLATE_FLUID, FLOWING_ROYAL_CHOCOLATE_FLUID)
            .slopeFindDistance(3).levelDecreasePerBlock(2).block(ModBlocks.ROYAL_CHOCOLATE_BLOCK).bucket(ModItems.ROYAL_CHOCOLATE_BUCKET).tickRate(25);

    // Vegan Chocolate Fluid
    public static final RegistryObject<FlowingFluid> SOURCE_VEGAN_CHOCOLATE_FLUID = FLUIDS.register("vegan_chocolate_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.VEGAN_CHOCOLATE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_VEGAN_CHOCOLATE_FLUID = FLUIDS.register("flowing_vegan_chocolate",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.VEGAN_CHOCOLATE_FLUID_PROPERTIES));

    public static final ForgeFlowingFluid.Properties VEGAN_CHOCOLATE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.VEGAN_CHOCOLATE_FLUID_TYPE, SOURCE_VEGAN_CHOCOLATE_FLUID, FLOWING_VEGAN_CHOCOLATE_FLUID)
            .slopeFindDistance(3).levelDecreasePerBlock(2).block(ModBlocks.VEGAN_CHOCOLATE_BLOCK).bucket(ModItems.VEGAN_CHOCOLATE_BUCKET).tickRate(25);

    //Apple Sauce Fluid
    public static final RegistryObject<FlowingFluid> SOURCE_APPLE_SAUCE_FLUID = FLUIDS.register("apple_sauce_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.APPLE_SAUCE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_APPLE_SAUCE_FLUID = FLUIDS.register("flowing_apple_sauce",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.APPLE_SAUCE_FLUID_PROPERTIES));

    public static final ForgeFlowingFluid.Properties APPLE_SAUCE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.APPLE_SAUCE_FLUID_TYPE, SOURCE_APPLE_SAUCE_FLUID, FLOWING_APPLE_SAUCE_FLUID)
            .slopeFindDistance(3).levelDecreasePerBlock(2).block(ModBlocks.APPLE_SAUCE_BLOCK).bucket(ModItems.APPLE_SAUCE_BUCKET).tickRate(25);

    // Almond Milk Fluid
    public static final RegistryObject<FlowingFluid> SOURCE_ALMOND_MILK_FLUID = FLUIDS.register("almond_milk_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.ALMOND_MILK_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_ALMOND_MILK_FLUID = FLUIDS.register("flowing_almond_milk",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.ALMOND_MILK_FLUID_PROPERTIES));

    public static final ForgeFlowingFluid.Properties ALMOND_MILK_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.ALMOND_MILK_FLUID_TYPE, SOURCE_ALMOND_MILK_FLUID, FLOWING_ALMOND_MILK_FLUID)
            .slopeFindDistance(3).levelDecreasePerBlock(2).block(ModBlocks.ALMOND_MILK_BLOCK).bucket(ModItems.ALMOND_MILK_BUCKET).tickRate(25);

    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
