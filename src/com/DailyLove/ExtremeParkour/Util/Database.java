package com.DailyLove.ExtremeParkour.Util; 
  
import java.sql.Connection; 
import org.bukkit.plugin.Plugin; 
  
public abstract class Database { 
    protected Database(Plugin plugin) { 
        this.plugin = plugin; 
    } 
      
    public abstract Connection openConnection(); 
    public abstract boolean checkConnection(); 
    public abstract Connection getConnection(); 
    public abstract void closeConnection(); 
    protected Plugin plugin; 
}
