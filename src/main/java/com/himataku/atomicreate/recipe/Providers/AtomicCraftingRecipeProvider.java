package com.himataku.atomicreate.recipe.Providers;

import com.himataku.atomicreate.AtomiCreate;
import com.himataku.atomicreate.register.AtomicItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.concurrent.CompletableFuture;

public class AtomicCraftingRecipeProvider extends RecipeProvider {
//
//    public AtomicCraftingRecipeProvider(
//            PackOutput output,
//            CompletableFuture<HolderLookup.Provider> registries
//    ) {
//        super(output, registries);
//    }
//
//    @Override
//    protected void buildRecipes(RecipeOutput output) {
//
//        for (var entry : AtomicItems.METAL_ITEMS.entrySet()) {
//
//            String name = entry.getKey();
//            AtomicItems.MetalItems set = entry.getValue();
//
//            var raw = set.raw();
//            var crushed = set.crushed();
//            var nugget = set.nugget();
//            var ingot = set.ingot();
//
//            // RAW → INGOT
//            SimpleCookingRecipeBuilder.smelting(
//                            Ingredient.of(raw.get()),
//                            RecipeCategory.MISC,
//                            ingot.get(),
//                            0.7f,
//                            200
//                    )
//                    .unlockedBy("has_raw", has(raw.get()))
//                    .save(output,
//                            ResourceLocation.fromNamespaceAndPath(
//                                    AtomiCreate.ID,
//                                    name + "_ingot_from_raw"));
//
//            SimpleCookingRecipeBuilder.blasting(
//                            Ingredient.of(raw.get()),
//                            RecipeCategory.MISC,
//                            ingot.get(),
//                            0.7f,
//                            100
//                    )
//                    .unlockedBy("has_raw", has(raw.get()))
//                    .save(output,
//                            ResourceLocation.fromNamespaceAndPath(
//                                    AtomiCreate.ID,
//                                    name + "_ingot_from_raw_blasting"));
//
//            // CRUSHED → INGOT
//            SimpleCookingRecipeBuilder.smelting(
//                            Ingredient.of(crushed.get()),
//                            RecipeCategory.MISC,
//                            ingot.get(),
//                            0.7f,
//                            200
//                    )
//                    .unlockedBy("has_crushed", has(crushed.get()))
//                    .save(output,
//                            ResourceLocation.fromNamespaceAndPath(
//                                    AtomiCreate.ID,
//                                    name + "_ingot_from_crushed"));
//
//            SimpleCookingRecipeBuilder.blasting(
//                            Ingredient.of(crushed.get()),
//                            RecipeCategory.MISC,
//                            ingot.get(),
//                            0.7f,
//                            100
//                    )
//                    .unlockedBy("has_crushed", has(crushed.get()))
//                    .save(output,
//                            ResourceLocation.fromNamespaceAndPath(
//                                    AtomiCreate.ID,
//                                    name + "_ingot_from_crushed_blasting"));
//
//            // INGOT → 9 NUGGETS
//            ShapelessRecipeBuilder.shapeless(
//                            RecipeCategory.MISC,
//                            nugget.get(),
//                            9
//                    )
//                    .requires(ingot.get())
//                    .unlockedBy("has_ingot", has(ingot.get()))
//                    .save(output,
//                            ResourceLocation.fromNamespaceAndPath(
//                                    AtomiCreate.ID,
//                                    name + "_ingot_to_nuggets"));
//
//            // 9 NUGGETS → INGOT
//            ShapedRecipeBuilder.shaped(
//                            RecipeCategory.MISC,
//                            ingot.get()
//                    )
//                    .pattern("NNN")
//                    .pattern("NNN")
//                    .pattern("NNN")
//                    .define('N', nugget.get())
//                    .unlockedBy("has_nugget", has(nugget.get()))
//                    .save(output,
//                            ResourceLocation.fromNamespaceAndPath(
//                                    AtomiCreate.ID,
//                                    name + "_nuggets_to_ingot"));
//        }
//    }
}