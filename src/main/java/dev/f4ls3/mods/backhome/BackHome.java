package dev.f4ls3.mods.backhome;

import dev.f4ls3.mods.backhome.lists.Blocks;
import dev.f4ls3.mods.backhome.lists.Items;
import dev.f4ls3.mods.backhome.lists.Sounds;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.network.IContainerFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(BackHome.MOD_ID)
public class BackHome {

    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "backhome";
    public static final Group ITEM_GROUP = new Group();

    /* TODO: public static final ContainerType<FragmentContainer> FRAGMENT_CONTAINER_TYPE =
            new ContainerType<>((IContainerFactory<FragmentContainer>) (windowId, inv, data) -> {
                Get all placed monuments of traveling, put them in a list and return a new FragmentContainer()
            });*/

    public BackHome() {
        final IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        bus.addListener(this::setup);

        Sounds.SOUNDS.register(bus);
        Items.ITEMS.register(bus);
        Blocks.BLOCKS.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {

    }

    private static class Group extends ItemGroup {

        public Group() {
            super("backhome");
        }

        @Override
        public ItemStack createIcon() {
            return Items.TRAVELING_FRAGMENT_ITEM.get().getDefaultInstance();
        }
    }
}
