package com.aetherteam.aether_genesis.data.generators;

import com.aetherteam.aether_genesis.Genesis;
import com.aetherteam.aether_genesis.block.GenesisBlocks;
import com.aetherteam.aether_genesis.data.providers.GenesisLanguageProvider;
import com.aetherteam.aether_genesis.entity.GenesisEntityTypes;
import com.aetherteam.aether_genesis.item.GenesisItems;
import net.minecraft.data.PackOutput;

public class GenesisLanguageData extends GenesisLanguageProvider {
    public GenesisLanguageData(PackOutput output) {
        super(output, Genesis.MODID);
    }

    @Override
    protected void addTranslations() {
        this.addBlock(GenesisBlocks.GREEN_AERCLOUD, "Green Aercloud");
        this.addBlock(GenesisBlocks.PURPLE_AERCLOUD, "Purple Aercloud");
        this.addBlock(GenesisBlocks.STORM_AERCLOUD, "Storm Aercloud");
        this.addBlock(GenesisBlocks.BLUE_SKYROOT_LEAVES, "Blue Skyroot Leaves");
        this.addBlock(GenesisBlocks.BLUE_SKYROOT_SAPLING, "Blue Skyroot Sapling");
        this.addBlock(GenesisBlocks.DARK_BLUE_SKYROOT_LEAVES, "Dark Blue Skyroot Leaves");
        this.addBlock(GenesisBlocks.DARK_BLUE_SKYROOT_SAPLING, "Dark Blue Skyroot Sapling");
        this.addBlock(GenesisBlocks.PURPLE_CRYSTAL_LEAVES, "Purple Crystal Leaves");
        this.addBlock(GenesisBlocks.PURPLE_CRYSTAL_FRUIT_LEAVES, "Purple Crystal Fruit Leaves");
        this.addBlock(GenesisBlocks.PURPLE_CRYSTAL_TREE_SAPLING, "Purple Crystal Tree Sapling");
        this.addBlock(GenesisBlocks.SKYROOT_LOG_WALL, "Skyroot Log Wall");
        this.addBlock(GenesisBlocks.STRIPPED_SKYROOT_LOG_WALL, "Stripped Skyroot Log Wall");
        this.addBlock(GenesisBlocks.SKYROOT_WOOD_WALL, "Skyroot Wood Wall");
        this.addBlock(GenesisBlocks.STRIPPED_SKYROOT_WOOD_WALL, "Stripped Skyroot Wood Wall");

        this.addItem(GenesisItems.GOLDEN_SWET_BALL, "Golden Swet Ball");
        this.addItem(GenesisItems.DARK_SWET_BALL, "Dark Swet Ball");
        this.addItem(GenesisItems.DARK_GUMMY_SWET, "Dark Gummy Swet");
        this.addItem(GenesisItems.BLUE_SWET_JELLY, "Blue Swet Jelly");
        this.addItem(GenesisItems.GOLDEN_SWET_JELLY, "Golden Swet Jelly");
        this.addItem(GenesisItems.DARK_SWET_JELLY, "Dark Swet Jelly");
        this.addItem(GenesisItems.DARK_SWET_SPAWN_EGG, "Dark Swet Spawn Egg");
        this.addItem(GenesisItems.BLUE_PARACHUTE, "Blue Parachute");
        this.addItem(GenesisItems.GREEN_PARACHUTE, "Green Parachute");
        this.addItem(GenesisItems.PURPLE_PARACHUTE, "Purple Parachute");

        this.addEntityType(GenesisEntityTypes.DARK_SWET, "Dark Swet");

        this.addCommonConfig("gameplay", "gold_aercloud_ability", "Changes Gold Aercloud and respective parachute behavior to launch entities downwards");

        this.addPackDescription("mod", "Genesis Resources");

        //todo: lore
    }
}
