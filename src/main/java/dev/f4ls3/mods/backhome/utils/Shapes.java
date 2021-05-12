package dev.f4ls3.mods.backhome.utils;

import net.minecraft.block.Block;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;

import java.util.stream.Stream;

public class Shapes {

    public static final VoxelShape MONUMENT_OF_TRAVELING_SHAPE = Stream.of(
            Block.makeCuboidShape(2, 3, 2, 14, 27, 14),
            Block.makeCuboidShape(2, 27, 2, 14, 28, 14),
            Block.makeCuboidShape(0, 29, 0, 16, 30, 16),
            Block.makeCuboidShape(1, 28, 1, 15, 29, 15),
            Block.makeCuboidShape(2, 31, 2, 14, 32, 14),
            Block.makeCuboidShape(0, 29, 0, 16, 30, 16),
            Block.makeCuboidShape(1, 30, 1, 15, 31, 15),
            Block.makeCuboidShape(2, 2, 2, 14, 3, 14),
            Block.makeCuboidShape(0, 0, 0, 16, 1, 16),
            Block.makeCuboidShape(1, 1, 1, 15, 2, 15)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();

    public static final VoxelShape MONUMENT_OF_TRAVELING_TOP_SHAPE = VoxelShapes.or(
            Block.makeCuboidShape(2, 2, 2, 14, 3, 14),
            Block.makeCuboidShape(1, 1, 1, 15, 2, 15),
            Block.makeCuboidShape(0, 0, 0, 16, 1, 16),
            Block.makeCuboidShape(3, 3, 3, 13, 14, 13)
    ).simplify();

    public static final VoxelShape MONUMENT_OF_TRAVELING_BOTTOM_SHAPE = VoxelShapes.or(
            Block.makeCuboidShape(2, 2, 2, 14, 3, 14),
            Block.makeCuboidShape(1, 1, 1, 15, 2, 15),
            Block.makeCuboidShape(0, 0, 0, 16, 1, 16),
            Block.makeCuboidShape(3, 3, 3, 13, 14, 13)
    ).simplify();

    /*public static final VoxelShape MONUMENT_OF_TRAVELING_TOP_SHAPE = VoxelShapes.combineAndSimplify(
            VoxelShapes.combineAndSimplify(Block.makeCuboidShape(2, 2, 2, 14, 3, 14),
            VoxelShapes.combineAndSimplify(Block.makeCuboidShape(1, 1, 1, 15, 2, 15),
            Block.makeCuboidShape(0, 0, 0, 16, 1, 16), IBooleanFunction.FIRST), IBooleanFunction.FIRST),
            Block.makeCuboidShape(3, 3, 3, 13, 14, 13), IBooleanFunction.OR);

    public static final VoxelShape MONUMENT_OF_TRAVELING_BOTTOM_SHAPE = VoxelShapes.combineAndSimplify(
            VoxelShapes.combineAndSimplify(Block.makeCuboidShape(2, 2, 2, 14, 3, 14),
            VoxelShapes.combineAndSimplify(Block.makeCuboidShape(1, 1, 1, 15, 2, 15),
            Block.makeCuboidShape(0, 0, 0, 16, 1, 16), IBooleanFunction.FIRST), IBooleanFunction.FIRST),
            Block.makeCuboidShape(3, 3, 3, 13, 14, 13), IBooleanFunction.OR);*/
}
