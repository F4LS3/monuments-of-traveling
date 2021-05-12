package dev.f4ls3.mods.backhome.lists;

import dev.f4ls3.mods.backhome.BackHome;
import dev.f4ls3.mods.backhome.items.TravelingFragmentItem;
import dev.f4ls3.mods.backhome.utils.Item;
import net.minecraft.item.BlockItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Items {

    public static final DeferredRegister<net.minecraft.item.Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            BackHome.MOD_ID);

    public static final RegistryObject<Item> TRAVELING_FRAGMENT_ITEM = ITEMS.register("traveling_fragment",
            () -> new TravelingFragmentItem());

    public static final RegistryObject<BlockItem> MONUMENT_OF_TRAVELING = ITEMS.register("monument_of_traveling", () -> new BlockItem(Blocks.MONUMENT_OF_TRAVELING.get(),
            new net.minecraft.item.Item.Properties()
                    .group(BackHome.ITEM_GROUP)));
}
