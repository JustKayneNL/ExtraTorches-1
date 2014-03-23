package mattsmc.extratorches.fuel;

import cpw.mods.fml.common.IFuelHandler;
import mattsmc.extratorches.common.ExtraTorches;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;

public class ItemBetterCoal extends Item implements IFuelHandler{
	public ItemBetterCoal() {
		setCreativeTab(ExtraTorches.ExtraTorchesTab);
		setUnlocalizedName("FuelBetterCoal");
		setTextureName(ExtraTorches.MODID + ":itemBetterCoal");
	}
	


	public int getBurnTime(ItemStack fuel) {
		return 3000;
	}

}
