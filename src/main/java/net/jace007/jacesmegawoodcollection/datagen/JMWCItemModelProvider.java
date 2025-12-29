package net.jace007.jacesmegawoodcollection.datagen;

import net.jace007.jacesmegawoodcollection.JacesMegaWoodCollection;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class JMWCItemModelProvider extends ItemModelProvider {
    public JMWCItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, JacesMegaWoodCollection.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

    }
}