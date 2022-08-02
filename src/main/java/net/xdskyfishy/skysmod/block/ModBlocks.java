package net.xdskyfishy.skysmod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.xdskyfishy.skysmod.SkysMod;
import net.xdskyfishy.skysmod.block.custom.HamburgerBunCropBlock;
import net.xdskyfishy.skysmod.block.custom.HealBlock;
import net.xdskyfishy.skysmod.block.custom.SpeedBlock;
import net.xdskyfishy.skysmod.block.custom.StrawberryCropBlock;
import net.xdskyfishy.skysmod.item.ModCreativeModeTab;
import net.xdskyfishy.skysmod.item.ModItems;


import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, SkysMod.MOD_ID);

    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock("ruby_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3.0f).requiresCorrectToolForDrops().sound(SoundType.METAL)), ModCreativeModeTab.TEST_TAB);

    public static final RegistryObject<Block> RUBY_ORE = registerBlock("ruby_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.TEST_TAB);

    public static final RegistryObject<Block> DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.TEST_TAB);

    public static final RegistryObject<Block> END_RUBY_ORE = registerBlock("end_ruby_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.TEST_TAB);

    public static final RegistryObject<Block> NETHER_RUBY_ORE = registerBlock("nether_ruby_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.TEST_TAB);

    public static final RegistryObject<Block> RAW_RUBY_BLOCK = registerBlock("raw_ruby_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.TEST_TAB);

    public static final RegistryObject<Block> SPEED_BLOCK = registerBlock("speed_block",
            () -> new SpeedBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f).requiresCorrectToolForDrops()), ModCreativeModeTab.TEST_TAB);


    public static final RegistryObject<Block> RUBY_STAIRS = registerBlock("ruby_stairs",
            () -> new StairBlock(() -> ModBlocks.RUBY_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.METAL)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.TEST_TAB);

    public static final RegistryObject<Block> RUBY_SLAB = registerBlock("ruby_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.TEST_TAB);

    public static final RegistryObject<Block> RUBY_WALL = registerBlock("ruby_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.TEST_TAB);


    public static final RegistryObject<Block> RUBY_BUTTON = registerBlock("ruby_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(2f).requiresCorrectToolForDrops().noCollission()), ModCreativeModeTab.TEST_TAB);

    public static final RegistryObject<Block> RUBY_PRESSURE_PLATE = registerBlock("ruby_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,BlockBehaviour.Properties.of(Material.METAL)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.TEST_TAB);

    public static final RegistryObject<Block> ROSE_WOOD_DOOR = registerBlock("rose_wood_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .noOcclusion()), ModCreativeModeTab.TEST_TAB);

    public static final RegistryObject<Block> ROSE_WOOD_TRAPDOOR = registerBlock("rose_wood_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .noOcclusion()), ModCreativeModeTab.TEST_TAB);

    public static final RegistryObject<Block> ROSE_WOOD_LOG = registerBlock("rose_wood_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)),
                    ModCreativeModeTab.TEST_TAB);

    public static final RegistryObject<Block> ROSE_WOOD = registerBlock("rose_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)),
                    ModCreativeModeTab.TEST_TAB);

    public static final RegistryObject<Block> STRIPPED_ROSE_LOG = registerBlock("stripped_rose_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)),
                    ModCreativeModeTab.TEST_TAB);

    public static final RegistryObject<Block> STRIPPED_ROSE_WOOD = registerBlock("stripped_rose_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)),
                     ModCreativeModeTab.TEST_TAB);

    public static final RegistryObject<Block> ROSE_WOOD_PLANKS = registerBlock("rose_wood_planks",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1f)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            }
                , ModCreativeModeTab.TEST_TAB);

    public static final RegistryObject<Block> ROSE_WOOD_LEAVES = registerBlock("rose_wood_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).strength(1f)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
            }
            , ModCreativeModeTab.TEST_TAB);

    public static final RegistryObject<Block> HEAL_BLOCK = registerBlock("heal_block",
            () -> new HealBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f).requiresCorrectToolForDrops()), ModCreativeModeTab.TEST_TAB);

    public static final RegistryObject<Block> ENDIERIUM = registerBlock("endierium",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops().sound(SoundType.ANCIENT_DEBRIS)), ModCreativeModeTab.TEST_TAB);

    public static final RegistryObject<Block> ENDIERIUM_BLOCK = registerBlock("endierium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3.0f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)), ModCreativeModeTab.TEST_TAB);

    public static final RegistryObject<Block> HAMBURER_BUN_CROP = BLOCKS.register("hamburger_bun_crop",
            () -> new HamburgerBunCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));
    public static final RegistryObject<Block> STRAWBERRY_BUSH = BLOCKS.register("strawberry_bush",
            () -> new StrawberryCropBlock(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH)));

    public static final RegistryObject<Block> INFUSER = registerBlock("infuser",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GILDED_BLACKSTONE)
                    .strength(3.0f).requiresCorrectToolForDrops().sound(SoundType.STONE)), ModCreativeModeTab.TEST_TAB);

    public static final RegistryObject<Block> ROSE_WOOD_STAIRS = registerBlock("rose_wood_stairs",
            () -> new StairBlock(() -> ModBlocks.ROSE_WOOD_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.WOOD)
                            .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)), ModCreativeModeTab.TEST_TAB);

    public static final RegistryObject<Block> ROSE_WOOD_SLAB = registerBlock("rose_wood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)), ModCreativeModeTab.TEST_TAB);

    public static final RegistryObject<Block> ROSE_WOOD_FENCE = registerBlock("rose_wood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)), ModCreativeModeTab.TEST_TAB);

    public static final RegistryObject<Block> ROSE_WOOD_FENCE_GATE = registerBlock("rose_wood_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)), ModCreativeModeTab.TEST_TAB);


    public static final RegistryObject<Block> ROSE_WOOD_BUTTON = registerBlock("rose_wood_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f).requiresCorrectToolForDrops().noCollission().sound(SoundType.WOOD)), ModCreativeModeTab.TEST_TAB);

    public static final RegistryObject<Block> ROSE_WOOD_PRESSURE_PLATE = registerBlock("rose_wood_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)), ModCreativeModeTab.TEST_TAB);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        }
    }
