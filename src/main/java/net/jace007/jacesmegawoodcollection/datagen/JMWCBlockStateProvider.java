package net.jace007.jacesmegawoodcollection.datagen;

import net.jace007.jacesmegawoodcollection.JacesMegaWoodCollection;
import net.jace007.jacesmegawoodcollection.block.JMWCBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

import java.awt.*;
import java.util.function.Function;

public class JMWCBlockStateProvider extends BlockStateProvider {
    public JMWCBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, JacesMegaWoodCollection.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        logBlock(((RotatedPillarBlock) JMWCBlocks.AGRABAH_CEDER_LOG.get()));
        logBlock(((RotatedPillarBlock) JMWCBlocks.STRIPPED_AGRABAH_CEDER_LOG.get()));
        blockWithItem(JMWCBlocks.AGRABAH_CEDER_LOG);
        blockWithItem(JMWCBlocks.STRIPPED_AGRABAH_CEDER_LOG);

        axisBlock(((RotatedPillarBlock) JMWCBlocks.AGRABAH_CEDER_WOOD.get()), blockTexture(JMWCBlocks.AGRABAH_CEDER_LOG.get()), blockTexture(JMWCBlocks.AGRABAH_CEDER_LOG.get()));
        axisBlock(((RotatedPillarBlock) JMWCBlocks.STRIPPED_AGRABAH_CEDER_WOOD.get()), blockTexture(JMWCBlocks.STRIPPED_AGRABAH_CEDER_LOG.get()), blockTexture(JMWCBlocks.STRIPPED_AGRABAH_CEDER_LOG.get()));
        blockWithItem(JMWCBlocks.AGRABAH_CEDER_WOOD);
        blockWithItem(JMWCBlocks.STRIPPED_AGRABAH_CEDER_WOOD);

        blockWithItem(JMWCBlocks.AGRABAH_CEDER_PLANKS);

        leavesBlock(JMWCBlocks.AGRABAH_CEDER_LEAVES);

        saplingBlock(JMWCBlocks.AGRABAH_CEDER_SAPLING);

        stairsBlock(JMWCBlocks.AGRABAH_CEDER_STAIRS.get(), blockTexture(JMWCBlocks.AGRABAH_CEDER_PLANKS.get()));
        stairsBlock(JMWCBlocks.AGRABAH_CEDER_LOG_STAIRS.get(), blockTexture(JMWCBlocks.AGRABAH_CEDER_LOG.get()));
        stairsBlock(JMWCBlocks.STRIPPED_AGRABAH_CEDER_LOG_STAIRS.get(), blockTexture(JMWCBlocks.STRIPPED_AGRABAH_CEDER_LOG.get()));
        blockItem(JMWCBlocks.AGRABAH_CEDER_STAIRS);
        blockItem(JMWCBlocks.AGRABAH_CEDER_LOG_STAIRS);
        blockItem(JMWCBlocks.STRIPPED_AGRABAH_CEDER_LOG_STAIRS);

        slabBlock(JMWCBlocks.AGRABAH_CEDER_SLAB.get(), blockTexture(JMWCBlocks.AGRABAH_CEDER_PLANKS.get()), blockTexture(JMWCBlocks.AGRABAH_CEDER_PLANKS.get()));
        slabBlock(JMWCBlocks.AGRABAH_CEDER_LOG_SLAB.get(), blockTexture(JMWCBlocks.AGRABAH_CEDER_LOG.get()), blockTexture(JMWCBlocks.AGRABAH_CEDER_LOG.get()));
        slabBlock(JMWCBlocks.STRIPPED_AGRABAH_CEDER_LOG_SLAB.get(), blockTexture(JMWCBlocks.STRIPPED_AGRABAH_CEDER_WOOD.get()), blockTexture(JMWCBlocks.STRIPPED_AGRABAH_CEDER_WOOD.get()));
        blockItem(JMWCBlocks.AGRABAH_CEDER_SLAB);
        blockItem(JMWCBlocks.AGRABAH_CEDER_LOG_SLAB);
        blockItem(JMWCBlocks.STRIPPED_AGRABAH_CEDER_LOG_SLAB);

        fenceBlock(JMWCBlocks.AGRABAH_CEDER_FENCE.get(), blockTexture(JMWCBlocks.AGRABAH_CEDER_PLANKS.get()));
        fenceBlock(JMWCBlocks.AGRABAH_CEDER_LOG_FENCE.get(), blockTexture(JMWCBlocks.AGRABAH_CEDER_LOG.get()));

        fenceGateBlock(JMWCBlocks.AGRABAH_CEDER_FENCE_GATE.get(), blockTexture(JMWCBlocks.AGRABAH_CEDER_PLANKS.get()));
        fenceGateBlock(JMWCBlocks.AGRABAH_CEDER_LOG_FENCE_GATE.get(), blockTexture(JMWCBlocks.AGRABAH_CEDER_LOG.get()));

        doorBlockWithRenderType(JMWCBlocks.AGRABAH_CEDER_DOOR.get(), modLoc("block/agrabah_ceder_door_bottom"), modLoc("block/agrabah_ceder_door_top"), "cutout");

        trapdoorBlockWithRenderType(JMWCBlocks.AGRABAH_CEDER_TRAPDOOR.get(), modLoc("block/agrabah_ceder_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType(JMWCBlocks.AGRABAH_CEDER_LOG_TRAPDOOR.get(), modLoc("block/agrabah_ceder_log_trapdoor"), true, "cutout");
        blockItem(JMWCBlocks.AGRABAH_CEDER_TRAPDOOR, "_bottom");
        blockItem(JMWCBlocks.AGRABAH_CEDER_LOG_TRAPDOOR, "_bottom");

        buttonBlock(JMWCBlocks.AGRABAH_CEDER_BUTTON.get(), blockTexture(JMWCBlocks.AGRABAH_CEDER_PLANKS.get()));

        pressurePlateBlock(JMWCBlocks.AGRABAH_CEDER_PRESSUREPLATE.get(), blockTexture(JMWCBlocks.AGRABAH_CEDER_PLANKS.get()));
        blockItem(JMWCBlocks.AGRABAH_CEDER_PRESSUREPLATE);

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