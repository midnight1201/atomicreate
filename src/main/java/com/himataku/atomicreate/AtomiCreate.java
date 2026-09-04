package com.himataku.atomicreate;


import com.himataku.atomicreate.recipe.Providers.ModDataGenerator;
import com.himataku.atomicreate.register.*;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.foundation.item.ItemDescription;
import com.simibubi.create.foundation.item.KineticStats;
import com.simibubi.create.foundation.item.TooltipModifier;

import net.createmod.catnip.lang.FontHelper;
import net.minecraft.resources.ResourceLocation;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(AtomiCreate.ID)
public class AtomiCreate {

    public static final String ID = "atomicreate";

    public static final Logger LOGGER =
            LogManager.getLogger(ID);

    public static final CreateRegistrate REGISTRATE =
            CreateRegistrate.create(ID)
                    .setTooltipModifierFactory(item ->
                            new ItemDescription.Modifier(
                                    item,
                                    FontHelper.Palette.STANDARD_CREATE
                            ).andThen(
                                    TooltipModifier.mapNull(
                                            KineticStats.create(item)
                                    )
                            )
                    );

    public AtomiCreate(IEventBus modBus) {

        // Create Registrate
        REGISTRATE.registerEventListeners(modBus);

        // Creative Tab
        AtomiCreativeModeTabs.register();
        REGISTRATE.setCreativeTab(
                AtomiCreativeModeTabs.MAIN_TAB
        );

        // Items
        AtomicItems.register();

        // Blocks
        AtomicBlocks.register();

        // Fluids
        AtomicFluids.register();

        // Datagen
        modBus.addListener(ModDataGenerator::gatherData);

        // Client Setup
        modBus.addListener(this::onClientSetup);

    }

    public static ResourceLocation asResource(String path) {
        return ResourceLocation.fromNamespaceAndPath(
                ID,
                path
        );
    }


    @EventBusSubscriber(
            modid = AtomiCreate.ID,
            value = Dist.CLIENT
    )
    public static class ClientModEvents {

        @SubscribeEvent
        public static void registerScreens(
                RegisterMenuScreensEvent event
        ) {

        }

        @SubscribeEvent
        public static void gatherData(GatherDataEvent event) {
            ModDataGenerator.gatherData(event);

        }
    }

    /*
     * Client Setup
     */
    private void onClientSetup(
            FMLClientSetupEvent event
    ) {
        LOGGER.info("Client setup...");
    }
}