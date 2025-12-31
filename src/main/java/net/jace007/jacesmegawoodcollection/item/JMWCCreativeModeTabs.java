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

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
