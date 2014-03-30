//Extra Torches by MattsMc is licensed under a Creative Commons Attribution-NoDerivatives 4.0 International License.
//Based on a work at https://github.com/M...c/ExtraTorches.

package mattsmc.extratorches.common;

import mattsmc.extratorches.creativetab.ExtraTorchesTab;
import mattsmc.extratorches.mob.entity.EntityLightMob;
import mattsmc.extratorches.proxy.CommonProxy;
import mattsmc.extratorches.utils.MobEgg;
import mattsmc.extratorches.worldgen.ExtraTorchesGeneralWG;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityList.EntityEggInfo;
import net.minecraft.entity.EnumCreatureType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraft.entity.EntityList.EntityEggInfo;

import org.apache.logging.log4j.Logger;

import aroma1997.core.log.LogHelper;
import aroma1997.core.util.AromaRegistry;
import aroma1997.core.version.VersionCheck;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = ExtraTorches.MODID, name = ExtraTorches.NAME, version = ExtraTorches.VERSION)
public class ExtraTorches {
	@SidedProxy(clientSide = "mattsmc.extratorches.proxy.ClientProxy", serverSide = "mattsmc.extratorches.proxy.CommonProxy")
	public static CommonProxy proxy;

	public static final String MODID = "ExtraTorches";
	public static final String NAME = "Extra Torches";
	public static final String VERSION = "1.0.1";

	public static Logger logger = LogHelper.genNewLogger(MODID);

	public static ExtraTorchesGeneralWG worldgen1 = new ExtraTorchesGeneralWG();

	// Creative Tabs//
	public static CreativeTabs ExtraTorchesTab = new ExtraTorchesTab(
			"ExtraTorches");

	Minecraft mc = FMLClientHandler.instance().getClient();;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {		
		ExtraTorchesItems.loadItems();

		EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(EntityLightMob.class, "mobLight",
				EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.addSpawn(EntityLightMob.class, 10, 2, 4,
				EnumCreatureType.ambient);
		MobEgg.registerEntityEgg(EntityLightMob.class, 0xFFCC00, 0xFFFF00);

		GameRegistry.registerWorldGenerator(worldgen1, 1);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		EventListener el = new EventListener();
		FMLCommonHandler.instance().bus().register(el);
		MinecraftForge.EVENT_BUS.register(el);
		VersionCheck
				.registerVersionChecker(
						MODID,
						VERSION,
						"https://dl.dropboxusercontent.com/s/rlck89aub6tl6i8/VersionCheck.xml?dl=1&token_hash=AAGRUWWpB9iwn7JF0TI6kKTqJFgSu-4UHF6Gn5woFcYg1Q",
						"https://tinyurl.com/MattsMods");

		proxy.renderInformation();
	}
}
