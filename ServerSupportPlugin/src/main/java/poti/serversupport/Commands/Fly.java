package poti.serversupport.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import poti.serversupport.ServerSupport;

public class Fly implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender.hasPermission("ServerSupport.get") || sender.isOp()) {
            if (!(sender instanceof Player)) {
                sender.sendMessage("このコマンドはコンソールからは実行できません。");

                return true;

            } else if (args[0].equalsIgnoreCase("on")) {

                Player player = (Player) sender;
                player.setAllowFlight(true);
                player.sendMessage(ChatColor.YELLOW + "Flyを開始しました。");

                return true;
            } else if (args[0].equalsIgnoreCase("off")) {

                Player player = (Player) sender;
                player.setAllowFlight(false);
                player.sendMessage(ChatColor.YELLOW + "Flyを終了しました");
            } else {
                sender.sendMessage(ChatColor.RED + "サブコマンドはonまたはoffしかありません。");
            }
        } else {
            sender.sendMessage(ServerSupport.noPermission);
        }
        return true;
    }
}
