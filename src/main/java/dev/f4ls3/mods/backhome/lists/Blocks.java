package dev.f4ls3.mods.backhome.lists;

import dev.f4ls3.mods.backhome.BackHome;
import dev.f4ls3.mods.backhome.blocks.MonumentOfTravelingBlock;
import dev.f4ls3.mods.backhome.utils.VoxelBlock;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Blocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            BackHome.MOD_ID);

    public static final RegistryObject<VoxelBlock> MONUMENT_OF_TRAVELING = BLOCKS.register("monument_of_traveling",
            () -> new MonumentOfTravelingBlock());
}
