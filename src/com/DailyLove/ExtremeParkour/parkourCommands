package com.DailyLove.ExtremeParkour; 
  
import net.milkbowl.vault.economy.EconomyResponse; 
  
import org.bukkit.Bukkit; 
import org.bukkit.ChatColor; 
import org.bukkit.Location; 
import org.bukkit.World; 
import org.bukkit.command.Command; 
import org.bukkit.command.CommandExecutor; 
import org.bukkit.command.CommandSender; 
import org.bukkit.entity.Player; 
import org.bukkit.inventory.ItemStack; 
  
public class parkourCommands implements CommandExecutor { 
    public parkourCommands(extremeParkour instance) { 
        plugin = instance; 
        unknown = ChatColor.DARK_RED + "Unknown Command"; 
        permission = ChatColor.RED + "You don't have permission to do that."; 
    } 
    public static boolean isInteger(String s) { 
        try {  
            Integer.parseInt(s);  
        } catch(NumberFormatException e) {  
            return false;  
        } 
        return true; 
    } 
      
    @SuppressWarnings("deprecation") 
    public boolean onCommand(CommandSender s, Command cmd, String commandLabel, String[] args) { 
        if(cmd.getName().equalsIgnoreCase("parkour") || cmd.getName().equalsIgnoreCase("pa")) { 
            if(!(s instanceof Player)) { 
                s.sendMessage("Only players can use Parkour commands."); 
                return true; 
            } 
            Player p = (Player) s; 
              
            if(args.length == 0) { 
                p.sendMessage(plugin.prefix + ChatColor.GREEN + "ExtremeParkour v0.6.5, By " + ChatColor.GOLD + "DailyLove"); 
                p.sendMessage(plugin.prefix + ChatColor.GREEN + "Type '/parkour help' for a list of commands!"); 
                return true; 
            } 
              
            if(args[0].equalsIgnoreCase("points")) { 
                if(args.length == 1) { 
                    p.sendMessage(plugin.prefix + ChatColor.GREEN + "You have " + plugin.econ.format(plugin.econ.getBalance(p.getName()))); 
                    return true; 
                } 
                if(args[1].equalsIgnoreCase("send")) { 
                    if(args.length != 4) { 
                        p.sendMessage(plugin.prefix + ChatColor.RED + "Invalid syntax - /parkour points send <name> <amount>"); 
                        return true; 
                    } 
                    Player t = Bukkit.getServer().getPlayer(args[2]); 
                    if(t == null) { 
                        p.sendMessage(plugin.prefix + ChatColor.RED + "Player does not exist!"); 
                        return true; 
                    } 
                    if(t.getName() == p.getName()) { 
                        p.sendMessage(plugin.prefix + ChatColor.RED + "You cannot send points to yourself!"); 
                        return true; 
                    } 
                    if(!isInteger(args[3])) { 
                        p.sendMessage(plugin.prefix + ChatColor.RED + "That is not a valid amount!"); 
                        return true; 
                    } 
                    Integer amount = Integer.parseInt(args[3]); 
                    EconomyResponse giver = plugin.econ.withdrawPlayer(p.getName(), amount); 
                    if(giver.transactionSuccess()) { 
                        EconomyResponse recipient = plugin.econ.depositPlayer(t.getName(), amount); 
                        if(recipient.transactionSuccess()) { 
                            t.sendMessage(plugin.prefix + ChatColor.AQUA + p.getName() + ChatColor.GREEN + " has sent you " + ChatColor.GOLD + amount + ChatColor.GREEN + " Point(s)!"); 
                            p.sendMessage(plugin.prefix + ChatColor.GREEN + amount + " Point(s) sent."); 
                        } 
                    } else { 
                        p.sendMessage(plugin.prefix + ChatColor.RED + "You don't have enough points!"); 
                    } 
                    return true; 
                } 
                if(args[1].equalsIgnoreCase("check")) { 
                    if(!p.hasPermission("parkour.admin") || !p.hasPermission("parkour.*") || !p.hasPermission("parkour.points.*") || !p.hasPermission("parkour.points.check")) { 
                        p.sendMessage(plugin.prefix + permission); 
                        return true; 
                    } 
                    if(args.length != 3) { 
                        p.sendMessage(plugin.prefix + ChatColor.RED + "Invalid syntax - /parkour points check <name>"); 
                        return true; 
                    } 
                    Player t = Bukkit.getServer().getPlayer(args[2]); 
                    if(t == null) { 
                        p.sendMessage(plugin.prefix + ChatColor.RED + "Player does not exist!"); 
                        return true; 
                    } 
                    p.sendMessage(plugin.prefix + ChatColor.GREEN + t.getName() + " has " + plugin.econ.format(plugin.econ.getBalance(t.getName()))); 
                    return true; 
                } 
                if(args[1].equalsIgnoreCase("take")) { 
                    if(!p.hasPermission("parkour.admin") || !p.hasPermission("parkour.*") || !p.hasPermission("parkour.points.*") || !p.hasPermission("parkour.points.take")) { 
                        p.sendMessage(plugin.prefix + permission); 
                        return true; 
                    } 
                    if(args.length != 4) { 
                        p.sendMessage(plugin.prefix + ChatColor.RED + "Invalid syntax - /parkour points take <name> <amount>"); 
                        return true; 
                    } 
                    Player t = Bukkit.getServer().getPlayer(args[2]); 
                    if(t == null) { 
                        p.sendMessage(plugin.prefix + ChatColor.RED + "Player does not exist!"); 
                        return true; 
                    } 
                    if(!isInteger(args[3])) { 
                        p.sendMessage(plugin.prefix + ChatColor.RED + "That is not a valid amount!"); 
                        return true; 
                    } 
                    Integer amount = Integer.parseInt(args[3]); 
                    EconomyResponse giver = plugin.econ.withdrawPlayer(t.getName(), amount); 
                    if(giver.transactionSuccess()) { 
                        p.sendMessage(plugin.prefix + ChatColor.GREEN + "You took " + ChatColor.GOLD + amount + ChatColor.GREEN + " Point(s) from " + ChatColor.AQUA + t.getName()); 
                        t.sendMessage(plugin.prefix + ChatColor.DARK_RED + "Administrator" + ChatColor.GREEN + " took " + ChatColor.GOLD + amount + ChatColor.GREEN + " Point(s) from you!"); 
                    } else { 
                        p.sendMessage(plugin.prefix + ChatColor.RED + "You cannot take more than what a player has!"); 
                    } 
                    return true; 
                } 
                if(args[1].equalsIgnoreCase("add")) { 
                    if(!p.hasPermission("parkour.admin") || !p.hasPermission("parkour.*") || !p.hasPermission("parkour.points.*") || !p.hasPermission("parkour.points.add")) { 
                        p.sendMessage(plugin.prefix + permission); 
                        return true; 
                    } 
                    if(args.length != 4) { 
                        p.sendMessage(plugin.prefix + ChatColor.RED + "Invalid syntax - /parkour points add <name> <amount>"); 
                        return true; 
                    } 
                    Player t = Bukkit.getServer().getPlayer(args[2]); 
                    if(t == null) { 
                        p.sendMessage(plugin.prefix + ChatColor.RED + "Player does not exist!"); 
                        return true; 
                    } 
                    if(!isInteger(args[3])) { 
                        p.sendMessage(plugin.prefix + ChatColor.RED + "That is not a valid amount!"); 
                        return true; 
                    } 
                    Integer amount = Integer.parseInt(args[3]); 
                    EconomyResponse giver = plugin.econ.depositPlayer(t.getName(), amount); 
                    if(giver.transactionSuccess()) { 
                        p.sendMessage(plugin.prefix + ChatColor.GREEN + "You gave " + ChatColor.GOLD + amount + ChatColor.GREEN + " Point(s) to " + ChatColor.AQUA + t.getName()); 
                        t.sendMessage(plugin.prefix + ChatColor.DARK_RED + "Administrator" + ChatColor.GREEN + " gave you " + ChatColor.GOLD + amount + ChatColor.GREEN + " Point(s)!"); 
                    } 
                    return true; 
                } 
                p.sendMessage(plugin.prefix + ChatColor.RED + "Invalid arguments! /parkour points (check/send/take/add)"); 
                return true; 
            } 
              
            if(args[0].equalsIgnoreCase("help")) { 
                if(args.length != 1) { 
                    p.sendMessage(plugin.prefix + ChatColor.RED + "Invalid syntax - /parkour help"); 
                    return true; 
                } 
                p.sendMessage(ChatColor.YELLOW + "-------------------- " + plugin.prefix + ChatColor.YELLOW + "--------------------"); 
                p.sendMessage(ChatColor.GOLD + "/parkour" + ChatColor.WHITE + ": Lists the current version"); 
                p.sendMessage(ChatColor.GOLD + "/pa" + ChatColor.WHITE + ": Alias for /parkour"); 
                p.sendMessage(ChatColor.GOLD + "/parkour reset" + ChatColor.WHITE + ": Resets Checkpoints and tp's the user to spawn."); 
                p.sendMessage(ChatColor.GOLD + "/parkour points" + ChatColor.WHITE + ": Returns user's total points."); 
                p.sendMessage(ChatColor.GOLD + "/parkour helm" + ChatColor.WHITE + ": Sets ps helm to desired block."); 
                p.sendMessage(ChatColor.GOLD + "/parkour vote" + ChatColor.WHITE + ": Lists voting links"); 
                p.sendMessage(ChatColor.GOLD + "/parkour admin" + ChatColor.WHITE + ": Displays admin help menu"); 
                p.sendMessage(ChatColor.GOLD + "/parkour points send <name> <points>" + ChatColor.WHITE + ": Sends points to identified player."); 
                return true; 
            } 
              
            if(args[0].equalsIgnoreCase("admin")) { 
                if(!p.hasPermission("parkour.admin") || !p.hasPermission("parkour.*")) { 
                    p.sendMessage(plugin.prefix + permission); 
                    return true; 
                } 
                if(args.length != 1) { 
                    p.sendMessage(plugin.prefix + ChatColor.RED + "Invalid syntax - /parkour admin"); 
                    return true; 
                } 
                p.sendMessage(ChatColor.YELLOW + "-------------------- " + plugin.prefix + ChatColor.YELLOW + "--------------------"); 
                p.sendMessage(ChatColor.GOLD + "/parkour points check <name> <points>" + ChatColor.WHITE + ": Checks identified player's points."); 
                p.sendMessage(ChatColor.GOLD + "/parkour points take <name> <points>" + ChatColor.WHITE + ": Take points to identified player."); 
                p.sendMessage(ChatColor.GOLD + "/parkour points add <name> <points>" + ChatColor.WHITE + ": Add points to identified player."); 
                return true; 
            } 
              
            if(args[0].equalsIgnoreCase("helm")) { 
                if(args.length != 1) { 
                    p.sendMessage(plugin.prefix + ChatColor.RED + "Invalid syntax - /parkour helm"); 
                    return true; 
                } 
                ItemStack helmet = p.getInventory().getItemInHand(); 
                if(p.getInventory().getHelmet() == null) { 
                    p.getInventory().setHelmet(helmet); 
                    p.getInventory().remove(helmet); 
                    p.updateInventory(); 
                } else { 
                    ItemStack helm = p.getInventory().getHelmet(); 
                    p.getInventory().setHelmet(null); 
                    p.getInventory().setHelmet(helmet); 
                    p.getInventory().remove(helmet); 
                    p.getInventory().setItemInHand(helm); 
                    p.updateInventory(); 
                } 
                p.sendMessage(plugin.prefix + ChatColor.GREEN + "Helmet set to: " + ChatColor.GOLD + helmet); 
                return true; 
            } 
              
            if(args[0].equalsIgnoreCase("purge")) { 
                if(!p.hasPermission("parkour.purge") || !p.hasPermission("parkour.admin") || !p.hasPermission("parkour.*")) { 
                    p.sendMessage(plugin.prefix + permission); 
                    return true; 
                } 
                if(args.length != 2) { 
                    p.sendMessage(plugin.prefix + ChatColor.RED + "Invalid syntax - /parkour purge <name>"); 
                    return true; 
                } 
                Player t = Bukkit.getServer().getPlayer(args[1]); 
                if(t == null) { 
                    p.sendMessage(plugin.prefix + ChatColor.RED + "Player does not exist!"); 
                    return true; 
                } 
                plugin.getConfig().set(t.getName() + ".world", null); 
                plugin.getConfig().set(t.getName() + ".x", null); 
                plugin.getConfig().set(t.getName() + ".y", null); 
                plugin.getConfig().set(t.getName() + ".z", null); 
                plugin.getConfig().set(t.getName() + ".yaw", null); 
                plugin.getConfig().set(t.getName() + ".pitch", null); 
                plugin.saveConfig(); 
                p.sendMessage(plugin.prefix + ChatColor.GREEN + "You reset " + ChatColor.GOLD + t.getName() + "'s" + ChatColor.GREEN + " checkpoint."); 
                t.sendMessage(plugin.prefix + ChatColor.RED + "Your checkpoint has been reset by " + ChatColor.DARK_RED + p.getName() + ChatColor.RED + "."); 
                return true; 
            } 
              
            if(args[0].equalsIgnoreCase("vote")) { 
                if(args.length != 1) { 
                    p.sendMessage(plugin.prefix + ChatColor.RED + "Invalid syntax - /parkour vote"); 
                    return true; 
                } 
                p.sendMessage((ChatColor.BLUE) + (ChatColor.BOLD + "============= " + plugin.prefix + (ChatColor.BLUE) + (ChatColor.BOLD + "=============="))); 
                p.sendMessage((ChatColor.AQUA) + (ChatColor.BOLD + "           Click this link to vote!")); 
                p.sendMessage(""); 
                p.sendMessage((ChatColor.RED) + (ChatColor.BOLD + "        http://nogriefers.com/vote")); 
                p.sendMessage(""); 
                p.sendMessage((ChatColor.AQUA) + (ChatColor.BOLD + "            Five Points Per Vote!")); 
                p.sendMessage((ChatColor.BLUE) + (ChatColor.BOLD + "===================================")); 
                return true; 
            } 
              
            if(args[0].equalsIgnoreCase("reset")) { 
                if(args.length != 1) { 
                    p.sendMessage(plugin.prefix + ChatColor.RED + "Invalid syntax - /parkour reset"); 
                    return true; 
                } 
                if(plugin.getConfig().getString(p.getName() + ".world") == null) { 
                    World w = Bukkit.getServer().getWorld(plugin.getConfig().getString("lobby.world")); 
                    double x = plugin.getConfig().getDouble("lobby.x"); 
                    double y = plugin.getConfig().getDouble("lobby.y"); 
                    double z = plugin.getConfig().getDouble("lobby.z"); 
                    float yaw = (float) plugin.getConfig().getDouble("lobby.yaw"); 
                    float pitch = (float) plugin.getConfig().getDouble("lobby.pitch"); 
                    p.teleport(new Location(w, x, y, z, yaw, pitch)); 
                    p.sendMessage(plugin.prefix + ChatColor.RED + "Checkpoint reset. Returned to spawn."); 
                    return true; 
                } 
                plugin.getConfig().set(p.getName() + ".world", null); 
                plugin.getConfig().set(p.getName() + ".x", null); 
                plugin.getConfig().set(p.getName() + ".y", null); 
                plugin.getConfig().set(p.getName() + ".z", null); 
                plugin.getConfig().set(p.getName() + ".yaw", null); 
                plugin.getConfig().set(p.getName() + ".pitch", null); 
                plugin.saveConfig(); 
                World w = Bukkit.getServer().getWorld(plugin.getConfig().getString("lobby.world")); 
                double x = plugin.getConfig().getDouble("lobby.x"); 
                double y = plugin.getConfig().getDouble("lobby.y"); 
                double z = plugin.getConfig().getDouble("lobby.z"); 
                float yaw = (float) plugin.getConfig().getDouble("lobby.yaw"); 
                float pitch = (float) plugin.getConfig().getDouble("lobby.pitch"); 
                p.teleport(new Location(w, x, y, z, yaw, pitch)); 
                p.sendMessage(plugin.prefix + ChatColor.RED + "Checkpoint reset. Returned to spawn."); 
                return true; 
            } 
              
            if(args[0].equalsIgnoreCase("setlobby")) { 
                if(!p.hasPermission("parkour.*") || !p.hasPermission("parkour.admin")) { 
                    p.sendMessage(plugin.prefix + permission); 
                    return true; 
                } 
                if(args.length != 1) { 
                    p.sendMessage(plugin.prefix + ChatColor.RED + "Invalid syntax - /parkour setlobby"); 
                    return true; 
                } 
                plugin.getConfig().set("lobby.world", p.getLocation().getWorld().getName()); 
                plugin.getConfig().set("lobby.x", p.getLocation().getX()); 
                plugin.getConfig().set("lobby.y", p.getLocation().getY()); 
                plugin.getConfig().set("lobby.z", p.getLocation().getZ()); 
                plugin.getConfig().set("lobby.yaw", p.getLocation().getYaw()); 
                plugin.getConfig().set("lobby.pitch", p.getLocation().getPitch()); 
                plugin.saveConfig(); 
                p.sendMessage(plugin.prefix + ChatColor.GREEN + "Lobby succesfully set to your location"); 
                return true; 
            } 
              
            if(args[0].equalsIgnoreCase("join")) { 
                if(args.length != 1) { 
                    p.sendMessage(plugin.prefix + ChatColor.RED + "Invalid syntax - /parkour join"); 
                    return true; 
                } 
                World w = Bukkit.getServer().getWorld(plugin.getConfig().getString("lobby.world")); 
                double x = plugin.getConfig().getDouble("lobby.x"); 
                double y = plugin.getConfig().getDouble("lobby.y"); 
                double z = plugin.getConfig().getDouble("lobby.z"); 
                float yaw = (float) plugin.getConfig().getDouble("lobby.yaw"); 
                float pitch = (float) plugin.getConfig().getDouble("lobby.pitch"); 
                p.teleport(new Location(w, x, y, z, yaw, pitch)); 
                p.sendMessage(plugin.prefix + ChatColor.GREEN + " You have joined the Parkour lobby."); 
                return true; 
            } 
              
            p.sendMessage(plugin.prefix + unknown); 
              
        } 
        return true; 
    } 
      
    public static extremeParkour plugin; 
    private String unknown; 
    private String permission; 
} 
