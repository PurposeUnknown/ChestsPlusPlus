package com.jamesdpeters.minecraft.chests.filters;

import com.google.common.collect.Sets;
import com.jamesdpeters.minecraft.chests.ChestsPlusPlus;
import org.bukkit.Keyed;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.Tag;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

@SuppressWarnings("rawtypes")
public class ChestsPlusPlusTag {

    public static Tag SEEDS;
    public static Tag WOOD_MATERIAL; 
    public static Tag REDSTONE; 
    public static Tag PLANT; 
    public static Tag RAW_WOOD; 
    public static Tag SAPLING; 
    public static Tag NONE; 
    public static Tag SPAWN_EGG; 
    public static Tag GEM; 
    public static Tag ORE; 
    public static Tag DECORATIVE_BLOCK; 
    public static Tag DECORATION; 
    public static Tag UTILITY; 
    public static Tag FOOD; 
    public static Tag ARMOR; 
    public static Tag ARROW; 
    public static Tag BUCKET_MOB; 
    public static Tag COOKED_FOOD; 
    public static Tag STORAGE; 
    public static Tag MOB_BLOCK; 
    public static Tag RAW_FOOD; 
    public static Tag BED; 
    public static Tag WOOL; 
    public static Tag DYE; 
    public static Tag GLASS; 
    public static Tag MOB_DROP; 
    public static Tag ICE; 
    public static Tag SMITHING; 
    public static Tag BOOK; 
    public static Tag WEAPON; 
    public static Tag CORAL; 
    public static Tag TOOL; 
    public static Tag FUEL; 
    public static Tag CLAY; 
    public static Tag DIRT; 
    public static Tag COBBLESTONE; 
    public static Tag SEED; 
    public static Tag METAL; 
    public static Tag INGOT; 
    public static Tag HEAD; 
    public static Tag DIAMOND; 
    public static Tag MUSIC; 
    public static Tag GEMS; 
    public static Tag ENCHANTING; 
    public static Tag MAP; 
    public static Tag MISC; 
    public static Tag FLINT; 
    public static Tag GLOWSTONE; 
    public static Tag GOLD; 
    public static Tag IRON; 
    public static Tag DOOR; 
    public static Tag LAPIS; 
    public static Tag LEATHER; 
    public static Tag POTION; 
    public static Tag NETHERITE; 
    public static Tag JUNK; 
    public static Tag QUARTZ; 
    public static Tag SAND; 
    public static Tag TORCH; 

    static {
        SEEDS = new Tag() {

            @Override
            public boolean isTagged(@NotNull Keyed item) {
                return item.equals(Material.WHEAT_SEEDS) || item.equals(Material.PUMPKIN_SEEDS) || item.equals(Material.MELON_SEEDS) || item.equals(Material.BEETROOT_SEEDS);
            }

            @NotNull
            @Override
            public Set<Material> getValues() {
                return Sets.newHashSet(Material.WHEAT_SEEDS, Material.PUMPKIN_SEEDS, Material.MELON_SEEDS, Material.BEETROOT_SEEDS);
            }

            @NotNull
            @Override
            public NamespacedKey getKey() {
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "seeds");
            }
        };
        
