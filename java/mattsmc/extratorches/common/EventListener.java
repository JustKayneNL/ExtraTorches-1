// Extra Torches by MattsMc is licensed under a Creative Commons
// Attribution-NoDerivatives 4.0 International License.
// Based on a work at https://github.com/M...c/ExtraTorches.

package mattsmc.extratorches.common;

import mattsmc.extratorches.utils.SendMessage;
import mattsmc.extratorches.utils.XMLParser;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;

public class EventListener {
    @SubscribeEvent
    public void onPlayerLogin(PlayerLoggedInEvent event) {

        boolean updateRequired = XMLParser.isNewUpdate(
                ExtraTorches.VERSIONCHECKURL, ExtraTorches.MCVERSION,
                ExtraTorches.MODID, ExtraTorches.VERSION);

        if (updateRequired) {
            SendMessage.sendPMP(event.player,
                    "There Is A New Update Avalable for ExtraTorches.");
            SendMessage.sendPMP(
                    event.player,
                    "Current Version: "
                            + ExtraTorches.VERSION
                            + " New Version: "
                            + XMLParser.returnVersion(
                                    ExtraTorches.VERSIONCHECKURL,
                                    ExtraTorches.MCVERSION, ExtraTorches.MODID,
                                    ExtraTorches.VERSION));
        }

        if (event.player.getDisplayName().equals("TheMcExpress")) {
            SendMessage.sendPMP(event.player,
                    "(ExtraTorches) Master, Where have you been?");
        }
    }

}
