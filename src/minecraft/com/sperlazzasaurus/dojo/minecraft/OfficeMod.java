package com.sperlazzasaurus.dojo.minecraft;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.sperlazzasaurus.dojo.minecraft.items.TpsReport;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

/**
 * 
 * @author esperlaz
 *
 */

@Mod(modid="OfficeMod", name="OfficeMod", version="0.0.0")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class OfficeMod {
	
    @Instance("OfficeMod")
    public static OfficeMod instance;

    private final static Item tpsReport = new TpsReport();

    @SidedProxy(clientSide="tutorial.generic.client.ClientProxy",
                    serverSide="tutorial.generic.CommonProxy")
    public static CommonProxy proxy;
   
    @PreInit
    public void preInit(FMLPreInitializationEvent event) {
            // Stub Method
    }
   
    @Init
    public void load(FMLInitializationEvent event) {
            LanguageRegistry.addName(tpsReport, "TPS Report");
            
            GameRegistry.addRecipe(new ItemStack(tpsReport), "xyx",
                    'x', new ItemStack(Item.dyePowder, 0), 'y', new ItemStack(Item.paper));
    }
   
    @PostInit
    public void postInit(FMLPostInitializationEvent event) {
            // Stub Method
    }

}
