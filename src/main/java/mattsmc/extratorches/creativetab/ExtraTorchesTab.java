//Extra Torches by MattsMc is licensed under a Creative Commons Attribution-NoDerivatives 4.0 International License.
//Based on a work at https://github.com/M...c/ExtraTorches.

package mattsmc.extratorches.creativetab;

import mattsmc.extratorches.common.Registry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ExtraTorchesTab extends CreativeTabs{

	public ExtraTorchesTab(String tabName) {
		super(tabName);
	}

	@Override
	public Item getTabIconItem() {
		return Registry.itemExtraTorchesTabPlaceHolder;
	}

}
