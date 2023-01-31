package agmas.pbb.commands;

import agmas.pbb.PBB;
import agmas.pbb.commands.warden.DefaultCommand;
import agmas.pbb.commands.warden.GuardCommand;
import agmas.pbb.commands.warden.HelpCommand;
import agmas.pbb.utils.Repeated;
import agmas.pbb.utils.Role;
import agmas.pbb.utils.Var;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Arrays;

public class WardenCommand implements CommandExecutor {

    // This method is called, when somebody uses our command
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;

        if (args.length == 0) {
            new DefaultCommand().onCommand(sender, command, "", new String[0]);
            return true;
        }

        if (Var.warden != player)
            return true;

        CommandExecutor subcommand = switch (args[0]) {
            case "guard" -> new GuardCommand();
            default -> new HelpCommand();
        };

        String[] subArgs = Arrays.copyOfRange(args, 1, args.length);
        subcommand.onCommand(sender, command, args[0], subArgs);
        return true;
    }
}