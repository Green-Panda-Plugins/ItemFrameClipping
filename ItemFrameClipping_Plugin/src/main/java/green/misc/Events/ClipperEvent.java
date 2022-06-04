package green.misc.Events;

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
    public void onInteract(PlayerInteractEntityEvent event){
        Player player = event.getPlayer();
        try{
            Entity entity = event.getRightClicked();
            ItemStack item = player.getInventory().getItemInMainHand();
            if(item.getType() == Material.SHEARS){
                if(entity.getType() == EntityType.ITEM_FRAME){
                    ItemFrame itemFrame = (ItemFrame) entity;
                    itemFrame.setVisible(false);

                    player.playSound(player.getLocation(), Sound.ENTITY_MOOSHROOM_SHEAR, 1, 1);
                }
                else if(entity.getType() == EntityType.GLOW_ITEM_FRAME){
                    GlowItemFrame glowItemFrame = (GlowItemFrame) entity;
                    glowItemFrame.setVisible(false);

                    player.playSound(player.getLocation(), Sound.ENTITY_MOOSHROOM_SHEAR, 1, 1);
                }
            }

        } catch (Exception e){
            // Do nothing
        }
    }
    @EventHandler
    public void onHit(EntityDamageByEntityEvent event){
        try
        {
            Entity entity = event.getEntity();
            if(entity.getType() == EntityType.ITEM_FRAME){
                ItemFrame itemFrame = (ItemFrame) event;
                itemFrame.setVisible(true);
            }
            else if(entity.getType() == EntityType.GLOW_ITEM_FRAME){
                GlowItemFrame glowItemFrame = (GlowItemFrame) event;
                glowItemFrame.setVisible(false);
            }

        } catch (Exception e){
            // Do nothing
        }
    }
}