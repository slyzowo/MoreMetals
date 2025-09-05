package net.slyzowo.moremetals.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.slyzowo.moremetals.Moremetals;
import net.slyzowo.moremetals.blocks.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup More_Metals_Item_Group = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Moremetals.MOD_ID, "more_metals_items"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.PURPLE_GOLD_INGOT))
                    .displayName(Text.translatable("itemgroup.moremetals.more_metals_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.ALUMINIUM_BLOCK);
                        entries.add(ModBlocks.ALUMINIUM_ORE);
                        entries.add(ModItems.ALUMINIUM_INGOT);
                        entries.add(ModItems.RAW_ALUMINIUM);
                        entries.add(ModItems.ALUMINIUM_NUGGET);

                        entries.add(ModBlocks.BRASS_BLOCK);
                        entries.add(ModItems.BRASS_INGOT);
                        entries.add(ModItems.BRASS_NUGGET);

                        entries.add(ModBlocks.BRONZE_BLOCK);
                        entries.add(ModItems.BRONZE_INGOT);
                        entries.add(ModItems.BRONZE_NUGGET);

                        entries.add(ModBlocks.LITHIUM_BLOCK);
                        entries.add(ModBlocks.LITHIUM_ORE);
                        entries.add(ModItems.LITHIUM_INGOT);
                        entries.add(ModItems.RAW_LITHIUM);
                        entries.add(ModItems.LITHIUM_NUGGET);

                        entries.add(ModBlocks.PURPLE_GOLD_BLOCK);
                        entries.add(ModItems.PURPLE_GOLD_INGOT);
                        entries.add(ModItems.PURPLE_GOLD_NUGGET);

                        entries.add(ModBlocks.STEEL_BLOCK);
                        entries.add(ModItems.STEEL_INGOT);
                        entries.add(ModItems.STEEL_NUGGET);

                        entries.add(ModBlocks.TIN_BLOCK);
                        entries.add(ModBlocks.TIN_ORE);
                        entries.add(ModItems.TIN_INGOT);
                        entries.add(ModItems.RAW_TIN);
                        entries.add(ModItems.TIN_NUGGET);

                        entries.add(ModBlocks.TITANIUM_BLOCK);
                        entries.add(ModBlocks.TITANIUM_ORE);
                        entries.add(ModItems.TITANIUM_INGOT);
                        entries.add(ModItems.RAW_TITANIUM);
                        entries.add(ModItems.TITANIUM_NUGGET);

                        entries.add(ModBlocks.ZINC_BLOCK);
                        entries.add(ModBlocks.ZINC_ORE);
                        entries.add(ModItems.ZINC_INGOT);
                        entries.add(ModItems.RAW_ZINC);
                        entries.add(ModItems.ZINC_NUGGET);

                    }).build());

    public static void registerItemGroups(){
        Moremetals.LOGGER.info("Registering Mod Item Groups for " + Moremetals.MOD_ID);
    }

}
