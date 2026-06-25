package com.himataku.atomicreate.recipe.Providers;

import net.neoforged.neoforge.data.event.GatherDataEvent;

public class RecipeGen {

    public static void gather(GatherDataEvent event) {
        var generator = event.getGenerator();
        var output = generator.getPackOutput();
        var lookup = event.getLookupProvider();

        generator.addProvider(event.includeServer(),
                new CraftingRecipeProvider(output, lookup));


    }
}