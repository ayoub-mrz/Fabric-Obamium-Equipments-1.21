package net.ayoubmrz.obamiummod.datagen;

import net.ayoubmrz.obamiummod.block.ModBlocks;
import net.ayoubmrz.obamiummod.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.OBAMIUM_BLOCK)
                .add(ModBlocks.RAW_OBAMIUM_BLOCK)
                .add(ModBlocks.OBAMIUM_ORE)
                .add(ModBlocks.OBAMIUM_DEEPSLATE_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.OBAMIUM_BLOCK)
                .add(ModBlocks.RAW_OBAMIUM_BLOCK)
                .add(ModBlocks.OBAMIUM_ORE)
                .add(ModBlocks.OBAMIUM_DEEPSLATE_ORE);

    }
}
