//Extra Torches by MattsMc is licensed under a Creative Commons Attribution-NoDerivatives 4.0 International License.
//Based on a work at https://github.com/M...c/ExtraTorches.

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
