package net.ayoubmrz.obamiummod.item;

import net.ayoubmrz.obamiummod.ObamiumMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item OBAMIUM_INGOT = registerItem("obamium_ingot", new Item(new Item.Settings()));
    public static final Item RAW_OBAMIUM = registerItem("raw_obamium", new Item(new Item.Settings()));

    public static final Item OBAMIUM_SWORD = registerItem("obamium_sword",
            new SwordItem(ModToolMaterials.OBAMIUM, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.OBAMIUM, 3, -2f))));
    public static final Item OBAMIUM_PICKAXE = registerItem("obamium_pickaxe",
            new PickaxeItem(ModToolMaterials.OBAMIUM, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.OBAMIUM, 1, -2.8f))));
    public static final Item OBAMIUM_SHOVEL = registerItem("obamium_shovel",
            new ShovelItem(ModToolMaterials.OBAMIUM, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.OBAMIUM, 1.5f, -3.0f))));
    public static final Item OBAMIUM_AXE = registerItem("obamium_axe",
            new AxeItem(ModToolMaterials.OBAMIUM, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.OBAMIUM, 6, -2.8f))));
    public static final Item OBAMIUM_HOE = registerItem("obamium_hoe",
            new HoeItem(ModToolMaterials.OBAMIUM, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.OBAMIUM, 0, -3f))));

    public static final Item OBAMIUM_HELMET = registerItem("obamium_helmet",
            new ArmorItem(ModArmorMaterials.OBAMIUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(45))));
    public static final Item OBAMIUM_CHESTPLATE = registerItem("obamium_chestplate",
            new ArmorItem(ModArmorMaterials.OBAMIUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(45))));
    public static final Item OBAMIUM_LEGGINGS = registerItem("obamium_leggings",
            new ArmorItem(ModArmorMaterials.OBAMIUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(45))));
    public static final Item OBAMIUM_BOOTS = registerItem("obamium_boots",
            new ArmorItem(ModArmorMaterials.OBAMIUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(45))));

    public static final Item OBAMIUM_HORSE_ARMOR = registerItem("obamium_horse_armor",
            new AnimalArmorItem(ModArmorMaterials.OBAMIUM_ARMOR_MATERIAL, AnimalArmorItem.Type.EQUESTRIAN, false, new Item.Settings().maxCount(1)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ObamiumMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ObamiumMod.LOGGER.info("Registering Mod Items for " + ObamiumMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(OBAMIUM_INGOT);
            entries.add(RAW_OBAMIUM);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(OBAMIUM_SWORD);
            entries.add(OBAMIUM_AXE);
            entries.add(OBAMIUM_HELMET);
            entries.add(OBAMIUM_CHESTPLATE);
            entries.add(OBAMIUM_LEGGINGS);
            entries.add(OBAMIUM_BOOTS);
            entries.add(OBAMIUM_HORSE_ARMOR);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(OBAMIUM_PICKAXE);
            entries.add(OBAMIUM_SHOVEL);
            entries.add(OBAMIUM_AXE);
            entries.add(OBAMIUM_HOE);
        });
    }
}
