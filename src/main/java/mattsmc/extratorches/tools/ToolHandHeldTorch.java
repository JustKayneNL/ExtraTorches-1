//Extra Torches by MattsMc is licensed under a Creative Commons Attribution-NoDerivatives 4.0 International License.
//Based on a work at https://github.com/M...c/ExtraTorches.

package mattsmc.extratorches.tools;

import mattsmc.extratorches.common.ExtraTorches;
import mattsmc.extratorches.common.Registry;
import net.minecraft.item.ItemSword;

public class ToolHandHeldTorch extends ItemSword  {
	public ToolHandHeldTorch() {
		super(Registry.TorchMaterial);
		setCreativeTab(ExtraTorches.ExtraTorchesTab);
		setUnlocalizedName("ToolHandHeldTorch");
		setTextureName(ExtraTorches.MODID + ":toolHandHeldTorch");
		setFull3D();		
	}
}
