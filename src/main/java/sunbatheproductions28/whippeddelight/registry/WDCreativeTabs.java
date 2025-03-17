package sunbatheproductions28.whippeddelight.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import sunbatheproductions28.whippeddelight.WhippedDelight;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = WhippedDelight.MODID)
public class WDCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WhippedDelight.MODID);

    public static final RegistryObject<CreativeModeTab> WHIPPED_CREAM_TAB = CREATIVE_MODE_TABS.register("whipped_cream_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(WDItems.WHIPPED_CREAM.get())) // Icon of the tab
                    .title(Component.translatable("itemGroup.whippeddelight.whipped_delight"))
                    .displayItems((params, output) -> {
                        output.accept(WDItems.WHIPPED_CREAM.get());
                        output.accept(WDItems.WHIPPED_CREAM_CAKE.get());
                    })
                    .build()
    );
}
