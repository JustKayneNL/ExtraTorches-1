// Extra Torches by MattsMc is licensed under a Creative Commons
// Attribution-NoDerivatives 4.0 International License.
// Based on a work at https://github.com/M...c/ExtraTorches.

package mattsmc.extratorches.block;

import mattsmc.extratorches.common.ExtraTorches;
import mattsmc.extratorches.common.Registry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;

public class TorchBlock extends Block {

    public TorchBlock() {
        super(Material.sand);
        setCreativeTab(ExtraTorches.ExtraTorchesTab);
        setHardness(0.1F);
        setResistance(.1F);
        setLightLevel(2F);
        setLightOpacity(0);
        setBlockName("blockTorchBlock");
        setBlockTextureName(ExtraTorches.MODID + ":blockTorchBlock");
    }

    public int onBlockPlaced(World world, int x, int y, int z, int Side,
            float hitX, float hitY, float h, int meta) {
        placeBlock(world, x + 3, y, z);
        placeBlock(world, x, y, z + 3);
        placeBlock(world, x, y + 3, z);
        return meta;
    }

    public void onBlockDestroyedByPlayer(World world, int x, int y, int z,
            int meta) {
       removeBlock(world, x + 3, y, z);
       removeBlock(world, x, y + 3, z);
       removeBlock(world, x, y, z + 3);
    }

    public static void placeBlock(World world, int x, int y, int z) {
        if (!world.blockExists(x, y, z)) {
            world.setBlock(x, y, z, Registry.invisBlock);
        }
    }
    
    public static void removeBlock(World world, int x, int y, int z){
        world.setBlockToAir(x, y, z);
    }
}
