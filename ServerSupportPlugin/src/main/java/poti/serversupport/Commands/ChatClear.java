package poti.serversupport.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import poti.serversupport.ServerSupport;

public class ChatClear implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender.hasPermission("ServerSupport.ChatClear") || sender.isOp()) {

            for (int i = 0; i < 100; ++i) {
                Bukkit.broadcastMessage(" ");
            }

            Bukkit.broadcastMessage(ChatColor.GRAY + "チャットのクリーンが完了しました。");

        } else {
            sender.sendMessage(ServerSupport.noPermission);
        }


        return true;
    }

}