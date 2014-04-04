package mattsmc.extratorches.utils;

import mattsmc.extratorches.common.ExtraTorches;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class RegisterHelper {
    public static void registerBlock(Block block) {
        GameRegistry.registerBlock(block, ExtraTorches.MODID + "_"
                + block.getUnlocalizedName().substring(5));
    }

    public static void registerItem(Item item) {
        GameRegistry.registerItem(item, ExtraTorches.MODID + "_"
                + item.getUnlocalizedName().substring(5));
    }
}
