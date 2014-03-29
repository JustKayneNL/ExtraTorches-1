//Extra Torches by MattsMc is licensed under a Creative Commons Attribution-NoDerivatives 4.0 International License.
//Based on a work at https://github.com/M...c/ExtraTorches.

package mattsmc.extratorches.mob.render;

import mattsmc.extratorches.common.ExtraTorches;
import mattsmc.extratorches.mob.LightMob;
import mattsmc.extratorches.mob.entity.EntityLightMob;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderLightMob extends RenderLiving {

	private static final ResourceLocation EntityTexture = new ResourceLocation(
			ExtraTorches.MODID + ":textures/mobs/LightMob.png");
	protected LightMob model;

	public RenderLightMob(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		model = ((LightMob) mainModel);
	}

	public void renderLightMob(EntityLightMob entity, double par2, double par4,
			double par6, float par8, float par9) {
		super.doRender(entity, par2, par4, par6, par8, par9);

	}

	public void doRenderLiving(EntityLiving var1EntityLiving, double var2, double var4, double var6,
			float var8, float var9) {
		renderLightMob((EntityLightMob)var1EntityLiving, var2, var4, var6, var8, var9);
	}
	
	@Override
	public void doRender(Entity var1, double var2, double var4, double var6,
			float var8, float var9) {
		renderLightMob((EntityLightMob)var1, var2, var4, var6, var8, var9);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity e) {

		return EntityTexture;
	}

}
