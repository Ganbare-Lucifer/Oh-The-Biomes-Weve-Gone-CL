package net.potionstudios.biomeswevegone.world.level.block.plants.vegetation;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.potionstudios.biomeswevegone.world.level.block.BWGBlocks;

public class AloeVeraBlock extends BushBlock implements BonemealableBlock {
    public AloeVeraBlock() {
        super(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).strength(0.0f).sound(SoundType.WET_GRASS)
                .noOcclusion().noCollission().randomTicks().pushReaction(PushReaction.DESTROY));
    }

    @Override
    public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if (random.nextInt(5) == 4)
            growBloomingAloeVera(level, pos);
    }

    @Override
    public boolean isRandomlyTicking(BlockState state) {
        return true;
    }

    @Override
    protected boolean mayPlaceOn(BlockState state, BlockGetter level, BlockPos pos) {
        return state.is(BlockTags.SAND);
    }

    @Override
    public boolean isValidBonemealTarget(LevelReader level, BlockPos pos, BlockState state, boolean isClient) {
        return true;
    }

    @Override
    public boolean isBonemealSuccess(Level level, RandomSource random, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public void performBonemeal(ServerLevel level, RandomSource random, BlockPos pos, BlockState state) {
        growBloomingAloeVera(level, pos);
    }

    private void growBloomingAloeVera(ServerLevel level, BlockPos pos) {
        if (level.isEmptyBlock(pos.above())) {
            level.setBlock(pos, BWGBlocks.BLOOMING_ALOE_VERA.get().defaultBlockState().setValue(BloomingAloeVeraBlock.HALF, DoubleBlockHalf.LOWER), 3);
            level.setBlock(pos.above(), BWGBlocks.BLOOMING_ALOE_VERA.get().defaultBlockState().setValue(BloomingAloeVeraBlock.HALF, DoubleBlockHalf.UPPER), 3);
        }
    }
}
