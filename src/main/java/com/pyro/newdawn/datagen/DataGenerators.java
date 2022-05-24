package com.pyro.newdawn.datagen;

import com.pyro.newdawn.NewDawn;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = NewDawn.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        if (event.includeServer()) {
            generator.addProvider(new DawnRecipes(generator));
            generator.addProvider(new DawnLootTables(generator));
            DawnBlockTags blockTags = new DawnBlockTags(generator, event.getExistingFileHelper());
            generator.addProvider(blockTags);
            generator.addProvider(new DawnBiomeTags(generator, event.getExistingFileHelper()));
            generator.addProvider(new DawnItemTags(generator, blockTags, event.getExistingFileHelper()));
        }
        if (event.includeClient()) {
            generator.addProvider(new DawnBlockStates(generator, event.getExistingFileHelper()));
            generator.addProvider(new DawnItemModels(generator, event.getExistingFileHelper()));
            generator.addProvider(new DawnLanguageProvider(generator, "en_us"));
        }
    }

}
