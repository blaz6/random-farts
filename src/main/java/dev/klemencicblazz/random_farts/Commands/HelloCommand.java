package dev.klemencicblazz.random_farts.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginLogger;

public class HelloCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player player) {
            player.sendMessage("Hello " + player.getName() + "!");
        } else {
            PluginLogger.getLogger("").warning("ne");
        }

        return true;
    }
}
