package net.jace007.jacesmegawoodcollection.datagen;

import net.jace007.jacesmegawoodcollection.JacesMegaWoodCollection;
import net.jace007.jacesmegawoodcollection.block.JMWCBlocks;
import net.jace007.jacesmegawoodcollection.item.JMWCItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.ShapedRecipe;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class JMWCRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public JMWCRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, JMWCBlocks.AGRABAH_CEDER_PLANKS.get(),4)
                .requires(JMWCBlocks.AGRABAH_CEDER_LOG)
                .unlockedBy("has_agrabah_ceder_log", has(JMWCBlocks.AGRABAH_CEDER_LOG)).save(recipeOutput);

        stairBuilder(JMWCBlocks.AGRABAH_CEDER_STAIRS.get(), Ingredient.of(JMWCBlocks.AGRABAH_CEDER_PLANKS)).group("agrabah_ceder")
                .unlockedBy("has_agrabah_ceder_planks", has(JMWCBlocks.AGRABAH_CEDER_PLANKS)).save(recipeOutput);
        stairBuilder(JMWCBlocks.AGRABAH_CEDER_LOG_STAIRS.get(), Ingredient.of(JMWCBlocks.AGRABAH_CEDER_LOG)).group("agrabah_ceder")
                .unlockedBy("has_agrabah_ceder_log", has(JMWCBlocks.AGRABAH_CEDER_LOG)).save(recipeOutput);
        stairBuilder(JMWCBlocks.STRIPPED_AGRABAH_CEDER_LOG_STAIRS.get(), Ingredient.of(JMWCBlocks.STRIPPED_AGRABAH_CEDER_LOG)).group("agrabah_ceder")
                .unlockedBy("has_stripped_agrabah_ceder_log", has(JMWCBlocks.STRIPPED_AGRABAH_CEDER_LOG)).save(recipeOutput);

        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, JMWCBlocks.AGRABAH_CEDER_SLAB.get(), JMWCBlocks.AGRABAH_CEDER_PLANKS);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, JMWCBlocks.AGRABAH_CEDER_LOG_SLAB.get(), JMWCBlocks.AGRABAH_CEDER_LOG);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, JMWCBlocks.STRIPPED_AGRABAH_CEDER_LOG_SLAB.get(), JMWCBlocks.STRIPPED_AGRABAH_CEDER_WOOD);

        fenceBuilder(JMWCBlocks.AGRABAH_CEDER_FENCE.get(), Ingredient.of(JMWCBlocks.AGRABAH_CEDER_PLANKS.get())).group("agrabah_ceder")
                .unlockedBy("has_agrabah_ceder_planks", has(JMWCBlocks.AGRABAH_CEDER_PLANKS)).save(recipeOutput);
        fenceBuilder(JMWCBlocks.AGRABAH_CEDER_LOG_FENCE.get(), Ingredient.of(JMWCBlocks.AGRABAH_CEDER_LOG.get())).group("agrabah_ceder")
                .unlockedBy("has_agrabah_ceder_log", has(JMWCBlocks.AGRABAH_CEDER_LOG)).save(recipeOutput);

        fenceGateBuilder(JMWCBlocks.AGRABAH_CEDER_FENCE_GATE.get(), Ingredient.of(JMWCBlocks.AGRABAH_CEDER_PLANKS.get())).group("agrabah_ceder")
                .unlockedBy("has_agrabah_ceder_planks", has(JMWCBlocks.AGRABAH_CEDER_PLANKS)).save(recipeOutput);
        fenceGateBuilder(JMWCBlocks.AGRABAH_CEDER_LOG_FENCE_GATE.get(), Ingredient.of(JMWCBlocks.AGRABAH_CEDER_LOG.get())).group("agrabah_ceder")
                .unlockedBy("has_agrabah_ceder_log", has(JMWCBlocks.AGRABAH_CEDER_LOG)).save(recipeOutput);

        doorBuilder(JMWCBlocks.AGRABAH_CEDER_DOOR.get(), Ingredient.of(JMWCBlocks.AGRABAH_CEDER_PLANKS.get())).group("agrabah_ceder")
                .unlockedBy("has_agrabah_ceder_planks", has(JMWCBlocks.AGRABAH_CEDER_PLANKS)).save(recipeOutput);

        trapdoorBuilder(JMWCBlocks.AGRABAH_CEDER_TRAPDOOR.get(), Ingredient.of(JMWCBlocks.AGRABAH_CEDER_PLANKS.get())).group("agrabah_ceder")
                .unlockedBy("has_agrabah_ceder_planks", has(JMWCBlocks.AGRABAH_CEDER_PLANKS)).save(recipeOutput);
        trapdoorBuilder(JMWCBlocks.AGRABAH_CEDER_LOG_TRAPDOOR.get(), Ingredient.of(JMWCBlocks.AGRABAH_CEDER_LOG.get())).group("agrabah_ceder")
                .unlockedBy("has_agrabah_ceder_log", has(JMWCBlocks.AGRABAH_CEDER_LOG)).save(recipeOutput);

        pressurePlate(recipeOutput, JMWCBlocks.AGRABAH_CEDER_SLAB.get(), JMWCBlocks.AGRABAH_CEDER_PLANKS);

        buttonBuilder(JMWCBlocks.AGRABAH_CEDER_BUTTON.get(), Ingredient.of(JMWCBlocks.AGRABAH_CEDER_PLANKS.get())).group("agrabah_ceder")
                .unlockedBy("has_agrabah_ceder_planks", has(JMWCBlocks.AGRABAH_CEDER_PLANKS)).save(recipeOutput);

    }
}