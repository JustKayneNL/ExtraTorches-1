//Extra Torches by MattsMc is licensed under a Creative Commons Attribution-NoDerivatives 4.0 International License.
//Based on a work at https://github.com/M...c/ExtraTorches.

package mattsmc.extratorches.block;

import mattsmc.extratorches.common.ExtraTorches;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.World;

public class TorchBlock extends Block {

	public TorchBlock() {
		super(Material.sand);
		setCreativeTab(ExtraTorches.ExtraTorchesTab);
		setHardness(0.1F);
		setResistance(.1F);
		setLightLevel(2F);
		setLightOpacity(0);
		setBlockName("blockTorchBlock");
		setBlockTextureName(ExtraTorches.MODID + ":blockTorchBlock");
	}

}
