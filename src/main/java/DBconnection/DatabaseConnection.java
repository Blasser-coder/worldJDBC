package DBconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static Connection Con = null;

    public static Connection GetConnection(){
        String url = "jdbc:mysql://192.168.56.101:3306/world";
        String user = "user";
        String pass = "user";
        try {
            Con = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Con;
    }


}
