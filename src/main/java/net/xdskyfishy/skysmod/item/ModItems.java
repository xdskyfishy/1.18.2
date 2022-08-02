package net.xdskyfishy.skysmod.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.xdskyfishy.skysmod.SkysMod;
import net.xdskyfishy.skysmod.block.ModBlocks;
import net.xdskyfishy.skysmod.item.custom.CoalCokeItem;
import net.xdskyfishy.skysmod.sounds.ModSounds;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SkysMod.MOD_ID);

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TEST_TAB)));

    public static final RegistryObject<Item> RAW_RUBY = ITEMS.register("raw_ruby",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TEST_TAB)));

    public static final RegistryObject<Item> JEALOUSY_JEALOUSY_RECORD = ITEMS.register("jealousy_jealousy_record",
            () -> new RecordItem(4, ModSounds.JEALOUSY_JEALOUSY,
                    new Item.Properties().tab(ModCreativeModeTab.TEST_TAB).stacksTo(1)));

    public static final RegistryObject<Item> COAL_COKE = ITEMS.register("coal_coke",
            () -> new CoalCokeItem(new Item.Properties().tab(ModCreativeModeTab.TEST_TAB)));

    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword",
            () -> new SwordItem(ModTiers.RUBY, 3, 4f,
                    new Item.Properties().tab(ModCreativeModeTab.TEST_TAB)));
    public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe",
            () -> new AxeItem(ModTiers.RUBY, 5, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.TEST_TAB)));
    public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe",
            () -> new PickaxeItem(ModTiers.RUBY, 1, 4f,
                    new Item.Properties().tab(ModCreativeModeTab.TEST_TAB)));
    public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel",
            () -> new ShovelItem(ModTiers.RUBY, 0, 4f,
                    new Item.Properties().tab(ModCreativeModeTab.TEST_TAB)));
    public static final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe",
            () -> new HoeItem(ModTiers.RUBY, 0, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.TEST_TAB)));

    public static final RegistryObject<Item> ENDIERIUM_INGOT = ITEMS.register("endierium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TEST_TAB)));

    public static final RegistryObject<Item> ENDIERIUM_WASTE = ITEMS.register("endierium_waste",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TEST_TAB)));

    public static final RegistryObject<Item> ENDIERIUM_SWORD = ITEMS.register("endierium_sword",
            () -> new SwordItem(ModTiers.ENDIERIUM, 6, 8f,
                    new Item.Properties().tab(ModCreativeModeTab.TEST_TAB)));
    public static final RegistryObject<Item> ENDIERIUM_AXE = ITEMS.register("endierium_axe",
            () -> new AxeItem(ModTiers.ENDIERIUM, 8, 6f,
                    new Item.Properties().tab(ModCreativeModeTab.TEST_TAB)));
    public static final RegistryObject<Item> ENDIERIUM_PICKAXE = ITEMS.register("endierium_pickaxe",
            () -> new PickaxeItem(ModTiers.ENDIERIUM, 1, 8f,
                    new Item.Properties().tab(ModCreativeModeTab.TEST_TAB)));
    public static final RegistryObject<Item> ENDIERIUM_SHOVEL = ITEMS.register("endierium_shovel",
            () -> new ShovelItem(ModTiers.ENDIERIUM, 0, 7f,
                    new Item.Properties().tab(ModCreativeModeTab.TEST_TAB)));
    public static final RegistryObject<Item> ENDIERIUM_HOE = ITEMS.register("endierium_hoe",
            () -> new HoeItem(ModTiers.ENDIERIUM, 0, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.TEST_TAB)));

    public static final RegistryObject<Item> MAGMATIC_WASTE = ITEMS.register("magmatic_waste",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TEST_TAB)));

    public static final RegistryObject<Item> SESAME_SEEDS = ITEMS.register("sesame_seeds",
            () -> new ItemNameBlockItem(ModBlocks.HAMBURER_BUN_CROP.get(), new Item.Properties().tab(ModCreativeModeTab.TEST_TAB)));

    public static final RegistryObject<Item> HAMBURGER_BUN = ITEMS.register("hamburger_bun",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TEST_TAB)
                    .food(new FoodProperties.Builder().nutrition(1).saturationMod(1f).build())));

    public static final RegistryObject<Item> STRAWBERRY_SEEDS = ITEMS.register("strawberry_seeds",
            () -> new ItemNameBlockItem(ModBlocks.STRAWBERRY_BUSH.get(), new Item.Properties().tab(ModCreativeModeTab.TEST_TAB)));

    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TEST_TAB)
                    .food(new FoodProperties.Builder().nutrition(3).saturationMod(3f).build())));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
