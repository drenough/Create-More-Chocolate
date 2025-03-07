package net.drenough.create_chocolate;

import com.mojang.logging.LogUtils;
import net.drenough.create_chocolate.block.ModBlocks;
import net.drenough.create_chocolate.fluid.ModFluidTypes;
import net.drenough.create_chocolate.fluid.ModFluids;
import net.drenough.create_chocolate.item.ModCreativeModeTabs;
import net.drenough.create_chocolate.item.ModItems;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;

@Mod(CreateChocolate.MOD_ID)
public class CreateChocolate {
    public static final String MOD_ID = "create_chocolate";
    public static final Logger LOGGER = LogUtils.getLogger();

    public CreateChocolate(IEventBus modEventBus, ModContainer modContainer) {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);
        // Register server events
        NeoForge.EVENT_BUS.register(this);

        // Register creative tabs
        ModCreativeModeTabs.register(modEventBus);

        // Register items, blocks, fluids, and fluid types
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModFluids.register(modEventBus);
        ModFluidTypes.register(modEventBus);

        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("Create Chocolate mod is setting up!");
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("Create Chocolate mod is starting on the server!");
    }

    @EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            event.enqueueWork(() -> {
                // Render Layers for Dark Chocolate
                ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_DARK_CHOCOLATE_FLUID.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_DARK_CHOCOLATE_FLUID.get(), RenderType.translucent());

                // Render Layers for White Chocolate
                ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_WHITE_CHOCOLATE_FLUID.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_WHITE_CHOCOLATE_FLUID.get(), RenderType.translucent());

                // Render Layers for Caramel
                ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_CARAMEL_FLUID.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_CARAMEL_FLUID.get(), RenderType.translucent());

                // Render Layers for Royal Chocolate
                ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_ROYAL_CHOCOLATE_FLUID.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_ROYAL_CHOCOLATE_FLUID.get(), RenderType.translucent());
            });
        }
    }
}