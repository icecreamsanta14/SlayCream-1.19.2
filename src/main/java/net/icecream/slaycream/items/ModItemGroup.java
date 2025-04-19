package net.icecream.slaycream.items;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.icecream.slaycream.SlayCream;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup ICECREAMS_TRINKETS = FabricItemGroupBuilder.build(
            new Identifier(SlayCream.MOD_ID, "icecreams_trinkets"), () -> new ItemStack(ModItems.THE_CORE));
}
