package com.sperlazzasaurus.dojo.minecraft.OfficeMod.common.blocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TpsReport extends Item{

	public TpsReport(int id) {
		super(id);

		maxStackSize = 64;
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("tpsReport");
	}

}
