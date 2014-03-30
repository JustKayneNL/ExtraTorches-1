package mattsmc.extratorches.common;

import mattsmc.extratorches.block.BetterCoalBlock;
import mattsmc.extratorches.block.BetterCoalOre;
import mattsmc.extratorches.block.BlackholeBlock;
import mattsmc.extratorches.block.TorchBlock;
import mattsmc.extratorches.block.TorchIngotBlock;
import mattsmc.extratorches.block.TorchOre;
import mattsmc.extratorches.common.help.RegisterHelper;
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

public class Registry {

	public static void load(){
		loadItems();
		loadCrafting();
	}
	
	public static ToolMaterial TorchMaterial = EnumHelper.addToolMaterial(
			"Torchinum", 3, 1300, 10.0F, 2F, 10);
	// Ores
	public static Block betterCoalOre;
	public static Block oreTorchOre;

	// Blocks
	public static Block torchBlock;
	public static Block blackholeBlock;
	public static Block torchIngotBlock;
	public static Block betterCoalBlock;

	// Tools
	public static Item toolHandHeldTorch;

	// Items
	public static Item itemTorchNugget;
	public static Item itemTorchDust;
	public static Item itemTorchRod;
	public static Item itemBetterCoal;
	public static Item itemExtraTorch;
	public static Item itemTorchIngot;
	public static Item itemExtraTorchesTabPlaceHolder;

	public static void loadItems() {
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

		RegisterHelper.registerBlock(betterCoalOre);
		RegisterHelper.registerBlock(oreTorchOre);

		// Blocks
		RegisterHelper.registerBlock(torchBlock);
		RegisterHelper.registerBlock(blackholeBlock);
		RegisterHelper.registerBlock(torchIngotBlock);
		RegisterHelper.registerBlock(betterCoalBlock);

		// Tools + Items
		RegisterHelper.registerItem(toolHandHeldTorch);
		RegisterHelper.registerItem(itemTorchNugget);
		RegisterHelper.registerItem(itemTorchDust);
		RegisterHelper.registerItem(itemTorchRod);
		RegisterHelper.registerItem(itemBetterCoal);
		RegisterHelper.registerItem(itemExtraTorch);
		RegisterHelper.registerItem(itemTorchIngot);
		RegisterHelper.registerItem(itemExtraTorchesTabPlaceHolder);

	}

	public static void loadCrafting() {
		GameRegistry
				.registerFuelHandler((IFuelHandler) itemBetterCoal);

		GameRegistry.addRecipe(new ItemStack(torchIngotBlock,
				1), new Object[] { "XXX", "XXX", "XXX", 'X',
				itemTorchIngot });

		GameRegistry.addShapelessRecipe(new ItemStack(
				itemTorchIngot, 9),
				new Object[] { torchIngotBlock });

		GameRegistry.addRecipe(new ItemStack(betterCoalBlock,
				1), new Object[] { "XXX", "XXX", "XXX", 'X',
				itemBetterCoal });
		GameRegistry.addShapelessRecipe(new ItemStack(
				itemBetterCoal, 9),
				new Object[] { betterCoalBlock });

		GameRegistry.addRecipe(
				new ItemStack(itemTorchRod, 1), new Object[] {
						"   ", " X ", " X ", 'X',
						itemTorchIngot });

		GameRegistry.addRecipe(new ItemStack(itemExtraTorch,
				2), new Object[] { "   ", " S ", " X ", 'X',
				itemTorchRod, 'S',
				itemBetterCoal });

		GameRegistry.addRecipe(new ItemStack(torchBlock, 1),
				new Object[] { "XXX", "XXX", "XXX", 'X',
						itemExtraTorch });

		GameRegistry.addShapelessRecipe(new ItemStack(
				itemExtraTorch, 9),
				new Object[] { torchBlock });

		GameRegistry.addShapelessRecipe(new ItemStack(
				itemTorchNugget, 9),
				new Object[] { itemTorchIngot });

		GameRegistry.addRecipe(new ItemStack(itemTorchIngot,
				1), new Object[] { "XXX", "XXX", "XXX", 'X',
				itemTorchNugget });

		GameRegistry.addRecipe(new ItemStack(
				toolHandHeldTorch, 1), new Object[] { "RS ",
				"SX ", "  X", 'X', itemTorchRod, 'S',
				torchIngotBlock, 'R',
				torchBlock });

		// Smelting Recipes
		GameRegistry.addSmelting(new ItemStack(itemTorchDust,
				9), new ItemStack(itemTorchIngot, 1), 0);

		GameRegistry.addSmelting(betterCoalOre,
				new ItemStack(itemBetterCoal, 2), 5);

		GameRegistry.addSmelting(oreTorchOre, new ItemStack(
				itemTorchIngot, 1), 10);
	}
}
