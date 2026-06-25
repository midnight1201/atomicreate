package com.himataku.atomicreate.recipe.Providers;

import com.himataku.atomicreate.AtomiCreate;
import com.himataku.atomicreate.register.AtomicItems;
import com.himataku.atomicreate.register.Metals;
import com.simibubi.create.AllItems;
import com.simibubi.create.Create;
import com.simibubi.create.api.data.recipe.CrushingRecipeGen;
import com.simibubi.create.content.decoration.palettes.AllPaletteStoneTypes;
import com.simibubi.create.content.kinetics.crusher.CrushingRecipe;
import com.simibubi.create.content.processing.recipe.StandardProcessingRecipe;
import com.simibubi.create.foundation.data.recipe.Mods;
import net.createmod.catnip.lang.Lang;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.UnaryOperator;

public class AtomicCrushingRecipeProvider extends CrushingRecipeGen {

    GeneratedRecipe BLAZE_ROD = create(() -> Items.BLAZE_ROD, b -> b
            .duration(100)
            .output(Items.BLAZE_POWDER, 3)
            .output(0.25f, Items.BLAZE_POWDER, 3));

    public AtomicCrushingRecipeProvider(
            PackOutput output,
            CompletableFuture<HolderLookup.Provider> registries
    ) {
        super(output, registries, "atomicreate");
    }
}