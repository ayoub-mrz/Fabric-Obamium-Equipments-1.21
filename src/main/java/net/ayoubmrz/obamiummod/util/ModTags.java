package net.ayoubmrz.obamiummod.util;

import net.ayoubmrz.obamiummod.ObamiumMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_OBAMIUM_TOOL = createTag("needs_obamium_tool");
        public static final TagKey<Block> INCORRECT_FOR_OBAMIUM_TOOL = createTag("incorrect_for_obamium_tool");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(ObamiumMod.MOD_ID, name));
        }
    }

    public static class Items {

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(ObamiumMod.MOD_ID, name));
        }
    }
}
