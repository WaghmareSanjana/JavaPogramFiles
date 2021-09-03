
package hotel.management.systems;
import java.sql.*;
public class conn{
Connection c;
Statement s;
public conn(){
try{
Class.forName("com.mysql.cj.jdbc.Driver");
c=DriverManager.getConnection("jdbc:mysql:///projecthms","root","13january2004");
s=c.createStatement();

}catch(Exception e){
e.printStackTrace();
}
}
public static void main(String[] args)
{
    
}
}
