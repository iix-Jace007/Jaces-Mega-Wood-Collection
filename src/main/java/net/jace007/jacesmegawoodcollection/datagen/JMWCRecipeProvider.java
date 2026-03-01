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

        // AGRABAH CEDAR
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, JMWCBlocks.AGRABAH_CEDAR_PLANKS.get(),4)
                .requires(JMWCBlocks.AGRABAH_CEDAR_LOG)
                .unlockedBy("has_agrabah_cedar_log", has(JMWCBlocks.AGRABAH_CEDAR_LOG)).save(recipeOutput);
        stairBuilder(JMWCBlocks.AGRABAH_CEDAR_STAIRS.get(), Ingredient.of(JMWCBlocks.AGRABAH_CEDAR_PLANKS)).group("agrabah_cedar")
                .unlockedBy("has_agrabah_cedar_planks", has(JMWCBlocks.AGRABAH_CEDAR_PLANKS)).save(recipeOutput);
        stairBuilder(JMWCBlocks.AGRABAH_CEDAR_LOG_STAIRS.get(), Ingredient.of(JMWCBlocks.AGRABAH_CEDAR_LOG)).group("agrabah_cedar")
                .unlockedBy("has_agrabah_cedar_log", has(JMWCBlocks.AGRABAH_CEDAR_LOG)).save(recipeOutput);
        stairBuilder(JMWCBlocks.STRIPPED_AGRABAH_CEDAR_LOG_STAIRS.get(), Ingredient.of(JMWCBlocks.STRIPPED_AGRABAH_CEDAR_LOG)).group("agrabah_cedar")
                .unlockedBy("has_stripped_agrabah_cedar_log", has(JMWCBlocks.STRIPPED_AGRABAH_CEDAR_LOG)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, JMWCBlocks.AGRABAH_CEDAR_SLAB.get(), JMWCBlocks.AGRABAH_CEDAR_PLANKS);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, JMWCBlocks.AGRABAH_CEDAR_LOG_SLAB.get(), JMWCBlocks.AGRABAH_CEDAR_LOG);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, JMWCBlocks.STRIPPED_AGRABAH_CEDAR_LOG_SLAB.get(), JMWCBlocks.STRIPPED_AGRABAH_CEDAR_LOG);
        fenceBuilder(JMWCBlocks.AGRABAH_CEDAR_FENCE.get(), Ingredient.of(JMWCBlocks.AGRABAH_CEDAR_PLANKS.get())).group("agrabah_cedar")
                .unlockedBy("has_agrabah_cedar_planks", has(JMWCBlocks.AGRABAH_CEDAR_PLANKS)).save(recipeOutput);
        fenceBuilder(JMWCBlocks.AGRABAH_CEDAR_LOG_FENCE.get(), Ingredient.of(JMWCBlocks.AGRABAH_CEDAR_LOG.get())).group("agrabah_cedar")
                .unlockedBy("has_agrabah_cedar_log", has(JMWCBlocks.AGRABAH_CEDAR_LOG)).save(recipeOutput);
        fenceGateBuilder(JMWCBlocks.AGRABAH_CEDAR_FENCE_GATE.get(), Ingredient.of(JMWCBlocks.AGRABAH_CEDAR_PLANKS.get())).group("agrabah_cedar")
                .unlockedBy("has_agrabah_cedar_planks", has(JMWCBlocks.AGRABAH_CEDAR_PLANKS)).save(recipeOutput);
        fenceGateBuilder(JMWCBlocks.AGRABAH_CEDAR_LOG_FENCE_GATE.get(), Ingredient.of(JMWCBlocks.AGRABAH_CEDAR_LOG.get())).group("agrabah_cedar")
                .unlockedBy("has_agrabah_cedar_log", has(JMWCBlocks.AGRABAH_CEDAR_LOG)).save(recipeOutput);
        doorBuilder(JMWCBlocks.AGRABAH_CEDAR_DOOR.get(), Ingredient.of(JMWCBlocks.AGRABAH_CEDAR_PLANKS.get())).group("agrabah_cedar")
                .unlockedBy("has_agrabah_cedar_planks", has(JMWCBlocks.AGRABAH_CEDAR_PLANKS)).save(recipeOutput);
        trapdoorBuilder(JMWCBlocks.AGRABAH_CEDAR_TRAPDOOR.get(), Ingredient.of(JMWCBlocks.AGRABAH_CEDAR_PLANKS.get())).group("agrabah_cedar")
                .unlockedBy("has_agrabah_cedar_planks", has(JMWCBlocks.AGRABAH_CEDAR_PLANKS)).save(recipeOutput);
        trapdoorBuilder(JMWCBlocks.AGRABAH_CEDAR_LOG_TRAPDOOR.get(), Ingredient.of(JMWCBlocks.AGRABAH_CEDAR_LOG.get())).group("agrabah_cedar")
                .unlockedBy("has_agrabah_cedar_log", has(JMWCBlocks.AGRABAH_CEDAR_LOG)).save(recipeOutput);
        pressurePlate(recipeOutput, JMWCBlocks.AGRABAH_CEDAR_PRESSUREPLATE.get(), JMWCBlocks.AGRABAH_CEDAR_PLANKS.get());
        buttonBuilder(JMWCBlocks.AGRABAH_CEDAR_BUTTON.get(), Ingredient.of(JMWCBlocks.AGRABAH_CEDAR_PLANKS.get())).group("agrabah_cedar")
                .unlockedBy("has_agrabah_cedar_planks", has(JMWCBlocks.AGRABAH_CEDAR_PLANKS)).save(recipeOutput);

        // Alanth
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, JMWCBlocks.ALANTH_PLANKS.get(),4)
                .requires(JMWCBlocks.ALANTH_LOG)
                .unlockedBy("has_alanth_log", has(JMWCBlocks.ALANTH_LOG)).save(recipeOutput);
        stairBuilder(JMWCBlocks.ALANTH_STAIRS.get(), Ingredient.of(JMWCBlocks.ALANTH_PLANKS)).group("alanth")
                .unlockedBy("has_alanth_planks", has(JMWCBlocks.ALANTH_PLANKS)).save(recipeOutput);
        stairBuilder(JMWCBlocks.ALANTH_LOG_STAIRS.get(), Ingredient.of(JMWCBlocks.ALANTH_LOG)).group("alanth")
                .unlockedBy("has_alanth_log", has(JMWCBlocks.ALANTH_LOG)).save(recipeOutput);
        stairBuilder(JMWCBlocks.STRIPPED_ALANTH_LOG_STAIRS.get(), Ingredient.of(JMWCBlocks.STRIPPED_ALANTH_LOG)).group("alanth")
                .unlockedBy("has_stripped_alanth_log", has(JMWCBlocks.STRIPPED_ALANTH_LOG)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, JMWCBlocks.ALANTH_SLAB.get(), JMWCBlocks.ALANTH_PLANKS);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, JMWCBlocks.ALANTH_LOG_SLAB.get(), JMWCBlocks.ALANTH_LOG);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, JMWCBlocks.STRIPPED_ALANTH_LOG_SLAB.get(), JMWCBlocks.STRIPPED_ALANTH_LOG);
        fenceBuilder(JMWCBlocks.ALANTH_FENCE.get(), Ingredient.of(JMWCBlocks.ALANTH_PLANKS.get())).group("alanth")
                .unlockedBy("has_alanth_planks", has(JMWCBlocks.ALANTH_PLANKS)).save(recipeOutput);
        fenceBuilder(JMWCBlocks.ALANTH_LOG_FENCE.get(), Ingredient.of(JMWCBlocks.ALANTH_LOG.get())).group("alanth")
                .unlockedBy("has_alanth_log", has(JMWCBlocks.ALANTH_LOG)).save(recipeOutput);
        fenceGateBuilder(JMWCBlocks.ALANTH_FENCE_GATE.get(), Ingredient.of(JMWCBlocks.ALANTH_PLANKS.get())).group("alanth")
                .unlockedBy("has_alanth_planks", has(JMWCBlocks.ALANTH_PLANKS)).save(recipeOutput);
        fenceGateBuilder(JMWCBlocks.ALANTH_LOG_FENCE_GATE.get(), Ingredient.of(JMWCBlocks.ALANTH_LOG.get())).group("alanth")
                .unlockedBy("has_alanth_log", has(JMWCBlocks.ALANTH_LOG)).save(recipeOutput);
        doorBuilder(JMWCBlocks.ALANTH_DOOR.get(), Ingredient.of(JMWCBlocks.ALANTH_PLANKS.get())).group("alanth")
                .unlockedBy("has_alanth_planks", has(JMWCBlocks.ALANTH_PLANKS)).save(recipeOutput);
        trapdoorBuilder(JMWCBlocks.ALANTH_TRAPDOOR.get(), Ingredient.of(JMWCBlocks.ALANTH_PLANKS.get())).group("alanth")
                .unlockedBy("has_alanth_planks", has(JMWCBlocks.ALANTH_PLANKS)).save(recipeOutput);
        trapdoorBuilder(JMWCBlocks.ALANTH_LOG_TRAPDOOR.get(), Ingredient.of(JMWCBlocks.ALANTH_LOG.get())).group("alanth")
                .unlockedBy("has_alanth_log", has(JMWCBlocks.ALANTH_LOG)).save(recipeOutput);
        pressurePlate(recipeOutput, JMWCBlocks.ALANTH_PRESSUREPLATE.get(), JMWCBlocks.ALANTH_PLANKS.get());
        buttonBuilder(JMWCBlocks.ALANTH_BUTTON.get(), Ingredient.of(JMWCBlocks.ALANTH_PLANKS.get())).group("alanth")
                .unlockedBy("has_alanth_planks", has(JMWCBlocks.ALANTH_PLANKS)).save(recipeOutput);

        // ALLMEN OAK
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, JMWCBlocks.ALLMEN_OAK_PLANKS.get(),4)
                .requires(JMWCBlocks.ALLMEN_OAK_LOG)
                .unlockedBy("has_allmen_oak_log", has(JMWCBlocks.ALLMEN_OAK_LOG)).save(recipeOutput);
        stairBuilder(JMWCBlocks.ALLMEN_OAK_STAIRS.get(), Ingredient.of(JMWCBlocks.ALLMEN_OAK_PLANKS)).group("allmen_oak")
                .unlockedBy("has_allmen_oak_planks", has(JMWCBlocks.ALLMEN_OAK_PLANKS)).save(recipeOutput);
        stairBuilder(JMWCBlocks.ALLMEN_OAK_LOG_STAIRS.get(), Ingredient.of(JMWCBlocks.ALLMEN_OAK_LOG)).group("allmen_oak")
                .unlockedBy("has_allmen_oak_log", has(JMWCBlocks.ALLMEN_OAK_LOG)).save(recipeOutput);
        stairBuilder(JMWCBlocks.STRIPPED_ALLMEN_OAK_LOG_STAIRS.get(), Ingredient.of(JMWCBlocks.STRIPPED_ALLMEN_OAK_LOG)).group("allmen_oak")
                .unlockedBy("has_stripped_allmen_oak_log", has(JMWCBlocks.STRIPPED_ALLMEN_OAK_LOG)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, JMWCBlocks.ALLMEN_OAK_SLAB.get(), JMWCBlocks.ALLMEN_OAK_PLANKS);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, JMWCBlocks.ALLMEN_OAK_LOG_SLAB.get(), JMWCBlocks.ALLMEN_OAK_LOG);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, JMWCBlocks.STRIPPED_ALLMEN_OAK_LOG_SLAB.get(), JMWCBlocks.STRIPPED_ALLMEN_OAK_LOG);
        fenceBuilder(JMWCBlocks.ALLMEN_OAK_FENCE.get(), Ingredient.of(JMWCBlocks.ALLMEN_OAK_PLANKS.get())).group("allmen_oak")
                .unlockedBy("has_allmen_oak_planks", has(JMWCBlocks.ALLMEN_OAK_PLANKS)).save(recipeOutput);
        fenceBuilder(JMWCBlocks.ALLMEN_OAK_LOG_FENCE.get(), Ingredient.of(JMWCBlocks.ALLMEN_OAK_LOG.get())).group("allmen_oak")
                .unlockedBy("has_allmen_oak_log", has(JMWCBlocks.ALLMEN_OAK_LOG)).save(recipeOutput);
        fenceGateBuilder(JMWCBlocks.ALLMEN_OAK_FENCE_GATE.get(), Ingredient.of(JMWCBlocks.ALLMEN_OAK_PLANKS.get())).group("allmen_oak")
                .unlockedBy("has_allmen_oak_planks", has(JMWCBlocks.ALLMEN_OAK_PLANKS)).save(recipeOutput);
        fenceGateBuilder(JMWCBlocks.ALLMEN_OAK_LOG_FENCE_GATE.get(), Ingredient.of(JMWCBlocks.ALLMEN_OAK_LOG.get())).group("allmen_oak")
                .unlockedBy("has_allmen_oak_log", has(JMWCBlocks.ALLMEN_OAK_LOG)).save(recipeOutput);
        doorBuilder(JMWCBlocks.ALLMEN_OAK_DOOR.get(), Ingredient.of(JMWCBlocks.ALLMEN_OAK_PLANKS.get())).group("allmen_oak")
                .unlockedBy("has_allmen_oak_planks", has(JMWCBlocks.ALLMEN_OAK_PLANKS)).save(recipeOutput);
        trapdoorBuilder(JMWCBlocks.ALLMEN_OAK_TRAPDOOR.get(), Ingredient.of(JMWCBlocks.ALLMEN_OAK_PLANKS.get())).group("allmen_oak")
                .unlockedBy("has_allmen_oak_planks", has(JMWCBlocks.ALLMEN_OAK_PLANKS)).save(recipeOutput);
        trapdoorBuilder(JMWCBlocks.ALLMEN_OAK_LOG_TRAPDOOR.get(), Ingredient.of(JMWCBlocks.ALLMEN_OAK_LOG.get())).group("allmen_oak")
                .unlockedBy("has_allmen_oak_log", has(JMWCBlocks.ALLMEN_OAK_LOG)).save(recipeOutput);
        pressurePlate(recipeOutput, JMWCBlocks.ALLMEN_OAK_PRESSUREPLATE.get(), JMWCBlocks.ALLMEN_OAK_PLANKS.get());
        buttonBuilder(JMWCBlocks.ALLMEN_OAK_BUTTON.get(), Ingredient.of(JMWCBlocks.ALLMEN_OAK_PLANKS.get())).group("allmen_oak")
                .unlockedBy("has_allmen_oak_planks", has(JMWCBlocks.ALLMEN_OAK_PLANKS)).save(recipeOutput);

        // ASPENTHINE
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, JMWCBlocks.ASPENTHINE_PLANKS.get(),4)
                .requires(JMWCBlocks.ASPENTHINE_LOG)
                .unlockedBy("has_aspenthine_log", has(JMWCBlocks.ASPENTHINE_LOG)).save(recipeOutput);
        stairBuilder(JMWCBlocks.ASPENTHINE_STAIRS.get(), Ingredient.of(JMWCBlocks.ASPENTHINE_PLANKS)).group("aspenthine")
                .unlockedBy("has_aspenthine_planks", has(JMWCBlocks.ASPENTHINE_PLANKS)).save(recipeOutput);
        stairBuilder(JMWCBlocks.ASPENTHINE_LOG_STAIRS.get(), Ingredient.of(JMWCBlocks.ASPENTHINE_LOG)).group("aspenthine")
                .unlockedBy("has_aspenthine_log", has(JMWCBlocks.ASPENTHINE_LOG)).save(recipeOutput);
        stairBuilder(JMWCBlocks.STRIPPED_ASPENTHINE_LOG_STAIRS.get(), Ingredient.of(JMWCBlocks.STRIPPED_ASPENTHINE_LOG)).group("aspenthine")
                .unlockedBy("has_stripped_aspenthine_log", has(JMWCBlocks.STRIPPED_ASPENTHINE_LOG)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, JMWCBlocks.ASPENTHINE_SLAB.get(), JMWCBlocks.ASPENTHINE_PLANKS);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, JMWCBlocks.ASPENTHINE_LOG_SLAB.get(), JMWCBlocks.ASPENTHINE_LOG);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, JMWCBlocks.STRIPPED_ASPENTHINE_LOG_SLAB.get(), JMWCBlocks.STRIPPED_ASPENTHINE_LOG);
        fenceBuilder(JMWCBlocks.ASPENTHINE_FENCE.get(), Ingredient.of(JMWCBlocks.ASPENTHINE_PLANKS.get())).group("aspenthine")
                .unlockedBy("has_aspenthine_planks", has(JMWCBlocks.ASPENTHINE_PLANKS)).save(recipeOutput);
        fenceBuilder(JMWCBlocks.ASPENTHINE_LOG_FENCE.get(), Ingredient.of(JMWCBlocks.ASPENTHINE_LOG.get())).group("aspenthine")
                .unlockedBy("has_aspenthine_log", has(JMWCBlocks.ASPENTHINE_LOG)).save(recipeOutput);
        fenceGateBuilder(JMWCBlocks.ASPENTHINE_FENCE_GATE.get(), Ingredient.of(JMWCBlocks.ASPENTHINE_PLANKS.get())).group("aspenthine")
                .unlockedBy("has_aspenthine_planks", has(JMWCBlocks.ASPENTHINE_PLANKS)).save(recipeOutput);
        fenceGateBuilder(JMWCBlocks.ASPENTHINE_LOG_FENCE_GATE.get(), Ingredient.of(JMWCBlocks.ASPENTHINE_LOG.get())).group("aspenthine")
                .unlockedBy("has_aspenthine_log", has(JMWCBlocks.ASPENTHINE_LOG)).save(recipeOutput);
        doorBuilder(JMWCBlocks.ASPENTHINE_DOOR.get(), Ingredient.of(JMWCBlocks.ASPENTHINE_PLANKS.get())).group("aspenthine")
                .unlockedBy("has_aspenthine_planks", has(JMWCBlocks.ASPENTHINE_PLANKS)).save(recipeOutput);
        trapdoorBuilder(JMWCBlocks.ASPENTHINE_TRAPDOOR.get(), Ingredient.of(JMWCBlocks.ASPENTHINE_PLANKS.get())).group("aspenthine")
                .unlockedBy("has_aspenthine_planks", has(JMWCBlocks.ASPENTHINE_PLANKS)).save(recipeOutput);
        trapdoorBuilder(JMWCBlocks.ASPENTHINE_LOG_TRAPDOOR.get(), Ingredient.of(JMWCBlocks.ASPENTHINE_LOG.get())).group("aspenthine")
                .unlockedBy("has_aspenthine_log", has(JMWCBlocks.ASPENTHINE_LOG)).save(recipeOutput);
        pressurePlate(recipeOutput, JMWCBlocks.ASPENTHINE_PRESSUREPLATE.get(), JMWCBlocks.ASPENTHINE_PLANKS.get());
        buttonBuilder(JMWCBlocks.ASPENTHINE_BUTTON.get(), Ingredient.of(JMWCBlocks.ASPENTHINE_PLANKS.get())).group("aspenthine")
                .unlockedBy("has_aspenthine_planks", has(JMWCBlocks.ASPENTHINE_PLANKS)).save(recipeOutput);

        // AUDRAFLORA OAK
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, JMWCBlocks.AUDRAFLORA_OAK_PLANKS.get(),4)
                .requires(JMWCBlocks.AUDRAFLORA_OAK_LOG)
                .unlockedBy("has_audraflora_oak_log", has(JMWCBlocks.AUDRAFLORA_OAK_LOG)).save(recipeOutput);
        stairBuilder(JMWCBlocks.AUDRAFLORA_OAK_STAIRS.get(), Ingredient.of(JMWCBlocks.AUDRAFLORA_OAK_PLANKS)).group("audraflora_oak")
                .unlockedBy("has_audraflora_oak_planks", has(JMWCBlocks.AUDRAFLORA_OAK_PLANKS)).save(recipeOutput);
        stairBuilder(JMWCBlocks.AUDRAFLORA_OAK_LOG_STAIRS.get(), Ingredient.of(JMWCBlocks.AUDRAFLORA_OAK_LOG)).group("audraflora_oak")
                .unlockedBy("has_audraflora_oak_log", has(JMWCBlocks.AUDRAFLORA_OAK_LOG)).save(recipeOutput);
        stairBuilder(JMWCBlocks.STRIPPED_AUDRAFLORA_OAK_LOG_STAIRS.get(), Ingredient.of(JMWCBlocks.STRIPPED_AUDRAFLORA_OAK_LOG)).group("audraflora_oak")
                .unlockedBy("has_stripped_audraflora_oak_log", has(JMWCBlocks.STRIPPED_AUDRAFLORA_OAK_LOG)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, JMWCBlocks.AUDRAFLORA_OAK_SLAB.get(), JMWCBlocks.AUDRAFLORA_OAK_PLANKS);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, JMWCBlocks.AUDRAFLORA_OAK_LOG_SLAB.get(), JMWCBlocks.AUDRAFLORA_OAK_LOG);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, JMWCBlocks.STRIPPED_AUDRAFLORA_OAK_LOG_SLAB.get(), JMWCBlocks.STRIPPED_AUDRAFLORA_OAK_LOG);
        fenceBuilder(JMWCBlocks.AUDRAFLORA_OAK_FENCE.get(), Ingredient.of(JMWCBlocks.AUDRAFLORA_OAK_PLANKS.get())).group("audraflora_oak")
                .unlockedBy("has_audraflora_oak_planks", has(JMWCBlocks.AUDRAFLORA_OAK_PLANKS)).save(recipeOutput);
        fenceBuilder(JMWCBlocks.AUDRAFLORA_OAK_LOG_FENCE.get(), Ingredient.of(JMWCBlocks.AUDRAFLORA_OAK_LOG.get())).group("audraflora_oak")
                .unlockedBy("has_audraflora_oak_log", has(JMWCBlocks.AUDRAFLORA_OAK_LOG)).save(recipeOutput);
        fenceGateBuilder(JMWCBlocks.AUDRAFLORA_OAK_FENCE_GATE.get(), Ingredient.of(JMWCBlocks.AUDRAFLORA_OAK_PLANKS.get())).group("audraflora_oak")
                .unlockedBy("has_audraflora_oak_planks", has(JMWCBlocks.AUDRAFLORA_OAK_PLANKS)).save(recipeOutput);
        fenceGateBuilder(JMWCBlocks.AUDRAFLORA_OAK_LOG_FENCE_GATE.get(), Ingredient.of(JMWCBlocks.AUDRAFLORA_OAK_LOG.get())).group("audraflora_oak")
                .unlockedBy("has_audraflora_oak_log", has(JMWCBlocks.AUDRAFLORA_OAK_LOG)).save(recipeOutput);
        doorBuilder(JMWCBlocks.AUDRAFLORA_OAK_DOOR.get(), Ingredient.of(JMWCBlocks.AUDRAFLORA_OAK_PLANKS.get())).group("audraflora_oak")
                .unlockedBy("has_audraflora_oak_planks", has(JMWCBlocks.AUDRAFLORA_OAK_PLANKS)).save(recipeOutput);
        trapdoorBuilder(JMWCBlocks.AUDRAFLORA_OAK_TRAPDOOR.get(), Ingredient.of(JMWCBlocks.AUDRAFLORA_OAK_PLANKS.get())).group("audraflora_oak")
                .unlockedBy("has_audraflora_oak_planks", has(JMWCBlocks.AUDRAFLORA_OAK_PLANKS)).save(recipeOutput);
        trapdoorBuilder(JMWCBlocks.AUDRAFLORA_OAK_LOG_TRAPDOOR.get(), Ingredient.of(JMWCBlocks.AUDRAFLORA_OAK_LOG.get())).group("audraflora_oak")
                .unlockedBy("has_audraflora_oak_log", has(JMWCBlocks.AUDRAFLORA_OAK_LOG)).save(recipeOutput);
        pressurePlate(recipeOutput, JMWCBlocks.AUDRAFLORA_OAK_PRESSUREPLATE.get(), JMWCBlocks.AUDRAFLORA_OAK_PLANKS.get());
        buttonBuilder(JMWCBlocks.AUDRAFLORA_OAK_BUTTON.get(), Ingredient.of(JMWCBlocks.AUDRAFLORA_OAK_PLANKS.get())).group("audraflora_oak")
                .unlockedBy("has_audraflora_oak_planks", has(JMWCBlocks.AUDRAFLORA_OAK_PLANKS)).save(recipeOutput);

        // BLACK ABORA
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, JMWCBlocks.BLACK_ABORA_PLANKS.get(),4)
                .requires(JMWCBlocks.BLACK_ABORA_LOG)
                .unlockedBy("has_black_abora_log", has(JMWCBlocks.BLACK_ABORA_LOG)).save(recipeOutput);
        stairBuilder(JMWCBlocks.BLACK_ABORA_STAIRS.get(), Ingredient.of(JMWCBlocks.BLACK_ABORA_PLANKS)).group("black_abora")
                .unlockedBy("has_black_abora_planks", has(JMWCBlocks.BLACK_ABORA_PLANKS)).save(recipeOutput);
        stairBuilder(JMWCBlocks.BLACK_ABORA_LOG_STAIRS.get(), Ingredient.of(JMWCBlocks.BLACK_ABORA_LOG)).group("black_abora")
                .unlockedBy("has_black_abora_log", has(JMWCBlocks.BLACK_ABORA_LOG)).save(recipeOutput);
        stairBuilder(JMWCBlocks.STRIPPED_BLACK_ABORA_LOG_STAIRS.get(), Ingredient.of(JMWCBlocks.STRIPPED_BLACK_ABORA_LOG)).group("black_abora")
                .unlockedBy("has_stripped_black_abora_log", has(JMWCBlocks.STRIPPED_BLACK_ABORA_LOG)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, JMWCBlocks.BLACK_ABORA_SLAB.get(), JMWCBlocks.BLACK_ABORA_PLANKS);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, JMWCBlocks.BLACK_ABORA_LOG_SLAB.get(), JMWCBlocks.BLACK_ABORA_LOG);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, JMWCBlocks.STRIPPED_BLACK_ABORA_LOG_SLAB.get(), JMWCBlocks.STRIPPED_BLACK_ABORA_LOG);
        fenceBuilder(JMWCBlocks.BLACK_ABORA_FENCE.get(), Ingredient.of(JMWCBlocks.BLACK_ABORA_PLANKS.get())).group("black_abora")
                .unlockedBy("has_black_abora_planks", has(JMWCBlocks.BLACK_ABORA_PLANKS)).save(recipeOutput);
        fenceBuilder(JMWCBlocks.BLACK_ABORA_LOG_FENCE.get(), Ingredient.of(JMWCBlocks.BLACK_ABORA_LOG.get())).group("black_abora")
                .unlockedBy("has_black_abora_log", has(JMWCBlocks.BLACK_ABORA_LOG)).save(recipeOutput);
        fenceGateBuilder(JMWCBlocks.BLACK_ABORA_FENCE_GATE.get(), Ingredient.of(JMWCBlocks.BLACK_ABORA_PLANKS.get())).group("black_abora")
                .unlockedBy("has_black_abora_planks", has(JMWCBlocks.BLACK_ABORA_PLANKS)).save(recipeOutput);
        fenceGateBuilder(JMWCBlocks.BLACK_ABORA_LOG_FENCE_GATE.get(), Ingredient.of(JMWCBlocks.BLACK_ABORA_LOG.get())).group("black_abora")
                .unlockedBy("has_black_abora_log", has(JMWCBlocks.BLACK_ABORA_LOG)).save(recipeOutput);
        doorBuilder(JMWCBlocks.BLACK_ABORA_DOOR.get(), Ingredient.of(JMWCBlocks.BLACK_ABORA_PLANKS.get())).group("black_abora")
                .unlockedBy("has_black_abora_planks", has(JMWCBlocks.BLACK_ABORA_PLANKS)).save(recipeOutput);
        trapdoorBuilder(JMWCBlocks.BLACK_ABORA_TRAPDOOR.get(), Ingredient.of(JMWCBlocks.BLACK_ABORA_PLANKS.get())).group("black_abora")
                .unlockedBy("has_black_abora_planks", has(JMWCBlocks.BLACK_ABORA_PLANKS)).save(recipeOutput);
        trapdoorBuilder(JMWCBlocks.BLACK_ABORA_LOG_TRAPDOOR.get(), Ingredient.of(JMWCBlocks.BLACK_ABORA_LOG.get())).group("black_abora")
                .unlockedBy("has_black_abora_log", has(JMWCBlocks.BLACK_ABORA_LOG)).save(recipeOutput);
        pressurePlate(recipeOutput, JMWCBlocks.BLACK_ABORA_PRESSUREPLATE.get(), JMWCBlocks.BLACK_ABORA_PLANKS.get());
        buttonBuilder(JMWCBlocks.BLACK_ABORA_BUTTON.get(), Ingredient.of(JMWCBlocks.BLACK_ABORA_PLANKS.get())).group("black_abora")
                .unlockedBy("has_black_abora_planks", has(JMWCBlocks.BLACK_ABORA_PLANKS)).save(recipeOutput);

        // CARAVAN OLIVEWOOD
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, JMWCBlocks.CARAVAN_OLIVEWOOD_PLANKS.get(),4)
                .requires(JMWCBlocks.CARAVAN_OLIVEWOOD_LOG)
                .unlockedBy("has_caravan_olivewood_log", has(JMWCBlocks.CARAVAN_OLIVEWOOD_LOG)).save(recipeOutput);
        stairBuilder(JMWCBlocks.CARAVAN_OLIVEWOOD_STAIRS.get(), Ingredient.of(JMWCBlocks.CARAVAN_OLIVEWOOD_PLANKS)).group("caravan_olivewood")
                .unlockedBy("has_caravan_olivewood_planks", has(JMWCBlocks.CARAVAN_OLIVEWOOD_PLANKS)).save(recipeOutput);
        stairBuilder(JMWCBlocks.CARAVAN_OLIVEWOOD_LOG_STAIRS.get(), Ingredient.of(JMWCBlocks.CARAVAN_OLIVEWOOD_LOG)).group("caravan_olivewood")
                .unlockedBy("has_caravan_olivewood_log", has(JMWCBlocks.CARAVAN_OLIVEWOOD_LOG)).save(recipeOutput);
        stairBuilder(JMWCBlocks.STRIPPED_CARAVAN_OLIVEWOOD_LOG_STAIRS.get(), Ingredient.of(JMWCBlocks.STRIPPED_CARAVAN_OLIVEWOOD_LOG)).group("caravan_olivewood")
                .unlockedBy("has_stripped_caravan_olivewood_log", has(JMWCBlocks.STRIPPED_CARAVAN_OLIVEWOOD_LOG)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, JMWCBlocks.CARAVAN_OLIVEWOOD_SLAB.get(), JMWCBlocks.CARAVAN_OLIVEWOOD_PLANKS);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, JMWCBlocks.CARAVAN_OLIVEWOOD_LOG_SLAB.get(), JMWCBlocks.CARAVAN_OLIVEWOOD_LOG);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, JMWCBlocks.STRIPPED_CARAVAN_OLIVEWOOD_LOG_SLAB.get(), JMWCBlocks.STRIPPED_CARAVAN_OLIVEWOOD_LOG);
        fenceBuilder(JMWCBlocks.CARAVAN_OLIVEWOOD_FENCE.get(), Ingredient.of(JMWCBlocks.CARAVAN_OLIVEWOOD_PLANKS.get())).group("caravan_olivewood")
                .unlockedBy("has_caravan_olivewood_planks", has(JMWCBlocks.CARAVAN_OLIVEWOOD_PLANKS)).save(recipeOutput);
        fenceBuilder(JMWCBlocks.CARAVAN_OLIVEWOOD_LOG_FENCE.get(), Ingredient.of(JMWCBlocks.CARAVAN_OLIVEWOOD_LOG.get())).group("caravan_olivewood")
                .unlockedBy("has_caravan_olivewood_log", has(JMWCBlocks.CARAVAN_OLIVEWOOD_LOG)).save(recipeOutput);
        fenceGateBuilder(JMWCBlocks.CARAVAN_OLIVEWOOD_FENCE_GATE.get(), Ingredient.of(JMWCBlocks.CARAVAN_OLIVEWOOD_PLANKS.get())).group("caravan_olivewood")
                .unlockedBy("has_caravan_olivewood_planks", has(JMWCBlocks.CARAVAN_OLIVEWOOD_PLANKS)).save(recipeOutput);
        fenceGateBuilder(JMWCBlocks.CARAVAN_OLIVEWOOD_LOG_FENCE_GATE.get(), Ingredient.of(JMWCBlocks.CARAVAN_OLIVEWOOD_LOG.get())).group("caravan_olivewood")
                .unlockedBy("has_caravan_olivewood_log", has(JMWCBlocks.CARAVAN_OLIVEWOOD_LOG)).save(recipeOutput);
        doorBuilder(JMWCBlocks.CARAVAN_OLIVEWOOD_DOOR.get(), Ingredient.of(JMWCBlocks.CARAVAN_OLIVEWOOD_PLANKS.get())).group("caravan_olivewood")
                .unlockedBy("has_caravan_olivewood_planks", has(JMWCBlocks.CARAVAN_OLIVEWOOD_PLANKS)).save(recipeOutput);
        trapdoorBuilder(JMWCBlocks.CARAVAN_OLIVEWOOD_TRAPDOOR.get(), Ingredient.of(JMWCBlocks.CARAVAN_OLIVEWOOD_PLANKS.get())).group("caravan_olivewood")
                .unlockedBy("has_caravan_olivewood_planks", has(JMWCBlocks.CARAVAN_OLIVEWOOD_PLANKS)).save(recipeOutput);
        trapdoorBuilder(JMWCBlocks.CARAVAN_OLIVEWOOD_LOG_TRAPDOOR.get(), Ingredient.of(JMWCBlocks.CARAVAN_OLIVEWOOD_LOG.get())).group("caravan_olivewood")
                .unlockedBy("has_caravan_olivewood_log", has(JMWCBlocks.CARAVAN_OLIVEWOOD_LOG)).save(recipeOutput);
        pressurePlate(recipeOutput, JMWCBlocks.CARAVAN_OLIVEWOOD_PRESSUREPLATE.get(), JMWCBlocks.CARAVAN_OLIVEWOOD_PLANKS.get());
        buttonBuilder(JMWCBlocks.CARAVAN_OLIVEWOOD_BUTTON.get(), Ingredient.of(JMWCBlocks.CARAVAN_OLIVEWOOD_PLANKS.get())).group("caravan_olivewood")
                .unlockedBy("has_caravan_olivewood_planks", has(JMWCBlocks.CARAVAN_OLIVEWOOD_PLANKS)).save(recipeOutput);

        // COPELAND CEDAR
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, JMWCBlocks.COPELAND_CEDAR_PLANKS.get(),4)
                .requires(JMWCBlocks.COPELAND_CEDAR_LOG)
                .unlockedBy("has_copeland_cedar_log", has(JMWCBlocks.COPELAND_CEDAR_LOG)).save(recipeOutput);
        stairBuilder(JMWCBlocks.COPELAND_CEDAR_STAIRS.get(), Ingredient.of(JMWCBlocks.COPELAND_CEDAR_PLANKS)).group("copeland_cedar")
                .unlockedBy("has_copeland_cedar_planks", has(JMWCBlocks.COPELAND_CEDAR_PLANKS)).save(recipeOutput);
        stairBuilder(JMWCBlocks.COPELAND_CEDAR_LOG_STAIRS.get(), Ingredient.of(JMWCBlocks.COPELAND_CEDAR_LOG)).group("copeland_cedar")
                .unlockedBy("has_copeland_cedar_log", has(JMWCBlocks.COPELAND_CEDAR_LOG)).save(recipeOutput);
        stairBuilder(JMWCBlocks.STRIPPED_COPELAND_CEDAR_LOG_STAIRS.get(), Ingredient.of(JMWCBlocks.STRIPPED_COPELAND_CEDAR_LOG)).group("copeland_cedar")
                .unlockedBy("has_stripped_copeland_cedar_log", has(JMWCBlocks.STRIPPED_COPELAND_CEDAR_LOG)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, JMWCBlocks.COPELAND_CEDAR_SLAB.get(), JMWCBlocks.COPELAND_CEDAR_PLANKS);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, JMWCBlocks.COPELAND_CEDAR_LOG_SLAB.get(), JMWCBlocks.COPELAND_CEDAR_LOG);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, JMWCBlocks.STRIPPED_COPELAND_CEDAR_LOG_SLAB.get(), JMWCBlocks.STRIPPED_COPELAND_CEDAR_LOG);
        fenceBuilder(JMWCBlocks.COPELAND_CEDAR_FENCE.get(), Ingredient.of(JMWCBlocks.COPELAND_CEDAR_PLANKS.get())).group("copeland_cedar")
                .unlockedBy("has_copeland_cedar_planks", has(JMWCBlocks.COPELAND_CEDAR_PLANKS)).save(recipeOutput);
        fenceBuilder(JMWCBlocks.COPELAND_CEDAR_LOG_FENCE.get(), Ingredient.of(JMWCBlocks.COPELAND_CEDAR_LOG.get())).group("copeland_cedar")
                .unlockedBy("has_copeland_cedar_log", has(JMWCBlocks.COPELAND_CEDAR_LOG)).save(recipeOutput);
        fenceGateBuilder(JMWCBlocks.COPELAND_CEDAR_FENCE_GATE.get(), Ingredient.of(JMWCBlocks.COPELAND_CEDAR_PLANKS.get())).group("copeland_cedar")
                .unlockedBy("has_copeland_cedar_planks", has(JMWCBlocks.COPELAND_CEDAR_PLANKS)).save(recipeOutput);
        fenceGateBuilder(JMWCBlocks.COPELAND_CEDAR_LOG_FENCE_GATE.get(), Ingredient.of(JMWCBlocks.COPELAND_CEDAR_LOG.get())).group("copeland_cedar")
                .unlockedBy("has_copeland_cedar_log", has(JMWCBlocks.COPELAND_CEDAR_LOG)).save(recipeOutput);
        doorBuilder(JMWCBlocks.COPELAND_CEDAR_DOOR.get(), Ingredient.of(JMWCBlocks.COPELAND_CEDAR_PLANKS.get())).group("copeland_cedar")
                .unlockedBy("has_copeland_cedar_planks", has(JMWCBlocks.COPELAND_CEDAR_PLANKS)).save(recipeOutput);
        trapdoorBuilder(JMWCBlocks.COPELAND_CEDAR_TRAPDOOR.get(), Ingredient.of(JMWCBlocks.COPELAND_CEDAR_PLANKS.get())).group("copeland_cedar")
                .unlockedBy("has_copeland_cedar_planks", has(JMWCBlocks.COPELAND_CEDAR_PLANKS)).save(recipeOutput);
        trapdoorBuilder(JMWCBlocks.COPELAND_CEDAR_LOG_TRAPDOOR.get(), Ingredient.of(JMWCBlocks.COPELAND_CEDAR_LOG.get())).group("copeland_cedar")
                .unlockedBy("has_copeland_cedar_log", has(JMWCBlocks.COPELAND_CEDAR_LOG)).save(recipeOutput);
        pressurePlate(recipeOutput, JMWCBlocks.COPELAND_CEDAR_PRESSUREPLATE.get(), JMWCBlocks.COPELAND_CEDAR_PLANKS.get());
        buttonBuilder(JMWCBlocks.COPELAND_CEDAR_BUTTON.get(), Ingredient.of(JMWCBlocks.COPELAND_CEDAR_PLANKS.get())).group("copeland_cedar")
                .unlockedBy("has_copeland_cedar_planks", has(JMWCBlocks.COPELAND_CEDAR_PLANKS)).save(recipeOutput);
    }
}