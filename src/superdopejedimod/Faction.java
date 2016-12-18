package superdopesquad.superdopejedimod;

import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class Faction extends BaseItem {

	
	public Faction(String unlocalizedName) {
		
		super(unlocalizedName);
		
		setCreativeTab(CreativeTabs.MISC);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand) {
		  
		Minecraft.getMinecraft().displayGuiScreen(new FactionGUI());
		  
		 return super.onItemRightClick(itemStackIn, worldIn, playerIn, hand);
	}
}