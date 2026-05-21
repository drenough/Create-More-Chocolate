package net.drenough.create_chocolate.worldgen.tree;

import net.drenough.create_chocolate.CreateChocolate;
import net.drenough.create_chocolate.worldgen.ModConfiguredFeatures;
import net.minecraft.world.level.block.grower.TreeGrower;

import java.util.Optional;

public class ModTreeGrowers {
    public static final TreeGrower ALMOND = new TreeGrower(CreateChocolate.MOD_ID + ":almond",
            Optional.empty(), Optional.of(ModConfiguredFeatures.ALMOND_KEY), Optional.empty());
    
}
