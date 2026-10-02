package com.gamerslife.block;

import com.gamerslife.GamersLife;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
        DeferredRegister.create(ForgeRegistries.BLOCKS, GamersLife.MOD_ID);

    public static final RegistryObject<Block> GAMING_PC =
        BLOCKS.register("gaming_pc", () -> new GamingPcBlock(
            BlockBehaviour.Properties.of()
                .strength(2.5F)
                .sound(SoundType.METAL)
                .requiresCorrectToolForDrops()
        ));

    private ModBlocks() {}
}
