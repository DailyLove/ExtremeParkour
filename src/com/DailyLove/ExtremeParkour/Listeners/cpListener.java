package com.DailyLove.ExtremeParkour.Listeners; 
  
import org.bukkit.ChatColor; 
import org.bukkit.Material; 
import org.bukkit.block.Block; 
import org.bukkit.block.Sign; 
import org.bukkit.entity.Player; 
import org.bukkit.event.EventHandler; 
import org.bukkit.event.Listener; 
import org.bukkit.event.block.Action; 
import org.bukkit.event.player.PlayerInteractEvent; 
  
import com.DailyLove.ExtremeParkour.extremeParkour; 
  
public class cpListener implements Listener { 
    public cpListener(extremeParkour instance) { 
        plugin = instance; 
    } 
  
    @EventHandler
    public void clickHandler(PlayerInteractEvent event) { 
        Player player = event.getPlayer(); 
        if(event.getAction() != Action.RIGHT_CLICK_BLOCK) 
            return; 
          
        Block clickedBlock = event.getClickedBlock(); 
        if(clickedBlock.getType() != Material.SIGN && clickedBlock.getType() != Material.SIGN_POST &clickedBlock.getType() != Material.WALL_SIGN) 
            return; 
        Sign thisSign = (Sign)clickedBlock.getState(); 
        String line[] = thisSign.getLines(); { 
            if(event.getAction() == Action.RIGHT_CLICK_BLOCK) { 
                 if(line[1].equalsIgnoreCase(ChatColor.GREEN + "[checkpoint]")) { 
                     plugin.getConfig().set(player.getName() + ".world", player.getLocation().getWorld().getName()); 
                     plugin.getConfig().set(player.getName() + ".x", player.getLocation().getX()); 
                     plugin.getConfig().set(player.getName() + ".y", player.getLocation().getY()); 
                     plugin.getConfig().set(player.getName() + ".z", player.getLocation().getZ()); 
                     plugin.getConfig().set(player.getName() + ".yaw", player.getLocation().getYaw()); 
                     plugin.getConfig().set(player.getName() + ".pitch", player.getLocation().getPitch()); 
                     plugin.saveConfig(); 
                     player.sendMessage(plugin.prefix + ChatColor.GREEN + "Checkpoint Saved!"); 
                     return; 
                 } 
            } 
        } 
    } 
    public static extremeParkour plugin; 
} 
