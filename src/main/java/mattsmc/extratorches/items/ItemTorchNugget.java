package mattsmc.extratorches.items;

import mattsmc.extratorches.common.ExtraTorches;
import net.minecraft.item.Item;

public class ItemTorchNugget extends Item {
	public ItemTorchNugget() {
		setCreativeTab(ExtraTorches.ExtraTorchesTab);
		setUnlocalizedName("ItemTorchNugget");
		setTextureName(ExtraTorches.MODID + ":itemTorchNugget");
	}
}
