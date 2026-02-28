package net.jace007.jacesmegawoodcollection.worldgen;

import net.jace007.jacesmegawoodcollection.JacesMegaWoodCollection;
import net.jace007.jacesmegawoodcollection.block.JMWCBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.ForkingTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;

public class JMWCConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> AGRABAH_CEDAR_KEY = registerKey("agrabah_cedar");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ALANTH_KEY = registerKey("alanth");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ALLMEN_OAK_KEY = registerKey("allmen_oak");
    public static final ResourceKey<ConfiguredFeature<?, ?>> AUDRAFLORA_OAK_KEY = registerKey("audraflora_oak");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLACK_ABORA_KEY = registerKey("black_abora");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CARAVAN_OLIVEWOOD_KEY = registerKey("caravan_olivewood");
    public static final ResourceKey<ConfiguredFeature<?, ?>> COPELAND_CEDAR_KEY = registerKey("copeland_cedar");


    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        register(context, AGRABAH_CEDAR_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(JMWCBlocks.AGRABAH_CEDAR_LOG.get()),
                    new StraightTrunkPlacer(3, 4, 2),
                BlockStateProvider.simple(JMWCBlocks.AGRABAH_CEDAR_LEAVES.get()),
                    new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 3),
                    new TwoLayersFeatureSize(1, 0, 1)).build());
        register(context, ALANTH_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(JMWCBlocks.ALANTH_LOG.get()),
                    new StraightTrunkPlacer(3, 4, 2),
                BlockStateProvider.simple(JMWCBlocks.ALANTH_LEAVES.get()),
                    new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 3),
                    new TwoLayersFeatureSize(1, 0, 1)).build());
        register(context, ALLMEN_OAK_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(JMWCBlocks.ALLMEN_OAK_LOG.get()),
                    new StraightTrunkPlacer(3, 4, 2),
                BlockStateProvider.simple(JMWCBlocks.ALLMEN_OAK_LEAVES.get()),
                    new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 3),
                    new TwoLayersFeatureSize(1, 0, 1)).build());
        register(context, AUDRAFLORA_OAK_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(JMWCBlocks.AUDRAFLORA_OAK_LOG.get()),
                    new StraightTrunkPlacer(3, 4, 2),
                BlockStateProvider.simple(JMWCBlocks.AUDRAFLORA_OAK_LEAVES.get()),
                    new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 3),
                    new TwoLayersFeatureSize(1, 0, 1)).build());
        register(context, BLACK_ABORA_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(JMWCBlocks.BLACK_ABORA_LOG.get()),
                    new StraightTrunkPlacer(3, 4, 2),
                BlockStateProvider.simple(JMWCBlocks.BLACK_ABORA_LEAVES.get()),
                    new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 3),
                    new TwoLayersFeatureSize(1, 0, 1)).build());
        register(context, CARAVAN_OLIVEWOOD_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(JMWCBlocks.CARAVAN_OLIVEWOOD_LOG.get()),
                    new StraightTrunkPlacer(3, 4, 2),
                BlockStateProvider.simple(JMWCBlocks.CARAVAN_OLIVEWOOD_LEAVES.get()),
                    new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 3),
                    new TwoLayersFeatureSize(1, 0, 1)).build());
        register(context, COPELAND_CEDAR_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(JMWCBlocks.COPELAND_CEDAR_LOG.get()),
                    new StraightTrunkPlacer(3, 4, 2),
                BlockStateProvider.simple(JMWCBlocks.COPELAND_CEDAR_LEAVES.get()),
                    new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 3),
                    new TwoLayersFeatureSize(1, 0, 1)).build());

    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(JacesMegaWoodCollection.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}