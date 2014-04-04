//Extra Torches by MattsMc is licensed under a Creative Commons Attribution-NoDerivatives 4.0 International License.
//Based on a work at https://github.com/M...c/ExtraTorches.

package mattsmc.extratorches.common;

import mattsmc.extratorches.utils.SendMessage;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;

public class EventListener {
	@SubscribeEvent
	public void onPlayerLogin(PlayerLoggedInEvent event) {
		if (event.player != null) {
			System.out.println(event.player.getCommandSenderName());
			
			if (event.player.getCommandSenderName().contains("TheMcExpess")) {
//				SendMessage.sendMessagePlayers("SSHT Matt Joined!");
			}
		}

	}
}
