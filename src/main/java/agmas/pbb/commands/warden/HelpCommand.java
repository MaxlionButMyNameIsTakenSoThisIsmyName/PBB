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
        Inventory inv = Bukkit.createInventory(null, 9, "Warden Help");
        ItemStack whatwarden = new ItemStack(Material.PLAYER_HEAD);
        ItemMeta wwim = whatwarden.getItemMeta();
        ArrayList<String> lore = new ArrayList<>();
        lore.add(ChatColor.RED + "You're the warden!");
        lore.add(ChatColor.WHITE + "So... What now? Well, being the warden is an important role; \nand there are loads of playstyles! First, you'll need " + ChatColor.BLUE + "Guards." + ChatColor.WHITE + " You can\nSelect the best guards online with /guardelo and hire them\nwith /warden guard (name)!");
        wwim.setLore(lore);
        wwim.setDisplayName(ChatColor.GRAY + "How To " + ChatColor.RED + "Play");
        whatwarden.setItemMeta(wwim);
        inv.addItem(whatwarden);
        if (sender instanceof Player p) {
            p.openInventory(inv);
        }
        return true;
    }
}
