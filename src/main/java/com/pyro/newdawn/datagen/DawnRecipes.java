package com.pyro.newdawn.datagen;

import com.pyro.newdawn.setup.Registration;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.Tags;

import java.util.function.Consumer;

public class DawnRecipes extends RecipeProvider {

    public DawnRecipes(DataGenerator gen) { super(gen);}

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.PRISMALLON_ORE_ITEM), Registration.PRISMALLON_INGOT.get(), 1f, 200)
                .unlockedBy("has_ore", has(Registration.PRISMALLON_ORE_ITEM))
                .save(consumer, "prismallon_ingot1");
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(Registration.PRISMALLON_ORE_ITEM), Registration.PRISMALLON_INGOT.get(), 1f, 100)
                .unlockedBy("has_ore", has(Registration.PRISMALLON_ORE_ITEM))
                .save(consumer, "prismallon_ingot2");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.RAW_PRISMALLON_CHUNK.get()), Registration.PRISMALLON_INGOT.get(), 0f, 200)
                .unlockedBy("has_chunk", has(Registration.RAW_PRISMALLON_CHUNK.get()))
                .save(consumer, "prismallon_ingot3");
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(Registration.RAW_PRISMALLON_CHUNK.get()), Registration.PRISMALLON_INGOT.get(), 0f, 100)
                .unlockedBy("has_chunk", has(Registration.RAW_PRISMALLON_CHUNK.get()))
                .save(consumer, "prismallon_ingot4");


        ShapedRecipeBuilder.shaped(Registration.POWERGEN.get())
                .pattern("mmm")
                .pattern("x#x")
                .pattern("#x#")
                .define('x', Tags.Items.DUSTS_REDSTONE)
                .define('#', Tags.Items.INGOTS_IRON)
                .define('m', Registration.PRISMALLON_INGOT.get())
                //.group("newdawn")
                .unlockedBy("prismallon", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.PRISMALLON_INGOT.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(Registration.PRISMALLON_BLOCK.get())
                .pattern("xxx")
                .pattern("xxx")
                .pattern("xxx")
                .define('x', Registration.PRISMALLON_INGOT.get())
                //.group("newdawn")
                .unlockedBy("prismallonget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.PRISMALLON_INGOT.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(Registration.PRISMALLON_INGOT.get())
                .pattern("xxx")
                .pattern("xxx")
                .pattern("xxx")
                .define('x', Registration.PRISMALLON_NUGGET.get())
                //.group("newdawn")
                .unlockedBy("prismallonget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.PRISMALLON_NUGGET.get()))
                .save(consumer, "prismallon_ingot6");
        ShapedRecipeBuilder.shaped(Registration.RAW_PRISMALLON_BLOCK.get())
                .pattern("xxx")
                .pattern("xxx")
                .pattern("xxx")
                .define('x', Registration.RAW_PRISMALLON_CHUNK.get())
                //.group("newdawn")
                .unlockedBy("has_chunk", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.RAW_PRISMALLON_CHUNK.get()))
                .save(consumer);

        //Shapeless
        ShapelessRecipeBuilder.shapeless(Registration.PRISMALLON_INGOT.get(), 9)
                .requires(Registration.PRISMALLON_BLOCK.get(), 1)
                //.group("newdawn")
                .unlockedBy("prismallon", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.PRISMALLON_INGOT.get()))
                .save(consumer, "prismallon_ingot5");
        ShapelessRecipeBuilder.shapeless(Registration.PRISMALLON_NUGGET.get(), 9)
                .requires(Registration.PRISMALLON_INGOT.get(), 1)
                //.group("newdawn")
                .unlockedBy("prismallon", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.PRISMALLON_INGOT.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.RAW_PRISMALLON_CHUNK.get(), 9)
                .requires(Registration.RAW_PRISMALLON_BLOCK.get(), 1)
                //.group("newdawn")
                .unlockedBy("prismallon", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.RAW_PRISMALLON_BLOCK.get()))
                .save(consumer);
    }

}
