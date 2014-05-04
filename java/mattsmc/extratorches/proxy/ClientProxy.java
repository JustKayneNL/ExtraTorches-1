//Extra Torches by MattsMc is licensed under a Creative Commons Attribution-NoDerivatives 4.0 International License.
//Based on a work at https://github.com/M...c/ExtraTorches.

package mattsmc.extratorches.proxy;

import mattsmc.extratorches.mob.LightMob;
import mattsmc.extratorches.mob.entity.EntityLightMob;
import mattsmc.extratorches.mob.render.RenderLightMob;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {

	public void renderInformation(){
		
		RenderingRegistry.registerEntityRenderingHandler(EntityLightMob.class, new RenderLightMob(new LightMob(), 0.3F));
		
	}
}
