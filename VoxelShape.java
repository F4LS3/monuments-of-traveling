Stream.of(
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
).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);});