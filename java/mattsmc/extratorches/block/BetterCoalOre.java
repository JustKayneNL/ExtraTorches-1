//Extra Torches by MattsMc is licensed under a Creative Commons Attribution-NoDerivatives 4.0 International License.
//Based on a work at https://github.com/M...c/ExtraTorches.

package mattsmc.extratorches.block;

import java.util.Random;

import mattsmc.extratorches.common.ExtraTorches;
import mattsmc.extratorches.common.ExtraTorchesItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;

public class BetterCoalOre extends BlockOre {
	
    public Item getItemDropped(int i, Random random, int j)
    {
        return ExtraTorchesItems.itemBetterCoal;
    }
    
    public int quantityDropped(Random rand){
    	return rand.nextInt(2) + 1;
    }
	
    
	  public int getExpDrop(IBlockAccess blockaccess, int p_149690_5_, int p_149690_7_)
	    {
			return p_149690_7_;
		  
	    }
	  
	public BetterCoalOre() {
		setCreativeTab(ExtraTorches.ExtraTorchesTab);
		setHardness(3.0F);
		setResistance(5.0F);
		setLightLevel(.5F);
		setLightOpacity(0);
		setHarvestLevel("pickaxe", 2);
		setBlockTextureName(ExtraTorches.MODID + ":oreBetterCoal");
		setBlockName("oreBetterCoal");
	}
}
