//Extra Torches by MattsMc is licensed under a Creative Commons Attribution-NoDerivatives 4.0 International License.
//Based on a work at https://github.com/M...c/ExtraTorches.

package mattsmc.extratorches.worldgen;

import java.util.Random;

import mattsmc.extratorches.common.ExtraTorchesItems;
import mattsmc.extratorches.utils.WorldGen;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;

public class ExtraTorchesGeneralWG implements IWorldGenerator {

	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
		case -1: generateNether(world, random, chunkX * 16, chunkZ * 16);
		case 0: generateSurface(world, random, chunkX * 16, chunkZ * 16);
		case 1: generateEnd(world, random, chunkX * 16, chunkZ * 16);
		}
	}

	public void generateSurface(World world, Random random, int x, int z) {
		WorldGen.generateOre(world, ExtraTorchesItems.betterCoalOre, 10, 7, random,
				x, z, 80);
		WorldGen.generateOre(world, ExtraTorchesItems.oreTorchOre, 9, 5, random,
				x, z, 50);
	}

	public void generateNether(World world, Random random, int i, int j) {
		//Nope
	}
	
	public void generateEnd(World world, Random random, int i, int j) { 
		//Nope
	}
}
