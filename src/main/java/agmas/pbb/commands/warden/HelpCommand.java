package agmas.pbb.commands.warden;

import agmas.pbb.utils.Repeated;
import agmas.pbb.utils.Role;
import agmas.pbb.utils.Var;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class HelpCommand implements CommandExecutor {

    // This method is called, when somebody uses our command
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage(ChatColor.GRAY + "--------------------------------");
        sender.sendMessage(ChatColor.RED + "WARDEN COMMANDS");
        sender.sendMessage(ChatColor.BLUE + "/warden guard " + ChatColor.DARK_BLUE + "(name)" + ChatColor.GRAY + " - " + ChatColor.RED + "Makes a player a guard.");
        sender.sendMessage(ChatColor.BLUE + "/warden nurse " + ChatColor.DARK_BLUE + "(nurse)" + ChatColor.GRAY + " - " + ChatColor.RED + "Makes a player a nurse.");
        sender.sendMessage(ChatColor.BLUE + "/warden help " + ChatColor.GRAY + " - " + ChatColor.RED + "Send these messages.");
        sender.sendMessage(ChatColor.GRAY + "--------------------------------");
        return true;
    }
}
