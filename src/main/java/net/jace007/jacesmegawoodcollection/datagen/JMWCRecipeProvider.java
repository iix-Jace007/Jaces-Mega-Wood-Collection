package net.jace007.jacesmegawoodcollection.datagen;

import net.jace007.jacesmegawoodcollection.block.JMWCBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class JMWCRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public JMWCRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, JMWCBlocks.AGRABAH_CEDAR_PLANKS.get(),4)
                .requires(JMWCBlocks.AGRABAH_CEDAR_LOG)
                .unlockedBy("has_agrabah_cedar_log", has(JMWCBlocks.AGRABAH_CEDAR_LOG)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, JMWCBlocks.ALLMEN_OAK_PLANKS.get(),4)
                .requires(JMWCBlocks.ALLMEN_OAK_LOG)
                .unlockedBy("has_allmen_oak_log", has(JMWCBlocks.ALLMEN_OAK_LOG)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, JMWCBlocks.AUDRAFLORA_OAK_PLANKS.get(),4)
                .requires(JMWCBlocks.AUDRAFLORA_OAK_LOG)
                .unlockedBy("has_audraflora_oak_log", has(JMWCBlocks.AUDRAFLORA_OAK_LOG)).save(recipeOutput);

        stairBuilder(JMWCBlocks.AGRABAH_CEDAR_STAIRS.get(), Ingredient.of(JMWCBlocks.AGRABAH_CEDAR_PLANKS)).group("agrabah_cedar")
                .unlockedBy("has_agrabah_cedar_planks", has(JMWCBlocks.AGRABAH_CEDAR_PLANKS)).save(recipeOutput);
        stairBuilder(JMWCBlocks.AGRABAH_CEDAR_LOG_STAIRS.get(), Ingredient.of(JMWCBlocks.AGRABAH_CEDAR_LOG)).group("agrabah_cedar")
                .unlockedBy("has_agrabah_cedar_log", has(JMWCBlocks.AGRABAH_CEDAR_LOG)).save(recipeOutput);
        stairBuilder(JMWCBlocks.STRIPPED_AGRABAH_CEDAR_LOG_STAIRS.get(), Ingredient.of(JMWCBlocks.STRIPPED_AGRABAH_CEDAR_LOG)).group("agrabah_cedar")
                .unlockedBy("has_stripped_agrabah_cedar_log", has(JMWCBlocks.STRIPPED_AGRABAH_CEDAR_LOG)).save(recipeOutput);
        stairBuilder(JMWCBlocks.ALLMEN_OAK_STAIRS.get(), Ingredient.of(JMWCBlocks.ALLMEN_OAK_PLANKS)).group("allmen_oak")
                .unlockedBy("has_allmen_oak_planks", has(JMWCBlocks.ALLMEN_OAK_PLANKS)).save(recipeOutput);
        stairBuilder(JMWCBlocks.ALLMEN_OAK_LOG_STAIRS.get(), Ingredient.of(JMWCBlocks.ALLMEN_OAK_LOG)).group("allmen_oak")
                .unlockedBy("has_allmen_oak_log", has(JMWCBlocks.ALLMEN_OAK_LOG)).save(recipeOutput);
        stairBuilder(JMWCBlocks.STRIPPED_ALLMEN_OAK_LOG_STAIRS.get(), Ingredient.of(JMWCBlocks.STRIPPED_ALLMEN_OAK_LOG)).group("allmen_oak")
                .unlockedBy("has_stripped_allmen_oak_log", has(JMWCBlocks.STRIPPED_ALLMEN_OAK_LOG)).save(recipeOutput);

        stairBuilder(JMWCBlocks.AUDRAFLORA_OAK_STAIRS.get(), Ingredient.of(JMWCBlocks.AUDRAFLORA_OAK_PLANKS)).group("audraflora_oak")
                .unlockedBy("has_audraflora_oak_planks", has(JMWCBlocks.AUDRAFLORA_OAK_PLANKS)).save(recipeOutput);
        stairBuilder(JMWCBlocks.AUDRAFLORA_OAK_LOG_STAIRS.get(), Ingredient.of(JMWCBlocks.AUDRAFLORA_OAK_LOG)).group("audraflora_oak")
                .unlockedBy("has_audraflora_oak_log", has(JMWCBlocks.AUDRAFLORA_OAK_LOG)).save(recipeOutput);
        stairBuilder(JMWCBlocks.STRIPPED_AUDRAFLORA_OAK_LOG_STAIRS.get(), Ingredient.of(JMWCBlocks.STRIPPED_AUDRAFLORA_OAK_LOG)).group("audraflora_oak")
                .unlockedBy("has_stripped_audraflora_oak_log", has(JMWCBlocks.STRIPPED_AUDRAFLORA_OAK_LOG)).save(recipeOutput);

        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, JMWCBlocks.AGRABAH_CEDAR_SLAB.get(), JMWCBlocks.AGRABAH_CEDAR_PLANKS);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, JMWCBlocks.AGRABAH_CEDAR_LOG_SLAB.get(), JMWCBlocks.AGRABAH_CEDAR_LOG);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, JMWCBlocks.STRIPPED_AGRABAH_CEDAR_LOG_SLAB.get(), JMWCBlocks.STRIPPED_AGRABAH_CEDAR_WOOD);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, JMWCBlocks.ALLMEN_OAK_SLAB.get(), JMWCBlocks.ALLMEN_OAK_PLANKS);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, JMWCBlocks.ALLMEN_OAK_LOG_SLAB.get(), JMWCBlocks.ALLMEN_OAK_LOG);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, JMWCBlocks.STRIPPED_ALLMEN_OAK_LOG_SLAB.get(), JMWCBlocks.STRIPPED_ALLMEN_OAK_WOOD);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, JMWCBlocks.AUDRAFLORA_OAK_SLAB.get(), JMWCBlocks.AUDRAFLORA_OAK_PLANKS);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, JMWCBlocks.AUDRAFLORA_OAK_LOG_SLAB.get(), JMWCBlocks.AUDRAFLORA_OAK_LOG);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, JMWCBlocks.STRIPPED_AUDRAFLORA_OAK_LOG_SLAB.get(), JMWCBlocks.STRIPPED_AUDRAFLORA_OAK_WOOD);

        fenceBuilder(JMWCBlocks.AGRABAH_CEDAR_FENCE.get(), Ingredient.of(JMWCBlocks.AGRABAH_CEDAR_PLANKS.get())).group("agrabah_cedar")
                .unlockedBy("has_agrabah_cedar_planks", has(JMWCBlocks.AGRABAH_CEDAR_PLANKS)).save(recipeOutput);
        fenceBuilder(JMWCBlocks.AGRABAH_CEDAR_LOG_FENCE.get(), Ingredient.of(JMWCBlocks.AGRABAH_CEDAR_LOG.get())).group("agrabah_cedar")
                .unlockedBy("has_agrabah_cedar_log", has(JMWCBlocks.AGRABAH_CEDAR_LOG)).save(recipeOutput);
        fenceBuilder(JMWCBlocks.ALLMEN_OAK_FENCE.get(), Ingredient.of(JMWCBlocks.ALLMEN_OAK_PLANKS.get())).group("allmen_oak")
                .unlockedBy("has_allmen_oak_planks", has(JMWCBlocks.ALLMEN_OAK_PLANKS)).save(recipeOutput);
        fenceBuilder(JMWCBlocks.ALLMEN_OAK_LOG_FENCE.get(), Ingredient.of(JMWCBlocks.ALLMEN_OAK_LOG.get())).group("allmen_oak")
                .unlockedBy("has_allmen_oak_log", has(JMWCBlocks.ALLMEN_OAK_LOG)).save(recipeOutput);
        fenceBuilder(JMWCBlocks.AUDRAFLORA_OAK_FENCE.get(), Ingredient.of(JMWCBlocks.AUDRAFLORA_OAK_PLANKS.get())).group("audraflora_oak")
                .unlockedBy("has_audraflora_oak_planks", has(JMWCBlocks.AUDRAFLORA_OAK_PLANKS)).save(recipeOutput);
        fenceBuilder(JMWCBlocks.AUDRAFLORA_OAK_LOG_FENCE.get(), Ingredient.of(JMWCBlocks.AUDRAFLORA_OAK_LOG.get())).group("audraflora_oak")
                .unlockedBy("has_audraflora_oak_log", has(JMWCBlocks.AUDRAFLORA_OAK_LOG)).save(recipeOutput);

        fenceGateBuilder(JMWCBlocks.AGRABAH_CEDAR_FENCE_GATE.get(), Ingredient.of(JMWCBlocks.AGRABAH_CEDAR_PLANKS.get())).group("agrabah_cedar")
                .unlockedBy("has_agrabah_cedar_planks", has(JMWCBlocks.AGRABAH_CEDAR_PLANKS)).save(recipeOutput);
        fenceGateBuilder(JMWCBlocks.AGRABAH_CEDAR_LOG_FENCE_GATE.get(), Ingredient.of(JMWCBlocks.AGRABAH_CEDAR_LOG.get())).group("agrabah_cedar")
                .unlockedBy("has_agrabah_cedar_log", has(JMWCBlocks.AGRABAH_CEDAR_LOG)).save(recipeOutput);
        fenceGateBuilder(JMWCBlocks.ALLMEN_OAK_FENCE_GATE.get(), Ingredient.of(JMWCBlocks.ALLMEN_OAK_PLANKS.get())).group("allmen_oak")
                .unlockedBy("has_allmen_oak_planks", has(JMWCBlocks.ALLMEN_OAK_PLANKS)).save(recipeOutput);
        fenceGateBuilder(JMWCBlocks.ALLMEN_OAK_LOG_FENCE_GATE.get(), Ingredient.of(JMWCBlocks.ALLMEN_OAK_LOG.get())).group("allmen_oak")
                .unlockedBy("has_allmen_oak_log", has(JMWCBlocks.ALLMEN_OAK_LOG)).save(recipeOutput);
        fenceGateBuilder(JMWCBlocks.AUDRAFLORA_OAK_FENCE_GATE.get(), Ingredient.of(JMWCBlocks.AUDRAFLORA_OAK_PLANKS.get())).group("audraflora_oak")
                .unlockedBy("has_audraflora_oak_planks", has(JMWCBlocks.AUDRAFLORA_OAK_PLANKS)).save(recipeOutput);
        fenceGateBuilder(JMWCBlocks.AUDRAFLORA_OAK_LOG_FENCE_GATE.get(), Ingredient.of(JMWCBlocks.AUDRAFLORA_OAK_LOG.get())).group("audraflora_oak")
                .unlockedBy("has_audraflora_oak_log", has(JMWCBlocks.AUDRAFLORA_OAK_LOG)).save(recipeOutput);

        doorBuilder(JMWCBlocks.AGRABAH_CEDAR_DOOR.get(), Ingredient.of(JMWCBlocks.AGRABAH_CEDAR_PLANKS.get())).group("agrabah_cedar")
                .unlockedBy("has_agrabah_cedar_planks", has(JMWCBlocks.AGRABAH_CEDAR_PLANKS)).save(recipeOutput);
        doorBuilder(JMWCBlocks.ALLMEN_OAK_DOOR.get(), Ingredient.of(JMWCBlocks.ALLMEN_OAK_PLANKS.get())).group("allmen_oak")
                .unlockedBy("has_allmen_oak_planks", has(JMWCBlocks.ALLMEN_OAK_PLANKS)).save(recipeOutput);
        doorBuilder(JMWCBlocks.AUDRAFLORA_OAK_DOOR.get(), Ingredient.of(JMWCBlocks.AUDRAFLORA_OAK_PLANKS.get())).group("audraflora_oak")
                .unlockedBy("has_audraflora_oak_planks", has(JMWCBlocks.AUDRAFLORA_OAK_PLANKS)).save(recipeOutput);

        trapdoorBuilder(JMWCBlocks.AGRABAH_CEDAR_TRAPDOOR.get(), Ingredient.of(JMWCBlocks.AGRABAH_CEDAR_PLANKS.get())).group("agrabah_cedar")
                .unlockedBy("has_agrabah_cedar_planks", has(JMWCBlocks.AGRABAH_CEDAR_PLANKS)).save(recipeOutput);
        trapdoorBuilder(JMWCBlocks.AGRABAH_CEDAR_LOG_TRAPDOOR.get(), Ingredient.of(JMWCBlocks.AGRABAH_CEDAR_LOG.get())).group("agrabah_cedar")
                .unlockedBy("has_agrabah_cedar_log", has(JMWCBlocks.AGRABAH_CEDAR_LOG)).save(recipeOutput);
        trapdoorBuilder(JMWCBlocks.ALLMEN_OAK_TRAPDOOR.get(), Ingredient.of(JMWCBlocks.ALLMEN_OAK_PLANKS.get())).group("allmen_oak")
                .unlockedBy("has_allmen_oak_planks", has(JMWCBlocks.ALLMEN_OAK_PLANKS)).save(recipeOutput);
        trapdoorBuilder(JMWCBlocks.ALLMEN_OAK_LOG_TRAPDOOR.get(), Ingredient.of(JMWCBlocks.ALLMEN_OAK_LOG.get())).group("allmen_oak")
                .unlockedBy("has_allmen_oak_log", has(JMWCBlocks.ALLMEN_OAK_LOG)).save(recipeOutput);
        trapdoorBuilder(JMWCBlocks.AUDRAFLORA_OAK_TRAPDOOR.get(), Ingredient.of(JMWCBlocks.AUDRAFLORA_OAK_PLANKS.get())).group("audraflora_oak")
                .unlockedBy("has_allmen_oak_planks", has(JMWCBlocks.AUDRAFLORA_OAK_PLANKS)).save(recipeOutput);
        trapdoorBuilder(JMWCBlocks.AUDRAFLORA_OAK_LOG_TRAPDOOR.get(), Ingredient.of(JMWCBlocks.AUDRAFLORA_OAK_LOG.get())).group("audraflora_oak")
                .unlockedBy("has_allmen_oak_log", has(JMWCBlocks.AUDRAFLORA_OAK_LOG)).save(recipeOutput);

        pressurePlate(recipeOutput, JMWCBlocks.AGRABAH_CEDAR_PRESSUREPLATE.get(), JMWCBlocks.AGRABAH_CEDAR_PLANKS.get());
        pressurePlate(recipeOutput, JMWCBlocks.ALLMEN_OAK_PRESSUREPLATE.get(), JMWCBlocks.ALLMEN_OAK_PLANKS.get());
        pressurePlate(recipeOutput, JMWCBlocks.AUDRAFLORA_OAK_PRESSUREPLATE.get(), JMWCBlocks.AUDRAFLORA_OAK_PLANKS.get());

        buttonBuilder(JMWCBlocks.AGRABAH_CEDAR_BUTTON.get(), Ingredient.of(JMWCBlocks.AGRABAH_CEDAR_PLANKS.get())).group("agrabah_cedar")
                .unlockedBy("has_agrabah_cedar_planks", has(JMWCBlocks.AGRABAH_CEDAR_PLANKS)).save(recipeOutput);
        buttonBuilder(JMWCBlocks.ALLMEN_OAK_BUTTON.get(), Ingredient.of(JMWCBlocks.ALLMEN_OAK_PLANKS.get())).group("allmen_oak")
                .unlockedBy("has_allmen_oak_planks", has(JMWCBlocks.ALLMEN_OAK_PLANKS)).save(recipeOutput);
        buttonBuilder(JMWCBlocks.AUDRAFLORA_OAK_BUTTON.get(), Ingredient.of(JMWCBlocks.AUDRAFLORA_OAK_PLANKS.get())).group("audraflora_oak")
                .unlockedBy("has_audraflora_oak_planks", has(JMWCBlocks.AUDRAFLORA_OAK_PLANKS)).save(recipeOutput);

    }
}