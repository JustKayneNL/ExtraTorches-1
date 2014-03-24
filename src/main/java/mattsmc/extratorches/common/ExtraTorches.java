package mattsmc.extratorches.common;

import mattsmc.extratorches.creativetab.ExtraTorchesTab;
import mattsmc.extratorches.mob.entity.EntityLightMob;
import mattsmc.extratorches.proxy.CommonProxy;
import mattsmc.extratorches.updater.CheckUpdate;
import mattsmc.extratorches.worldgen.ExtraTorchesGeneralWG;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import aroma1997.core.util.AromaRegistry;
import cpw.mods.fml.common.IFuelHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = ExtraTorches.MODID, name = ExtraTorches.NAME, version = ExtraTorches.VERSION)
public class ExtraTorches {
	@SidedProxy(clientSide = "mattsmc.extratorches.proxy.ClientProxy", serverSide = "mattsmc.extratorches.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	public static final String MODID = "ExtraTorches";
	public static final String NAME = "Extra Torches";
	public static final String VERSION = "1.0";
	
	GameRegistry GR = new GameRegistry();

	public static ExtraTorchesGeneralWG worldgen1 = new ExtraTorchesGeneralWG();

	// Creative Tabs//
	public static CreativeTabs ExtraTorchesTab = new ExtraTorchesTab(
			"ExtraTorches");

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		AromaRegistry.register(ExtraTorchesItems.class);
		AromaRegistry.register(ExtraTorchesCrafting.class);
		
		EntityRegistry.registerGlobalEntityID(EntityLightMob.class, "mobLight",
				300);
		EntityRegistry.addSpawn(EntityLightMob.class, 10, 2, 4,
				EnumCreatureType.ambient);
		EntityRegistry.findGlobalUniqueEntityId();

		
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
		
		GR.addShapelessRecipe(new ItemStack(ExtraTorchesItems.itemExtraTorch,
				9), new Object[] { ExtraTorchesItems.torchBlock});

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

		GR.registerWorldGenerator(worldgen1, 1);
	}

}
