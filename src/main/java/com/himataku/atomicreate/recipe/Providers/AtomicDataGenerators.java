package com.himataku.atomicreate.recipe.Providers;

import com.himataku.atomicreate.recipe.Providers.CreateGen.AtomicCrushingRecipeGen;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

public class AtomicDataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {

        System.out.println("=== AtomicDataGenerators.gatherData ===");

        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();

        AtomicCrushingRecipeGen crushing =
                new AtomicCrushingRecipeGen(
                        output,
                        event.getLookupProvider()
                );

        generator.addProvider(
                true,
                new DataProvider() {

                    @Override
                    public String getName() {
                        return "Atomicreate Processing Recipes";
                    }

                    @Override
                    public CompletableFuture<?> run(CachedOutput cache) {

                        System.out.println("=== Atomic Crushing RUN ===");

                        return crushing.run(cache);
                    }
                }
        );
    }
}