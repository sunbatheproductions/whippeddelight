package sunbatheproductions28.whippeddelight.registry;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import sunbatheproductions28.whippeddelight.WhippedDelight;

public class WDItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, WhippedDelight.MODID);

    public static final RegistryObject<Item> WHIPPED_CREAM = ITEMS.register("whipped_cream",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.3F).build()))
    );

    public static final RegistryObject<Item> WHIPPED_CREAM_CAKE = ITEMS.register("whipped_cream_cake",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(10).saturationMod(1.0F).build())));

}
