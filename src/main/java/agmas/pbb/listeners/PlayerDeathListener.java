package agmas.pbb.listeners;

import agmas.pbb.utils.Repeated;
import agmas.pbb.utils.Role;
import agmas.pbb.utils.Var;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerDeathListener implements Listener {
    @EventHandler
    public void onDeath(PlayerDeathEvent event) {
        if (Var.getPlayerRole(event.getEntity()).equals(Role.PRISONER)) {
            event.setDeathMessage(ChatColor.DARK_GRAY + event.getDeathMessage());
        } else {
            if (Var.getPlayerRole(event.getEntity()).equals(Role.WARDEN)) {
                Var.warden = null;
                for (Player p : Bukkit.getOnlinePlayers()) {
                    p.sendTitle(ChatColor.RED + event.getEntity().getName(), ChatColor.DARK_RED + event.getDeathMessage().replace(event.getEntity().getName(), ""));
                }
            }
            event.setDeathMessage(ChatColor.RED + event.getDeathMessage());
        }
    }
}
