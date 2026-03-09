package net.jace007.jacesmegawoodcollection.datagen;

import net.jace007.jacesmegawoodcollection.JacesMegaWoodCollection;
import net.jace007.jacesmegawoodcollection.block.JMWCBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;

public class JMWCItemModelProvider extends ItemModelProvider {
    public JMWCItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, JacesMegaWoodCollection.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        // AGRABAH CEDAR
        buttonItem(JMWCBlocks.AGRABAH_CEDAR_BUTTON, JMWCBlocks.AGRABAH_CEDAR_PLANKS);
        basicItem(JMWCBlocks.AGRABAH_CEDAR_DOOR.asItem());
        fenceItem(JMWCBlocks.AGRABAH_CEDAR_FENCE, JMWCBlocks.AGRABAH_CEDAR_PLANKS);
        fenceItem(JMWCBlocks.AGRABAH_CEDAR_LOG_FENCE, JMWCBlocks.AGRABAH_CEDAR_LOG);
        saplingItem(JMWCBlocks.AGRABAH_CEDAR_SAPLING);

        // Alanth
        buttonItem(JMWCBlocks.ALANTH_BUTTON, JMWCBlocks.ALANTH_PLANKS);
        basicItem(JMWCBlocks.ALANTH_DOOR.asItem());
        fenceItem(JMWCBlocks.ALANTH_FENCE, JMWCBlocks.ALANTH_PLANKS);
        fenceItem(JMWCBlocks.ALANTH_LOG_FENCE, JMWCBlocks.ALANTH_LOG);
        saplingItem(JMWCBlocks.ALANTH_SAPLING);

        // ALLMEN OAK
        buttonItem(JMWCBlocks.ALLMEN_OAK_BUTTON, JMWCBlocks.ALLMEN_OAK_PLANKS);
        basicItem(JMWCBlocks.ALLMEN_OAK_DOOR.asItem());
        fenceItem(JMWCBlocks.ALLMEN_OAK_FENCE, JMWCBlocks.ALLMEN_OAK_PLANKS);
        fenceItem(JMWCBlocks.ALLMEN_OAK_LOG_FENCE, JMWCBlocks.ALLMEN_OAK_LOG);
        saplingItem(JMWCBlocks.ALLMEN_OAK_SAPLING);

        // ASPENTHINE
        buttonItem(JMWCBlocks.ASPENTHINE_BUTTON, JMWCBlocks.ASPENTHINE_PLANKS);
        basicItem(JMWCBlocks.ASPENTHINE_DOOR.asItem());
        fenceItem(JMWCBlocks.ASPENTHINE_FENCE, JMWCBlocks.ASPENTHINE_PLANKS);
        fenceItem(JMWCBlocks.ASPENTHINE_LOG_FENCE, JMWCBlocks.ASPENTHINE_LOG);
        saplingItem(JMWCBlocks.ASPENTHINE_SAPLING);

        // AUBRYN HOLLOW
        buttonItem(JMWCBlocks.AUBRYN_HOLLOW_BUTTON, JMWCBlocks.AUBRYN_HOLLOW_PLANKS);
        basicItem(JMWCBlocks.AUBRYN_HOLLOW_DOOR.asItem());
        fenceItem(JMWCBlocks.AUBRYN_HOLLOW_FENCE, JMWCBlocks.AUBRYN_HOLLOW_PLANKS);
        fenceItem(JMWCBlocks.AUBRYN_HOLLOW_LOG_FENCE, JMWCBlocks.AUBRYN_HOLLOW_LOG);
        saplingItem(JMWCBlocks.AUBRYN_HOLLOW_SAPLING);

        // AUDRAFLORA OAK
        buttonItem(JMWCBlocks.AUDRAFLORA_OAK_BUTTON, JMWCBlocks.AUDRAFLORA_OAK_PLANKS);
        basicItem(JMWCBlocks.AUDRAFLORA_OAK_DOOR.asItem());
        fenceItem(JMWCBlocks.AUDRAFLORA_OAK_FENCE, JMWCBlocks.AUDRAFLORA_OAK_PLANKS);
        fenceItem(JMWCBlocks.AUDRAFLORA_OAK_LOG_FENCE, JMWCBlocks.AUDRAFLORA_OAK_LOG);
        saplingItem(JMWCBlocks.AUDRAFLORA_OAK_SAPLING);

        // BALLWYN
        buttonItem(JMWCBlocks.BALLWYN_BUTTON, JMWCBlocks.BALLWYN_PLANKS);
        basicItem(JMWCBlocks.BALLWYN_DOOR.asItem());
        fenceItem(JMWCBlocks.BALLWYN_FENCE, JMWCBlocks.BALLWYN_PLANKS);
        fenceItem(JMWCBlocks.BALLWYN_LOG_FENCE, JMWCBlocks.BALLWYN_LOG);
        saplingItem(JMWCBlocks.BALLWYN_SAPLING);

        // BLACK ABORA
        buttonItem(JMWCBlocks.BLACK_ABORA_BUTTON, JMWCBlocks.BLACK_ABORA_PLANKS);
        basicItem(JMWCBlocks.BLACK_ABORA_DOOR.asItem());
        fenceItem(JMWCBlocks.BLACK_ABORA_FENCE, JMWCBlocks.BLACK_ABORA_PLANKS);
        fenceItem(JMWCBlocks.BLACK_ABORA_LOG_FENCE, JMWCBlocks.BLACK_ABORA_LOG);
        saplingItem(JMWCBlocks.BLACK_ABORA_SAPLING);

        // CARAVAN OLIVEWOOD
        buttonItem(JMWCBlocks.CARAVAN_OLIVEWOOD_BUTTON, JMWCBlocks.CARAVAN_OLIVEWOOD_PLANKS);
        basicItem(JMWCBlocks.CARAVAN_OLIVEWOOD_DOOR.asItem());
        fenceItem(JMWCBlocks.CARAVAN_OLIVEWOOD_FENCE, JMWCBlocks.CARAVAN_OLIVEWOOD_PLANKS);
        fenceItem(JMWCBlocks.CARAVAN_OLIVEWOOD_LOG_FENCE, JMWCBlocks.CARAVAN_OLIVEWOOD_LOG);
        saplingItem(JMWCBlocks.CARAVAN_OLIVEWOOD_SAPLING);

        // COPELAND CEDAR
        buttonItem(JMWCBlocks.COPELAND_CEDAR_BUTTON, JMWCBlocks.COPELAND_CEDAR_PLANKS);
        basicItem(JMWCBlocks.COPELAND_CEDAR_DOOR.asItem());
        fenceItem(JMWCBlocks.COPELAND_CEDAR_FENCE, JMWCBlocks.COPELAND_CEDAR_PLANKS);
        fenceItem(JMWCBlocks.COPELAND_CEDAR_LOG_FENCE, JMWCBlocks.COPELAND_CEDAR_LOG);
        saplingItem(JMWCBlocks.COPELAND_CEDAR_SAPLING);
    }
    private ItemModelBuilder saplingItem(DeferredBlock<Block> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(JacesMegaWoodCollection.MOD_ID,"block/" + item.getId().getPath()));
    }

    public void buttonItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(JacesMegaWoodCollection.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }

    public void fenceItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(JacesMegaWoodCollection.MOD_ID,
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