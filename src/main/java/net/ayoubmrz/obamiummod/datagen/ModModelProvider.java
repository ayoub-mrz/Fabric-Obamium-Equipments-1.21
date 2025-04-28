package net.ayoubmrz.obamiummod.datagen;

import net.ayoubmrz.obamiummod.block.ModBlocks;
import net.ayoubmrz.obamiummod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.OBAMIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_OBAMIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.OBAMIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.OBAMIUM_DEEPSLATE_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.OBAMIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_OBAMIUM, Models.GENERATED);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.OBAMIUM_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.OBAMIUM_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.OBAMIUM_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.OBAMIUM_BOOTS));

        itemModelGenerator.register(ModItems.OBAMIUM_HORSE_ARMOR, Models.GENERATED);

    }
}
