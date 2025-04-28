package net.ayoubmrz.obamiummod.datagen;

import net.ayoubmrz.obamiummod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.OBAMIUM_SWORD);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.OBAMIUM_PICKAXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.OBAMIUM_SHOVEL);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.OBAMIUM_AXE);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.OBAMIUM_HOE);

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.OBAMIUM_HELMET)
                .add(ModItems.OBAMIUM_CHESTPLATE)
                .add(ModItems.OBAMIUM_LEGGINGS)
                .add(ModItems.OBAMIUM_BOOTS);
        
    }
}
