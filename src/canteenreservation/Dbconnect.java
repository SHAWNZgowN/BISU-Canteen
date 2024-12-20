
package canteenreservation;

import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Steve
 */
public class Dbconnect {
   private static java.sql.Connection connect;
    
     public static java.sql.Connection getConnected(){
        if(connect == null){
            try{
                String url = "jdbc:mysql://localhost:3306/canteen_reservation?zeroDateTimeBehavior=CONVERT_TO_NULL";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                connect = DriverManager.getConnection(url, user, password);
                JOptionPane.showMessageDialog(null, "Connection successful");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
           
        }
         return connect;
    }
     
    public static void main(String[] args) {
        getConnected();
    }
}
