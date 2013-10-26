package com.DailyLove.ExtremeParkour.Listeners; 
  
import org.bukkit.ChatColor; 
import org.bukkit.event.EventHandler; 
import org.bukkit.event.Listener; 
import org.bukkit.event.server.ServerListPingEvent; 
  
import com.DailyLove.ExtremeParkour.extremeParkour; 
  
public class pingListener implements Listener { 
    public pingListener(extremeParkour instance) { 
        plugin = instance; 
    } 
      
    @EventHandler
    public void onServerListPing(ServerListPingEvent event) { 
        event.setMotd(ChatColor.GREEN + "NoGriefers" + ChatColor.GOLD + " | " 
        + event.getNumPlayers() + "/" + event.getMaxPlayers() + " | " + ChatColor.RED  
        + "Play Now!" + ChatColor.GREEN + "                       <- Parkour!"); 
    } 
      
    public static extremeParkour plugin; 
} 
