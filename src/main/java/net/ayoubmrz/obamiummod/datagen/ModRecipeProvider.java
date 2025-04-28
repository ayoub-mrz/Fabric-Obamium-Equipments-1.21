package net.ayoubmrz.obamiummod.datagen;

import net.ayoubmrz.obamiummod.block.ModBlocks;
import net.ayoubmrz.obamiummod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        List<ItemConvertible> OBAMIUM_SMELTABLES = List.of(ModItems.RAW_OBAMIUM, ModBlocks.OBAMIUM_ORE,
                ModBlocks.OBAMIUM_DEEPSLATE_ORE);

        offerSmelting(exporter, OBAMIUM_SMELTABLES, RecipeCategory.MISC, ModItems.OBAMIUM_INGOT, 0.25f, 200, "obamium_ingot");
        offerBlasting(exporter, OBAMIUM_SMELTABLES, RecipeCategory.MISC, ModItems.OBAMIUM_INGOT, 0.25f, 100, "obamium_ingot");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS,
                ModItems.OBAMIUM_INGOT, RecipeCategory.DECORATIONS, ModBlocks.OBAMIUM_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS,
                ModItems.RAW_OBAMIUM, RecipeCategory.DECORATIONS, ModBlocks.RAW_OBAMIUM_BLOCK);

        // Sword Recipe
        shapedRecipe(exporter, ModItems.OBAMIUM_SWORD, RecipeCategory.MISC,
                new String[]{" R ", " R ", " S "},
                'R', ModItems.OBAMIUM_INGOT,
                'S', Items.STICK);

        // Shovel Recipe
        shapedRecipe(exporter, ModItems.OBAMIUM_SHOVEL, RecipeCategory.MISC,
                new String[]{" R ", " S ", " S "},
                'R', ModItems.OBAMIUM_INGOT,
                'S', Items.STICK);

        // Axe Recipe
        shapedRecipe(exporter, ModItems.OBAMIUM_AXE, RecipeCategory.MISC,
                new String[]{" RR", " SR", " S "},
                'R', ModItems.OBAMIUM_INGOT,
                'S', Items.STICK);

        // Pickaxe Recipe
        shapedRecipe(exporter, ModItems.OBAMIUM_PICKAXE, RecipeCategory.MISC,
                new String[]{"RRR", " S ", " S "},
                'R', ModItems.OBAMIUM_INGOT,
                'S', Items.STICK);

        // Hoe Recipe
        shapedRecipe(exporter, ModItems.OBAMIUM_HOE, RecipeCategory.MISC,
                new String[]{" RR", " S ", " S "},
                'R', ModItems.OBAMIUM_INGOT,
                'S', Items.STICK);

        // Helmet Recipe
        shapedRecipe(exporter, ModItems.OBAMIUM_HELMET, RecipeCategory.MISC,
                new String[]{"RRR", "R R", "   "},
                'R', ModItems.OBAMIUM_INGOT);

        // Chestplate Recipe
        shapedRecipe(exporter, ModItems.OBAMIUM_CHESTPLATE, RecipeCategory.MISC,
                new String[]{"R R", "RRR", "RRR"},
                'R', ModItems.OBAMIUM_INGOT);

        // leggings Recipe
        shapedRecipe(exporter, ModItems.OBAMIUM_LEGGINGS, RecipeCategory.MISC,
                new String[]{"RRR", "R R", "R R"},
                'R', ModItems.OBAMIUM_INGOT);

        // Boots Recipe
        shapedRecipe(exporter, ModItems.OBAMIUM_BOOTS, RecipeCategory.MISC,
                new String[]{"R R", "R R", "   "},
                'R', ModItems.OBAMIUM_INGOT);

        // Horse Armor Recipe
        shapedRecipe(exporter, ModItems.OBAMIUM_HORSE_ARMOR, RecipeCategory.MISC,
                new String[]{" R ", "RHR", " J "},
                'R', ModItems.OBAMIUM_INGOT,
                'H', Items.DIAMOND_HORSE_ARMOR,
                'J', ModBlocks.OBAMIUM_BLOCK);




    }
    private void shapedRecipe(RecipeExporter exporter, ItemConvertible output, RecipeCategory category,
                              String[] pattern, Object... inputs) {
        var builder = ShapedRecipeJsonBuilder.create(category, output);
        for (String line : pattern) builder.pattern(line);
        for (int i = 0; i < inputs.length; i += 2)
            builder.input((Character)inputs[i], (ItemConvertible)inputs[i+1]);
        builder.criterion(hasItem(output), conditionsFromItem(output)).offerTo(exporter);
    }
}
