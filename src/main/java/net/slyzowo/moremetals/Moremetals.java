package net.slyzowo.moremetals;

import net.fabricmc.api.ModInitializer;

import net.slyzowo.moremetals.blocks.ModBlocks;
import net.slyzowo.moremetals.item.ModItemGroups;
import net.slyzowo.moremetals.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Moremetals implements ModInitializer {
	public static final String MOD_ID = "moremetals";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();
	}
}