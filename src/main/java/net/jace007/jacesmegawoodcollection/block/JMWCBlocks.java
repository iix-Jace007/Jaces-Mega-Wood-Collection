package net.jace007.jacesmegawoodcollection.block;

import net.jace007.jacesmegawoodcollection.JacesMegaWoodCollection;
import net.jace007.jacesmegawoodcollection.block.custom.JMWCFlammableRotatedPillarBlock;
import net.jace007.jacesmegawoodcollection.block.custom.JMWCLeaves;
import net.jace007.jacesmegawoodcollection.block.custom.JMWCPlanks;
import net.jace007.jacesmegawoodcollection.item.JMWCItems;
import net.jace007.jacesmegawoodcollection.worldgen.tree.JMWCTreeGrowers;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.Properties;
import java.util.function.Supplier;

import static com.ibm.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class JMWCBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(JacesMegaWoodCollection.MOD_ID);

    public static final DeferredBlock<Block> AGRABAH_CEDER_LOG = registerBlock("agrabah_ceder_log",
            () -> new JMWCFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> STRIPPED_AGRABAH_CEDER_LOG = registerBlock("stripped_agrabah_ceder_log",
            () -> new JMWCFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));

    public static final DeferredBlock<Block> AGRABAH_CEDER_WOOD = registerBlock("agrabah_ceder_wood",
            () -> new JMWCFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> STRIPPED_AGRABAH_CEDER_WOOD = registerBlock("stripped_agrabah_ceder_wood",
            () -> new JMWCFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));

    public static final DeferredBlock<Block> AGRABAH_CEDER_PLANKS = registerBlock("agrabah_ceder_planks",
            () -> new JMWCPlanks(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));

    public static final DeferredBlock<StairBlock> AGRABAH_CEDER_STAIRS = registerBlock("agrabah_ceder_stairs",
            () -> new StairBlock(JMWCBlocks.AGRABAH_CEDER_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<StairBlock> AGRABAH_CEDER_LOG_STAIRS = registerBlock("agrabah_ceder_log_stairs",
            () -> new StairBlock(JMWCBlocks.AGRABAH_CEDER_LOG.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<StairBlock> STRIPPED_AGRABAH_CEDER_LOG_STAIRS = registerBlock("stripped_agrabah_ceder_log_stairs",
            () -> new StairBlock(JMWCBlocks.STRIPPED_AGRABAH_CEDER_LOG.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));

    public static final DeferredBlock<SlabBlock> AGRABAH_CEDER_SLAB = registerBlock("agrabah_ceder_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredBlock<SlabBlock> AGRABAH_CEDER_LOG_SLAB = registerBlock("agrabah_ceder_log_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredBlock<SlabBlock> STRIPPED_AGRABAH_CEDER_LOG_SLAB = registerBlock("stripped_agrabah_ceder_log_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));

    public static final DeferredBlock<FenceBlock> AGRABAH_CEDER_FENCE = registerBlock("agrabah_ceder_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredBlock<FenceBlock> AGRABAH_CEDER_LOG_FENCE = registerBlock("agrabah_ceder_log_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));

    public static final DeferredBlock<FenceGateBlock> AGRABAH_CEDER_FENCE_GATE = registerBlock("agrabah_ceder_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_FENCE_GATE)));
    public static final DeferredBlock<FenceGateBlock> AGRABAH_CEDER_LOG_FENCE_GATE = registerBlock("agrabah_ceder_log_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_FENCE_GATE)));

    public static final DeferredBlock<DoorBlock> AGRABAH_CEDER_DOOR = registerBlock("agrabah_ceder_door",
            () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR)));

    public static final DeferredBlock<TrapDoorBlock> AGRABAH_CEDER_TRAPDOOR = registerBlock("agrabah_ceder_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR)));
    public static final DeferredBlock<TrapDoorBlock> AGRABAH_CEDER_LOG_TRAPDOOR = registerBlock("agrabah_ceder_log_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR)));

    public static final DeferredBlock<ButtonBlock> AGRABAH_CEDER_BUTTON = registerBlock("agrabah_ceder_button",
            () -> new ButtonBlock(BlockSetType.OAK, 15, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON)));

    public static final DeferredBlock<PressurePlateBlock> AGRABAH_CEDER_PRESSUREPLATE = registerBlock("agrabah_ceder_pressureplate",
            () -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));

    public static final DeferredBlock<Block> AGRABAH_CEDER_LEAVES = registerBlock("agrabah_ceder_leaves",
            () -> new JMWCLeaves(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));

    public static final DeferredBlock<Block> AGRABAH_CEDER_SAPLING = registerBlock("agrabah_ceder_sapling",
            () -> new SaplingBlock(JMWCTreeGrowers.AGRABAH_CEDER, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        JMWCItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}

