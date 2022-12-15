package net.minetheground.tutorialmod.item;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.Cancelable;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minetheground.tutorialmod.TutorialMod;
import net.minetheground.tutorialmod.item.custom.EightBallItem;


import net.minecraft.world.item.Item;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minetheground.tutorialmod.item.custom.RubyPickaxe;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

            public static final RegistryObject<Item> RUBY = ITEMS.register("ruby" ,
                    () -> new Item(new Item.Properties().tab(ModCreativeModetab.TUTORIAL_TAB)));
            public static final RegistryObject<Item> RAW_RUBY = ITEMS.register("raw_ruby" ,
                    () -> new Item(new Item.Properties().tab(ModCreativeModetab.TUTORIAL_TAB)));

    public static final RegistryObject<PickaxeItem> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe" ,
            () -> new RubyPickaxe(Tiers.EXAMPLE,2,3.5f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

public static final RegistryObject<Item> EIGHT_BALL = ITEMS.register("eight_ball" ,
                    () -> new EightBallItem(new Item.Properties().tab(ModCreativeModetab.TUTORIAL_TAB).stacksTo(1)));
public static final RegistryObject<Item> BLUEBERRY = ITEMS.register("blueberry" ,
                    () -> new EightBallItem(new Item.Properties().tab(ModCreativeModetab.TUTORIAL_TAB)
                            .food(new FoodProperties.Builder().nutrition(2).saturationMod(2f).build())));
public static final RegistryObject<Item> BLUEBERRY_SEED = ITEMS.register("blueberry_seed" ,
                    () -> new EightBallItem(new Item.Properties().tab(ModCreativeModetab.TUTORIAL_TAB).stacksTo(1)));



            public static void register(IEventBus eventBus) {
                ITEMS.register(eventBus);

            }

 public static class Tiers {
            public static final Tier EXAMPLE = new ForgeTier(2,2500,9.0f,3,350, null, () -> Ingredient.of(Moditems.RUBY_PICKAXE.get()));
 }

}
