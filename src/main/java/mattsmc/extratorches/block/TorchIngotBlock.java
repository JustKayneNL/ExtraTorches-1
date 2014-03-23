package mattsmc.extratorches.block;

import mattsmc.extratorches.common.ExtraTorches;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class TorchIngotBlock extends Block {

	public TorchIngotBlock() {
		super(Material.rock);
		setCreativeTab(ExtraTorches.ExtraTorchesTab);
		setHardness(3.0F);
		setResistance(5.0F);
		setLightLevel(.2F);
		setLightOpacity(0);
		setBlockTextureName(ExtraTorches.MODID + ":blockTorchIngot");
		setBlockName("blockTorchIngot");
	}

}
