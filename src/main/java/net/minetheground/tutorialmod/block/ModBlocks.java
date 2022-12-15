package net.minetheground.tutorialmod.block;

import net.minecraft.world.level.block.Blocks;
import net.minetheground.tutorialmod.TutorialMod;
import net.minetheground.tutorialmod.block.custom.BlueberryCropBlock;
import net.minetheground.tutorialmod.block.custom.JumpyBlock;
import net.minetheground.tutorialmod.block.custom.RubyLambBlock;
import net.minetheground.tutorialmod.item.ModCreativeModetab;
import net.minetheground.tutorialmod.item.Moditems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TutorialMod.MOD_ID);

    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock("ruby_block" ,
    () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
            .strength(6f).requiresCorrectToolForDrops()), ModCreativeModetab.TUTORIAL_TAB);

    public static final RegistryObject<Block> RUBY_ORE = registerBlock("ruby_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(3,7)), ModCreativeModetab.TUTORIAL_TAB);

public static final RegistryObject<Block> DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(5,50)), ModCreativeModetab.TUTORIAL_TAB);

public static final RegistryObject<Block> RUBY_LAMB = registerBlock("ruby_lamb",
            () -> new RubyLambBlock(BlockBehaviour.Properties.of(Material.GLASS)
                    .lightLevel(state -> state.getValue(RubyLambBlock.LIT) ? 15 : 0)),ModCreativeModetab.TUTORIAL_TAB);

public static final RegistryObject<Block> Jumpy_Block = registerBlock("jumpy_block",
            () -> new JumpyBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModetab.TUTORIAL_TAB);
public static final RegistryObject<Block> BLUEBERRY_CROP = BLOCKS.register("blueberry_crop",
            () -> new BlueberryCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModetab.TUTORIAL_TAB);






    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
RegistryObject<T> toReturn = BLOCKS.register(name, block);
registerBlockItem(name, toReturn, tab);

        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                                 CreativeModeTab tab) {
        return Moditems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));



    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
