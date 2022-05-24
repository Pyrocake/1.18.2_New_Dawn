package com.example.newdawn.datagen;

import com.example.newdawn.NewDawn;
import com.example.newdawn.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class DawnItemTags extends ItemTagsProvider {

    public DawnItemTags(DataGenerator gen, BlockTagsProvider blockTags, ExistingFileHelper helper) {
        super(gen, blockTags, NewDawn.MODID, helper);
    }

    @Override
    protected void addTags() {
        tag(Tags.Items.ORES)
                .add(Registration.OVERWORLD_PRISMALLON_ORE_BLOCK_ITEM.get())
                .add(Registration.DEEPSLATE_PRISMALLON_ORE_BLOCK_ITEM.get())
                .add(Registration.NETHER_PRISMALLON_ORE_BLOCK_ITEM.get())
                .add(Registration.END_PRISMALLON_ORE_BLOCK_ITEM.get());
        tag(Tags.Items.INGOTS)
                .add(Registration.PRISMALLON_INGOT.get());
        tag(Registration.PRISMALLON_ORE_ITEM)
                .add(Registration.OVERWORLD_PRISMALLON_ORE_BLOCK_ITEM.get())
                .add(Registration.DEEPSLATE_PRISMALLON_ORE_BLOCK_ITEM.get())
                .add(Registration.NETHER_PRISMALLON_ORE_BLOCK_ITEM.get())
                .add(Registration.END_PRISMALLON_ORE_BLOCK_ITEM.get());

    }

    @Override
    public String getName() { return "New Dawn Tags"; }

}
