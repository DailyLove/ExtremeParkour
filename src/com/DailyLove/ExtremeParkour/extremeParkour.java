package com.DailyLove.ExtremeParkour; 
  
import java.sql.Connection; 
import java.sql.SQLException; 
import java.sql.Statement; 
  
import net.milkbowl.vault.economy.Economy; 
  
import org.bukkit.ChatColor; 
import org.bukkit.plugin.RegisteredServiceProvider; 
import org.bukkit.plugin.java.JavaPlugin; 
  
import com.DailyLove.ExtremeParkour.Listeners.cpListener; 
import com.DailyLove.ExtremeParkour.Listeners.damageListener; 
import com.DailyLove.ExtremeParkour.Listeners.extraListener; 
import com.DailyLove.ExtremeParkour.Listeners.fallListener; 
import com.DailyLove.ExtremeParkour.Listeners.pingListener; 
import com.DailyLove.ExtremeParkour.Listeners.ppListener; 
import com.DailyLove.ExtremeParkour.Listeners.shopListener; 
import com.DailyLove.ExtremeParkour.Listeners.signListener; 
import com.DailyLove.ExtremeParkour.Util.MySQL; 
  
public class extremeParkour extends JavaPlugin { 
    public void onEnable() { 
        getConfig().options().copyDefaults(true); 
        saveDefaultConfig(); 
        getServer().getPluginManager().registerEvents(new shopListener(this), this); 
        getServer().getPluginManager().registerEvents(new fallListener(this), this); 
        getServer().getPluginManager().registerEvents(new signListener(this), this); 
        getServer().getPluginManager().registerEvents(new ppListener(this), this); 
        getServer().getPluginManager().registerEvents(new damageListener(this), this); 
        getServer().getPluginManager().registerEvents(new pingListener(this), this); 
        getServer().getPluginManager().registerEvents(new cpListener(this), this); 
        getServer().getPluginManager().registerEvents(new extraListener(this), this); 
        this.getCommand("pa").setExecutor(new parkourCommands(this)); 
        this.getCommand("parkour").setExecutor(new parkourCommands(this)); 
        version = "v" + getConfig().getString("version") + " "; 
        prefix = ChatColor.translateAlternateColorCodes('&', getConfig().getString("prefix")) + " "; 
        getLogger().info(name + version + "Enabled!"); 
        if (!setupEconomy() ) { 
               getLogger().severe(String.format("Disabled due to no Vault dependency found!", getDescription().getName())); 
               getServer().getPluginManager().disablePlugin(this); 
               return; 
        } 
    } 
    public void onDisable() { 
        getLogger().info(name + version + "Disabled!"); 
        reloadConfig(); 
    } 
    public extremeParkour() { 
        name = "ExtremeParkour "; 
    } 
      
    private boolean setupEconomy() { 
        if (getServer().getPluginManager().getPlugin("Vault") == null) { 
            return false; 
        } 
        RegisteredServiceProvider<Economy> rsp = getServer().getServicesManager().getRegistration(Economy.class); 
        if (rsp == null) { 
            return false; 
        } 
        econ = rsp.getProvider(); 
        return econ != null; 
    } 
      
    public String version; 
    public String name; 
    public String prefix; 
    public Economy econ = null; 
    static Connection c = null; 
} 
