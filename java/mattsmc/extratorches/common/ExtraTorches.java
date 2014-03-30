package mattsmc.extratorches.common;

import mattsmc.extratorches.creativetab.ExtraTorchesTab;
import mattsmc.extratorches.mob.entity.EntityLightMob;
import mattsmc.extratorches.proxy.CommonProxy;
import mattsmc.extratorches.utils.MobEgg;
import mattsmc.extratorches.worldgen.ExtraTorchesGeneralWG;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EnumCreatureType;

import org.apache.logging.log4j.Logger;

import aroma1997.core.log.LogHelper;
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
	
	public static Logger logger = LogHelper.genNewLogger(MODID);
	

	public static ExtraTorchesGeneralWG worldgen1 = new ExtraTorchesGeneralWG();

	// Creative Tabs//
	public static CreativeTabs ExtraTorchesTab = new ExtraTorchesTab(
			"ExtraTorches");

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		 Registry.load();
		
			EntityRegistry.findGlobalUniqueEntityId();
			EntityRegistry.registerGlobalEntityID(EntityLightMob.class, "mobLight",
					EntityRegistry.findGlobalUniqueEntityId());
			EntityRegistry.addSpawn(EntityLightMob.class, 10, 2, 4,
					EnumCreatureType.ambient);
			MobEgg.registerEntityEgg(EntityLightMob.class, 0xFFCC00, 0xFFFF00);
		
		GameRegistry.registerWorldGenerator(worldgen1, 1);
	}

}
