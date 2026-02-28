package net.jace007.jacesmegawoodcollection.util;

import net.jace007.jacesmegawoodcollection.JacesMegaWoodCollection;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class JMWCTags {
    public static class Blocks {
        public static final TagKey<Block> AGRABAH_CEDAR = createTag("agrabah_cadar");
        public static final TagKey<Block> AGRABAH_CEDAR_LOGS = createTag("agrabah_cedar_logs");
        public static final TagKey<Block> ALANTH = createTag("alanth");
        public static final TagKey<Block> ALANTH_LOGS = createTag("alanth_logs");

        public static final TagKey<Block> ALLMEN_OAK = createTag("allman_oak");
        public static final TagKey<Block> ALLMEN_OAK_LOGS = createTag("allmen_oak_logs");
        public static final TagKey<Block> AUDRAFLORA_OAK = createTag("audraflora_oak");
        public static final TagKey<Block> AUDRAFLORA_OAK_LOGS = createTag("audraflora_oak_logs");
        public static final TagKey<Block> BLACK_ABORA = createTag("black_abora");
        public static final TagKey<Block> BLACK_ABORA_LOGS = createTag("black_abora_logs");
        public static final TagKey<Block> CARAVAN_OLIVEWOOD = createTag("caravan_olivewood");
        public static final TagKey<Block> CARAVAN_OLIVEWOOD_LOGS = createTag("caravan_olivewood_logs");
        public static final TagKey<Block> COPELAND_CEDAR = createTag("copeland_cedar");
        public static final TagKey<Block> COPELAND_CEDAR_LOGS = createTag("copeland_cedar_logs");

        public static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(JacesMegaWoodCollection.MOD_ID, name));
        }
    }

    public static class Items {

        public static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(JacesMegaWoodCollection.MOD_ID, name));
        }
    }
}
