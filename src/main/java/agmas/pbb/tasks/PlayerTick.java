package agmas.pbb.tasks;


import agmas.pbb.utils.Role;
import agmas.pbb.utils.Var;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.ArrayList;

//TASK TYPE - Every Player
public class PlayerTick extends BukkitRunnable {
    @Override
    public void run(){
        //TAB-MAKER
        ArrayList<String> prisoners = new ArrayList<>();
        ArrayList<String> guards = new ArrayList<>();
        StringBuilder prisoner = new StringBuilder();
        StringBuilder guard = new StringBuilder();
        for (Player doNotUseThisLoop : Bukkit.getOnlinePlayers()) {
            if (Var.getPlayerRole(doNotUseThisLoop).equals(Role.PRISONER)) {
                prisoners.add(doNotUseThisLoop.getDisplayName() + "\n");
            } else {
                guards.add(doNotUseThisLoop.getDisplayName() + "\n");
            }
        }

        for (String i : prisoners) {
            prisoner.append(i);
        }
        for (String i : guards) {
            guard.append(i);
        }

        String header = ChatColor.GOLD + "\nPrisonButBad\n\n" +
                ChatColor.WHITE + "made with " + ChatColor.RED + "love" + ChatColor.WHITE + " by agmass\n\n" +
                "{yr}\n" +
                ChatColor.GREEN + "Players Online: " + Bukkit.getOnlinePlayers().size()
                + ChatColor.BLUE + " (" + guards.size() + ChatColor.GOLD + "/" + prisoners.size() + ")\n\n"
                + ChatColor.BLUE + "Guards:\n" + guard
                + ChatColor.GOLD + "\nPrisoners:\n" + prisoner
                ;
        for (Player p : Bukkit.getOnlinePlayers()) {
            if (Var.warden == null) {
                p.spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent( ChatColor.RED + "NO WARDEN! " + ChatColor.GREEN + "Use /warden to become to become warden!"));
            }
            p.setDisplayName(ChatColor.GRAY + "[" + Var.getPlayerRole(p).roleColor + Var.getPlayerRole(p).displayName.toUpperCase() + ChatColor.GRAY + "] " + Var.getPlayerRole(p).ChattingColor + p.getName());
            //add support for LP prefixes here, maybe?
            //set up tab
            p.setPlayerListHeader(header.replace("{yr}", ChatColor.GRAY + "Your Role: " + Var.getPlayerRole(p).roleColor + Var.getPlayerRole(p).displayName) + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

        }
    }
}
