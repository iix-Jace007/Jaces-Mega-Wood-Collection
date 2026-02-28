package net.jace007.jacesmegawoodcollection.item;

import net.jace007.jacesmegawoodcollection.JacesMegaWoodCollection;
import net.jace007.jacesmegawoodcollection.block.JMWCBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class JMWCCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, JacesMegaWoodCollection.MOD_ID);

    public static final Supplier<CreativeModeTab> JACES_WOOD_COLLECTION = CREATIVE_MODE_TAB.register("jaces_wood_collection",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(JMWCBlocks.AGRABAH_CEDAR_LOG.get()))
                    .title(Component.translatable("creativetab.jacesmegawoodcollection.jaces_wood_collection"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(JMWCBlocks.AGRABAH_CEDAR_LOG);
                        output.accept(JMWCBlocks.AGRABAH_CEDAR_WOOD);
                        output.accept(JMWCBlocks.STRIPPED_AGRABAH_CEDAR_LOG);
                        output.accept(JMWCBlocks.STRIPPED_AGRABAH_CEDAR_WOOD);
                        output.accept(JMWCBlocks.AGRABAH_CEDAR_PLANKS);
                        output.accept(JMWCBlocks.AGRABAH_CEDAR_STAIRS);
                        output.accept(JMWCBlocks.AGRABAH_CEDAR_LOG_STAIRS);
                        output.accept(JMWCBlocks.STRIPPED_AGRABAH_CEDAR_LOG_STAIRS);
                        output.accept(JMWCBlocks.AGRABAH_CEDAR_SLAB);
                        output.accept(JMWCBlocks.AGRABAH_CEDAR_LOG_SLAB);
                        output.accept(JMWCBlocks.STRIPPED_AGRABAH_CEDAR_LOG_SLAB);
                        output.accept(JMWCBlocks.AGRABAH_CEDAR_FENCE);
                        output.accept(JMWCBlocks.AGRABAH_CEDAR_LOG_FENCE);
                        output.accept(JMWCBlocks.AGRABAH_CEDAR_FENCE_GATE);
                        output.accept(JMWCBlocks.AGRABAH_CEDAR_LOG_FENCE_GATE);
                        output.accept(JMWCBlocks.AGRABAH_CEDAR_DOOR);
                        output.accept(JMWCBlocks.AGRABAH_CEDAR_TRAPDOOR);
                        output.accept(JMWCBlocks.AGRABAH_CEDAR_LOG_TRAPDOOR);
                        output.accept(JMWCBlocks.AGRABAH_CEDAR_PRESSUREPLATE);
                        output.accept(JMWCBlocks.AGRABAH_CEDAR_BUTTON);
                        output.accept(JMWCBlocks.AGRABAH_CEDAR_LEAVES);
                        output.accept(JMWCBlocks.AGRABAH_CEDAR_SAPLING);

                        output.accept(JMWCBlocks.ALANTH_LOG);
                        output.accept(JMWCBlocks.ALANTH_WOOD);
                        output.accept(JMWCBlocks.STRIPPED_ALANTH_LOG);
                        output.accept(JMWCBlocks.STRIPPED_ALANTH_WOOD);
                        output.accept(JMWCBlocks.ALANTH_PLANKS);
                        output.accept(JMWCBlocks.ALANTH_STAIRS);
                        output.accept(JMWCBlocks.ALANTH_LOG_STAIRS);
                        output.accept(JMWCBlocks.STRIPPED_ALANTH_LOG_STAIRS);
                        output.accept(JMWCBlocks.ALANTH_SLAB);
                        output.accept(JMWCBlocks.ALANTH_LOG_SLAB);
                        output.accept(JMWCBlocks.STRIPPED_ALANTH_LOG_SLAB);
                        output.accept(JMWCBlocks.ALANTH_FENCE);
                        output.accept(JMWCBlocks.ALANTH_LOG_FENCE);
                        output.accept(JMWCBlocks.ALANTH_FENCE_GATE);
                        output.accept(JMWCBlocks.ALANTH_LOG_FENCE_GATE);
                        output.accept(JMWCBlocks.ALANTH_DOOR);
                        output.accept(JMWCBlocks.ALANTH_TRAPDOOR);
                        output.accept(JMWCBlocks.ALANTH_LOG_TRAPDOOR);
                        output.accept(JMWCBlocks.ALANTH_PRESSUREPLATE);
                        output.accept(JMWCBlocks.ALANTH_BUTTON);
                        output.accept(JMWCBlocks.ALANTH_LEAVES);
                        output.accept(JMWCBlocks.ALANTH_SAPLING);

                        output.accept(JMWCBlocks.ALLMEN_OAK_LOG);
                        output.accept(JMWCBlocks.ALLMEN_OAK_WOOD);
                        output.accept(JMWCBlocks.STRIPPED_ALLMEN_OAK_LOG);
                        output.accept(JMWCBlocks.STRIPPED_ALLMEN_OAK_WOOD);
                        output.accept(JMWCBlocks.ALLMEN_OAK_PLANKS);
                        output.accept(JMWCBlocks.ALLMEN_OAK_STAIRS);
                        output.accept(JMWCBlocks.ALLMEN_OAK_LOG_STAIRS);
                        output.accept(JMWCBlocks.STRIPPED_ALLMEN_OAK_LOG_STAIRS);
                        output.accept(JMWCBlocks.ALLMEN_OAK_SLAB);
                        output.accept(JMWCBlocks.ALLMEN_OAK_LOG_SLAB);
                        output.accept(JMWCBlocks.STRIPPED_ALLMEN_OAK_LOG_SLAB);
                        output.accept(JMWCBlocks.ALLMEN_OAK_FENCE);
                        output.accept(JMWCBlocks.ALLMEN_OAK_LOG_FENCE);
                        output.accept(JMWCBlocks.ALLMEN_OAK_FENCE_GATE);
                        output.accept(JMWCBlocks.ALLMEN_OAK_LOG_FENCE_GATE);
                        output.accept(JMWCBlocks.ALLMEN_OAK_DOOR);
                        output.accept(JMWCBlocks.ALLMEN_OAK_TRAPDOOR);
                        output.accept(JMWCBlocks.ALLMEN_OAK_LOG_TRAPDOOR);
                        output.accept(JMWCBlocks.ALLMEN_OAK_PRESSUREPLATE);
                        output.accept(JMWCBlocks.ALLMEN_OAK_BUTTON);
                        output.accept(JMWCBlocks.ALLMEN_OAK_LEAVES);
                        output.accept(JMWCBlocks.ALLMEN_OAK_SAPLING);

                        output.accept(JMWCBlocks.AUDRAFLORA_OAK_LOG);
                        output.accept(JMWCBlocks.AUDRAFLORA_OAK_WOOD);
                        output.accept(JMWCBlocks.STRIPPED_AUDRAFLORA_OAK_LOG);
                        output.accept(JMWCBlocks.STRIPPED_AUDRAFLORA_OAK_WOOD);
                        output.accept(JMWCBlocks.AUDRAFLORA_OAK_PLANKS);
                        output.accept(JMWCBlocks.AUDRAFLORA_OAK_STAIRS);
                        output.accept(JMWCBlocks.AUDRAFLORA_OAK_LOG_STAIRS);
                        output.accept(JMWCBlocks.STRIPPED_AUDRAFLORA_OAK_LOG_STAIRS);
                        output.accept(JMWCBlocks.AUDRAFLORA_OAK_SLAB);
                        output.accept(JMWCBlocks.AUDRAFLORA_OAK_LOG_SLAB);
                        output.accept(JMWCBlocks.STRIPPED_AUDRAFLORA_OAK_LOG_SLAB);
                        output.accept(JMWCBlocks.AUDRAFLORA_OAK_FENCE);
                        output.accept(JMWCBlocks.AUDRAFLORA_OAK_LOG_FENCE);
                        output.accept(JMWCBlocks.AUDRAFLORA_OAK_FENCE_GATE);
                        output.accept(JMWCBlocks.AUDRAFLORA_OAK_LOG_FENCE_GATE);
                        output.accept(JMWCBlocks.AUDRAFLORA_OAK_DOOR);
                        output.accept(JMWCBlocks.AUDRAFLORA_OAK_TRAPDOOR);
                        output.accept(JMWCBlocks.AUDRAFLORA_OAK_LOG_TRAPDOOR);
                        output.accept(JMWCBlocks.AUDRAFLORA_OAK_PRESSUREPLATE);
                        output.accept(JMWCBlocks.AUDRAFLORA_OAK_BUTTON);
                        output.accept(JMWCBlocks.AUDRAFLORA_OAK_LEAVES);
                        output.accept(JMWCBlocks.AUDRAFLORA_OAK_SAPLING);

                        output.accept(JMWCBlocks.BLACK_ABORA_LOG);
                        output.accept(JMWCBlocks.BLACK_ABORA_WOOD);
                        output.accept(JMWCBlocks.STRIPPED_BLACK_ABORA_LOG);
                        output.accept(JMWCBlocks.STRIPPED_BLACK_ABORA_WOOD);
                        output.accept(JMWCBlocks.BLACK_ABORA_PLANKS);
                        output.accept(JMWCBlocks.BLACK_ABORA_STAIRS);
                        output.accept(JMWCBlocks.BLACK_ABORA_LOG_STAIRS);
                        output.accept(JMWCBlocks.STRIPPED_BLACK_ABORA_LOG_STAIRS);
                        output.accept(JMWCBlocks.BLACK_ABORA_SLAB);
                        output.accept(JMWCBlocks.BLACK_ABORA_LOG_SLAB);
                        output.accept(JMWCBlocks.STRIPPED_BLACK_ABORA_LOG_SLAB);
                        output.accept(JMWCBlocks.BLACK_ABORA_FENCE);
                        output.accept(JMWCBlocks.BLACK_ABORA_LOG_FENCE);
                        output.accept(JMWCBlocks.BLACK_ABORA_FENCE_GATE);
                        output.accept(JMWCBlocks.BLACK_ABORA_LOG_FENCE_GATE);
                        output.accept(JMWCBlocks.BLACK_ABORA_DOOR);
                        output.accept(JMWCBlocks.BLACK_ABORA_TRAPDOOR);
                        output.accept(JMWCBlocks.BLACK_ABORA_LOG_TRAPDOOR);
                        output.accept(JMWCBlocks.BLACK_ABORA_PRESSUREPLATE);
                        output.accept(JMWCBlocks.BLACK_ABORA_BUTTON);
                        output.accept(JMWCBlocks.BLACK_ABORA_LEAVES);
                        output.accept(JMWCBlocks.BLACK_ABORA_SAPLING);

                        output.accept(JMWCBlocks.CARAVAN_OLIVEWOOD_LOG);
                        output.accept(JMWCBlocks.CARAVAN_OLIVEWOOD_WOOD);
                        output.accept(JMWCBlocks.STRIPPED_CARAVAN_OLIVEWOOD_LOG);
                        output.accept(JMWCBlocks.STRIPPED_CARAVAN_OLIVEWOOD_WOOD);
                        output.accept(JMWCBlocks.CARAVAN_OLIVEWOOD_PLANKS);
                        output.accept(JMWCBlocks.CARAVAN_OLIVEWOOD_STAIRS);
                        output.accept(JMWCBlocks.CARAVAN_OLIVEWOOD_LOG_STAIRS);
                        output.accept(JMWCBlocks.STRIPPED_CARAVAN_OLIVEWOOD_LOG_STAIRS);
                        output.accept(JMWCBlocks.CARAVAN_OLIVEWOOD_SLAB);
                        output.accept(JMWCBlocks.CARAVAN_OLIVEWOOD_LOG_SLAB);
                        output.accept(JMWCBlocks.STRIPPED_CARAVAN_OLIVEWOOD_LOG_SLAB);
                        output.accept(JMWCBlocks.CARAVAN_OLIVEWOOD_FENCE);
                        output.accept(JMWCBlocks.CARAVAN_OLIVEWOOD_LOG_FENCE);
                        output.accept(JMWCBlocks.CARAVAN_OLIVEWOOD_FENCE_GATE);
                        output.accept(JMWCBlocks.CARAVAN_OLIVEWOOD_LOG_FENCE_GATE);
                        output.accept(JMWCBlocks.CARAVAN_OLIVEWOOD_DOOR);
                        output.accept(JMWCBlocks.CARAVAN_OLIVEWOOD_TRAPDOOR);
                        output.accept(JMWCBlocks.CARAVAN_OLIVEWOOD_LOG_TRAPDOOR);
                        output.accept(JMWCBlocks.CARAVAN_OLIVEWOOD_PRESSUREPLATE);
                        output.accept(JMWCBlocks.CARAVAN_OLIVEWOOD_BUTTON);
                        output.accept(JMWCBlocks.CARAVAN_OLIVEWOOD_LEAVES);
                        output.accept(JMWCBlocks.CARAVAN_OLIVEWOOD_SAPLING);

                        output.accept(JMWCBlocks.COPELAND_CEDAR_LOG);
                        output.accept(JMWCBlocks.COPELAND_CEDAR_WOOD);
                        output.accept(JMWCBlocks.STRIPPED_COPELAND_CEDAR_LOG);
                        output.accept(JMWCBlocks.STRIPPED_COPELAND_CEDAR_WOOD);
                        output.accept(JMWCBlocks.COPELAND_CEDAR_PLANKS);
                        output.accept(JMWCBlocks.COPELAND_CEDAR_STAIRS);
                        output.accept(JMWCBlocks.COPELAND_CEDAR_LOG_STAIRS);
                        output.accept(JMWCBlocks.STRIPPED_COPELAND_CEDAR_LOG_STAIRS);
                        output.accept(JMWCBlocks.COPELAND_CEDAR_SLAB);
                        output.accept(JMWCBlocks.COPELAND_CEDAR_LOG_SLAB);
                        output.accept(JMWCBlocks.STRIPPED_COPELAND_CEDAR_LOG_SLAB);
                        output.accept(JMWCBlocks.COPELAND_CEDAR_FENCE);
                        output.accept(JMWCBlocks.COPELAND_CEDAR_LOG_FENCE);
                        output.accept(JMWCBlocks.COPELAND_CEDAR_FENCE_GATE);
                        output.accept(JMWCBlocks.COPELAND_CEDAR_LOG_FENCE_GATE);
                        output.accept(JMWCBlocks.COPELAND_CEDAR_DOOR);
                        output.accept(JMWCBlocks.COPELAND_CEDAR_TRAPDOOR);
                        output.accept(JMWCBlocks.COPELAND_CEDAR_LOG_TRAPDOOR);
                        output.accept(JMWCBlocks.COPELAND_CEDAR_PRESSUREPLATE);
                        output.accept(JMWCBlocks.COPELAND_CEDAR_BUTTON);
                        output.accept(JMWCBlocks.COPELAND_CEDAR_LEAVES);
                        output.accept(JMWCBlocks.COPELAND_CEDAR_SAPLING);

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
