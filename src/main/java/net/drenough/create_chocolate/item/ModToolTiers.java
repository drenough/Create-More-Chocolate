package net.drenough.create_chocolate.item;

import net.drenough.create_chocolate.util.ModTags;
import net.minecraft.world.item.ToolMaterial;

public class ModToolTiers {

    public static final ToolMaterial HARD_CHOCOLATE = new ToolMaterial(
            ModTags.Blocks.INCORRECT_FOR_HARD_CHOCOLATE,
            500,
            2.0F,
            1.0F,
            14,
            ModTags.Items.REPAIRS_HARD_CHOCOLATE
    );

    public static final ToolMaterial ROYAL_CHOCOLATE = new ToolMaterial(
            ModTags.Blocks.INCORRECT_FOR_ROYAL_CHOCOLATE,
            1800,
            9.0F,
            3.0F,
            15,
            ModTags.Items.REPAIRS_ROYAL_CHOCOLATE
    );
}