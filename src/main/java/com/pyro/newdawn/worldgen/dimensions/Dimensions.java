package com.pyro.newdawn.worldgen.dimensions;

import com.pyro.newdawn.NewDawn;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;

public class Dimensions {

    public static final ResourceKey<Level> NEWDAWN = ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation(NewDawn.MODID, "prismallon"));

    public static void register() {
        Registry.register(Registry.CHUNK_GENERATOR, new ResourceLocation(NewDawn.MODID, "newdawn_chunkgen"),
                NewDawnChunkGenerator.CODEC);
        Registry.register(Registry.BIOME_SOURCE, new ResourceLocation(NewDawn.MODID, "biomes"),
                NewDawnBiomeProvider.CODEC);
    }
}
