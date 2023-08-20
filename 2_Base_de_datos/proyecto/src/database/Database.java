package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.sql.SQLException;
public class Database {
    public Connection dbConnection(String database, String port, String password, String user) {
        String url = "jdbc:postgresql://localhost:" + port + "/" + database;

        Properties props = new Properties();
        props.setProperty("user", user);
        props.setProperty("password", password);

        try {
            Connection connection = DriverManager.getConnection(url, props);
            System.out.println("Connection to database successful");
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
