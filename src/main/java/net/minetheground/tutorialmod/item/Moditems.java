package net.minetheground.tutorialmod.item;

import net.minetheground.tutorialmod.TutorialMod;
import net.minetheground.tutorialmod.item.custom.EightBallItem;


import net.minecraft.world.item.Item;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

            public static final RegistryObject<Item> RUBY = ITEMS.register("ruby" ,
                    () -> new Item(new Item.Properties().tab(ModCreativeModetab.TUTORIAL_TAB)));
            public static final RegistryObject<Item> RAW_RUBY = ITEMS.register("raw_ruby" ,
                    () -> new Item(new Item.Properties().tab(ModCreativeModetab.TUTORIAL_TAB)));

public static final RegistryObject<Item> EIGHT_BALL = ITEMS.register("eight_ball" ,
                    () -> new EightBallItem(new Item.Properties().tab(ModCreativeModetab.TUTORIAL_TAB).stacksTo(1)));



            public static void register(IEventBus eventBus) {
                ITEMS.register(eventBus);

            }
}
