package com.example.newdawn.setup;

import com.example.newdawn.client.PowergenRenderer;
import com.example.newdawn.client.PowergenScreen;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ClientSetup {

    public static void init(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            MenuScreens.register(Registration.POWERGEN_CONTAINER.get(), PowergenScreen::new);           // Attach our container to the screen
            ItemBlockRenderTypes.setRenderLayer(Registration.POWERGEN.get(), RenderType.translucent()); //Set the render type for our power generator to translucent
            PowergenRenderer.register();
        });
    }

}