        WOOD_MATERIAL = new Tag() {

            @Override
            public boolean isTagged(@NotNull Keyed item) {
                return item.equals(Material.ACACIA_BOAT) || item.equals(Material.ACACIA_DOOR) || item.equals(Material.ACACIA_FENCE) || item.equals(Material.ACACIA_FENCE_GATE) || item.equals(Material.ACACIA_PLANKS) || item.equals(Material.ACACIA_SIGN) || item.equals(Material.ACACIA_SLAB) || item.equals(Material.ACACIA_STAIRS) || item.equals(Material.ACACIA_TRAPDOOR) || item.equals(Material.ACACIA_WALL_SIGN) || item.equals(Material.BAMBOO_WALL_SIGN) || item.equals(Material.BIRCH_BOAT) || item.equals(Material.BIRCH_DOOR) || item.equals(Material.BIRCH_FENCE) || item.equals(Material.BIRCH_FENCE_GATE) || item.equals(Material.BIRCH_LEAVES) || item.equals(Material.BIRCH_PLANKS) || item.equals(Material.BIRCH_SIGN) || item.equals(Material.BIRCH_SLAB) || item.equals(Material.BIRCH_STAIRS) || item.equals(Material.BIRCH_TRAPDOOR) || item.equals(Material.BIRCH_WALL_SIGN) || item.equals(Material.BIRCH_WOOD) || item.equals(Material.CRIMSON_DOOR) || item.equals(Material.CRIMSON_FENCE) || item.equals(Material.CRIMSON_FENCE_GATE) || item.equals(Material.CRIMSON_FUNGUS) || item.equals(Material.CRIMSON_HYPHAE) || item.equals(Material.CRIMSON_NYLIUM) || item.equals(Material.CRIMSON_PLANKS) || item.equals(Material.CRIMSON_ROOTS) || item.equals(Material.CRIMSON_SIGN) || item.equals(Material.CRIMSON_SLAB) || item.equals(Material.CRIMSON_STAIRS) || item.equals(Material.CRIMSON_STEM) || item.equals(Material.CRIMSON_TRAPDOOR) || item.equals(Material.CRIMSON_WALL_SIGN) || item.equals(Material.DARK_OAK_BOAT) || item.equals(Material.DARK_OAK_DOOR) || item.equals(Material.DARK_OAK_FENCE) || item.equals(Material.DARK_OAK_FENCE_GATE) || item.equals(Material.DARK_OAK_LEAVES) || item.equals(Material.DARK_OAK_PLANKS) || item.equals(Material.DARK_OAK_SIGN) || item.equals(Material.DARK_OAK_SLAB) || item.equals(Material.DARK_OAK_STAIRS) || item.equals(Material.DARK_OAK_TRAPDOOR) || item.equals(Material.DARK_OAK_WALL_SIGN) || item.equals(Material.DARK_OAK_WOOD) || item.equals(Material.JUNGLE_BOAT) || item.equals(Material.JUNGLE_DOOR) || item.equals(Material.JUNGLE_FENCE) || item.equals(Material.JUNGLE_FENCE_GATE) || item.equals(Material.JUNGLE_PLANKS) || item.equals(Material.JUNGLE_SIGN) || item.equals(Material.JUNGLE_SLAB) || item.equals(Material.JUNGLE_STAIRS) || item.equals(Material.JUNGLE_TRAPDOOR) || item.equals(Material.JUNGLE_WALL_SIGN) || item.equals(Material.OAK_BOAT) || item.equals(Material.OAK_DOOR) || item.equals(Material.OAK_FENCE) || item.equals(Material.OAK_FENCE_GATE) || item.equals(Material.OAK_PLANKS) || item.equals(Material.OAK_SIGN) || item.equals(Material.OAK_SLAB) || item.equals(Material.OAK_STAIRS) || item.equals(Material.OAK_TRAPDOOR) || item.equals(Material.OAK_WALL_SIGN) || item.equals(Material.SPRUCE_BOAT) || item.equals(Material.SPRUCE_DOOR) || item.equals(Material.SPRUCE_FENCE) || item.equals(Material.SPRUCE_FENCE_GATE) || item.equals(Material.SPRUCE_PLANKS) || item.equals(Material.SPRUCE_SIGN) || item.equals(Material.SPRUCE_SLAB) || item.equals(Material.SPRUCE_STAIRS) || item.equals(Material.SPRUCE_TRAPDOOR) || item.equals(Material.SPRUCE_WALL_SIGN) || item.equals(Material.STICK);
            }

            @NotNull
            @Override
            public Set<Material> getValues() {
                return Sets.newHashSet(Material.ACACIA_BOAT, Material.ACACIA_DOOR, Material.ACACIA_FENCE, Material.ACACIA_FENCE_GATE, Material.ACACIA_PLANKS, Material.ACACIA_SIGN, Material.ACACIA_SLAB, Material.ACACIA_STAIRS, Material.ACACIA_TRAPDOOR, Material.ACACIA_WALL_SIGN, Material.BAMBOO_WALL_SIGN, Material.BIRCH_BOAT, Material.BIRCH_DOOR, Material.BIRCH_FENCE, Material.BIRCH_FENCE_GATE, Material.BIRCH_LEAVES, Material.BIRCH_PLANKS, Material.BIRCH_SIGN, Material.BIRCH_SLAB, Material.BIRCH_STAIRS, Material.BIRCH_TRAPDOOR, Material.BIRCH_WALL_SIGN, Material.BIRCH_WOOD, Material.CRIMSON_DOOR, Material.CRIMSON_FENCE, Material.CRIMSON_FENCE_GATE, Material.CRIMSON_FUNGUS, Material.CRIMSON_HYPHAE, Material.CRIMSON_NYLIUM, Material.CRIMSON_PLANKS, Material.CRIMSON_ROOTS, Material.CRIMSON_SIGN, Material.CRIMSON_SLAB, Material.CRIMSON_STAIRS, Material.CRIMSON_STEM, Material.CRIMSON_TRAPDOOR, Material.CRIMSON_WALL_SIGN, Material.DARK_OAK_BOAT, Material.DARK_OAK_DOOR, Material.DARK_OAK_FENCE, Material.DARK_OAK_FENCE_GATE, Material.DARK_OAK_LEAVES, Material.DARK_OAK_PLANKS, Material.DARK_OAK_SIGN, Material.DARK_OAK_SLAB, Material.DARK_OAK_STAIRS, Material.DARK_OAK_TRAPDOOR, Material.DARK_OAK_WALL_SIGN, Material.DARK_OAK_WOOD, Material.JUNGLE_BOAT, Material.JUNGLE_DOOR, Material.JUNGLE_FENCE, Material.JUNGLE_FENCE_GATE, Material.JUNGLE_PLANKS, Material.JUNGLE_SIGN, Material.JUNGLE_SLAB, Material.JUNGLE_STAIRS, Material.JUNGLE_TRAPDOOR, Material.JUNGLE_WALL_SIGN, Material.OAK_BOAT, Material.OAK_DOOR, Material.OAK_FENCE, Material.OAK_FENCE_GATE, Material.OAK_PLANKS, Material.OAK_SIGN, Material.OAK_SLAB, Material.OAK_STAIRS, Material.OAK_TRAPDOOR, Material.OAK_WALL_SIGN, Material.SPRUCE_BOAT, Material.SPRUCE_DOOR, Material.SPRUCE_FENCE, Material.SPRUCE_FENCE_GATE, Material.SPRUCE_PLANKS, Material.SPRUCE_SIGN, Material.SPRUCE_SLAB, Material.SPRUCE_STAIRS, Material.SPRUCE_TRAPDOOR, Material.SPRUCE_WALL_SIGN, Material.STICK);
            }

            @NotNull
            @Override
            public NamespacedKey getKey() {
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "wood_material");
            }
        };
    
        REDSTONE = new Tag() {

            @Override
            public boolean isTagged(@NotNull Keyed item) {
                return item.equals(Material.ACACIA_BUTTON) || item.equals(Material.ACACIA_PRESSURE_PLATE) || item.equals(Material.ACTIVATOR_RAIL) || item.equals(Material.BAMBOO_BUTTON) || item.equals(Material.BAMBOO_PRESSURE_PLATE) || item.equals(Material.BIRCH_BUTTON) || item.equals(Material.BIRCH_PRESSURE_PLATE) || item.equals(Material.CHERRY_BUTTON) || item.equals(Material.CHERRY_PRESSURE_PLATE) || item.equals(Material.COMPARATOR) || item.equals(Material.CRIMSON_BUTTON) || item.equals(Material.CRIMSON_PRESSURE_PLATE) || item.equals(Material.DARK_OAK_BUTTON) || item.equals(Material.DARK_OAK_PRESSURE_PLATE) || item.equals(Material.DAYLIGHT_DETECTOR) || item.equals(Material.DETECTOR_RAIL) || item.equals(Material.DISPENSER) || item.equals(Material.DROPPER) || item.equals(Material.HEAVY_WEIGHTED_PRESSURE_PLATE) || item.equals(Material.IRON_TRAPDOOR) || item.equals(Material.JUNGLE_BUTTON) || item.equals(Material.JUNGLE_PRESSURE_PLATE) || item.equals(Material.LEVER) || item.equals(Material.LIGHT_WEIGHTED_PRESSURE_PLATE) || item.equals(Material.MANGROVE_BUTTON) || item.equals(Material.MANGROVE_PRESSURE_PLATE) || item.equals(Material.MOVING_PISTON) || item.equals(Material.OAK_BUTTON) || item.equals(Material.OAK_PRESSURE_PLATE) || item.equals(Material.OBSERVER) || item.equals(Material.PISTON) || item.equals(Material.PISTON_HEAD) || item.equals(Material.POLISHED_BLACKSTONE_BUTTON) || item.equals(Material.POLISHED_BLACKSTONE_PRESSURE_PLATE) || item.equals(Material.POWERED_RAIL) || item.equals(Material.RAIL) || item.equals(Material.REDSTONE) || item.equals(Material.REDSTONE_BLOCK) || item.equals(Material.REDSTONE_LAMP) || item.equals(Material.REDSTONE_ORE) || item.equals(Material.REDSTONE_TORCH) || item.equals(Material.REDSTONE_WALL_TORCH) || item.equals(Material.REDSTONE_WIRE) || item.equals(Material.REPEATER) || item.equals(Material.SPRUCE_BUTTON) || item.equals(Material.SPRUCE_PRESSURE_PLATE) || item.equals(Material.STICKY_PISTON) || item.equals(Material.STONE_BUTTON) || item.equals(Material.STONE_PRESSURE_PLATE) || item.equals(Material.TARGET) || item.equals(Material.TRIPWIRE) || item.equals(Material.TRIPWIRE_HOOK) || item.equals(Material.WARPED_BUTTON) || item.equals(Material.WARPED_PRESSURE_PLATE);
            }

            @NotNull
            @Override
            public Set<Material> getValues() {
                return Sets.newHashSet(Material.ACACIA_BUTTON, Material.ACACIA_PRESSURE_PLATE, Material.ACTIVATOR_RAIL, Material.BAMBOO_BUTTON, Material.BAMBOO_PRESSURE_PLATE, Material.BIRCH_BUTTON, Material.BIRCH_PRESSURE_PLATE, Material.CHERRY_BUTTON, Material.CHERRY_PRESSURE_PLATE, Material.COMPARATOR, Material.CRIMSON_BUTTON, Material.CRIMSON_PRESSURE_PLATE, Material.DARK_OAK_BUTTON, Material.DARK_OAK_PRESSURE_PLATE, Material.DAYLIGHT_DETECTOR, Material.DETECTOR_RAIL, Material.DISPENSER, Material.DROPPER, Material.HEAVY_WEIGHTED_PRESSURE_PLATE, Material.IRON_TRAPDOOR, Material.JUNGLE_BUTTON, Material.JUNGLE_PRESSURE_PLATE, Material.LEVER, Material.LIGHT_WEIGHTED_PRESSURE_PLATE, Material.MANGROVE_BUTTON, Material.MANGROVE_PRESSURE_PLATE, Material.MOVING_PISTON, Material.OAK_BUTTON, Material.OAK_PRESSURE_PLATE, Material.OBSERVER, Material.PISTON, Material.PISTON_HEAD, Material.POLISHED_BLACKSTONE_BUTTON, Material.POLISHED_BLACKSTONE_PRESSURE_PLATE, Material.POWERED_RAIL, Material.RAIL, Material.REDSTONE, Material.REDSTONE_BLOCK, Material.REDSTONE_LAMP, Material.REDSTONE_ORE, Material.REDSTONE_TORCH, Material.REDSTONE_WALL_TORCH, Material.REDSTONE_WIRE, Material.REPEATER, Material.SPRUCE_BUTTON, Material.SPRUCE_PRESSURE_PLATE, Material.STICKY_PISTON, Material.STONE_BUTTON, Material.STONE_PRESSURE_PLATE, Material.TARGET, Material.TRIPWIRE, Material.TRIPWIRE_HOOK, Material.WARPED_BUTTON, Material.WARPED_PRESSURE_PLATE);
            }

            @NotNull
            @Override
            public NamespacedKey getKey() {
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "redstone");
            }
        };
    
        PLANT = new Tag() {

            @Override
            public boolean isTagged(@NotNull Keyed item) {
                return item.equals(Material.ACACIA_LEAVES) || item.equals(Material.ALLIUM) || item.equals(Material.AZALEA) || item.equals(Material.AZALEA_LEAVES) || item.equals(Material.AZURE_BLUET) || item.equals(Material.BEETROOT_SEEDS) || item.equals(Material.BEETROOTS) || item.equals(Material.BIG_DRIPLEAF) || item.equals(Material.BIG_DRIPLEAF_STEM) || item.equals(Material.BLUE_ORCHID) || item.equals(Material.BONE_MEAL) || item.equals(Material.BROWN_MUSHROOM) || item.equals(Material.BROWN_MUSHROOM_BLOCK) || item.equals(Material.BUNDLE) || item.equals(Material.CACTUS) || item.equals(Material.CARVED_PUMPKIN) || item.equals(Material.CAVE_VINES) || item.equals(Material.CAVE_VINES_PLANT) || item.equals(Material.CHORUS_FLOWER) || item.equals(Material.CHORUS_FRUIT) || item.equals(Material.CHORUS_PLANT) || item.equals(Material.COCOA) || item.equals(Material.CORNFLOWER) || item.equals(Material.DANDELION) || item.equals(Material.DEAD_BUSH) || item.equals(Material.DRIED_KELP) || item.equals(Material.DRIED_KELP_BLOCK) || item.equals(Material.FERN) || item.equals(Material.FLOWERING_AZALEA) || item.equals(Material.FLOWERING_AZALEA_LEAVES) || item.equals(Material.GLOW_LICHEN) || item.equals(Material.GRASS_BLOCK) || item.equals(Material.HANGING_ROOTS) || item.equals(Material.HAY_BLOCK) || item.equals(Material.JACK_O_LANTERN) || item.equals(Material.JUNGLE_LEAVES) || item.equals(Material.KELP) || item.equals(Material.KELP_PLANT) || item.equals(Material.LARGE_FERN) || item.equals(Material.LILAC) || item.equals(Material.LILY_OF_THE_VALLEY) || item.equals(Material.LILY_PAD) || item.equals(Material.MANGROVE_LEAVES) || item.equals(Material.MELON_SEEDS) || item.equals(Material.MELON_STEM) || item.equals(Material.MOSS_BLOCK) || item.equals(Material.MUDDY_MANGROVE_ROOTS) || item.equals(Material.NETHER_SPROUTS) || item.equals(Material.NETHER_WART) || item.equals(Material.NETHER_WART_BLOCK) || item.equals(Material.OAK_LEAVES) || item.equals(Material.ORANGE_TULIP) || item.equals(Material.OXEYE_DAISY) || item.equals(Material.PEONY) || item.equals(Material.PINK_PETALS) || item.equals(Material.PINK_TULIP) || item.equals(Material.PITCHER_CROP) || item.equals(Material.PITCHER_PLANT) || item.equals(Material.PITCHER_POD) || item.equals(Material.POPPY) || item.equals(Material.PUMPKIN) || item.equals(Material.PUMPKIN_SEEDS) || item.equals(Material.PUMPKIN_STEM) || item.equals(Material.RED_MUSHROOM) || item.equals(Material.RED_MUSHROOM_BLOCK) || item.equals(Material.RED_TULIP) || item.equals(Material.ROSE_BUSH) || item.equals(Material.SEAGRASS) || item.equals(Material.SHORT_GRASS) || item.equals(Material.SMALL_DRIPLEAF) || item.equals(Material.SPORE_BLOSSOM) || item.equals(Material.SPRUCE_LEAVES) || item.equals(Material.SUGAR_CANE) || item.equals(Material.SUNFLOWER) || item.equals(Material.SWEET_BERRY_BUSH) || item.equals(Material.TALL_GRASS) || item.equals(Material.TALL_SEAGRASS) || item.equals(Material.TORCHFLOWER) || item.equals(Material.TORCHFLOWER_CROP) || item.equals(Material.TORCHFLOWER_SEEDS) || item.equals(Material.TWISTING_VINES) || item.equals(Material.TWISTING_VINES_PLANT) || item.equals(Material.VINE) || item.equals(Material.WARPED_FUNGUS) || item.equals(Material.WARPED_ROOTS) || item.equals(Material.WEEPING_VINES) || item.equals(Material.WEEPING_VINES_PLANT) || item.equals(Material.WHEAT) || item.equals(Material.WHEAT_SEEDS) || item.equals(Material.WHITE_TULIP) || item.equals(Material.WITHER_ROSE);
            }

            @NotNull
            @Override
            public Set<Material> getValues() {
                return Sets.newHashSet(Material.ACACIA_LEAVES, Material.ALLIUM, Material.AZALEA, Material.AZALEA_LEAVES, Material.AZURE_BLUET, Material.BEETROOT_SEEDS, Material.BEETROOTS, Material.BIG_DRIPLEAF, Material.BIG_DRIPLEAF_STEM, Material.BLUE_ORCHID, Material.BONE_MEAL, Material.BROWN_MUSHROOM, Material.BROWN_MUSHROOM_BLOCK, Material.BUNDLE, Material.CACTUS, Material.CARVED_PUMPKIN, Material.CAVE_VINES, Material.CAVE_VINES_PLANT, Material.CHORUS_FLOWER, Material.CHORUS_FRUIT, Material.CHORUS_PLANT, Material.COCOA, Material.CORNFLOWER, Material.DANDELION, Material.DEAD_BUSH, Material.DRIED_KELP, Material.DRIED_KELP_BLOCK, Material.FERN, Material.FLOWERING_AZALEA, Material.FLOWERING_AZALEA_LEAVES, Material.GLOW_LICHEN, Material.GRASS_BLOCK, Material.HANGING_ROOTS, Material.HAY_BLOCK, Material.JACK_O_LANTERN, Material.JUNGLE_LEAVES, Material.KELP, Material.KELP_PLANT, Material.LARGE_FERN, Material.LILAC, Material.LILY_OF_THE_VALLEY, Material.LILY_PAD, Material.MANGROVE_LEAVES, Material.MELON_SEEDS, Material.MELON_STEM, Material.MOSS_BLOCK, Material.MUDDY_MANGROVE_ROOTS, Material.NETHER_SPROUTS, Material.NETHER_WART, Material.NETHER_WART_BLOCK, Material.OAK_LEAVES, Material.ORANGE_TULIP, Material.OXEYE_DAISY, Material.PEONY, Material.PINK_PETALS, Material.PINK_TULIP, Material.PITCHER_CROP, Material.PITCHER_PLANT, Material.PITCHER_POD, Material.POPPY, Material.PUMPKIN, Material.PUMPKIN_SEEDS, Material.PUMPKIN_STEM, Material.RED_MUSHROOM, Material.RED_MUSHROOM_BLOCK, Material.RED_TULIP, Material.ROSE_BUSH, Material.SEAGRASS, Material.SHORT_GRASS, Material.SMALL_DRIPLEAF, Material.SPORE_BLOSSOM, Material.SPRUCE_LEAVES, Material.SUGAR_CANE, Material.SUNFLOWER, Material.SWEET_BERRY_BUSH, Material.TALL_GRASS, Material.TALL_SEAGRASS, Material.TORCHFLOWER, Material.TORCHFLOWER_CROP, Material.TORCHFLOWER_SEEDS, Material.TWISTING_VINES, Material.TWISTING_VINES_PLANT, Material.VINE, Material.WARPED_FUNGUS, Material.WARPED_ROOTS, Material.WEEPING_VINES, Material.WEEPING_VINES_PLANT, Material.WHEAT, Material.WHEAT_SEEDS, Material.WHITE_TULIP, Material.WITHER_ROSE);
            }

            @NotNull
            @Override
            public NamespacedKey getKey() {
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "plant");
            }
        };
    
        RAW_WOOD = new Tag() {

            @Override
            public boolean isTagged(@NotNull Keyed item) {
                return item.equals(Material.ACACIA_LOG) || item.equals(Material.ACACIA_WOOD) || item.equals(Material.BAMBOO) || item.equals(Material.BIRCH_LOG) || item.equals(Material.CHERRY_LOG) || item.equals(Material.DARK_OAK_LOG) || item.equals(Material.JUNGLE_LOG) || item.equals(Material.JUNGLE_WOOD) || item.equals(Material.MANGROVE_LOG) || item.equals(Material.MANGROVE_WOOD) || item.equals(Material.OAK_LOG) || item.equals(Material.OAK_WOOD) || item.equals(Material.SPRUCE_LOG) || item.equals(Material.SPRUCE_WOOD) || item.equals(Material.STRIPPED_ACACIA_LOG) || item.equals(Material.STRIPPED_ACACIA_WOOD) || item.equals(Material.STRIPPED_BAMBOO_BLOCK) || item.equals(Material.STRIPPED_BIRCH_LOG) || item.equals(Material.STRIPPED_BIRCH_WOOD) || item.equals(Material.STRIPPED_CHERRY_LOG) || item.equals(Material.STRIPPED_CHERRY_WOOD) || item.equals(Material.STRIPPED_CRIMSON_HYPHAE) || item.equals(Material.STRIPPED_CRIMSON_STEM) || item.equals(Material.STRIPPED_DARK_OAK_LOG) || item.equals(Material.STRIPPED_DARK_OAK_WOOD) || item.equals(Material.STRIPPED_JUNGLE_LOG) || item.equals(Material.STRIPPED_JUNGLE_WOOD) || item.equals(Material.STRIPPED_MANGROVE_LOG) || item.equals(Material.STRIPPED_MANGROVE_WOOD) || item.equals(Material.STRIPPED_OAK_LOG) || item.equals(Material.STRIPPED_OAK_WOOD) || item.equals(Material.STRIPPED_SPRUCE_LOG) || item.equals(Material.STRIPPED_SPRUCE_WOOD) || item.equals(Material.STRIPPED_WARPED_HYPHAE) || item.equals(Material.STRIPPED_WARPED_STEM);
            }

            @NotNull
            @Override
            public Set<Material> getValues() {
                return Sets.newHashSet(Material.ACACIA_LOG, Material.ACACIA_WOOD, Material.BAMBOO, Material.BIRCH_LOG, Material.CHERRY_LOG, Material.DARK_OAK_LOG, Material.JUNGLE_LOG, Material.JUNGLE_WOOD, Material.MANGROVE_LOG, Material.MANGROVE_WOOD, Material.OAK_LOG, Material.OAK_WOOD, Material.SPRUCE_LOG, Material.SPRUCE_WOOD, Material.STRIPPED_ACACIA_LOG, Material.STRIPPED_ACACIA_WOOD, Material.STRIPPED_BAMBOO_BLOCK, Material.STRIPPED_BIRCH_LOG, Material.STRIPPED_BIRCH_WOOD, Material.STRIPPED_CHERRY_LOG, Material.STRIPPED_CHERRY_WOOD, Material.STRIPPED_CRIMSON_HYPHAE, Material.STRIPPED_CRIMSON_STEM, Material.STRIPPED_DARK_OAK_LOG, Material.STRIPPED_DARK_OAK_WOOD, Material.STRIPPED_JUNGLE_LOG, Material.STRIPPED_JUNGLE_WOOD, Material.STRIPPED_MANGROVE_LOG, Material.STRIPPED_MANGROVE_WOOD, Material.STRIPPED_OAK_LOG, Material.STRIPPED_OAK_WOOD, Material.STRIPPED_SPRUCE_LOG, Material.STRIPPED_SPRUCE_WOOD, Material.STRIPPED_WARPED_HYPHAE, Material.STRIPPED_WARPED_STEM);
            }

            @NotNull
            @Override
            public NamespacedKey getKey() {
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "raw_wood");
            }
        };
    
        SAPLING = new Tag() {

            @Override
            public boolean isTagged(@NotNull Keyed item) {
                return item.equals(Material.ACACIA_SAPLING) || item.equals(Material.BAMBOO_SAPLING) || item.equals(Material.BIRCH_SAPLING) || item.equals(Material.CHERRY_SAPLING) || item.equals(Material.DARK_OAK_SAPLING) || item.equals(Material.JUNGLE_SAPLING) || item.equals(Material.OAK_SAPLING) || item.equals(Material.POTTED_ACACIA_SAPLING) || item.equals(Material.POTTED_BIRCH_SAPLING) || item.equals(Material.POTTED_CHERRY_SAPLING) || item.equals(Material.POTTED_DARK_OAK_SAPLING) || item.equals(Material.POTTED_JUNGLE_SAPLING) || item.equals(Material.POTTED_OAK_SAPLING) || item.equals(Material.POTTED_SPRUCE_SAPLING) || item.equals(Material.SPRUCE_SAPLING);
            }

            @NotNull
            @Override
            public Set<Material> getValues() {
                return Sets.newHashSet(Material.ACACIA_SAPLING, Material.BAMBOO_SAPLING, Material.BIRCH_SAPLING, Material.CHERRY_SAPLING, Material.DARK_OAK_SAPLING, Material.JUNGLE_SAPLING, Material.OAK_SAPLING, Material.POTTED_ACACIA_SAPLING, Material.POTTED_BIRCH_SAPLING, Material.POTTED_CHERRY_SAPLING, Material.POTTED_DARK_OAK_SAPLING, Material.POTTED_JUNGLE_SAPLING, Material.POTTED_OAK_SAPLING, Material.POTTED_SPRUCE_SAPLING, Material.SPRUCE_SAPLING);
            }

            @NotNull
            @Override
            public NamespacedKey getKey() {
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "sapling");
            }
        };
    
        NONE = new Tag() {

            @Override
            public boolean isTagged(@NotNull Keyed item) {
                return item.equals(Material.AIR) || item.equals(Material.ATTACHED_MELON_STEM) || item.equals(Material.ATTACHED_PUMPKIN_STEM) || item.equals(Material.BARRIER) || item.equals(Material.BEDROCK) || item.equals(Material.CAVE_AIR) || item.equals(Material.DEBUG_STICK) || item.equals(Material.DIRT_PATH) || item.equals(Material.END_GATEWAY) || item.equals(Material.END_PORTAL) || item.equals(Material.END_PORTAL_FRAME) || item.equals(Material.FIRE) || item.equals(Material.FROGSPAWN) || item.equals(Material.LAVA) || item.equals(Material.LIGHT) || item.equals(Material.NETHER_PORTAL) || item.equals(Material.RABBIT) || item.equals(Material.SOUL_FIRE) || item.equals(Material.VOID_AIR) || item.equals(Material.WATER);
            }

            @NotNull
            @Override
            public Set<Material> getValues() {
                return Sets.newHashSet(Material.AIR, Material.ATTACHED_MELON_STEM, Material.ATTACHED_PUMPKIN_STEM, Material.BARRIER, Material.BEDROCK, Material.CAVE_AIR, Material.DEBUG_STICK, Material.DIRT_PATH, Material.END_GATEWAY, Material.END_PORTAL, Material.END_PORTAL_FRAME, Material.FIRE, Material.FROGSPAWN, Material.LAVA, Material.LIGHT, Material.NETHER_PORTAL, Material.RABBIT, Material.SOUL_FIRE, Material.VOID_AIR, Material.WATER);
            }

            @NotNull
            @Override
            public NamespacedKey getKey() {
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "none");
            }
        };
    
        SPAWN_EGG = new Tag() {

            @Override
            public boolean isTagged(@NotNull Keyed item) {
                return item.equals(Material.ALLAY_SPAWN_EGG) || item.equals(Material.AXOLOTL_SPAWN_EGG) || item.equals(Material.BAT_SPAWN_EGG) || item.equals(Material.BEE_SPAWN_EGG) || item.equals(Material.BLAZE_SPAWN_EGG) || item.equals(Material.BOGGED_SPAWN_EGG) || item.equals(Material.BREEZE_SPAWN_EGG) || item.equals(Material.CAMEL_SPAWN_EGG) || item.equals(Material.CAT_SPAWN_EGG) || item.equals(Material.CAVE_SPIDER_SPAWN_EGG) || item.equals(Material.CHICKEN_SPAWN_EGG) || item.equals(Material.COD_SPAWN_EGG) || item.equals(Material.COW_SPAWN_EGG) || item.equals(Material.CREEPER_SPAWN_EGG) || item.equals(Material.DOLPHIN_SPAWN_EGG) || item.equals(Material.DONKEY_SPAWN_EGG) || item.equals(Material.DRAGON_EGG) || item.equals(Material.DROWNED_SPAWN_EGG) || item.equals(Material.ELDER_GUARDIAN_SPAWN_EGG) || item.equals(Material.ENDER_DRAGON_SPAWN_EGG) || item.equals(Material.ENDERMAN_SPAWN_EGG) || item.equals(Material.ENDERMITE_SPAWN_EGG) || item.equals(Material.EVOKER_SPAWN_EGG) || item.equals(Material.FOX_SPAWN_EGG) || item.equals(Material.FROG_SPAWN_EGG) || item.equals(Material.GHAST_SPAWN_EGG) || item.equals(Material.GLOW_SQUID_SPAWN_EGG) || item.equals(Material.GOAT_SPAWN_EGG) || item.equals(Material.GUARDIAN_SPAWN_EGG) || item.equals(Material.HOGLIN_SPAWN_EGG) || item.equals(Material.HORSE_SPAWN_EGG) || item.equals(Material.HUSK_SPAWN_EGG) || item.equals(Material.IRON_GOLEM_SPAWN_EGG) || item.equals(Material.LLAMA_SPAWN_EGG) || item.equals(Material.MAGMA_CUBE_SPAWN_EGG) || item.equals(Material.MOOSHROOM_SPAWN_EGG) || item.equals(Material.MULE_SPAWN_EGG) || item.equals(Material.OCELOT_SPAWN_EGG) || item.equals(Material.PANDA_SPAWN_EGG) || item.equals(Material.PARROT_SPAWN_EGG) || item.equals(Material.PHANTOM_SPAWN_EGG) || item.equals(Material.PIG_SPAWN_EGG) || item.equals(Material.PIGLIN_BRUTE_SPAWN_EGG) || item.equals(Material.PIGLIN_SPAWN_EGG) || item.equals(Material.PILLAGER_SPAWN_EGG) || item.equals(Material.POLAR_BEAR_SPAWN_EGG) || item.equals(Material.PUFFERFISH_SPAWN_EGG) || item.equals(Material.RABBIT_SPAWN_EGG) || item.equals(Material.RAVAGER_SPAWN_EGG) || item.equals(Material.SALMON_SPAWN_EGG) || item.equals(Material.SHEEP_SPAWN_EGG) || item.equals(Material.SHULKER_SPAWN_EGG) || item.equals(Material.SILVERFISH_SPAWN_EGG) || item.equals(Material.SKELETON_HORSE_SPAWN_EGG) || item.equals(Material.SKELETON_SPAWN_EGG) || item.equals(Material.SLIME_SPAWN_EGG) || item.equals(Material.SNIFFER_EGG) || item.equals(Material.SNIFFER_SPAWN_EGG) || item.equals(Material.SNOW_GOLEM_SPAWN_EGG) || item.equals(Material.SPIDER_SPAWN_EGG) || item.equals(Material.SQUID_SPAWN_EGG) || item.equals(Material.STRAY_SPAWN_EGG) || item.equals(Material.STRIDER_SPAWN_EGG) || item.equals(Material.TADPOLE_SPAWN_EGG) || item.equals(Material.TRADER_LLAMA_SPAWN_EGG) || item.equals(Material.TROPICAL_FISH_SPAWN_EGG) || item.equals(Material.TURTLE_EGG) || item.equals(Material.TURTLE_SPAWN_EGG) || item.equals(Material.VEX_SPAWN_EGG) || item.equals(Material.VILLAGER_SPAWN_EGG) || item.equals(Material.VINDICATOR_SPAWN_EGG) || item.equals(Material.WANDERING_TRADER_SPAWN_EGG) || item.equals(Material.WARDEN_SPAWN_EGG) || item.equals(Material.WITCH_SPAWN_EGG) || item.equals(Material.WITHER_SKELETON_SPAWN_EGG) || item.equals(Material.WITHER_SPAWN_EGG) || item.equals(Material.WOLF_SPAWN_EGG) || item.equals(Material.ZOGLIN_SPAWN_EGG) || item.equals(Material.ZOMBIE_HORSE_SPAWN_EGG) || item.equals(Material.ZOMBIE_SPAWN_EGG) || item.equals(Material.ZOMBIE_VILLAGER_SPAWN_EGG) || item.equals(Material.ZOMBIFIED_PIGLIN_SPAWN_EGG);
            }

            @NotNull
            @Override
            public Set<Material> getValues() {
                return Sets.newHashSet(Material.ALLAY_SPAWN_EGG, Material.AXOLOTL_SPAWN_EGG, Material.BAT_SPAWN_EGG, Material.BEE_SPAWN_EGG, Material.BLAZE_SPAWN_EGG, Material.BOGGED_SPAWN_EGG, Material.BREEZE_SPAWN_EGG, Material.CAMEL_SPAWN_EGG, Material.CAT_SPAWN_EGG, Material.CAVE_SPIDER_SPAWN_EGG, Material.CHICKEN_SPAWN_EGG, Material.COD_SPAWN_EGG, Material.COW_SPAWN_EGG, Material.CREEPER_SPAWN_EGG, Material.DOLPHIN_SPAWN_EGG, Material.DONKEY_SPAWN_EGG, Material.DRAGON_EGG, Material.DROWNED_SPAWN_EGG, Material.ELDER_GUARDIAN_SPAWN_EGG, Material.ENDER_DRAGON_SPAWN_EGG, Material.ENDERMAN_SPAWN_EGG, Material.ENDERMITE_SPAWN_EGG, Material.EVOKER_SPAWN_EGG, Material.FOX_SPAWN_EGG, Material.FROG_SPAWN_EGG, Material.GHAST_SPAWN_EGG, Material.GLOW_SQUID_SPAWN_EGG, Material.GOAT_SPAWN_EGG, Material.GUARDIAN_SPAWN_EGG, Material.HOGLIN_SPAWN_EGG, Material.HORSE_SPAWN_EGG, Material.HUSK_SPAWN_EGG, Material.IRON_GOLEM_SPAWN_EGG, Material.LLAMA_SPAWN_EGG, Material.MAGMA_CUBE_SPAWN_EGG, Material.MOOSHROOM_SPAWN_EGG, Material.MULE_SPAWN_EGG, Material.OCELOT_SPAWN_EGG, Material.PANDA_SPAWN_EGG, Material.PARROT_SPAWN_EGG, Material.PHANTOM_SPAWN_EGG, Material.PIG_SPAWN_EGG, Material.PIGLIN_BRUTE_SPAWN_EGG, Material.PIGLIN_SPAWN_EGG, Material.PILLAGER_SPAWN_EGG, Material.POLAR_BEAR_SPAWN_EGG, Material.PUFFERFISH_SPAWN_EGG, Material.RABBIT_SPAWN_EGG, Material.RAVAGER_SPAWN_EGG, Material.SALMON_SPAWN_EGG, Material.SHEEP_SPAWN_EGG, Material.SHULKER_SPAWN_EGG, Material.SILVERFISH_SPAWN_EGG, Material.SKELETON_HORSE_SPAWN_EGG, Material.SKELETON_SPAWN_EGG, Material.SLIME_SPAWN_EGG, Material.SNIFFER_EGG, Material.SNIFFER_SPAWN_EGG, Material.SNOW_GOLEM_SPAWN_EGG, Material.SPIDER_SPAWN_EGG, Material.SQUID_SPAWN_EGG, Material.STRAY_SPAWN_EGG, Material.STRIDER_SPAWN_EGG, Material.TADPOLE_SPAWN_EGG, Material.TRADER_LLAMA_SPAWN_EGG, Material.TROPICAL_FISH_SPAWN_EGG, Material.TURTLE_EGG, Material.TURTLE_SPAWN_EGG, Material.VEX_SPAWN_EGG, Material.VILLAGER_SPAWN_EGG, Material.VINDICATOR_SPAWN_EGG, Material.WANDERING_TRADER_SPAWN_EGG, Material.WARDEN_SPAWN_EGG, Material.WITCH_SPAWN_EGG, Material.WITHER_SKELETON_SPAWN_EGG, Material.WITHER_SPAWN_EGG, Material.WOLF_SPAWN_EGG, Material.ZOGLIN_SPAWN_EGG, Material.ZOMBIE_HORSE_SPAWN_EGG, Material.ZOMBIE_SPAWN_EGG, Material.ZOMBIE_VILLAGER_SPAWN_EGG, Material.ZOMBIFIED_PIGLIN_SPAWN_EGG);
            }

            @NotNull
            @Override
            public NamespacedKey getKey() {
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "spawn_egg");
            }
        };
    
        GEM = new Tag() {

            @Override
            public boolean isTagged(@NotNull Keyed item) {
                return item.equals(Material.AMETHYST_BLOCK) || item.equals(Material.AMETHYST_CLUSTER) || item.equals(Material.AMETHYST_SHARD);
            }

            @NotNull
            @Override
            public Set<Material> getValues() {
                return Sets.newHashSet(Material.AMETHYST_BLOCK, Material.AMETHYST_CLUSTER, Material.AMETHYST_SHARD);
            }

            @NotNull
            @Override
            public NamespacedKey getKey() {
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "gem");
            }
        };
    
        ORE = new Tag() {

            @Override
            public boolean isTagged(@NotNull Keyed item) {
                return item.equals(Material.ANCIENT_DEBRIS) || item.equals(Material.COAL_ORE) || item.equals(Material.DEEPSLATE_COAL_ORE) || item.equals(Material.DEEPSLATE_COPPER_ORE) || item.equals(Material.DEEPSLATE_DIAMOND_ORE) || item.equals(Material.DEEPSLATE_EMERALD_ORE) || item.equals(Material.DEEPSLATE_GOLD_ORE) || item.equals(Material.DEEPSLATE_IRON_ORE) || item.equals(Material.DEEPSLATE_LAPIS_ORE) || item.equals(Material.DEEPSLATE_REDSTONE_ORE) || item.equals(Material.DIAMOND_ORE) || item.equals(Material.EMERALD_ORE) || item.equals(Material.GOLD_ORE) || item.equals(Material.IRON_ORE) || item.equals(Material.LAPIS_ORE) || item.equals(Material.NETHER_GOLD_ORE) || item.equals(Material.NETHER_QUARTZ_ORE) || item.equals(Material.RAW_COPPER) || item.equals(Material.RAW_COPPER_BLOCK) || item.equals(Material.RAW_GOLD) || item.equals(Material.RAW_GOLD_BLOCK) || item.equals(Material.RAW_IRON) || item.equals(Material.RAW_IRON_BLOCK);
            }

            @NotNull
            @Override
            public Set<Material> getValues() {
                return Sets.newHashSet(Material.ANCIENT_DEBRIS, Material.COAL_ORE, Material.DEEPSLATE_COAL_ORE, Material.DEEPSLATE_COPPER_ORE, Material.DEEPSLATE_DIAMOND_ORE, Material.DEEPSLATE_EMERALD_ORE, Material.DEEPSLATE_GOLD_ORE, Material.DEEPSLATE_IRON_ORE, Material.DEEPSLATE_LAPIS_ORE, Material.DEEPSLATE_REDSTONE_ORE, Material.DIAMOND_ORE, Material.EMERALD_ORE, Material.GOLD_ORE, Material.IRON_ORE, Material.LAPIS_ORE, Material.NETHER_GOLD_ORE, Material.NETHER_QUARTZ_ORE, Material.RAW_COPPER, Material.RAW_COPPER_BLOCK, Material.RAW_GOLD, Material.RAW_GOLD_BLOCK, Material.RAW_IRON, Material.RAW_IRON_BLOCK);
            }

            @NotNull
            @Override
            public NamespacedKey getKey() {
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "ore");
            }
        };
    
        DECORATIVE_BLOCK = new Tag() {

            @Override
            public boolean isTagged(@NotNull Keyed item) {
                return item.equals(Material.ANDESITE) || item.equals(Material.ANDESITE_SLAB) || item.equals(Material.ANDESITE_STAIRS) || item.equals(Material.ANDESITE_WALL) || item.equals(Material.BASALT) || item.equals(Material.BLACK_CONCRETE) || item.equals(Material.BLACK_GLAZED_TERRACOTTA) || item.equals(Material.BLACK_TERRACOTTA) || item.equals(Material.BLACKSTONE) || item.equals(Material.BLACKSTONE_SLAB) || item.equals(Material.BLACKSTONE_STAIRS) || item.equals(Material.BLACKSTONE_WALL) || item.equals(Material.BLUE_CONCRETE) || item.equals(Material.BLUE_GLAZED_TERRACOTTA) || item.equals(Material.BLUE_TERRACOTTA) || item.equals(Material.BRICK) || item.equals(Material.BRICK_SLAB) || item.equals(Material.BRICK_STAIRS) || item.equals(Material.BRICK_WALL) || item.equals(Material.BRICKS) || item.equals(Material.BROWN_CONCRETE) || item.equals(Material.BROWN_GLAZED_TERRACOTTA) || item.equals(Material.BROWN_TERRACOTTA) || item.equals(Material.CALCITE) || item.equals(Material.CHAIN) || item.equals(Material.COBBLED_DEEPSLATE_SLAB) || item.equals(Material.COBBLED_DEEPSLATE_STAIRS) || item.equals(Material.COBBLED_DEEPSLATE_WALL) || item.equals(Material.COBBLESTONE_SLAB) || item.equals(Material.COBBLESTONE_STAIRS) || item.equals(Material.COBBLESTONE_WALL) || item.equals(Material.CRACKED_DEEPSLATE_BRICKS) || item.equals(Material.CRACKED_DEEPSLATE_TILES) || item.equals(Material.CRACKED_NETHER_BRICKS) || item.equals(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS) || item.equals(Material.CRACKED_STONE_BRICKS) || item.equals(Material.CRYING_OBSIDIAN) || item.equals(Material.CUT_COPPER) || item.equals(Material.CUT_COPPER_SLAB) || item.equals(Material.CUT_COPPER_STAIRS) || item.equals(Material.CUT_RED_SANDSTONE) || item.equals(Material.CUT_RED_SANDSTONE_SLAB) || item.equals(Material.CUT_SANDSTONE) || item.equals(Material.CUT_SANDSTONE_SLAB) || item.equals(Material.CYAN_CONCRETE) || item.equals(Material.CYAN_GLAZED_TERRACOTTA) || item.equals(Material.CYAN_TERRACOTTA) || item.equals(Material.DARK_PRISMARINE) || item.equals(Material.DARK_PRISMARINE_SLAB) || item.equals(Material.DARK_PRISMARINE_STAIRS) || item.equals(Material.DEEPSLATE) || item.equals(Material.DEEPSLATE_BRICK_SLAB) || item.equals(Material.DEEPSLATE_BRICK_STAIRS) || item.equals(Material.DEEPSLATE_BRICK_WALL) || item.equals(Material.DEEPSLATE_BRICKS) || item.equals(Material.DEEPSLATE_TILE_SLAB) || item.equals(Material.DEEPSLATE_TILE_STAIRS) || item.equals(Material.DEEPSLATE_TILE_WALL) || item.equals(Material.DEEPSLATE_TILES) || item.equals(Material.DIORITE) || item.equals(Material.DIORITE_SLAB) || item.equals(Material.DIORITE_STAIRS) || item.equals(Material.DIORITE_WALL) || item.equals(Material.DRIPSTONE_BLOCK) || item.equals(Material.END_CRYSTAL) || item.equals(Material.END_STONE) || item.equals(Material.END_STONE_BRICK_SLAB) || item.equals(Material.END_STONE_BRICK_STAIRS) || item.equals(Material.END_STONE_BRICK_WALL) || item.equals(Material.END_STONE_BRICKS) || item.equals(Material.EXPOSED_CHISELED_COPPER) || item.equals(Material.EXPOSED_COPPER) || item.equals(Material.EXPOSED_COPPER_BULB) || item.equals(Material.EXPOSED_COPPER_DOOR) || item.equals(Material.EXPOSED_COPPER_GRATE) || item.equals(Material.EXPOSED_COPPER_TRAPDOOR) || item.equals(Material.EXPOSED_CUT_COPPER) || item.equals(Material.EXPOSED_CUT_COPPER_SLAB) || item.equals(Material.EXPOSED_CUT_COPPER_STAIRS) || item.equals(Material.GILDED_BLACKSTONE) || item.equals(Material.GRANITE) || item.equals(Material.GRANITE_SLAB) || item.equals(Material.GRANITE_STAIRS) || item.equals(Material.GRANITE_WALL) || item.equals(Material.GRAVEL) || item.equals(Material.GRAY_CONCRETE) || item.equals(Material.GRAY_GLAZED_TERRACOTTA) || item.equals(Material.GRAY_TERRACOTTA) || item.equals(Material.GREEN_CONCRETE) || item.equals(Material.GREEN_GLAZED_TERRACOTTA) || item.equals(Material.GREEN_TERRACOTTA) || item.equals(Material.HONEY_BLOCK) || item.equals(Material.HONEYCOMB_BLOCK) || item.equals(Material.INFESTED_CHISELED_STONE_BRICKS) || item.equals(Material.INFESTED_COBBLESTONE) || item.equals(Material.INFESTED_CRACKED_STONE_BRICKS) || item.equals(Material.INFESTED_DEEPSLATE) || item.equals(Material.INFESTED_MOSSY_STONE_BRICKS) || item.equals(Material.INFESTED_STONE) || item.equals(Material.INFESTED_STONE_BRICKS) || item.equals(Material.IRON_BARS) || item.equals(Material.LARGE_AMETHYST_BUD) || item.equals(Material.LIGHT_BLUE_CONCRETE) || item.equals(Material.LIGHT_BLUE_GLAZED_TERRACOTTA) || item.equals(Material.LIGHT_BLUE_TERRACOTTA) || item.equals(Material.LIGHT_GRAY_CONCRETE) || item.equals(Material.LIGHT_GRAY_GLAZED_TERRACOTTA) || item.equals(Material.LIGHT_GRAY_TERRACOTTA) || item.equals(Material.LIME_CONCRETE) || item.equals(Material.LIME_GLAZED_TERRACOTTA) || item.equals(Material.LIME_TERRACOTTA) || item.equals(Material.LODESTONE) || item.equals(Material.MAGENTA_CONCRETE) || item.equals(Material.MAGENTA_GLAZED_TERRACOTTA) || item.equals(Material.MAGENTA_TERRACOTTA) || item.equals(Material.MEDIUM_AMETHYST_BUD) || item.equals(Material.MOSSY_COBBLESTONE) || item.equals(Material.MOSSY_COBBLESTONE_SLAB) || item.equals(Material.MOSSY_COBBLESTONE_STAIRS) || item.equals(Material.MOSSY_COBBLESTONE_WALL) || item.equals(Material.MOSSY_STONE_BRICK_SLAB) || item.equals(Material.MOSSY_STONE_BRICK_STAIRS) || item.equals(Material.MOSSY_STONE_BRICK_WALL) || item.equals(Material.MOSSY_STONE_BRICKS) || item.equals(Material.MUD) || item.equals(Material.MUD_BRICK_SLAB) || item.equals(Material.MUD_BRICK_STAIRS) || item.equals(Material.MUD_BRICK_WALL) || item.equals(Material.MUD_BRICKS) || item.equals(Material.NETHER_BRICK) || item.equals(Material.NETHER_BRICK_FENCE) || item.equals(Material.NETHER_BRICK_SLAB) || item.equals(Material.NETHER_BRICK_STAIRS) || item.equals(Material.NETHER_BRICK_WALL) || item.equals(Material.NETHER_BRICKS) || item.equals(Material.NETHERITE_BLOCK) || item.equals(Material.NETHERRACK) || item.equals(Material.OBSIDIAN) || item.equals(Material.OCHRE_FROGLIGHT) || item.equals(Material.ORANGE_CONCRETE) || item.equals(Material.ORANGE_GLAZED_TERRACOTTA) || item.equals(Material.ORANGE_TERRACOTTA) || item.equals(Material.OXIDIZED_CHISELED_COPPER) || item.equals(Material.OXIDIZED_COPPER) || item.equals(Material.OXIDIZED_COPPER_BULB) || item.equals(Material.OXIDIZED_COPPER_DOOR) || item.equals(Material.OXIDIZED_COPPER_GRATE) || item.equals(Material.OXIDIZED_COPPER_TRAPDOOR) || item.equals(Material.OXIDIZED_CUT_COPPER) || item.equals(Material.OXIDIZED_CUT_COPPER_SLAB) || item.equals(Material.OXIDIZED_CUT_COPPER_STAIRS) || item.equals(Material.PACKED_MUD) || item.equals(Material.PEARLESCENT_FROGLIGHT) || item.equals(Material.PETRIFIED_OAK_SLAB) || item.equals(Material.PINK_CONCRETE) || item.equals(Material.PINK_GLAZED_TERRACOTTA) || item.equals(Material.PINK_TERRACOTTA) || item.equals(Material.POINTED_DRIPSTONE) || item.equals(Material.POLISHED_ANDESITE) || item.equals(Material.POLISHED_ANDESITE_SLAB) || item.equals(Material.POLISHED_ANDESITE_STAIRS) || item.equals(Material.POLISHED_BASALT) || item.equals(Material.POLISHED_BLACKSTONE) || item.equals(Material.POLISHED_BLACKSTONE_BRICK_SLAB) || item.equals(Material.POLISHED_BLACKSTONE_BRICK_STAIRS) || item.equals(Material.POLISHED_BLACKSTONE_BRICK_WALL) || item.equals(Material.POLISHED_BLACKSTONE_BRICKS) || item.equals(Material.POLISHED_BLACKSTONE_SLAB) || item.equals(Material.POLISHED_BLACKSTONE_STAIRS) || item.equals(Material.POLISHED_BLACKSTONE_WALL) || item.equals(Material.POLISHED_DEEPSLATE) || item.equals(Material.POLISHED_DEEPSLATE_SLAB) || item.equals(Material.POLISHED_DEEPSLATE_STAIRS) || item.equals(Material.POLISHED_DEEPSLATE_WALL) || item.equals(Material.POLISHED_DIORITE) || item.equals(Material.POLISHED_DIORITE_SLAB) || item.equals(Material.POLISHED_DIORITE_STAIRS) || item.equals(Material.POLISHED_GRANITE) || item.equals(Material.POLISHED_GRANITE_SLAB) || item.equals(Material.POLISHED_GRANITE_STAIRS) || item.equals(Material.POLISHED_TUFF) || item.equals(Material.POLISHED_TUFF_SLAB) || item.equals(Material.POLISHED_TUFF_STAIRS) || item.equals(Material.POLISHED_TUFF_WALL) || item.equals(Material.POWDER_SNOW) || item.equals(Material.PRISMARINE) || item.equals(Material.PRISMARINE_BRICK_SLAB) || item.equals(Material.PRISMARINE_BRICK_STAIRS) || item.equals(Material.PRISMARINE_BRICKS) || item.equals(Material.PRISMARINE_CRYSTALS) || item.equals(Material.PRISMARINE_SHARD) || item.equals(Material.PRISMARINE_SLAB) || item.equals(Material.PRISMARINE_STAIRS) || item.equals(Material.PRISMARINE_WALL) || item.equals(Material.PURPLE_CONCRETE) || item.equals(Material.PURPLE_GLAZED_TERRACOTTA) || item.equals(Material.PURPLE_TERRACOTTA) || item.equals(Material.PURPUR_BLOCK) || item.equals(Material.PURPUR_PILLAR) || item.equals(Material.PURPUR_SLAB) || item.equals(Material.PURPUR_STAIRS) || item.equals(Material.QUARTZ_BLOCK) || item.equals(Material.QUARTZ_BRICKS) || item.equals(Material.QUARTZ_PILLAR) || item.equals(Material.QUARTZ_SLAB) || item.equals(Material.QUARTZ_STAIRS) || item.equals(Material.RED_CONCRETE) || item.equals(Material.RED_GLAZED_TERRACOTTA) || item.equals(Material.RED_NETHER_BRICK_SLAB) || item.equals(Material.RED_NETHER_BRICK_STAIRS) || item.equals(Material.RED_NETHER_BRICK_WALL) || item.equals(Material.RED_NETHER_BRICKS) || item.equals(Material.RED_SAND) || item.equals(Material.RED_SANDSTONE) || item.equals(Material.RED_SANDSTONE_SLAB) || item.equals(Material.RED_SANDSTONE_STAIRS) || item.equals(Material.RED_SANDSTONE_WALL) || item.equals(Material.RED_TERRACOTTA) || item.equals(Material.REINFORCED_DEEPSLATE) || item.equals(Material.SANDSTONE) || item.equals(Material.SANDSTONE_SLAB) || item.equals(Material.SANDSTONE_STAIRS) || item.equals(Material.SANDSTONE_WALL) || item.equals(Material.SCAFFOLDING) || item.equals(Material.SLIME_BLOCK) || item.equals(Material.SMALL_AMETHYST_BUD) || item.equals(Material.SMOOTH_BASALT) || item.equals(Material.SMOOTH_QUARTZ) || item.equals(Material.SMOOTH_QUARTZ_SLAB) || item.equals(Material.SMOOTH_QUARTZ_STAIRS) || item.equals(Material.SMOOTH_RED_SANDSTONE) || item.equals(Material.SMOOTH_RED_SANDSTONE_SLAB) || item.equals(Material.SMOOTH_RED_SANDSTONE_STAIRS) || item.equals(Material.SMOOTH_SANDSTONE) || item.equals(Material.SMOOTH_SANDSTONE_SLAB) || item.equals(Material.SMOOTH_SANDSTONE_STAIRS) || item.equals(Material.SMOOTH_STONE) || item.equals(Material.SMOOTH_STONE_SLAB) || item.equals(Material.SNOW) || item.equals(Material.SNOW_BLOCK) || item.equals(Material.SOUL_SAND) || item.equals(Material.SOUL_SOIL) || item.equals(Material.STONE) || item.equals(Material.STONE_BRICK_SLAB) || item.equals(Material.STONE_BRICK_STAIRS) || item.equals(Material.STONE_BRICK_WALL) || item.equals(Material.STONE_BRICKS) || item.equals(Material.STONE_SLAB) || item.equals(Material.STONE_STAIRS) || item.equals(Material.SUSPICIOUS_GRAVEL) || item.equals(Material.SUSPICIOUS_SAND) || item.equals(Material.TERRACOTTA) || item.equals(Material.TUFF) || item.equals(Material.TUFF_BRICK_SLAB) || item.equals(Material.TUFF_BRICK_STAIRS) || item.equals(Material.TUFF_BRICK_WALL) || item.equals(Material.TUFF_BRICKS) || item.equals(Material.TUFF_SLAB) || item.equals(Material.TUFF_STAIRS) || item.equals(Material.TUFF_WALL) || item.equals(Material.VERDANT_FROGLIGHT) || item.equals(Material.WARPED_DOOR) || item.equals(Material.WARPED_FENCE) || item.equals(Material.WARPED_FENCE_GATE) || item.equals(Material.WARPED_HANGING_SIGN) || item.equals(Material.WARPED_HYPHAE) || item.equals(Material.WARPED_NYLIUM) || item.equals(Material.WARPED_PLANKS) || item.equals(Material.WARPED_SIGN) || item.equals(Material.WARPED_SLAB) || item.equals(Material.WARPED_STAIRS) || item.equals(Material.WARPED_STEM) || item.equals(Material.WARPED_TRAPDOOR) || item.equals(Material.WARPED_WALL_HANGING_SIGN) || item.equals(Material.WARPED_WALL_SIGN) || item.equals(Material.WARPED_WART_BLOCK) || item.equals(Material.WAXED_CHISELED_COPPER) || item.equals(Material.WAXED_COPPER_BLOCK) || item.equals(Material.WAXED_COPPER_BULB) || item.equals(Material.WAXED_COPPER_DOOR) || item.equals(Material.WAXED_COPPER_GRATE) || item.equals(Material.WAXED_COPPER_TRAPDOOR) || item.equals(Material.WAXED_CUT_COPPER) || item.equals(Material.WAXED_CUT_COPPER_SLAB) || item.equals(Material.WAXED_CUT_COPPER_STAIRS) || item.equals(Material.WAXED_EXPOSED_CHISELED_COPPER) || item.equals(Material.WAXED_EXPOSED_COPPER) || item.equals(Material.WAXED_EXPOSED_COPPER_BULB) || item.equals(Material.WAXED_EXPOSED_COPPER_DOOR) || item.equals(Material.WAXED_EXPOSED_COPPER_GRATE) || item.equals(Material.WAXED_EXPOSED_COPPER_TRAPDOOR) || item.equals(Material.WAXED_EXPOSED_CUT_COPPER) || item.equals(Material.WAXED_EXPOSED_CUT_COPPER_SLAB) || item.equals(Material.WAXED_EXPOSED_CUT_COPPER_STAIRS) || item.equals(Material.WAXED_OXIDIZED_CHISELED_COPPER) || item.equals(Material.WAXED_OXIDIZED_COPPER) || item.equals(Material.WAXED_OXIDIZED_COPPER_BULB) || item.equals(Material.WAXED_OXIDIZED_COPPER_DOOR) || item.equals(Material.WAXED_OXIDIZED_COPPER_GRATE) || item.equals(Material.WAXED_OXIDIZED_COPPER_TRAPDOOR) || item.equals(Material.WAXED_OXIDIZED_CUT_COPPER) || item.equals(Material.WAXED_OXIDIZED_CUT_COPPER_SLAB) || item.equals(Material.WAXED_OXIDIZED_CUT_COPPER_STAIRS) || item.equals(Material.WAXED_WEATHERED_CHISELED_COPPER) || item.equals(Material.WAXED_WEATHERED_COPPER) || item.equals(Material.WAXED_WEATHERED_COPPER_BULB) || item.equals(Material.WAXED_WEATHERED_COPPER_DOOR) || item.equals(Material.WAXED_WEATHERED_COPPER_GRATE) || item.equals(Material.WAXED_WEATHERED_COPPER_TRAPDOOR) || item.equals(Material.WAXED_WEATHERED_CUT_COPPER) || item.equals(Material.WAXED_WEATHERED_CUT_COPPER_SLAB) || item.equals(Material.WAXED_WEATHERED_CUT_COPPER_STAIRS) || item.equals(Material.WEATHERED_CHISELED_COPPER) || item.equals(Material.WEATHERED_COPPER) || item.equals(Material.WEATHERED_COPPER_BULB) || item.equals(Material.WEATHERED_COPPER_DOOR) || item.equals(Material.WEATHERED_COPPER_GRATE) || item.equals(Material.WEATHERED_COPPER_TRAPDOOR) || item.equals(Material.WEATHERED_CUT_COPPER) || item.equals(Material.WEATHERED_CUT_COPPER_SLAB) || item.equals(Material.WEATHERED_CUT_COPPER_STAIRS) || item.equals(Material.WET_SPONGE) || item.equals(Material.WHITE_CONCRETE) || item.equals(Material.WHITE_GLAZED_TERRACOTTA) || item.equals(Material.WHITE_TERRACOTTA) || item.equals(Material.YELLOW_CONCRETE) || item.equals(Material.YELLOW_GLAZED_TERRACOTTA) || item.equals(Material.YELLOW_TERRACOTTA);
            }

            @NotNull
            @Override
            public Set<Material> getValues() {
                return Sets.newHashSet(Material.ANDESITE, Material.ANDESITE_SLAB, Material.ANDESITE_STAIRS, Material.ANDESITE_WALL, Material.BASALT, Material.BLACK_CONCRETE, Material.BLACK_GLAZED_TERRACOTTA, Material.BLACK_TERRACOTTA, Material.BLACKSTONE, Material.BLACKSTONE_SLAB, Material.BLACKSTONE_STAIRS, Material.BLACKSTONE_WALL, Material.BLUE_CONCRETE, Material.BLUE_GLAZED_TERRACOTTA, Material.BLUE_TERRACOTTA, Material.BRICK, Material.BRICK_SLAB, Material.BRICK_STAIRS, Material.BRICK_WALL, Material.BRICKS, Material.BROWN_CONCRETE, Material.BROWN_GLAZED_TERRACOTTA, Material.BROWN_TERRACOTTA, Material.CALCITE, Material.CHAIN, Material.COBBLED_DEEPSLATE_SLAB, Material.COBBLED_DEEPSLATE_STAIRS, Material.COBBLED_DEEPSLATE_WALL, Material.COBBLESTONE_SLAB, Material.COBBLESTONE_STAIRS, Material.COBBLESTONE_WALL, Material.CRACKED_DEEPSLATE_BRICKS, Material.CRACKED_DEEPSLATE_TILES, Material.CRACKED_NETHER_BRICKS, Material.CRACKED_POLISHED_BLACKSTONE_BRICKS, Material.CRACKED_STONE_BRICKS, Material.CRYING_OBSIDIAN, Material.CUT_COPPER, Material.CUT_COPPER_SLAB, Material.CUT_COPPER_STAIRS, Material.CUT_RED_SANDSTONE, Material.CUT_RED_SANDSTONE_SLAB, Material.CUT_SANDSTONE, Material.CUT_SANDSTONE_SLAB, Material.CYAN_CONCRETE, Material.CYAN_GLAZED_TERRACOTTA, Material.CYAN_TERRACOTTA, Material.DARK_PRISMARINE, Material.DARK_PRISMARINE_SLAB, Material.DARK_PRISMARINE_STAIRS, Material.DEEPSLATE, Material.DEEPSLATE_BRICK_SLAB, Material.DEEPSLATE_BRICK_STAIRS, Material.DEEPSLATE_BRICK_WALL, Material.DEEPSLATE_BRICKS, Material.DEEPSLATE_TILE_SLAB, Material.DEEPSLATE_TILE_STAIRS, Material.DEEPSLATE_TILE_WALL, Material.DEEPSLATE_TILES, Material.DIORITE, Material.DIORITE_SLAB, Material.DIORITE_STAIRS, Material.DIORITE_WALL, Material.DRIPSTONE_BLOCK, Material.END_CRYSTAL, Material.END_STONE, Material.END_STONE_BRICK_SLAB, Material.END_STONE_BRICK_STAIRS, Material.END_STONE_BRICK_WALL, Material.END_STONE_BRICKS, Material.EXPOSED_CHISELED_COPPER, Material.EXPOSED_COPPER, Material.EXPOSED_COPPER_BULB, Material.EXPOSED_COPPER_DOOR, Material.EXPOSED_COPPER_GRATE, Material.EXPOSED_COPPER_TRAPDOOR, Material.EXPOSED_CUT_COPPER, Material.EXPOSED_CUT_COPPER_SLAB, Material.EXPOSED_CUT_COPPER_STAIRS, Material.GILDED_BLACKSTONE, Material.GRANITE, Material.GRANITE_SLAB, Material.GRANITE_STAIRS, Material.GRANITE_WALL, Material.GRAVEL, Material.GRAY_CONCRETE, Material.GRAY_GLAZED_TERRACOTTA, Material.GRAY_TERRACOTTA, Material.GREEN_CONCRETE, Material.GREEN_GLAZED_TERRACOTTA, Material.GREEN_TERRACOTTA, Material.HONEY_BLOCK, Material.HONEYCOMB_BLOCK, Material.INFESTED_CHISELED_STONE_BRICKS, Material.INFESTED_COBBLESTONE, Material.INFESTED_CRACKED_STONE_BRICKS, Material.INFESTED_DEEPSLATE, Material.INFESTED_MOSSY_STONE_BRICKS, Material.INFESTED_STONE, Material.INFESTED_STONE_BRICKS, Material.IRON_BARS, Material.LARGE_AMETHYST_BUD, Material.LIGHT_BLUE_CONCRETE, Material.LIGHT_BLUE_GLAZED_TERRACOTTA, Material.LIGHT_BLUE_TERRACOTTA, Material.LIGHT_GRAY_CONCRETE, Material.LIGHT_GRAY_GLAZED_TERRACOTTA, Material.LIGHT_GRAY_TERRACOTTA, Material.LIME_CONCRETE, Material.LIME_GLAZED_TERRACOTTA, Material.LIME_TERRACOTTA, Material.LODESTONE, Material.MAGENTA_CONCRETE, Material.MAGENTA_GLAZED_TERRACOTTA, Material.MAGENTA_TERRACOTTA, Material.MEDIUM_AMETHYST_BUD, Material.MOSSY_COBBLESTONE, Material.MOSSY_COBBLESTONE_SLAB, Material.MOSSY_COBBLESTONE_STAIRS, Material.MOSSY_COBBLESTONE_WALL, Material.MOSSY_STONE_BRICK_SLAB, Material.MOSSY_STONE_BRICK_STAIRS, Material.MOSSY_STONE_BRICK_WALL, Material.MOSSY_STONE_BRICKS, Material.MUD, Material.MUD_BRICK_SLAB, Material.MUD_BRICK_STAIRS, Material.MUD_BRICK_WALL, Material.MUD_BRICKS, Material.NETHER_BRICK, Material.NETHER_BRICK_FENCE, Material.NETHER_BRICK_SLAB, Material.NETHER_BRICK_STAIRS, Material.NETHER_BRICK_WALL, Material.NETHER_BRICKS, Material.NETHERITE_BLOCK, Material.NETHERRACK, Material.OBSIDIAN, Material.OCHRE_FROGLIGHT, Material.ORANGE_CONCRETE, Material.ORANGE_GLAZED_TERRACOTTA, Material.ORANGE_TERRACOTTA, Material.OXIDIZED_CHISELED_COPPER, Material.OXIDIZED_COPPER, Material.OXIDIZED_COPPER_BULB, Material.OXIDIZED_COPPER_DOOR, Material.OXIDIZED_COPPER_GRATE, Material.OXIDIZED_COPPER_TRAPDOOR, Material.OXIDIZED_CUT_COPPER, Material.OXIDIZED_CUT_COPPER_SLAB, Material.OXIDIZED_CUT_COPPER_STAIRS, Material.PACKED_MUD, Material.PEARLESCENT_FROGLIGHT, Material.PETRIFIED_OAK_SLAB, Material.PINK_CONCRETE, Material.PINK_GLAZED_TERRACOTTA, Material.PINK_TERRACOTTA, Material.POINTED_DRIPSTONE, Material.POLISHED_ANDESITE, Material.POLISHED_ANDESITE_SLAB, Material.POLISHED_ANDESITE_STAIRS, Material.POLISHED_BASALT, Material.POLISHED_BLACKSTONE, Material.POLISHED_BLACKSTONE_BRICK_SLAB, Material.POLISHED_BLACKSTONE_BRICK_STAIRS, Material.POLISHED_BLACKSTONE_BRICK_WALL, Material.POLISHED_BLACKSTONE_BRICKS, Material.POLISHED_BLACKSTONE_SLAB, Material.POLISHED_BLACKSTONE_STAIRS, Material.POLISHED_BLACKSTONE_WALL, Material.POLISHED_DEEPSLATE, Material.POLISHED_DEEPSLATE_SLAB, Material.POLISHED_DEEPSLATE_STAIRS, Material.POLISHED_DEEPSLATE_WALL, Material.POLISHED_DIORITE, Material.POLISHED_DIORITE_SLAB, Material.POLISHED_DIORITE_STAIRS, Material.POLISHED_GRANITE, Material.POLISHED_GRANITE_SLAB, Material.POLISHED_GRANITE_STAIRS, Material.POLISHED_TUFF, Material.POLISHED_TUFF_SLAB, Material.POLISHED_TUFF_STAIRS, Material.POLISHED_TUFF_WALL, Material.POWDER_SNOW, Material.PRISMARINE, Material.PRISMARINE_BRICK_SLAB, Material.PRISMARINE_BRICK_STAIRS, Material.PRISMARINE_BRICKS, Material.PRISMARINE_CRYSTALS, Material.PRISMARINE_SHARD, Material.PRISMARINE_SLAB, Material.PRISMARINE_STAIRS, Material.PRISMARINE_WALL, Material.PURPLE_CONCRETE, Material.PURPLE_GLAZED_TERRACOTTA, Material.PURPLE_TERRACOTTA, Material.PURPUR_BLOCK, Material.PURPUR_PILLAR, Material.PURPUR_SLAB, Material.PURPUR_STAIRS, Material.QUARTZ_BLOCK, Material.QUARTZ_BRICKS, Material.QUARTZ_PILLAR, Material.QUARTZ_SLAB, Material.QUARTZ_STAIRS, Material.RED_CONCRETE, Material.RED_GLAZED_TERRACOTTA, Material.RED_NETHER_BRICK_SLAB, Material.RED_NETHER_BRICK_STAIRS, Material.RED_NETHER_BRICK_WALL, Material.RED_NETHER_BRICKS, Material.RED_SAND, Material.RED_SANDSTONE, Material.RED_SANDSTONE_SLAB, Material.RED_SANDSTONE_STAIRS, Material.RED_SANDSTONE_WALL, Material.RED_TERRACOTTA, Material.REINFORCED_DEEPSLATE, Material.SANDSTONE, Material.SANDSTONE_SLAB, Material.SANDSTONE_STAIRS, Material.SANDSTONE_WALL, Material.SCAFFOLDING, Material.SLIME_BLOCK, Material.SMALL_AMETHYST_BUD, Material.SMOOTH_BASALT, Material.SMOOTH_QUARTZ, Material.SMOOTH_QUARTZ_SLAB, Material.SMOOTH_QUARTZ_STAIRS, Material.SMOOTH_RED_SANDSTONE, Material.SMOOTH_RED_SANDSTONE_SLAB, Material.SMOOTH_RED_SANDSTONE_STAIRS, Material.SMOOTH_SANDSTONE, Material.SMOOTH_SANDSTONE_SLAB, Material.SMOOTH_SANDSTONE_STAIRS, Material.SMOOTH_STONE, Material.SMOOTH_STONE_SLAB, Material.SNOW, Material.SNOW_BLOCK, Material.SOUL_SAND, Material.SOUL_SOIL, Material.STONE, Material.STONE_BRICK_SLAB, Material.STONE_BRICK_STAIRS, Material.STONE_BRICK_WALL, Material.STONE_BRICKS, Material.STONE_SLAB, Material.STONE_STAIRS, Material.SUSPICIOUS_GRAVEL, Material.SUSPICIOUS_SAND, Material.TERRACOTTA, Material.TUFF, Material.TUFF_BRICK_SLAB, Material.TUFF_BRICK_STAIRS, Material.TUFF_BRICK_WALL, Material.TUFF_BRICKS, Material.TUFF_SLAB, Material.TUFF_STAIRS, Material.TUFF_WALL, Material.VERDANT_FROGLIGHT, Material.WARPED_DOOR, Material.WARPED_FENCE, Material.WARPED_FENCE_GATE, Material.WARPED_HANGING_SIGN, Material.WARPED_HYPHAE, Material.WARPED_NYLIUM, Material.WARPED_PLANKS, Material.WARPED_SIGN, Material.WARPED_SLAB, Material.WARPED_STAIRS, Material.WARPED_STEM, Material.WARPED_TRAPDOOR, Material.WARPED_WALL_HANGING_SIGN, Material.WARPED_WALL_SIGN, Material.WARPED_WART_BLOCK, Material.WAXED_CHISELED_COPPER, Material.WAXED_COPPER_BLOCK, Material.WAXED_COPPER_BULB, Material.WAXED_COPPER_DOOR, Material.WAXED_COPPER_GRATE, Material.WAXED_COPPER_TRAPDOOR, Material.WAXED_CUT_COPPER, Material.WAXED_CUT_COPPER_SLAB, Material.WAXED_CUT_COPPER_STAIRS, Material.WAXED_EXPOSED_CHISELED_COPPER, Material.WAXED_EXPOSED_COPPER, Material.WAXED_EXPOSED_COPPER_BULB, Material.WAXED_EXPOSED_COPPER_DOOR, Material.WAXED_EXPOSED_COPPER_GRATE, Material.WAXED_EXPOSED_COPPER_TRAPDOOR, Material.WAXED_EXPOSED_CUT_COPPER, Material.WAXED_EXPOSED_CUT_COPPER_SLAB, Material.WAXED_EXPOSED_CUT_COPPER_STAIRS, Material.WAXED_OXIDIZED_CHISELED_COPPER, Material.WAXED_OXIDIZED_COPPER, Material.WAXED_OXIDIZED_COPPER_BULB, Material.WAXED_OXIDIZED_COPPER_DOOR, Material.WAXED_OXIDIZED_COPPER_GRATE, Material.WAXED_OXIDIZED_COPPER_TRAPDOOR, Material.WAXED_OXIDIZED_CUT_COPPER, Material.WAXED_OXIDIZED_CUT_COPPER_SLAB, Material.WAXED_OXIDIZED_CUT_COPPER_STAIRS, Material.WAXED_WEATHERED_CHISELED_COPPER, Material.WAXED_WEATHERED_COPPER, Material.WAXED_WEATHERED_COPPER_BULB, Material.WAXED_WEATHERED_COPPER_DOOR, Material.WAXED_WEATHERED_COPPER_GRATE, Material.WAXED_WEATHERED_COPPER_TRAPDOOR, Material.WAXED_WEATHERED_CUT_COPPER, Material.WAXED_WEATHERED_CUT_COPPER_SLAB, Material.WAXED_WEATHERED_CUT_COPPER_STAIRS, Material.WEATHERED_CHISELED_COPPER, Material.WEATHERED_COPPER, Material.WEATHERED_COPPER_BULB, Material.WEATHERED_COPPER_DOOR, Material.WEATHERED_COPPER_GRATE, Material.WEATHERED_COPPER_TRAPDOOR, Material.WEATHERED_CUT_COPPER, Material.WEATHERED_CUT_COPPER_SLAB, Material.WEATHERED_CUT_COPPER_STAIRS, Material.WET_SPONGE, Material.WHITE_CONCRETE, Material.WHITE_GLAZED_TERRACOTTA, Material.WHITE_TERRACOTTA, Material.YELLOW_CONCRETE, Material.YELLOW_GLAZED_TERRACOTTA, Material.YELLOW_TERRACOTTA);
            }

            @NotNull
            @Override
            public NamespacedKey getKey() {
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "decorative_block");
            }
        };
    
        DECORATION = new Tag() {

            @Override
            public boolean isTagged(@NotNull Keyed item) {
                return item.equals(Material.ANGLER_POTTERY_SHERD) || item.equals(Material.ARCHER_POTTERY_SHERD) || item.equals(Material.ARMS_UP_POTTERY_SHERD) || item.equals(Material.BLACK_BANNER) || item.equals(Material.BLACK_CANDLE) || item.equals(Material.BLACK_CONCRETE_POWDER) || item.equals(Material.BLACK_WALL_BANNER) || item.equals(Material.BLADE_POTTERY_SHERD) || item.equals(Material.BLUE_BANNER) || item.equals(Material.BLUE_CANDLE) || item.equals(Material.BLUE_CONCRETE_POWDER) || item.equals(Material.BLUE_WALL_BANNER) || item.equals(Material.BREWER_POTTERY_SHERD) || item.equals(Material.BROWN_BANNER) || item.equals(Material.BROWN_CANDLE) || item.equals(Material.BROWN_CONCRETE_POWDER) || item.equals(Material.BROWN_WALL_BANNER) || item.equals(Material.BUDDING_AMETHYST) || item.equals(Material.BURN_POTTERY_SHERD) || item.equals(Material.CANDLE) || item.equals(Material.CHISELED_BOOKSHELF) || item.equals(Material.CHISELED_COPPER) || item.equals(Material.CHISELED_DEEPSLATE) || item.equals(Material.CHISELED_NETHER_BRICKS) || item.equals(Material.CHISELED_POLISHED_BLACKSTONE) || item.equals(Material.CHISELED_QUARTZ_BLOCK) || item.equals(Material.CHISELED_RED_SANDSTONE) || item.equals(Material.CHISELED_SANDSTONE) || item.equals(Material.CHISELED_STONE_BRICKS) || item.equals(Material.CHISELED_TUFF) || item.equals(Material.CHISELED_TUFF_BRICKS) || item.equals(Material.CREEPER_BANNER_PATTERN) || item.equals(Material.CYAN_BANNER) || item.equals(Material.CYAN_CANDLE) || item.equals(Material.CYAN_CONCRETE_POWDER) || item.equals(Material.CYAN_WALL_BANNER) || item.equals(Material.DANGER_POTTERY_SHERD) || item.equals(Material.DECORATED_POT) || item.equals(Material.END_ROD) || item.equals(Material.EXPLORER_POTTERY_SHERD) || item.equals(Material.FLOW_BANNER_PATTERN) || item.equals(Material.FLOW_POTTERY_SHERD) || item.equals(Material.FLOWER_BANNER_PATTERN) || item.equals(Material.FLOWER_POT) || item.equals(Material.FRIEND_POTTERY_SHERD) || item.equals(Material.GLOBE_BANNER_PATTERN) || item.equals(Material.GRAY_BANNER) || item.equals(Material.GRAY_CANDLE) || item.equals(Material.GRAY_CONCRETE_POWDER) || item.equals(Material.GRAY_WALL_BANNER) || item.equals(Material.GREEN_BANNER) || item.equals(Material.GREEN_CANDLE) || item.equals(Material.GREEN_CONCRETE_POWDER) || item.equals(Material.GREEN_WALL_BANNER) || item.equals(Material.GUSTER_BANNER_PATTERN) || item.equals(Material.GUSTER_POTTERY_SHERD) || item.equals(Material.HEART_POTTERY_SHERD) || item.equals(Material.HEARTBREAK_POTTERY_SHERD) || item.equals(Material.HOWL_POTTERY_SHERD) || item.equals(Material.LANTERN) || item.equals(Material.LIGHT_BLUE_BANNER) || item.equals(Material.LIGHT_BLUE_CANDLE) || item.equals(Material.LIGHT_BLUE_CONCRETE_POWDER) || item.equals(Material.LIGHT_BLUE_WALL_BANNER) || item.equals(Material.LIGHT_GRAY_BANNER) || item.equals(Material.LIGHT_GRAY_CANDLE) || item.equals(Material.LIGHT_GRAY_CONCRETE_POWDER) || item.equals(Material.LIGHT_GRAY_WALL_BANNER) || item.equals(Material.LIME_BANNER) || item.equals(Material.LIME_CANDLE) || item.equals(Material.LIME_CONCRETE_POWDER) || item.equals(Material.LIME_WALL_BANNER) || item.equals(Material.MAGENTA_BANNER) || item.equals(Material.MAGENTA_CANDLE) || item.equals(Material.MAGENTA_CONCRETE_POWDER) || item.equals(Material.MAGENTA_WALL_BANNER) || item.equals(Material.MINER_POTTERY_SHERD) || item.equals(Material.MOJANG_BANNER_PATTERN) || item.equals(Material.MOURNER_POTTERY_SHERD) || item.equals(Material.ORANGE_BANNER) || item.equals(Material.ORANGE_CANDLE) || item.equals(Material.ORANGE_CONCRETE_POWDER) || item.equals(Material.ORANGE_WALL_BANNER) || item.equals(Material.PAINTING) || item.equals(Material.PIGLIN_BANNER_PATTERN) || item.equals(Material.PINK_BANNER) || item.equals(Material.PINK_CANDLE) || item.equals(Material.PINK_CONCRETE_POWDER) || item.equals(Material.PINK_WALL_BANNER) || item.equals(Material.PLENTY_POTTERY_SHERD) || item.equals(Material.POTTED_ALLIUM) || item.equals(Material.POTTED_AZALEA_BUSH) || item.equals(Material.POTTED_AZURE_BLUET) || item.equals(Material.POTTED_BAMBOO) || item.equals(Material.POTTED_BLUE_ORCHID) || item.equals(Material.POTTED_BROWN_MUSHROOM) || item.equals(Material.POTTED_CACTUS) || item.equals(Material.POTTED_CORNFLOWER) || item.equals(Material.POTTED_CRIMSON_FUNGUS) || item.equals(Material.POTTED_CRIMSON_ROOTS) || item.equals(Material.POTTED_DANDELION) || item.equals(Material.POTTED_DEAD_BUSH) || item.equals(Material.POTTED_FERN) || item.equals(Material.POTTED_FLOWERING_AZALEA_BUSH) || item.equals(Material.POTTED_LILY_OF_THE_VALLEY) || item.equals(Material.POTTED_MANGROVE_PROPAGULE) || item.equals(Material.POTTED_ORANGE_TULIP) || item.equals(Material.POTTED_OXEYE_DAISY) || item.equals(Material.POTTED_PINK_TULIP) || item.equals(Material.POTTED_POPPY) || item.equals(Material.POTTED_RED_MUSHROOM) || item.equals(Material.POTTED_RED_TULIP) || item.equals(Material.POTTED_TORCHFLOWER) || item.equals(Material.POTTED_WARPED_FUNGUS) || item.equals(Material.POTTED_WARPED_ROOTS) || item.equals(Material.POTTED_WHITE_TULIP) || item.equals(Material.POTTED_WITHER_ROSE) || item.equals(Material.PRIZE_POTTERY_SHERD) || item.equals(Material.PURPLE_BANNER) || item.equals(Material.PURPLE_CANDLE) || item.equals(Material.PURPLE_CONCRETE_POWDER) || item.equals(Material.PURPLE_WALL_BANNER) || item.equals(Material.RED_BANNER) || item.equals(Material.RED_CANDLE) || item.equals(Material.RED_CONCRETE_POWDER) || item.equals(Material.RED_WALL_BANNER) || item.equals(Material.SCRAPE_POTTERY_SHERD) || item.equals(Material.SEA_LANTERN) || item.equals(Material.SEA_PICKLE) || item.equals(Material.SHEAF_POTTERY_SHERD) || item.equals(Material.SHELTER_POTTERY_SHERD) || item.equals(Material.SHROOMLIGHT) || item.equals(Material.SKULL_BANNER_PATTERN) || item.equals(Material.SKULL_POTTERY_SHERD) || item.equals(Material.SNORT_POTTERY_SHERD) || item.equals(Material.SOUL_LANTERN) || item.equals(Material.WARPED_FUNGUS_ON_A_STICK) || item.equals(Material.WHITE_BANNER) || item.equals(Material.WHITE_CANDLE) || item.equals(Material.WHITE_CONCRETE_POWDER) || item.equals(Material.WHITE_WALL_BANNER) || item.equals(Material.YELLOW_BANNER) || item.equals(Material.YELLOW_CANDLE) || item.equals(Material.YELLOW_CONCRETE_POWDER) || item.equals(Material.YELLOW_WALL_BANNER);
            }

            @NotNull
            @Override
            public Set<Material> getValues() {
                return Sets.newHashSet(Material.ANGLER_POTTERY_SHERD, Material.ARCHER_POTTERY_SHERD, Material.ARMS_UP_POTTERY_SHERD, Material.BLACK_BANNER, Material.BLACK_CANDLE, Material.BLACK_CONCRETE_POWDER, Material.BLACK_WALL_BANNER, Material.BLADE_POTTERY_SHERD, Material.BLUE_BANNER, Material.BLUE_CANDLE, Material.BLUE_CONCRETE_POWDER, Material.BLUE_WALL_BANNER, Material.BREWER_POTTERY_SHERD, Material.BROWN_BANNER, Material.BROWN_CANDLE, Material.BROWN_CONCRETE_POWDER, Material.BROWN_WALL_BANNER, Material.BUDDING_AMETHYST, Material.BURN_POTTERY_SHERD, Material.CANDLE, Material.CHISELED_BOOKSHELF, Material.CHISELED_COPPER, Material.CHISELED_DEEPSLATE, Material.CHISELED_NETHER_BRICKS, Material.CHISELED_POLISHED_BLACKSTONE, Material.CHISELED_QUARTZ_BLOCK, Material.CHISELED_RED_SANDSTONE, Material.CHISELED_SANDSTONE, Material.CHISELED_STONE_BRICKS, Material.CHISELED_TUFF, Material.CHISELED_TUFF_BRICKS, Material.CREEPER_BANNER_PATTERN, Material.CYAN_BANNER, Material.CYAN_CANDLE, Material.CYAN_CONCRETE_POWDER, Material.CYAN_WALL_BANNER, Material.DANGER_POTTERY_SHERD, Material.DECORATED_POT, Material.END_ROD, Material.EXPLORER_POTTERY_SHERD, Material.FLOW_BANNER_PATTERN, Material.FLOW_POTTERY_SHERD, Material.FLOWER_BANNER_PATTERN, Material.FLOWER_POT, Material.FRIEND_POTTERY_SHERD, Material.GLOBE_BANNER_PATTERN, Material.GRAY_BANNER, Material.GRAY_CANDLE, Material.GRAY_CONCRETE_POWDER, Material.GRAY_WALL_BANNER, Material.GREEN_BANNER, Material.GREEN_CANDLE, Material.GREEN_CONCRETE_POWDER, Material.GREEN_WALL_BANNER, Material.GUSTER_BANNER_PATTERN, Material.GUSTER_POTTERY_SHERD, Material.HEART_POTTERY_SHERD, Material.HEARTBREAK_POTTERY_SHERD, Material.HOWL_POTTERY_SHERD, Material.LANTERN, Material.LIGHT_BLUE_BANNER, Material.LIGHT_BLUE_CANDLE, Material.LIGHT_BLUE_CONCRETE_POWDER, Material.LIGHT_BLUE_WALL_BANNER, Material.LIGHT_GRAY_BANNER, Material.LIGHT_GRAY_CANDLE, Material.LIGHT_GRAY_CONCRETE_POWDER, Material.LIGHT_GRAY_WALL_BANNER, Material.LIME_BANNER, Material.LIME_CANDLE, Material.LIME_CONCRETE_POWDER, Material.LIME_WALL_BANNER, Material.MAGENTA_BANNER, Material.MAGENTA_CANDLE, Material.MAGENTA_CONCRETE_POWDER, Material.MAGENTA_WALL_BANNER, Material.MINER_POTTERY_SHERD, Material.MOJANG_BANNER_PATTERN, Material.MOURNER_POTTERY_SHERD, Material.ORANGE_BANNER, Material.ORANGE_CANDLE, Material.ORANGE_CONCRETE_POWDER, Material.ORANGE_WALL_BANNER, Material.PAINTING, Material.PIGLIN_BANNER_PATTERN, Material.PINK_BANNER, Material.PINK_CANDLE, Material.PINK_CONCRETE_POWDER, Material.PINK_WALL_BANNER, Material.PLENTY_POTTERY_SHERD, Material.POTTED_ALLIUM, Material.POTTED_AZALEA_BUSH, Material.POTTED_AZURE_BLUET, Material.POTTED_BAMBOO, Material.POTTED_BLUE_ORCHID, Material.POTTED_BROWN_MUSHROOM, Material.POTTED_CACTUS, Material.POTTED_CORNFLOWER, Material.POTTED_CRIMSON_FUNGUS, Material.POTTED_CRIMSON_ROOTS, Material.POTTED_DANDELION, Material.POTTED_DEAD_BUSH, Material.POTTED_FERN, Material.POTTED_FLOWERING_AZALEA_BUSH, Material.POTTED_LILY_OF_THE_VALLEY, Material.POTTED_MANGROVE_PROPAGULE, Material.POTTED_ORANGE_TULIP, Material.POTTED_OXEYE_DAISY, Material.POTTED_PINK_TULIP, Material.POTTED_POPPY, Material.POTTED_RED_MUSHROOM, Material.POTTED_RED_TULIP, Material.POTTED_TORCHFLOWER, Material.POTTED_WARPED_FUNGUS, Material.POTTED_WARPED_ROOTS, Material.POTTED_WHITE_TULIP, Material.POTTED_WITHER_ROSE, Material.PRIZE_POTTERY_SHERD, Material.PURPLE_BANNER, Material.PURPLE_CANDLE, Material.PURPLE_CONCRETE_POWDER, Material.PURPLE_WALL_BANNER, Material.RED_BANNER, Material.RED_CANDLE, Material.RED_CONCRETE_POWDER, Material.RED_WALL_BANNER, Material.SCRAPE_POTTERY_SHERD, Material.SEA_LANTERN, Material.SEA_PICKLE, Material.SHEAF_POTTERY_SHERD, Material.SHELTER_POTTERY_SHERD, Material.SHROOMLIGHT, Material.SKULL_BANNER_PATTERN, Material.SKULL_POTTERY_SHERD, Material.SNORT_POTTERY_SHERD, Material.SOUL_LANTERN, Material.WARPED_FUNGUS_ON_A_STICK, Material.WHITE_BANNER, Material.WHITE_CANDLE, Material.WHITE_CONCRETE_POWDER, Material.WHITE_WALL_BANNER, Material.YELLOW_BANNER, Material.YELLOW_CANDLE, Material.YELLOW_CONCRETE_POWDER, Material.YELLOW_WALL_BANNER);
            }

            @NotNull
            @Override
            public NamespacedKey getKey() {
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "decoration");
            }
        };
    
        UTILITY = new Tag() {

            @Override
            public boolean isTagged(@NotNull Keyed item) {
                return item.equals(Material.ANVIL) || item.equals(Material.BEACON) || item.equals(Material.BEEHIVE) || item.equals(Material.BELL) || item.equals(Material.BLAST_FURNACE) || item.equals(Material.BOOKSHELF) || item.equals(Material.BREWING_STAND) || item.equals(Material.BUBBLE_COLUMN) || item.equals(Material.BUCKET) || item.equals(Material.CALIBRATED_SCULK_SENSOR) || item.equals(Material.CAMPFIRE) || item.equals(Material.CARROT_ON_A_STICK) || item.equals(Material.CARTOGRAPHY_TABLE) || item.equals(Material.CAULDRON) || item.equals(Material.CHAIN_COMMAND_BLOCK) || item.equals(Material.CHIPPED_ANVIL) || item.equals(Material.CLOCK) || item.equals(Material.COMMAND_BLOCK) || item.equals(Material.COMMAND_BLOCK_MINECART) || item.equals(Material.COMPASS) || item.equals(Material.COMPOSTER) || item.equals(Material.CONDUIT) || item.equals(Material.CRAFTING_TABLE) || item.equals(Material.DAMAGED_ANVIL) || item.equals(Material.ECHO_SHARD) || item.equals(Material.ENCHANTING_TABLE) || item.equals(Material.EXPERIENCE_BOTTLE) || item.equals(Material.FLETCHING_TABLE) || item.equals(Material.FLINT_AND_STEEL) || item.equals(Material.FURNACE) || item.equals(Material.FURNACE_MINECART) || item.equals(Material.GLOW_ITEM_FRAME) || item.equals(Material.GOAT_HORN) || item.equals(Material.GRINDSTONE) || item.equals(Material.HEART_OF_THE_SEA) || item.equals(Material.HEAVY_CORE) || item.equals(Material.HONEYCOMB) || item.equals(Material.HOPPER) || item.equals(Material.HOPPER_MINECART) || item.equals(Material.ITEM_FRAME) || item.equals(Material.JIGSAW) || item.equals(Material.JUKEBOX) || item.equals(Material.LADDER) || item.equals(Material.LAVA_BUCKET) || item.equals(Material.LAVA_CAULDRON) || item.equals(Material.LEAD) || item.equals(Material.LECTERN) || item.equals(Material.LIGHTNING_ROD) || item.equals(Material.LOOM) || item.equals(Material.MINECART) || item.equals(Material.NAME_TAG) || item.equals(Material.OMINOUS_TRIAL_KEY) || item.equals(Material.PAPER) || item.equals(Material.POPPED_CHORUS_FRUIT) || item.equals(Material.POWDER_SNOW_BUCKET) || item.equals(Material.POWDER_SNOW_CAULDRON) || item.equals(Material.RECOVERY_COMPASS) || item.equals(Material.REPEATING_COMMAND_BLOCK) || item.equals(Material.RESPAWN_ANCHOR) || item.equals(Material.SADDLE) || item.equals(Material.SCULK) || item.equals(Material.SCULK_CATALYST) || item.equals(Material.SCULK_SENSOR) || item.equals(Material.SCULK_SHRIEKER) || item.equals(Material.SCULK_VEIN) || item.equals(Material.SLIME_BALL) || item.equals(Material.SMITHING_TABLE) || item.equals(Material.SMOKER) || item.equals(Material.SNOWBALL) || item.equals(Material.SOUL_CAMPFIRE) || item.equals(Material.SPAWNER) || item.equals(Material.SPONGE) || item.equals(Material.SPYGLASS) || item.equals(Material.STONECUTTER) || item.equals(Material.STRUCTURE_BLOCK) || item.equals(Material.STRUCTURE_VOID) || item.equals(Material.TNT) || item.equals(Material.TNT_MINECART) || item.equals(Material.TOTEM_OF_UNDYING) || item.equals(Material.TRIAL_KEY) || item.equals(Material.TRIAL_SPAWNER) || item.equals(Material.VAULT) || item.equals(Material.WATER_BUCKET) || item.equals(Material.WATER_CAULDRON);
            }

            @NotNull
            @Override
            public Set<Material> getValues() {
                return Sets.newHashSet(Material.ANVIL, Material.BEACON, Material.BEEHIVE, Material.BELL, Material.BLAST_FURNACE, Material.BOOKSHELF, Material.BREWING_STAND, Material.BUBBLE_COLUMN, Material.BUCKET, Material.CALIBRATED_SCULK_SENSOR, Material.CAMPFIRE, Material.CARROT_ON_A_STICK, Material.CARTOGRAPHY_TABLE, Material.CAULDRON, Material.CHAIN_COMMAND_BLOCK, Material.CHIPPED_ANVIL, Material.CLOCK, Material.COMMAND_BLOCK, Material.COMMAND_BLOCK_MINECART, Material.COMPASS, Material.COMPOSTER, Material.CONDUIT, Material.CRAFTING_TABLE, Material.DAMAGED_ANVIL, Material.ECHO_SHARD, Material.ENCHANTING_TABLE, Material.EXPERIENCE_BOTTLE, Material.FLETCHING_TABLE, Material.FLINT_AND_STEEL, Material.FURNACE, Material.FURNACE_MINECART, Material.GLOW_ITEM_FRAME, Material.GOAT_HORN, Material.GRINDSTONE, Material.HEART_OF_THE_SEA, Material.HEAVY_CORE, Material.HONEYCOMB, Material.HOPPER, Material.HOPPER_MINECART, Material.ITEM_FRAME, Material.JIGSAW, Material.JUKEBOX, Material.LADDER, Material.LAVA_BUCKET, Material.LAVA_CAULDRON, Material.LEAD, Material.LECTERN, Material.LIGHTNING_ROD, Material.LOOM, Material.MINECART, Material.NAME_TAG, Material.OMINOUS_TRIAL_KEY, Material.PAPER, Material.POPPED_CHORUS_FRUIT, Material.POWDER_SNOW_BUCKET, Material.POWDER_SNOW_CAULDRON, Material.RECOVERY_COMPASS, Material.REPEATING_COMMAND_BLOCK, Material.RESPAWN_ANCHOR, Material.SADDLE, Material.SCULK, Material.SCULK_CATALYST, Material.SCULK_SENSOR, Material.SCULK_SHRIEKER, Material.SCULK_VEIN, Material.SLIME_BALL, Material.SMITHING_TABLE, Material.SMOKER, Material.SNOWBALL, Material.SOUL_CAMPFIRE, Material.SPAWNER, Material.SPONGE, Material.SPYGLASS, Material.STONECUTTER, Material.STRUCTURE_BLOCK, Material.STRUCTURE_VOID, Material.TNT, Material.TNT_MINECART, Material.TOTEM_OF_UNDYING, Material.TRIAL_KEY, Material.TRIAL_SPAWNER, Material.VAULT, Material.WATER_BUCKET, Material.WATER_CAULDRON);
            }

            @NotNull
            @Override
            public NamespacedKey getKey() {
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "utility");
            }
        };
    
        FOOD = new Tag() {

            @Override
            public boolean isTagged(@NotNull Keyed item) {
                return item.equals(Material.APPLE) || item.equals(Material.BEETROOT) || item.equals(Material.BEETROOT_SOUP) || item.equals(Material.BLACK_CANDLE_CAKE) || item.equals(Material.BLUE_CANDLE_CAKE) || item.equals(Material.BOWL) || item.equals(Material.BREAD) || item.equals(Material.BROWN_CANDLE_CAKE) || item.equals(Material.CAKE) || item.equals(Material.CANDLE_CAKE) || item.equals(Material.CARROT) || item.equals(Material.CARROTS) || item.equals(Material.COOKIE) || item.equals(Material.CYAN_CANDLE_CAKE) || item.equals(Material.EGG) || item.equals(Material.ENCHANTED_GOLDEN_APPLE) || item.equals(Material.GLISTERING_MELON_SLICE) || item.equals(Material.GLOW_BERRIES) || item.equals(Material.GOLDEN_APPLE) || item.equals(Material.GOLDEN_CARROT) || item.equals(Material.GRAY_CANDLE_CAKE) || item.equals(Material.GREEN_CANDLE_CAKE) || item.equals(Material.HONEY_BOTTLE) || item.equals(Material.LIGHT_BLUE_CANDLE_CAKE) || item.equals(Material.LIGHT_GRAY_CANDLE_CAKE) || item.equals(Material.LIME_CANDLE_CAKE) || item.equals(Material.MAGENTA_CANDLE_CAKE) || item.equals(Material.MELON) || item.equals(Material.MELON_SLICE) || item.equals(Material.MILK_BUCKET) || item.equals(Material.MUSHROOM_STEM) || item.equals(Material.MUSHROOM_STEW) || item.equals(Material.ORANGE_CANDLE_CAKE) || item.equals(Material.PINK_CANDLE_CAKE) || item.equals(Material.POTATO) || item.equals(Material.POTATOES) || item.equals(Material.PUMPKIN_PIE) || item.equals(Material.PURPLE_CANDLE_CAKE) || item.equals(Material.RABBIT_STEW) || item.equals(Material.RED_CANDLE_CAKE) || item.equals(Material.SUSPICIOUS_STEW) || item.equals(Material.SWEET_BERRIES) || item.equals(Material.WHITE_CANDLE_CAKE) || item.equals(Material.YELLOW_CANDLE_CAKE);
            }

            @NotNull
            @Override
            public Set<Material> getValues() {
                return Sets.newHashSet(Material.APPLE, Material.BEETROOT, Material.BEETROOT_SOUP, Material.BLACK_CANDLE_CAKE, Material.BLUE_CANDLE_CAKE, Material.BOWL, Material.BREAD, Material.BROWN_CANDLE_CAKE, Material.CAKE, Material.CANDLE_CAKE, Material.CARROT, Material.CARROTS, Material.COOKIE, Material.CYAN_CANDLE_CAKE, Material.EGG, Material.ENCHANTED_GOLDEN_APPLE, Material.GLISTERING_MELON_SLICE, Material.GLOW_BERRIES, Material.GOLDEN_APPLE, Material.GOLDEN_CARROT, Material.GRAY_CANDLE_CAKE, Material.GREEN_CANDLE_CAKE, Material.HONEY_BOTTLE, Material.LIGHT_BLUE_CANDLE_CAKE, Material.LIGHT_GRAY_CANDLE_CAKE, Material.LIME_CANDLE_CAKE, Material.MAGENTA_CANDLE_CAKE, Material.MELON, Material.MELON_SLICE, Material.MILK_BUCKET, Material.MUSHROOM_STEM, Material.MUSHROOM_STEW, Material.ORANGE_CANDLE_CAKE, Material.PINK_CANDLE_CAKE, Material.POTATO, Material.POTATOES, Material.PUMPKIN_PIE, Material.PURPLE_CANDLE_CAKE, Material.RABBIT_STEW, Material.RED_CANDLE_CAKE, Material.SUSPICIOUS_STEW, Material.SWEET_BERRIES, Material.WHITE_CANDLE_CAKE, Material.YELLOW_CANDLE_CAKE);
            }

            @NotNull
            @Override
            public NamespacedKey getKey() {
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "food");
            }
        };
    
        ARMOR = new Tag() {

            @Override
            public boolean isTagged(@NotNull Keyed item) {
                return item.equals(Material.ARMOR_STAND) || item.equals(Material.CHAINMAIL_BOOTS) || item.equals(Material.CHAINMAIL_CHESTPLATE) || item.equals(Material.CHAINMAIL_HELMET) || item.equals(Material.CHAINMAIL_LEGGINGS) || item.equals(Material.DIAMOND_BOOTS) || item.equals(Material.DIAMOND_CHESTPLATE) || item.equals(Material.DIAMOND_HELMET) || item.equals(Material.DIAMOND_HORSE_ARMOR) || item.equals(Material.DIAMOND_LEGGINGS) || item.equals(Material.ELYTRA) || item.equals(Material.GOLDEN_BOOTS) || item.equals(Material.GOLDEN_CHESTPLATE) || item.equals(Material.GOLDEN_HELMET) || item.equals(Material.GOLDEN_HORSE_ARMOR) || item.equals(Material.GOLDEN_LEGGINGS) || item.equals(Material.IRON_BOOTS) || item.equals(Material.IRON_CHESTPLATE) || item.equals(Material.IRON_HELMET) || item.equals(Material.IRON_HORSE_ARMOR) || item.equals(Material.IRON_LEGGINGS) || item.equals(Material.LEATHER_BOOTS) || item.equals(Material.LEATHER_CHESTPLATE) || item.equals(Material.LEATHER_HELMET) || item.equals(Material.LEATHER_LEGGINGS) || item.equals(Material.NETHERITE_BOOTS) || item.equals(Material.NETHERITE_CHESTPLATE) || item.equals(Material.NETHERITE_HELMET) || item.equals(Material.NETHERITE_LEGGINGS) || item.equals(Material.SHIELD) || item.equals(Material.TURTLE_HELMET) || item.equals(Material.TURTLE_SCUTE) || item.equals(Material.WOLF_ARMOR);
            }

            @NotNull
            @Override
            public Set<Material> getValues() {
                return Sets.newHashSet(Material.ARMOR_STAND, Material.CHAINMAIL_BOOTS, Material.CHAINMAIL_CHESTPLATE, Material.CHAINMAIL_HELMET, Material.CHAINMAIL_LEGGINGS, Material.DIAMOND_BOOTS, Material.DIAMOND_CHESTPLATE, Material.DIAMOND_HELMET, Material.DIAMOND_HORSE_ARMOR, Material.DIAMOND_LEGGINGS, Material.ELYTRA, Material.GOLDEN_BOOTS, Material.GOLDEN_CHESTPLATE, Material.GOLDEN_HELMET, Material.GOLDEN_HORSE_ARMOR, Material.GOLDEN_LEGGINGS, Material.IRON_BOOTS, Material.IRON_CHESTPLATE, Material.IRON_HELMET, Material.IRON_HORSE_ARMOR, Material.IRON_LEGGINGS, Material.LEATHER_BOOTS, Material.LEATHER_CHESTPLATE, Material.LEATHER_HELMET, Material.LEATHER_LEGGINGS, Material.NETHERITE_BOOTS, Material.NETHERITE_CHESTPLATE, Material.NETHERITE_HELMET, Material.NETHERITE_LEGGINGS, Material.SHIELD, Material.TURTLE_HELMET, Material.TURTLE_SCUTE, Material.WOLF_ARMOR);
            }

            @NotNull
            @Override
            public NamespacedKey getKey() {
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "armor");
            }
        };
    
        ARROW = new Tag() {

            @Override
            public boolean isTagged(@NotNull Keyed item) {
                return item.equals(Material.ARROW) || item.equals(Material.SPECTRAL_ARROW) || item.equals(Material.TIPPED_ARROW);
            }

            @NotNull
            @Override
            public Set<Material> getValues() {
                return Sets.newHashSet(Material.ARROW, Material.SPECTRAL_ARROW, Material.TIPPED_ARROW);
            }

            @NotNull
            @Override
            public NamespacedKey getKey() {
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "arrow");
            }
        };
    
        BUCKET_MOB = new Tag() {

            @Override
            public boolean isTagged(@NotNull Keyed item) {
                return item.equals(Material.AXOLOTL_BUCKET) || item.equals(Material.COD_BUCKET) || item.equals(Material.PUFFERFISH_BUCKET) || item.equals(Material.SALMON_BUCKET) || item.equals(Material.TADPOLE_BUCKET) || item.equals(Material.TROPICAL_FISH_BUCKET);
            }

            @NotNull
            @Override
            public Set<Material> getValues() {
                return Sets.newHashSet(Material.AXOLOTL_BUCKET, Material.COD_BUCKET, Material.PUFFERFISH_BUCKET, Material.SALMON_BUCKET, Material.TADPOLE_BUCKET, Material.TROPICAL_FISH_BUCKET);
            }

            @NotNull
            @Override
            public NamespacedKey getKey() {
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "bucket_mob");
            }
        };
    
        COOKED_FOOD = new Tag() {

            @Override
            public boolean isTagged(@NotNull Keyed item) {
                return item.equals(Material.BAKED_POTATO) || item.equals(Material.COOKED_BEEF) || item.equals(Material.COOKED_CHICKEN) || item.equals(Material.COOKED_COD) || item.equals(Material.COOKED_MUTTON) || item.equals(Material.COOKED_PORKCHOP) || item.equals(Material.COOKED_RABBIT) || item.equals(Material.COOKED_SALMON) || item.equals(Material.PORKCHOP);
            }

            @NotNull
            @Override
            public Set<Material> getValues() {
                return Sets.newHashSet(Material.BAKED_POTATO, Material.COOKED_BEEF, Material.COOKED_CHICKEN, Material.COOKED_COD, Material.COOKED_MUTTON, Material.COOKED_PORKCHOP, Material.COOKED_RABBIT, Material.COOKED_SALMON, Material.PORKCHOP);
            }

            @NotNull
            @Override
            public NamespacedKey getKey() {
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "cooked_food");
            }
        };
    
        STORAGE = new Tag() {

            @Override
            public boolean isTagged(@NotNull Keyed item) {
                return item.equals(Material.BARREL) || item.equals(Material.BLACK_SHULKER_BOX) || item.equals(Material.BLUE_SHULKER_BOX) || item.equals(Material.BROWN_SHULKER_BOX) || item.equals(Material.CHEST) || item.equals(Material.CHEST_MINECART) || item.equals(Material.CYAN_SHULKER_BOX) || item.equals(Material.ENDER_CHEST) || item.equals(Material.GRAY_SHULKER_BOX) || item.equals(Material.GREEN_SHULKER_BOX) || item.equals(Material.LIGHT_BLUE_SHULKER_BOX) || item.equals(Material.LIGHT_GRAY_SHULKER_BOX) || item.equals(Material.LIME_SHULKER_BOX) || item.equals(Material.MAGENTA_SHULKER_BOX) || item.equals(Material.ORANGE_SHULKER_BOX) || item.equals(Material.PINK_SHULKER_BOX) || item.equals(Material.PURPLE_SHULKER_BOX) || item.equals(Material.RED_SHULKER_BOX) || item.equals(Material.SHULKER_BOX) || item.equals(Material.SHULKER_SHELL) || item.equals(Material.TRAPPED_CHEST) || item.equals(Material.WHITE_SHULKER_BOX) || item.equals(Material.YELLOW_SHULKER_BOX);
            }

            @NotNull
            @Override
            public Set<Material> getValues() {
                return Sets.newHashSet(Material.BARREL, Material.BLACK_SHULKER_BOX, Material.BLUE_SHULKER_BOX, Material.BROWN_SHULKER_BOX, Material.CHEST, Material.CHEST_MINECART, Material.CYAN_SHULKER_BOX, Material.ENDER_CHEST, Material.GRAY_SHULKER_BOX, Material.GREEN_SHULKER_BOX, Material.LIGHT_BLUE_SHULKER_BOX, Material.LIGHT_GRAY_SHULKER_BOX, Material.LIME_SHULKER_BOX, Material.MAGENTA_SHULKER_BOX, Material.ORANGE_SHULKER_BOX, Material.PINK_SHULKER_BOX, Material.PURPLE_SHULKER_BOX, Material.RED_SHULKER_BOX, Material.SHULKER_BOX, Material.SHULKER_SHELL, Material.TRAPPED_CHEST, Material.WHITE_SHULKER_BOX, Material.YELLOW_SHULKER_BOX);
            }

            @NotNull
            @Override
            public NamespacedKey getKey() {
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "storage");
            }
        };
    
        MOB_BLOCK = new Tag() {

            @Override
            public boolean isTagged(@NotNull Keyed item) {
                return item.equals(Material.BEE_NEST);
            }

            @NotNull
            @Override
            public Set<Material> getValues() {
                return Sets.newHashSet(Material.BEE_NEST);
            }

            @NotNull
            @Override
            public NamespacedKey getKey() {
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "mob_block");
            }
        };
    
        RAW_FOOD = new Tag() {

            @Override
            public boolean isTagged(@NotNull Keyed item) {
                return item.equals(Material.BEEF) || item.equals(Material.CHICKEN) || item.equals(Material.COD) || item.equals(Material.MUTTON) || item.equals(Material.SALMON) || item.equals(Material.SUGAR) || item.equals(Material.TROPICAL_FISH);
            }

            @NotNull
            @Override
            public Set<Material> getValues() {
                return Sets.newHashSet(Material.BEEF, Material.CHICKEN, Material.COD, Material.MUTTON, Material.SALMON, Material.SUGAR, Material.TROPICAL_FISH);
            }

            @NotNull
            @Override
            public NamespacedKey getKey() {
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "raw_food");
            }
        };
    
        BED = new Tag() {

            @Override
            public boolean isTagged(@NotNull Keyed item) {
                return item.equals(Material.BLACK_BED) || item.equals(Material.BLUE_BED) || item.equals(Material.BROWN_BED) || item.equals(Material.CYAN_BED) || item.equals(Material.GRAY_BED) || item.equals(Material.GREEN_BED) || item.equals(Material.LIGHT_BLUE_BED) || item.equals(Material.LIGHT_GRAY_BED) || item.equals(Material.LIME_BED) || item.equals(Material.MAGENTA_BED) || item.equals(Material.ORANGE_BED) || item.equals(Material.PINK_BED) || item.equals(Material.PURPLE_BED) || item.equals(Material.RED_BED) || item.equals(Material.WHITE_BED) || item.equals(Material.YELLOW_BED);
            }

            @NotNull
            @Override
            public Set<Material> getValues() {
                return Sets.newHashSet(Material.BLACK_BED, Material.BLUE_BED, Material.BROWN_BED, Material.CYAN_BED, Material.GRAY_BED, Material.GREEN_BED, Material.LIGHT_BLUE_BED, Material.LIGHT_GRAY_BED, Material.LIME_BED, Material.MAGENTA_BED, Material.ORANGE_BED, Material.PINK_BED, Material.PURPLE_BED, Material.RED_BED, Material.WHITE_BED, Material.YELLOW_BED);
            }

            @NotNull
            @Override
            public NamespacedKey getKey() {
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "bed");
            }
        };
    
        WOOL = new Tag() {

            @Override
            public boolean isTagged(@NotNull Keyed item) {
                return item.equals(Material.BLACK_CARPET) || item.equals(Material.BLACK_WOOL) || item.equals(Material.BLUE_CARPET) || item.equals(Material.BLUE_WOOL) || item.equals(Material.BROWN_CARPET) || item.equals(Material.BROWN_WOOL) || item.equals(Material.CYAN_CARPET) || item.equals(Material.CYAN_WOOL) || item.equals(Material.GRAY_CARPET) || item.equals(Material.GRAY_WOOL) || item.equals(Material.GREEN_CARPET) || item.equals(Material.GREEN_WOOL) || item.equals(Material.LIGHT_BLUE_CARPET) || item.equals(Material.LIGHT_BLUE_WOOL) || item.equals(Material.LIGHT_GRAY_CARPET) || item.equals(Material.LIGHT_GRAY_WOOL) || item.equals(Material.LIME_CARPET) || item.equals(Material.LIME_WOOL) || item.equals(Material.MAGENTA_CARPET) || item.equals(Material.MAGENTA_WOOL) || item.equals(Material.MOSS_CARPET) || item.equals(Material.ORANGE_CARPET) || item.equals(Material.ORANGE_WOOL) || item.equals(Material.PINK_CARPET) || item.equals(Material.PINK_WOOL) || item.equals(Material.PURPLE_CARPET) || item.equals(Material.PURPLE_WOOL) || item.equals(Material.RED_CARPET) || item.equals(Material.RED_WOOL) || item.equals(Material.WHITE_CARPET) || item.equals(Material.WHITE_WOOL) || item.equals(Material.YELLOW_CARPET) || item.equals(Material.YELLOW_WOOL);
            }

            @NotNull
            @Override
            public Set<Material> getValues() {
                return Sets.newHashSet(Material.BLACK_CARPET, Material.BLACK_WOOL, Material.BLUE_CARPET, Material.BLUE_WOOL, Material.BROWN_CARPET, Material.BROWN_WOOL, Material.CYAN_CARPET, Material.CYAN_WOOL, Material.GRAY_CARPET, Material.GRAY_WOOL, Material.GREEN_CARPET, Material.GREEN_WOOL, Material.LIGHT_BLUE_CARPET, Material.LIGHT_BLUE_WOOL, Material.LIGHT_GRAY_CARPET, Material.LIGHT_GRAY_WOOL, Material.LIME_CARPET, Material.LIME_WOOL, Material.MAGENTA_CARPET, Material.MAGENTA_WOOL, Material.MOSS_CARPET, Material.ORANGE_CARPET, Material.ORANGE_WOOL, Material.PINK_CARPET, Material.PINK_WOOL, Material.PURPLE_CARPET, Material.PURPLE_WOOL, Material.RED_CARPET, Material.RED_WOOL, Material.WHITE_CARPET, Material.WHITE_WOOL, Material.YELLOW_CARPET, Material.YELLOW_WOOL);
            }

            @NotNull
            @Override
            public NamespacedKey getKey() {
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "wool");
            }
        };
    
        DYE = new Tag() {

            @Override
            public boolean isTagged(@NotNull Keyed item) {
                return item.equals(Material.BLACK_DYE) || item.equals(Material.BLUE_DYE) || item.equals(Material.BROWN_DYE) || item.equals(Material.CYAN_DYE) || item.equals(Material.GRAY_DYE) || item.equals(Material.GREEN_DYE) || item.equals(Material.LIGHT_BLUE_DYE) || item.equals(Material.LIGHT_GRAY_DYE) || item.equals(Material.LIME_DYE) || item.equals(Material.MAGENTA_DYE) || item.equals(Material.ORANGE_DYE) || item.equals(Material.PINK_DYE) || item.equals(Material.PURPLE_DYE) || item.equals(Material.RED_DYE) || item.equals(Material.WHITE_DYE) || item.equals(Material.YELLOW_DYE);
            }

            @NotNull
            @Override
            public Set<Material> getValues() {
                return Sets.newHashSet(Material.BLACK_DYE, Material.BLUE_DYE, Material.BROWN_DYE, Material.CYAN_DYE, Material.GRAY_DYE, Material.GREEN_DYE, Material.LIGHT_BLUE_DYE, Material.LIGHT_GRAY_DYE, Material.LIME_DYE, Material.MAGENTA_DYE, Material.ORANGE_DYE, Material.PINK_DYE, Material.PURPLE_DYE, Material.RED_DYE, Material.WHITE_DYE, Material.YELLOW_DYE);
            }

            @NotNull
            @Override
            public NamespacedKey getKey() {
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "dye");
            }
        };
    
        GLASS = new Tag() {

            @Override
            public boolean isTagged(@NotNull Keyed item) {
                return item.equals(Material.BLACK_STAINED_GLASS) || item.equals(Material.BLACK_STAINED_GLASS_PANE) || item.equals(Material.BLUE_STAINED_GLASS) || item.equals(Material.BLUE_STAINED_GLASS_PANE) || item.equals(Material.BROWN_STAINED_GLASS) || item.equals(Material.BROWN_STAINED_GLASS_PANE) || item.equals(Material.CYAN_STAINED_GLASS) || item.equals(Material.CYAN_STAINED_GLASS_PANE) || item.equals(Material.GLASS) || item.equals(Material.GLASS_BOTTLE) || item.equals(Material.GLASS_PANE) || item.equals(Material.GRAY_STAINED_GLASS) || item.equals(Material.GRAY_STAINED_GLASS_PANE) || item.equals(Material.GREEN_STAINED_GLASS) || item.equals(Material.GREEN_STAINED_GLASS_PANE) || item.equals(Material.LIGHT_BLUE_STAINED_GLASS) || item.equals(Material.LIGHT_BLUE_STAINED_GLASS_PANE) || item.equals(Material.LIGHT_GRAY_STAINED_GLASS) || item.equals(Material.LIGHT_GRAY_STAINED_GLASS_PANE) || item.equals(Material.LIME_STAINED_GLASS) || item.equals(Material.LIME_STAINED_GLASS_PANE) || item.equals(Material.MAGENTA_STAINED_GLASS) || item.equals(Material.MAGENTA_STAINED_GLASS_PANE) || item.equals(Material.ORANGE_STAINED_GLASS) || item.equals(Material.ORANGE_STAINED_GLASS_PANE) || item.equals(Material.PINK_STAINED_GLASS) || item.equals(Material.PINK_STAINED_GLASS_PANE) || item.equals(Material.PURPLE_STAINED_GLASS) || item.equals(Material.PURPLE_STAINED_GLASS_PANE) || item.equals(Material.RED_STAINED_GLASS) || item.equals(Material.RED_STAINED_GLASS_PANE) || item.equals(Material.TINTED_GLASS) || item.equals(Material.WHITE_STAINED_GLASS) || item.equals(Material.WHITE_STAINED_GLASS_PANE) || item.equals(Material.YELLOW_STAINED_GLASS) || item.equals(Material.YELLOW_STAINED_GLASS_PANE);
            }

            @NotNull
            @Override
            public Set<Material> getValues() {
                return Sets.newHashSet(Material.BLACK_STAINED_GLASS, Material.BLACK_STAINED_GLASS_PANE, Material.BLUE_STAINED_GLASS, Material.BLUE_STAINED_GLASS_PANE, Material.BROWN_STAINED_GLASS, Material.BROWN_STAINED_GLASS_PANE, Material.CYAN_STAINED_GLASS, Material.CYAN_STAINED_GLASS_PANE, Material.GLASS, Material.GLASS_BOTTLE, Material.GLASS_PANE, Material.GRAY_STAINED_GLASS, Material.GRAY_STAINED_GLASS_PANE, Material.GREEN_STAINED_GLASS, Material.GREEN_STAINED_GLASS_PANE, Material.LIGHT_BLUE_STAINED_GLASS, Material.LIGHT_BLUE_STAINED_GLASS_PANE, Material.LIGHT_GRAY_STAINED_GLASS, Material.LIGHT_GRAY_STAINED_GLASS_PANE, Material.LIME_STAINED_GLASS, Material.LIME_STAINED_GLASS_PANE, Material.MAGENTA_STAINED_GLASS, Material.MAGENTA_STAINED_GLASS_PANE, Material.ORANGE_STAINED_GLASS, Material.ORANGE_STAINED_GLASS_PANE, Material.PINK_STAINED_GLASS, Material.PINK_STAINED_GLASS_PANE, Material.PURPLE_STAINED_GLASS, Material.PURPLE_STAINED_GLASS_PANE, Material.RED_STAINED_GLASS, Material.RED_STAINED_GLASS_PANE, Material.TINTED_GLASS, Material.WHITE_STAINED_GLASS, Material.WHITE_STAINED_GLASS_PANE, Material.YELLOW_STAINED_GLASS, Material.YELLOW_STAINED_GLASS_PANE);
            }

            @NotNull
            @Override
            public NamespacedKey getKey() {
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "glass");
            }
        };
    
        MOB_DROP = new Tag() {

            @Override
            public boolean isTagged(@NotNull Keyed item) {
                return item.equals(Material.BLAZE_POWDER) || item.equals(Material.BLAZE_ROD) || item.equals(Material.BONE) || item.equals(Material.BONE_BLOCK) || item.equals(Material.BREEZE_ROD) || item.equals(Material.COBWEB) || item.equals(Material.DRAGON_BREATH) || item.equals(Material.ENDER_EYE) || item.equals(Material.ENDER_PEARL) || item.equals(Material.FEATHER) || item.equals(Material.FERMENTED_SPIDER_EYE) || item.equals(Material.GHAST_TEAR) || item.equals(Material.GLOW_INK_SAC) || item.equals(Material.GUNPOWDER) || item.equals(Material.INK_SAC) || item.equals(Material.MAGMA_BLOCK) || item.equals(Material.MAGMA_CREAM) || item.equals(Material.NAUTILUS_SHELL) || item.equals(Material.NETHER_STAR) || item.equals(Material.PHANTOM_MEMBRANE) || item.equals(Material.PUFFERFISH) || item.equals(Material.ROTTEN_FLESH) || item.equals(Material.SPIDER_EYE) || item.equals(Material.STRING);
            }

            @NotNull
            @Override
            public Set<Material> getValues() {
                return Sets.newHashSet(Material.BLAZE_POWDER, Material.BLAZE_ROD, Material.BONE, Material.BONE_BLOCK, Material.BREEZE_ROD, Material.COBWEB, Material.DRAGON_BREATH, Material.ENDER_EYE, Material.ENDER_PEARL, Material.FEATHER, Material.FERMENTED_SPIDER_EYE, Material.GHAST_TEAR, Material.GLOW_INK_SAC, Material.GUNPOWDER, Material.INK_SAC, Material.MAGMA_BLOCK, Material.MAGMA_CREAM, Material.NAUTILUS_SHELL, Material.NETHER_STAR, Material.PHANTOM_MEMBRANE, Material.PUFFERFISH, Material.ROTTEN_FLESH, Material.SPIDER_EYE, Material.STRING);
            }

            @NotNull
            @Override
            public NamespacedKey getKey() {
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "mob_drop");
            }
        };
    
        ICE = new Tag() {

            @Override
            public boolean isTagged(@NotNull Keyed item) {
                return item.equals(Material.BLUE_ICE) || item.equals(Material.FROSTED_ICE) || item.equals(Material.ICE) || item.equals(Material.PACKED_ICE);
            }

            @NotNull
            @Override
            public Set<Material> getValues() {
                return Sets.newHashSet(Material.BLUE_ICE, Material.FROSTED_ICE, Material.ICE, Material.PACKED_ICE);
            }

            @NotNull
            @Override
            public NamespacedKey getKey() {
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "ice");
            }
        };
    
        SMITHING = new Tag() {

            @Override
            public boolean isTagged(@NotNull Keyed item) {
                return item.equals(Material.BOLT_ARMOR_TRIM_SMITHING_TEMPLATE) || item.equals(Material.COAST_ARMOR_TRIM_SMITHING_TEMPLATE) || item.equals(Material.DUNE_ARMOR_TRIM_SMITHING_TEMPLATE) || item.equals(Material.EYE_ARMOR_TRIM_SMITHING_TEMPLATE) || item.equals(Material.FLOW_ARMOR_TRIM_SMITHING_TEMPLATE) || item.equals(Material.HOST_ARMOR_TRIM_SMITHING_TEMPLATE) || item.equals(Material.NETHERITE_UPGRADE_SMITHING_TEMPLATE) || item.equals(Material.RAISER_ARMOR_TRIM_SMITHING_TEMPLATE) || item.equals(Material.RIB_ARMOR_TRIM_SMITHING_TEMPLATE) || item.equals(Material.SENTRY_ARMOR_TRIM_SMITHING_TEMPLATE) || item.equals(Material.SHAPER_ARMOR_TRIM_SMITHING_TEMPLATE) || item.equals(Material.SILENCE_ARMOR_TRIM_SMITHING_TEMPLATE) || item.equals(Material.SNOUT_ARMOR_TRIM_SMITHING_TEMPLATE) || item.equals(Material.SPIRE_ARMOR_TRIM_SMITHING_TEMPLATE) || item.equals(Material.TIDE_ARMOR_TRIM_SMITHING_TEMPLATE) || item.equals(Material.VEX_ARMOR_TRIM_SMITHING_TEMPLATE) || item.equals(Material.WARD_ARMOR_TRIM_SMITHING_TEMPLATE) || item.equals(Material.WAYFINDER_ARMOR_TRIM_SMITHING_TEMPLATE) || item.equals(Material.WILD_ARMOR_TRIM_SMITHING_TEMPLATE);
            }

            @NotNull
            @Override
            public Set<Material> getValues() {
                return Sets.newHashSet(Material.BOLT_ARMOR_TRIM_SMITHING_TEMPLATE, Material.COAST_ARMOR_TRIM_SMITHING_TEMPLATE, Material.DUNE_ARMOR_TRIM_SMITHING_TEMPLATE, Material.EYE_ARMOR_TRIM_SMITHING_TEMPLATE, Material.FLOW_ARMOR_TRIM_SMITHING_TEMPLATE, Material.HOST_ARMOR_TRIM_SMITHING_TEMPLATE, Material.NETHERITE_UPGRADE_SMITHING_TEMPLATE, Material.RAISER_ARMOR_TRIM_SMITHING_TEMPLATE, Material.RIB_ARMOR_TRIM_SMITHING_TEMPLATE, Material.SENTRY_ARMOR_TRIM_SMITHING_TEMPLATE, Material.SHAPER_ARMOR_TRIM_SMITHING_TEMPLATE, Material.SILENCE_ARMOR_TRIM_SMITHING_TEMPLATE, Material.SNOUT_ARMOR_TRIM_SMITHING_TEMPLATE, Material.SPIRE_ARMOR_TRIM_SMITHING_TEMPLATE, Material.TIDE_ARMOR_TRIM_SMITHING_TEMPLATE, Material.VEX_ARMOR_TRIM_SMITHING_TEMPLATE, Material.WARD_ARMOR_TRIM_SMITHING_TEMPLATE, Material.WAYFINDER_ARMOR_TRIM_SMITHING_TEMPLATE, Material.WILD_ARMOR_TRIM_SMITHING_TEMPLATE);
            }

            @NotNull
            @Override
            public NamespacedKey getKey() {
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "smithing");
            }
        };
    
        BOOK = new Tag() {

            @Override
            public boolean isTagged(@NotNull Keyed item) {
                return item.equals(Material.BOOK) || item.equals(Material.KNOWLEDGE_BOOK) || item.equals(Material.WRITABLE_BOOK) || item.equals(Material.WRITTEN_BOOK);
            }

            @NotNull
            @Override
            public Set<Material> getValues() {
                return Sets.newHashSet(Material.BOOK, Material.KNOWLEDGE_BOOK, Material.WRITABLE_BOOK, Material.WRITTEN_BOOK);
            }

            @NotNull
            @Override
            public NamespacedKey getKey() {
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "book");
            }
        };
    
        WEAPON = new Tag() {

            @Override
            public boolean isTagged(@NotNull Keyed item) {
                return item.equals(Material.BOW) || item.equals(Material.CROSSBOW) || item.equals(Material.DIAMOND_SWORD) || item.equals(Material.FIRE_CHARGE) || item.equals(Material.GOLDEN_SWORD) || item.equals(Material.IRON_SWORD) || item.equals(Material.MACE) || item.equals(Material.NETHERITE_SWORD) || item.equals(Material.STONE_SWORD) || item.equals(Material.TRIDENT) || item.equals(Material.WIND_CHARGE) || item.equals(Material.WOODEN_SWORD);
            }

            @NotNull
            @Override
            public Set<Material> getValues() {
                return Sets.newHashSet(Material.BOW, Material.CROSSBOW, Material.DIAMOND_SWORD, Material.FIRE_CHARGE, Material.GOLDEN_SWORD, Material.IRON_SWORD, Material.MACE, Material.NETHERITE_SWORD, Material.STONE_SWORD, Material.TRIDENT, Material.WIND_CHARGE, Material.WOODEN_SWORD);
            }

            @NotNull
            @Override
            public NamespacedKey getKey() {
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "weapon");
            }
        };
    
        CORAL = new Tag() {

            @Override
            public boolean isTagged(@NotNull Keyed item) {
                return item.equals(Material.BRAIN_CORAL) || item.equals(Material.BRAIN_CORAL_BLOCK) || item.equals(Material.BRAIN_CORAL_FAN) || item.equals(Material.BRAIN_CORAL_WALL_FAN) || item.equals(Material.BUBBLE_CORAL) || item.equals(Material.BUBBLE_CORAL_BLOCK) || item.equals(Material.BUBBLE_CORAL_FAN) || item.equals(Material.BUBBLE_CORAL_WALL_FAN) || item.equals(Material.DEAD_BRAIN_CORAL) || item.equals(Material.DEAD_BRAIN_CORAL_BLOCK) || item.equals(Material.DEAD_BRAIN_CORAL_FAN) || item.equals(Material.DEAD_BRAIN_CORAL_WALL_FAN) || item.equals(Material.DEAD_BUBBLE_CORAL) || item.equals(Material.DEAD_BUBBLE_CORAL_BLOCK) || item.equals(Material.DEAD_BUBBLE_CORAL_FAN) || item.equals(Material.DEAD_BUBBLE_CORAL_WALL_FAN) || item.equals(Material.DEAD_FIRE_CORAL) || item.equals(Material.DEAD_FIRE_CORAL_BLOCK) || item.equals(Material.DEAD_FIRE_CORAL_FAN) || item.equals(Material.DEAD_FIRE_CORAL_WALL_FAN) || item.equals(Material.DEAD_HORN_CORAL) || item.equals(Material.DEAD_HORN_CORAL_BLOCK) || item.equals(Material.DEAD_HORN_CORAL_FAN) || item.equals(Material.DEAD_HORN_CORAL_WALL_FAN) || item.equals(Material.DEAD_TUBE_CORAL) || item.equals(Material.DEAD_TUBE_CORAL_BLOCK) || item.equals(Material.DEAD_TUBE_CORAL_FAN) || item.equals(Material.DEAD_TUBE_CORAL_WALL_FAN) || item.equals(Material.FIRE_CORAL) || item.equals(Material.FIRE_CORAL_BLOCK) || item.equals(Material.FIRE_CORAL_FAN) || item.equals(Material.FIRE_CORAL_WALL_FAN) || item.equals(Material.HORN_CORAL) || item.equals(Material.HORN_CORAL_BLOCK) || item.equals(Material.HORN_CORAL_FAN) || item.equals(Material.HORN_CORAL_WALL_FAN) || item.equals(Material.TUBE_CORAL) || item.equals(Material.TUBE_CORAL_BLOCK) || item.equals(Material.TUBE_CORAL_FAN) || item.equals(Material.TUBE_CORAL_WALL_FAN);
            }

            @NotNull
            @Override
            public Set<Material> getValues() {
                return Sets.newHashSet(Material.BRAIN_CORAL, Material.BRAIN_CORAL_BLOCK, Material.BRAIN_CORAL_FAN, Material.BRAIN_CORAL_WALL_FAN, Material.BUBBLE_CORAL, Material.BUBBLE_CORAL_BLOCK, Material.BUBBLE_CORAL_FAN, Material.BUBBLE_CORAL_WALL_FAN, Material.DEAD_BRAIN_CORAL, Material.DEAD_BRAIN_CORAL_BLOCK, Material.DEAD_BRAIN_CORAL_FAN, Material.DEAD_BRAIN_CORAL_WALL_FAN, Material.DEAD_BUBBLE_CORAL, Material.DEAD_BUBBLE_CORAL_BLOCK, Material.DEAD_BUBBLE_CORAL_FAN, Material.DEAD_BUBBLE_CORAL_WALL_FAN, Material.DEAD_FIRE_CORAL, Material.DEAD_FIRE_CORAL_BLOCK, Material.DEAD_FIRE_CORAL_FAN, Material.DEAD_FIRE_CORAL_WALL_FAN, Material.DEAD_HORN_CORAL, Material.DEAD_HORN_CORAL_BLOCK, Material.DEAD_HORN_CORAL_FAN, Material.DEAD_HORN_CORAL_WALL_FAN, Material.DEAD_TUBE_CORAL, Material.DEAD_TUBE_CORAL_BLOCK, Material.DEAD_TUBE_CORAL_FAN, Material.DEAD_TUBE_CORAL_WALL_FAN, Material.FIRE_CORAL, Material.FIRE_CORAL_BLOCK, Material.FIRE_CORAL_FAN, Material.FIRE_CORAL_WALL_FAN, Material.HORN_CORAL, Material.HORN_CORAL_BLOCK, Material.HORN_CORAL_FAN, Material.HORN_CORAL_WALL_FAN, Material.TUBE_CORAL, Material.TUBE_CORAL_BLOCK, Material.TUBE_CORAL_FAN, Material.TUBE_CORAL_WALL_FAN);
            }

            @NotNull
            @Override
            public NamespacedKey getKey() {
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "coral");
            }
        };
    
        TOOL = new Tag() {

            @Override
            public boolean isTagged(@NotNull Keyed item) {
                return item.equals(Material.BRUSH) || item.equals(Material.DIAMOND_AXE) || item.equals(Material.DIAMOND_HOE) || item.equals(Material.DIAMOND_PICKAXE) || item.equals(Material.DIAMOND_SHOVEL) || item.equals(Material.FISHING_ROD) || item.equals(Material.GOLDEN_AXE) || item.equals(Material.GOLDEN_HOE) || item.equals(Material.GOLDEN_PICKAXE) || item.equals(Material.GOLDEN_SHOVEL) || item.equals(Material.IRON_AXE) || item.equals(Material.IRON_HOE) || item.equals(Material.IRON_PICKAXE) || item.equals(Material.IRON_SHOVEL) || item.equals(Material.NETHERITE_AXE) || item.equals(Material.NETHERITE_HOE) || item.equals(Material.NETHERITE_PICKAXE) || item.equals(Material.NETHERITE_SHOVEL) || item.equals(Material.SHEARS) || item.equals(Material.STONE_AXE) || item.equals(Material.STONE_HOE) || item.equals(Material.STONE_PICKAXE) || item.equals(Material.STONE_SHOVEL) || item.equals(Material.WOODEN_AXE) || item.equals(Material.WOODEN_HOE) || item.equals(Material.WOODEN_PICKAXE) || item.equals(Material.WOODEN_SHOVEL);
            }

            @NotNull
            @Override
            public Set<Material> getValues() {
                return Sets.newHashSet(Material.BRUSH, Material.DIAMOND_AXE, Material.DIAMOND_HOE, Material.DIAMOND_PICKAXE, Material.DIAMOND_SHOVEL, Material.FISHING_ROD, Material.GOLDEN_AXE, Material.GOLDEN_HOE, Material.GOLDEN_PICKAXE, Material.GOLDEN_SHOVEL, Material.IRON_AXE, Material.IRON_HOE, Material.IRON_PICKAXE, Material.IRON_SHOVEL, Material.NETHERITE_AXE, Material.NETHERITE_HOE, Material.NETHERITE_PICKAXE, Material.NETHERITE_SHOVEL, Material.SHEARS, Material.STONE_AXE, Material.STONE_HOE, Material.STONE_PICKAXE, Material.STONE_SHOVEL, Material.WOODEN_AXE, Material.WOODEN_HOE, Material.WOODEN_PICKAXE, Material.WOODEN_SHOVEL);
            }

            @NotNull
            @Override
            public NamespacedKey getKey() {
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "tool");
            }
        };
    
        FUEL = new Tag() {

            @Override
            public boolean isTagged(@NotNull Keyed item) {
                return item.equals(Material.CHARCOAL) || item.equals(Material.COAL) || item.equals(Material.COAL_BLOCK);
            }

            @NotNull
            @Override
            public Set<Material> getValues() {
                return Sets.newHashSet(Material.CHARCOAL, Material.COAL, Material.COAL_BLOCK);
            }

            @NotNull
            @Override
            public NamespacedKey getKey() {
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "fuel");
            }
        };
    
        CLAY = new Tag() {

            @Override
            public boolean isTagged(@NotNull Keyed item) {
                return item.equals(Material.CLAY) || item.equals(Material.CLAY_BALL);
            }

            @NotNull
            @Override
            public Set<Material> getValues() {
                return Sets.newHashSet(Material.CLAY, Material.CLAY_BALL);
            }

            @NotNull
            @Override
            public NamespacedKey getKey() {
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "clay");
            }
        };
    
        DIRT = new Tag() {

            @Override
            public boolean isTagged(@NotNull Keyed item) {
                return item.equals(Material.COARSE_DIRT) || item.equals(Material.DIRT) || item.equals(Material.FARMLAND) || item.equals(Material.MYCELIUM) || item.equals(Material.PODZOL) || item.equals(Material.ROOTED_DIRT);
            }

            @NotNull
            @Override
            public Set<Material> getValues() {
                return Sets.newHashSet(Material.COARSE_DIRT, Material.DIRT, Material.FARMLAND, Material.MYCELIUM, Material.PODZOL, Material.ROOTED_DIRT);
            }

            @NotNull
            @Override
            public NamespacedKey getKey() {
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "dirt");
            }
        };
    
        COBBLESTONE = new Tag() {

            @Override
            public boolean isTagged(@NotNull Keyed item) {
                return item.equals(Material.COBBLED_DEEPSLATE) || item.equals(Material.COBBLESTONE);
            }

            @NotNull
            @Override
            public Set<Material> getValues() {
                return Sets.newHashSet(Material.COBBLED_DEEPSLATE, Material.COBBLESTONE);
            }

            @NotNull
            @Override
            public NamespacedKey getKey() {
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "cobblestone");
            }
        };
    
        SEED = new Tag() {

            @Override
            public boolean isTagged(@NotNull Keyed item) {
                return item.equals(Material.COCOA_BEANS);
            }

            @NotNull
            @Override
            public Set<Material> getValues() {
                return Sets.newHashSet(Material.COCOA_BEANS);
            }

            @NotNull
            @Override
            public NamespacedKey getKey() {
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "seed");
            }
        };
    
        METAL = new Tag() {

            @Override
            public boolean isTagged(@NotNull Keyed item) {
                return item.equals(Material.COPPER_BLOCK) || item.equals(Material.COPPER_BULB) || item.equals(Material.COPPER_DOOR) || item.equals(Material.COPPER_GRATE) || item.equals(Material.COPPER_ORE) || item.equals(Material.COPPER_TRAPDOOR);
            }

            @NotNull
            @Override
            public Set<Material> getValues() {
                return Sets.newHashSet(Material.COPPER_BLOCK, Material.COPPER_BULB, Material.COPPER_DOOR, Material.COPPER_GRATE, Material.COPPER_ORE, Material.COPPER_TRAPDOOR);
            }

            @NotNull
            @Override
            public NamespacedKey getKey() {
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "metal");
            }
        };
    
        INGOT = new Tag() {

            @Override
            public boolean isTagged(@NotNull Keyed item) {
                return item.equals(Material.COPPER_INGOT);
            }

            @NotNull
            @Override
            public Set<Material> getValues() {
                return Sets.newHashSet(Material.COPPER_INGOT);
            }

            @NotNull
            @Override
            public NamespacedKey getKey() {
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "ingot");
            }
        };
    
        HEAD = new Tag() {

            @Override
            public boolean isTagged(@NotNull Keyed item) {
                return item.equals(Material.CREEPER_HEAD) || item.equals(Material.CREEPER_WALL_HEAD) || item.equals(Material.DRAGON_HEAD) || item.equals(Material.DRAGON_WALL_HEAD) || item.equals(Material.PIGLIN_HEAD) || item.equals(Material.PIGLIN_WALL_HEAD) || item.equals(Material.PLAYER_HEAD) || item.equals(Material.PLAYER_WALL_HEAD) || item.equals(Material.SKELETON_SKULL) || item.equals(Material.SKELETON_WALL_SKULL) || item.equals(Material.WITHER_SKELETON_SKULL) || item.equals(Material.WITHER_SKELETON_WALL_SKULL) || item.equals(Material.ZOMBIE_HEAD) || item.equals(Material.ZOMBIE_WALL_HEAD);
            }

            @NotNull
            @Override
            public Set<Material> getValues() {
                return Sets.newHashSet(Material.CREEPER_HEAD, Material.CREEPER_WALL_HEAD, Material.DRAGON_HEAD, Material.DRAGON_WALL_HEAD, Material.PIGLIN_HEAD, Material.PIGLIN_WALL_HEAD, Material.PLAYER_HEAD, Material.PLAYER_WALL_HEAD, Material.SKELETON_SKULL, Material.SKELETON_WALL_SKULL, Material.WITHER_SKELETON_SKULL, Material.WITHER_SKELETON_WALL_SKULL, Material.ZOMBIE_HEAD, Material.ZOMBIE_WALL_HEAD);
            }

            @NotNull
            @Override
            public NamespacedKey getKey() {
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "head");
            }
        };
    
        DIAMOND = new Tag() {

            @Override
            public boolean isTagged(@NotNull Keyed item) {
                return item.equals(Material.DIAMOND) || item.equals(Material.DIAMOND_BLOCK);
            }

            @NotNull
            @Override
            public Set<Material> getValues() {
                return Sets.newHashSet(Material.DIAMOND, Material.DIAMOND_BLOCK);
            }

            @NotNull
            @Override
            public NamespacedKey getKey() {
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "diamond");
            }
        };
    
        MUSIC = new Tag() {

            @Override
            public boolean isTagged(@NotNull Keyed item) {
                return item.equals(Material.DISC_FRAGMENT_5) || item.equals(Material.MUSIC_DISC_11) || item.equals(Material.MUSIC_DISC_13) || item.equals(Material.MUSIC_DISC_5) || item.equals(Material.MUSIC_DISC_BLOCKS) || item.equals(Material.MUSIC_DISC_CAT) || item.equals(Material.MUSIC_DISC_CHIRP) || item.equals(Material.MUSIC_DISC_FAR) || item.equals(Material.MUSIC_DISC_MALL) || item.equals(Material.MUSIC_DISC_MELLOHI) || item.equals(Material.MUSIC_DISC_OTHERSIDE) || item.equals(Material.MUSIC_DISC_PIGSTEP) || item.equals(Material.MUSIC_DISC_RELIC) || item.equals(Material.MUSIC_DISC_STAL) || item.equals(Material.MUSIC_DISC_STRAD) || item.equals(Material.MUSIC_DISC_WAIT) || item.equals(Material.MUSIC_DISC_WARD) || item.equals(Material.NOTE_BLOCK);
            }

            @NotNull
            @Override
            public Set<Material> getValues() {
                return Sets.newHashSet(Material.DISC_FRAGMENT_5, Material.MUSIC_DISC_11, Material.MUSIC_DISC_13, Material.MUSIC_DISC_5, Material.MUSIC_DISC_BLOCKS, Material.MUSIC_DISC_CAT, Material.MUSIC_DISC_CHIRP, Material.MUSIC_DISC_FAR, Material.MUSIC_DISC_MALL, Material.MUSIC_DISC_MELLOHI, Material.MUSIC_DISC_OTHERSIDE, Material.MUSIC_DISC_PIGSTEP, Material.MUSIC_DISC_RELIC, Material.MUSIC_DISC_STAL, Material.MUSIC_DISC_STRAD, Material.MUSIC_DISC_WAIT, Material.MUSIC_DISC_WARD, Material.NOTE_BLOCK);
            }

            @NotNull
            @Override
            public NamespacedKey getKey() {
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "music");
            }
        };
    
        GEMS = new Tag() {

            @Override
            public boolean isTagged(@NotNull Keyed item) {
                return item.equals(Material.EMERALD) || item.equals(Material.EMERALD_BLOCK);
            }

            @NotNull
            @Override
            public Set<Material> getValues() {
                return Sets.newHashSet(Material.EMERALD, Material.EMERALD_BLOCK);
            }

            @NotNull
            @Override
            public NamespacedKey getKey() {
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "gems");
            }
        };
    
        ENCHANTING = new Tag() {

            @Override
            public boolean isTagged(@NotNull Keyed item) {
                return item.equals(Material.ENCHANTED_BOOK);
            }

            @NotNull
            @Override
            public Set<Material> getValues() {
                return Sets.newHashSet(Material.ENCHANTED_BOOK);
            }

            @NotNull
            @Override
            public NamespacedKey getKey() {
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "enchanting");
            }
        };
    
        MAP = new Tag() {

            @Override
            public boolean isTagged(@NotNull Keyed item) {
                return item.equals(Material.FILLED_MAP) || item.equals(Material.MAP);
            }

            @NotNull
            @Override
            public Set<Material> getValues() {
                return Sets.newHashSet(Material.FILLED_MAP, Material.MAP);
            }

            @NotNull
            @Override
            public NamespacedKey getKey() {
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "map");
            }
        };
    
        MISC = new Tag() {

            @Override
            public boolean isTagged(@NotNull Keyed item) {
                return item.equals(Material.FIREWORK_ROCKET) || item.equals(Material.FIREWORK_STAR);
            }

            @NotNull
            @Override
            public Set<Material> getValues() {
                return Sets.newHashSet(Material.FIREWORK_ROCKET, Material.FIREWORK_STAR);
            }

            @NotNull
            @Override
            public NamespacedKey getKey() {
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "misc");
            }
        };
    
        FLINT = new Tag() {

            @Override
            public boolean isTagged(@NotNull Keyed item) {
                return item.equals(Material.FLINT);
            }

            @NotNull
            @Override
            public Set<Material> getValues() {
                return Sets.newHashSet(Material.FLINT);
            }

            @NotNull
            @Override
            public NamespacedKey getKey() {
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "flint");
            }
        };
    
        GLOWSTONE = new Tag() {

            @Override
            public boolean isTagged(@NotNull Keyed item) {
                return item.equals(Material.GLOWSTONE) || item.equals(Material.GLOWSTONE_DUST);
            }

            @NotNull
            @Override
            public Set<Material> getValues() {
                return Sets.newHashSet(Material.GLOWSTONE, Material.GLOWSTONE_DUST);
            }

            @NotNull
            @Override
            public NamespacedKey getKey() {
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "glowstone");
            }
        };
    
        GOLD = new Tag() {

            @Override
            public boolean isTagged(@NotNull Keyed item) {
                return item.equals(Material.GOLD_BLOCK) || item.equals(Material.GOLD_INGOT) || item.equals(Material.GOLD_NUGGET);
            }

            @NotNull
            @Override
            public Set<Material> getValues() {
                return Sets.newHashSet(Material.GOLD_BLOCK, Material.GOLD_INGOT, Material.GOLD_NUGGET);
            }

            @NotNull
            @Override
            public NamespacedKey getKey() {
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "gold");
            }
        };
    
        IRON = new Tag() {

            @Override
            public boolean isTagged(@NotNull Keyed item) {
                return item.equals(Material.IRON_BLOCK) || item.equals(Material.IRON_INGOT) || item.equals(Material.IRON_NUGGET);
            }

            @NotNull
            @Override
            public Set<Material> getValues() {
                return Sets.newHashSet(Material.IRON_BLOCK, Material.IRON_INGOT, Material.IRON_NUGGET);
            }

            @NotNull
            @Override
            public NamespacedKey getKey() {
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "iron");
            }
        };
    
        DOOR = new Tag() {

            @Override
            public boolean isTagged(@NotNull Keyed item) {
                return item.equals(Material.IRON_DOOR);
            }

            @NotNull
            @Override
            public Set<Material> getValues() {
                return Sets.newHashSet(Material.IRON_DOOR);
            }

            @NotNull
            @Override
            public NamespacedKey getKey() {
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "door");
            }
        };
    
        LAPIS = new Tag() {

            @Override
            public boolean isTagged(@NotNull Keyed item) {
                return item.equals(Material.LAPIS_BLOCK) || item.equals(Material.LAPIS_LAZULI);
            }

            @NotNull
            @Override
            public Set<Material> getValues() {
                return Sets.newHashSet(Material.LAPIS_BLOCK, Material.LAPIS_LAZULI);
            }

            @NotNull
            @Override
            public NamespacedKey getKey() {
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "lapis");
            }
        };
    
        LEATHER = new Tag() {

            @Override
            public boolean isTagged(@NotNull Keyed item) {
                return item.equals(Material.LEATHER) || item.equals(Material.LEATHER_HORSE_ARMOR) || item.equals(Material.RABBIT_HIDE);
            }

            @NotNull
            @Override
            public Set<Material> getValues() {
                return Sets.newHashSet(Material.LEATHER, Material.LEATHER_HORSE_ARMOR, Material.RABBIT_HIDE);
            }

            @NotNull
            @Override
            public NamespacedKey getKey() {
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "leather");
            }
        };
    
        POTION = new Tag() {

            @Override
            public boolean isTagged(@NotNull Keyed item) {
                return item.equals(Material.LINGERING_POTION) || item.equals(Material.OMINOUS_BOTTLE) || item.equals(Material.POTION) || item.equals(Material.RABBIT_FOOT) || item.equals(Material.SPLASH_POTION);
            }

            @NotNull
            @Override
            public Set<Material> getValues() {
                return Sets.newHashSet(Material.LINGERING_POTION, Material.OMINOUS_BOTTLE, Material.POTION, Material.RABBIT_FOOT, Material.SPLASH_POTION);
            }

            @NotNull
            @Override
            public NamespacedKey getKey() {
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "potion");
            }
        };
    
        NETHERITE = new Tag() {

            @Override
            public boolean isTagged(@NotNull Keyed item) {
                return item.equals(Material.NETHERITE_INGOT) || item.equals(Material.NETHERITE_SCRAP);
            }

            @NotNull
            @Override
            public Set<Material> getValues() {
                return Sets.newHashSet(Material.NETHERITE_INGOT, Material.NETHERITE_SCRAP);
            }

            @NotNull
            @Override
            public NamespacedKey getKey() {
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "netherite");
            }
        };
    
        JUNK = new Tag() {

            @Override
            public boolean isTagged(@NotNull Keyed item) {
                return item.equals(Material.POISONOUS_POTATO);
            }

            @NotNull
            @Override
            public Set<Material> getValues() {
                return Sets.newHashSet(Material.POISONOUS_POTATO);
            }

            @NotNull
            @Override
            public NamespacedKey getKey() {
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "junk");
            }
        };
    
        QUARTZ = new Tag() {

            @Override
            public boolean isTagged(@NotNull Keyed item) {
                return item.equals(Material.QUARTZ);
            }

            @NotNull
            @Override
            public Set<Material> getValues() {
                return Sets.newHashSet(Material.QUARTZ);
            }

            @NotNull
            @Override
            public NamespacedKey getKey() {
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "quartz");
            }
        };
    
        SAND = new Tag() {

            @Override
            public boolean isTagged(@NotNull Keyed item) {
                return item.equals(Material.SAND);
            }

            @NotNull
            @Override
            public Set<Material> getValues() {
                return Sets.newHashSet(Material.SAND);
            }

            @NotNull
            @Override
            public NamespacedKey getKey() {
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "sand");
            }
        };
    
        TORCH = new Tag() {

            @Override
            public boolean isTagged(@NotNull Keyed item) {
                return item.equals(Material.SOUL_TORCH) || item.equals(Material.SOUL_WALL_TORCH) || item.equals(Material.TORCH) || item.equals(Material.WALL_TORCH);
            }

            @NotNull
            @Override
            public Set<Material> getValues() {
                return Sets.newHashSet(Material.SOUL_TORCH, Material.SOUL_WALL_TORCH, Material.TORCH, Material.WALL_TORCH);
            }

            @NotNull
            @Override
            public NamespacedKey getKey() {
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "torch");
            }
        };
    
    }
}
