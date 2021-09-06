import java.sql.*;
import javax.swing.*;

public class connection {
    
    Connection c;
    Statement s;
    connection()
    {
        try{
            Class.forName("com.mysql.jdbc.driver");
            c=DriverManager.getConnection("jdbc:mysql:///bms","root","13janaury2004");
            s=c.createStatement();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
}
