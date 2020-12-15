package poti.serversupport.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import poti.serversupport.ServerSupport;

public class get implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender.hasPermission("ServerSupport.get") || sender.isOp()) {
            if (args[0].equalsIgnoreCase("ip")) {
                for (String name : args) {
                    Player p = Bukkit.getPlayerExact(name);
                    if (p != null)
                        sender.sendMessage(ChatColor.YELLOW + p.getName() + "+ ChatColor.AQUA + "+ p.getAddress() + "+ ChatColor.YELLOW + ");
                }
            } else if (args[0].equalsIgnoreCase("uuid")) {
                for (String name : args) {
                    Player p = Bukkit.getPlayerExact(name);
                    if (p != null)
                        sender.sendMessage(ChatColor.YELLOW + p.getName() + "+ ChatColor.AQUA + "+ p.getUniqueId() + "+ ChatColor.YELLOW + ");
                }
            } else {
                sender.sendMessage(ChatColor.RED + "そのサブコマンドはありません");
            }
        } else {
            sender.sendMessage(ServerSupport.noPermission);
        }
        return true;
    }
}
