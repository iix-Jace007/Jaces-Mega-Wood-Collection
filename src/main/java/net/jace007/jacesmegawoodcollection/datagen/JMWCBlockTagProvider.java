package net.jace007.jacesmegawoodcollection.datagen;

import net.jace007.jacesmegawoodcollection.JacesMegaWoodCollection;
import net.jace007.jacesmegawoodcollection.block.JMWCBlocks;
import net.jace007.jacesmegawoodcollection.util.JMWCTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import javax.swing.text.html.HTML;
import java.util.concurrent.CompletableFuture;

public class JMWCBlockTagProvider extends BlockTagsProvider {
    public JMWCBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, JacesMegaWoodCollection.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(JMWCTags.Blocks.AGRABAH_CEDER)
                .add(JMWCBlocks.AGRABAH_CEDER_LOG.get())
                .add(JMWCBlocks.STRIPPED_AGRABAH_CEDER_LOG.get())
                .add(JMWCBlocks.AGRABAH_CEDER_WOOD.get())
                .add(JMWCBlocks.STRIPPED_AGRABAH_CEDER_WOOD.get())
                .add(JMWCBlocks.AGRABAH_CEDER_PLANKS.get())
                .add(JMWCBlocks.AGRABAH_CEDER_STAIRS.get())
                .add(JMWCBlocks.AGRABAH_CEDER_LOG_STAIRS.get())
                .add(JMWCBlocks.STRIPPED_AGRABAH_CEDER_LOG_STAIRS.get())
                .add(JMWCBlocks.AGRABAH_CEDER_SLAB.get())
                .add(JMWCBlocks.AGRABAH_CEDER_LOG_SLAB.get())
                .add(JMWCBlocks.STRIPPED_AGRABAH_CEDER_LOG_SLAB.get())
                .add(JMWCBlocks.AGRABAH_CEDER_FENCE.get())
                .add(JMWCBlocks.AGRABAH_CEDER_LOG_FENCE.get())
                .add(JMWCBlocks.AGRABAH_CEDER_FENCE_GATE.get())
                .add(JMWCBlocks.AGRABAH_CEDER_LOG_FENCE_GATE.get())
                .add(JMWCBlocks.AGRABAH_CEDER_DOOR.get())
                .add(JMWCBlocks.AGRABAH_CEDER_TRAPDOOR.get())
                .add(JMWCBlocks.AGRABAH_CEDER_LOG_TRAPDOOR.get())
                .add(JMWCBlocks.AGRABAH_CEDER_BUTTON.get())
                .add(JMWCBlocks.AGRABAH_CEDER_PRESSUREPLATE.get());

        tag(JMWCTags.Blocks.AGRABAH_CEDER_LOGS)
                .add(JMWCBlocks.AGRABAH_CEDER_LOG.get())
                .add(JMWCBlocks.STRIPPED_AGRABAH_CEDER_LOG.get())
                .add(JMWCBlocks.AGRABAH_CEDER_WOOD.get())
                .add(JMWCBlocks.STRIPPED_AGRABAH_CEDER_WOOD.get());

        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(JMWCBlocks.AGRABAH_CEDER_LOG.get())
                .add(JMWCBlocks.STRIPPED_AGRABAH_CEDER_LOG.get())
                .add(JMWCBlocks.AGRABAH_CEDER_WOOD.get())
                .add(JMWCBlocks.STRIPPED_AGRABAH_CEDER_WOOD.get());

        tag(BlockTags.LOGS)
                .add(JMWCBlocks.AGRABAH_CEDER_LOG.get())
                .add(JMWCBlocks.STRIPPED_AGRABAH_CEDER_LOG.get())
                .add(JMWCBlocks.AGRABAH_CEDER_WOOD.get())
                .add(JMWCBlocks.STRIPPED_AGRABAH_CEDER_WOOD.get());

