package dev.f4ls3.mods.backhome.utils;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

public abstract class Monument {

    private ITextComponent monumentNameComponent;
    private RegistryKey<World> monumentDimension;
    private BlockPos monumentBlockPos;

    protected Monument(ITextComponent monumentNameComponent, RegistryKey<World> monumentDimension, BlockPos monumentBlockPos) {
        this.monumentNameComponent = monumentNameComponent;
        this.monumentDimension = monumentDimension;
        this.monumentBlockPos = monumentBlockPos;
    }

    public abstract void onTeleport(PlayerEntity player);

    public ITextComponent getMonumentNameComponent() {
        return monumentNameComponent;
    }

    public RegistryKey<World> getMonumentDimension() {
        return monumentDimension;
    }

    public BlockPos getMonumentBlockPos() {
        return monumentBlockPos;
    }
}
