package net.qmans.examplemod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.qmans.examplemod.ExampleMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MOD_ID);

    public static final RegistryObject<Item> BALL_OF_THREAD = ITEMS.register("ball_of_thread",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SEWING_NEEDLE = ITEMS.register("sewing_needle",
            () -> new Item(new Item.Properties()));

    public static void  register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }
}
