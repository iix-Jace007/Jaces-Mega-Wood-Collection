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

        logBlock(((RotatedPillarBlock) JMWCBlocks.AGRABAH_CEDAR_LOG.get()));
        axisBlock(((RotatedPillarBlock) JMWCBlocks.AGRABAH_CEDAR_WOOD.get()),
                blockTexture(JMWCBlocks.AGRABAH_CEDAR_LOG.get()), blockTexture(JMWCBlocks.AGRABAH_CEDAR_LOG.get()));
        logBlock(((RotatedPillarBlock) JMWCBlocks.STRIPPED_AGRABAH_CEDAR_LOG.get()));
        axisBlock(((RotatedPillarBlock) JMWCBlocks.STRIPPED_AGRABAH_CEDAR_WOOD.get()),
                blockTexture(JMWCBlocks.STRIPPED_AGRABAH_CEDAR_LOG.get()), blockTexture(JMWCBlocks.STRIPPED_AGRABAH_CEDAR_LOG.get()));
        logBlock(((RotatedPillarBlock) JMWCBlocks.ALLMEN_OAK_LOG.get()));
        axisBlock(((RotatedPillarBlock) JMWCBlocks.ALLMEN_OAK_WOOD.get()),
                blockTexture(JMWCBlocks.ALLMEN_OAK_LOG.get()), blockTexture(JMWCBlocks.ALLMEN_OAK_LOG.get()));
        logBlock(((RotatedPillarBlock) JMWCBlocks.STRIPPED_ALLMEN_OAK_LOG.get()));
        axisBlock(((RotatedPillarBlock) JMWCBlocks.STRIPPED_ALLMEN_OAK_WOOD.get()),
                blockTexture(JMWCBlocks.STRIPPED_ALLMEN_OAK_LOG.get()), blockTexture(JMWCBlocks.STRIPPED_ALLMEN_OAK_LOG.get()));
        logBlock(((RotatedPillarBlock) JMWCBlocks.AUDRAFLORA_OAK_LOG.get()));
        axisBlock(((RotatedPillarBlock) JMWCBlocks.AUDRAFLORA_OAK_WOOD.get()),
                blockTexture(JMWCBlocks.AUDRAFLORA_OAK_LOG.get()), blockTexture(JMWCBlocks.AUDRAFLORA_OAK_LOG.get()));
        logBlock(((RotatedPillarBlock) JMWCBlocks.STRIPPED_AUDRAFLORA_OAK_LOG.get()));
        axisBlock(((RotatedPillarBlock) JMWCBlocks.STRIPPED_AUDRAFLORA_OAK_WOOD.get()),
                blockTexture(JMWCBlocks.STRIPPED_AUDRAFLORA_OAK_LOG.get()), blockTexture(JMWCBlocks.STRIPPED_AUDRAFLORA_OAK_LOG.get()));

        blockItem(JMWCBlocks.AGRABAH_CEDAR_LOG);
        blockItem(JMWCBlocks.AGRABAH_CEDAR_WOOD);
        blockItem(JMWCBlocks.STRIPPED_AGRABAH_CEDAR_LOG);
        blockItem(JMWCBlocks.STRIPPED_AGRABAH_CEDAR_WOOD);
        blockItem(JMWCBlocks.ALLMEN_OAK_LOG);
        blockItem(JMWCBlocks.ALLMEN_OAK_WOOD);
        blockItem(JMWCBlocks.STRIPPED_ALLMEN_OAK_LOG);
        blockItem(JMWCBlocks.STRIPPED_ALLMEN_OAK_WOOD);
        blockItem(JMWCBlocks.AUDRAFLORA_OAK_LOG);
        blockItem(JMWCBlocks.AUDRAFLORA_OAK_WOOD);
        blockItem(JMWCBlocks.STRIPPED_AUDRAFLORA_OAK_LOG);
        blockItem(JMWCBlocks.STRIPPED_AUDRAFLORA_OAK_WOOD);

        blockWithItem(JMWCBlocks.AGRABAH_CEDAR_PLANKS);
        blockWithItem(JMWCBlocks.ALLMEN_OAK_PLANKS);
        blockWithItem(JMWCBlocks.AUDRAFLORA_OAK_PLANKS);

        leavesBlock(JMWCBlocks.AGRABAH_CEDAR_LEAVES);
        leavesBlock(JMWCBlocks.ALLMEN_OAK_LEAVES);
        leavesBlock(JMWCBlocks.AUDRAFLORA_OAK_LEAVES);

        saplingBlock(JMWCBlocks.AGRABAH_CEDAR_SAPLING);
        saplingBlock(JMWCBlocks.ALLMEN_OAK_SAPLING);
        saplingBlock(JMWCBlocks.AUDRAFLORA_OAK_SAPLING);

        stairsBlock(JMWCBlocks.AGRABAH_CEDAR_STAIRS.get(), blockTexture(JMWCBlocks.AGRABAH_CEDAR_PLANKS.get()));
        stairsBlock(JMWCBlocks.AGRABAH_CEDAR_LOG_STAIRS.get(), blockTexture(JMWCBlocks.AGRABAH_CEDAR_LOG.get()));
        stairsBlock(JMWCBlocks.STRIPPED_AGRABAH_CEDAR_LOG_STAIRS.get(), blockTexture(JMWCBlocks.STRIPPED_AGRABAH_CEDAR_LOG.get()));
        stairsBlock(JMWCBlocks.ALLMEN_OAK_STAIRS.get(), blockTexture(JMWCBlocks.ALLMEN_OAK_PLANKS.get()));
        stairsBlock(JMWCBlocks.ALLMEN_OAK_LOG_STAIRS.get(), blockTexture(JMWCBlocks.ALLMEN_OAK_LOG.get()));
        stairsBlock(JMWCBlocks.STRIPPED_ALLMEN_OAK_LOG_STAIRS.get(), blockTexture(JMWCBlocks.STRIPPED_ALLMEN_OAK_LOG.get()));
        stairsBlock(JMWCBlocks.AUDRAFLORA_OAK_STAIRS.get(), blockTexture(JMWCBlocks.AUDRAFLORA_OAK_PLANKS.get()));
        stairsBlock(JMWCBlocks.AUDRAFLORA_OAK_LOG_STAIRS.get(), blockTexture(JMWCBlocks.AUDRAFLORA_OAK_LOG.get()));
        stairsBlock(JMWCBlocks.STRIPPED_AUDRAFLORA_OAK_LOG_STAIRS.get(), blockTexture(JMWCBlocks.STRIPPED_AUDRAFLORA_OAK_LOG.get()));

        slabBlock(JMWCBlocks.AGRABAH_CEDAR_SLAB.get(),
                blockTexture(JMWCBlocks.AGRABAH_CEDAR_PLANKS.get()), blockTexture(JMWCBlocks.AGRABAH_CEDAR_PLANKS.get()));
        slabBlock(JMWCBlocks.AGRABAH_CEDAR_LOG_SLAB.get(),
                blockTexture(JMWCBlocks.AGRABAH_CEDAR_LOG.get()), blockTexture(JMWCBlocks.AGRABAH_CEDAR_LOG.get()));
        slabBlock(JMWCBlocks.STRIPPED_AGRABAH_CEDAR_LOG_SLAB.get(),
                blockTexture(JMWCBlocks.STRIPPED_AGRABAH_CEDAR_LOG.get()), blockTexture(JMWCBlocks.STRIPPED_AGRABAH_CEDAR_LOG.get()));
        slabBlock(JMWCBlocks.ALLMEN_OAK_SLAB.get(),
                blockTexture(JMWCBlocks.ALLMEN_OAK_PLANKS.get()), blockTexture(JMWCBlocks.ALLMEN_OAK_PLANKS.get()));
        slabBlock(JMWCBlocks.ALLMEN_OAK_LOG_SLAB.get(),
                blockTexture(JMWCBlocks.ALLMEN_OAK_LOG.get()), blockTexture(JMWCBlocks.ALLMEN_OAK_LOG.get()));
        slabBlock(JMWCBlocks.STRIPPED_ALLMEN_OAK_LOG_SLAB.get(),
                blockTexture(JMWCBlocks.STRIPPED_ALLMEN_OAK_LOG.get()), blockTexture(JMWCBlocks.STRIPPED_ALLMEN_OAK_LOG.get()));
        slabBlock(JMWCBlocks.AUDRAFLORA_OAK_SLAB.get(),
                blockTexture(JMWCBlocks.AUDRAFLORA_OAK_PLANKS.get()), blockTexture(JMWCBlocks.AUDRAFLORA_OAK_PLANKS.get()));
        slabBlock(JMWCBlocks.AUDRAFLORA_OAK_LOG_SLAB.get(),
                blockTexture(JMWCBlocks.AUDRAFLORA_OAK_LOG.get()), blockTexture(JMWCBlocks.AUDRAFLORA_OAK_LOG.get()));
        slabBlock(JMWCBlocks.STRIPPED_AUDRAFLORA_OAK_LOG_SLAB.get(),
                blockTexture(JMWCBlocks.STRIPPED_AUDRAFLORA_OAK_LOG.get()), blockTexture(JMWCBlocks.STRIPPED_AUDRAFLORA_OAK_LOG.get()));

        buttonBlock(JMWCBlocks.AGRABAH_CEDAR_BUTTON.get(), blockTexture(JMWCBlocks.AGRABAH_CEDAR_PLANKS.get()));
        buttonBlock(JMWCBlocks.ALLMEN_OAK_BUTTON.get(), blockTexture(JMWCBlocks.ALLMEN_OAK_PLANKS.get()));
        buttonBlock(JMWCBlocks.AUDRAFLORA_OAK_BUTTON.get(), blockTexture(JMWCBlocks.AUDRAFLORA_OAK_PLANKS.get()));

        pressurePlateBlock(JMWCBlocks.AGRABAH_CEDAR_PRESSUREPLATE.get(), blockTexture(JMWCBlocks.AGRABAH_CEDAR_PLANKS.get()));
        pressurePlateBlock(JMWCBlocks.ALLMEN_OAK_PRESSUREPLATE.get(), blockTexture(JMWCBlocks.ALLMEN_OAK_PLANKS.get()));
        pressurePlateBlock(JMWCBlocks.AUDRAFLORA_OAK_PRESSUREPLATE.get(), blockTexture(JMWCBlocks.AUDRAFLORA_OAK_PLANKS.get()));

        fenceBlock(JMWCBlocks.AGRABAH_CEDAR_FENCE.get(), blockTexture(JMWCBlocks.AGRABAH_CEDAR_PLANKS.get()));
        fenceBlock(JMWCBlocks.AGRABAH_CEDAR_LOG_FENCE.get(), blockTexture(JMWCBlocks.AGRABAH_CEDAR_LOG.get()));
        fenceBlock(JMWCBlocks.ALLMEN_OAK_FENCE.get(), blockTexture(JMWCBlocks.ALLMEN_OAK_PLANKS.get()));
        fenceBlock(JMWCBlocks.ALLMEN_OAK_LOG_FENCE.get(), blockTexture(JMWCBlocks.ALLMEN_OAK_LOG.get()));
        fenceBlock(JMWCBlocks.AUDRAFLORA_OAK_FENCE.get(), blockTexture(JMWCBlocks.AUDRAFLORA_OAK_PLANKS.get()));
        fenceBlock(JMWCBlocks.AUDRAFLORA_OAK_LOG_FENCE.get(), blockTexture(JMWCBlocks.AUDRAFLORA_OAK_LOG.get()));

        fenceGateBlock(JMWCBlocks.AGRABAH_CEDAR_FENCE_GATE.get(), blockTexture(JMWCBlocks.AGRABAH_CEDAR_PLANKS.get()));
        fenceGateBlock(JMWCBlocks.AGRABAH_CEDAR_LOG_FENCE_GATE.get(), blockTexture(JMWCBlocks.AGRABAH_CEDAR_LOG.get()));
        fenceGateBlock(JMWCBlocks.ALLMEN_OAK_FENCE_GATE.get(), blockTexture(JMWCBlocks.ALLMEN_OAK_PLANKS.get()));
        fenceGateBlock(JMWCBlocks.ALLMEN_OAK_LOG_FENCE_GATE.get(), blockTexture(JMWCBlocks.ALLMEN_OAK_LOG.get()));
        fenceGateBlock(JMWCBlocks.AUDRAFLORA_OAK_FENCE_GATE.get(), blockTexture(JMWCBlocks.AUDRAFLORA_OAK_PLANKS.get()));
        fenceGateBlock(JMWCBlocks.AUDRAFLORA_OAK_LOG_FENCE_GATE.get(), blockTexture(JMWCBlocks.AUDRAFLORA_OAK_LOG.get()));

        doorBlockWithRenderType(JMWCBlocks.AGRABAH_CEDAR_DOOR.get(),
                modLoc("block/agrabah_cedar_door_bottom"), modLoc("block/agrabah_cedar_door_top"), "cutout");
        doorBlockWithRenderType(JMWCBlocks.ALLMEN_OAK_DOOR.get(),
                modLoc("block/allmen_oak_door_bottom"), modLoc("block/allmen_oak_door_top"), "cutout");
        doorBlockWithRenderType(JMWCBlocks.AUDRAFLORA_OAK_DOOR.get(),
                modLoc("block/audraflora_oak_door_bottom"), modLoc("block/audraflora_oak_door_top"), "cutout");

        trapdoorBlockWithRenderType(JMWCBlocks.AGRABAH_CEDAR_TRAPDOOR.get(),
                modLoc("block/agrabah_cedar_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType(JMWCBlocks.AGRABAH_CEDAR_LOG_TRAPDOOR.get(),
                modLoc("block/agrabah_cedar_log_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType(JMWCBlocks.ALLMEN_OAK_TRAPDOOR.get(),
                modLoc("block/allmen_oak_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType(JMWCBlocks.ALLMEN_OAK_LOG_TRAPDOOR.get(),
                modLoc("block/allmen_oak_log_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType(JMWCBlocks.AUDRAFLORA_OAK_TRAPDOOR.get(),
                modLoc("block/audraflora_oak_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType(JMWCBlocks.AUDRAFLORA_OAK_LOG_TRAPDOOR.get(),
                modLoc("block/audraflora_oak_log_trapdoor"), true, "cutout");

        blockItem(JMWCBlocks.AGRABAH_CEDAR_STAIRS);
        blockItem(JMWCBlocks.AGRABAH_CEDAR_LOG_STAIRS);
        blockItem(JMWCBlocks.STRIPPED_AGRABAH_CEDAR_LOG_STAIRS);
        blockItem(JMWCBlocks.ALLMEN_OAK_STAIRS);
        blockItem(JMWCBlocks.ALLMEN_OAK_LOG_STAIRS);
        blockItem(JMWCBlocks.STRIPPED_ALLMEN_OAK_LOG_STAIRS);
        blockItem(JMWCBlocks.AUDRAFLORA_OAK_STAIRS);
        blockItem(JMWCBlocks.AUDRAFLORA_OAK_LOG_STAIRS);
        blockItem(JMWCBlocks.STRIPPED_AUDRAFLORA_OAK_LOG_STAIRS);

        blockItem(JMWCBlocks.AGRABAH_CEDAR_SLAB);
        blockItem(JMWCBlocks.AGRABAH_CEDAR_LOG_SLAB);
        blockItem(JMWCBlocks.STRIPPED_AGRABAH_CEDAR_LOG_SLAB);
        blockItem(JMWCBlocks.ALLMEN_OAK_SLAB);
        blockItem(JMWCBlocks.ALLMEN_OAK_LOG_SLAB);
        blockItem(JMWCBlocks.STRIPPED_ALLMEN_OAK_LOG_SLAB);
        blockItem(JMWCBlocks.AUDRAFLORA_OAK_SLAB);
        blockItem(JMWCBlocks.AUDRAFLORA_OAK_LOG_SLAB);
        blockItem(JMWCBlocks.STRIPPED_AUDRAFLORA_OAK_LOG_SLAB);

        blockItem(JMWCBlocks.AGRABAH_CEDAR_FENCE_GATE);
        blockItem(JMWCBlocks.AGRABAH_CEDAR_LOG_FENCE_GATE);
        blockItem(JMWCBlocks.ALLMEN_OAK_FENCE_GATE);
        blockItem(JMWCBlocks.ALLMEN_OAK_LOG_FENCE_GATE);
        blockItem(JMWCBlocks.AUDRAFLORA_OAK_FENCE_GATE);
        blockItem(JMWCBlocks.AUDRAFLORA_OAK_LOG_FENCE_GATE);

        blockItem(JMWCBlocks.AGRABAH_CEDAR_BUTTON);
        blockItem(JMWCBlocks.ALLMEN_OAK_BUTTON);
        blockItem(JMWCBlocks.AUDRAFLORA_OAK_BUTTON);

        blockItem(JMWCBlocks.AGRABAH_CEDAR_PRESSUREPLATE);
        blockItem(JMWCBlocks.ALLMEN_OAK_PRESSUREPLATE);
        blockItem(JMWCBlocks.AUDRAFLORA_OAK_PRESSUREPLATE);

        blockItem(JMWCBlocks.AGRABAH_CEDAR_TRAPDOOR, "_bottom");
        blockItem(JMWCBlocks.AGRABAH_CEDAR_LOG_TRAPDOOR, "_bottom");
        blockItem(JMWCBlocks.ALLMEN_OAK_TRAPDOOR, "_bottom");
        blockItem(JMWCBlocks.ALLMEN_OAK_LOG_TRAPDOOR, "_bottom");
        blockItem(JMWCBlocks.AUDRAFLORA_OAK_TRAPDOOR, "_bottom");
        blockItem(JMWCBlocks.AUDRAFLORA_OAK_LOG_TRAPDOOR, "_bottom");

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
