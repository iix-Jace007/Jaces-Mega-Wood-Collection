package net.jace007.jacesmegawoodcollection.item;

import net.jace007.jacesmegawoodcollection.JacesMegaWoodCollection;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class JMWCItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(JacesMegaWoodCollection.MOD_ID);



    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
