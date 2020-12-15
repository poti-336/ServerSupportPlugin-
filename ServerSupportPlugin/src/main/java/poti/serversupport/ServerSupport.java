package poti.serversupport;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import poti.serversupport.Commands.ChatClear;
import poti.serversupport.Commands.Fly;
import poti.serversupport.Commands.get;

public final class ServerSupport extends JavaPlugin {

    private  static  JavaPlugin plugin;

    public static String noPermission = ChatColor.RED + "あなたには実行する権限がありません。";

    @Override
    public void onEnable() {

        plugin = this;

        getCommand("ChatClear").setExecutor(new ChatClear());
        getCommand("get").setExecutor(new get());
        getCommand("fly").setExecutor(new Fly());

        super.onEnable();
    }

    @Override
    public void onDisable() {
        super.onDisable();

    }
    public  static JavaPlugin getPlugin() {return  plugin;}
}
