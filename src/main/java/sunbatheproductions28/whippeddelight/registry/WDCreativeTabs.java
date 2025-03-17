package sunbatheproductions28.whippeddelight.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredRegister;
import sunbatheproductions28.whippeddelight.WhippedDelight;

import java.util.function.Supplier;

public class WDCreativeTabs {
    // Register for Creative Mode Tabs
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WhippedDelight.MODID);

    // Register the custom tab
    public static final Supplier<CreativeModeTab> WHIPPED_CREAM_TAB = CREATIVE_MODE_TABS.register("whipped_cream_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(WDItems.WHIPPED_CREAM.get())) // Set the icon of the tab
                    .title(Component.translatable("itemGroup.whippeddelight.whipped_delight")) // Localized name
                    .displayItems((params, output) -> {
                        output.accept(WDItems.WHIPPED_CREAM.get());
                        output.accept(WDItems.WHIPPED_CREAM_CAKE.get());
                    })
                    .build()
    );

}
