package net.coffeecodeboys.coffeemod.block;

import net.coffeecodeboys.coffeemod.coffeemod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.fabricmc.fabric.impl.object.builder.FabricBlockInternals.MiningLevel;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block COFFEE_ORE = registerBlock("coffee_ore", 
        new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(coffeemod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registry.ITEM, new Identifier(coffeemod.MOD_ID, name),
            new BlockItem(block, new FabricItemSettings().group(ItemGroup.MISC)));
    }

    public static void registerModBlocks() {
        System.out.println("Registering blocks for " + coffeemod.MOD_ID);
    }
}
