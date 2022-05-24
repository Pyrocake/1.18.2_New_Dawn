package com.example.newdawn.datagen;

import com.example.newdawn.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.loot.LootTableProvider;

public class DawnLootTables extends BaseLootTableProvider {

    public DawnLootTables(DataGenerator gen) { super(gen); }

    @Override
    protected void addTables() {
        lootTables.put(Registration.OVERWORLD_PRISMALLON_ORE_BLOCK.get(), createSilkTouchTable("overworld_prismallon_ore_block", Registration.OVERWORLD_PRISMALLON_ORE_BLOCK.get(), Registration.RAW_PRISMALLON_CHUNK.get(), 1, 3));
        lootTables.put(Registration.NETHER_PRISMALLON_ORE_BLOCK.get(), createSilkTouchTable("nether_prismallon_ore_block", Registration.NETHER_PRISMALLON_ORE_BLOCK.get(), Registration.RAW_PRISMALLON_CHUNK.get(), 1, 3));
        lootTables.put(Registration.END_PRISMALLON_ORE_BLOCK.get(), createSilkTouchTable("end_prismallon_ore_block", Registration.END_PRISMALLON_ORE_BLOCK.get(), Registration.RAW_PRISMALLON_CHUNK.get(), 1, 3));
        lootTables.put(Registration.DEEPSLATE_PRISMALLON_ORE_BLOCK.get(), createSilkTouchTable("deepslate_prismallon_ore_block", Registration.DEEPSLATE_PRISMALLON_ORE_BLOCK.get(), Registration.RAW_PRISMALLON_CHUNK.get(), 1, 3));

        lootTables.put(Registration.POWERGEN.get(), createStandardTable("powergen", Registration.POWERGEN.get(), Registration.POWERGEN_BE.get()));

        lootTables.put(Registration.PRISMALLON_BLOCK.get(), createSimpleTable("prismallon_block", Registration.PRISMALLON_BLOCK.get()));
        lootTables.put(Registration.RAW_PRISMALLON_BLOCK.get(), createSimpleTable("raw_prismallon_block", Registration.RAW_PRISMALLON_BLOCK.get()));
    }

}
