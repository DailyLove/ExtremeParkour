package com.DailyLove.ExtremeParkour.Listeners; 
  
import net.milkbowl.vault.economy.EconomyResponse; 
  
import org.bukkit.Bukkit; 
import org.bukkit.ChatColor; 
import org.bukkit.DyeColor; 
import org.bukkit.Location; 
import org.bukkit.Material; 
import org.bukkit.World; 
import org.bukkit.block.Block; 
import org.bukkit.entity.Player; 
import org.bukkit.event.EventHandler; 
import org.bukkit.event.Listener; 
import org.bukkit.event.block.Action; 
import org.bukkit.event.player.PlayerInteractEvent; 
import org.bukkit.material.Wool; 
import org.bukkit.util.Vector; 
  
import com.DailyLove.ExtremeParkour.extremeParkour; 
  
public class ppListener implements Listener { 
    public ppListener(extremeParkour instance) { 
        plugin = instance; 
    } 
      
    @SuppressWarnings("static-access") 
    @EventHandler
    public static void onPlayerStep(PlayerInteractEvent e) { 
        Player p = e.getPlayer(); 
        if(e.isCancelled()) 
            return; 
        Block block = e.getClickedBlock(); 
        Location bLoc = block.getLocation(); 
        Action action = e.getAction(); 
        if(action == action.PHYSICAL); 
            if(block.getType() == Material.STONE_PLATE) { 
                if(!p.hasPermission("parkour.finish")) { 
                    return; 
                } 
                Location bBlock = new Location(p.getWorld(), bLoc.getX(), bLoc.getY() - 1.0D, bLoc.getZ()); 
                Block wBlock = e.getPlayer().getWorld().getBlockAt(bBlock); 
                if(wBlock.getState().getData() instanceof Wool) { 
                    DyeColor color = ((Wool)wBlock.getState().getData()).getColor(); 
                    if(color == DyeColor.LIME) { 
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
                        p.sendMessage(plugin.prefix + ChatColor.GREEN + "Checkpoint Reset. Teleported to spawn."); 
                        p.sendMessage(plugin.prefix + ChatColor.GREEN + "Congratulations you have beaten a" + ChatColor.DARK_GREEN + " Easy " + ChatColor.GREEN + "Course!"); 
                        EconomyResponse s = plugin.econ.depositPlayer(p.getName(), 15); 
                        if(s.transactionSuccess()) { 
                            p.sendMessage(plugin.prefix + ChatColor.GREEN + "You have Received 15 Point(s)!"); 
                            p.sendMessage(plugin.prefix + ChatColor.GREEN + "You Now Have " + ChatColor.AQUA + plugin.econ.format(plugin.econ.getBalance(p.getName())) + ChatColor.GREEN + " Point(s)!"); 
                        } 
                    } 
                    else if(color == DyeColor.YELLOW) { 
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
                        p.sendMessage(plugin.prefix + ChatColor.GREEN + "Checkpoint Reset. Teleported to spawn."); 
                        p.sendMessage(plugin.prefix + ChatColor.GREEN + "Congratulations you have beaten a" + ChatColor.YELLOW + " Medium " + ChatColor.GREEN + "Course!"); 
                        EconomyResponse s = plugin.econ.depositPlayer(p.getName(), 30); 
                        if(s.transactionSuccess()) { 
                            p.sendMessage(plugin.prefix + ChatColor.GREEN + "You have Received 30 Point(s)!"); 
                            p.sendMessage(plugin.prefix + ChatColor.GREEN + "You Now Have " + ChatColor.AQUA + plugin.econ.format(plugin.econ.getBalance(p.getName())) + ChatColor.GREEN + " Point(s)!"); 
                        } 
                    } 
                    else if(color == DyeColor.RED) { 
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
                        p.sendMessage(plugin.prefix + ChatColor.GREEN + "Checkpoint Reset. Teleported to spawn."); 
                        p.sendMessage(plugin.prefix + ChatColor.GREEN + "Congratulations you have beaten a" + ChatColor.RED + " Hard " + ChatColor.GREEN + "Course!"); 
                        EconomyResponse s = plugin.econ.depositPlayer(p.getName(), 60); 
                        if(s.transactionSuccess()) { 
                            p.sendMessage(plugin.prefix + ChatColor.GREEN + "You have Received 60 Point(s)!"); 
                            p.sendMessage(plugin.prefix + ChatColor.GREEN + "You Now Have " + ChatColor.AQUA + plugin.econ.format(plugin.econ.getBalance(p.getName())) + ChatColor.GREEN + " Point(s)!"); 
                        } 
                    } 
                    else if(color == DyeColor.PURPLE) { 
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
                        p.sendMessage(plugin.prefix + ChatColor.GREEN + "Checkpoint Reset. Teleported to spawn."); 
                        p.sendMessage(plugin.prefix + ChatColor.GREEN + "Congratulations you have beaten a" + ChatColor.DARK_PURPLE + " Expert " + ChatColor.GREEN + "Course!"); 
                        Bukkit.getServer().broadcastMessage(plugin.prefix + ChatColor.RED + p.getName() + ChatColor.GREEN + " has beaten a " + ChatColor.DARK_PURPLE + "Expert" + ChatColor.GREEN + " Course!"); 
                        EconomyResponse s = plugin.econ.depositPlayer(p.getName(), 100); 
                        if(s.transactionSuccess()) { 
                            p.sendMessage(plugin.prefix + ChatColor.GREEN + "You have Received 100 Point(s)!"); 
                            p.sendMessage(plugin.prefix + ChatColor.GREEN + "You Now Have " + ChatColor.AQUA + plugin.econ.format(plugin.econ.getBalance(p.getName())) + ChatColor.GREEN + " Point(s)!"); 
                        } 
                    } 
                    else if(color == DyeColor.ORANGE) { 
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
                        p.sendMessage(plugin.prefix + ChatColor.GREEN + "Checkpoint Reset. Teleported to spawn."); 
                        p.sendMessage(plugin.prefix + ChatColor.GREEN + "Congratulations you have beaten a" + ChatColor.GOLD + " Insane " + ChatColor.GREEN + "Course!"); 
                        Bukkit.getServer().broadcastMessage(plugin.prefix + ChatColor.RED + p.getName() + ChatColor.GREEN + " has beaten a " + ChatColor.GOLD + "Insane" + ChatColor.GREEN + " Course!"); 
                        EconomyResponse s = plugin.econ.depositPlayer(p.getName(), 150); 
                        if(s.transactionSuccess()) { 
                            p.sendMessage(plugin.prefix + ChatColor.GREEN + "You have Received 150 Point(s)!"); 
                            p.sendMessage(plugin.prefix + ChatColor.GREEN + "You Now Have " + ChatColor.AQUA + plugin.econ.format(plugin.econ.getBalance(p.getName())) + ChatColor.GREEN + " Point(s)!"); 
                        } 
                    } 
                    else if(color == DyeColor.BLACK) { 
                        double speed = 3D; 
                        Vector v = p.getVelocity().setY(speed); 
                        p.setVelocity(v); 
                    } 
                    else if(color == DyeColor.GRAY) { 
                        double speed = 1.5D; 
                        Vector v = p.getVelocity().setY(speed); 
                        p.setVelocity(v); 
                    } 
                } 
            } 
    } 
      
    public static extremeParkour plugin; 
} 
