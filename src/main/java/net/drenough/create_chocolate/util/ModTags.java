package net.drenough.create_chocolate.util;

import net.drenough.create_chocolate.CreateChocolate;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

public class ModTags {
    public static class Blocks {
        public static final TagKey<@NotNull Block> INCORRECT_FOR_HARD_CHOCOLATE =
                TagKey.create(Registries.BLOCK,
                        Identifier.fromNamespaceAndPath(CreateChocolate.MOD_ID, "incorrect_for_hard_chocolate"));

        public static final TagKey<@NotNull Block> INCORRECT_FOR_ROYAL_CHOCOLATE =
                TagKey.create(Registries.BLOCK,
                        Identifier.fromNamespaceAndPath(CreateChocolate.MOD_ID, "incorrect_for_royal_chocolate"));
    }


    public static class Items {
        public static final TagKey<@NotNull Item> REPAIRS_HARD_CHOCOLATE =
                TagKey.create(Registries.ITEM,
                        Identifier.fromNamespaceAndPath(CreateChocolate.MOD_ID, "repairs_hard_chocolate"));

        public static final TagKey<@NotNull Item> REPAIRS_ROYAL_CHOCOLATE =
                TagKey.create(Registries.ITEM,
                        Identifier.fromNamespaceAndPath(CreateChocolate.MOD_ID, "repairs_royal_chocolate"));
    }
}
