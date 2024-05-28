import os
import csv


material_struct = {
    "item": 0,
    "category": 1
}

plugin_path = os.environ["CLONE_LOCATION"]
tag_path = os.environ["TAG_PATH"]
item_path = os.environ["ITEM_TYPE_PATH"]
materials_path = os.environ["MATERIALS_PATH"]


def read_materials(csv_path):
    is_first_row = True
    parsed_obj = {}
    with open(csv_path, newline='') as csvfile:
        file_reader = csv.reader(csvfile, delimiter=',', quotechar='|', )
        for row in file_reader:
            if is_first_row:
                is_first_row = False
                continue
            category = row[material_struct["category"]]
            item = row[material_struct["item"]]
            if not category in parsed_obj:
                parsed_obj[category] = []
            parsed_obj[category].append(item)
    return parsed_obj


def generate_section(category_name, materials):

    tag_string = "return item.equals("
    or_sequence = " || "
    for item in materials[category_name]:
        tag_string += "Material." + item + or_sequence
    tag_string.split(or_sequence)
    tag_string = tag_string[:-len(or_sequence)]
    tag_string += ")"

    values_string = "return Sets.newHashSet("
    or_sequence = ", "
    for item in materials[category_name]:
        values_string += "Material." + item + or_sequence
    values_string.split(or_sequence)
    values_string = values_string[:-len(or_sequence)]
    values_string += ")"

    namespaced_key = category_name.lower()

    tag_category = """
        {category_name} = new Tag() {{

            @Override
            public boolean isTagged(@NotNull Keyed item) {{
                {tag_string}
            }}

            @NotNull
            @Override
            public Set<Material> getValues() {{
                {values_string}
            }}

            @NotNull
            @Override
            public NamespacedKey getKey() {{
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, {namespaced_key});
            }}
        }};
    """.format(category_name=category_name, tag_string=tag_string, values_string=values_string, namespaced_key=namespaced_key)
    return tag_category


def generate_registration(category):
    return """        tags.add(ChestsPlusPlusTag.{category}); \n""".format(category=category.upper())


def generate_tag_template_static(category):
    return """    public static Tag {category}; \n""".format(category=category.upper())


def get_java_strings():
    section_injection_string = ""
    section_static_string = ""
    material_injection_string = ""

    materials = read_materials(materials_path)
    for category in materials:
        section = generate_section(category, materials)
        register_section = generate_registration(category)
        section_static = generate_tag_template_static(category)
        section_injection_string += section
        material_injection_string += register_section
        section_static_string += section_static
    return [section_injection_string, section_static_string, material_injection_string]


def gen_tag_java(tag_template, tag_static):
    template = """package com.jamesdpeters.minecraft.chests.filters;

import com.google.common.collect.Sets;
import com.jamesdpeters.minecraft.chests.ChestsPlusPlus;
import org.bukkit.Keyed;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.Tag;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

@SuppressWarnings("rawtypes")
public class ChestsPlusPlusTag {{

    public static Tag SEEDS;
{tag_static}
    static {{
        SEEDS = new Tag() {{

            @Override
            public boolean isTagged(@NotNull Keyed item) {{
                return item.equals(Material.WHEAT_SEEDS) || item.equals(Material.PUMPKIN_SEEDS) || item.equals(Material.MELON_SEEDS) || item.equals(Material.BEETROOT_SEEDS);
            }}

            @NotNull
            @Override
            public Set<Material> getValues() {{
                return Sets.newHashSet(Material.WHEAT_SEEDS, Material.PUMPKIN_SEEDS, Material.MELON_SEEDS, Material.BEETROOT_SEEDS);
            }}

            @NotNull
            @Override
            public NamespacedKey getKey() {{
                return new NamespacedKey(ChestsPlusPlus.PLUGIN, "seeds");
            }}
        }};
        {tag_template}
    }}
}}
""".format(tag_static=tag_static, tag_template=tag_template)
    return template


def gen_item_java(material_string):
    template = """package com.jamesdpeters.minecraft.chests.filters;

import org.bukkit.Material;
import org.bukkit.Tag;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class ItemTypeUtil {{

    private static final List<Tag<Material>> tags;

    static {{
        tags = new ArrayList<>();
{material_string}
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
    }}

    public static boolean isSimilarTag(ItemStack is1, ItemStack is2){{
        for (Tag<Material> tag : tags) {{
            if (tag.isTagged(is1.getType()) && tag.isTagged(is2.getType())) return true;
        }}
        return false;
    }}
}}
""".format(material_string=material_string)
    return template

java_strings = get_java_strings()

tag_java = gen_tag_java(java_strings[0], java_strings[1])
item_java = gen_item_java(java_strings[2])

ft = open(plugin_path + "/" + tag_path, "w")
ft.write(tag_java)
ft.close()

print(plugin_path + "/" + item_path)

fi = open(plugin_path + "/" + item_path, "w")
fi.write(item_java)
fi.close()