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
            // AGRABAH CEDAR
            if(state.is(JMWCBlocks.AGRABAH_CEDAR_LOG)){
                return JMWCBlocks.STRIPPED_AGRABAH_CEDAR_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(JMWCBlocks.AGRABAH_CEDAR_WOOD)){
                return JMWCBlocks.STRIPPED_AGRABAH_CEDAR_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            // ALANTH
            if(state.is(JMWCBlocks.ALANTH_LOG)){
                return JMWCBlocks.STRIPPED_ALANTH_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(JMWCBlocks.ALANTH_WOOD)){
                return JMWCBlocks.STRIPPED_ALANTH_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            // ALLMEN OAK
            if(state.is(JMWCBlocks.ALLMEN_OAK_LOG)){
                return JMWCBlocks.STRIPPED_ALLMEN_OAK_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(JMWCBlocks.ALLMEN_OAK_WOOD)){
                return JMWCBlocks.STRIPPED_ALLMEN_OAK_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            // ASPENTHINE
            if(state.is(JMWCBlocks.ASPENTHINE_LOG)){
                return JMWCBlocks.STRIPPED_ASPENTHINE_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(JMWCBlocks.ASPENTHINE_WOOD)){
                return JMWCBlocks.STRIPPED_ASPENTHINE_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            // AUBRYN HOLLOW
            if(state.is(JMWCBlocks.AUBRYN_HOLLOW_LOG)){
                return JMWCBlocks.STRIPPED_AUBRYN_HOLLOW_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(JMWCBlocks.AUBRYN_HOLLOW_WOOD)){
                return JMWCBlocks.STRIPPED_AUBRYN_HOLLOW_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            // AURAFLORA OAK
            if(state.is(JMWCBlocks.AUDRAFLORA_OAK_LOG)){
                return JMWCBlocks.STRIPPED_AUDRAFLORA_OAK_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(JMWCBlocks.AUDRAFLORA_OAK_WOOD)){
                return JMWCBlocks.STRIPPED_AUDRAFLORA_OAK_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            // BALLWYN
            if(state.is(JMWCBlocks.BALLWYN_LOG)){
                return JMWCBlocks.STRIPPED_BALLWYN_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(JMWCBlocks.BALLWYN_WOOD)){
                return JMWCBlocks.STRIPPED_BALLWYN_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            // BLACK ABORA
            if(state.is(JMWCBlocks.BLACK_ABORA_LOG)){
                return JMWCBlocks.STRIPPED_BLACK_ABORA_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(JMWCBlocks.BLACK_ABORA_WOOD)){
                return JMWCBlocks.STRIPPED_BLACK_ABORA_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            // BURRENBARK
            if(state.is(JMWCBlocks.BURRENBARK_LOG)){
                return JMWCBlocks.STRIPPED_BURRENBARK_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(JMWCBlocks.BURRENBARK_WOOD)){
                return JMWCBlocks.STRIPPED_BURRENBARK_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            // CARAVAN OLIVEWOOD
            if(state.is(JMWCBlocks.CARAVAN_OLIVEWOOD_LOG)){
                return JMWCBlocks.STRIPPED_CARAVAN_OLIVEWOOD_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(JMWCBlocks.CARAVAN_OLIVEWOOD_WOOD)){
                return JMWCBlocks.STRIPPED_CARAVAN_OLIVEWOOD_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            // COPELAND CEDAR
            if(state.is(JMWCBlocks.COPELAND_CEDAR_LOG)){
                return JMWCBlocks.STRIPPED_COPELAND_CEDAR_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(JMWCBlocks.COPELAND_CEDAR_WOOD)){
                return JMWCBlocks.STRIPPED_COPELAND_CEDAR_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            // CURSED PETAL
            if(state.is(JMWCBlocks.CURSED_PETAL_LOG)){
                return JMWCBlocks.STRIPPED_CURSED_PETAL_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(JMWCBlocks.CURSED_PETAL_WOOD)){
                return JMWCBlocks.STRIPPED_CURSED_PETAL_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            // Diamondfall Flash

            // Dollhouse Hickory

            // Dreamspire Alder

            // Empress Ash

            // Flashfire Walnut

            // Flashflux Maple

            // Fracture Birch

            // Glowgrain Aspen

            // Goldflash Oak

            // Huntress Pine

            // Lone Wolf Walnut

            // Lyrelm

            // Marinth

            // Moonclaw Ash

            // Moonveil Aspen

            // Oracle Elm

            // Overdrive Ash

            // Panama City Pine

            // Phenombark

            // Prismwood

            // Redline Maple

            // Starstruck Spruce

            // Sugarthorn

            // Techsprout Timber

            // Thicket Elm

            // Treetop Maple

            // Tulgeywood

            // Venomwood

            // Vioak
        }

        return super.getToolModifiedState(state, context, itemAbility, simulate);
    }
}