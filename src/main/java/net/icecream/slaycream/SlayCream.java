package net.icecream.slaycream;
// I am literally making this in order to add a song into game...
import net.fabricmc.api.ModInitializer;
import net.icecream.slaycream.items.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SlayCream implements ModInitializer {
	public static final String MOD_ID = "slaycream";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {


		ModItems.registerModItems();
	}
}
