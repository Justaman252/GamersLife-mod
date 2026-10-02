package com.gamerslife.item;

import net.minecraft.ChatFormatting;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class DrinkItem extends Item {
    private static final String USES_TAG = "GamersLifeUses";
    private static final int MAX_USES = 3;
    private static final int DURATION = 5 * 60 * 20;

    public DrinkItem(Properties properties) {
        super(properties.stacksTo(1));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);

        if (!level.isClientSide) {
            int uses = stack.getOrCreateTag().getInt(USES_TAG);

            if (uses < MAX_USES) {
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, DURATION, 0));
                player.addEffect(new MobEffectInstance(MobEffects.JUMP, DURATION, 0));
                player.addEffect(new MobEffectInstance(MobEffects.LUCK, DURATION, 0));
                player.addEffect(new MobEffectInstance(MobEffects.REGENERATION, DURATION, 0));

                uses++;
                stack.getOrCreateTag().putInt(USES_TAG, uses);

                player.displayClientMessage(
                    Component.literal("Gamer fuel used: " + (MAX_USES - uses) + " use(s) left")
                        .withStyle(ChatFormatting.GREEN),
                    true
                );

                if (uses >= MAX_USES) {
                    stack.shrink(1);
                }
            }
        }

        player.startUsingItem(hand);
        return InteractionResultHolder.sidedSuccess(stack, level.isClientSide());
    }

    @Override
    public int getUseDuration(ItemStack stack) {
        return 1;
    }
}
