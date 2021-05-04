package dev.f4ls3.mods.backhome.lists;

import dev.f4ls3.mods.backhome.BackHome;
import dev.f4ls3.mods.backhome.items.TravelingFragmentItem;
import dev.f4ls3.mods.backhome.utils.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Items {

    public static final DeferredRegister<net.minecraft.item.Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            BackHome.MOD_ID);

    public static final RegistryObject<Item> TRAVELING_FRAGMENT_ITEM = ITEMS.register("traveling_fragment",
            () -> new TravelingFragmentItem());
}
