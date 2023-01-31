package agmas.pbb.listeners;

import agmas.pbb.utils.Role;
import agmas.pbb.utils.Var;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.ItemStack;

public class PlayerRespawnListener implements Listener {
    @EventHandler
    public void onDeath(PlayerRespawnEvent event) {
        event.getPlayer().sendTitle(ChatColor.RED + "YOU DIED!", ChatColor.BLUE + "You'll respawn in 30s!");
        event.getPlayer().getInventory().setItem(4, new ItemStack(Material.WHITE_CONCRETE));
        event.getPlayer().getInventory().setItem(5, new ItemStack(Material.BLUE_CONCRETE));
        event.getPlayer().setCooldown(Material.WHITE_CONCRETE, 20 * 30);
        event.getPlayer().setCooldown(Material.BLUE_CONCRETE, (20 * 30) - 1);
    }
}
