package net.drenough.create_chocolate;

import com.mojang.logging.LogUtils;
import net.drenough.create_chocolate.block.ModBlocks;
import net.drenough.create_chocolate.fluid.ModFluidTypes;
import net.drenough.create_chocolate.fluid.ModFluids;
import net.drenough.create_chocolate.item.ModCreativeModTabs;
import net.drenough.create_chocolate.item.ModItems;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(CreateChocolate.MOD_ID)
public class CreateChocolate {
    public static final String MOD_ID = "create_chocolate";
    public static final Logger LOGGER = LogUtils.getLogger();

    public CreateChocolate() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register items, blocks, fluids, and fluid types
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModFluids.register(modEventBus);
        ModFluidTypes.register(modEventBus);

        // Register creative tabs
        ModCreativeModTabs.register(modEventBus);

        // Register common setup method
        modEventBus.addListener(this::commonSetup);

        // Register server events
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("Create Chocolate mod is setting up!");
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("Create Chocolate mod is starting on the server!");
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
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
        }
    }
}
