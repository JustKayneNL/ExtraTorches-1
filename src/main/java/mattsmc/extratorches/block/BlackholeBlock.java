package mattsmc.extratorches.block;

import mattsmc.extratorches.common.ExtraTorches;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;

public class BlackholeBlock extends Block {

	public BlackholeBlock() {
		super(Material.rock);
		setCreativeTab(ExtraTorches.ExtraTorchesTab);
		setHardness(2F);
		setResistance(2F);
		setLightLevel(-10F);
		setBlockName("blockBlackholeBlockWIP");
		setBlockTextureName(ExtraTorches.MODID + ":blockBlackholeBlock");
	}
}
