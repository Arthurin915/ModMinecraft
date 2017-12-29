package com.skullexus.modteste;

import com.skullexus.modteste.item.ModItems;
import com.skullexus.modteste.proxy.CommonProxy;
import com.skullexus.modteste.tab.CreativeTabTutorial;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModTeste.MODID, version = ModTeste.VERSION, name = ModTeste.NAME)
public class ModTeste{
    public static final String MODID = "testemod";
    public static final String VERSION = "1.0";
    public static final String NAME ="Mod Teste";

    @SidedProxy(clientSide = "com.skullexus.modteste.proxy.ClientProxy",serverSide = "com.skullexus.modteste.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static ModTeste instance;

    public static CreativeTabTutorial tabTutorial;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        tabTutorial = new CreativeTabTutorial(CreativeTabs.getNextID(), "tab_tutorial");
        ModItems.preInit();
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event){
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
        proxy.postInit(event);
    }
}
