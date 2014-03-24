package mattsmc.extratorches.items;

import mattsmc.extratorches.common.ExtraTorches;
import net.minecraft.item.Item;

public class ItemExtraTorch extends Item {
	public ItemExtraTorch() {
		setCreativeTab(ExtraTorches.ExtraTorchesTab);
		setUnlocalizedName("ItemExtraTorch");
		setTextureName(ExtraTorches.MODID + ":itemExtraTorch");
	}
}
