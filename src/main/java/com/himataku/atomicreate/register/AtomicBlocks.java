package com.himataku.atomicreate.register;

import com.himataku.atomicreate.AtomiCreate;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class AtomicBlocks {

    private static final Set<String> HAS_TEXTURE = Set.of(
            // "tin_block",
            // "silver_block",
    );

    public enum FormBlock {
        RAW_BLOCK("raw_%s_block", "iron_block"),
        BLOCK("%s_block", "iron_block");

        private final String idPattern;
        private final String fallbackTexture;

        FormBlock(String idPattern, String fallbackTexture) {
            this.idPattern = idPattern;
            this.fallbackTexture = fallbackTexture;
        }

        public String id(String metal) {
            return String.format(idPattern, metal);
        }

        public String fallbackTexture() {
            return fallbackTexture;
        }
    }

    public record MetalBlock(
            BlockEntry<Block> block,
            BlockEntry<Block> raw_block
    ) {}

    public static final Map<String, MetalBlock> METAL_BLOCKS = new LinkedHashMap<>();

    static {
        for (String metal : Metals.ALL) {
            METAL_BLOCKS.put(metal, new MetalBlock(
                    registerForm(metal, FormBlock.BLOCK),
                    registerForm(metal, FormBlock.RAW_BLOCK)
            ));
        }
    }

    private static BlockEntry<Block> registerForm(String metal, FormBlock form) {

        String id = form.id(metal);

        String texture = HAS_TEXTURE.contains(id)
                ? id
                : form.fallbackTexture();

        return AtomiCreate.REGISTRATE
                .block(id, Block::new)
                .blockstate((ctx, prov) ->
                        prov.simpleBlock(ctx.get(), prov.cubeAll(ctx.get())))
                .item() // ← ブロックのアイテムも自動生成
                .build()
                .register();
    }

    public static void register() {
        AtomiCreate.LOGGER.info("Register Blocks...");
    }
}