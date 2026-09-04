package com.himataku.atomicreate.recipe.Providers.CreateGen;

import com.simibubi.create.Create;
import com.simibubi.create.api.data.recipe.CrushingRecipeGen;
import com.himataku.atomicreate.AtomiCreate;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

public class AtomicCrushingRecipeGen extends CrushingRecipeGen {

    GeneratedRecipe
            BLOMODIA = create(() -> Items.DIAMOND_AXE, b -> b.duration(100)
            .output(Items.BLAZE_POWDER, 3)
		.output(.25f, Items.BLAZE_POWDER, 3)),

            PLATINAMOND = create(() -> Items.IRON_AXE, b -> b.duration(100)
            .output(Items.BLAZE_POWDER, 3)
            .output(.25f, Items.BLAZE_POWDER, 3))

            ;
    public AtomicCrushingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, Create.ID);
    }
}