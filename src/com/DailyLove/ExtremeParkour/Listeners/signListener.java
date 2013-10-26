package com.DailyLove.ExtremeParkour.Listeners; 
  
import org.bukkit.ChatColor; 
import org.bukkit.entity.Player; 
import org.bukkit.event.EventHandler; 
import org.bukkit.event.Listener; 
import org.bukkit.event.block.SignChangeEvent; 
  
import com.DailyLove.ExtremeParkour.extremeParkour; 
  
public class signListener implements Listener { 
    public signListener(extremeParkour instance) { 
        plugin = instance; 
    } 
      
    @EventHandler
    public void onSignChange(SignChangeEvent event) { 
        Player player = event.getPlayer(); 
  
        if(player.hasPermission("parkour.sign.*") || player.hasPermission("parkour.*")) { 
            if(event.getLine(0).equalsIgnoreCase("checkpoint")) { 
                event.setLine(0, ChatColor.DARK_BLUE + "============="); 
                event.setLine(1, ChatColor.GREEN + "[Checkpoint]"); 
                event.setLine(2, ChatColor.DARK_RED + "Right-Click"); 
                event.setLine(3, ChatColor.DARK_BLUE + "============="); 
            } else if(event.getLine(0).equalsIgnoreCase("rankup")) { 
                event.setLine(0, ChatColor.DARK_BLUE + "============="); 
                event.setLine(1, ChatColor.BLUE + "[Rank Up]"); 
                event.setLine(2, ChatColor.AQUA + "Right-Click"); 
                event.setLine(3, ChatColor.DARK_BLUE + "============="); 
            } else if(event.getLine(0).equalsIgnoreCase("glass helm")) { 
                event.setLine(0, ChatColor.DARK_BLUE + "============="); 
                event.setLine(1, ChatColor.BLUE + "Glass Helm"); 
                event.setLine(2, ChatColor.GREEN + "30 Points"); 
                event.setLine(3, ChatColor.DARK_BLUE + "============="); 
            } else if(event.getLine(0).equalsIgnoreCase("ice helm")) { 
                event.setLine(0, ChatColor.DARK_BLUE + "============="); 
                event.setLine(1, ChatColor.BLUE + "Ice Helm"); 
                event.setLine(2, ChatColor.GREEN + "50 Points"); 
                event.setLine(3, ChatColor.DARK_BLUE + "============="); 
            } else if(event.getLine(0).equalsIgnoreCase("leaf helm")) { 
                event.setLine(0, ChatColor.DARK_BLUE + "============="); 
                event.setLine(1, ChatColor.BLUE + "Leaf Helm"); 
                event.setLine(2, ChatColor.GREEN + "90 Points"); 
                event.setLine(3, ChatColor.DARK_BLUE + "============="); 
            } else if(event.getLine(0).equalsIgnoreCase("lamp helm")) { 
                event.setLine(0, ChatColor.DARK_BLUE + "============="); 
                event.setLine(1, ChatColor.BLUE + "Lamp Helm"); 
                event.setLine(2, ChatColor.GREEN + "100 Points"); 
                event.setLine(3, ChatColor.DARK_BLUE + "============="); 
            } else if(event.getLine(0).equalsIgnoreCase("furnace helm")) { 
                event.setLine(0, ChatColor.DARK_BLUE + "============="); 
                event.setLine(1, ChatColor.BLUE + "Furnace Helm"); 
                event.setLine(2, ChatColor.GREEN + "130 Points"); 
                event.setLine(3, ChatColor.DARK_BLUE + "============="); 
            } else if(event.getLine(0).equalsIgnoreCase("sponge helm")) { 
                event.setLine(0, ChatColor.DARK_BLUE + "============="); 
                event.setLine(1, ChatColor.BLUE + "Sponge Helm"); 
                event.setLine(2, ChatColor.GREEN + "160 Points"); 
                event.setLine(3, ChatColor.DARK_BLUE + "============="); 
            } else if(event.getLine(0).equalsIgnoreCase("redstone helm")) { 
                event.setLine(0, ChatColor.DARK_BLUE + "============="); 
                event.setLine(1, ChatColor.BLUE + "Redstone Helm"); 
                event.setLine(2, ChatColor.GREEN + "200 Points"); 
                event.setLine(3, ChatColor.DARK_BLUE + "============="); 
            } else if(event.getLine(0).equalsIgnoreCase("tnt helm")) { 
                event.setLine(0, ChatColor.DARK_BLUE + "============="); 
                event.setLine(1, ChatColor.BLUE + "TNT Helm"); 
                event.setLine(2, ChatColor.GREEN + "300 Points"); 
                event.setLine(3, ChatColor.DARK_BLUE + "============="); 
            } else if(event.getLine(0).equalsIgnoreCase("diamond helm")) { 
                event.setLine(0, ChatColor.DARK_BLUE + "============="); 
                event.setLine(1, ChatColor.BLUE + "Diamond Helm"); 
                event.setLine(2, ChatColor.GREEN + "400 Points"); 
                event.setLine(3, ChatColor.DARK_BLUE + "============="); 
            } else if(event.getLine(0).equalsIgnoreCase("obsidian helm")) { 
                event.setLine(0, ChatColor.DARK_BLUE + "============="); 
                event.setLine(1, ChatColor.BLUE + "Obsidian Helm"); 
                event.setLine(2, ChatColor.GREEN + "500 Points"); 
                event.setLine(3, ChatColor.DARK_BLUE + "============="); 
            } else if(event.getLine(0).equalsIgnoreCase("quartz helm")) { 
                event.setLine(0, ChatColor.DARK_BLUE + "============="); 
                event.setLine(1, ChatColor.BLUE + "Quartz Helm"); 
                event.setLine(2, ChatColor.GREEN + "600 Points"); 
                event.setLine(3, ChatColor.DARK_BLUE + "============="); 
            } else if(event.getLine(0).equalsIgnoreCase("pumpkin helm1")) { 
                event.setLine(0, ChatColor.DARK_BLUE + "============="); 
                event.setLine(1, ChatColor.BLUE + "Pumpkin Helm1"); 
                event.setLine(2, ChatColor.GREEN + "700 Points"); 
                event.setLine(3, ChatColor.DARK_BLUE + "============="); 
            } else if(event.getLine(0).equalsIgnoreCase("pumpkin helm2")) { 
                event.setLine(0, ChatColor.DARK_BLUE + "============="); 
                event.setLine(1, ChatColor.BLUE + "Pumpkin Helm2"); 
                event.setLine(2, ChatColor.GREEN + "800 Points"); 
                event.setLine(3, ChatColor.DARK_BLUE + "============="); 
            } else if(event.getLine(0).equalsIgnoreCase("melon helm")) { 
                event.setLine(0, ChatColor.DARK_BLUE + "============="); 
                event.setLine(1, ChatColor.BLUE + "Melon Helm"); 
                event.setLine(2, ChatColor.GREEN + "1000 Points"); 
                event.setLine(3, ChatColor.DARK_BLUE + "============="); 
            } else if(event.getLine(0).equalsIgnoreCase("bedrock helm")) { 
                event.setLine(0, ChatColor.DARK_BLUE + "============="); 
                event.setLine(1, ChatColor.BLUE + "Bedrock Helm"); 
                event.setLine(2, ChatColor.GREEN + "1500 Points"); 
                event.setLine(3, ChatColor.DARK_BLUE + "============="); 
            } else if(event.getLine(0).equalsIgnoreCase("easy")) { 
                event.setLine(0, ChatColor.GREEN + "============="); 
                event.setLine(1, "Ranked:"); 
                event.setLine(2, ChatColor.BOLD + "EASY"); 
                event.setLine(3, ChatColor.GREEN + "============="); 
            } else if(event.getLine(0).equalsIgnoreCase("medium")) { 
                event.setLine(0, ChatColor.YELLOW + "============="); 
                event.setLine(1, "Ranked:"); 
                event.setLine(2, ChatColor.BOLD + "MEDIUM"); 
                event.setLine(3, ChatColor.YELLOW + "============="); 
            } else if(event.getLine(0).equalsIgnoreCase("hard")) { 
                event.setLine(0, ChatColor.DARK_RED + "============="); 
                event.setLine(1, "Ranked:"); 
                event.setLine(2, ChatColor.BOLD + "HARD"); 
                event.setLine(3, ChatColor.DARK_RED + "============="); 
            } else if(event.getLine(0).equalsIgnoreCase("expert")) { 
                event.setLine(0, ChatColor.DARK_PURPLE + "============="); 
                event.setLine(1, "Ranked:"); 
                event.setLine(2, ChatColor.BOLD + "EXPERT"); 
                event.setLine(3, ChatColor.DARK_PURPLE + "============="); 
            } else if(event.getLine(0).equalsIgnoreCase("insane")) { 
                event.setLine(0, ChatColor.GOLD + "============="); 
                event.setLine(1, "Ranked:"); 
                event.setLine(2, ChatColor.BOLD + "INSANE"); 
                event.setLine(3, ChatColor.GOLD + "============="); 
            } 
        } 
    } 
      
    public static extremeParkour plugin; 
} 
