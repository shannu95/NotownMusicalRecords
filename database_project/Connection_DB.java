
package database_project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Connection_DB {
     private static Connection con;
    public static Connection DBCon() throws SQLException {
    if(con==null){
        try {
            String DB="jdbc:oracle:thin:@localhost:1521:orcl";
            String user="hr";
            String pass="hr";
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            con = (Connection) DriverManager.getConnection(DB,user,pass);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Connection has not been established");
        }
    }
    return con;
    }
    
    
    
    
}
