package agmas.pbb.commands.warden;
import agmas.pbb.utils.Repeated;
import agmas.pbb.utils.Role;
import agmas.pbb.utils.Var;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DefaultCommand implements CommandExecutor {

    // This method is called, when somebody uses our command
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player p) {
            if (Var.warden == null) {
                Var.warden = p;
                Var.roleHashMap.put(p.getUniqueId(), Role.WARDEN);
                p.sendTitle(ChatColor.RED + p.getName(), ChatColor.GREEN + "is the new warden!");
                Repeated.setKit(p);
            }
        }
        return true;
    }
}