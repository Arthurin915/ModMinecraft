package com.skullexus.modteste;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModTeste.MODID, version = ModTeste.VERSION, name = ModTeste.NAME)
public class ModTeste{
    public static final String MODID = "testemod";
    public static final String VERSION = "1.0";
    public static final String NAME ="Mod Teste";

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){

    }

    @EventHandler
    public void init(FMLInitializationEvent event){

    }
}
