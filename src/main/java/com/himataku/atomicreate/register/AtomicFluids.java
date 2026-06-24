package com.himataku.atomicreate.register;

import com.himataku.atomicreate.AtomiCreate;
import com.simibubi.create.Create;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.FluidEntry;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;

public class AtomicFluids {



        public static FluidEntry<BaseFlowingFluid.Flowing> MY_FLUID;

        public static void register(CreateRegistrate reg) {
            MY_FLUID =
                    reg.standardFluid("my_fluid")
                            .register();

    }




    public static void register() {
        AtomiCreate.LOGGER.info("Register Fluids...");
    }
}
