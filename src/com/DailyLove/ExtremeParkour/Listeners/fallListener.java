package com.DailyLove.ExtremeParkour.Listeners; 
  
import org.bukkit.Bukkit; 
import org.bukkit.ChatColor; 
import org.bukkit.Location; 
import org.bukkit.World; 
import org.bukkit.entity.Player; 
import org.bukkit.event.EventHandler; 
import org.bukkit.event.Listener; 
import org.bukkit.event.player.PlayerMoveEvent; 
  
import com.DailyLove.ExtremeParkour.extremeParkour; 
  
public class fallListener implements Listener { 
    public fallListener(extremeParkour instance) { 
        plugin = instance; 
    } 
      
    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) { 
        Player player = (Player) event.getPlayer(); 
        if(player.getLocation().getY() < 40 && player.getLocation().getWorld().equals(Bukkit.getServer().getWorld("parkour"))) { 
            if(!(plugin.getConfig().getString(player.getName() + ".world") == null)) { 
                World w = Bukkit.getServer().getWorld(plugin.getConfig().getString(player.getName() + ".world")); 
                double x = plugin.getConfig().getDouble(player.getName() + ".x"); 
                double y = plugin.getConfig().getDouble(player.getName() + ".y"); 
                double z = plugin.getConfig().getDouble(player.getName() + ".z"); 
                float yaw = (float) plugin.getConfig().getDouble(player.getName() + ".yaw"); 
                float pitch = (float) plugin.getConfig().getDouble(player.getName() + ".pitch"); 
                player.teleport(new Location(w, x, y, z, yaw, pitch)); 
                player.sendMessage(plugin.prefix + ChatColor.RED + "You fell! Returned to Checkpoint."); 
            } else { 
                World w = Bukkit.getServer().getWorld(plugin.getConfig().getString("lobby.world")); 
                double x = plugin.getConfig().getDouble("lobby.x"); 
                double y = plugin.getConfig().getDouble("lobby.y"); 
                double z = plugin.getConfig().getDouble("lobby.z"); 
                float yaw = (float) plugin.getConfig().getDouble("lobby.yaw"); 
                float pitch = (float) plugin.getConfig().getDouble("lobby.pitch"); 
                player.teleport(new Location(w, x, y, z, yaw, pitch)); 
                player.sendMessage(plugin.prefix + ChatColor.RED + "No Checkpoint found! Returned to spawn."); 
                      
            } 
        } 
    } 
      
    public static extremeParkour plugin; 
} 
