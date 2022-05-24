package com.pyro.newdawn.datagen;

import com.pyro.newdawn.NewDawn;
import com.pyro.newdawn.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import static com.pyro.newdawn.blocks.PowergenBlock.MESSAGE_POWERGEN;
import static com.pyro.newdawn.blocks.PowergenBlock.SCREEN_TUTORIAL_POWERGEN;
import static com.pyro.newdawn.setup.ModSetup.TAB_NAME;

public class DawnLanguageProvider extends LanguageProvider {

    public DawnLanguageProvider(DataGenerator gen, String locale) { super(gen, NewDawn.MODID, locale); }

    @Override
    protected void addTranslations() {
        add("itemGroup." + TAB_NAME, "New Dawn");

        add(Registration.OVERWORLD_PRISMALLON_ORE_BLOCK.get(), "Prismallon Ore");
        add(Registration.DEEPSLATE_PRISMALLON_ORE_BLOCK.get(), "Deepslate Prismallon Ore");
        add(Registration.NETHER_PRISMALLON_ORE_BLOCK.get(), "Nether Prismallon Ore");
        add(Registration.END_PRISMALLON_ORE_BLOCK.get(), "End Prismallon Ore");
        add(Registration.RAW_PRISMALLON_BLOCK.get(), "Raw Prismallon Block");
        add(Registration.PRISMALLON_BLOCK.get(),"Prismallon Block");

        add(Registration.POWERGEN.get(), "Power Generator");

        add(MESSAGE_POWERGEN, "Generates %s FE per tick");
        add(SCREEN_TUTORIAL_POWERGEN, "Power generator");

        add(Registration.RAW_PRISMALLON_CHUNK.get(), "Raw Prismallon");
        add(Registration.PRISMALLON_INGOT.get(), "Prismallon Ingot");
        add(Registration.PRISMALLON_NUGGET.get(), "Prismallon Nugget");
    }
}
