package net.slyzowo.moremetals.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.slyzowo.moremetals.Moremetals;

public class ModItems {

    public static final Item RAW_ALUMINIUM = registerItem("raw_aluminium", new Item(new Item.Settings()));
    public static final Item ALUMINIUM_INGOT = registerItem("aluminium_ingot", new Item(new Item.Settings()));
    public static final Item ALUMINIUM_NUGGET = registerItem("aluminium_nugget", new Item(new Item.Settings()));

    public static final Item BRASS_INGOT = registerItem("brass_ingot", new Item(new Item.Settings()));
    public static final Item BRASS_NUGGET = registerItem("brass_nugget", new Item(new Item.Settings()));

    public static final Item BRONZE_INGOT = registerItem("bronze_ingot", new Item(new Item.Settings()));
    public static final Item BRONZE_NUGGET = registerItem("bronze_nugget", new Item(new Item.Settings()));

    public static final Item RAW_LITHIUM = registerItem("raw_lithium", new Item(new Item.Settings()));
    public static final Item LITHIUM_INGOT = registerItem("lithium_ingot", new Item(new Item.Settings()));
    public static final Item LITHIUM_NUGGET = registerItem("lithium_nugget", new Item(new Item.Settings()));

    public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(new Item.Settings()));
    public static final Item STEEL_NUGGET = registerItem("steel_nugget", new Item(new Item.Settings()));

    public static final Item RAW_TIN = registerItem("raw_tin", new Item(new Item.Settings()));
    public static final Item TIN_INGOT = registerItem("tin_ingot", new Item(new Item.Settings()));
    public static final Item TIN_NUGGET = registerItem("tin_nugget", new Item(new Item.Settings()));

    public static final Item RAW_TITANIUM = registerItem("raw_titanium", new Item(new Item.Settings()));
    public static final Item TITANIUM_INGOT = registerItem("titanium_ingot", new Item(new Item.Settings()));
    public static final Item TITANIUM_NUGGET = registerItem("titanium_nugget", new Item(new Item.Settings()));

    public static final Item RAW_TUNGSTEN = registerItem("raw_tungsten", new Item(new Item.Settings()));
    public static final Item TUNGSTEN_INGOT = registerItem("tungsten_ingot", new Item(new Item.Settings()));
    public static final Item TUNGSTEN_NUGGET = registerItem("tungsten_nugget", new Item(new Item.Settings()));

    public static final Item PURPLE_GOLD_INGOT = registerItem("purple_gold_ingot", new Item(new Item.Settings()));
    public static final Item PURPLE_GOLD_NUGGET = registerItem("purple_gold_nugget", new Item(new Item.Settings()));

    public static final Item RAW_ZINC = registerItem("raw_zinc", new Item(new Item.Settings()));
    public static final Item ZINC_INGOT = registerItem("zinc_ingot", new Item(new Item.Settings()));
    public static final Item ZINC_NUGGET = registerItem("zinc_nugget", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(Moremetals.MOD_ID, name), item);
    }

    public static void registerModItems(){
        Moremetals.LOGGER.info("registering Mod Items for " + Moremetals.MOD_ID);
    }
}
