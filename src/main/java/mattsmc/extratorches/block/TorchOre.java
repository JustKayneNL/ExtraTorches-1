//Extra Torches by MattsMc is licensed under a Creative Commons Attribution-NoDerivatives 4.0 International License.
//Based on a work at https://github.com/M...c/ExtraTorches.

package mattsmc.extratorches.block;

import mattsmc.extratorches.common.ExtraTorches;
import net.minecraft.block.BlockOre;

public class TorchOre extends BlockOre {

	public TorchOre() {
		setCreativeTab(ExtraTorches.ExtraTorchesTab);
		setHardness(2.0F);
		setResistance(5.0F);
		setLightLevel(.5F);
		setLightOpacity(0);
		setHarvestLevel("pickaxe", 2);
		setBlockTextureName(ExtraTorches.MODID + ":oreTorchOre");
		setBlockName("oreTorchOre");
	}

}
