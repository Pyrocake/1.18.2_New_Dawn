package com.example.newdawn.datagen;

import com.example.newdawn.NewDawn;
import com.example.newdawn.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class DawnBlockTags extends BlockTagsProvider {

    public DawnBlockTags(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, NewDawn.MODID, helper);
    }

    @Override
    protected void addTags() {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(Registration.OVERWORLD_PRISMALLON_ORE_BLOCK.get())
                .add(Registration.DEEPSLATE_PRISMALLON_ORE_BLOCK.get())
                .add(Registration.NETHER_PRISMALLON_ORE_BLOCK.get())
                .add(Registration.END_PRISMALLON_ORE_BLOCK.get())
                .add(Registration.RAW_PRISMALLON_BLOCK.get())
                .add(Registration.PRISMALLON_BLOCK.get())
                .add(Registration.POWERGEN.get());
        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(Registration.OVERWORLD_PRISMALLON_ORE_BLOCK.get())
                .add(Registration.DEEPSLATE_PRISMALLON_ORE_BLOCK.get())
                .add(Registration.NETHER_PRISMALLON_ORE_BLOCK.get())
                .add(Registration.END_PRISMALLON_ORE_BLOCK.get())
                .add(Registration.RAW_PRISMALLON_BLOCK.get())
                .add(Registration.PRISMALLON_BLOCK.get())
                .add(Registration.POWERGEN.get());
        tag(Tags.Blocks.ORES)
                .add(Registration.OVERWORLD_PRISMALLON_ORE_BLOCK.get())
                .add(Registration.DEEPSLATE_PRISMALLON_ORE_BLOCK.get())
                .add(Registration.NETHER_PRISMALLON_ORE_BLOCK.get())
                .add(Registration.END_PRISMALLON_ORE_BLOCK.get());
        tag(Registration.PRISMALLON_ORE)
                .add(Registration.OVERWORLD_PRISMALLON_ORE_BLOCK.get())
                .add(Registration.DEEPSLATE_PRISMALLON_ORE_BLOCK.get())
                .add(Registration.NETHER_PRISMALLON_ORE_BLOCK.get())
                .add(Registration.END_PRISMALLON_ORE_BLOCK.get());
    }

    @Override
    public String getName() { return "New Dawn Tags"; }
}
