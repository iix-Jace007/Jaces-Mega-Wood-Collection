package net.jace007.jacesmegawoodcollection.item;

import net.jace007.jacesmegawoodcollection.JacesMegaWoodCollection;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class JMWCItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(JacesMegaWoodCollection.MOD_ID);

    public static final DeferredItem<Item> AGRABAH_CEDER_STICK = ITEMS.register("agrabah_ceder_stick",
            () -> new Item(new Item.Properties()));



    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
