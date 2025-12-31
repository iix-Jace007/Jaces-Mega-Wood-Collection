package net.jace007.jacesmegawoodcollection.datagen;

import net.jace007.jacesmegawoodcollection.JacesMegaWoodCollection;
import net.jace007.jacesmegawoodcollection.block.JMWCBlocks;
import net.jace007.jacesmegawoodcollection.item.JMWCItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceBlock;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;

public class JMWCItemModelProvider extends ItemModelProvider {
    public JMWCItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, JacesMegaWoodCollection.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        buttonItem(JMWCBlocks.AGRABAH_CEDER_BUTTON, JMWCBlocks.AGRABAH_CEDER_PLANKS);

        basicItem(JMWCBlocks.AGRABAH_CEDER_DOOR.asItem());

        fenceItem(JMWCBlocks.AGRABAH_CEDER_FENCE, JMWCBlocks.AGRABAH_CEDER_PLANKS);
        fenceItem(JMWCBlocks.AGRABAH_CEDER_LOG_FENCE, JMWCBlocks.AGRABAH_CEDER_LOG);

        saplingItem(JMWCBlocks.AGRABAH_CEDER_SAPLING);

    }
    private ItemModelBuilder saplingItem(DeferredBlock<Block> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(JacesMegaWoodCollection.MOD_ID,"block/" + item.getId().getPath()));
    }

    public void buttonItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/button_inventory"))
                .texture("textures",  ResourceLocation.fromNamespaceAndPath(JacesMegaWoodCollection.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }

    public void fenceItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/fence_inventory"))
                .texture("textures",  ResourceLocation.fromNamespaceAndPath(JacesMegaWoodCollection.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }

    public void wallItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  ResourceLocation.fromNamespaceAndPath(JacesMegaWoodCollection.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(DeferredItem<?> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(JacesMegaWoodCollection.MOD_ID,"item/" + item.getId().getPath()));
    }
}