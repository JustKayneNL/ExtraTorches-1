// Extra Torches by MattsMc is licensed under a Creative Commons
// Attribution-NoDerivatives 4.0 International License.
// Based on a work at https://github.com/M...c/ExtraTorches.

package mattsmc.extratorches.utils;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;

public class SendMessage {
    public static void sendPMP(EntityPlayer player, String message) {
        player.addChatMessage(new ChatComponentText(message));
    }
}
