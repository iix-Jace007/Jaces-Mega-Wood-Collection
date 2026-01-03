package net.jace007.jacesmegawoodcollection.worldgen.tree;

import net.jace007.jacesmegawoodcollection.JacesMegaWoodCollection;
import net.jace007.jacesmegawoodcollection.worldgen.JMWCConfiguredFeatures;
import net.minecraft.world.level.block.grower.TreeGrower;

import java.util.Optional;

public class JMWCTreeGrowers {
    public static final TreeGrower AGRABAH_CEDAR = new TreeGrower(JacesMegaWoodCollection.MOD_ID + ":agrabah_cedar",
            Optional.empty(), Optional.of(JMWCConfiguredFeatures.AGRABAH_CEDAR_KEY), Optional.empty());
    public static final TreeGrower ALLMEN_OAK = new TreeGrower(JacesMegaWoodCollection.MOD_ID + ":allmen_oak",
            Optional.empty(), Optional.of(JMWCConfiguredFeatures.ALLMEN_OAK_KEY), Optional.empty());
    public static final TreeGrower AUDRAFLORA_OAK = new TreeGrower(JacesMegaWoodCollection.MOD_ID + ":audraflora_oak",
            Optional.empty(), Optional.of(JMWCConfiguredFeatures.AUDRAFLORA_OAK_KEY), Optional.empty());

}