package agmas.pbb.listeners;

import agmas.pbb.utils.Repeated;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.ArrayList;

public class InventoryBlockListener implements Listener {
    @EventHandler
    public void onJoin(InventoryClickEvent event) {
        ArrayList<String> blockedInvs = new ArrayList<>();
        blockedInvs.add("Warden Help");
        blockedInvs.add("Select Guard Type");
        if (blockedInvs.contains(event.getView().getTitle())) {
            event.setCancelled(true);
        }
    }
}
