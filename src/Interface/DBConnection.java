/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class DBConnection    {
    
    public static Connection connect()
    {
    Connection conn=null;
    try {
        Class.forName("com.mysql.jdbc.Driver");
        
        conn= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/newinventory?", "root","");
        //JOptionPane.showMessageDialog(null, "connection success");                               
    } catch
     (Exception e) {
    JOptionPane.showMessageDialog(null, "Database connection failed: " + e.getMessage());
}
return conn;
    }
    
}
