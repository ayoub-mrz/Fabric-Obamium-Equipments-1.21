package net.ayoubmrz.obamiummod;

import net.ayoubmrz.obamiummod.block.ModBlocks;
import net.ayoubmrz.obamiummod.item.ModItemGroups;
import net.ayoubmrz.obamiummod.item.ModItems;
import net.ayoubmrz.obamiummod.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ObamiumMod implements ModInitializer {
	public static final String MOD_ID = "obamiummod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();

		ModWorldGeneration.generateModWorldGen();

	}
}