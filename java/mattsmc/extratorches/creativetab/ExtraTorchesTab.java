package mattsmc.extratorches.creativetab;

import mattsmc.extratorches.common.ExtraTorches;
import mattsmc.extratorches.common.ExtraTorchesItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ExtraTorchesTab extends CreativeTabs{

	public ExtraTorchesTab(String tabName) {
		super(tabName);
	}

	@Override
	public Item getTabIconItem() {
		return ExtraTorchesItems.itemExtraTorchesTabPlaceHolder;
	}

}
