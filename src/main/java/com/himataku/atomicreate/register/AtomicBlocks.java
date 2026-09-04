package com.himataku.atomicreate.register;

import com.himataku.atomicreate.AtomiCreate;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;

public class AtomicBlocks {

    public static final BlockEntry<Block> LITHIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("lithium_block", Block::new)
                    .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_LITHIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_lithium_block", Block::new)
                    .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> BERYLLIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("beryllium_block", Block::new)
                    .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_BERYLLIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_beryllium_block", Block::new)
                    .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> BORON_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("boron_block", Block::new)
                    .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_BORON_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_boron_block", Block::new)
                    .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> CARBON_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("carbon_block", Block::new)
                    .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_CARBON_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_carbon_block", Block::new)
                    .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> SODIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("sodium_block", Block::new)
                    .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_SODIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_sodium_block", Block::new)
                    .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> MAGNESIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("magnesium_block", Block::new)
                    .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_MAGNESIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_magnesium_block", Block::new)
                    .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> ALUMINIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("aluminium_block", Block::new)
                    .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_ALUMINIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_aluminium_block", Block::new)
                    .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> SILICON_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("silicon_block", Block::new)
                    .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_SILICON_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_silicon_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> PHOSPHORUS_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("phosphorus_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_PHOSPHORUS_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_phosphorus_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> SULFUR_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("sulfur_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_SULFUR_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_sulfur_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> POTASSIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("potassium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_POTASSIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_potassium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> CALCIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("calcium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_CALCIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_calcium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> SCANDIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("scandium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_SCANDIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_scandium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> TITANIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("titanium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_TITANIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_titanium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> VANADIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("vanadium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_VANADIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_vanadium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> CHROMIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("chromium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_CHROMIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_chromium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> MANGANESE_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("manganese_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_MANGANESE_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_manganese_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> IRON_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("iron_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_IRON_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_iron_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> COBALT_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("cobalt_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_COBALT_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_cobalt_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> NICKEL_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("nickel_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_NICKEL_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_nickel_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> COPPER_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("copper_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_COPPER_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_copper_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    /*
        public static final BlockEntry<Block> ZINC_BLOCK =

            AtomiCreate.REGISTRATE
                    .block("zinc_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_ZINC_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_zinc_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

     */

    public static final BlockEntry<Block> GALLIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("gallium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_GALLIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_gallium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> GERMANIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("germanium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_GERMANIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_germanium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> ARSENIC_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("arsenic_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_ARSENIC_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_arsenic_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> SELENIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("selenium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_SELENIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_selenium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RUBIDIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("rubidium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_RUBIDIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_rubidium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> STRONTIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("strontium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_STRONTIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_strontium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> YTTRIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("yttrium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_YTTRIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_yttrium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> ZIRCONIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("zirconium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_ZIRCONIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_zirconium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> NIOBIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("niobium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_NIOBIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_niobium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> MOLYBDENUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("molybdenum_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_MOLYBDENUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_molybdenum_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> TECHNETIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("technetium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_TECHNETIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_technetium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RUTHENIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("ruthenium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_RUTHENIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_ruthenium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RHODIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("rhodium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_RHODIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_rhodium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> PALLADIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("palladium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_PALLADIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_palladium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> SILVER_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("silver_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_SILVER_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_silver_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> CADMIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("cadmium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_CADMIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_cadmium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> INDIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("indium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_INDIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_indium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> TIN_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("tin_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_TIN_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_tin_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> ANTIMONY_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("antimony_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_ANTIMONY_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_antimony_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> TELLURIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("tellurium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_TELLURIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_tellurium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> IODINE_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("iodine_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_IODINE_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_iodine_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> CESIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("cesium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_CESIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_cesium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> BARIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("barium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_BARIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_barium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> LANTHANUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("lanthanum_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_LANTHANUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_lanthanum_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> CERIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("cerium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_CERIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_cerium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> PRASEODYMIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("praseodymium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_PRASEODYMIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_praseodymium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> NEODYMIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("neodymium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_NEODYMIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_neodymium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> PROMETHIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("promethium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_PROMETHIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_promethium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> SAMARIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("samarium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_SAMARIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_samarium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> EUROPIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("europium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_EUROPIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_europium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> GADOLINIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("gadolinium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_GADOLINIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_gadolinium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> TERBIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("terbium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_TERBIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_terbium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> DYSPROSIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("dysprosium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_DYSPROSIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_dysprosium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> HOLMIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("holmium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_HOLMIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_holmium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> ERBIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("erbium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_ERBIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_erbium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> THULIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("thulium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_THULIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_thulium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> YTTERBIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("ytterbium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_YTTERBIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_ytterbium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> LUTETIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("lutetium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_LUTETIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_lutetium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> HAFNIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("hafnium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_HAFNIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_hafnium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> TANTALUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("tantalum_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_TANTALUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_tantalum_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> TUNGSTEN_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("tungsten_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_TUNGSTEN_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_tungsten_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RHENIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("rhenium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_RHENIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_rhenium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> OSMIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("osmium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_OSMIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_osmium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> IRIDIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("iridium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_IRIDIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_iridium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> PLATINUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("platinum_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_PLATINUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_platinum_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> GOLD_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("gold_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_GOLD_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_gold_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> MERCURY_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("mercury_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_MERCURY_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_mercury_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> THALLIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("thallium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_THALLIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_thallium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> LEAD_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("lead_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_LEAD_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_lead_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> BISMUTH_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("bismuth_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_BISMUTH_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_bismuth_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> POLONIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("polonium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_POLONIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_polonium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> ASTATINE_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("astatine_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_ASTATINE_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_astatine_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> FRANCIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("francium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_FRANCIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_francium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RADIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("radium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_RADIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_radium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> ACTINIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("actinium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_ACTINIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_actinium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> THORIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("thorium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_THORIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_thorium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> PROTACTINIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("protactinium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_PROTACTINIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_protactinium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> URANIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("uranium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_URANIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_uranium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> NEPTUNIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("neptunium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_NEPTUNIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_neptunium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> PLUTONIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("plutonium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_PLUTONIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_plutonium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> UNUNMINECRAFTIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("ununminecraftium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static final BlockEntry<Block> RAW_UNUNMINECRAFTIUM_BLOCK =
            AtomiCreate.REGISTRATE
                    .block("raw_ununminecraftium_block", Block::new)
                     .blockstate((ctx, prov) ->
                            prov.simpleBlock(
                                    ctx.get(),
                                    prov.models().cubeAll(
                                            ctx.getName(),
                                            ResourceLocation.fromNamespaceAndPath("minecraft", "block/iron_block")
                                    )
                            ))
                    .item()
                    .build()
                    .register();

    public static void register() {
        AtomiCreate.LOGGER.info("Register Atomic Blocks");
    }
}