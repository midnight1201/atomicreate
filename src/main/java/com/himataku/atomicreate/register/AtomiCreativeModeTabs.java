package com.himataku.atomicreate.register;

import com.himataku.atomicreate.AtomiCreate;
import com.tterrag.registrate.util.entry.RegistryEntry;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class AtomiCreativeModeTabs {

    public static final RegistryEntry<CreativeModeTab, CreativeModeTab> MAIN_TAB =
            AtomiCreate.REGISTRATE.defaultCreativeTab("main_tab", builder ->
                    builder
                            .title(Component.literal("AtomiCreate"))
                            .icon(() -> new ItemStack(Items.IRON_INGOT))
                            .withSearchBar()
                            .build()
            ).register();

    public static void register() {
        AtomiCreate.LOGGER.info("Register Creative Tab...");
    }
}
