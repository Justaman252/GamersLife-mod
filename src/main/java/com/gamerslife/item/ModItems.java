package com.gamerslife.item;

import com.gamerslife.GamersLife;
import com.gamerslife.block.ModBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModItems {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, GamersLife.MOD_ID);

    public static final RegistryObject<Item> ENERGY_DRINK =
        ITEMS.register("energy_drink", () -> new DrinkItem(new Item.Properties()));

    public static final RegistryObject<Item> GAMER_SODA =
        ITEMS.register("gamer_soda", () -> new DrinkItem(new Item.Properties()));

    public static final RegistryObject<Item> LUCKY_FIZZ =
        ITEMS.register("lucky_fizz", () -> new DrinkItem(new Item.Properties()));

    public static final RegistryObject<Item> GAMER_SHAKE =
        ITEMS.register("gamer_shake", () -> new DrinkItem(new Item.Properties()));

    public static final RegistryObject<Item> GAMING_PC =
        ITEMS.register("gaming_pc", () -> new BlockItem(ModBlocks.GAMING_PC.get(), new Item.Properties()));

    private ModItems() {}
}
