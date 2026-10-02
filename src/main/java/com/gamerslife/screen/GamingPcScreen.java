package com.gamerslife.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;

public class GamingPcScreen extends AbstractContainerScreen<GamingPcMenu> {
    public GamingPcScreen(GamingPcMenu menu, Inventory inventory, Component title) {
        super(menu, inventory, title);
        this.imageWidth = 300;
        this.imageHeight = 190;
    }

    @Override
    protected void renderBg(GuiGraphics graphics, float partialTick, int mouseX, int mouseY) {
        RenderSystem.setShaderColor(1F, 1F, 1F, 1F);
        graphics.fill(leftPos, topPos, leftPos + imageWidth, topPos + imageHeight, 0xFF111318);
        graphics.fill(leftPos + 8, topPos + 8, leftPos + imageWidth - 8, topPos + imageHeight - 30, 0xFF202630);
        graphics.fill(leftPos + 20, topPos + 25, leftPos + 280, topPos + 140, 0xFF080A0F);

        graphics.drawString(font, "GAMERSLIFE DESKTOP", leftPos + 18, topPos + 12, 0xFFFFFF, false);
        graphics.drawString(font, "Desktop", leftPos + 35, topPos + 45, 0x55FF55, false);
        graphics.drawString(font, "Games", leftPos + 35, topPos + 65, 0x55AAFF, false);
        graphics.drawString(font, "Settings", leftPos + 35, topPos + 85, 0xFFFF55, false);
        graphics.drawString(font, "Welcome, gamer!", leftPos + 130, topPos + 125, 0xFFFFFF, false);
    }

    @Override
    protected void renderLabels(GuiGraphics graphics, int mouseX, int mouseY) {
    }
}
