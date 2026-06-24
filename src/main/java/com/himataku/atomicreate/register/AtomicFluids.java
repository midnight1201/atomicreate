package com.himataku.atomicreate.register;

import com.himataku.atomicreate.AtomiCreate;
import com.simibubi.create.AllFluids;
import com.simibubi.create.AllTags;
import com.simibubi.create.Create;
import com.simibubi.create.content.decoration.palettes.AllPaletteStoneTypes;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.infrastructure.config.AllConfigs;
import com.tterrag.registrate.builders.FluidBuilder;
import com.tterrag.registrate.util.entry.FluidEntry;
import net.createmod.catnip.theme.Color;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.common.NeoForgeMod;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;
import net.neoforged.neoforge.fluids.FluidInteractionRegistry;
import net.neoforged.neoforge.fluids.FluidInteractionRegistry.InteractionInformation;
import net.neoforged.neoforge.fluids.FluidStack;
import org.joml.Vector3f;

import javax.annotation.Nullable;

import java.util.function.Supplier;

import static com.himataku.atomicreate.AtomiCreate.REGISTRATE;

public class AtomicFluids {

    public static final FluidEntry<BaseFlowingFluid.Flowing> TestLiquid =
            REGISTRATE.standardFluid("tester")
                    .lang("Tester")
                    .properties(b -> b.viscosity(1500).density(1400))
                    .fluidProperties(p -> p.tickRate(25).levelDecreasePerBlock(2))
                    .source(BaseFlowingFluid.Source::new)
                    .block()
                    .properties(p -> p.mapColor(MapColor.TERRACOTTA_BROWN))
                    .build()
                    .register();

    public static void registerFluidInteractions() {
        FluidInteractionRegistry.addInteraction(
                NeoForgeMod.LAVA_TYPE.value(),
                new InteractionInformation(
                        TestLiquid.get().getFluidType(),
                        fluidState -> {
                            if (fluidState.isSource()) {
                                return Blocks.OBSIDIAN.defaultBlockState();
                            } else {
                                return AllPaletteStoneTypes.SCORIA.getBaseBlock()
                                        .get()
                                        .defaultBlockState();
                            }
                        }
                )
        );
    }

    @Nullable
    public static BlockState getLavaInteraction(FluidState fluidState) {
        Fluid fluid = fluidState.getType();

        if (fluid.isSame(TestLiquid.get()))
            return AllPaletteStoneTypes.SCORIA.getBaseBlock()
                    .get()
                    .defaultBlockState();

        return null;
    }

    public static void register() {
        AtomiCreate.LOGGER.info("Register Fluids...");
    }

}
