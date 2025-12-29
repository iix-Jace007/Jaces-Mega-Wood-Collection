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
            this.dropSelf(JMWCBlocks.AGRABAH_CEDER_LOG.get());
            this.dropSelf(JMWCBlocks.STRIPPED_AGRABAH_CEDER_LOG.get());

            this.dropSelf(JMWCBlocks.AGRABAH_CEDER_WOOD.get());
            this.dropSelf(JMWCBlocks.STRIPPED_AGRABAH_CEDER_WOOD.get());

            this.dropSelf(JMWCBlocks.AGRABAH_CEDER_PLANKS.get());

            this.dropSelf(JMWCBlocks.AGRABAH_CEDER_SAPLING.get());

            this.add(JMWCBlocks.AGRABAH_CEDER_LEAVES.get(),block ->
                    createLeavesDrops(block, JMWCBlocks.AGRABAH_CEDER_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

            dropSelf(JMWCBlocks.AGRABAH_CEDER_STAIRS.get());
            dropSelf(JMWCBlocks.AGRABAH_CEDER_LOG_STAIRS.get());
            dropSelf(JMWCBlocks.STRIPPED_AGRABAH_CEDER_LOG_STAIRS.get());

            add(JMWCBlocks.AGRABAH_CEDER_SLAB.get(),
                    block -> createSlabItemTable(JMWCBlocks.AGRABAH_CEDER_SLAB.get()));
            add(JMWCBlocks.AGRABAH_CEDER_LOG_SLAB.get(),
                    block -> createSlabItemTable(JMWCBlocks.AGRABAH_CEDER_LOG_SLAB.get()));
            add(JMWCBlocks.STRIPPED_AGRABAH_CEDER_LOG_SLAB.get(),
                    block -> createSlabItemTable(JMWCBlocks.STRIPPED_AGRABAH_CEDER_LOG_SLAB.get()));

            dropSelf(JMWCBlocks.AGRABAH_CEDER_FENCE.get());
            dropSelf(JMWCBlocks.AGRABAH_CEDER_LOG_FENCE.get());

            dropSelf(JMWCBlocks.AGRABAH_CEDER_FENCE_GATE.get());
            dropSelf(JMWCBlocks.AGRABAH_CEDER_LOG_FENCE_GATE.get());

            add(JMWCBlocks.AGRABAH_CEDER_DOOR.get(),
                    block -> createDoorTable(JMWCBlocks.AGRABAH_CEDER_DOOR.get()));

            dropSelf(JMWCBlocks.AGRABAH_CEDER_TRAPDOOR.get());
            dropSelf(JMWCBlocks.AGRABAH_CEDER_LOG_TRAPDOOR.get());

            dropSelf(JMWCBlocks.AGRABAH_CEDER_BUTTON.get());

            dropSelf(JMWCBlocks.AGRABAH_CEDER_PRESSUREPLATE.get());

        }


        @Override
        protected Iterable<Block> getKnownBlocks() {
            return JMWCBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
        }
    }
