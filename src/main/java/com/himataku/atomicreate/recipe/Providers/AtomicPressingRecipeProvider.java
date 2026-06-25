package com.himataku.atomicreate.recipe.Providers;

import com.himataku.atomicreate.AtomiCreate;
import com.simibubi.create.api.data.recipe.PressingRecipeGen;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class AtomicPressingRecipeProvider extends PressingRecipeGen {

    GeneratedRecipe BLAZE_ROD = create(() -> Items.BLAZE_ROD, b -> b
            .duration(100)
            .output(Items.BLAZE_POWDER, 3)
            .output(0.25f, Items.BLAZE_POWDER, 3));

    public AtomicPressingRecipeProvider(
            PackOutput output,
            CompletableFuture<HolderLookup.Provider> registries
    ) {
        super(output, registries, "atomicreate");
    }

}