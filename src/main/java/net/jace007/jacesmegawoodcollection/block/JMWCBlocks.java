package net.jace007.jacesmegawoodcollection.block;

import net.jace007.jacesmegawoodcollection.JacesMegaWoodCollection;
import net.jace007.jacesmegawoodcollection.block.custom.JMWCFlammableRotatedPillarBlock;
import net.jace007.jacesmegawoodcollection.block.custom.JMWCLeaves;
import net.jace007.jacesmegawoodcollection.block.custom.JMWCPlanks;
import net.jace007.jacesmegawoodcollection.item.JMWCItems;
import net.jace007.jacesmegawoodcollection.worldgen.tree.JMWCTreeGrowers;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class JMWCBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(JacesMegaWoodCollection.MOD_ID);

    // Next Wood Types Copeland Cedar, Cursed Petal, Diamondfall Elm, Dollhouse Hickory, Dreamspire Alder, Empress Ash, Flashfire Walnut, Flashflux Maple,
    // Fracture Birch, Glowgrain Aspen, Goldflash Oak, Huntress Pine, Lone Wolf Walnut, Lyrelm, Marinth Oak, Moonclaw, Moonveil Aspen, Oracle Elm,
    // Overdrive Ash, Panama City Pine, Pheneombark, Prismwood Ash, Redline Maple, Starstruck Spruce, Sugarthorn, techsprout Timber, Thicket Elm Treetop Maple,
    // Tulgeywood, Venomwood, and Vioak

    public static final DeferredBlock<Block> AGRABAH_CEDAR_LOG = registerBlock("agrabah_cedar_log",
            () -> new JMWCFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> STRIPPED_AGRABAH_CEDAR_LOG = registerBlock("stripped_agrabah_cedar_log",
            () -> new JMWCFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<Block> ALLMEN_OAK_LOG = registerBlock("allmen_oak_log",
            () -> new JMWCFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> STRIPPED_ALLMEN_OAK_LOG = registerBlock("stripped_allmen_oak_log",
            () -> new JMWCFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<Block> AUDRAFLORA_OAK_LOG = registerBlock("audraflora_oak_log",
            () -> new JMWCFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> STRIPPED_AUDRAFLORA_OAK_LOG = registerBlock("stripped_audraflora_oak_log",
            () -> new JMWCFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<Block> BLACK_ABORA_LOG = registerBlock("black_abora_log",
            () -> new JMWCFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> STRIPPED_BLACK_ABORA_LOG = registerBlock("stripped_black_abora_log",
            () -> new JMWCFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<Block> CARAVAN_OLIVEWOOD_LOG = registerBlock("caravan_olivewood_log",
            () -> new JMWCFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> STRIPPED_CARAVAN_OLIVEWOOD_LOG = registerBlock("stripped_caravan_olivewood_log",
            () -> new JMWCFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));

    public static final DeferredBlock<Block> AGRABAH_CEDAR_WOOD = registerBlock("agrabah_cedar_wood",
            () -> new JMWCFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> STRIPPED_AGRABAH_CEDAR_WOOD = registerBlock("stripped_agrabah_cedar_wood",
            () -> new JMWCFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<Block> ALLMEN_OAK_WOOD = registerBlock("allmen_oak_wood",
            () -> new JMWCFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> STRIPPED_ALLMEN_OAK_WOOD = registerBlock("stripped_allmen_oak_wood",
            () -> new JMWCFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<Block> AUDRAFLORA_OAK_WOOD = registerBlock("audraflora_oak_wood",
            () -> new JMWCFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> STRIPPED_AUDRAFLORA_OAK_WOOD = registerBlock("stripped_audraflora_oak_wood",
            () -> new JMWCFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<Block> BLACK_ABORA_WOOD = registerBlock("black_abora_wood",
            () -> new JMWCFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> STRIPPED_BLACK_ABORA_WOOD = registerBlock("stripped_black_abora_wood",
            () -> new JMWCFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<Block> CARAVAN_OLIVEWOOD_WOOD = registerBlock("caravan_olivewood_wood",
            () -> new JMWCFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> STRIPPED_CARAVAN_OLIVEWOOD_WOOD = registerBlock("stripped_caravan_olivewood_wood",
            () -> new JMWCFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));

    public static final DeferredBlock<Block> AGRABAH_CEDAR_PLANKS = registerBlock("agrabah_cedar_planks",
            () -> new JMWCPlanks(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final DeferredBlock<Block> ALLMEN_OAK_PLANKS = registerBlock("allmen_oak_planks",
            () -> new JMWCPlanks(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final DeferredBlock<Block> AUDRAFLORA_OAK_PLANKS = registerBlock("audraflora_oak_planks",
            () -> new JMWCPlanks(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final DeferredBlock<Block> BLACK_ABORA_PLANKS = registerBlock("black_abora_planks",
            () -> new JMWCPlanks(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final DeferredBlock<Block> CARAVAN_OLIVEWOOD_PLANKS = registerBlock("caravan_olivewood_planks",
            () -> new JMWCPlanks(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));

    public static final DeferredBlock<StairBlock> AGRABAH_CEDAR_STAIRS = registerBlock("agrabah_cedar_stairs",
            () -> new StairBlock(JMWCBlocks.AGRABAH_CEDAR_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<StairBlock> AGRABAH_CEDAR_LOG_STAIRS = registerBlock("agrabah_cedar_log_stairs",
            () -> new StairBlock(JMWCBlocks.AGRABAH_CEDAR_LOG.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<StairBlock> STRIPPED_AGRABAH_CEDAR_LOG_STAIRS = registerBlock("stripped_agrabah_cedar_log_stairs",
            () -> new StairBlock(JMWCBlocks.STRIPPED_AGRABAH_CEDAR_LOG.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<StairBlock> ALLMEN_OAK_STAIRS = registerBlock("allmen_oak_stairs",
            () -> new StairBlock(JMWCBlocks.ALLMEN_OAK_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<StairBlock> ALLMEN_OAK_LOG_STAIRS = registerBlock("allmen_oak_log_stairs",
            () -> new StairBlock(JMWCBlocks.ALLMEN_OAK_LOG.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<StairBlock> STRIPPED_ALLMEN_OAK_LOG_STAIRS = registerBlock("stripped_allmen_oak_log_stairs",
            () -> new StairBlock(JMWCBlocks.STRIPPED_ALLMEN_OAK_LOG.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<StairBlock> AUDRAFLORA_OAK_STAIRS = registerBlock("audraflora_oak_stairs",
            () -> new StairBlock(JMWCBlocks.AUDRAFLORA_OAK_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<StairBlock> AUDRAFLORA_OAK_LOG_STAIRS = registerBlock("audraflora_oak_log_stairs",
            () -> new StairBlock(JMWCBlocks.AUDRAFLORA_OAK_LOG.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<StairBlock> STRIPPED_AUDRAFLORA_OAK_LOG_STAIRS = registerBlock("stripped_audraflora_oak_log_stairs",
            () -> new StairBlock(JMWCBlocks.STRIPPED_AUDRAFLORA_OAK_LOG.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<StairBlock> BLACK_ABORA_STAIRS = registerBlock("black_abora_stairs",
            () -> new StairBlock(JMWCBlocks.BLACK_ABORA_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<StairBlock> BLACK_ABORA_LOG_STAIRS = registerBlock("black_abora_log_stairs",
            () -> new StairBlock(JMWCBlocks.BLACK_ABORA_LOG.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<StairBlock> STRIPPED_BLACK_ABORA_LOG_STAIRS = registerBlock("stripped_black_abora_log_stairs",
            () -> new StairBlock(JMWCBlocks.STRIPPED_BLACK_ABORA_LOG.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<StairBlock> CARAVAN_OLIVEWOOD_STAIRS = registerBlock("caravan_olivewood_stairs",
            () -> new StairBlock(JMWCBlocks.CARAVAN_OLIVEWOOD_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<StairBlock> CARAVAN_OLIVEWOOD_LOG_STAIRS = registerBlock("caravan_olivewood_log_stairs",
            () -> new StairBlock(JMWCBlocks.CARAVAN_OLIVEWOOD_LOG.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<StairBlock> STRIPPED_CARAVAN_OLIVEWOOD_LOG_STAIRS = registerBlock("stripped_caravan_olivewood_log_stairs",
            () -> new StairBlock(JMWCBlocks.STRIPPED_CARAVAN_OLIVEWOOD_LOG.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));

    public static final DeferredBlock<SlabBlock> AGRABAH_CEDAR_SLAB = registerBlock("agrabah_cedar_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredBlock<SlabBlock> AGRABAH_CEDAR_LOG_SLAB = registerBlock("agrabah_cedar_log_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredBlock<SlabBlock> STRIPPED_AGRABAH_CEDAR_LOG_SLAB = registerBlock("stripped_agrabah_cedar_log_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredBlock<SlabBlock> ALLMEN_OAK_SLAB = registerBlock("allmen_oak_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredBlock<SlabBlock> ALLMEN_OAK_LOG_SLAB = registerBlock("allmen_oak_log_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredBlock<SlabBlock> STRIPPED_ALLMEN_OAK_LOG_SLAB = registerBlock("stripped_allmen_oak_log_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredBlock<SlabBlock> AUDRAFLORA_OAK_SLAB = registerBlock("audraflora_oak_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredBlock<SlabBlock> AUDRAFLORA_OAK_LOG_SLAB = registerBlock("audraflora_oak_log_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredBlock<SlabBlock> STRIPPED_AUDRAFLORA_OAK_LOG_SLAB = registerBlock("stripped_audraflora_oak_log_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredBlock<SlabBlock> BLACK_ABORA_SLAB = registerBlock("black_abora_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredBlock<SlabBlock> BLACK_ABORA_LOG_SLAB = registerBlock("black_abora_log_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredBlock<SlabBlock> STRIPPED_BLACK_ABORA_LOG_SLAB = registerBlock("stripped_black_abora_log_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredBlock<SlabBlock> CARAVAN_OLIVEWOOD_SLAB = registerBlock("caravan_olivewood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredBlock<SlabBlock> CARAVAN_OLIVEWOOD_LOG_SLAB = registerBlock("caravan_olivewood_log_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredBlock<SlabBlock> STRIPPED_CARAVAN_OLIVEWOOD_LOG_SLAB = registerBlock("stripped_caravan_olivewood_log_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));

    public static final DeferredBlock<FenceBlock> AGRABAH_CEDAR_FENCE = registerBlock("agrabah_cedar_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredBlock<FenceBlock> AGRABAH_CEDAR_LOG_FENCE = registerBlock("agrabah_cedar_log_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredBlock<FenceBlock> ALLMEN_OAK_FENCE = registerBlock("allmen_oak_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredBlock<FenceBlock> ALLMEN_OAK_LOG_FENCE = registerBlock("allmen_oak_log_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredBlock<FenceBlock> AUDRAFLORA_OAK_FENCE = registerBlock("audraflora_oak_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredBlock<FenceBlock> AUDRAFLORA_OAK_LOG_FENCE = registerBlock("audraflora_oak_log_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredBlock<FenceBlock> BLACK_ABORA_FENCE = registerBlock("black_abora_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredBlock<FenceBlock> BLACK_ABORA_LOG_FENCE = registerBlock("black_abora_log_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredBlock<FenceBlock> CARAVAN_OLIVEWOOD_FENCE = registerBlock("caravan_olivewood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredBlock<FenceBlock> CARAVAN_OLIVEWOOD_LOG_FENCE = registerBlock("caravan_olivewood_log_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));

    public static final DeferredBlock<FenceGateBlock> AGRABAH_CEDAR_FENCE_GATE = registerBlock("agrabah_cedar_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_FENCE_GATE)));
    public static final DeferredBlock<FenceGateBlock> AGRABAH_CEDAR_LOG_FENCE_GATE = registerBlock("agrabah_cedar_log_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_FENCE_GATE)));
    public static final DeferredBlock<FenceGateBlock> ALLMEN_OAK_FENCE_GATE = registerBlock("allmen_oak_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_FENCE_GATE)));
    public static final DeferredBlock<FenceGateBlock> ALLMEN_OAK_LOG_FENCE_GATE = registerBlock("allmen_oak_log_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_FENCE_GATE)));
    public static final DeferredBlock<FenceGateBlock> AUDRAFLORA_OAK_FENCE_GATE = registerBlock("audraflora_oak_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_FENCE_GATE)));
    public static final DeferredBlock<FenceGateBlock> AUDRAFLORA_OAK_LOG_FENCE_GATE = registerBlock("audraflora_oak_log_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_FENCE_GATE)));
    public static final DeferredBlock<FenceGateBlock> BLACK_ABORA_FENCE_GATE = registerBlock("black_abora_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_FENCE_GATE)));
    public static final DeferredBlock<FenceGateBlock> BLACK_ABORA_LOG_FENCE_GATE = registerBlock("black_abora_log_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_FENCE_GATE)));
    public static final DeferredBlock<FenceGateBlock> CARAVAN_OLIVEWOOD_FENCE_GATE = registerBlock("caravan_olivewood_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_FENCE_GATE)));
    public static final DeferredBlock<FenceGateBlock> CARAVAN_OLIVEWOOD_LOG_FENCE_GATE = registerBlock("caravan_olivewood_log_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_FENCE_GATE)));

    public static final DeferredBlock<DoorBlock> AGRABAH_CEDAR_DOOR = registerBlock("agrabah_cedar_door",
            () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR)));
    public static final DeferredBlock<DoorBlock> ALLMEN_OAK_DOOR = registerBlock("allmen_oak_door",
            () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR)));
    public static final DeferredBlock<DoorBlock> AUDRAFLORA_OAK_DOOR = registerBlock("audraflora_oak_door",
            () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR)));
    public static final DeferredBlock<DoorBlock> BLACK_ABORA_DOOR = registerBlock("black_abora_door",
            () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR)));
    public static final DeferredBlock<DoorBlock> CARAVAN_OLIVEWOOD_DOOR = registerBlock("caravan_olivewood_door",
            () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR)));

    public static final DeferredBlock<TrapDoorBlock> AGRABAH_CEDAR_TRAPDOOR = registerBlock("agrabah_cedar_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR)));
    public static final DeferredBlock<TrapDoorBlock> AGRABAH_CEDAR_LOG_TRAPDOOR = registerBlock("agrabah_cedar_log_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR)));
    public static final DeferredBlock<TrapDoorBlock> ALLMEN_OAK_TRAPDOOR = registerBlock("allmen_oak_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR)));
    public static final DeferredBlock<TrapDoorBlock> ALLMEN_OAK_LOG_TRAPDOOR = registerBlock("allmen_oak_log_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR)));
    public static final DeferredBlock<TrapDoorBlock> AUDRAFLORA_OAK_TRAPDOOR = registerBlock("audraflora_oak_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR)));
    public static final DeferredBlock<TrapDoorBlock> AUDRAFLORA_OAK_LOG_TRAPDOOR = registerBlock("audraflora_oak_log_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR)));
    public static final DeferredBlock<TrapDoorBlock> BLACK_ABORA_TRAPDOOR = registerBlock("black_abora_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR)));
    public static final DeferredBlock<TrapDoorBlock> BLACK_ABORA_LOG_TRAPDOOR = registerBlock("black_abora_log_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR)));
    public static final DeferredBlock<TrapDoorBlock> CARAVAN_OLIVEWOOD_TRAPDOOR = registerBlock("caravan_olivewood_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR)));
    public static final DeferredBlock<TrapDoorBlock> CARAVAN_OLIVEWOOD_LOG_TRAPDOOR = registerBlock("caravan_olivewood_log_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR)));

    public static final DeferredBlock<ButtonBlock> AGRABAH_CEDAR_BUTTON = registerBlock("agrabah_cedar_button",
            () -> new ButtonBlock(BlockSetType.OAK, 15, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON)));
    public static final DeferredBlock<ButtonBlock> ALLMEN_OAK_BUTTON = registerBlock("allmen_oak_button",
            () -> new ButtonBlock(BlockSetType.OAK, 15, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON)));
    public static final DeferredBlock<ButtonBlock> AUDRAFLORA_OAK_BUTTON = registerBlock("audraflora_oak_button",
            () -> new ButtonBlock(BlockSetType.OAK, 15, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON)));
    public static final DeferredBlock<ButtonBlock> BLACK_ABORA_BUTTON = registerBlock("black_abora_button",
            () -> new ButtonBlock(BlockSetType.OAK, 15, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON)));
    public static final DeferredBlock<ButtonBlock> CARAVAN_OLIVEWOOD_BUTTON = registerBlock("caravan_olivewood_button",
            () -> new ButtonBlock(BlockSetType.OAK, 15, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON)));

    public static final DeferredBlock<PressurePlateBlock> AGRABAH_CEDAR_PRESSUREPLATE = registerBlock("agrabah_cedar_pressureplate",
            () -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final DeferredBlock<PressurePlateBlock> ALLMEN_OAK_PRESSUREPLATE = registerBlock("allmen_oak_pressureplate",
            () -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final DeferredBlock<PressurePlateBlock> AUDRAFLORA_OAK_PRESSUREPLATE = registerBlock("audraflora_oak_pressureplate",
            () -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final DeferredBlock<PressurePlateBlock> BLACK_ABORA_PRESSUREPLATE = registerBlock("black_abora_pressureplate",
            () -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final DeferredBlock<PressurePlateBlock> CARAVAN_OLIVEWOOD_PRESSUREPLATE = registerBlock("caravan_olivewood_pressureplate",
            () -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));

    public static final DeferredBlock<Block> AGRABAH_CEDAR_LEAVES = registerBlock("agrabah_cedar_leaves",
            () -> new JMWCLeaves(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredBlock<Block> ALLMEN_OAK_LEAVES = registerBlock("allmen_oak_leaves",
            () -> new JMWCLeaves(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredBlock<Block> AUDRAFLORA_OAK_LEAVES = registerBlock("audraflora_oak_leaves",
            () -> new JMWCLeaves(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredBlock<Block> BLACK_ABORA_LEAVES = registerBlock("black_abora_leaves",
            () -> new JMWCLeaves(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredBlock<Block> CARAVAN_OLIVEWOOD_LEAVES = registerBlock("caravan_olivewood_leaves",
            () -> new JMWCLeaves(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));

    public static final DeferredBlock<Block> AGRABAH_CEDAR_SAPLING = registerBlock("agrabah_cedar_sapling",
            () -> new SaplingBlock(JMWCTreeGrowers.AGRABAH_CEDAR, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredBlock<Block> ALLMEN_OAK_SAPLING = registerBlock("allmen_oak_sapling",
            () -> new SaplingBlock(JMWCTreeGrowers.ALLMEN_OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredBlock<Block> AUDRAFLORA_OAK_SAPLING = registerBlock("audraflora_oak_sapling",
            () -> new SaplingBlock(JMWCTreeGrowers.AUDRAFLORA_OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredBlock<Block> BLACK_ABORA_SAPLING = registerBlock("black_abora_sapling",
            () -> new SaplingBlock(JMWCTreeGrowers.BLACK_ABORA, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredBlock<Block> CARAVAN_OLIVEWOOD_SAPLING = registerBlock("caravan_olivewood_sapling",
            () -> new SaplingBlock(JMWCTreeGrowers.CARAVAN_OLIVEWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));

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

