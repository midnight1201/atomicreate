package com.himataku.atomicreate.recipe.Providers;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

import static com.tterrag.registrate.providers.RegistrateRecipeProvider.has;

public class CraftingRecipeProvider extends BaseRecipeProvider {

    public CraftingRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookup) {
        super(output, lookup);
    }

    @Override
    protected void buildRecipes(RecipeOutput out) {

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.DIAMOND)
                .pattern("AAA")
                .pattern("ABA")
                .define('A', Items.IRON_INGOT)
                .define('B', Items.DIAMOND)
                .unlockedBy("has_iron", has(Items.IRON_INGOT))
                .save(out);
    }
}