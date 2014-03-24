package mattsmc.extratorches.common;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;
import cpw.mods.fml.common.registry.GameRegistry;

public class ExtraTorchesCrafting {
	public static void init() {
		GameRegistry GR = new GameRegistry();
		GR.registerFuelHandler((IFuelHandler) ExtraTorchesItems.itemBetterCoal);

		GR.addRecipe(new ItemStack(ExtraTorchesItems.torchIngotBlock, 1),
				new Object[] { "XXX", "XXX", "XXX", 'X',
						ExtraTorchesItems.itemTorchIngot });

		GR.addShapelessRecipe(
				new ItemStack(ExtraTorchesItems.itemTorchIngot, 9),
				new Object[] { ExtraTorchesItems.torchIngotBlock });

		GR.addRecipe(new ItemStack(ExtraTorchesItems.betterCoalBlock, 1),
				new Object[] { "XXX", "XXX", "XXX", 'X',
						ExtraTorchesItems.itemBetterCoal });
		GR.addShapelessRecipe(
				new ItemStack(ExtraTorchesItems.itemBetterCoal, 9),
				new Object[] { ExtraTorchesItems.betterCoalBlock });

		GR.addRecipe(new ItemStack(ExtraTorchesItems.itemTorchRod, 1),
				new Object[] { "   ", " X ", " X ", 'X',
						ExtraTorchesItems.itemTorchIngot });

		GR.addRecipe(new ItemStack(ExtraTorchesItems.itemExtraTorch, 2),
				new Object[] { "   ", " S ", " X ", 'X',
						ExtraTorchesItems.itemTorchRod, 'S',
						ExtraTorchesItems.itemBetterCoal });

		GR.addRecipe(new ItemStack(ExtraTorchesItems.torchBlock, 1),
				new Object[] { "XXX", "XXX", "XXX", 'X',
						ExtraTorchesItems.itemExtraTorch });

		GR.addShapelessRecipe(
				new ItemStack(ExtraTorchesItems.itemExtraTorch, 9),
				new Object[] { ExtraTorchesItems.torchBlock });

		GR.addShapelessRecipe(new ItemStack(ExtraTorchesItems.itemTorchNugget,
				9), new Object[] { ExtraTorchesItems.itemTorchIngot });

		GR.addRecipe(new ItemStack(ExtraTorchesItems.itemTorchIngot, 1),
				new Object[] { "XXX", "XXX", "XXX", 'X',
						ExtraTorchesItems.itemTorchNugget });

		GR.addRecipe(new ItemStack(ExtraTorchesItems.toolHandHeldTorch, 1),
				new Object[] { "RS ", "SX ", "  X", 'X',
						ExtraTorchesItems.itemTorchRod, 'S',
						ExtraTorchesItems.torchIngotBlock, 'R',
						ExtraTorchesItems.torchBlock });

		// Smelting Recipes
		GR.addSmelting(new ItemStack(ExtraTorchesItems.itemTorchDust, 9),
				new ItemStack(ExtraTorchesItems.itemTorchIngot, 1), 0);

		GR.addSmelting(ExtraTorchesItems.betterCoalOre, new ItemStack(
				ExtraTorchesItems.itemBetterCoal, 2), 5);

		GR.addSmelting(ExtraTorchesItems.oreTorchOre, new ItemStack(
				ExtraTorchesItems.itemTorchIngot, 1), 10);
	}
}
