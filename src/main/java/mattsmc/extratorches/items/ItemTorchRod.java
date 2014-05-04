package mattsmc.extratorches.items;

import mattsmc.extratorches.common.ExtraTorches;
import net.minecraft.item.Item;

public class ItemTorchRod extends Item {
	public ItemTorchRod() {
		setCreativeTab(ExtraTorches.ExtraTorchesTab);
		setUnlocalizedName("ItemTorchRod");
		setTextureName(ExtraTorches.MODID + ":itemTorchRod");
	}
}
