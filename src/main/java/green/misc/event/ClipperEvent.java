package green.misc.event;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.ItemStack;

public class ClipperEvent implements Listener {

  @EventHandler
  public void onInteract(PlayerInteractEntityEvent event) {
    Player player = event.getPlayer();

    Entity entity = event.getRightClicked();
    ItemStack item = player.getInventory().getItemInMainHand();

    if (item.getType() != Material.SHEARS) {
      return;
    }

    if (entity instanceof ItemFrame itemFrame) {

      itemFrame.setVisible(false);
      player.playSound(player.getLocation(), Sound.ENTITY_MOOSHROOM_SHEAR, 1, 1);

    }

  }

  @EventHandler
  public void onHit(EntityDamageByEntityEvent event) {

    if (event.getEntity() instanceof ItemFrame itemFrame) {
      itemFrame.setVisible(true);
    }

  }

}