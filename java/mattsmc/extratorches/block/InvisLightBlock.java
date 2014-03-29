//Extra Torches by MattsMc is licensed under a Creative Commons Attribution-NoDerivatives 4.0 International License.
//Based on a work at https://github.com/M...c/ExtraTorches.

package mattsmc.extratorches.block;

import mattsmc.extratorches.common.ExtraTorches;
import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.block.material.Material;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class InvisLightBlock extends Block {

	public InvisLightBlock() {
		super(Material.air);
		setCreativeTab(ExtraTorches.ExtraTorchesTab);
		setHardness(0.1F);
		setResistance(.1F);
		setLightLevel(2F);
		setLightOpacity(0);
		setBlockName("blockInvisLightBlock");
		}

	@Override
	public int getRenderType() {
		return -1;
	}
}