        tag(BlockTags.BUTTONS)
                .add(JMWCBlocks.AGRABAH_CEDER_BUTTON.get());

        tag(BlockTags.COMPLETES_FIND_TREE_TUTORIAL)
                .add(JMWCBlocks.AGRABAH_CEDER_LOG.get());

        tag(BlockTags.DOORS)
                .add(JMWCBlocks.AGRABAH_CEDER_DOOR.get());

        tag(BlockTags.FENCE_GATES)
                .add(JMWCBlocks.AGRABAH_CEDER_FENCE_GATE.get())
                .add(JMWCBlocks.AGRABAH_CEDER_LOG_FENCE_GATE.get());

        tag(BlockTags.FENCES)
                .add(JMWCBlocks.AGRABAH_CEDER_FENCE.get())
                .add(JMWCBlocks.AGRABAH_CEDER_LOG_FENCE.get());

        tag(BlockTags.LEAVES)
                .add(JMWCBlocks.AGRABAH_CEDER_LEAVES.get());

        tag(BlockTags.PLANKS)
                .add(JMWCBlocks.AGRABAH_CEDER_PLANKS.get());

        tag(BlockTags.PRESSURE_PLATES)
                .add(JMWCBlocks.AGRABAH_CEDER_PRESSUREPLATE.get());

        tag(BlockTags.SAPLINGS)
                .add(JMWCBlocks.AGRABAH_CEDER_SAPLING.get());

        tag(BlockTags.SLABS)
                .add(JMWCBlocks.AGRABAH_CEDER_SLAB.get())
                .add(JMWCBlocks.AGRABAH_CEDER_LOG_SLAB.get())
                .add(JMWCBlocks.STRIPPED_AGRABAH_CEDER_LOG_SLAB.get());

        tag(BlockTags.STAIRS)
                .add(JMWCBlocks.AGRABAH_CEDER_STAIRS.get())
                .add(JMWCBlocks.AGRABAH_CEDER_LOG_STAIRS.get())
                .add(JMWCBlocks.STRIPPED_AGRABAH_CEDER_LOG_STAIRS.get());

        tag(BlockTags.TRAPDOORS)
                .add(JMWCBlocks.AGRABAH_CEDER_TRAPDOOR.get())
                .add(JMWCBlocks.AGRABAH_CEDER_LOG_TRAPDOOR.get());

        tag(BlockTags.WOODEN_BUTTONS)
                .add(JMWCBlocks.AGRABAH_CEDER_BUTTON.get());

        tag(BlockTags.WOODEN_DOORS)
                .add(JMWCBlocks.AGRABAH_CEDER_DOOR.get());

        tag(BlockTags.WOODEN_FENCES)
                .add(JMWCBlocks.AGRABAH_CEDER_FENCE.get())
                .add(JMWCBlocks.AGRABAH_CEDER_LOG_FENCE.get());

        tag(BlockTags.WOODEN_SLABS)
                .add(JMWCBlocks.AGRABAH_CEDER_SLAB.get())
                .add(JMWCBlocks.AGRABAH_CEDER_LOG_SLAB.get())
                .add(JMWCBlocks.STRIPPED_AGRABAH_CEDER_LOG_SLAB.get());

        tag(BlockTags.WOODEN_STAIRS)
                .add(JMWCBlocks.AGRABAH_CEDER_STAIRS.get())
                .add(JMWCBlocks.AGRABAH_CEDER_LOG_STAIRS.get())
                .add(JMWCBlocks.STRIPPED_AGRABAH_CEDER_LOG_STAIRS.get());

        tag(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(JMWCBlocks.AGRABAH_CEDER_PRESSUREPLATE.get());

        tag(BlockTags.WOODEN_TRAPDOORS)
                .add(JMWCBlocks.AGRABAH_CEDER_TRAPDOOR.get())
                .add(JMWCBlocks.AGRABAH_CEDER_LOG_TRAPDOOR.get());

    }
}