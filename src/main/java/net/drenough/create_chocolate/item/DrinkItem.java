package net.drenough.create_chocolate.item;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class DrinkItem extends Item {
    public DrinkItem(Properties properties) {
        super(properties);
    }

    @Override
    public @NotNull UseAnim getUseAnimation(@NotNull ItemStack stack) {
        return UseAnim.DRINK; // This tells Minecraft to use the drinking animation
    }

    @Override
    public @NotNull ItemStack finishUsingItem(@NotNull ItemStack stack, @NotNull Level level, @NotNull LivingEntity entity) {
        // Handle the behavior when the drink is finished
        if (entity instanceof Player player && !player.getAbilities().instabuild) {
            // Return a glass bottle after drinking
            player.getInventory().add(new ItemStack(net.minecraft.world.item.Items.GLASS_BOTTLE));
        }
        return super.finishUsingItem(stack, level, entity);
    }
}
