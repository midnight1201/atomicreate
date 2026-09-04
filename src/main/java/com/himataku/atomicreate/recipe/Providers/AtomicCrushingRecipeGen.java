package com.himataku.atomicreate.recipe.Providers;

import java.util.concurrent.CompletableFuture;

import com.himataku.atomicreate.AtomiCreate;
import com.simibubi.create.api.data.recipe.CrushingRecipeGen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;

public final class AtomicCrushingRecipeGen extends CrushingRecipeGen {

    GeneratedRecipe DIAMOND = create(() -> Items.DIAMOND, b -> b
            .duration(100)
            .output(Items.IRON_INGOT));

    public AtomicCrushingRecipeGen(
            PackOutput output,
            CompletableFuture<HolderLookup.Provider> registries
    ) {
        super(output, registries, AtomiCreate.ID);
    }
}