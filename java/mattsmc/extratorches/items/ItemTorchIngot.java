//Extra Torches by MattsMc is licensed under a Creative Commons Attribution-NoDerivatives 4.0 International License.
//Based on a work at https://github.com/M...c/ExtraTorches.

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
