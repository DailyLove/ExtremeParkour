package com.DailyLove.ExtremeParkour.Listeners; 
  
import org.bukkit.entity.Player; 
import org.bukkit.event.EventHandler; 
import org.bukkit.event.Listener; 
import org.bukkit.event.entity.EntityDamageEvent; 
  
import com.DailyLove.ExtremeParkour.extremeParkour; 
  
public class damageListener implements Listener { 
    public damageListener(extremeParkour instance) { 
        plugin = instance; 
    } 
      
    @EventHandler
    public void onEntityDamage(EntityDamageEvent event) { 
        if(!(event.getEntity() instanceof Player)) 
            return; 
        if(event.getCause().equals(EntityDamageEvent.DamageCause.FALL) && ((Player)event.getEntity()).hasPermission("falldamage.off")) 
            event.setCancelled(true); 
    } 
      
    public static extremeParkour plugin; 
} 
