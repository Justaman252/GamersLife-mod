package com.gamerslife.screen;

import com.gamerslife.GamersLife;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModMenuTypes {
    public static final DeferredRegister<MenuType<?>> MENUS =
        DeferredRegister.create(ForgeRegistries.MENU_TYPES, GamersLife.MOD_ID);

    public static final RegistryObject<MenuType<GamingPcMenu>> GAMING_PC =
        MENUS.register("gaming_pc", () -> IForgeMenuType.create((windowId, inv, data) ->
            new GamingPcMenu(windowId, inv)));

    private ModMenuTypes() {}
}
