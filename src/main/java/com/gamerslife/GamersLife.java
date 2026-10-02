package com.gamerslife;

import com.gamerslife.block.ModBlocks;
import com.gamerslife.item.ModItems;
import com.gamerslife.screen.ModMenuTypes;
import com.gamerslife.screen.GamingPcScreen;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.api.distmarker.OnlyIn;

@Mod(GamersLife.MOD_ID)
public class GamersLife {
    public static final String MOD_ID = "gamerslife";

    public GamersLife() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.ITEMS.register(bus);
        ModBlocks.BLOCKS.register(bus);
        ModMenuTypes.MENUS.register(bus);
        bus.addListener(this::clientSetup);
    }

    @OnlyIn(Dist.CLIENT)
    private void clientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> MenuScreens.register(ModMenuTypes.GAMING_PC.get(), GamingPcScreen::new));
    }
}
