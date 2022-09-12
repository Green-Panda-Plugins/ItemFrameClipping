package green.misc;

import green.misc.event.ClipperEvent;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class ItemFrameClipping extends JavaPlugin {

  @Override
  public void onEnable() {

    getServer().getPluginManager().registerEvents(new ClipperEvent(), this);

  }

}