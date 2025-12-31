package net.jace007.jacesmegawoodcollection.datagen;

import net.jace007.jacesmegawoodcollection.JacesMegaWoodCollection;
import net.jace007.jacesmegawoodcollection.worldgen.JMWCBiomeModifiers;
import net.jace007.jacesmegawoodcollection.worldgen.JMWCConfiguredFeatures;
import net.jace007.jacesmegawoodcollection.worldgen.JMWCPlacedFeatures;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class JMWCDatapackProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()

            .add(Registries.CONFIGURED_FEATURE, JMWCConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, JMWCPlacedFeatures::bootstrap)
            .add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, JMWCBiomeModifiers::bootstrap);

    public JMWCDatapackProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(JacesMegaWoodCollection.MOD_ID));
    }
}