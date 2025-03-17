package sunbatheproductions28.whippeddelight.registry;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import sunbatheproductions28.whippeddelight.WhippedDelight;

import java.util.function.Supplier;

public class WDItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(BuiltInRegistries.ITEM, WhippedDelight.MODID);

    public static final Supplier<Item> WHIPPED_CREAM = ITEMS.register("whipped_cream",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationModifier(0.3F).build()))
    );

    public static final Supplier<Item> WHIPPED_CREAM_CAKE = ITEMS.register("whipped_cream_cake",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(10).saturationModifier(1.0F).build())));

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }

}
