package com.pyro.newdawn.setup;

import com.pyro.newdawn.NewDawn;
import com.pyro.newdawn.blocks.PowergenBE;
import com.pyro.newdawn.blocks.PowergenBlock;
import com.pyro.newdawn.blocks.PowergenContainer;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.pyro.newdawn.NewDawn.MODID;

public class Registration {

    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    private static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, MODID);
    private static final DeferredRegister<MenuType<?>> CONTAINERS = DeferredRegister.create(ForgeRegistries.CONTAINERS, MODID);


    public static void init() {

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(bus);
        ITEMS.register(bus);
        BLOCK_ENTITIES.register(bus);
        CONTAINERS.register(bus);

    }

    //Placeholder values and Creative Tab setup
    public static final BlockBehaviour.Properties BLOCK_PROPERTIES = BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops();
    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties().tab(ModSetup.ITEM_GROUP);

    //Begin Block Register
    public static final RegistryObject<Block> OVERWORLD_PRISMALLON_ORE_BLOCK = BLOCKS.register("overworld_prismallon_ore_block", () -> new Block(BLOCK_PROPERTIES));
    public static final RegistryObject<Item> OVERWORLD_PRISMALLON_ORE_BLOCK_ITEM = fromBlock(OVERWORLD_PRISMALLON_ORE_BLOCK);

    public static final RegistryObject<Block> DEEPSLATE_PRISMALLON_ORE_BLOCK = BLOCKS.register("deepslate_prismallon_ore_block", () -> new Block(BLOCK_PROPERTIES));
    public static final RegistryObject<Item> DEEPSLATE_PRISMALLON_ORE_BLOCK_ITEM = fromBlock(DEEPSLATE_PRISMALLON_ORE_BLOCK);

    public static final RegistryObject<Block> NETHER_PRISMALLON_ORE_BLOCK = BLOCKS.register("nether_prismallon_ore_block", () -> new Block(BLOCK_PROPERTIES));
    public static final RegistryObject<Item> NETHER_PRISMALLON_ORE_BLOCK_ITEM = fromBlock(NETHER_PRISMALLON_ORE_BLOCK);

    public static final RegistryObject<Block> END_PRISMALLON_ORE_BLOCK = BLOCKS.register("end_prismallon_ore_block", () -> new Block(BLOCK_PROPERTIES));
    public static final RegistryObject<Item> END_PRISMALLON_ORE_BLOCK_ITEM = fromBlock(END_PRISMALLON_ORE_BLOCK);

    public static final RegistryObject<Block> RAW_PRISMALLON_BLOCK = BLOCKS.register("raw_prismallon_block", () -> new Block(BLOCK_PROPERTIES));
    public static final RegistryObject<Item> RAW_PRISMALLON_BLOCK_ITEM = fromBlock(RAW_PRISMALLON_BLOCK);

    public static final RegistryObject<Block> PRISMALLON_BLOCK = BLOCKS.register("prismallon_block", () -> new Block(BLOCK_PROPERTIES));
    public static final RegistryObject<Item> PRISMALLON_BLOCK_ITEM = fromBlock(PRISMALLON_BLOCK);

    public static final RegistryObject<PowergenBlock> POWERGEN = BLOCKS.register("powergen", PowergenBlock::new);
    public static final RegistryObject<Item> POWERGEN_ITEM = fromBlock(POWERGEN);
    public static final RegistryObject<BlockEntityType<PowergenBE>> POWERGEN_BE = BLOCK_ENTITIES.register("powergen", () -> BlockEntityType.Builder.of(PowergenBE::new, POWERGEN.get()).build(null));
    public static final RegistryObject<MenuType<PowergenContainer>> POWERGEN_CONTAINER = CONTAINERS.register("powergen",
            () -> IForgeMenuType.create((windowId, inv, data) -> new PowergenContainer(windowId, data.readBlockPos(), inv, inv.player)));

    //Items
    public static final RegistryObject<Item> RAW_PRISMALLON_CHUNK = ITEMS.register("raw_prismallon_chunk", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> PRISMALLON_INGOT = ITEMS.register("prismallon_ingot", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> PRISMALLON_NUGGET = ITEMS.register("prismallon_nugget", () -> new Item(ITEM_PROPERTIES));


    //Tags
    //public static final Tags.IOptionalNamedTag<Block> PRISMALLON_ORE = BlockTags.createOptional(new ResourceLocation(MODID, "prismallon_ore"));
    public static final TagKey<Block> PRISMALLON_ORE = TagKey.create(Registry.BLOCK_REGISTRY, new ResourceLocation(MODID, "prismallon_ore"));
    //public static final Tags.IOptionalNamedTag<Item> PRISMALLON_ORE_ITEM = ItemTags.createOptional(new ResourceLocation(MODID, "prismallon_ore"));
    public static final TagKey<Item> PRISMALLON_ORE_ITEM= TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation(MODID, "prismallon_ore"));

    //Dimension
    public static final ResourceLocation RL_NEWDAWN_DIMENSION_SET = new ResourceLocation(NewDawn.MODID, "newdawn_dimension_structure_set");

    public static final TagKey<Biome> HAS_PORTAL = TagKey.create(Registry.BIOME_REGISTRY, new ResourceLocation(NewDawn.MODID, "has_structure/portal"));
    public static final TagKey<Biome> HAS_THIEFDEN = TagKey.create(Registry.BIOME_REGISTRY, new ResourceLocation(NewDawn.MODID, "has_structure/thiefden"));



    public static <B extends Block> RegistryObject<Item> fromBlock(RegistryObject<B> block) {
        return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), ITEM_PROPERTIES));
    }
}
