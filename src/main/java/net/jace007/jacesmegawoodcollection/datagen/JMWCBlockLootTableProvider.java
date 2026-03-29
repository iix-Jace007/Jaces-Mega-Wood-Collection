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

            // AGRABAH_CEDAR
            this.dropSelf(JMWCBlocks.AGRABAH_CEDAR_LOG.get());
            this.dropSelf(JMWCBlocks.STRIPPED_AGRABAH_CEDAR_LOG.get());
            this.dropSelf(JMWCBlocks.AGRABAH_CEDAR_WOOD.get());
            this.dropSelf(JMWCBlocks.STRIPPED_AGRABAH_CEDAR_WOOD.get());
            this.dropSelf(JMWCBlocks.AGRABAH_CEDAR_PLANKS.get());
            this.dropSelf(JMWCBlocks.AGRABAH_CEDAR_SAPLING.get());
            this.add(JMWCBlocks.AGRABAH_CEDAR_LEAVES.get(), block ->
                    createLeavesDrops(block, JMWCBlocks.AGRABAH_CEDAR_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
            dropSelf(JMWCBlocks.AGRABAH_CEDAR_STAIRS.get());
            dropSelf(JMWCBlocks.AGRABAH_CEDAR_LOG_STAIRS.get());
            dropSelf(JMWCBlocks.STRIPPED_AGRABAH_CEDAR_LOG_STAIRS.get());
            add(JMWCBlocks.AGRABAH_CEDAR_SLAB.get(),
                    block -> createSlabItemTable(JMWCBlocks.AGRABAH_CEDAR_SLAB.get()));
            add(JMWCBlocks.AGRABAH_CEDAR_LOG_SLAB.get(),
                    block -> createSlabItemTable(JMWCBlocks.AGRABAH_CEDAR_LOG_SLAB.get()));
            add(JMWCBlocks.STRIPPED_AGRABAH_CEDAR_LOG_SLAB.get(),
                    block -> createSlabItemTable(JMWCBlocks.STRIPPED_AGRABAH_CEDAR_LOG_SLAB.get()));
            dropSelf(JMWCBlocks.AGRABAH_CEDAR_FENCE.get());
            dropSelf(JMWCBlocks.AGRABAH_CEDAR_LOG_FENCE.get());
            dropSelf(JMWCBlocks.AGRABAH_CEDAR_FENCE_GATE.get());
            dropSelf(JMWCBlocks.AGRABAH_CEDAR_LOG_FENCE_GATE.get());
            add(JMWCBlocks.AGRABAH_CEDAR_DOOR.get(),
                    block -> createDoorTable(JMWCBlocks.AGRABAH_CEDAR_DOOR.get()));
            dropSelf(JMWCBlocks.AGRABAH_CEDAR_TRAPDOOR.get());
            dropSelf(JMWCBlocks.AGRABAH_CEDAR_LOG_TRAPDOOR.get());
            dropSelf(JMWCBlocks.AGRABAH_CEDAR_BUTTON.get());
            dropSelf(JMWCBlocks.AGRABAH_CEDAR_PRESSUREPLATE.get());

            // ALANTH
            this.dropSelf(JMWCBlocks.ALANTH_LOG.get());
            this.dropSelf(JMWCBlocks.STRIPPED_ALANTH_LOG.get());
            this.dropSelf(JMWCBlocks.ALANTH_WOOD.get());
            this.dropSelf(JMWCBlocks.STRIPPED_ALANTH_WOOD.get());
            this.dropSelf(JMWCBlocks.ALANTH_PLANKS.get());
            this.dropSelf(JMWCBlocks.ALANTH_SAPLING.get());
            this.add(JMWCBlocks.ALANTH_LEAVES.get(), block ->
                    createLeavesDrops(block, JMWCBlocks.ALANTH_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
            dropSelf(JMWCBlocks.ALANTH_STAIRS.get());
            dropSelf(JMWCBlocks.ALANTH_LOG_STAIRS.get());
            dropSelf(JMWCBlocks.STRIPPED_ALANTH_LOG_STAIRS.get());
            add(JMWCBlocks.ALANTH_SLAB.get(),
                    block -> createSlabItemTable(JMWCBlocks.ALANTH_SLAB.get()));
            add(JMWCBlocks.ALANTH_LOG_SLAB.get(),
                    block -> createSlabItemTable(JMWCBlocks.ALANTH_LOG_SLAB.get()));
            add(JMWCBlocks.STRIPPED_ALANTH_LOG_SLAB.get(),
                    block -> createSlabItemTable(JMWCBlocks.STRIPPED_ALANTH_LOG_SLAB.get()));
            dropSelf(JMWCBlocks.ALANTH_FENCE.get());
            dropSelf(JMWCBlocks.ALANTH_LOG_FENCE.get());
            dropSelf(JMWCBlocks.ALANTH_FENCE_GATE.get());
            dropSelf(JMWCBlocks.ALANTH_LOG_FENCE_GATE.get());
            add(JMWCBlocks.ALANTH_DOOR.get(),
                    block -> createDoorTable(JMWCBlocks.ALANTH_DOOR.get()));
            dropSelf(JMWCBlocks.ALANTH_TRAPDOOR.get());
            dropSelf(JMWCBlocks.ALANTH_LOG_TRAPDOOR.get());
            dropSelf(JMWCBlocks.ALANTH_BUTTON.get());
            dropSelf(JMWCBlocks.ALANTH_PRESSUREPLATE.get());

            // ALLMEN OAK
            this.dropSelf(JMWCBlocks.ALLMEN_OAK_LOG.get());
            this.dropSelf(JMWCBlocks.STRIPPED_ALLMEN_OAK_LOG.get());
            this.dropSelf(JMWCBlocks.ALLMEN_OAK_WOOD.get());
            this.dropSelf(JMWCBlocks.STRIPPED_ALLMEN_OAK_WOOD.get());
            this.dropSelf(JMWCBlocks.ALLMEN_OAK_PLANKS.get());
            this.dropSelf(JMWCBlocks.ALLMEN_OAK_SAPLING.get());
            this.add(JMWCBlocks.ALLMEN_OAK_LEAVES.get(), block ->
                    createLeavesDrops(block, JMWCBlocks.ALLMEN_OAK_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
            dropSelf(JMWCBlocks.ALLMEN_OAK_STAIRS.get());
            dropSelf(JMWCBlocks.ALLMEN_OAK_LOG_STAIRS.get());
            dropSelf(JMWCBlocks.STRIPPED_ALLMEN_OAK_LOG_STAIRS.get());
            add(JMWCBlocks.ALLMEN_OAK_SLAB.get(),
                    block -> createSlabItemTable(JMWCBlocks.ALLMEN_OAK_SLAB.get()));
            add(JMWCBlocks.ALLMEN_OAK_LOG_SLAB.get(),
                    block -> createSlabItemTable(JMWCBlocks.ALLMEN_OAK_LOG_SLAB.get()));
            add(JMWCBlocks.STRIPPED_ALLMEN_OAK_LOG_SLAB.get(),
                    block -> createSlabItemTable(JMWCBlocks.STRIPPED_ALLMEN_OAK_LOG_SLAB.get()));
            dropSelf(JMWCBlocks.ALLMEN_OAK_FENCE.get());
            dropSelf(JMWCBlocks.ALLMEN_OAK_LOG_FENCE.get());
            dropSelf(JMWCBlocks.ALLMEN_OAK_FENCE_GATE.get());
            dropSelf(JMWCBlocks.ALLMEN_OAK_LOG_FENCE_GATE.get());
            add(JMWCBlocks.ALLMEN_OAK_DOOR.get(),
                    block -> createDoorTable(JMWCBlocks.ALLMEN_OAK_DOOR.get()));
            dropSelf(JMWCBlocks.ALLMEN_OAK_TRAPDOOR.get());
            dropSelf(JMWCBlocks.ALLMEN_OAK_LOG_TRAPDOOR.get());
            dropSelf(JMWCBlocks.ALLMEN_OAK_BUTTON.get());
            dropSelf(JMWCBlocks.ALLMEN_OAK_PRESSUREPLATE.get());

            // ASPENTHINE
            this.dropSelf(JMWCBlocks.ASPENTHINE_LOG.get());
            this.dropSelf(JMWCBlocks.STRIPPED_ASPENTHINE_LOG.get());
            this.dropSelf(JMWCBlocks.ASPENTHINE_WOOD.get());
            this.dropSelf(JMWCBlocks.STRIPPED_ASPENTHINE_WOOD.get());
            this.dropSelf(JMWCBlocks.ASPENTHINE_PLANKS.get());
            this.dropSelf(JMWCBlocks.ASPENTHINE_SAPLING.get());
            this.add(JMWCBlocks.ASPENTHINE_LEAVES.get(), block ->
                    createLeavesDrops(block, JMWCBlocks.ASPENTHINE_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
            dropSelf(JMWCBlocks.ASPENTHINE_STAIRS.get());
            dropSelf(JMWCBlocks.ASPENTHINE_LOG_STAIRS.get());
            dropSelf(JMWCBlocks.STRIPPED_ASPENTHINE_LOG_STAIRS.get());
            add(JMWCBlocks.ASPENTHINE_SLAB.get(),
                    block -> createSlabItemTable(JMWCBlocks.ASPENTHINE_SLAB.get()));
            add(JMWCBlocks.ASPENTHINE_LOG_SLAB.get(),
                    block -> createSlabItemTable(JMWCBlocks.ASPENTHINE_LOG_SLAB.get()));
            add(JMWCBlocks.STRIPPED_ASPENTHINE_LOG_SLAB.get(),
                    block -> createSlabItemTable(JMWCBlocks.STRIPPED_ASPENTHINE_LOG_SLAB.get()));
            dropSelf(JMWCBlocks.ASPENTHINE_FENCE.get());
            dropSelf(JMWCBlocks.ASPENTHINE_LOG_FENCE.get());
            dropSelf(JMWCBlocks.ASPENTHINE_FENCE_GATE.get());
            dropSelf(JMWCBlocks.ASPENTHINE_LOG_FENCE_GATE.get());
            add(JMWCBlocks.ASPENTHINE_DOOR.get(),
                    block -> createDoorTable(JMWCBlocks.ASPENTHINE_DOOR.get()));
            dropSelf(JMWCBlocks.ASPENTHINE_TRAPDOOR.get());
            dropSelf(JMWCBlocks.ASPENTHINE_LOG_TRAPDOOR.get());
            dropSelf(JMWCBlocks.ASPENTHINE_BUTTON.get());
            dropSelf(JMWCBlocks.ASPENTHINE_PRESSUREPLATE.get());

            // AUBRYN HOLLOW
            this.dropSelf(JMWCBlocks.AUBRYN_HOLLOW_LOG.get());
            this.dropSelf(JMWCBlocks.STRIPPED_AUBRYN_HOLLOW_LOG.get());
            this.dropSelf(JMWCBlocks.AUBRYN_HOLLOW_WOOD.get());
            this.dropSelf(JMWCBlocks.STRIPPED_AUBRYN_HOLLOW_WOOD.get());
            this.dropSelf(JMWCBlocks.AUBRYN_HOLLOW_PLANKS.get());
            this.dropSelf(JMWCBlocks.AUBRYN_HOLLOW_SAPLING.get());
            this.add(JMWCBlocks.AUBRYN_HOLLOW_LEAVES.get(), block ->
                    createLeavesDrops(block, JMWCBlocks.AUBRYN_HOLLOW_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
            dropSelf(JMWCBlocks.AUBRYN_HOLLOW_STAIRS.get());
            dropSelf(JMWCBlocks.AUBRYN_HOLLOW_LOG_STAIRS.get());
            dropSelf(JMWCBlocks.STRIPPED_AUBRYN_HOLLOW_LOG_STAIRS.get());
            add(JMWCBlocks.AUBRYN_HOLLOW_SLAB.get(),
                    block -> createSlabItemTable(JMWCBlocks.AUBRYN_HOLLOW_SLAB.get()));
            add(JMWCBlocks.AUBRYN_HOLLOW_LOG_SLAB.get(),
                    block -> createSlabItemTable(JMWCBlocks.AUBRYN_HOLLOW_LOG_SLAB.get()));
            add(JMWCBlocks.STRIPPED_AUBRYN_HOLLOW_LOG_SLAB.get(),
                    block -> createSlabItemTable(JMWCBlocks.STRIPPED_AUBRYN_HOLLOW_LOG_SLAB.get()));
            dropSelf(JMWCBlocks.AUBRYN_HOLLOW_FENCE.get());
            dropSelf(JMWCBlocks.AUBRYN_HOLLOW_LOG_FENCE.get());
            dropSelf(JMWCBlocks.AUBRYN_HOLLOW_FENCE_GATE.get());
            dropSelf(JMWCBlocks.AUBRYN_HOLLOW_LOG_FENCE_GATE.get());
            add(JMWCBlocks.AUBRYN_HOLLOW_DOOR.get(),
                    block -> createDoorTable(JMWCBlocks.AUBRYN_HOLLOW_DOOR.get()));
            dropSelf(JMWCBlocks.AUBRYN_HOLLOW_TRAPDOOR.get());
            dropSelf(JMWCBlocks.AUBRYN_HOLLOW_LOG_TRAPDOOR.get());
            dropSelf(JMWCBlocks.AUBRYN_HOLLOW_BUTTON.get());
            dropSelf(JMWCBlocks.AUBRYN_HOLLOW_PRESSUREPLATE.get());

            // AUDRAFLORA OAK
            this.dropSelf(JMWCBlocks.AUDRAFLORA_OAK_LOG.get());
            this.dropSelf(JMWCBlocks.STRIPPED_AUDRAFLORA_OAK_LOG.get());
            this.dropSelf(JMWCBlocks.AUDRAFLORA_OAK_WOOD.get());
            this.dropSelf(JMWCBlocks.STRIPPED_AUDRAFLORA_OAK_WOOD.get());
            this.dropSelf(JMWCBlocks.AUDRAFLORA_OAK_PLANKS.get());
            this.dropSelf(JMWCBlocks.AUDRAFLORA_OAK_SAPLING.get());
            this.add(JMWCBlocks.AUDRAFLORA_OAK_LEAVES.get(), block ->
                    createLeavesDrops(block, JMWCBlocks.AUDRAFLORA_OAK_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
            dropSelf(JMWCBlocks.AUDRAFLORA_OAK_STAIRS.get());
            dropSelf(JMWCBlocks.AUDRAFLORA_OAK_LOG_STAIRS.get());
            dropSelf(JMWCBlocks.STRIPPED_AUDRAFLORA_OAK_LOG_STAIRS.get());
            add(JMWCBlocks.AUDRAFLORA_OAK_SLAB.get(),
                    block -> createSlabItemTable(JMWCBlocks.AUDRAFLORA_OAK_SLAB.get()));
            add(JMWCBlocks.AUDRAFLORA_OAK_LOG_SLAB.get(),
                    block -> createSlabItemTable(JMWCBlocks.AUDRAFLORA_OAK_LOG_SLAB.get()));
            add(JMWCBlocks.STRIPPED_AUDRAFLORA_OAK_LOG_SLAB.get(),
                    block -> createSlabItemTable(JMWCBlocks.STRIPPED_AUDRAFLORA_OAK_LOG_SLAB.get()));
            dropSelf(JMWCBlocks.AUDRAFLORA_OAK_FENCE.get());
            dropSelf(JMWCBlocks.AUDRAFLORA_OAK_LOG_FENCE.get());
            dropSelf(JMWCBlocks.AUDRAFLORA_OAK_FENCE_GATE.get());
            dropSelf(JMWCBlocks.AUDRAFLORA_OAK_LOG_FENCE_GATE.get());
            add(JMWCBlocks.AUDRAFLORA_OAK_DOOR.get(),
                    block -> createDoorTable(JMWCBlocks.AUDRAFLORA_OAK_DOOR.get()));
            dropSelf(JMWCBlocks.AUDRAFLORA_OAK_TRAPDOOR.get());
            dropSelf(JMWCBlocks.AUDRAFLORA_OAK_LOG_TRAPDOOR.get());
            dropSelf(JMWCBlocks.AUDRAFLORA_OAK_BUTTON.get());
            dropSelf(JMWCBlocks.AUDRAFLORA_OAK_PRESSUREPLATE.get());

            // BALLWYN
            this.dropSelf(JMWCBlocks.BALLWYN_LOG.get());
            this.dropSelf(JMWCBlocks.STRIPPED_BALLWYN_LOG.get());
            this.dropSelf(JMWCBlocks.BALLWYN_WOOD.get());
            this.dropSelf(JMWCBlocks.STRIPPED_BALLWYN_WOOD.get());
            this.dropSelf(JMWCBlocks.BALLWYN_PLANKS.get());
            this.dropSelf(JMWCBlocks.BALLWYN_SAPLING.get());
            this.add(JMWCBlocks.BALLWYN_LEAVES.get(), block ->
                    createLeavesDrops(block, JMWCBlocks.BALLWYN_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
            dropSelf(JMWCBlocks.BALLWYN_STAIRS.get());
            dropSelf(JMWCBlocks.BALLWYN_LOG_STAIRS.get());
            dropSelf(JMWCBlocks.STRIPPED_BALLWYN_LOG_STAIRS.get());
            add(JMWCBlocks.BALLWYN_SLAB.get(),
                    block -> createSlabItemTable(JMWCBlocks.BALLWYN_SLAB.get()));
            add(JMWCBlocks.BALLWYN_LOG_SLAB.get(),
                    block -> createSlabItemTable(JMWCBlocks.BALLWYN_LOG_SLAB.get()));
            add(JMWCBlocks.STRIPPED_BALLWYN_LOG_SLAB.get(),
                    block -> createSlabItemTable(JMWCBlocks.STRIPPED_BALLWYN_LOG_SLAB.get()));
            dropSelf(JMWCBlocks.BALLWYN_FENCE.get());
            dropSelf(JMWCBlocks.BALLWYN_LOG_FENCE.get());
            dropSelf(JMWCBlocks.BALLWYN_FENCE_GATE.get());
            dropSelf(JMWCBlocks.BALLWYN_LOG_FENCE_GATE.get());
            add(JMWCBlocks.BALLWYN_DOOR.get(),
                    block -> createDoorTable(JMWCBlocks.BALLWYN_DOOR.get()));
            dropSelf(JMWCBlocks.BALLWYN_TRAPDOOR.get());
            dropSelf(JMWCBlocks.BALLWYN_LOG_TRAPDOOR.get());
            dropSelf(JMWCBlocks.BALLWYN_BUTTON.get());
            dropSelf(JMWCBlocks.BALLWYN_PRESSUREPLATE.get());

            // BLACK ABORA
            this.dropSelf(JMWCBlocks.BLACK_ABORA_LOG.get());
            this.dropSelf(JMWCBlocks.STRIPPED_BLACK_ABORA_LOG.get());
            this.dropSelf(JMWCBlocks.BLACK_ABORA_WOOD.get());
            this.dropSelf(JMWCBlocks.STRIPPED_BLACK_ABORA_WOOD.get());
            this.dropSelf(JMWCBlocks.BLACK_ABORA_PLANKS.get());
            this.dropSelf(JMWCBlocks.BLACK_ABORA_SAPLING.get());
            this.add(JMWCBlocks.BLACK_ABORA_LEAVES.get(), block ->
                    createLeavesDrops(block, JMWCBlocks.BLACK_ABORA_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
            dropSelf(JMWCBlocks.BLACK_ABORA_STAIRS.get());
            dropSelf(JMWCBlocks.BLACK_ABORA_LOG_STAIRS.get());
            dropSelf(JMWCBlocks.STRIPPED_BLACK_ABORA_LOG_STAIRS.get());
            add(JMWCBlocks.BLACK_ABORA_SLAB.get(),
                    block -> createSlabItemTable(JMWCBlocks.BLACK_ABORA_SLAB.get()));
            add(JMWCBlocks.BLACK_ABORA_LOG_SLAB.get(),
                    block -> createSlabItemTable(JMWCBlocks.BLACK_ABORA_LOG_SLAB.get()));
            add(JMWCBlocks.STRIPPED_BLACK_ABORA_LOG_SLAB.get(),
                    block -> createSlabItemTable(JMWCBlocks.STRIPPED_BLACK_ABORA_LOG_SLAB.get()));
            dropSelf(JMWCBlocks.BLACK_ABORA_FENCE.get());
            dropSelf(JMWCBlocks.BLACK_ABORA_LOG_FENCE.get());
            dropSelf(JMWCBlocks.BLACK_ABORA_FENCE_GATE.get());
            dropSelf(JMWCBlocks.BLACK_ABORA_LOG_FENCE_GATE.get());
            add(JMWCBlocks.BLACK_ABORA_DOOR.get(),
                    block -> createDoorTable(JMWCBlocks.BLACK_ABORA_DOOR.get()));
            dropSelf(JMWCBlocks.BLACK_ABORA_TRAPDOOR.get());
            dropSelf(JMWCBlocks.BLACK_ABORA_LOG_TRAPDOOR.get());
            dropSelf(JMWCBlocks.BLACK_ABORA_BUTTON.get());
            dropSelf(JMWCBlocks.BLACK_ABORA_PRESSUREPLATE.get());

            // BURRENBARK
            this.dropSelf(JMWCBlocks.BURRENBARK_LOG.get());
            this.dropSelf(JMWCBlocks.STRIPPED_BURRENBARK_LOG.get());
            this.dropSelf(JMWCBlocks.BURRENBARK_WOOD.get());
            this.dropSelf(JMWCBlocks.STRIPPED_BURRENBARK_WOOD.get());
            this.dropSelf(JMWCBlocks.BURRENBARK_PLANKS.get());
            this.dropSelf(JMWCBlocks.BURRENBARK_SAPLING.get());
            this.add(JMWCBlocks.BURRENBARK_LEAVES.get(), block ->
                    createLeavesDrops(block, JMWCBlocks.BURRENBARK_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
            dropSelf(JMWCBlocks.BURRENBARK_STAIRS.get());
            dropSelf(JMWCBlocks.BURRENBARK_LOG_STAIRS.get());
            dropSelf(JMWCBlocks.STRIPPED_BURRENBARK_LOG_STAIRS.get());
            add(JMWCBlocks.BURRENBARK_SLAB.get(),
                    block -> createSlabItemTable(JMWCBlocks.BURRENBARK_SLAB.get()));
            add(JMWCBlocks.BURRENBARK_LOG_SLAB.get(),
                    block -> createSlabItemTable(JMWCBlocks.BURRENBARK_LOG_SLAB.get()));
            add(JMWCBlocks.STRIPPED_BURRENBARK_LOG_SLAB.get(),
                    block -> createSlabItemTable(JMWCBlocks.STRIPPED_BURRENBARK_LOG_SLAB.get()));
            dropSelf(JMWCBlocks.BURRENBARK_FENCE.get());
            dropSelf(JMWCBlocks.BURRENBARK_LOG_FENCE.get());
            dropSelf(JMWCBlocks.BURRENBARK_FENCE_GATE.get());
            dropSelf(JMWCBlocks.BURRENBARK_LOG_FENCE_GATE.get());
            add(JMWCBlocks.BURRENBARK_DOOR.get(),
                    block -> createDoorTable(JMWCBlocks.BURRENBARK_DOOR.get()));
            dropSelf(JMWCBlocks.BURRENBARK_TRAPDOOR.get());
            dropSelf(JMWCBlocks.BURRENBARK_LOG_TRAPDOOR.get());
            dropSelf(JMWCBlocks.BURRENBARK_BUTTON.get());
            dropSelf(JMWCBlocks.BURRENBARK_PRESSUREPLATE.get());

            // CARAVAN OLIVEWOOD
            this.dropSelf(JMWCBlocks.CARAVAN_OLIVEWOOD_LOG.get());
            this.dropSelf(JMWCBlocks.STRIPPED_CARAVAN_OLIVEWOOD_LOG.get());
            this.dropSelf(JMWCBlocks.CARAVAN_OLIVEWOOD_WOOD.get());
            this.dropSelf(JMWCBlocks.STRIPPED_CARAVAN_OLIVEWOOD_WOOD.get());
            this.dropSelf(JMWCBlocks.CARAVAN_OLIVEWOOD_PLANKS.get());
            this.dropSelf(JMWCBlocks.CARAVAN_OLIVEWOOD_SAPLING.get());
            this.add(JMWCBlocks.CARAVAN_OLIVEWOOD_LEAVES.get(), block ->
                    createLeavesDrops(block, JMWCBlocks.CARAVAN_OLIVEWOOD_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
            dropSelf(JMWCBlocks.CARAVAN_OLIVEWOOD_STAIRS.get());
            dropSelf(JMWCBlocks.CARAVAN_OLIVEWOOD_LOG_STAIRS.get());
            dropSelf(JMWCBlocks.STRIPPED_CARAVAN_OLIVEWOOD_LOG_STAIRS.get());
            add(JMWCBlocks.CARAVAN_OLIVEWOOD_SLAB.get(),
                    block -> createSlabItemTable(JMWCBlocks.CARAVAN_OLIVEWOOD_SLAB.get()));
            add(JMWCBlocks.CARAVAN_OLIVEWOOD_LOG_SLAB.get(),
                    block -> createSlabItemTable(JMWCBlocks.CARAVAN_OLIVEWOOD_LOG_SLAB.get()));
            add(JMWCBlocks.STRIPPED_CARAVAN_OLIVEWOOD_LOG_SLAB.get(),
                    block -> createSlabItemTable(JMWCBlocks.STRIPPED_CARAVAN_OLIVEWOOD_LOG_SLAB.get()));
            dropSelf(JMWCBlocks.CARAVAN_OLIVEWOOD_FENCE.get());
            dropSelf(JMWCBlocks.CARAVAN_OLIVEWOOD_LOG_FENCE.get());
            dropSelf(JMWCBlocks.CARAVAN_OLIVEWOOD_FENCE_GATE.get());
            dropSelf(JMWCBlocks.CARAVAN_OLIVEWOOD_LOG_FENCE_GATE.get());
            add(JMWCBlocks.CARAVAN_OLIVEWOOD_DOOR.get(),
                    block -> createDoorTable(JMWCBlocks.CARAVAN_OLIVEWOOD_DOOR.get()));
            dropSelf(JMWCBlocks.CARAVAN_OLIVEWOOD_TRAPDOOR.get());
            dropSelf(JMWCBlocks.CARAVAN_OLIVEWOOD_LOG_TRAPDOOR.get());
            dropSelf(JMWCBlocks.CARAVAN_OLIVEWOOD_BUTTON.get());
            dropSelf(JMWCBlocks.CARAVAN_OLIVEWOOD_PRESSUREPLATE.get());

            // COPELAND CEDAR
            this.dropSelf(JMWCBlocks.COPELAND_CEDAR_LOG.get());
            this.dropSelf(JMWCBlocks.STRIPPED_COPELAND_CEDAR_LOG.get());
            this.dropSelf(JMWCBlocks.COPELAND_CEDAR_WOOD.get());
            this.dropSelf(JMWCBlocks.STRIPPED_COPELAND_CEDAR_WOOD.get());
            this.dropSelf(JMWCBlocks.COPELAND_CEDAR_PLANKS.get());
            this.dropSelf(JMWCBlocks.COPELAND_CEDAR_SAPLING.get());
            this.add(JMWCBlocks.COPELAND_CEDAR_LEAVES.get(), block ->
                    createLeavesDrops(block, JMWCBlocks.COPELAND_CEDAR_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
            dropSelf(JMWCBlocks.COPELAND_CEDAR_STAIRS.get());
            dropSelf(JMWCBlocks.COPELAND_CEDAR_LOG_STAIRS.get());
            dropSelf(JMWCBlocks.STRIPPED_COPELAND_CEDAR_LOG_STAIRS.get());
            add(JMWCBlocks.COPELAND_CEDAR_SLAB.get(),
                    block -> createSlabItemTable(JMWCBlocks.COPELAND_CEDAR_SLAB.get()));
            add(JMWCBlocks.COPELAND_CEDAR_LOG_SLAB.get(),
                    block -> createSlabItemTable(JMWCBlocks.COPELAND_CEDAR_LOG_SLAB.get()));
            add(JMWCBlocks.STRIPPED_COPELAND_CEDAR_LOG_SLAB.get(),
                    block -> createSlabItemTable(JMWCBlocks.STRIPPED_COPELAND_CEDAR_LOG_SLAB.get()));
            dropSelf(JMWCBlocks.COPELAND_CEDAR_FENCE.get());
            dropSelf(JMWCBlocks.COPELAND_CEDAR_LOG_FENCE.get());
            dropSelf(JMWCBlocks.COPELAND_CEDAR_FENCE_GATE.get());
            dropSelf(JMWCBlocks.COPELAND_CEDAR_LOG_FENCE_GATE.get());
            add(JMWCBlocks.COPELAND_CEDAR_DOOR.get(),
                    block -> createDoorTable(JMWCBlocks.COPELAND_CEDAR_DOOR.get()));
            dropSelf(JMWCBlocks.COPELAND_CEDAR_TRAPDOOR.get());
            dropSelf(JMWCBlocks.COPELAND_CEDAR_LOG_TRAPDOOR.get());
            dropSelf(JMWCBlocks.COPELAND_CEDAR_BUTTON.get());
            dropSelf(JMWCBlocks.COPELAND_CEDAR_PRESSUREPLATE.get());

            // CURSED PETAL
            this.dropSelf(JMWCBlocks.CURSED_PETAL_LOG.get());
            this.dropSelf(JMWCBlocks.STRIPPED_CURSED_PETAL_LOG.get());
            this.dropSelf(JMWCBlocks.CURSED_PETAL_WOOD.get());
            this.dropSelf(JMWCBlocks.STRIPPED_CURSED_PETAL_WOOD.get());
            this.dropSelf(JMWCBlocks.CURSED_PETAL_PLANKS.get());
            this.dropSelf(JMWCBlocks.CURSED_PETAL_SAPLING.get());
            this.add(JMWCBlocks.CURSED_PETAL_LEAVES.get(), block ->
                    createLeavesDrops(block, JMWCBlocks.CURSED_PETAL_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
            dropSelf(JMWCBlocks.CURSED_PETAL_STAIRS.get());
            dropSelf(JMWCBlocks.CURSED_PETAL_LOG_STAIRS.get());
            dropSelf(JMWCBlocks.STRIPPED_CURSED_PETAL_LOG_STAIRS.get());
            add(JMWCBlocks.CURSED_PETAL_SLAB.get(),
                    block -> createSlabItemTable(JMWCBlocks.CURSED_PETAL_SLAB.get()));
            add(JMWCBlocks.CURSED_PETAL_LOG_SLAB.get(),
                    block -> createSlabItemTable(JMWCBlocks.CURSED_PETAL_LOG_SLAB.get()));
            add(JMWCBlocks.STRIPPED_CURSED_PETAL_LOG_SLAB.get(),
                    block -> createSlabItemTable(JMWCBlocks.STRIPPED_CURSED_PETAL_LOG_SLAB.get()));
            dropSelf(JMWCBlocks.CURSED_PETAL_FENCE.get());
            dropSelf(JMWCBlocks.CURSED_PETAL_LOG_FENCE.get());
            dropSelf(JMWCBlocks.CURSED_PETAL_FENCE_GATE.get());
            dropSelf(JMWCBlocks.CURSED_PETAL_LOG_FENCE_GATE.get());
            add(JMWCBlocks.CURSED_PETAL_DOOR.get(),
                    block -> createDoorTable(JMWCBlocks.CURSED_PETAL_DOOR.get()));
            dropSelf(JMWCBlocks.CURSED_PETAL_TRAPDOOR.get());
            dropSelf(JMWCBlocks.CURSED_PETAL_LOG_TRAPDOOR.get());
            dropSelf(JMWCBlocks.CURSED_PETAL_BUTTON.get());
            dropSelf(JMWCBlocks.CURSED_PETAL_PRESSUREPLATE.get());
        }


        @Override
        protected Iterable<Block> getKnownBlocks() {
            return JMWCBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
        }
    }
