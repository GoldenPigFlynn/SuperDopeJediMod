package superDopeJediMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class GaffiStick extends BaseItem {

	
	public GaffiStick(String unlocalizedName) {
		
		super(unlocalizedName);
		
<<<<<<< HEAD
		
		
		//this.setTextureName("superDopeJediMod:gaffiStick");
		
=======
		//this.setTextureName("superDopeJediMod:gaffiStick");
>>>>>>> origin/master
		//this.setMaxStackSize(64);
		//this.setCreativeTab(CreativeTabs.tabMisc);
		//this.setUnlocalizedName(unlocalizedName);
	}
	
	
	public void registerItem() {
		 //this.registerItem(this.gaffiStick, "Gaffi Stick");	
		 //String foo = i.getUnlocalizedName();
		System.out.println("MC-COMMENT:" + this.getUnlocalizedName());
		// this prints out "item.gaffiStick"
	    GameRegistry.registerItem(this, "Gaffi Stick");
	}
	
	
	public void registerRecipe() {
		
		// Recipe for creating a GaffiStick.
    	ItemStack stickStack = new ItemStack(Items.stick);
    	ItemStack ironIngotStack = new ItemStack(Items.iron_ingot);
    	GameRegistry.addRecipe(new ItemStack(this), "xx", " y", " x", 'x', ironIngotStack, 'y', stickStack);
	}
	
}
