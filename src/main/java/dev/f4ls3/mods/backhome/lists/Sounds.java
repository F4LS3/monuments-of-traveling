package dev.f4ls3.mods.backhome.lists;

import dev.f4ls3.mods.backhome.BackHome;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Sounds {

    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS,
            BackHome.MOD_ID);

    public static final RegistryObject<SoundEvent> TRAVELING_SOUND = SOUNDS.register("traveling_sound",
            () -> new SoundEvent(new ResourceLocation(BackHome.MOD_ID, "traveling_sound")));
}
