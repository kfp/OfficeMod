package com.sperlazzasaurus.dojo.minecraft.OfficeMod.common;


import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

import com.sperlazzasaurus.dojo.minecraft.OfficeMod.common.blocks.TpsReport;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid="dojo_OfficeMod", name="Office Mod", version="0.1")
@NetworkMod(clientSideRequired=true,serverSideRequired=true)

public class OfficeMod {
	
	@Instance("dojo_OfficeMod")
	public static OfficeMod instance;

	private final static Item TPS_REPORT = new TpsReport(6000);
	
	@Init
	public void load(FMLInitializationEvent event){
		ItemStack inkStack = new ItemStack(Item.dyePowder, 0);
		ItemStack paperStack = new ItemStack(Item.paper);
		ItemStack tpsReportStack = new ItemStack(TPS_REPORT);
		ItemStack emeraldStack = new ItemStack(Item.emerald);
		
		GameRegistry.addRecipe(tpsReportStack, "xyx", 'x', inkStack, 'y', paperStack);
		
		FurnaceRecipes.smelting().addSmelting(TPS_REPORT.itemID, emeraldStack, 5f);
	}
}
