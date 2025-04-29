package net.icecream.slaycream.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.icecream.slaycream.items.ModItems;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public abstract class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataGenerator output) {super(output); }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.THE_CORE_MUSIC_DISC, Models.GENERATED);
    }
}
