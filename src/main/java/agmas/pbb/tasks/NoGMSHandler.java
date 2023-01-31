package agmas.pbb.tasks;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

//Blocks use of GMS and such to avoid people griefing if another loop breaks.
//TASK TYPE - Every Player
public class NoGMSHandler extends BukkitRunnable {
    @Override
    public void run(){
        for (Player p : Bukkit.getOnlinePlayers()) {
            if (p.getGameMode().equals(GameMode.SURVIVAL))
                p.setGameMode(GameMode.ADVENTURE);
        }
    }
}
