package net.potionstudios.biomeswevegone.world.level.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FarmBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

public class BWGFarmLandBlock extends FarmBlock {
    //private static final int THERIUM_LANTERN_SEARCH_RANGE = 7;

    private final Supplier<Block> dirt;

    public BWGFarmLandBlock(Supplier<Block> dirt) {
        super(BlockBehaviour.Properties.copy(Blocks.FARMLAND).strength(0.2f));
        this.dirt = dirt;
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return !this.defaultBlockState().canSurvive(context.getLevel(), context.getClickedPos())
                ? dirt.get().defaultBlockState() : super.getStateForPlacement(context);
    }

    @Override
    public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if (!state.canSurvive(level, pos))
            turnToDirtBlock(null, state, level, pos);
    }

    @Override
    public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        //if (isNearby(level, pos))
          //  level.setBlock(pos, state.setValue(MOISTURE, 7), 2);
        //else {

            int i = state.getValue(MOISTURE);
            if (!isNearWater(level, pos) && !level.isRainingAt(pos.above())) {
                if (i > 0)
                    level.setBlock(pos, state.setValue(MOISTURE, i - 1), 2);
                else if (!shouldMaintainFarmland(level, pos))
                    turnToDirtBlock(null, state, level, pos);
            } else level.setBlock(pos, state.setValue(MOISTURE, 7), 2);

        //}
    }

    /*
    @Override
    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource random) {
        super.animateTick(state, level, pos, random);
        if (random.nextInt(10) == 0)
            if (isNearby(level, pos))
                level.addParticle(BWGParticles.THERIUM_GLINT.get(), (double) pos.getX() + random.nextDouble(), (double) pos.getY() + 1.1D, (double) pos.getZ() + random.nextDouble(), 0.0D, 0.0D, 0.0D);

    }

     */

    @Override
    public void fallOn(Level level, BlockState state, BlockPos pos, Entity entity, float fallDistance) {
        if (!level.isClientSide
                && level.random.nextFloat() < fallDistance - 0.5F
                && entity instanceof LivingEntity
                && (entity instanceof Player || level.getGameRules().getBoolean(GameRules.RULE_MOBGRIEFING))
                && entity.getBbWidth() * entity.getBbWidth() * entity.getBbHeight() > 0.512F) {
            turnToDirtBlock(entity, state, level, pos);
        }

        entity.causeFallDamage(fallDistance, 1.0F, entity.damageSources().fall());
    }
/*
    private boolean isNearby(Level level, BlockPos pos) {
            for (int x = -THERIUM_LANTERN_SEARCH_RANGE; x <= THERIUM_LANTERN_SEARCH_RANGE; x++)
                for (int y = -THERIUM_LANTERN_SEARCH_RANGE; y <= THERIUM_LANTERN_SEARCH_RANGE; y++)
                    for (int z = -THERIUM_LANTERN_SEARCH_RANGE; z <= THERIUM_LANTERN_SEARCH_RANGE; z++)
                        if (level.getBlockState(pos.offset(x, y, z)).is(BWGBlocks.THERIUM_LANTERN.get()))
                            return true;

            return false;
    }
 */


    private void turnToDirtBlock(@Nullable Entity entity, BlockState state, Level level, BlockPos pos) {
        BlockState blockState = pushEntitiesUp(state, dirt.get().defaultBlockState(), level, pos);
        level.setBlockAndUpdate(pos, blockState);
        level.gameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Context.of(entity, blockState));
    }

    private static boolean shouldMaintainFarmland(BlockGetter level, BlockPos pos) {
        return level.getBlockState(pos.above()).is(BlockTags.MAINTAINS_FARMLAND);
    }

    private static boolean isNearWater(LevelReader level, BlockPos pos) {
        for (BlockPos blockPos : BlockPos.betweenClosed(pos.offset(-4, 0, -4), pos.offset(4, 1, 4)))
            if (level.getFluidState(blockPos).is(FluidTags.WATER))
                return true;
        return false;
    }

}
