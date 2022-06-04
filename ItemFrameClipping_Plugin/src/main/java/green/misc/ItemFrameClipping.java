package green.misc;

import green.misc.Events.ClipperEvent;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class ItemFrameClipping extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE + "[ItemFrameClippers]: plugin is enabled");
        getServer().getPluginManager().registerEvents(new ClipperEvent(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE + "[ItemFrameClippers]: plugin is disabled");
    }

}
