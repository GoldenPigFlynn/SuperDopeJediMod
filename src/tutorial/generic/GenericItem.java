package tutorial.generic;

import net.minecraft.item.Item;
//import net.minecraft.creativetab.CreativeTabs
import net.minecraft.creativetab.*;


public class GenericItem extends Item {

	public GenericItem() {
		
		//this.maxStackSize = 64;
		// Constructor Configuration
		this.setMaxStackSize(64);
		this.setCreativeTab(CreativeTabs.tabMisc);
		this.setUnlocalizedName("genericItem");
	}

	
	///public GenericItem(int maxStackSize, CreativeTabs tab, int texture, String name) {
    //    setMaxStackSize(maxStackSize);
    //    setCreativeTab(tab);
    //   setUnlocalizedName(name);
}
	// Constructor Configuration
	//setMaxStackSize(64);
	////setCreativeTab(CreativeTabs.tabMisc);
	//setUnlocalizedName("genericItem");
