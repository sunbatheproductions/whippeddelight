package sunbatheproductions28.whippeddelight;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import sunbatheproductions28.whippeddelight.registry.WDCreativeTabs;
import sunbatheproductions28.whippeddelight.registry.WDItems;

@Mod(WhippedDelight.MODID)
public class WhippedDelight
{
    public static final String MODID = "whippeddelight";

    public WhippedDelight() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);
        WDItems.ITEMS.register(modEventBus);
        WDCreativeTabs.CREATIVE_MODE_TABS.register(modEventBus);
        
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }
}
