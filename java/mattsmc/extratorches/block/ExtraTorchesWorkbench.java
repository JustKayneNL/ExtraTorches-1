//Extra Torches by MattsMc is licensed under a Creative Commons Attribution-NoDerivatives 4.0 International License.
//Based on a work at https://github.com/M...c/ExtraTorches.

package mattsmc.extratorches.block;

import mattsmc.extratorches.common.ExtraTorches;
import net.minecraft.block.BlockWorkbench;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ExtraTorchesWorkbench extends BlockWorkbench {
    @SideOnly(Side.CLIENT)
    private IIcon field_150035_a;
    @SideOnly(Side.CLIENT)
    private IIcon field_150034_b;
    private static final String __OBFID = "CL_00000221";
    
	public ExtraTorchesWorkbench() {
		super();
		this.setCreativeTab(ExtraTorches.ExtraTorchesTab);
	}

	@SideOnly(Side.CLIENT)
	public TileEntity createNewTileEntity(World world, int i) {
		return null;
	}
	
	   @SideOnly(Side.CLIENT)
	    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
	    {
	        return p_149691_1_ == 1 ? this.field_150035_a : (p_149691_1_ == 0 ? Blocks.planks.getBlockTextureFromSide(p_149691_1_) : (p_149691_1_ != 2 && p_149691_1_ != 4 ? this.blockIcon : this.field_150034_b));
	    }

	    @SideOnly(Side.CLIENT)
	    public void registerBlockIcons(IIconRegister p_149651_1_)
	    {
	        this.blockIcon = p_149651_1_.registerIcon(this.getTextureName() + "_side");
	        this.field_150035_a = p_149651_1_.registerIcon(this.getTextureName() + "_top");
	        this.field_150034_b = p_149651_1_.registerIcon(this.getTextureName() + "_front");
	    }

	    /**
	     * Called upon block activation (right click on the block.)
	     */
	    public boolean onBlockActivated(World world, int p_149727_2_, int p_149727_3_, int p_149727_4_, EntityPlayer p_149727_5_, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_)
	    {
	        if (world.isRemote)
	        {
	            return true;
	        }
	        else
	        {
	            p_149727_5_.displayGUIWorkbench(p_149727_2_, p_149727_3_, p_149727_4_);
	            return true;
	        }
	    }
	

}
