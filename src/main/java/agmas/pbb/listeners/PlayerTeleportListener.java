package agmas.pbb.listeners;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.inventory.ItemStack;

public class PlayerTeleportListener implements Listener {
    @EventHandler
    public void onDeath(PlayerTeleportEvent event) {
       if (event.getCause().equals(PlayerTeleportEvent.TeleportCause.SPECTATE)) {
           event.setCancelled(true);
       }
    }
}
