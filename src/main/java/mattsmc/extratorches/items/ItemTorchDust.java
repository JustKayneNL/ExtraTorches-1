package mattsmc.extratorches.items;

import mattsmc.extratorches.common.ExtraTorches;
import net.minecraft.item.Item;

public class ItemTorchDust extends Item {
	public ItemTorchDust() {
		setCreativeTab(ExtraTorches.ExtraTorchesTab);
		setUnlocalizedName("ItemTorchDust");
		setTextureName(ExtraTorches.MODID + ":itemTorchDust");
	}
}
