package mattsmc.extratorches.common.help;

import mattsmc.extratorches.common.ExtraTorches;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;


public class RegisterHelper
{
    /**
* Registers all blocks. The basic format is [MODID_NAME]
* When you call this method, with your block assigned, it will take care of everything.
* @param block
*/
public static void registerBlock(Block block)
{
GameRegistry.registerBlock(block, ExtraTorches.MODID + "_" + block.getUnlocalizedName().substring(5));
}

    /**
* Registers all items. The basic format is [MODID_NAME]
* When you call this method, with your item assigned, it will take care of everything.
* @param item
*/
public static void registerItem(Item item)
{
GameRegistry.registerItem(item, ExtraTorches.MODID + "_" + item.getUnlocalizedName().substring(5));
}
}