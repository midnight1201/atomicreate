package com.himataku.atomicreate.register;

import com.himataku.atomicreate.AtomiCreate;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.world.item.Item;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class AtomicItems {

    /**
     * Item ids that have a finished texture go here
     * Otherwise, falls back to iron placeholder
     */
    private static final Set<String> HAS_TEXTURE = Set.of(
            // "tin_ingot",
            // "silver_nugget",
    );

    /**
     * Five forms, with id pattern and placeholder
     */
    public enum Form {
        RAW("raw_%s", "raw_iron"),
        CRUSHED("crushed_raw_%s", "crushed_raw_iron"),
        NUGGET("%s_nugget", "iron_nugget"),
        INGOT("%s_ingot", "iron_ingot"),
        SHEET("%s_sheet", "iron_sheet");

        private final String idPattern;
        private final String ironPlaceholder;

        Form(String idPattern, String ironPlaceholder) {
            this.idPattern = idPattern;
            this.ironPlaceholder = ironPlaceholder;
        }

        public String id(String metal) {
            return String.format(idPattern, metal);
        }

        public String ironPlaceholder() {
            return ironPlaceholder;
        }
    }

    /**
     * Holds the five forms for a single metal
     */
    public record MetalItems(
            ItemEntry<Item> raw,
            ItemEntry<Item> crushed,
            ItemEntry<Item> nugget,
            ItemEntry<Item> ingot,
            ItemEntry<Item> sheet

    ) {
    }

    /**
     * Lookup by metal name
     */
    public static final Map<String, MetalItems> METAL_ITEMS = new LinkedHashMap<>();

    static {
        for (String metal : Metals.ALL) {
            METAL_ITEMS.put(metal, new MetalItems(
                    registerForm(metal, Form.RAW),
                    registerForm(metal, Form.CRUSHED),
                    registerForm(metal, Form.NUGGET),
                    registerForm(metal, Form.INGOT),
                    registerForm(metal, Form.SHEET)
            ));
        }
    }

    private static ItemEntry<Item> registerForm(String metal, Form form) {
        String id = form.id(metal);
        // own texture if it exists, otherwise the iron placeholder for this form
        String texture = HAS_TEXTURE.contains(id) ? id : form.ironPlaceholder();
        return AtomiCreate.REGISTRATE
                .item(id, Item::new)
                .model((ctx, prov) -> prov.generated(ctx, AtomiCreate.asResource("item/" + texture)))
                .register();
    }

    public static void register() {
        AtomiCreate.LOGGER.info("Register Items...");
    }
}