package com.himataku.atomicreate.recipe.Providers;

import net.neoforged.neoforge.data.event.GatherDataEvent;

public class RecipeProvider {

    public static void gatherData(GatherDataEvent event) {

        var generator = event.getGenerator();
        var output = generator.getPackOutput();



        generator.addProvider(
                event.includeServer(),
                new AtomicCrushingRecipeProvider(
                        output,
                        event.getLookupProvider()
                )
        );

        generator.addProvider(
                event.includeServer(),
                new AtomicPressingRecipeProvider(
                        output,
                        event.getLookupProvider()
                )
        );

        generator.addProvider(
                event.includeServer(),
                new AtomicWashingRecipeProvider(
                        output,
                        event.getLookupProvider()
                )
        );
    }
}