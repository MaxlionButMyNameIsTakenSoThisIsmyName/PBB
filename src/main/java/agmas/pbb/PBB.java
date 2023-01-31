package agmas.pbb;

import agmas.pbb.commands.AcceptCommand;
import agmas.pbb.commands.WardenCommand;
import agmas.pbb.listeners.InventoryBlockListener;
import agmas.pbb.listeners.PlayerDeathListener;
import agmas.pbb.listeners.PlayerJoinListener;
import agmas.pbb.listeners.PlayerRespawnListener;
import agmas.pbb.tasks.NoGMSHandler;
import agmas.pbb.tasks.PlayerTick;
import agmas.pbb.tasks.ScheduleHandler;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class PBB extends JavaPlugin {

    @Override
    public void onEnable() {

        //priority for noGMS
        NoGMSHandler task = new NoGMSHandler();
        task.runTaskTimer(this, 0, 1);

        //make REAL sure the worlds are loaded! fuck you spigot
        while (Bukkit.getWorld("world") == null) {}

        // schedule - loads of things require schedule so here it is
        ScheduleHandler task2 = new ScheduleHandler();
        task2.runTaskTimer(this, 0, 1);

        // tick players
        PlayerTick task3 = new PlayerTick();
        task3.runTaskTimer(this, 0, 1);

        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new PlayerJoinListener(), this);
        pm.registerEvents(new PlayerDeathListener(), this);
        pm.registerEvents(new InventoryBlockListener(), this);
        pm.registerEvents(new PlayerRespawnListener(), this);

        this.getCommand("warden").setExecutor(new WardenCommand());
        this.getCommand("accept").setExecutor(new AcceptCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
