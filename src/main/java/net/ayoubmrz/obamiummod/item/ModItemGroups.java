package net.ayoubmrz.obamiummod.item;

import net.ayoubmrz.obamiummod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.ayoubmrz.obamiummod.ObamiumMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup OBAMIUM_EQUIPMENTS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ObamiumMod.MOD_ID, "obamium_equipments"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.OBAMIUM_INGOT))
                    .displayName(Text.translatable("itemgroup.obamiummod.obamium_equipments"))
                    .entries((displayContext, entries) -> {

                        entries.add(ModItems.OBAMIUM_INGOT);
                        entries.add(ModItems.RAW_OBAMIUM);

                        entries.add(ModBlocks.OBAMIUM_BLOCK);
                        entries.add(ModBlocks.RAW_OBAMIUM_BLOCK);
                        entries.add(ModBlocks.OBAMIUM_ORE);
                        entries.add(ModBlocks.OBAMIUM_DEEPSLATE_ORE);

                        entries.add(ModItems.OBAMIUM_SWORD);
                        entries.add(ModItems.OBAMIUM_PICKAXE);
                        entries.add(ModItems.OBAMIUM_SHOVEL);
                        entries.add(ModItems.OBAMIUM_AXE);
                        entries.add(ModItems.OBAMIUM_HOE);

                        entries.add(ModItems.OBAMIUM_HELMET);
                        entries.add(ModItems.OBAMIUM_CHESTPLATE);
                        entries.add(ModItems.OBAMIUM_LEGGINGS);
                        entries.add(ModItems.OBAMIUM_BOOTS);

                        entries.add(ModItems.OBAMIUM_HORSE_ARMOR);

                    }).build());

    public static void registerItemGroups() {
        ObamiumMod.LOGGER.info("Registering Item Groups for " + ObamiumMod.MOD_ID);
    }
}

