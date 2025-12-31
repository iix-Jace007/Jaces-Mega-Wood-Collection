package net.jace007.jacesmegawoodcollection.datagen;

import net.jace007.jacesmegawoodcollection.block.JMWCBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import java.util.Set;

    public class JMWCBlockLootTableProvider extends BlockLootSubProvider {
        protected JMWCBlockLootTableProvider(HolderLookup.Provider registries) {
            super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
        }

        @Override
        protected void generate() {
            this.dropSelf(JMWCBlocks.AGRABAH_CEDAR_LOG.get());
            this.dropSelf(JMWCBlocks.STRIPPED_AGRABAH_CEDAR_LOG.get());
            this.dropSelf(JMWCBlocks.ALLMEN_OAK_LOG.get());
            this.dropSelf(JMWCBlocks.STRIPPED_ALLMEN_OAK_LOG.get());

            this.dropSelf(JMWCBlocks.AGRABAH_CEDAR_WOOD.get());
            this.dropSelf(JMWCBlocks.STRIPPED_AGRABAH_CEDAR_WOOD.get());
            this.dropSelf(JMWCBlocks.ALLMEN_OAK_WOOD.get());
            this.dropSelf(JMWCBlocks.STRIPPED_ALLMEN_OAK_WOOD.get());

            this.dropSelf(JMWCBlocks.AGRABAH_CEDAR_PLANKS.get());
            this.dropSelf(JMWCBlocks.ALLMEN_OAK_PLANKS.get());

            this.dropSelf(JMWCBlocks.AGRABAH_CEDAR_SAPLING.get());
            this.dropSelf(JMWCBlocks.ALLMEN_OAK_SAPLING.get());

            this.add(JMWCBlocks.AGRABAH_CEDAR_LEAVES.get(), block ->
                    createLeavesDrops(block, JMWCBlocks.AGRABAH_CEDAR_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
            this.add(JMWCBlocks.ALLMEN_OAK_LEAVES.get(), block ->
                    createLeavesDrops(block, JMWCBlocks.ALLMEN_OAK_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

            dropSelf(JMWCBlocks.AGRABAH_CEDAR_STAIRS.get());
            dropSelf(JMWCBlocks.AGRABAH_CEDAR_LOG_STAIRS.get());
            dropSelf(JMWCBlocks.STRIPPED_AGRABAH_CEDAR_LOG_STAIRS.get());
            dropSelf(JMWCBlocks.ALLMEN_OAK_STAIRS.get());
            dropSelf(JMWCBlocks.ALLMEN_OAK_LOG_STAIRS.get());
            dropSelf(JMWCBlocks.STRIPPED_ALLMEN_OAK_LOG_STAIRS.get());

            add(JMWCBlocks.AGRABAH_CEDAR_SLAB.get(),
                    block -> createSlabItemTable(JMWCBlocks.AGRABAH_CEDAR_SLAB.get()));
            add(JMWCBlocks.AGRABAH_CEDAR_LOG_SLAB.get(),
                    block -> createSlabItemTable(JMWCBlocks.AGRABAH_CEDAR_LOG_SLAB.get()));
            add(JMWCBlocks.STRIPPED_AGRABAH_CEDAR_LOG_SLAB.get(),
                    block -> createSlabItemTable(JMWCBlocks.STRIPPED_AGRABAH_CEDAR_LOG_SLAB.get()));
            add(JMWCBlocks.ALLMEN_OAK_SLAB.get(),
                    block -> createSlabItemTable(JMWCBlocks.ALLMEN_OAK_SLAB.get()));
            add(JMWCBlocks.ALLMEN_OAK_LOG_SLAB.get(),
                    block -> createSlabItemTable(JMWCBlocks.ALLMEN_OAK_LOG_SLAB.get()));
            add(JMWCBlocks.STRIPPED_ALLMEN_OAK_LOG_SLAB.get(),
                    block -> createSlabItemTable(JMWCBlocks.STRIPPED_ALLMEN_OAK_LOG_SLAB.get()));

            dropSelf(JMWCBlocks.AGRABAH_CEDAR_FENCE.get());
            dropSelf(JMWCBlocks.AGRABAH_CEDAR_LOG_FENCE.get());
            dropSelf(JMWCBlocks.ALLMEN_OAK_FENCE.get());
            dropSelf(JMWCBlocks.ALLMEN_OAK_LOG_FENCE.get());

            dropSelf(JMWCBlocks.AGRABAH_CEDAR_FENCE_GATE.get());
            dropSelf(JMWCBlocks.AGRABAH_CEDAR_LOG_FENCE_GATE.get());
            dropSelf(JMWCBlocks.ALLMEN_OAK_FENCE_GATE.get());
            dropSelf(JMWCBlocks.ALLMEN_OAK_LOG_FENCE_GATE.get());

            add(JMWCBlocks.AGRABAH_CEDAR_DOOR.get(),
                    block -> createDoorTable(JMWCBlocks.AGRABAH_CEDAR_DOOR.get()));
            add(JMWCBlocks.ALLMEN_OAK_DOOR.get(),
                    block -> createDoorTable(JMWCBlocks.ALLMEN_OAK_DOOR.get()));

            dropSelf(JMWCBlocks.AGRABAH_CEDAR_TRAPDOOR.get());
            dropSelf(JMWCBlocks.AGRABAH_CEDAR_LOG_TRAPDOOR.get());
            dropSelf(JMWCBlocks.ALLMEN_OAK_TRAPDOOR.get());
            dropSelf(JMWCBlocks.ALLMEN_OAK_LOG_TRAPDOOR.get());

            dropSelf(JMWCBlocks.AGRABAH_CEDAR_BUTTON.get());
            dropSelf(JMWCBlocks.ALLMEN_OAK_BUTTON.get());

            dropSelf(JMWCBlocks.AGRABAH_CEDAR_PRESSUREPLATE.get());
            dropSelf(JMWCBlocks.ALLMEN_OAK_PRESSUREPLATE.get());

        }


        @Override
        protected Iterable<Block> getKnownBlocks() {
            return JMWCBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
        }
    }
