package com.himataku.atomicreate.register;

import com.himataku.atomicreate.AtomiCreate;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.world.item.Item;

public class AtomicItems {


    //gemgem

    public static final ItemEntry<Item> RUBY =
            AtomiCreate.REGISTRATE
                    .item("ruby", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/diamond")))
                    .register();

    public static final ItemEntry<Item> TOPAZ =
            AtomiCreate.REGISTRATE
                    .item("topaz", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/diamond")))
                    .register();

    public static final ItemEntry<Item> OPAL =
            AtomiCreate.REGISTRATE
                    .item("opal", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/diamond")))
                    .register();

    public static final ItemEntry<Item> GARNET =
            AtomiCreate.REGISTRATE
                    .item("garnet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/diamond")))
                    .register();

    public static final ItemEntry<Item> TOURMALINE =
            AtomiCreate.REGISTRATE
                    .item("tourmaline", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/diamond")))
                    .register();

    public static final ItemEntry<Item> AQUAMARINE =
            AtomiCreate.REGISTRATE
                    .item("aquamarine", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/diamond")))
                    .register();

    public static final ItemEntry<Item> BERYL =
            AtomiCreate.REGISTRATE
                    .item("beryl", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/diamond")))
                    .register();

    public static final ItemEntry<Item> PERIDOT =
            AtomiCreate.REGISTRATE
                    .item("peridot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/diamond")))
                    .register();

    public static final ItemEntry<Item> ZIRCON =
            AtomiCreate.REGISTRATE
                    .item("zircon", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/diamond")))
                    .register();

    public static final ItemEntry<Item> SPINEL =
            AtomiCreate.REGISTRATE
                    .item("spinel", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/diamond")))
                    .register();

    public static final ItemEntry<Item> PEARL =
            AtomiCreate.REGISTRATE
                    .item("pearl", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/diamond")))
                    .register();

    public static final ItemEntry<Item> CORAL =
            AtomiCreate.REGISTRATE
                    .item("coral", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/diamond")))
                    .register();

    public static final ItemEntry<Item> AMBER =
            AtomiCreate.REGISTRATE
                    .item("amber", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/diamond")))
                    .register();

    public static final ItemEntry<Item> JADE =
            AtomiCreate.REGISTRATE
                    .item("jade", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/diamond")))
                    .register();


//miscmisc

    public static final ItemEntry<Item> BERYLLIUM_COPPER_INGOT =
            AtomiCreate.REGISTRATE
                    .item("beryllium_copper_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> BRASS_INGOT =
            AtomiCreate.REGISTRATE
                    .item("brass_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> BRONZE_INGOT =
            AtomiCreate.REGISTRATE
                    .item("bronze_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> REDSTONE_ALLOY_INGOT =
            AtomiCreate.REGISTRATE
                    .item("redstone_alloy_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> STEEL_INGOT =
            AtomiCreate.REGISTRATE
                    .item("steel_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> IC =
            AtomiCreate.REGISTRATE
                    .item("ic", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/paper")))
                    .register();

    public static final ItemEntry<Item> SCIENCE_PAPER =
            AtomiCreate.REGISTRATE
                    .item("science_paper", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/paper")))
                    .register();


// atomicatomic

    public static final ItemEntry<Item> RAW_LITHIUM =
            AtomiCreate.REGISTRATE
                    .item("raw_lithium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_LITHIUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_lithium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> LITHIUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("lithium_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> LITHIUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("lithium_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> LITHIUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("lithium_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();


    public static final ItemEntry<Item> RAW_BERYLLIUM =
            AtomiCreate.REGISTRATE
                    .item("raw_beryllium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_BERYLLIUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_beryllium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> BERYLLIUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("beryllium_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> BERYLLIUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("beryllium_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/beryllium_ingot")))
                    .register();

    public static final ItemEntry<Item> BERYLLIUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("beryllium_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();

    public static final ItemEntry<Item> RAW_BORON =
            AtomiCreate.REGISTRATE
                    .item("raw_boron", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_BORON =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_boron", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> BORON_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("boron_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> BORON_INGOT =
            AtomiCreate.REGISTRATE
                    .item("boron_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> BORON_SHEET =
            AtomiCreate.REGISTRATE
                    .item("boron_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_CARBON =
            AtomiCreate.REGISTRATE
                    .item("raw_carbon", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_CARBON =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_carbon", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> CARBON_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("carbon_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> CARBON_INGOT =
            AtomiCreate.REGISTRATE
                    .item("carbon_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> CARBON_SHEET =
            AtomiCreate.REGISTRATE
                    .item("carbon_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();


    public static final ItemEntry<Item> RAW_SODIUM =
            AtomiCreate.REGISTRATE
                    .item("raw_sodium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_SODIUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_sodium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> SODIUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("sodium_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> SODIUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("sodium_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> SODIUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("sodium_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_MAGNESIUM =
            AtomiCreate.REGISTRATE
                    .item("raw_magnesium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_MAGNESIUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_magnesium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> MAGNESIUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("magnesium_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> MAGNESIUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("magnesium_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> MAGNESIUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("magnesium_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_ALUMINIUM =
            AtomiCreate.REGISTRATE
                    .item("raw_aluminium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_ALUMINIUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_aluminium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> ALUMINIUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("aluminium_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> ALUMINIUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("aluminium_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> ALUMINIUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("aluminium_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_SILICON =
            AtomiCreate.REGISTRATE
                    .item("raw_silicon", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_SILICON =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_silicon", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> SILICON_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("silicon_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> SILICON_INGOT =
            AtomiCreate.REGISTRATE
                    .item("silicon_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> SILICON_SHEET =
            AtomiCreate.REGISTRATE
                    .item("silicon_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_PHOSPHORUS =
            AtomiCreate.REGISTRATE
                    .item("raw_phosphorus", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_PHOSPHORUS =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_phosphorus", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> PHOSPHORUS_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("phosphorus_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> PHOSPHORUS_INGOT =
            AtomiCreate.REGISTRATE
                    .item("phosphorus_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> PHOSPHORUS_SHEET =
            AtomiCreate.REGISTRATE
                    .item("phosphorus_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_SULFUR =
            AtomiCreate.REGISTRATE
                    .item("raw_sulfur", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_SULFUR =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_sulfur", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> SULFUR_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("sulfur_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> SULFUR_INGOT =
            AtomiCreate.REGISTRATE
                    .item("sulfur_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> SULFUR_SHEET =
            AtomiCreate.REGISTRATE
                    .item("sulfur_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_POTASSIUM =
            AtomiCreate.REGISTRATE
                    .item("raw_potassium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_POTASSIUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_potassium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> POTASSIUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("potassium_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> POTASSIUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("potassium_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> POTASSIUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("potassium_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_CALCIUM =
            AtomiCreate.REGISTRATE
                    .item("raw_calcium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_CALCIUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_calcium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> CALCIUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("calcium_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> CALCIUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("calcium_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> CALCIUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("calcium_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_SCANDIUM =
            AtomiCreate.REGISTRATE
                    .item("raw_scandium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_SCANDIUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_scandium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> SCANDIUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("scandium_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> SCANDIUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("scandium_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> SCANDIUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("scandium_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_TITANIUM =
            AtomiCreate.REGISTRATE
                    .item("raw_titanium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_TITANIUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_titanium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> TITANIUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("titanium_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> TITANIUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("titanium_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> TITANIUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("titanium_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_VANADIUM =
            AtomiCreate.REGISTRATE
                    .item("raw_vanadium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_VANADIUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_vanadium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> VANADIUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("vanadium_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> VANADIUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("vanadium_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> VANADIUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("vanadium_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_CHROMIUM =
            AtomiCreate.REGISTRATE
                    .item("raw_chromium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_CHROMIUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_chromium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> CHROMIUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("chromium_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> CHROMIUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("chromium_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> CHROMIUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("chromium_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_MANGANESE =
            AtomiCreate.REGISTRATE
                    .item("raw_manganese", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_MANGANESE =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_manganese", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> MANGANESE_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("manganese_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> MANGANESE_INGOT =
            AtomiCreate.REGISTRATE
                    .item("manganese_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> MANGANESE_SHEET =
            AtomiCreate.REGISTRATE
                    .item("manganese_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_COBALT =
            AtomiCreate.REGISTRATE
                    .item("raw_cobalt", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_COBALT =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_cobalt", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> COBALT_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("cobalt_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> COBALT_INGOT =
            AtomiCreate.REGISTRATE
                    .item("cobalt_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> COBALT_SHEET =
            AtomiCreate.REGISTRATE
                    .item("cobalt_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_NICKEL =
            AtomiCreate.REGISTRATE
                    .item("raw_nickel", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_NICKEL =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_nickel", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> NICKEL_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("nickel_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> NICKEL_INGOT =
            AtomiCreate.REGISTRATE
                    .item("nickel_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> NICKEL_SHEET =
            AtomiCreate.REGISTRATE
                    .item("nickel_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_GALLIUM =
            AtomiCreate.REGISTRATE
                    .item("raw_gallium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_GALLIUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_gallium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> GALLIUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("gallium_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> GALLIUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("gallium_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> GALLIUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("gallium_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_GERMANIUM =
            AtomiCreate.REGISTRATE
                    .item("raw_germanium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_GERMANIUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_germanium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> GERMANIUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("germanium_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> GERMANIUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("germanium_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> GERMANIUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("germanium_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_ARSENIC =
            AtomiCreate.REGISTRATE
                    .item("raw_arsenic", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_ARSENIC =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_arsenic", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> ARSENIC_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("arsenic_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> ARSENIC_INGOT =
            AtomiCreate.REGISTRATE
                    .item("arsenic_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> ARSENIC_SHEET =
            AtomiCreate.REGISTRATE
                    .item("arsenic_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();




    public static final ItemEntry<Item> RAW_SELENIUM =
            AtomiCreate.REGISTRATE
                    .item("raw_selenium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_SELENIUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_selenium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> SELENIUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("selenium_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> SELENIUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("selenium_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> SELENIUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("selenium_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();




    public static final ItemEntry<Item> RAW_RUBIDIUM =
            AtomiCreate.REGISTRATE
                    .item("raw_rubidium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_RUBIDIUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_rubidium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> RUBIDIUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("rubidium_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> RUBIDIUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("rubidium_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> RUBIDIUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("rubidium_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_STRONTIUM =
            AtomiCreate.REGISTRATE
                    .item("raw_strontium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_STRONTIUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_strontium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> STRONTIUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("strontium_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> STRONTIUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("strontium_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> STRONTIUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("strontium_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();


    public static final ItemEntry<Item> RAW_YTTRIUM =
            AtomiCreate.REGISTRATE
                    .item("raw_yttrium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_YTTRIUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_yttrium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> YTTRIUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("yttrium_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> YTTRIUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("yttrium_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> YTTRIUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("yttrium_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_ZIRCONIUM =
            AtomiCreate.REGISTRATE
                    .item("raw_zirconium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_ZIRCONIUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_zirconium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> ZIRCONIUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("zirconium_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> ZIRCONIUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("zirconium_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> ZIRCONIUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("zirconium_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_NIOBIUM =
            AtomiCreate.REGISTRATE
                    .item("raw_niobium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_NIOBIUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_niobium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> NIOBIUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("niobium_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> NIOBIUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("niobium_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> NIOBIUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("niobium_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_MOLYBDENUM =
            AtomiCreate.REGISTRATE
                    .item("raw_molybdenum", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_MOLYBDENUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_molybdenum", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> MOLYBDENUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("molybdenum_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> MOLYBDENUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("molybdenum_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> MOLYBDENUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("molybdenum_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_TECHNETIUM =
            AtomiCreate.REGISTRATE
                    .item("raw_technetium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_TECHNETIUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_technetium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> TECHNETIUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("technetium_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> TECHNETIUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("technetium_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> TECHNETIUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("technetium_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_RUTHENIUM =
            AtomiCreate.REGISTRATE
                    .item("raw_ruthenium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_RUTHENIUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_ruthenium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> RUTHENIUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("ruthenium_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> RUTHENIUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("ruthenium_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> RUTHENIUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("ruthenium_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_RHODIUM =
            AtomiCreate.REGISTRATE
                    .item("raw_rhodium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_RHODIUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_rhodium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> RHODIUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("rhodium_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> RHODIUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("rhodium_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> RHODIUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("rhodium_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_PALLADIUM =
            AtomiCreate.REGISTRATE
                    .item("raw_palladium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_PALLADIUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_palladium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> PALLADIUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("palladium_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> PALLADIUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("palladium_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> PALLADIUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("palladium_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_SILVER =
            AtomiCreate.REGISTRATE
                    .item("raw_silver", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_SILVER =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_silver", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> SILVER_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("silver_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> SILVER_INGOT =
            AtomiCreate.REGISTRATE
                    .item("silver_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> SILVER_SHEET =
            AtomiCreate.REGISTRATE
                    .item("silver_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_CADMIUM =
            AtomiCreate.REGISTRATE
                    .item("raw_cadmium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_CADMIUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_cadmium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> CADMIUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("cadmium_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> CADMIUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("cadmium_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> CADMIUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("cadmium_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_INDIUM =
            AtomiCreate.REGISTRATE
                    .item("raw_indium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_INDIUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_indium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> INDIUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("indium_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> INDIUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("indium_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> INDIUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("indium_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_TIN =
            AtomiCreate.REGISTRATE
                    .item("raw_tin", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_TIN =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_tin", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> TIN_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("tin_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> TIN_INGOT =
            AtomiCreate.REGISTRATE
                    .item("tin_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> TIN_SHEET =
            AtomiCreate.REGISTRATE
                    .item("tin_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_ANTIMONY =
            AtomiCreate.REGISTRATE
                    .item("raw_antimony", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_ANTIMONY =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_antimony", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> ANTIMONY_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("antimony_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> ANTIMONY_INGOT =
            AtomiCreate.REGISTRATE
                    .item("antimony_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> ANTIMONY_SHEET =
            AtomiCreate.REGISTRATE
                    .item("antimony_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_TELLURIUM =
            AtomiCreate.REGISTRATE
                    .item("raw_tellurium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_TELLURIUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_tellurium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> TELLURIUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("tellurium_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> TELLURIUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("tellurium_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> TELLURIUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("tellurium_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_IODINE =
            AtomiCreate.REGISTRATE
                    .item("raw_iodine", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_IODINE =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_iodine", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> IODINE_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("iodine_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> IODINE_INGOT =
            AtomiCreate.REGISTRATE
                    .item("iodine_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> IODINE_SHEET =
            AtomiCreate.REGISTRATE
                    .item("iodine_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_CESIUM =
            AtomiCreate.REGISTRATE
                    .item("raw_cesium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_CESIUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_cesium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> CESIUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("cesium_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> CESIUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("cesium_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> CESIUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("cesium_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_BARIUM =
            AtomiCreate.REGISTRATE
                    .item("raw_barium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_BARIUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_barium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> BARIUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("barium_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> BARIUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("barium_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> BARIUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("barium_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_LANTHANUM =
            AtomiCreate.REGISTRATE
                    .item("raw_lanthanum", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_LANTHANUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_lanthanum", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> LANTHANUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("lanthanum_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> LANTHANUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("lanthanum_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> LANTHANUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("lanthanum_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_CERIUM =
            AtomiCreate.REGISTRATE
                    .item("raw_cerium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_CERIUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_cerium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> CERIUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("cerium_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> CERIUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("cerium_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> CERIUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("cerium_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_PRASEODYMIUM =
            AtomiCreate.REGISTRATE
                    .item("raw_praseodymium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_PRASEODYMIUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_praseodymium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> PRASEODYMIUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("praseodymium_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> PRASEODYMIUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("praseodymium_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> PRASEODYMIUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("praseodymium_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_NEODYMIUM =
            AtomiCreate.REGISTRATE
                    .item("raw_neodymium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_NEODYMIUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_neodymium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> NEODYMIUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("neodymium_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> NEODYMIUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("neodymium_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> NEODYMIUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("neodymium_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_PROMETHIUM =
            AtomiCreate.REGISTRATE
                    .item("raw_promethium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_PROMETHIUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_promethium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> PROMETHIUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("promethium_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> PROMETHIUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("promethium_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> PROMETHIUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("promethium_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_SAMARIUM =
            AtomiCreate.REGISTRATE
                    .item("raw_samarium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_SAMARIUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_samarium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> SAMARIUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("samarium_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> SAMARIUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("samarium_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> SAMARIUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("samarium_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_EUROPIUM =
            AtomiCreate.REGISTRATE
                    .item("raw_europium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_EUROPIUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_europium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> EUROPIUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("europium_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> EUROPIUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("europium_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> EUROPIUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("europium_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_GADOLINIUM =
            AtomiCreate.REGISTRATE
                    .item("raw_gadolinium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_GADOLINIUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_gadolinium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> GADOLINIUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("gadolinium_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> GADOLINIUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("gadolinium_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> GADOLINIUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("gadolinium_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_TERBIUM =
            AtomiCreate.REGISTRATE
                    .item("raw_terbium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_TERBIUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_terbium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> TERBIUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("terbium_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> TERBIUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("terbium_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> TERBIUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("terbium_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_DYSPROSIUM =
            AtomiCreate.REGISTRATE
                    .item("raw_dysprosium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_DYSPROSIUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_dysprosium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> DYSPROSIUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("dysprosium_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> DYSPROSIUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("dysprosium_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> DYSPROSIUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("dysprosium_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_HOLMIUM =
            AtomiCreate.REGISTRATE
                    .item("raw_holmium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_HOLMIUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_holmium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> HOLMIUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("holmium_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> HOLMIUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("holmium_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> HOLMIUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("holmium_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_ERBIUM =
            AtomiCreate.REGISTRATE
                    .item("raw_erbium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_ERBIUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_erbium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> ERBIUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("erbium_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> ERBIUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("erbium_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> ERBIUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("erbium_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_THULIUM =
            AtomiCreate.REGISTRATE
                    .item("raw_thulium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_THULIUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_thulium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> THULIUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("thulium_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> THULIUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("thulium_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> THULIUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("thulium_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_YTTERBIUM =
            AtomiCreate.REGISTRATE
                    .item("raw_ytterbium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_YTTERBIUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_ytterbium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> YTTERBIUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("ytterbium_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> YTTERBIUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("ytterbium_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> YTTERBIUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("ytterbium_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_LUTETIUM =
            AtomiCreate.REGISTRATE
                    .item("raw_lutetium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_LUTETIUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_lutetium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> LUTETIUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("lutetium_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> LUTETIUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("lutetium_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> LUTETIUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("lutetium_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_HAFNIUM =
            AtomiCreate.REGISTRATE
                    .item("raw_hafnium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_HAFNIUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_hafnium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> HAFNIUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("hafnium_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> HAFNIUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("hafnium_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> HAFNIUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("hafnium_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_TANTALUM =
            AtomiCreate.REGISTRATE
                    .item("raw_tantalum", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_TANTALUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_tantalum", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> TANTALUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("tantalum_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> TANTALUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("tantalum_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> TANTALUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("tantalum_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_TUNGSTEN =
            AtomiCreate.REGISTRATE
                    .item("raw_tungsten", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_TUNGSTEN =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_tungsten", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> TUNGSTEN_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("tungsten_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> TUNGSTEN_INGOT =
            AtomiCreate.REGISTRATE
                    .item("tungsten_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> TUNGSTEN_SHEET =
            AtomiCreate.REGISTRATE
                    .item("tungsten_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_RHENIUM =
            AtomiCreate.REGISTRATE
                    .item("raw_rhenium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_RHENIUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_rhenium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> RHENIUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("rhenium_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> RHENIUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("rhenium_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> RHENIUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("rhenium_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_OSMIUM =
            AtomiCreate.REGISTRATE
                    .item("raw_osmium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_OSMIUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_osmium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> OSMIUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("osmium_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> OSMIUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("osmium_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> OSMIUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("osmium_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_IRIDIUM =
            AtomiCreate.REGISTRATE
                    .item("raw_iridium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_IRIDIUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_iridium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> IRIDIUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("iridium_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> IRIDIUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("iridium_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> IRIDIUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("iridium_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_PLATINUM =
            AtomiCreate.REGISTRATE
                    .item("raw_platinum", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_PLATINUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_platinum", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> PLATINUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("platinum_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> PLATINUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("platinum_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> PLATINUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("platinum_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_MERCURY =
            AtomiCreate.REGISTRATE
                    .item("raw_mercury", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_MERCURY =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_mercury", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> MERCURY_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("mercury_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> MERCURY_INGOT =
            AtomiCreate.REGISTRATE
                    .item("mercury_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> MERCURY_SHEET =
            AtomiCreate.REGISTRATE
                    .item("mercury_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_THALLIUM =
            AtomiCreate.REGISTRATE
                    .item("raw_thallium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_THALLIUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_thallium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> THALLIUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("thallium_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> THALLIUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("thallium_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> THALLIUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("thallium_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_LEAD =
            AtomiCreate.REGISTRATE
                    .item("raw_lead", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_LEAD =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_lead", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> LEAD_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("lead_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> LEAD_INGOT =
            AtomiCreate.REGISTRATE
                    .item("lead_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> LEAD_SHEET =
            AtomiCreate.REGISTRATE
                    .item("lead_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_BISMUTH =
            AtomiCreate.REGISTRATE
                    .item("raw_bismuth", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_BISMUTH =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_bismuth", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> BISMUTH_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("bismuth_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> BISMUTH_INGOT =
            AtomiCreate.REGISTRATE
                    .item("bismuth_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> BISMUTH_SHEET =
            AtomiCreate.REGISTRATE
                    .item("bismuth_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_POLONIUM =
            AtomiCreate.REGISTRATE
                    .item("raw_polonium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_POLONIUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_polonium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> POLONIUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("polonium_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> POLONIUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("polonium_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> POLONIUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("polonium_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_ASTATINE =
            AtomiCreate.REGISTRATE
                    .item("raw_astatine", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_ASTATINE =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_astatine", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> ASTATINE_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("astatine_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> ASTATINE_INGOT =
            AtomiCreate.REGISTRATE
                    .item("astatine_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> ASTATINE_SHEET =
            AtomiCreate.REGISTRATE
                    .item("astatine_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_FRANCIUM =
            AtomiCreate.REGISTRATE
                    .item("raw_francium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_FRANCIUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_francium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> FRANCIUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("francium_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> FRANCIUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("francium_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> FRANCIUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("francium_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_RADIUM =
            AtomiCreate.REGISTRATE
                    .item("raw_radium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_RADIUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_radium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> RADIUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("radium_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> RADIUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("radium_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> RADIUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("radium_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_ACTINIUM =
            AtomiCreate.REGISTRATE
                    .item("raw_actinium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_ACTINIUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_actinium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> ACTINIUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("actinium_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> ACTINIUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("actinium_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> ACTINIUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("actinium_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_THORIUM =
            AtomiCreate.REGISTRATE
                    .item("raw_thorium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_THORIUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_thorium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> THORIUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("thorium_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> THORIUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("thorium_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> THORIUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("thorium_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_PROTACTINIUM =
            AtomiCreate.REGISTRATE
                    .item("raw_protactinium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_PROTACTINIUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_protactinium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> PROTACTINIUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("protactinium_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> PROTACTINIUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("protactinium_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> PROTACTINIUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("protactinium_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_URANIUM =
            AtomiCreate.REGISTRATE
                    .item("raw_uranium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_URANIUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_uranium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> URANIUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("uranium_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> URANIUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("uranium_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> URANIUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("uranium_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_NEPTUNIUM =
            AtomiCreate.REGISTRATE
                    .item("raw_neptunium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_NEPTUNIUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_neptunium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> NEPTUNIUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("neptunium_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> NEPTUNIUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("neptunium_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> NEPTUNIUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("neptunium_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_PLUTONIUM =
            AtomiCreate.REGISTRATE
                    .item("raw_plutonium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_PLUTONIUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_plutonium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> PLUTONIUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("plutonium_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> PLUTONIUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("plutonium_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> PLUTONIUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("plutonium_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();



    public static final ItemEntry<Item> RAW_UNUNMINECRAFTIUM =
            AtomiCreate.REGISTRATE
                    .item("raw_ununminecraftium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/raw_iron")))
                    .register();

    public static final ItemEntry<Item> CRUSHED_RAW_UNUNMINECRAFTIUM =
            AtomiCreate.REGISTRATE
                    .item("crushed_raw_ununminecraftium", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/crushed_raw_iron")))
                    .register();

    public static final ItemEntry<Item> UNUNMINECRAFTIUM_NUGGET =
            AtomiCreate.REGISTRATE
                    .item("ununminecraftium_nugget", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_nugget")))
                    .register();

    public static final ItemEntry<Item> UNUNMINECRAFTIUM_INGOT =
            AtomiCreate.REGISTRATE
                    .item("ununminecraftium_ingot", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_ingot")))
                    .register();

    public static final ItemEntry<Item> UNUNMINECRAFTIUM_SHEET =
            AtomiCreate.REGISTRATE
                    .item("ununminecraftium_sheet", Item::new)
                    .model((ctx, prov) ->
                            prov.generated(ctx, AtomiCreate.asResource("item/iron_sheet")))
                    .register();


    public static void register() {
        AtomiCreate.LOGGER.info("Register Atomic Items");
    }
}