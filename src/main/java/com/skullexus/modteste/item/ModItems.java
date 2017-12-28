package com.skullexus.modteste.item;

import com.skullexus.modteste.ModTeste;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModItems {

    public static Item tutorialItem;

    public static void preInit(){
        tutorialItem = new Item().setUnlocalizedName("tutorial_item").setCreativeTab(ModTeste.tabTutorial);
    }

    public static void registerItems(){
       // ForgeRegistries.ITEMS.register(tutorialItem, new ResourceLocation(ModTeste.MODID,"tutorial_item"));﻿

    }

}
