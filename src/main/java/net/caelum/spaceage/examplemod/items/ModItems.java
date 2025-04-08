package net.caelum.spaceage.examplemod.items;

import net.caelum.spaceage.examplemod.SpaceAge;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SpaceAge.MODID);


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
