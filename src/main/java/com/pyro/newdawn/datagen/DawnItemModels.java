package com.pyro.newdawn.datagen;

import com.pyro.newdawn.NewDawn;
import com.pyro.newdawn.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class DawnItemModels extends ItemModelProvider {

    public DawnItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, NewDawn.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent(Registration.OVERWORLD_PRISMALLON_ORE_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/overworld_prismallon_ore_block"));
        withExistingParent(Registration.DEEPSLATE_PRISMALLON_ORE_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/deepslate_prismallon_ore_block"));
        withExistingParent(Registration.NETHER_PRISMALLON_ORE_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/nether_prismallon_ore_block"));
        withExistingParent(Registration.END_PRISMALLON_ORE_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/end_prismallon_ore_block"));
        withExistingParent(Registration.RAW_PRISMALLON_BLOCK.get().getRegistryName().getPath(), modLoc("block/raw_prismallon_block"));
        withExistingParent(Registration.PRISMALLON_BLOCK.get().getRegistryName().getPath(), modLoc("block/prismallon_block"));

        withExistingParent(Registration.POWERGEN_ITEM.get().getRegistryName().getPath(), modLoc("block/powergen"));


        singleTexture(Registration.RAW_PRISMALLON_CHUNK.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/raw_prismallon_chunk"));
        singleTexture(Registration.PRISMALLON_INGOT.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/prismallon_ingot"));
        singleTexture(Registration.PRISMALLON_NUGGET.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/prismallon_nugget"));

    }
}
