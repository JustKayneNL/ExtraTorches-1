package mattsmc.extratorches.common;

import mattsmc.extratorches.utils.SendMessage;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import aroma1997.core.client.util.Colors;
import aroma1997.core.log.LogHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;

public class EventListener {
	@SubscribeEvent
	public void onPlayerLogin(PlayerLoggedInEvent event) {
		if (event.player != null) {
			System.out.println(event.player.getCommandSenderName());
			
			if (event.player.getCommandSenderName().contains("TheMcExpess")) {
				SendMessage.sendMessagePlayers(Colors.LIGHTBLUE
						+ "SSHT Matt Joined!");
			}
		}

	}
}
