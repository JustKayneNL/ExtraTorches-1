package mattsmc.extratorches.items;

import cpw.mods.fml.common.IFuelHandler;
import mattsmc.extratorches.common.ExtraTorches;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemTorchIngot extends Item {
	public ItemTorchIngot() {
		setCreativeTab(ExtraTorches.ExtraTorchesTab);
		setUnlocalizedName("ItemExtraTorchIngot");
		setTextureName(ExtraTorches.MODID + ":itemExtraTorchIngot");
	}

}
