package mattsmc.extratorches.items;

import mattsmc.extratorches.common.ExtraTorches;
import net.minecraft.item.Item;

public class ItemTorchIngot extends Item {
	public ItemTorchIngot() {
		setCreativeTab(ExtraTorches.ExtraTorchesTab);
		setUnlocalizedName("ItemExtraTorchIngot");
		setTextureName(ExtraTorches.MODID + ":itemExtraTorchIngot");
	}

}
