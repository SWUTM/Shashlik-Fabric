package net.swutm.shashlik;

import net.fabricmc.api.ModInitializer;
import net.swutm.shashlik.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class shashlik implements ModInitializer {
	public  static final String MOD_ID = "shashlik";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();

	}
}
