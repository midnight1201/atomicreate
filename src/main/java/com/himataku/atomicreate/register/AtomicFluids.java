package com.himataku.atomicreate.register;

import com.himataku.atomicreate.AtomiCreate;
import com.simibubi.create.content.decoration.palettes.AllPaletteStoneTypes;
import com.tterrag.registrate.util.entry.FluidEntry;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.common.NeoForgeMod;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;
import net.neoforged.neoforge.fluids.FluidInteractionRegistry;
import net.neoforged.neoforge.fluids.FluidInteractionRegistry.InteractionInformation;

import javax.annotation.Nullable;
import java.util.LinkedHashMap;
import java.util.Map;

import static com.himataku.atomicreate.AtomiCreate.REGISTRATE;

public class AtomicFluids {

    public enum FormLiquid {
        LIQUID,
        GAS,
        LIGHTGAS
    }

    public record FluidSet(
            FluidEntry<BaseFlowingFluid.Flowing> fluid,
            FormLiquid form
    ) {}

    public static final Map<String, FluidSet> FLUIDS = new LinkedHashMap<>();

    static {

        for (String name : Liquid.ALL) {
            FLUIDS.put(name,
                    new FluidSet(
                            registerFluid(name, 1400, 1500),
                            FormLiquid.LIQUID
                    ));
        }

        for (String name : Gas.ALL) {
            FLUIDS.put(name,
                    new FluidSet(
                            registerFluid(name, 200, 100),
                            FormLiquid.GAS
                    ));
        }

        for (String name : LightGas.ALL) {
            FLUIDS.put(name,
                    new FluidSet(
                            registerFluid(name, -100, 50),
                            FormLiquid.LIGHTGAS
                    ));
        }
    }

    private static FluidEntry<BaseFlowingFluid.Flowing> registerFluid(
            String name,
            int density,
            int viscosity
    ) {
        return REGISTRATE.standardFluid(name)
                .lang(capitalize(name))
                .properties(p -> p
                        .density(density)
                        .viscosity(viscosity))
                .fluidProperties(p -> p
                        .tickRate(25)
                        .levelDecreasePerBlock(2))
                .source(BaseFlowingFluid.Source::new)
                .block()
                .properties(p -> p.mapColor(MapColor.COLOR_GRAY))
                .build()
                .register();
    }

    private static String capitalize(String s) {
        return Character.toUpperCase(s.charAt(0))
                + s.substring(1);
    }

    public static void registerFluidInteractions() {

        FluidSet iron = FLUIDS.get("iron");

        if (iron == null)
            return;

        FluidInteractionRegistry.addInteraction(
                NeoForgeMod.LAVA_TYPE.value(),
                new InteractionInformation(
                        iron.fluid().get().getFluidType(),
                        fluidState -> fluidState.isSource()
                                ? Blocks.OBSIDIAN.defaultBlockState()
                                : AllPaletteStoneTypes.SCORIA
                                .getBaseBlock()
                                .get()
                                .defaultBlockState()
                )
        );
    }

    @Nullable
    public static BlockState getLavaInteraction(FluidState fluidState) {

        FluidSet iron = FLUIDS.get("iron");

        if (iron == null)
            return null;

        Fluid fluid = fluidState.getType();

        if (fluid.isSame(iron.fluid().get())) {
            return AllPaletteStoneTypes.SCORIA
                    .getBaseBlock()
                    .get()
                    .defaultBlockState();
        }

        return null;
    }

    public static FluidEntry<BaseFlowingFluid.Flowing> get(String name) {
        FluidSet set = FLUIDS.get(name);
        return set == null ? null : set.fluid();
    }

    public static void register() {
        AtomiCreate.LOGGER.info(
                "Registered {} fluids",
                FLUIDS.size()
        );
    }
}