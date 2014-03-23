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
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ExtraTorchesItems {	
	public static ToolMaterial TorchMaterial = EnumHelper.addToolMaterial("Torchinum", 3, 1300, 10.0F, 2F, 10);
	//Block Registration
	
	//public static Block invisLightBlock = new InvisLightBlock();
	//public static Block ExtraTorchesBench = new ExtraTorchesWorkbench();
	
	//Ores
	public static Block betterCoalOre = new BetterCoalOre();
	
	public static Block oreTorchOre = new TorchOre();
	
	//Blocks
	public static Block torchBlock = new TorchBlock();

	public static Block blackholeBlock = new BlackholeBlock();
	
	public static Block torchIngotBlock = new TorchIngotBlock();
	
	public static Block betterCoalBlock = new BetterCoalBlock();

	//Tools
	public static Item toolHandHeldTorch = new ToolHandHeldTorch();
	
	//Items	
	public static Item itemTorchNugget = new ItemTorchNugget();
	
	public static Item itemTorchDust = new ItemTorchDust();
	
	public static Item itemTorchRod = new ItemTorchRod();
	
	public static Item itemBetterCoal = new ItemBetterCoal();
	
	public static Item itemExtraTorch = new ItemExtraTorch();
	
	public static Item itemTorchIngot = new ItemTorchIngot();
	
	public static Item itemExtraTorchesTabPlaceHolder = new Item().setTextureName(
			"ExtraTorches:itemCreativeExtraTorches").setUnlocalizedName(
			"ExtraTorchesTabPlaceHolder");
}
