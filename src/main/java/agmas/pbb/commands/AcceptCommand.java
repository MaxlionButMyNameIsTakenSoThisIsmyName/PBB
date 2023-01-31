package agmas.pbb.commands;
import agmas.pbb.utils.Repeated;
import agmas.pbb.utils.Role;
import agmas.pbb.utils.Var;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AcceptCommand implements CommandExecutor {

    // This method is called, when somebody uses our command
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player p) {
            switch (Var.askType.get(p)) {
                case 1:
                    Bukkit.broadcastMessage(ChatColor.BLUE + p.getName() + " was hired as a guard!");
                    Var.roleHashMap.put(p.getUniqueId(), Role.GUARD);
                    Repeated.setKit(p);
                default:
                    p.sendMessage(ChatColor.RED + "You haven't been hired!");
            }
        }
        return true;
    }
}