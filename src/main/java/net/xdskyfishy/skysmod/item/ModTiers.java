package net.xdskyfishy.skysmod.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier RUBY = new ForgeTier(2, 1600, 4f,2f, 12, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.RUBY.get()));

    public static final ForgeTier ENDIERIUM = new ForgeTier(3, 9600, 6f,4f, 24, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.ENDIERIUM_INGOT.get()));
}
