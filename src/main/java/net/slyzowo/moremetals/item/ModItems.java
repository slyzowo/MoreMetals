package net.slyzowo.moremetals.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.slyzowo.moremetals.Moremetals;

public class ModItems {


    public static final Item ALUMINIUM_INGOT = registerItem("aluminium_ingot", new Item(new Item.Settings()));
    public static final Item BRASS_INGOT = registerItem("brass_ingot", new Item(new Item.Settings()));
    public static final Item BRONZE_INGOT = registerItem("bronze_ingot", new Item(new Item.Settings()));
    public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(new Item.Settings()));
    public static final Item TIN_INGOT = registerItem("tin_ingot", new Item(new Item.Settings()));
    public static final Item PURPLE_GOLD_INGOT = registerItem("purple_gold_ingot", new Item(new Item.Settings()));
    public static final Item ZINC_INGOT = registerItem("zinc_ingot", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(Moremetals.MOD_ID, name), item);
    }

    public static void registerModItems(){
        Moremetals.LOGGER.info("registering Mod Items for " + Moremetals.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(ALUMINIUM_INGOT);
            entries.add(BRASS_INGOT);
            entries.add(BRONZE_INGOT);
            entries.add(STEEL_INGOT);
            entries.add(TIN_INGOT);
            entries.add(PURPLE_GOLD_INGOT);
            entries.add(ZINC_INGOT);
        });
    }
}
