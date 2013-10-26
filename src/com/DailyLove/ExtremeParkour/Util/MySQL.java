package com.DailyLove.ExtremeParkour.Util; 
  
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.sql.Statement; 
import java.util.logging.Level; 
  
import org.bukkit.plugin.Plugin; 
  
// Referenced classes of package com.DailyLove.ExtremeParkour.Util: 
//            Database 
  
public class MySQL extends Database { 
  
    public MySQL(Plugin plugin, String hostname, String port, String database, String username, String password) { 
        super(plugin); 
        this.hostname = hostname; 
        this.port = port; 
        this.database = database; 
        user = username; 
        this.password = password; 
        connection = null; 
    } 
  
    public Connection openConnection() { 
        try { 
            Class.forName("com.mysql.jdbc.Driver"); 
            connection = DriverManager.getConnection((new StringBuilder("jdbc:mysql://")).append(hostname).append(":").append(port).append("/").append(database).toString(), user, password); 
        } 
        catch(SQLException e) { 
            plugin.getLogger().log(Level.SEVERE, (new StringBuilder("Could not connect to MySQL server! because: ")).append(e.getMessage()).toString()); 
        } 
        catch(ClassNotFoundException e) { 
            plugin.getLogger().log(Level.SEVERE, "JDBC Driver not found!"); 
        } 
        return connection; 
    } 
  
    public boolean checkConnection() { 
        return connection != null; 
    } 
  
    public Connection getConnection() { 
        return connection; 
    } 
  
    public void closeConnection() { 
        if(connection != null) 
            try { 
                connection.close(); 
            } 
            catch(SQLException e) { 
                plugin.getLogger().log(Level.SEVERE, "Error closing the MySQL Connection!"); 
                e.printStackTrace(); 
            } 
    } 
  
    public ResultSet querySQL(String query) { 
        Connection c = openConnection(); 
        Statement s = null; 
        try { 
            s = c.createStatement(); 
        } 
        catch(SQLException e1) { 
            e1.printStackTrace(); 
        } 
        ResultSet ret = null; 
        try { 
            ret = s.executeQuery(query); 
        } 
        catch(SQLException e) { 
            e.printStackTrace(); 
        } 
        return ret; 
    } 
  
    public void updateSQL(String update) { 
        Connection c = openConnection(); 
        Statement s = null; 
        try { 
            s = c.createStatement(); 
            s.executeUpdate(update); 
        } 
        catch(SQLException e1) { 
            e1.printStackTrace(); 
        } 
    } 
  
    private final String user; 
    private final String database; 
    private final String password; 
    private final String port; 
    private final String hostname; 
    private Connection connection; 
}
