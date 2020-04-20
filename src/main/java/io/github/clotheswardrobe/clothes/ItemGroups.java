package io.github.clotheswardrobe.clothes;

import io.github.clotheswardrobe.ClothesWardrobe;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import static io.github.clotheswardrobe.clothes.ClothesRegister.*;

public class ItemGroups {
    public static ItemGroup CW = FabricItemGroupBuilder.create(
            new Identifier(ClothesWardrobe.MODID, "cw"))
            .icon(() -> new ItemStack(GREEN_HAT))
            .appendItems(stacks ->
            {
                stacks.add(new ItemStack(GREEN_HAT));
                stacks.add(new ItemStack(GREEN_SHIRT));
                stacks.add(new ItemStack(GREEN_PANTS));
                stacks.add(new ItemStack(GREEN_SHOES));

            })
            .build();
}
