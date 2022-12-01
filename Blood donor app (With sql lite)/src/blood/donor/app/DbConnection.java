
package blood.donor.app;

import java.sql.*;


public class DbConnection {
    
    Connection con = null; 
    
    
    public static Connection ConnectionDd() {
        try {
            
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:Donor.db");
            System.out.println("Successfull connection");
            
            
           return con; 
        }
        
        
        catch (Exception e) {
            
            System.out.println("Error in conncetion"+e);
            
            return null;
            
        }
        
        
        
        
        
    }
    
}