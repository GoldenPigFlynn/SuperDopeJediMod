package superDopeJediMod;

import java.util.Random;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.state.*;
//
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.item.Item;


public class BrownSteel extends BaseBlock {

	public BrownSteel(String unlocalizedName) {
		
		super(Material.rock, unlocalizedName);
		
		//this.setMaxStackSize(64);
		//this.setCreativeTab(CreativeTabs.tabMisc);
		//this.setUnlocalizedName("genericBlock");
	}
	
//	@SideOnly(Side.CLIENT)
//	public EnumWorldBlockLayer getBlockLayer() {
//		return EnumWorldBlockLayer.SOLID;
//	}
	
	
	@Override public boolean isOpaqueCube() {
		return true;
	}
	
	
	@Override public boolean isFullCube() {
		return true;
	}
	
	
	@Override public int getRenderType() {
		return 3;
	}
	
	public static final PropertyBool FIRSTPROPERTY = PropertyBool.create("boolean");
  
	@Override protected BlockState createBlockState() {
		return new BlockState(this, new IProperty[]{FIRSTPROPERTY});
		//return new BlockState(this, IProperty[] );
	}
    
	
	   public int getMetaFromState(IBlockState state) { return 0; }
	   public IBlockState getStateFromMeta(int meta) { return this.getDefaultState(); }


}
