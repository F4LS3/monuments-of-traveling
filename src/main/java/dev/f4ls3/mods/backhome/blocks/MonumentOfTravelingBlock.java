package dev.f4ls3.mods.backhome.blocks;

import dev.f4ls3.mods.backhome.utils.Shapes;
import dev.f4ls3.mods.backhome.utils.VoxelBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.DoubleBlockHalf;
import net.minecraftforge.common.ToolType;

public class MonumentOfTravelingBlock extends VoxelBlock {

    private static final EnumProperty<DoubleBlockHalf> HALF = BlockStateProperties.DOUBLE_BLOCK_HALF;

    public MonumentOfTravelingBlock() {
        super(AbstractBlock.Properties
                .create(Material.ROCK)
                .hardnessAndResistance(25f, 2000f)
                .harvestTool(ToolType.PICKAXE)
                .harvestLevel(3)
                .sound(SoundType.STONE), Shapes.MONUMENT_OF_TRAVELING_SHAPE);
        this.setDefaultState(this.getStateContainer().getBaseState().with(HALF, DoubleBlockHalf.LOWER));
    }
}
