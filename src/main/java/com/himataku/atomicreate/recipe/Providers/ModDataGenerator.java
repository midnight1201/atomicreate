package com.himataku.atomicreate.recipe.Providers;

import com.himataku.atomicreate.AtomiCreate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber(
        modid = AtomiCreate.ID
        //bus = EventBusSubscriber.Bus.MOD
)
public final class ModDataGenerator {

    private ModDataGenerator() {
    }

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {

        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();

        generator.addProvider(
                event.includeServer(),
                new AtomicCrushingRecipeGen(
                        packOutput,
                        event.getLookupProvider()
                )
        );
    }
}