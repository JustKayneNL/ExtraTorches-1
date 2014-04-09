//Extra Torches by MattsMc is licensed under a Creative Commons Attribution-NoDerivatives 4.0 International License.
//Based on a work at https://github.com/M...c/ExtraTorches.

package mattsmc.extratorches.fuel;

import mattsmc.extratorches.common.ExtraTorches;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class ItemBetterCoal extends Item implements IFuelHandler {
	public ItemBetterCoal() {
		setCreativeTab(ExtraTorches.ExtraTorchesTab);
		setUnlocalizedName("FuelBetterCoal");
		setTextureName(ExtraTorches.MODID + ":itemBetterCoal");
	}
	


	public int getBurnTime(ItemStack fuel) {
		return 3200;
	}

}
