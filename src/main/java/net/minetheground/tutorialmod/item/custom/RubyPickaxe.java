package net.minetheground.tutorialmod.item.custom;



import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;


public class RubyPickaxe extends PickaxeItem {

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if (!level.isClientSide() && hand == InteractionHand.MAIN_HAND)
        return super.use(level, player, hand);
    }

    public RubyPickaxe(Tier tier, int i, float v, Properties properties)


    {
        super(tier, i, v, properties);
    }
}

