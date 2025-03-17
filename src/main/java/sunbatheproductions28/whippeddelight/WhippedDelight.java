package sunbatheproductions28.whippeddelight;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import sunbatheproductions28.whippeddelight.registry.WDCreativeTabs;
import sunbatheproductions28.whippeddelight.registry.WDItems;

@Mod(WhippedDelight.MODID)
public class WhippedDelight
{
    public static final String MODID = "whippeddelight";

    public WhippedDelight(IEventBus modEventBus, ModContainer modContainer) {

        IEventBus forgeBus = NeoForge.EVENT_BUS;
        modEventBus.addListener(this::commonSetup);
        WDItems.register(modEventBus);
        WDCreativeTabs.CREATIVE_MODE_TABS.register(modEventBus);

    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }
}
