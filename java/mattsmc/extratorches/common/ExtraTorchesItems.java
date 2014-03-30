//Extra Torches by MattsMc is licensed under a Creative Commons Attribution-NoDerivatives 4.0 International License.
//Based on a work at https://github.com/M...c/ExtraTorches.

package mattsmc.extratorches.common;

import mattsmc.extratorches.block.BetterCoalBlock;
import mattsmc.extratorches.block.BetterCoalOre;
import mattsmc.extratorches.block.BlackholeBlock;
import mattsmc.extratorches.block.TorchBlock;
import mattsmc.extratorches.block.TorchIngotBlock;
import mattsmc.extratorches.block.TorchOre;
import mattsmc.extratorches.fuel.ItemBetterCoal;
import mattsmc.extratorches.items.ItemExtraTorch;
import mattsmc.extratorches.items.ItemTorchDust;
import mattsmc.extratorches.items.ItemTorchIngot;
import mattsmc.extratorches.items.ItemTorchNugget;
import mattsmc.extratorches.items.ItemTorchRod;
import mattsmc.extratorches.tools.ToolHandHeldTorch;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.IFuelHandler;
import cpw.mods.fml.common.registry.GameRegistry;

public class ExtraTorchesItems {

	public static Block betterCoalOre;
	public static Block oreTorchOre;
	public static Block torchBlock;
	public static Block blackholeBlock;
	public static Block torchIngotBlock;
	public static Block betterCoalBlock;
	public static Item toolHandHeldTorch;
	public static Item itemTorchNugget;
	public static Item itemTorchDust;
	public static Item itemTorchRod;
	public static Item itemBetterCoal;
	public static Item itemExtraTorch;
	public static Item itemTorchIngot;
	public static Item itemExtraTorchesTabPlaceHolder;
	public static ToolMaterial TorchMaterial;

	public static void loadItems() {
		TorchMaterial = EnumHelper.addToolMaterial("Torchinum", 3, 1300, 10.0F,
				2F, 10);

		// public static Block invisLightBlock = new InvisLightBlock();
		// public static Block ExtraTorchesBench = new ExtraTorchesWorkbench();

		// Ores
		betterCoalOre = new BetterCoalOre();

		oreTorchOre = new TorchOre();

		// Blocks
		torchBlock = new TorchBlock();

		blackholeBlock = new BlackholeBlock();

		torchIngotBlock = new TorchIngotBlock();

		betterCoalBlock = new BetterCoalBlock();

		// Tools
		toolHandHeldTorch = new ToolHandHeldTorch();

		// Items
		itemTorchNugget = new ItemTorchNugget();

		itemTorchDust = new ItemTorchDust();

		itemTorchRod = new ItemTorchRod();

		itemBetterCoal = new ItemBetterCoal();

		itemExtraTorch = new ItemExtraTorch();

		itemTorchIngot = new ItemTorchIngot();

		itemExtraTorchesTabPlaceHolder = new Item().setTextureName(
				"ExtraTorches:itemCreativeExtraTorches").setUnlocalizedName(
				"ExtraTorchesTabPlaceHolder");

	}
}
