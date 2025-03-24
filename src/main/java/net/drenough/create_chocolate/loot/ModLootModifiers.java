package net.drenough.create_chocolate.loot;

import com.mojang.serialization.Codec;
import net.drenough.create_chocolate.CreateChocolate;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModLootModifiers {
    public static final DeferredRegister<Codec<? extends IGlobalLootModifier>> LOOT_MODIFIER_SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, CreateChocolate.MOD_ID);

    public static void register(IEventBus eventBus) {
        LOOT_MODIFIER_SERIALIZERS.register("add_item", () -> AddItemModifier.CODEC);
        LOOT_MODIFIER_SERIALIZERS.register(eventBus);
    }
}