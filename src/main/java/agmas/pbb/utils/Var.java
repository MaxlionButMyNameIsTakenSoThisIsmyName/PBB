package agmas.pbb.utils;

import net.luckperms.api.LuckPerms;
import net.luckperms.api.LuckPermsProvider;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

import java.io.Console;
import java.util.HashMap;
import java.util.UUID;

public class Var {
    //simple class to store variables so PBB.java doesn't get cloggered
    public static HashMap<UUID, Role> roleHashMap = new HashMap<>();
    public static Player warden;
    public static LuckPerms api = LuckPermsProvider.get();
    public static HashMap<Player, Integer> askType = new HashMap<>();

    public static Role getPlayerRole(Player p) {
        if (roleHashMap.containsKey(p.getUniqueId())) {
            return roleHashMap.get(p.getUniqueId());
        } else {
            roleHashMap.put(p.getUniqueId(), Role.PRISONER);
            Bukkit.getLogger().warning("Couldn't find " + p.getName() + "'s role, defaulted to prisoner (Did you set the player's role to null?)");
            return Role.PRISONER;
        }
    }
}
