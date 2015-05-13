//Extra Torches by MattsMc is licensed under a Creative Commons Attribution-NoDerivatives 4.0 International License.
//Based on a work at https://github.com/M...c/ExtraTorches.

package mattsmc.extratorches.mob.entity;

import net.minecraft.block.Block;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

public class EntityLightMob extends EntityMob {

	public EntityLightMob(World world) {
		super(world);
	}
	
	protected String getLivingSound() {
		return "mob.pig.say";
	}
	
	protected String getDeathSound() {
		return "mob.pig.death";
	}
	
	protected String getHurtSound() {
		return "mob.pig.say";
	}
	
    protected void func_145780_a(int p_145780_1_, int p_145780_2_, int p_145780_3_, Block p_145780_4_)
    {
        this.playSound("mob.pig.step", 0.15F, 1.0F);
    }

    public void applyEntityAttributes() {
    	super.applyEntityAttributes();
    	this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20D);
    	this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(32.8D);
    	this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.0D);
    	this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.70D);
    	
    }

//	@Override
//	public EntityAgeable createChild(EntityAgeable var1) {
//		// TODO Auto-generated method stub
//		return null;
//	}
}
