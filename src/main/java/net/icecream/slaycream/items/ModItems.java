package net.icecream.slaycream.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.icecream.slaycream.SlayCream;
import net.icecream.slaycream.sounds.ModSounds;
import net.minecraft.item.Item;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item THE_CORE_MUSIC_DISC = registerItem("the_core_music_disc" ,
            new MusicDiscItem(6, ModSounds.THE_CORE, new FabricItemSettings().maxCount(1).group(ModItemGroup.ICECREAMS_TRINKETS), 258));
    public static final Item BIG_CHUNGUS = registerItem("big_chungus" ,
            new Item(new FabricItemSettings().group(ModItemGroup.ICECREAMS_TRINKETS)));


private static Item registerItem(String name, Item item) {
    return Registry.register(Registry.ITEM, new Identifier(SlayCream.MOD_ID, name), item);
}

    public static void registerModItems() {
        SlayCream.LOGGER.debug("Registering Mod Items for" + SlayCream.MOD_ID);
    }
}
