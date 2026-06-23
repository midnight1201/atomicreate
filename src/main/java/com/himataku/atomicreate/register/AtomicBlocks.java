package com.himataku.atomicreate.register;

import com.himataku.atomicreate.AtomiCreate;

/**
 * Block registration using Create's Registrate.
 * <p>
 * Example:
 * <pre>
 * public static final BlockEntry&lt;Block&gt; EXAMPLE_BLOCK = ExampleMod.REGISTRATE
 *         .block("example_block", Block::new)
 *         .simpleItem()
 *         .register();
 * </pre>
 */
public class AtomicBlocks {

    public static void register() {
        AtomiCreate.LOGGER.info("Register Blocks...");
    }
}
