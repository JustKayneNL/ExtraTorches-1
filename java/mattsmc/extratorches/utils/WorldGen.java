//Extra Torches by MattsMc is licensed under a Creative Commons Attribution-NoDerivatives 4.0 International License.
//Based on a work at https://github.com/M...c/ExtraTorches.

package mattsmc.extratorches.utils;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class WorldGen {
	//generateOre(world, spawningblock, cycle's p/c, amount of cluster, random, x, z, max spawn hight//
	public static void generateOre(World world, Block block, int cycle,
			int amount, Random random, int x, int z, int yran) {
		for (int i = 0; i < cycle; i++) {
			int Xcords = x + random.nextInt(16);
			int Ycords = random.nextInt(yran);
			int Zcords = z + random.nextInt(16);
			new WorldGenMinable(block, amount).generate(world, random, Xcords,
					Ycords, Zcords);
		}
	}
}
