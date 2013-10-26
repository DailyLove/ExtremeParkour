package com.DailyLove.ExtremeParkour.Listeners; 
  
import net.milkbowl.vault.economy.EconomyResponse; 
  
import org.bukkit.ChatColor; 
import org.bukkit.Material; 
import org.bukkit.block.Block; 
import org.bukkit.block.Sign; 
import org.bukkit.entity.Player; 
import org.bukkit.event.EventHandler; 
import org.bukkit.event.Listener; 
import org.bukkit.event.block.Action; 
import org.bukkit.event.player.PlayerInteractEvent; 
import org.bukkit.inventory.ItemStack; 
  
import com.DailyLove.ExtremeParkour.extremeParkour; 
  
public class shopListener implements Listener { 
    public shopListener(extremeParkour instance) { 
        plugin = instance; 
    } 
      
    @SuppressWarnings("deprecation") 
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
        if(line[1].equalsIgnoreCase(ChatColor.BLUE + "ice helm")) { 
             EconomyResponse s = plugin.econ.withdrawPlayer(player.getName(), 50); 
             if(s.transactionSuccess()) { 
                 player.sendMessage(plugin.prefix + ChatColor.GREEN + "You purchased a Ice Helm."); 
                 player.getInventory().addItem(ice); 
                 player.updateInventory(); 
             } else { 
                 player.sendMessage(plugin.prefix + ChatColor.RED + "You don't have enough points!"); 
             } 
         } else if(line[1].equalsIgnoreCase(ChatColor.BLUE + "leaf helm")) { 
             EconomyResponse s = plugin.econ.withdrawPlayer(player.getName(), 90); 
             if(s.transactionSuccess()) { 
                 player.sendMessage(plugin.prefix + ChatColor.GREEN + "You purchased a Leaf Helm."); 
                 player.getInventory().addItem(leaf); 
                 player.updateInventory(); 
             } else { 
             } 
         } else if(line[1].equalsIgnoreCase(ChatColor.BLUE + "lamp helm")) { 
             EconomyResponse s = plugin.econ.withdrawPlayer(player.getName(), 100); 
             if(s.transactionSuccess()) { 
                 player.sendMessage(plugin.prefix + ChatColor.GREEN + "You purchased a Lamp Helm."); 
                 player.getInventory().addItem(lamp); 
                 player.updateInventory(); 
             } else { 
                 player.sendMessage(plugin.prefix + ChatColor.RED + "You don't have enough points!"); 
             } 
         } else if(line[1].equalsIgnoreCase(ChatColor.BLUE + "furnace helm")) { 
             EconomyResponse s = plugin.econ.withdrawPlayer(player.getName(), 130); 
             if(s.transactionSuccess()) { 
                 player.sendMessage(plugin.prefix + ChatColor.GREEN + "You purchased a Furnace Helm."); 
                 player.getInventory().addItem(furnace); 
                 player.updateInventory(); 
             } else { 
                 player.sendMessage(plugin.prefix + ChatColor.RED + "You don't have enough points!"); 
             } 
         } else if(line[1].equalsIgnoreCase(ChatColor.BLUE + "sponge helm")) { 
             EconomyResponse s = plugin.econ.withdrawPlayer(player.getName(), 160); 
             if(s.transactionSuccess()) { 
                 player.sendMessage(plugin.prefix + ChatColor.GREEN + "You purchased a Sponge Helm."); 
                 player.getInventory().addItem(sponge); 
                 player.updateInventory(); 
             } else { 
                 player.sendMessage(plugin.prefix + ChatColor.RED + "You don't have enough points!"); 
             } 
         } else if(line[1].equalsIgnoreCase(ChatColor.BLUE + "redstone helm")) { 
             EconomyResponse s = plugin.econ.withdrawPlayer(player.getName(), 200); 
             if(s.transactionSuccess()) { 
                 player.sendMessage(plugin.prefix + ChatColor.GREEN + "You purchased a Redstone Helm."); 
                 player.getInventory().addItem(redstone); 
                 player.updateInventory(); 
             } else { 
                 player.sendMessage(plugin.prefix + ChatColor.RED + "You don't have enough points!"); 
             } 
         } else if(line[1].equalsIgnoreCase(ChatColor.BLUE + "tnt helm")) { 
             EconomyResponse s = plugin.econ.withdrawPlayer(player.getName(), 300); 
             if(s.transactionSuccess()) { 
                 player.sendMessage(plugin.prefix + ChatColor.GREEN + "You purchased a TNT Helm."); 
                 player.getInventory().addItem(tnt); 
                 player.updateInventory(); 
             } else { 
                 player.sendMessage(plugin.prefix + ChatColor.RED + "You don't have enough points!"); 
             } 
         } else if(line[1].equalsIgnoreCase(ChatColor.BLUE + "diamond helm")) { 
             EconomyResponse s = plugin.econ.withdrawPlayer(player.getName(), 400); 
             if(s.transactionSuccess()) { 
                 player.sendMessage(plugin.prefix + ChatColor.GREEN + "You purchased a Diamond Helm."); 
                 player.getInventory().addItem(diamond); 
                 player.updateInventory(); 
             } else { 
                 player.sendMessage(plugin.prefix + ChatColor.RED + "You don't have enough points!"); 
             } 
         } else if(line[1].equalsIgnoreCase(ChatColor.BLUE + "obsidian helm")) { 
             EconomyResponse s = plugin.econ.withdrawPlayer(player.getName(), 500); 
             if(s.transactionSuccess()) { 
                 player.sendMessage(plugin.prefix + ChatColor.GREEN + "You purchased a Obsidian Helm."); 
                 player.getInventory().addItem(obsidian); 
                 player.updateInventory(); 
             } else { 
                 player.sendMessage(plugin.prefix + ChatColor.RED + "You don't have enough points!"); 
             } 
         } else if(line[1].equalsIgnoreCase(ChatColor.BLUE + "quartz helm")) { 
             EconomyResponse s = plugin.econ.withdrawPlayer(player.getName(), 600); 
             if(s.transactionSuccess()) { 
                 player.sendMessage(plugin.prefix + ChatColor.GREEN + "You purchased a Quartz Helm."); 
                 player.getInventory().addItem(quartz); 
                 player.updateInventory(); 
             } else { 
                 player.sendMessage(plugin.prefix + ChatColor.RED + "You don't have enough points!"); 
             } 
         } else if(line[1].equalsIgnoreCase(ChatColor.BLUE + "pumpkin helm1")) { 
             EconomyResponse s = plugin.econ.withdrawPlayer(player.getName(), 700); 
             if(s.transactionSuccess()) { 
                 player.sendMessage(plugin.prefix + ChatColor.GREEN + "You purchased a Pumpkin Helm1."); 
                 player.getInventory().addItem(pumpkin1); 
                 player.updateInventory(); 
             } else { 
                 player.sendMessage(plugin.prefix + ChatColor.RED + "You don't have enough points!"); 
             } 
         } else if(line[1].equalsIgnoreCase(ChatColor.BLUE + "pumpkin helm2")) { 
             EconomyResponse s = plugin.econ.withdrawPlayer(player.getName(), 800); 
             if(s.transactionSuccess()) { 
                 player.sendMessage(plugin.prefix + ChatColor.GREEN + "You purchased a Pumpkin Helm2."); 
                 player.getInventory().addItem(pumpkin2); 
                 player.updateInventory(); 
             } else { 
                 player.sendMessage(plugin.prefix + ChatColor.RED + "You don't have enough points!"); 
             } 
         } else if(line[1].equalsIgnoreCase(ChatColor.BLUE + "melon helm")) { 
             EconomyResponse s = plugin.econ.withdrawPlayer(player.getName(), 1000); 
             if(s.transactionSuccess()) { 
                 player.sendMessage(plugin.prefix + ChatColor.GREEN + "You purchased a Melon Helm."); 
                 player.getInventory().addItem(melon); 
                 player.updateInventory(); 
             } else { 
                 player.sendMessage(plugin.prefix + ChatColor.RED + "You don't have enough points!"); 
             } 
         } else if(line[1].equalsIgnoreCase(ChatColor.BLUE + "bedrock helm")) { 
             EconomyResponse s = plugin.econ.withdrawPlayer(player.getName(), 1500); 
             if(s.transactionSuccess()) { 
                 player.sendMessage(plugin.prefix + ChatColor.GREEN + "You purchased a Bedrock Helm."); 
                 player.getInventory().addItem(bedrock); 
                 player.updateInventory(); 
             } else { 
                 player.sendMessage(plugin.prefix + ChatColor.RED + "You don't have enough points!"); 
             } 
         } 
        } 
    } 
      
    public static extremeParkour plugin; 
    public ItemStack glass = new ItemStack(Material.GLASS, 1); 
    public ItemStack ice = new ItemStack(Material.ICE, 1); 
    public ItemStack leaf = new ItemStack(Material.LEAVES, 1); 
    public ItemStack lamp = new ItemStack(Material.REDSTONE_LAMP_OFF, 1); 
    public ItemStack furnace = new ItemStack(Material.FURNACE, 1); 
    public ItemStack sponge = new ItemStack(Material.SPONGE, 1); 
    public ItemStack redstone = new ItemStack(Material.REDSTONE_BLOCK, 1); 
    public ItemStack tnt = new ItemStack(Material.TNT, 1); 
    public ItemStack diamond = new ItemStack(Material.DIAMOND_ORE, 1); 
    public ItemStack obsidian = new ItemStack(Material.OBSIDIAN, 1); 
    public ItemStack quartz = new ItemStack(Material.QUARTZ_BLOCK, 1); 
    public ItemStack pumpkin1 = new ItemStack(Material.PUMPKIN, 1); 
    public ItemStack pumpkin2 = new ItemStack(Material.JACK_O_LANTERN, 1); 
    public ItemStack melon = new ItemStack(Material.MELON, 1); 
    public ItemStack bedrock = new ItemStack(Material.BEDROCK, 1); 
} 
