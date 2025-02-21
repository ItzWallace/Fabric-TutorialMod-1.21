package com.wallace.tutorialmod;

import com.wallace.tutorialmod.item.ModItemGroups;
import com.wallace.tutorialmod.item.ModItems;
import net.fabricmc.api.ModInitializer;
import com.wallace.tutorialmod.block.ModBlocks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();

		//Registers Modded items when game is launched
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}