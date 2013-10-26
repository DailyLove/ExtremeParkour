package com.DailyLove.ExtremeParkour.Listeners; 
  
import org.bukkit.Bukkit; 
import org.bukkit.ChatColor; 
import org.bukkit.Sound; 
import org.bukkit.entity.Player; 
import org.bukkit.event.EventHandler; 
import org.bukkit.event.Listener; 
import org.bukkit.event.player.AsyncPlayerChatEvent; 
  
import com.DailyLove.ExtremeParkour.extremeParkour; 
  
public class extraListener implements Listener { 
    public extraListener(extremeParkour instance) { 
        plugin = instance; 
    } 
      
    @EventHandler
    public void onChat(AsyncPlayerChatEvent event) { 
        String replacement = ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("Color")); 
        String newMessage = event.getMessage(); 
            for(Player chat : Bukkit.getServer().getOnlinePlayers()) { 
                newMessage = newMessage.replaceAll("(?i)" + chat.getName(), replacement.replaceAll("%name", chat.getName())); 
            ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("Color")); 
            if (event.getMessage().toLowerCase().contains(chat.getName().toLowerCase())) { 
                chat.playSound(chat.getLocation(), Sound.NOTE_PIANO, 10, 5); 
            } 
        } 
        event.setMessage(newMessage); 
    } 
      
    public static extremeParkour plugin; 
} 
