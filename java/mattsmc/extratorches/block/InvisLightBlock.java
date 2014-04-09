//Extra Torches by MattsMc is licensed under a Creative Commons Attribution-NoDerivatives 4.0 International License.
//Based on a work at https://github.com/M...c/ExtraTorches.

package mattsmc.extratorches.block;

import mattsmc.extratorches.common.ExtraTorches;
import mattsmc.extratorches.tile.TileInvisLightBlock;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class InvisLightBlock extends BlockContainer {

	public InvisLightBlock() {
		super(Material.rock);
		setCreativeTab(ExtraTorches.ExtraTorchesTab);
		setHardness(0.1F);
		setResistance(.1F);
		setLightLevel(2F);
		setLightOpacity(0);
		setBlockName("blockInvisLightBlock");
		this.setBlockBounds(16,16,16,16,16,16);
		}

	@Override
	public int getRenderType() {
		return -1;
	}

	@Override
	public boolean isOpaqueCube() {
	    return false;
	};
	
    @Override
    public TileEntity createNewTileEntity(World var1, int var2) {
        return new TileInvisLightBlock();
    }
}
