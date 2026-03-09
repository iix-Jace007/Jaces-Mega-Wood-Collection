package net.jace007.jacesmegawoodcollection.datagen;

import net.jace007.jacesmegawoodcollection.JacesMegaWoodCollection;
import net.jace007.jacesmegawoodcollection.block.JMWCBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class JMWCBlockStateProvider extends BlockStateProvider {
    public JMWCBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, JacesMegaWoodCollection.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        // AGRABAH CEDAR
        logBlock(((RotatedPillarBlock) JMWCBlocks.AGRABAH_CEDAR_LOG.get()));
        axisBlock(((RotatedPillarBlock) JMWCBlocks.AGRABAH_CEDAR_WOOD.get()),
                blockTexture(JMWCBlocks.AGRABAH_CEDAR_LOG.get()), blockTexture(JMWCBlocks.AGRABAH_CEDAR_LOG.get()));
        logBlock(((RotatedPillarBlock) JMWCBlocks.STRIPPED_AGRABAH_CEDAR_LOG.get()));
        axisBlock(((RotatedPillarBlock) JMWCBlocks.STRIPPED_AGRABAH_CEDAR_WOOD.get()),
                blockTexture(JMWCBlocks.STRIPPED_AGRABAH_CEDAR_LOG.get()), blockTexture(JMWCBlocks.STRIPPED_AGRABAH_CEDAR_LOG.get()));
        blockItem(JMWCBlocks.AGRABAH_CEDAR_LOG);
        blockItem(JMWCBlocks.AGRABAH_CEDAR_WOOD);
        blockItem(JMWCBlocks.STRIPPED_AGRABAH_CEDAR_LOG);
        blockItem(JMWCBlocks.STRIPPED_AGRABAH_CEDAR_WOOD);
        blockWithItem(JMWCBlocks.AGRABAH_CEDAR_PLANKS);
        leavesBlock(JMWCBlocks.AGRABAH_CEDAR_LEAVES);
        saplingBlock(JMWCBlocks.AGRABAH_CEDAR_SAPLING);
        stairsBlock(JMWCBlocks.AGRABAH_CEDAR_STAIRS.get(), blockTexture(JMWCBlocks.AGRABAH_CEDAR_PLANKS.get()));
        stairsBlock(JMWCBlocks.AGRABAH_CEDAR_LOG_STAIRS.get(), blockTexture(JMWCBlocks.AGRABAH_CEDAR_LOG.get()));
        stairsBlock(JMWCBlocks.STRIPPED_AGRABAH_CEDAR_LOG_STAIRS.get(), blockTexture(JMWCBlocks.STRIPPED_AGRABAH_CEDAR_LOG.get()));
        slabBlock(JMWCBlocks.AGRABAH_CEDAR_SLAB.get(),
                blockTexture(JMWCBlocks.AGRABAH_CEDAR_PLANKS.get()), blockTexture(JMWCBlocks.AGRABAH_CEDAR_PLANKS.get()));
        slabBlock(JMWCBlocks.AGRABAH_CEDAR_LOG_SLAB.get(),
                blockTexture(JMWCBlocks.AGRABAH_CEDAR_LOG.get()), blockTexture(JMWCBlocks.AGRABAH_CEDAR_LOG.get()));
        slabBlock(JMWCBlocks.STRIPPED_AGRABAH_CEDAR_LOG_SLAB.get(),
                blockTexture(JMWCBlocks.STRIPPED_AGRABAH_CEDAR_LOG.get()), blockTexture(JMWCBlocks.STRIPPED_AGRABAH_CEDAR_LOG.get()));
        buttonBlock(JMWCBlocks.AGRABAH_CEDAR_BUTTON.get(), blockTexture(JMWCBlocks.AGRABAH_CEDAR_PLANKS.get()));
        pressurePlateBlock(JMWCBlocks.AGRABAH_CEDAR_PRESSUREPLATE.get(), blockTexture(JMWCBlocks.AGRABAH_CEDAR_PLANKS.get()));
        fenceBlock(JMWCBlocks.AGRABAH_CEDAR_FENCE.get(), blockTexture(JMWCBlocks.AGRABAH_CEDAR_PLANKS.get()));
        fenceBlock(JMWCBlocks.AGRABAH_CEDAR_LOG_FENCE.get(), blockTexture(JMWCBlocks.AGRABAH_CEDAR_LOG.get()));
        fenceGateBlock(JMWCBlocks.AGRABAH_CEDAR_FENCE_GATE.get(), blockTexture(JMWCBlocks.AGRABAH_CEDAR_PLANKS.get()));
        fenceGateBlock(JMWCBlocks.AGRABAH_CEDAR_LOG_FENCE_GATE.get(), blockTexture(JMWCBlocks.AGRABAH_CEDAR_LOG.get()));
        doorBlockWithRenderType(JMWCBlocks.AGRABAH_CEDAR_DOOR.get(),
                modLoc("block/agrabah_cedar_door_bottom"), modLoc("block/agrabah_cedar_door_top"), "cutout");
        trapdoorBlockWithRenderType(JMWCBlocks.AGRABAH_CEDAR_TRAPDOOR.get(),
                modLoc("block/agrabah_cedar_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType(JMWCBlocks.AGRABAH_CEDAR_LOG_TRAPDOOR.get(),
                modLoc("block/agrabah_cedar_log_trapdoor"), true, "cutout");
        blockItem(JMWCBlocks.AGRABAH_CEDAR_STAIRS);
        blockItem(JMWCBlocks.AGRABAH_CEDAR_LOG_STAIRS);
        blockItem(JMWCBlocks.STRIPPED_AGRABAH_CEDAR_LOG_STAIRS);
        blockItem(JMWCBlocks.AGRABAH_CEDAR_SLAB);
        blockItem(JMWCBlocks.AGRABAH_CEDAR_LOG_SLAB);
        blockItem(JMWCBlocks.STRIPPED_AGRABAH_CEDAR_LOG_SLAB);
        blockItem(JMWCBlocks.AGRABAH_CEDAR_FENCE_GATE);
        blockItem(JMWCBlocks.AGRABAH_CEDAR_LOG_FENCE_GATE);
        blockItem(JMWCBlocks.AGRABAH_CEDAR_BUTTON);
        blockItem(JMWCBlocks.AGRABAH_CEDAR_PRESSUREPLATE);
        blockItem(JMWCBlocks.AGRABAH_CEDAR_TRAPDOOR, "_bottom");
        blockItem(JMWCBlocks.AGRABAH_CEDAR_LOG_TRAPDOOR, "_bottom");

        // ALANTH
        logBlock(((RotatedPillarBlock) JMWCBlocks.ALANTH_LOG.get()));
        axisBlock(((RotatedPillarBlock) JMWCBlocks.ALANTH_WOOD.get()),
                blockTexture(JMWCBlocks.ALANTH_LOG.get()), blockTexture(JMWCBlocks.ALANTH_LOG.get()));
        logBlock(((RotatedPillarBlock) JMWCBlocks.STRIPPED_ALANTH_LOG.get()));
        axisBlock(((RotatedPillarBlock) JMWCBlocks.STRIPPED_ALANTH_WOOD.get()),
                blockTexture(JMWCBlocks.STRIPPED_ALANTH_LOG.get()), blockTexture(JMWCBlocks.STRIPPED_ALANTH_LOG.get()));
        blockItem(JMWCBlocks.ALANTH_LOG);
        blockItem(JMWCBlocks.ALANTH_WOOD);
        blockItem(JMWCBlocks.STRIPPED_ALANTH_LOG);
        blockItem(JMWCBlocks.STRIPPED_ALANTH_WOOD);
        blockWithItem(JMWCBlocks.ALANTH_PLANKS);
        leavesBlock(JMWCBlocks.ALANTH_LEAVES);
        saplingBlock(JMWCBlocks.ALANTH_SAPLING);
        stairsBlock(JMWCBlocks.ALANTH_STAIRS.get(), blockTexture(JMWCBlocks.ALANTH_PLANKS.get()));
        stairsBlock(JMWCBlocks.ALANTH_LOG_STAIRS.get(), blockTexture(JMWCBlocks.ALANTH_LOG.get()));
        stairsBlock(JMWCBlocks.STRIPPED_ALANTH_LOG_STAIRS.get(), blockTexture(JMWCBlocks.STRIPPED_ALANTH_LOG.get()));
        slabBlock(JMWCBlocks.ALANTH_SLAB.get(),
                blockTexture(JMWCBlocks.ALANTH_PLANKS.get()), blockTexture(JMWCBlocks.ALANTH_PLANKS.get()));
        slabBlock(JMWCBlocks.ALANTH_LOG_SLAB.get(),
                blockTexture(JMWCBlocks.ALANTH_LOG.get()), blockTexture(JMWCBlocks.ALANTH_LOG.get()));
        slabBlock(JMWCBlocks.STRIPPED_ALANTH_LOG_SLAB.get(),
                blockTexture(JMWCBlocks.STRIPPED_ALANTH_LOG.get()), blockTexture(JMWCBlocks.STRIPPED_ALANTH_LOG.get()));
        buttonBlock(JMWCBlocks.ALANTH_BUTTON.get(), blockTexture(JMWCBlocks.ALANTH_PLANKS.get()));
        pressurePlateBlock(JMWCBlocks.ALANTH_PRESSUREPLATE.get(), blockTexture(JMWCBlocks.ALANTH_PLANKS.get()));
        fenceBlock(JMWCBlocks.ALANTH_FENCE.get(), blockTexture(JMWCBlocks.ALANTH_PLANKS.get()));
        fenceBlock(JMWCBlocks.ALANTH_LOG_FENCE.get(), blockTexture(JMWCBlocks.ALANTH_LOG.get()));
        fenceGateBlock(JMWCBlocks.ALANTH_FENCE_GATE.get(), blockTexture(JMWCBlocks.ALANTH_PLANKS.get()));
        fenceGateBlock(JMWCBlocks.ALANTH_LOG_FENCE_GATE.get(), blockTexture(JMWCBlocks.ALANTH_LOG.get()));
        doorBlockWithRenderType(JMWCBlocks.ALANTH_DOOR.get(),
                modLoc("block/alanth_door_bottom"), modLoc("block/alanth_door_top"), "cutout");
        trapdoorBlockWithRenderType(JMWCBlocks.ALANTH_TRAPDOOR.get(),
                modLoc("block/alanth_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType(JMWCBlocks.ALANTH_LOG_TRAPDOOR.get(),
                modLoc("block/alanth_log_trapdoor"), true, "cutout");
        blockItem(JMWCBlocks.ALANTH_STAIRS);
        blockItem(JMWCBlocks.ALANTH_LOG_STAIRS);
        blockItem(JMWCBlocks.STRIPPED_ALANTH_LOG_STAIRS);
        blockItem(JMWCBlocks.ALANTH_SLAB);
        blockItem(JMWCBlocks.ALANTH_LOG_SLAB);
        blockItem(JMWCBlocks.STRIPPED_ALANTH_LOG_SLAB);
        blockItem(JMWCBlocks.ALANTH_FENCE_GATE);
        blockItem(JMWCBlocks.ALANTH_LOG_FENCE_GATE);
        blockItem(JMWCBlocks.ALANTH_BUTTON);
        blockItem(JMWCBlocks.ALANTH_PRESSUREPLATE);
        blockItem(JMWCBlocks.ALANTH_TRAPDOOR, "_bottom");
        blockItem(JMWCBlocks.ALANTH_LOG_TRAPDOOR, "_bottom");

        // ALLMEN OAK
        logBlock(((RotatedPillarBlock) JMWCBlocks.ALLMEN_OAK_LOG.get()));
        axisBlock(((RotatedPillarBlock) JMWCBlocks.ALLMEN_OAK_WOOD.get()),
                blockTexture(JMWCBlocks.ALLMEN_OAK_LOG.get()), blockTexture(JMWCBlocks.ALLMEN_OAK_LOG.get()));
        logBlock(((RotatedPillarBlock) JMWCBlocks.STRIPPED_ALLMEN_OAK_LOG.get()));
        axisBlock(((RotatedPillarBlock) JMWCBlocks.STRIPPED_ALLMEN_OAK_WOOD.get()),
                blockTexture(JMWCBlocks.STRIPPED_ALLMEN_OAK_LOG.get()), blockTexture(JMWCBlocks.STRIPPED_ALLMEN_OAK_LOG.get()));
        blockItem(JMWCBlocks.ALLMEN_OAK_LOG);
        blockItem(JMWCBlocks.ALLMEN_OAK_WOOD);
        blockItem(JMWCBlocks.STRIPPED_ALLMEN_OAK_LOG);
        blockItem(JMWCBlocks.STRIPPED_ALLMEN_OAK_WOOD);
        blockWithItem(JMWCBlocks.ALLMEN_OAK_PLANKS);
        leavesBlock(JMWCBlocks.ALLMEN_OAK_LEAVES);
        saplingBlock(JMWCBlocks.ALLMEN_OAK_SAPLING);
        stairsBlock(JMWCBlocks.ALLMEN_OAK_STAIRS.get(), blockTexture(JMWCBlocks.ALLMEN_OAK_PLANKS.get()));
        stairsBlock(JMWCBlocks.ALLMEN_OAK_LOG_STAIRS.get(), blockTexture(JMWCBlocks.ALLMEN_OAK_LOG.get()));
        stairsBlock(JMWCBlocks.STRIPPED_ALLMEN_OAK_LOG_STAIRS.get(), blockTexture(JMWCBlocks.STRIPPED_ALLMEN_OAK_LOG.get()));
        slabBlock(JMWCBlocks.ALLMEN_OAK_SLAB.get(),
                blockTexture(JMWCBlocks.ALLMEN_OAK_PLANKS.get()), blockTexture(JMWCBlocks.ALLMEN_OAK_PLANKS.get()));
        slabBlock(JMWCBlocks.ALLMEN_OAK_LOG_SLAB.get(),
                blockTexture(JMWCBlocks.ALLMEN_OAK_LOG.get()), blockTexture(JMWCBlocks.ALLMEN_OAK_LOG.get()));
        slabBlock(JMWCBlocks.STRIPPED_ALLMEN_OAK_LOG_SLAB.get(),
                blockTexture(JMWCBlocks.STRIPPED_ALLMEN_OAK_LOG.get()), blockTexture(JMWCBlocks.STRIPPED_ALLMEN_OAK_LOG.get()));
        buttonBlock(JMWCBlocks.ALLMEN_OAK_BUTTON.get(), blockTexture(JMWCBlocks.ALLMEN_OAK_PLANKS.get()));
        pressurePlateBlock(JMWCBlocks.ALLMEN_OAK_PRESSUREPLATE.get(), blockTexture(JMWCBlocks.ALLMEN_OAK_PLANKS.get()));
        fenceBlock(JMWCBlocks.ALLMEN_OAK_FENCE.get(), blockTexture(JMWCBlocks.ALLMEN_OAK_PLANKS.get()));
        fenceBlock(JMWCBlocks.ALLMEN_OAK_LOG_FENCE.get(), blockTexture(JMWCBlocks.ALLMEN_OAK_LOG.get()));
        fenceGateBlock(JMWCBlocks.ALLMEN_OAK_FENCE_GATE.get(), blockTexture(JMWCBlocks.ALLMEN_OAK_PLANKS.get()));
        fenceGateBlock(JMWCBlocks.ALLMEN_OAK_LOG_FENCE_GATE.get(), blockTexture(JMWCBlocks.ALLMEN_OAK_LOG.get()));
        doorBlockWithRenderType(JMWCBlocks.ALLMEN_OAK_DOOR.get(),
                modLoc("block/allmen_oak_door_bottom"), modLoc("block/allmen_oak_door_top"), "cutout");
        trapdoorBlockWithRenderType(JMWCBlocks.ALLMEN_OAK_TRAPDOOR.get(),
                modLoc("block/allmen_oak_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType(JMWCBlocks.ALLMEN_OAK_LOG_TRAPDOOR.get(),
                modLoc("block/allmen_oak_log_trapdoor"), true, "cutout");
        blockItem(JMWCBlocks.ALLMEN_OAK_STAIRS);
        blockItem(JMWCBlocks.ALLMEN_OAK_LOG_STAIRS);
        blockItem(JMWCBlocks.STRIPPED_ALLMEN_OAK_LOG_STAIRS);
        blockItem(JMWCBlocks.ALLMEN_OAK_SLAB);
        blockItem(JMWCBlocks.ALLMEN_OAK_LOG_SLAB);
        blockItem(JMWCBlocks.STRIPPED_ALLMEN_OAK_LOG_SLAB);
        blockItem(JMWCBlocks.ALLMEN_OAK_FENCE_GATE);
        blockItem(JMWCBlocks.ALLMEN_OAK_LOG_FENCE_GATE);
        blockItem(JMWCBlocks.ALLMEN_OAK_BUTTON);
        blockItem(JMWCBlocks.ALLMEN_OAK_PRESSUREPLATE);
        blockItem(JMWCBlocks.ALLMEN_OAK_TRAPDOOR, "_bottom");
        blockItem(JMWCBlocks.ALLMEN_OAK_LOG_TRAPDOOR, "_bottom");

        // ASPENTHINE
        logBlock(((RotatedPillarBlock) JMWCBlocks.ASPENTHINE_LOG.get()));
        axisBlock(((RotatedPillarBlock) JMWCBlocks.ASPENTHINE_WOOD.get()),
                blockTexture(JMWCBlocks.ASPENTHINE_LOG.get()), blockTexture(JMWCBlocks.ASPENTHINE_LOG.get()));
        logBlock(((RotatedPillarBlock) JMWCBlocks.STRIPPED_ASPENTHINE_LOG.get()));
        axisBlock(((RotatedPillarBlock) JMWCBlocks.STRIPPED_ASPENTHINE_WOOD.get()),
                blockTexture(JMWCBlocks.STRIPPED_ASPENTHINE_LOG.get()), blockTexture(JMWCBlocks.STRIPPED_ASPENTHINE_LOG.get()));
        blockItem(JMWCBlocks.ASPENTHINE_LOG);
        blockItem(JMWCBlocks.ASPENTHINE_WOOD);
        blockItem(JMWCBlocks.STRIPPED_ASPENTHINE_LOG);
        blockItem(JMWCBlocks.STRIPPED_ASPENTHINE_WOOD);
        blockWithItem(JMWCBlocks.ASPENTHINE_PLANKS);
        leavesBlock(JMWCBlocks.ASPENTHINE_LEAVES);
        saplingBlock(JMWCBlocks.ASPENTHINE_SAPLING);
        stairsBlock(JMWCBlocks.ASPENTHINE_STAIRS.get(), blockTexture(JMWCBlocks.ASPENTHINE_PLANKS.get()));
        stairsBlock(JMWCBlocks.ASPENTHINE_LOG_STAIRS.get(), blockTexture(JMWCBlocks.ASPENTHINE_LOG.get()));
        stairsBlock(JMWCBlocks.STRIPPED_ASPENTHINE_LOG_STAIRS.get(), blockTexture(JMWCBlocks.STRIPPED_ASPENTHINE_LOG.get()));
        slabBlock(JMWCBlocks.ASPENTHINE_SLAB.get(),
                blockTexture(JMWCBlocks.ASPENTHINE_PLANKS.get()), blockTexture(JMWCBlocks.ASPENTHINE_PLANKS.get()));
        slabBlock(JMWCBlocks.ASPENTHINE_LOG_SLAB.get(),
                blockTexture(JMWCBlocks.ASPENTHINE_LOG.get()), blockTexture(JMWCBlocks.ASPENTHINE_LOG.get()));
        slabBlock(JMWCBlocks.STRIPPED_ASPENTHINE_LOG_SLAB.get(),
                blockTexture(JMWCBlocks.STRIPPED_ASPENTHINE_LOG.get()), blockTexture(JMWCBlocks.STRIPPED_ASPENTHINE_LOG.get()));
        buttonBlock(JMWCBlocks.ASPENTHINE_BUTTON.get(), blockTexture(JMWCBlocks.ASPENTHINE_PLANKS.get()));
        pressurePlateBlock(JMWCBlocks.ASPENTHINE_PRESSUREPLATE.get(), blockTexture(JMWCBlocks.ASPENTHINE_PLANKS.get()));
        fenceBlock(JMWCBlocks.ASPENTHINE_FENCE.get(), blockTexture(JMWCBlocks.ASPENTHINE_PLANKS.get()));
        fenceBlock(JMWCBlocks.ASPENTHINE_LOG_FENCE.get(), blockTexture(JMWCBlocks.ASPENTHINE_LOG.get()));
        fenceGateBlock(JMWCBlocks.ASPENTHINE_FENCE_GATE.get(), blockTexture(JMWCBlocks.ASPENTHINE_PLANKS.get()));
        fenceGateBlock(JMWCBlocks.ASPENTHINE_LOG_FENCE_GATE.get(), blockTexture(JMWCBlocks.ASPENTHINE_LOG.get()));
        doorBlockWithRenderType(JMWCBlocks.ASPENTHINE_DOOR.get(),
                modLoc("block/aspenthine_door_bottom"), modLoc("block/aspenthine_door_top"), "cutout");
        trapdoorBlockWithRenderType(JMWCBlocks.ASPENTHINE_TRAPDOOR.get(),
                modLoc("block/aspenthine_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType(JMWCBlocks.ASPENTHINE_LOG_TRAPDOOR.get(),
                modLoc("block/aspenthine_log_trapdoor"), true, "cutout");
        blockItem(JMWCBlocks.ASPENTHINE_STAIRS);
        blockItem(JMWCBlocks.ASPENTHINE_LOG_STAIRS);
        blockItem(JMWCBlocks.STRIPPED_ASPENTHINE_LOG_STAIRS);
        blockItem(JMWCBlocks.ASPENTHINE_SLAB);
        blockItem(JMWCBlocks.ASPENTHINE_LOG_SLAB);
        blockItem(JMWCBlocks.STRIPPED_ASPENTHINE_LOG_SLAB);
        blockItem(JMWCBlocks.ASPENTHINE_FENCE_GATE);
        blockItem(JMWCBlocks.ASPENTHINE_LOG_FENCE_GATE);
        blockItem(JMWCBlocks.ASPENTHINE_BUTTON);
        blockItem(JMWCBlocks.ASPENTHINE_PRESSUREPLATE);
        blockItem(JMWCBlocks.ASPENTHINE_TRAPDOOR, "_bottom");
        blockItem(JMWCBlocks.ASPENTHINE_LOG_TRAPDOOR, "_bottom");

        // ASPENTHINE
        logBlock(((RotatedPillarBlock) JMWCBlocks.AUBRYN_HOLLOW_LOG.get()));
        axisBlock(((RotatedPillarBlock) JMWCBlocks.AUBRYN_HOLLOW_WOOD.get()),
                blockTexture(JMWCBlocks.AUBRYN_HOLLOW_LOG.get()), blockTexture(JMWCBlocks.AUBRYN_HOLLOW_LOG.get()));
        logBlock(((RotatedPillarBlock) JMWCBlocks.STRIPPED_AUBRYN_HOLLOW_LOG.get()));
        axisBlock(((RotatedPillarBlock) JMWCBlocks.STRIPPED_AUBRYN_HOLLOW_WOOD.get()),
                blockTexture(JMWCBlocks.STRIPPED_AUBRYN_HOLLOW_LOG.get()), blockTexture(JMWCBlocks.STRIPPED_AUBRYN_HOLLOW_LOG.get()));
        blockItem(JMWCBlocks.AUBRYN_HOLLOW_LOG);
        blockItem(JMWCBlocks.AUBRYN_HOLLOW_WOOD);
        blockItem(JMWCBlocks.STRIPPED_AUBRYN_HOLLOW_LOG);
        blockItem(JMWCBlocks.STRIPPED_AUBRYN_HOLLOW_WOOD);
        blockWithItem(JMWCBlocks.AUBRYN_HOLLOW_PLANKS);
        leavesBlock(JMWCBlocks.AUBRYN_HOLLOW_LEAVES);
        saplingBlock(JMWCBlocks.AUBRYN_HOLLOW_SAPLING);
        stairsBlock(JMWCBlocks.AUBRYN_HOLLOW_STAIRS.get(), blockTexture(JMWCBlocks.AUBRYN_HOLLOW_PLANKS.get()));
        stairsBlock(JMWCBlocks.AUBRYN_HOLLOW_LOG_STAIRS.get(), blockTexture(JMWCBlocks.AUBRYN_HOLLOW_LOG.get()));
        stairsBlock(JMWCBlocks.STRIPPED_AUBRYN_HOLLOW_LOG_STAIRS.get(), blockTexture(JMWCBlocks.STRIPPED_AUBRYN_HOLLOW_LOG.get()));
        slabBlock(JMWCBlocks.AUBRYN_HOLLOW_SLAB.get(),
                blockTexture(JMWCBlocks.AUBRYN_HOLLOW_PLANKS.get()), blockTexture(JMWCBlocks.AUBRYN_HOLLOW_PLANKS.get()));
        slabBlock(JMWCBlocks.AUBRYN_HOLLOW_LOG_SLAB.get(),
                blockTexture(JMWCBlocks.AUBRYN_HOLLOW_LOG.get()), blockTexture(JMWCBlocks.AUBRYN_HOLLOW_LOG.get()));
        slabBlock(JMWCBlocks.STRIPPED_AUBRYN_HOLLOW_LOG_SLAB.get(),
                blockTexture(JMWCBlocks.STRIPPED_AUBRYN_HOLLOW_LOG.get()), blockTexture(JMWCBlocks.STRIPPED_AUBRYN_HOLLOW_LOG.get()));
        buttonBlock(JMWCBlocks.AUBRYN_HOLLOW_BUTTON.get(), blockTexture(JMWCBlocks.AUBRYN_HOLLOW_PLANKS.get()));
        pressurePlateBlock(JMWCBlocks.AUBRYN_HOLLOW_PRESSUREPLATE.get(), blockTexture(JMWCBlocks.AUBRYN_HOLLOW_PLANKS.get()));
        fenceBlock(JMWCBlocks.AUBRYN_HOLLOW_FENCE.get(), blockTexture(JMWCBlocks.AUBRYN_HOLLOW_PLANKS.get()));
        fenceBlock(JMWCBlocks.AUBRYN_HOLLOW_LOG_FENCE.get(), blockTexture(JMWCBlocks.AUBRYN_HOLLOW_LOG.get()));
        fenceGateBlock(JMWCBlocks.AUBRYN_HOLLOW_FENCE_GATE.get(), blockTexture(JMWCBlocks.AUBRYN_HOLLOW_PLANKS.get()));
        fenceGateBlock(JMWCBlocks.AUBRYN_HOLLOW_LOG_FENCE_GATE.get(), blockTexture(JMWCBlocks.AUBRYN_HOLLOW_LOG.get()));
        doorBlockWithRenderType(JMWCBlocks.AUBRYN_HOLLOW_DOOR.get(),
                modLoc("block/aubryn_hollow_door_bottom"), modLoc("block/aubryn_hollow_door_top"), "cutout");
        trapdoorBlockWithRenderType(JMWCBlocks.AUBRYN_HOLLOW_TRAPDOOR.get(),
                modLoc("block/aubryn_hollow_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType(JMWCBlocks.AUBRYN_HOLLOW_LOG_TRAPDOOR.get(),
                modLoc("block/aubryn_hollow_log_trapdoor"), true, "cutout");
        blockItem(JMWCBlocks.AUBRYN_HOLLOW_STAIRS);
        blockItem(JMWCBlocks.AUBRYN_HOLLOW_LOG_STAIRS);
        blockItem(JMWCBlocks.STRIPPED_AUBRYN_HOLLOW_LOG_STAIRS);
        blockItem(JMWCBlocks.AUBRYN_HOLLOW_SLAB);
        blockItem(JMWCBlocks.AUBRYN_HOLLOW_LOG_SLAB);
        blockItem(JMWCBlocks.STRIPPED_AUBRYN_HOLLOW_LOG_SLAB);
        blockItem(JMWCBlocks.AUBRYN_HOLLOW_FENCE_GATE);
        blockItem(JMWCBlocks.AUBRYN_HOLLOW_LOG_FENCE_GATE);
        blockItem(JMWCBlocks.AUBRYN_HOLLOW_BUTTON);
        blockItem(JMWCBlocks.AUBRYN_HOLLOW_PRESSUREPLATE);
        blockItem(JMWCBlocks.AUBRYN_HOLLOW_TRAPDOOR, "_bottom");
        blockItem(JMWCBlocks.AUBRYN_HOLLOW_LOG_TRAPDOOR, "_bottom");

        // AUDRAFLORA OAK
        logBlock(((RotatedPillarBlock) JMWCBlocks.AUDRAFLORA_OAK_LOG.get()));
        axisBlock(((RotatedPillarBlock) JMWCBlocks.AUDRAFLORA_OAK_WOOD.get()),
                blockTexture(JMWCBlocks.AUDRAFLORA_OAK_LOG.get()), blockTexture(JMWCBlocks.AUDRAFLORA_OAK_LOG.get()));
        logBlock(((RotatedPillarBlock) JMWCBlocks.STRIPPED_AUDRAFLORA_OAK_LOG.get()));
        axisBlock(((RotatedPillarBlock) JMWCBlocks.STRIPPED_AUDRAFLORA_OAK_WOOD.get()),
                blockTexture(JMWCBlocks.STRIPPED_AUDRAFLORA_OAK_LOG.get()), blockTexture(JMWCBlocks.STRIPPED_AUDRAFLORA_OAK_LOG.get()));
        blockItem(JMWCBlocks.AUDRAFLORA_OAK_LOG);
        blockItem(JMWCBlocks.AUDRAFLORA_OAK_WOOD);
        blockItem(JMWCBlocks.STRIPPED_AUDRAFLORA_OAK_LOG);
        blockItem(JMWCBlocks.STRIPPED_AUDRAFLORA_OAK_WOOD);
        blockWithItem(JMWCBlocks.AUDRAFLORA_OAK_PLANKS);
        leavesBlock(JMWCBlocks.AUDRAFLORA_OAK_LEAVES);
        saplingBlock(JMWCBlocks.AUDRAFLORA_OAK_SAPLING);
        stairsBlock(JMWCBlocks.AUDRAFLORA_OAK_STAIRS.get(), blockTexture(JMWCBlocks.AUDRAFLORA_OAK_PLANKS.get()));
        stairsBlock(JMWCBlocks.AUDRAFLORA_OAK_LOG_STAIRS.get(), blockTexture(JMWCBlocks.AUDRAFLORA_OAK_LOG.get()));
        stairsBlock(JMWCBlocks.STRIPPED_AUDRAFLORA_OAK_LOG_STAIRS.get(), blockTexture(JMWCBlocks.STRIPPED_AUDRAFLORA_OAK_LOG.get()));
        slabBlock(JMWCBlocks.AUDRAFLORA_OAK_SLAB.get(),
                blockTexture(JMWCBlocks.AUDRAFLORA_OAK_PLANKS.get()), blockTexture(JMWCBlocks.AUDRAFLORA_OAK_PLANKS.get()));
        slabBlock(JMWCBlocks.AUDRAFLORA_OAK_LOG_SLAB.get(),
                blockTexture(JMWCBlocks.AUDRAFLORA_OAK_LOG.get()), blockTexture(JMWCBlocks.AUDRAFLORA_OAK_LOG.get()));
        slabBlock(JMWCBlocks.STRIPPED_AUDRAFLORA_OAK_LOG_SLAB.get(),
                blockTexture(JMWCBlocks.STRIPPED_AUDRAFLORA_OAK_LOG.get()), blockTexture(JMWCBlocks.STRIPPED_AUDRAFLORA_OAK_LOG.get()));
        buttonBlock(JMWCBlocks.AUDRAFLORA_OAK_BUTTON.get(), blockTexture(JMWCBlocks.AUDRAFLORA_OAK_PLANKS.get()));
        pressurePlateBlock(JMWCBlocks.AUDRAFLORA_OAK_PRESSUREPLATE.get(), blockTexture(JMWCBlocks.AUDRAFLORA_OAK_PLANKS.get()));
        fenceBlock(JMWCBlocks.AUDRAFLORA_OAK_FENCE.get(), blockTexture(JMWCBlocks.AUDRAFLORA_OAK_PLANKS.get()));
        fenceBlock(JMWCBlocks.AUDRAFLORA_OAK_LOG_FENCE.get(), blockTexture(JMWCBlocks.AUDRAFLORA_OAK_LOG.get()));
        fenceGateBlock(JMWCBlocks.AUDRAFLORA_OAK_FENCE_GATE.get(), blockTexture(JMWCBlocks.AUDRAFLORA_OAK_PLANKS.get()));
        fenceGateBlock(JMWCBlocks.AUDRAFLORA_OAK_LOG_FENCE_GATE.get(), blockTexture(JMWCBlocks.AUDRAFLORA_OAK_LOG.get()));
        doorBlockWithRenderType(JMWCBlocks.AUDRAFLORA_OAK_DOOR.get(),
                modLoc("block/audraflora_oak_door_bottom"), modLoc("block/audraflora_oak_door_top"), "cutout");
        trapdoorBlockWithRenderType(JMWCBlocks.AUDRAFLORA_OAK_TRAPDOOR.get(),
                modLoc("block/audraflora_oak_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType(JMWCBlocks.AUDRAFLORA_OAK_LOG_TRAPDOOR.get(),
                modLoc("block/audraflora_oak_log_trapdoor"), true, "cutout");
        blockItem(JMWCBlocks.AUDRAFLORA_OAK_STAIRS);
        blockItem(JMWCBlocks.AUDRAFLORA_OAK_LOG_STAIRS);
        blockItem(JMWCBlocks.STRIPPED_AUDRAFLORA_OAK_LOG_STAIRS);
        blockItem(JMWCBlocks.AUDRAFLORA_OAK_SLAB);
        blockItem(JMWCBlocks.AUDRAFLORA_OAK_LOG_SLAB);
        blockItem(JMWCBlocks.STRIPPED_AUDRAFLORA_OAK_LOG_SLAB);
        blockItem(JMWCBlocks.AUDRAFLORA_OAK_FENCE_GATE);
        blockItem(JMWCBlocks.AUDRAFLORA_OAK_LOG_FENCE_GATE);
        blockItem(JMWCBlocks.AUDRAFLORA_OAK_BUTTON);
        blockItem(JMWCBlocks.AUDRAFLORA_OAK_PRESSUREPLATE);
        blockItem(JMWCBlocks.AUDRAFLORA_OAK_TRAPDOOR, "_bottom");
        blockItem(JMWCBlocks.AUDRAFLORA_OAK_LOG_TRAPDOOR, "_bottom");

        // BALLWYN
        logBlock(((RotatedPillarBlock) JMWCBlocks.BALLWYN_LOG.get()));
        axisBlock(((RotatedPillarBlock) JMWCBlocks.BALLWYN_WOOD.get()),
                blockTexture(JMWCBlocks.BALLWYN_LOG.get()), blockTexture(JMWCBlocks.BALLWYN_LOG.get()));
        logBlock(((RotatedPillarBlock) JMWCBlocks.STRIPPED_BALLWYN_LOG.get()));
        axisBlock(((RotatedPillarBlock) JMWCBlocks.STRIPPED_BALLWYN_WOOD.get()),
                blockTexture(JMWCBlocks.STRIPPED_BALLWYN_LOG.get()), blockTexture(JMWCBlocks.STRIPPED_BALLWYN_LOG.get()));
        blockItem(JMWCBlocks.BALLWYN_LOG);
        blockItem(JMWCBlocks.BALLWYN_WOOD);
        blockItem(JMWCBlocks.STRIPPED_BALLWYN_LOG);
        blockItem(JMWCBlocks.STRIPPED_BALLWYN_WOOD);
        blockWithItem(JMWCBlocks.BALLWYN_PLANKS);
        leavesBlock(JMWCBlocks.BALLWYN_LEAVES);
        saplingBlock(JMWCBlocks.BALLWYN_SAPLING);
        stairsBlock(JMWCBlocks.BALLWYN_STAIRS.get(), blockTexture(JMWCBlocks.BALLWYN_PLANKS.get()));
        stairsBlock(JMWCBlocks.BALLWYN_LOG_STAIRS.get(), blockTexture(JMWCBlocks.BALLWYN_LOG.get()));
        stairsBlock(JMWCBlocks.STRIPPED_BALLWYN_LOG_STAIRS.get(), blockTexture(JMWCBlocks.STRIPPED_BALLWYN_LOG.get()));
        slabBlock(JMWCBlocks.BALLWYN_SLAB.get(),
                blockTexture(JMWCBlocks.BALLWYN_PLANKS.get()), blockTexture(JMWCBlocks.BALLWYN_PLANKS.get()));
        slabBlock(JMWCBlocks.BALLWYN_LOG_SLAB.get(),
                blockTexture(JMWCBlocks.BALLWYN_LOG.get()), blockTexture(JMWCBlocks.BALLWYN_LOG.get()));
        slabBlock(JMWCBlocks.STRIPPED_BALLWYN_LOG_SLAB.get(),
                blockTexture(JMWCBlocks.STRIPPED_BALLWYN_LOG.get()), blockTexture(JMWCBlocks.STRIPPED_BALLWYN_LOG.get()));
        buttonBlock(JMWCBlocks.BALLWYN_BUTTON.get(), blockTexture(JMWCBlocks.BALLWYN_PLANKS.get()));
        pressurePlateBlock(JMWCBlocks.BALLWYN_PRESSUREPLATE.get(), blockTexture(JMWCBlocks.BALLWYN_PLANKS.get()));
        fenceBlock(JMWCBlocks.BALLWYN_FENCE.get(), blockTexture(JMWCBlocks.BALLWYN_PLANKS.get()));
        fenceBlock(JMWCBlocks.BALLWYN_LOG_FENCE.get(), blockTexture(JMWCBlocks.BALLWYN_LOG.get()));
        fenceGateBlock(JMWCBlocks.BALLWYN_FENCE_GATE.get(), blockTexture(JMWCBlocks.BALLWYN_PLANKS.get()));
        fenceGateBlock(JMWCBlocks.BALLWYN_LOG_FENCE_GATE.get(), blockTexture(JMWCBlocks.BALLWYN_LOG.get()));
        doorBlockWithRenderType(JMWCBlocks.BALLWYN_DOOR.get(),
                modLoc("block/ballwyn_door_bottom"), modLoc("block/ballwyn_door_top"), "cutout");
        trapdoorBlockWithRenderType(JMWCBlocks.BALLWYN_TRAPDOOR.get(),
                modLoc("block/ballwyn_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType(JMWCBlocks.BALLWYN_LOG_TRAPDOOR.get(),
                modLoc("block/ballwyn_log_trapdoor"), true, "cutout");
        blockItem(JMWCBlocks.BALLWYN_STAIRS);
        blockItem(JMWCBlocks.BALLWYN_LOG_STAIRS);
        blockItem(JMWCBlocks.STRIPPED_BALLWYN_LOG_STAIRS);
        blockItem(JMWCBlocks.BALLWYN_SLAB);
        blockItem(JMWCBlocks.BALLWYN_LOG_SLAB);
        blockItem(JMWCBlocks.STRIPPED_BALLWYN_LOG_SLAB);
        blockItem(JMWCBlocks.BALLWYN_FENCE_GATE);
        blockItem(JMWCBlocks.BALLWYN_LOG_FENCE_GATE);
        blockItem(JMWCBlocks.BALLWYN_BUTTON);
        blockItem(JMWCBlocks.BALLWYN_PRESSUREPLATE);
        blockItem(JMWCBlocks.BALLWYN_TRAPDOOR, "_bottom");
        blockItem(JMWCBlocks.BALLWYN_LOG_TRAPDOOR, "_bottom");

        // BLACK ABORA
        logBlock(((RotatedPillarBlock) JMWCBlocks.BLACK_ABORA_LOG.get()));
        axisBlock(((RotatedPillarBlock) JMWCBlocks.BLACK_ABORA_WOOD.get()),
                blockTexture(JMWCBlocks.BLACK_ABORA_LOG.get()), blockTexture(JMWCBlocks.BLACK_ABORA_LOG.get()));
        logBlock(((RotatedPillarBlock) JMWCBlocks.STRIPPED_BLACK_ABORA_LOG.get()));
        axisBlock(((RotatedPillarBlock) JMWCBlocks.STRIPPED_BLACK_ABORA_WOOD.get()),
                blockTexture(JMWCBlocks.STRIPPED_BLACK_ABORA_LOG.get()), blockTexture(JMWCBlocks.STRIPPED_BLACK_ABORA_LOG.get()));
        blockItem(JMWCBlocks.BLACK_ABORA_LOG);
        blockItem(JMWCBlocks.BLACK_ABORA_WOOD);
        blockItem(JMWCBlocks.STRIPPED_BLACK_ABORA_LOG);
        blockItem(JMWCBlocks.STRIPPED_BLACK_ABORA_WOOD);
        blockWithItem(JMWCBlocks.BLACK_ABORA_PLANKS);
        leavesBlock(JMWCBlocks.BLACK_ABORA_LEAVES);
        saplingBlock(JMWCBlocks.BLACK_ABORA_SAPLING);
        stairsBlock(JMWCBlocks.BLACK_ABORA_STAIRS.get(), blockTexture(JMWCBlocks.BLACK_ABORA_PLANKS.get()));
        stairsBlock(JMWCBlocks.BLACK_ABORA_LOG_STAIRS.get(), blockTexture(JMWCBlocks.BLACK_ABORA_LOG.get()));
        stairsBlock(JMWCBlocks.STRIPPED_BLACK_ABORA_LOG_STAIRS.get(), blockTexture(JMWCBlocks.STRIPPED_BLACK_ABORA_LOG.get()));
        slabBlock(JMWCBlocks.BLACK_ABORA_SLAB.get(),
                blockTexture(JMWCBlocks.BLACK_ABORA_PLANKS.get()), blockTexture(JMWCBlocks.BLACK_ABORA_PLANKS.get()));
        slabBlock(JMWCBlocks.BLACK_ABORA_LOG_SLAB.get(),
                blockTexture(JMWCBlocks.BLACK_ABORA_LOG.get()), blockTexture(JMWCBlocks.BLACK_ABORA_LOG.get()));
        slabBlock(JMWCBlocks.STRIPPED_BLACK_ABORA_LOG_SLAB.get(),
                blockTexture(JMWCBlocks.STRIPPED_BLACK_ABORA_LOG.get()), blockTexture(JMWCBlocks.STRIPPED_BLACK_ABORA_LOG.get()));
        buttonBlock(JMWCBlocks.BLACK_ABORA_BUTTON.get(), blockTexture(JMWCBlocks.BLACK_ABORA_PLANKS.get()));
        pressurePlateBlock(JMWCBlocks.BLACK_ABORA_PRESSUREPLATE.get(), blockTexture(JMWCBlocks.BLACK_ABORA_PLANKS.get()));
        fenceBlock(JMWCBlocks.BLACK_ABORA_FENCE.get(), blockTexture(JMWCBlocks.BLACK_ABORA_PLANKS.get()));
        fenceBlock(JMWCBlocks.BLACK_ABORA_LOG_FENCE.get(), blockTexture(JMWCBlocks.BLACK_ABORA_LOG.get()));
        fenceGateBlock(JMWCBlocks.BLACK_ABORA_FENCE_GATE.get(), blockTexture(JMWCBlocks.BLACK_ABORA_PLANKS.get()));
        fenceGateBlock(JMWCBlocks.BLACK_ABORA_LOG_FENCE_GATE.get(), blockTexture(JMWCBlocks.BLACK_ABORA_LOG.get()));
        doorBlockWithRenderType(JMWCBlocks.BLACK_ABORA_DOOR.get(),
                modLoc("block/black_abora_door_bottom"), modLoc("block/black_abora_door_top"), "cutout");
        trapdoorBlockWithRenderType(JMWCBlocks.BLACK_ABORA_TRAPDOOR.get(),
                modLoc("block/black_abora_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType(JMWCBlocks.BLACK_ABORA_LOG_TRAPDOOR.get(),
                modLoc("block/black_abora_log_trapdoor"), true, "cutout");
        blockItem(JMWCBlocks.BLACK_ABORA_STAIRS);
        blockItem(JMWCBlocks.BLACK_ABORA_LOG_STAIRS);
        blockItem(JMWCBlocks.STRIPPED_BLACK_ABORA_LOG_STAIRS);
        blockItem(JMWCBlocks.BLACK_ABORA_SLAB);
        blockItem(JMWCBlocks.BLACK_ABORA_LOG_SLAB);
        blockItem(JMWCBlocks.STRIPPED_BLACK_ABORA_LOG_SLAB);
        blockItem(JMWCBlocks.BLACK_ABORA_FENCE_GATE);
        blockItem(JMWCBlocks.BLACK_ABORA_LOG_FENCE_GATE);
        blockItem(JMWCBlocks.BLACK_ABORA_BUTTON);
        blockItem(JMWCBlocks.BLACK_ABORA_PRESSUREPLATE);
        blockItem(JMWCBlocks.BLACK_ABORA_TRAPDOOR, "_bottom");
        blockItem(JMWCBlocks.BLACK_ABORA_LOG_TRAPDOOR, "_bottom");

        // CARAVAN OLIVEWOOD
        logBlock(((RotatedPillarBlock) JMWCBlocks.CARAVAN_OLIVEWOOD_LOG.get()));
        axisBlock(((RotatedPillarBlock) JMWCBlocks.CARAVAN_OLIVEWOOD_WOOD.get()),
                blockTexture(JMWCBlocks.CARAVAN_OLIVEWOOD_LOG.get()), blockTexture(JMWCBlocks.CARAVAN_OLIVEWOOD_LOG.get()));
        logBlock(((RotatedPillarBlock) JMWCBlocks.STRIPPED_CARAVAN_OLIVEWOOD_LOG.get()));
        axisBlock(((RotatedPillarBlock) JMWCBlocks.STRIPPED_CARAVAN_OLIVEWOOD_WOOD.get()),
                blockTexture(JMWCBlocks.STRIPPED_CARAVAN_OLIVEWOOD_LOG.get()), blockTexture(JMWCBlocks.STRIPPED_CARAVAN_OLIVEWOOD_LOG.get()));
        blockItem(JMWCBlocks.CARAVAN_OLIVEWOOD_LOG);
        blockItem(JMWCBlocks.CARAVAN_OLIVEWOOD_WOOD);
        blockItem(JMWCBlocks.STRIPPED_CARAVAN_OLIVEWOOD_LOG);
        blockItem(JMWCBlocks.STRIPPED_CARAVAN_OLIVEWOOD_WOOD);
        blockWithItem(JMWCBlocks.CARAVAN_OLIVEWOOD_PLANKS);
        leavesBlock(JMWCBlocks.CARAVAN_OLIVEWOOD_LEAVES);
        saplingBlock(JMWCBlocks.CARAVAN_OLIVEWOOD_SAPLING);
        stairsBlock(JMWCBlocks.CARAVAN_OLIVEWOOD_STAIRS.get(), blockTexture(JMWCBlocks.CARAVAN_OLIVEWOOD_PLANKS.get()));
        stairsBlock(JMWCBlocks.CARAVAN_OLIVEWOOD_LOG_STAIRS.get(), blockTexture(JMWCBlocks.CARAVAN_OLIVEWOOD_LOG.get()));
        stairsBlock(JMWCBlocks.STRIPPED_CARAVAN_OLIVEWOOD_LOG_STAIRS.get(), blockTexture(JMWCBlocks.STRIPPED_CARAVAN_OLIVEWOOD_LOG.get()));
        slabBlock(JMWCBlocks.CARAVAN_OLIVEWOOD_SLAB.get(),
                blockTexture(JMWCBlocks.CARAVAN_OLIVEWOOD_PLANKS.get()), blockTexture(JMWCBlocks.CARAVAN_OLIVEWOOD_PLANKS.get()));
        slabBlock(JMWCBlocks.CARAVAN_OLIVEWOOD_LOG_SLAB.get(),
                blockTexture(JMWCBlocks.CARAVAN_OLIVEWOOD_LOG.get()), blockTexture(JMWCBlocks.CARAVAN_OLIVEWOOD_LOG.get()));
        slabBlock(JMWCBlocks.STRIPPED_CARAVAN_OLIVEWOOD_LOG_SLAB.get(),
                blockTexture(JMWCBlocks.STRIPPED_CARAVAN_OLIVEWOOD_LOG.get()), blockTexture(JMWCBlocks.STRIPPED_CARAVAN_OLIVEWOOD_LOG.get()));
        buttonBlock(JMWCBlocks.CARAVAN_OLIVEWOOD_BUTTON.get(), blockTexture(JMWCBlocks.CARAVAN_OLIVEWOOD_PLANKS.get()));
        pressurePlateBlock(JMWCBlocks.CARAVAN_OLIVEWOOD_PRESSUREPLATE.get(), blockTexture(JMWCBlocks.CARAVAN_OLIVEWOOD_PLANKS.get()));
        fenceBlock(JMWCBlocks.CARAVAN_OLIVEWOOD_FENCE.get(), blockTexture(JMWCBlocks.CARAVAN_OLIVEWOOD_PLANKS.get()));
        fenceBlock(JMWCBlocks.CARAVAN_OLIVEWOOD_LOG_FENCE.get(), blockTexture(JMWCBlocks.CARAVAN_OLIVEWOOD_LOG.get()));
        fenceGateBlock(JMWCBlocks.CARAVAN_OLIVEWOOD_FENCE_GATE.get(), blockTexture(JMWCBlocks.CARAVAN_OLIVEWOOD_PLANKS.get()));
        fenceGateBlock(JMWCBlocks.CARAVAN_OLIVEWOOD_LOG_FENCE_GATE.get(), blockTexture(JMWCBlocks.CARAVAN_OLIVEWOOD_LOG.get()));
        doorBlockWithRenderType(JMWCBlocks.CARAVAN_OLIVEWOOD_DOOR.get(),
                modLoc("block/caravan_olivewood_door_bottom"), modLoc("block/caravan_olivewood_door_top"), "cutout");
        trapdoorBlockWithRenderType(JMWCBlocks.CARAVAN_OLIVEWOOD_TRAPDOOR.get(),
                modLoc("block/caravan_olivewood_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType(JMWCBlocks.CARAVAN_OLIVEWOOD_LOG_TRAPDOOR.get(),
                modLoc("block/caravan_olivewood_log_trapdoor"), true, "cutout");
        blockItem(JMWCBlocks.CARAVAN_OLIVEWOOD_STAIRS);
        blockItem(JMWCBlocks.CARAVAN_OLIVEWOOD_LOG_STAIRS);
        blockItem(JMWCBlocks.STRIPPED_CARAVAN_OLIVEWOOD_LOG_STAIRS);
        blockItem(JMWCBlocks.CARAVAN_OLIVEWOOD_SLAB);
        blockItem(JMWCBlocks.CARAVAN_OLIVEWOOD_LOG_SLAB);
        blockItem(JMWCBlocks.STRIPPED_CARAVAN_OLIVEWOOD_LOG_SLAB);
        blockItem(JMWCBlocks.CARAVAN_OLIVEWOOD_FENCE_GATE);
        blockItem(JMWCBlocks.CARAVAN_OLIVEWOOD_LOG_FENCE_GATE);
        blockItem(JMWCBlocks.CARAVAN_OLIVEWOOD_BUTTON);
        blockItem(JMWCBlocks.CARAVAN_OLIVEWOOD_PRESSUREPLATE);
        blockItem(JMWCBlocks.CARAVAN_OLIVEWOOD_TRAPDOOR, "_bottom");
        blockItem(JMWCBlocks.CARAVAN_OLIVEWOOD_LOG_TRAPDOOR, "_bottom");

        // COPELAND CEDAR
        logBlock(((RotatedPillarBlock) JMWCBlocks.COPELAND_CEDAR_LOG.get()));
        axisBlock(((RotatedPillarBlock) JMWCBlocks.COPELAND_CEDAR_WOOD.get()),
                blockTexture(JMWCBlocks.COPELAND_CEDAR_LOG.get()), blockTexture(JMWCBlocks.COPELAND_CEDAR_LOG.get()));
        logBlock(((RotatedPillarBlock) JMWCBlocks.STRIPPED_COPELAND_CEDAR_LOG.get()));
        axisBlock(((RotatedPillarBlock) JMWCBlocks.STRIPPED_COPELAND_CEDAR_WOOD.get()),
                blockTexture(JMWCBlocks.STRIPPED_COPELAND_CEDAR_LOG.get()), blockTexture(JMWCBlocks.STRIPPED_COPELAND_CEDAR_LOG.get()));
        blockItem(JMWCBlocks.COPELAND_CEDAR_LOG);
        blockItem(JMWCBlocks.COPELAND_CEDAR_WOOD);
        blockItem(JMWCBlocks.STRIPPED_COPELAND_CEDAR_LOG);
        blockItem(JMWCBlocks.STRIPPED_COPELAND_CEDAR_WOOD);
        blockWithItem(JMWCBlocks.COPELAND_CEDAR_PLANKS);
        leavesBlock(JMWCBlocks.COPELAND_CEDAR_LEAVES);
        saplingBlock(JMWCBlocks.COPELAND_CEDAR_SAPLING);
        stairsBlock(JMWCBlocks.COPELAND_CEDAR_STAIRS.get(), blockTexture(JMWCBlocks.COPELAND_CEDAR_PLANKS.get()));
        stairsBlock(JMWCBlocks.COPELAND_CEDAR_LOG_STAIRS.get(), blockTexture(JMWCBlocks.COPELAND_CEDAR_LOG.get()));
        stairsBlock(JMWCBlocks.STRIPPED_COPELAND_CEDAR_LOG_STAIRS.get(), blockTexture(JMWCBlocks.STRIPPED_COPELAND_CEDAR_LOG.get()));
        slabBlock(JMWCBlocks.COPELAND_CEDAR_SLAB.get(),
                blockTexture(JMWCBlocks.COPELAND_CEDAR_PLANKS.get()), blockTexture(JMWCBlocks.COPELAND_CEDAR_PLANKS.get()));
        slabBlock(JMWCBlocks.COPELAND_CEDAR_LOG_SLAB.get(),
                blockTexture(JMWCBlocks.COPELAND_CEDAR_LOG.get()), blockTexture(JMWCBlocks.COPELAND_CEDAR_LOG.get()));
        slabBlock(JMWCBlocks.STRIPPED_COPELAND_CEDAR_LOG_SLAB.get(),
                blockTexture(JMWCBlocks.STRIPPED_COPELAND_CEDAR_LOG.get()), blockTexture(JMWCBlocks.STRIPPED_COPELAND_CEDAR_LOG.get()));
        buttonBlock(JMWCBlocks.COPELAND_CEDAR_BUTTON.get(), blockTexture(JMWCBlocks.COPELAND_CEDAR_PLANKS.get()));
        pressurePlateBlock(JMWCBlocks.COPELAND_CEDAR_PRESSUREPLATE.get(), blockTexture(JMWCBlocks.COPELAND_CEDAR_PLANKS.get()));
        fenceBlock(JMWCBlocks.COPELAND_CEDAR_FENCE.get(), blockTexture(JMWCBlocks.COPELAND_CEDAR_PLANKS.get()));
        fenceBlock(JMWCBlocks.COPELAND_CEDAR_LOG_FENCE.get(), blockTexture(JMWCBlocks.COPELAND_CEDAR_LOG.get()));
        fenceGateBlock(JMWCBlocks.COPELAND_CEDAR_FENCE_GATE.get(), blockTexture(JMWCBlocks.COPELAND_CEDAR_PLANKS.get()));
        fenceGateBlock(JMWCBlocks.COPELAND_CEDAR_LOG_FENCE_GATE.get(), blockTexture(JMWCBlocks.COPELAND_CEDAR_LOG.get()));
        doorBlockWithRenderType(JMWCBlocks.COPELAND_CEDAR_DOOR.get(),
                modLoc("block/copeland_cedar_door_bottom"), modLoc("block/copeland_cedar_door_top"), "cutout");
        trapdoorBlockWithRenderType(JMWCBlocks.COPELAND_CEDAR_TRAPDOOR.get(),
                modLoc("block/copeland_cedar_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType(JMWCBlocks.COPELAND_CEDAR_LOG_TRAPDOOR.get(),
                modLoc("block/copeland_cedar_log_trapdoor"), true, "cutout");
        blockItem(JMWCBlocks.COPELAND_CEDAR_STAIRS);
        blockItem(JMWCBlocks.COPELAND_CEDAR_LOG_STAIRS);
        blockItem(JMWCBlocks.STRIPPED_COPELAND_CEDAR_LOG_STAIRS);
        blockItem(JMWCBlocks.COPELAND_CEDAR_SLAB);
        blockItem(JMWCBlocks.COPELAND_CEDAR_LOG_SLAB);
        blockItem(JMWCBlocks.STRIPPED_COPELAND_CEDAR_LOG_SLAB);
        blockItem(JMWCBlocks.COPELAND_CEDAR_FENCE_GATE);
        blockItem(JMWCBlocks.COPELAND_CEDAR_LOG_FENCE_GATE);
        blockItem(JMWCBlocks.COPELAND_CEDAR_BUTTON);
        blockItem(JMWCBlocks.COPELAND_CEDAR_PRESSUREPLATE);
        blockItem(JMWCBlocks.COPELAND_CEDAR_TRAPDOOR, "_bottom");
        blockItem(JMWCBlocks.COPELAND_CEDAR_LOG_TRAPDOOR, "_bottom");
    }

    private void saplingBlock(DeferredBlock<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(BuiltInRegistries.BLOCK.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void leavesBlock(DeferredBlock<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(BuiltInRegistries.BLOCK.getKey(blockRegistryObject.get()).getPath(), ResourceLocation.parse("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }
    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("jacesmegawoodcollection:block/" + deferredBlock.getId().getPath()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock, String appendix) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("jacesmegawoodcollection:block/" + deferredBlock.getId().getPath() + appendix));
    }
}