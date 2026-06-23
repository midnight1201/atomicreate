package com.himataku.atomicreate;

import com.himataku.atomicreate.register.AtomiCreativeModeTabs;
import com.himataku.atomicreate.register.AtomicBlocks;
import com.himataku.atomicreate.register.AtomicFluids;
import com.himataku.atomicreate.register.AtomicItems;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.foundation.item.ItemDescription;
import com.simibubi.create.foundation.item.KineticStats;
import com.simibubi.create.foundation.item.TooltipModifier;
import net.createmod.catnip.lang.FontHelper;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(AtomiCreate.ID)
public class AtomiCreate {
    public static final String ID = "atomicreate";
    public static final Logger LOGGER = LogManager.getLogger(ID);

    public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(ID)
            .setTooltipModifierFactory(item ->
                    new ItemDescription.Modifier(item, FontHelper.Palette.STANDARD_CREATE)
                            .andThen(TooltipModifier.mapNull(KineticStats.create(item)))
            );

    public AtomiCreate(IEventBus modBus) {
        REGISTRATE.registerEventListeners(modBus);

        AtomiCreativeModeTabs.register();
        REGISTRATE.setCreativeTab(AtomiCreativeModeTabs.MAIN_TAB);
        AtomicItems.register();
        AtomicBlocks.register();
        AtomicFluids.register();

        modBus.addListener(this::onCommonSetup);
        modBus.addListener(this::onClientSetup);
    }

    public static ResourceLocation asResource(String path) {
        return ResourceLocation.fromNamespaceAndPath(ID, path);
    }

    private void onCommonSetup(FMLCommonSetupEvent event) {
        LOGGER.info("Common setup...");
    }

    private void onClientSetup(FMLClientSetupEvent event) {
        LOGGER.info("Client setup...");
    }
}
