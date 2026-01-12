package net.jace007.jacesmegawoodcollection.worldgen;

import net.jace007.jacesmegawoodcollection.JacesMegaWoodCollection;
import net.jace007.jacesmegawoodcollection.block.JMWCBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

import static net.minecraft.data.worldgen.placement.PlacementUtils.register;

public class JMWCPlacedFeatures {
    public static final ResourceKey<PlacedFeature> AGRABAH_CEDAR_PLACED_KEY = registerKey("agrabah_cedar_placed");
    public static final ResourceKey<PlacedFeature> ALLMEN_OAK_PLACED_KEY = registerKey("allmen_oak_placed");
    public static final ResourceKey<PlacedFeature> AUDRAFLORA_OAK_PLACED_KEY = registerKey("audraflora_oak_placed");
    public static final ResourceKey<PlacedFeature> BLACK_ABORA_PLACED_KEY = registerKey("black_abora_placed");
    public static final ResourceKey<PlacedFeature> CARAVAN_OLIVEWOOD_PLACED_KEY = registerKey("caravan_olivewood_placed");
    public static final ResourceKey<PlacedFeature> COPELAND_CEDAR_PLACED_KEY = registerKey("copeland_cedar_placed");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, AGRABAH_CEDAR_PLACED_KEY, configuredFeatures.getOrThrow(JMWCConfiguredFeatures.AGRABAH_CEDAR_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        JMWCBlocks.AGRABAH_CEDAR_SAPLING.get()));
        register(context, ALLMEN_OAK_PLACED_KEY, configuredFeatures.getOrThrow(JMWCConfiguredFeatures.ALLMEN_OAK_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        JMWCBlocks.ALLMEN_OAK_SAPLING.get()));
        register(context, AUDRAFLORA_OAK_PLACED_KEY, configuredFeatures.getOrThrow(JMWCConfiguredFeatures.AUDRAFLORA_OAK_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        JMWCBlocks.AUDRAFLORA_OAK_SAPLING.get()));
        register(context, BLACK_ABORA_PLACED_KEY, configuredFeatures.getOrThrow(JMWCConfiguredFeatures.BLACK_ABORA_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        JMWCBlocks.BLACK_ABORA_SAPLING.get()));
        register(context, CARAVAN_OLIVEWOOD_PLACED_KEY, configuredFeatures.getOrThrow(JMWCConfiguredFeatures.CARAVAN_OLIVEWOOD_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        JMWCBlocks.CARAVAN_OLIVEWOOD_SAPLING.get()));
        register(context, COPELAND_CEDAR_PLACED_KEY, configuredFeatures.getOrThrow(JMWCConfiguredFeatures.COPELAND_CEDAR_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        JMWCBlocks.COPELAND_CEDAR_SAPLING.get()));


    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(JacesMegaWoodCollection.MOD_ID, name));
    }

}