package net.jace007.jacesmegawoodcollection.block.custom;

import net.jace007.jacesmegawoodcollection.block.JMWCBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.common.ItemAbility;
import org.jetbrains.annotations.Nullable;

public class JMWCFlammableRotatedPillarBlock extends RotatedPillarBlock {
    public JMWCFlammableRotatedPillarBlock(Properties properties) {
        super(properties);
    }
    @Override
    public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return true;
    }

    @Override
    public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 5;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 5;
    }

    @Override
    public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context,
                                                     ItemAbility itemAbility, boolean simulate) {
        if(context.getItemInHand().getItem() instanceof AxeItem) {
            if(state.is(JMWCBlocks.AGRABAH_CEDAR_LOG)){
                return JMWCBlocks.STRIPPED_AGRABAH_CEDAR_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(JMWCBlocks.AGRABAH_CEDAR_WOOD)){
                return JMWCBlocks.STRIPPED_AGRABAH_CEDAR_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(JMWCBlocks.ALLMEN_OAK_LOG)){
                return JMWCBlocks.STRIPPED_ALLMEN_OAK_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(JMWCBlocks.ALLMEN_OAK_WOOD)){
                return JMWCBlocks.STRIPPED_ALLMEN_OAK_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(JMWCBlocks.AUDRAFLORA_OAK_LOG)){
                return JMWCBlocks.STRIPPED_AUDRAFLORA_OAK_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(JMWCBlocks.AUDRAFLORA_OAK_WOOD)){
                return JMWCBlocks.STRIPPED_AUDRAFLORA_OAK_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(JMWCBlocks.BLACK_ABORA_LOG)){
                return JMWCBlocks.STRIPPED_BLACK_ABORA_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(JMWCBlocks.BLACK_ABORA_WOOD)){
                return JMWCBlocks.STRIPPED_BLACK_ABORA_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(JMWCBlocks.CARAVAN_OLIVEWOOD_LOG)){
                return JMWCBlocks.STRIPPED_CARAVAN_OLIVEWOOD_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(JMWCBlocks.CARAVAN_OLIVEWOOD_WOOD)){
                return JMWCBlocks.STRIPPED_CARAVAN_OLIVEWOOD_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }

        return super.getToolModifiedState(state, context, itemAbility, simulate);
    }
}