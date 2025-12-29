package net.jace007.jacesmegawoodcollection.worldgen.tree;

import net.jace007.jacesmegawoodcollection.JacesMegaWoodCollection;
import net.jace007.jacesmegawoodcollection.worldgen.JMWCConfiguredFeatures;
import net.minecraft.world.level.block.grower.TreeGrower;

import java.util.Optional;

public class JMWCTreeGrowers {
    public static final TreeGrower AGRABAH_CEDER = new TreeGrower(JacesMegaWoodCollection.MOD_ID + ":agrabah_ceder",
            Optional.empty(), Optional.of(JMWCConfiguredFeatures.AGRABAH_CEDER_KEY), Optional.empty());

}