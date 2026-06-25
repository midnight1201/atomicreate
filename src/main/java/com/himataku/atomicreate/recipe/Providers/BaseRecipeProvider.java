package com.himataku.atomicreate.recipe.Providers;

import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public abstract class BaseRecipeProvider extends RecipeProvider {

    public BaseRecipeProvider(PackOutput output,
                              CompletableFuture<HolderLookup.Provider> lookup) {
        super(output, lookup);
    }
}