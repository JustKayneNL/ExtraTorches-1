package mattsmc.extratorches.mob.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.world.World;

public class EntityLightMob extends EntityAnimal {

	public EntityLightMob(World world) {
		super(world);
	}

	@Override
	public EntityAgeable createChild(EntityAgeable var1) {
		return null;
	}

}
