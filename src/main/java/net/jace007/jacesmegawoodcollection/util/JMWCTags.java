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
