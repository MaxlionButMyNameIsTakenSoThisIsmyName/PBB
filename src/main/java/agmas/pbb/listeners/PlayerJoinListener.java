package agmas.pbb.listeners;

import agmas.pbb.utils.Repeated;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

public class PlayerJoinListener implements Listener {
    @EventHandler
    public void onPlayerDropItem(PlayerJoinEvent event) {
        Repeated.prisonerify(event.getPlayer());
    }
}
