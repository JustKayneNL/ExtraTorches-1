package mattsmc.extratorches.block;

import cpw.mods.fml.common.IFuelHandler;
import mattsmc.extratorches.common.ExtraTorches;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;

public class BetterCoalBlock extends Block implements IFuelHandler{

	public BetterCoalBlock() {
		super(Material.rock);
		setCreativeTab(ExtraTorches.ExtraTorchesTab);
		setHardness(3.0F);
		setResistance(5.0F);
		setLightLevel(.2F);
		setLightOpacity(0);
		setBlockTextureName(ExtraTorches.MODID + ":blockBetterCoal");
		setBlockName("blockBetterCoal");
	}

	@Override
	public int getBurnTime(ItemStack fuel) {
		return 27000;
	}

}
