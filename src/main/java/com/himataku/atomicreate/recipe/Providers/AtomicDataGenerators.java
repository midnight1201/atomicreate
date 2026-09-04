package com.himataku.atomicreate.recipe.Providers;

import com.himataku.atomicreate.recipe.Providers.CreateGen.AtomicCrushingRecipeGen;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.data.event.GatherDataEvent;

public class AtomicDataGenerators {

    public static void gatherData(GatherDataEvent event) {

        var generator = event.getGenerator();
        var output = generator.getPackOutput();
        var existingFileHelper = event.getExistingFileHelper();

        generator.addProvider(
                event.includeServer(),
                new AtomicCrushingRecipeGen(
                        output,
                        event.getLookupProvider()
                )
        );

    }
}

