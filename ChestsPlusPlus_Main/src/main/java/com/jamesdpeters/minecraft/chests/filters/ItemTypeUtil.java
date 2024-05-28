package com.jamesdpeters.minecraft.chests.filters;

import org.bukkit.Material;
import org.bukkit.Tag;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class ItemTypeUtil {

    private static final List<Tag<Material>> tags;

    static {
        tags = new ArrayList<>();
        tags.add(ChestsPlusPlusTag.WOOD_MATERIAL); 
        tags.add(ChestsPlusPlusTag.REDSTONE); 
        tags.add(ChestsPlusPlusTag.PLANT); 
        tags.add(ChestsPlusPlusTag.RAW_WOOD); 
        tags.add(ChestsPlusPlusTag.SAPLING); 
        tags.add(ChestsPlusPlusTag.NONE); 
        tags.add(ChestsPlusPlusTag.SPAWN_EGG); 
        tags.add(ChestsPlusPlusTag.GEM); 
        tags.add(ChestsPlusPlusTag.ORE); 
        tags.add(ChestsPlusPlusTag.DECORATIVE_BLOCK); 
        tags.add(ChestsPlusPlusTag.DECORATION); 
        tags.add(ChestsPlusPlusTag.UTILITY); 
        tags.add(ChestsPlusPlusTag.FOOD); 
        tags.add(ChestsPlusPlusTag.ARMOR); 
        tags.add(ChestsPlusPlusTag.ARROW); 
        tags.add(ChestsPlusPlusTag.BUCKET_MOB); 
        tags.add(ChestsPlusPlusTag.COOKED_FOOD); 
        tags.add(ChestsPlusPlusTag.STORAGE); 
        tags.add(ChestsPlusPlusTag.MOB_BLOCK); 
        tags.add(ChestsPlusPlusTag.RAW_FOOD); 
        tags.add(ChestsPlusPlusTag.BED); 
        tags.add(ChestsPlusPlusTag.WOOL); 
        tags.add(ChestsPlusPlusTag.DYE); 
        tags.add(ChestsPlusPlusTag.GLASS); 
        tags.add(ChestsPlusPlusTag.MOB_DROP); 
        tags.add(ChestsPlusPlusTag.ICE); 
        tags.add(ChestsPlusPlusTag.SMITHING); 
        tags.add(ChestsPlusPlusTag.BOOK); 
        tags.add(ChestsPlusPlusTag.WEAPON); 
        tags.add(ChestsPlusPlusTag.CORAL); 
        tags.add(ChestsPlusPlusTag.TOOL); 
        tags.add(ChestsPlusPlusTag.FUEL); 
        tags.add(ChestsPlusPlusTag.CLAY); 
        tags.add(ChestsPlusPlusTag.DIRT); 
        tags.add(ChestsPlusPlusTag.COBBLESTONE); 
        tags.add(ChestsPlusPlusTag.SEED); 
        tags.add(ChestsPlusPlusTag.METAL); 
        tags.add(ChestsPlusPlusTag.INGOT); 
        tags.add(ChestsPlusPlusTag.HEAD); 
        tags.add(ChestsPlusPlusTag.DIAMOND); 
        tags.add(ChestsPlusPlusTag.MUSIC); 
        tags.add(ChestsPlusPlusTag.GEMS); 
        tags.add(ChestsPlusPlusTag.ENCHANTING); 
        tags.add(ChestsPlusPlusTag.MAP); 
        tags.add(ChestsPlusPlusTag.MISC); 
        tags.add(ChestsPlusPlusTag.FLINT); 
        tags.add(ChestsPlusPlusTag.GLOWSTONE); 
        tags.add(ChestsPlusPlusTag.GOLD); 
        tags.add(ChestsPlusPlusTag.IRON); 
        tags.add(ChestsPlusPlusTag.DOOR); 
        tags.add(ChestsPlusPlusTag.LAPIS); 
        tags.add(ChestsPlusPlusTag.LEATHER); 
        tags.add(ChestsPlusPlusTag.POTION); 
        tags.add(ChestsPlusPlusTag.NETHERITE); 
        tags.add(ChestsPlusPlusTag.JUNK); 
        tags.add(ChestsPlusPlusTag.QUARTZ); 
        tags.add(ChestsPlusPlusTag.SAND); 
        tags.add(ChestsPlusPlusTag.TORCH); 

        tags.add(ChestsPlusPlusTag.SEEDS);
        tags.add(Tag.WOOL);
        tags.add(Tag.PLANKS);
        tags.add(Tag.STONE_BRICKS);
        tags.add(Tag.WOODEN_BUTTONS);
        tags.add(Tag.BUTTONS);
        tags.add(Tag.CARPETS);
        tags.add(Tag.WOODEN_DOORS);
        tags.add(Tag.WOODEN_STAIRS);
        tags.add(Tag.WOODEN_SLABS);
        tags.add(Tag.WOODEN_FENCES);
        tags.add(Tag.WOODEN_PRESSURE_PLATES);
        tags.add(Tag.WOODEN_TRAPDOORS);
        tags.add(Tag.DOORS);
        tags.add(Tag.SAPLINGS);
        tags.add(Tag.LOGS);
        tags.add(Tag.DARK_OAK_LOGS);
        tags.add(Tag.OAK_LOGS);
        tags.add(Tag.BIRCH_LOGS);
        tags.add(Tag.ACACIA_LOGS);
        tags.add(Tag.JUNGLE_LOGS);
        tags.add(Tag.SPRUCE_LOGS);
        tags.add(Tag.BANNERS);
        tags.add(Tag.SAND);
        tags.add(Tag.STAIRS);
        tags.add(Tag.SLABS);
        tags.add(Tag.WALLS);
        tags.add(Tag.ANVIL);
        tags.add(Tag.RAILS);
        tags.add(Tag.LEAVES);
        tags.add(Tag.TRAPDOORS);
        tags.add(Tag.FLOWER_POTS);
        tags.add(Tag.SMALL_FLOWERS);
        tags.add(Tag.BEDS);
        tags.add(Tag.FENCES);
        tags.add(Tag.ICE);
        tags.add(Tag.CORAL_BLOCKS);
        tags.add(Tag.WALL_CORALS);
        tags.add(Tag.CORAL_PLANTS);
        tags.add(Tag.SIGNS);
        tags.add(Tag.ITEMS_BANNERS);
        tags.add(Tag.ITEMS_BOATS);
        tags.add(Tag.ITEMS_FISHES);
        tags.add(Tag.ITEMS_MUSIC_DISCS);
        tags.add(Tag.ITEMS_COALS);
        tags.add(Tag.ITEMS_ARROWS);
    }

    public static boolean isSimilarTag(ItemStack is1, ItemStack is2){
        for (Tag<Material> tag : tags) {
            if (tag.isTagged(is1.getType()) && tag.isTagged(is2.getType())) return true;
        }
        return false;
    }
}
