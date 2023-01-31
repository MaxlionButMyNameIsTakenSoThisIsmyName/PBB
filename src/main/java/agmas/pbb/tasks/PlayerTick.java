package agmas.pbb.tasks;


import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

//TASK TYPE - Every Player
public class PlayerTick extends BukkitRunnable {
    @Override
    public void run(){
        for (Player p : Bukkit.getOnlinePlayers()) {
            //will need later
        }
    }
}
