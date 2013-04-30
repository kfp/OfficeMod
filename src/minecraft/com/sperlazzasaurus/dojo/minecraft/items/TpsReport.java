package com.sperlazzasaurus.dojo.minecraft.items;

import com.sperlazzasaurus.dojo.minecraft.CommonProxy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TpsReport extends Item {

	public static int ID = 5001;
	
    public TpsReport() {
            super(ID);
           
            // Constructor Configuration
            maxStackSize = 64;
            setCreativeTab(CreativeTabs.tabMisc);
            setUnlocalizedName("tpsReport");
    }
   
    public String getTextureFile() {
            return CommonProxy.ITEMS_PNG;
    }

}
