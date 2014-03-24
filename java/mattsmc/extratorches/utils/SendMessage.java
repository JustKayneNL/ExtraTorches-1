package mattsmc.extratorches.utils;

import mattsmc.extratorches.common.ExtraTorches;
import net.minecraft.command.ICommandSender;
import aroma1997.core.log.LogHelper;

public class SendMessage {
	public static void sendMessagePlayers(String message) {
		LogHelper.sendMessageToPlayers(ExtraTorches.logger, message);
	}

	public static void sendMessagePlayer(ICommandSender player, String message) {
		LogHelper.sendMessageToPlayer(ExtraTorches.logger, player, message);
	}

	
}
