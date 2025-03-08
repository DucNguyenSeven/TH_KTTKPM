package nguyenhongduc.bai01.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionSingleton {
    private static DatabaseConnectionSingleton instance;
    private Connection connection;

    private DatabaseConnectionSingleton() {
        try {
            String url = "jdbc:mariadb://localhost:3307/mydb";
            String user = "hongduc";
            String password = "sapassword";

            this.connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to MariaDB (Singleton)");
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to MariaDB", e);
        }
    }

    public static DatabaseConnectionSingleton getInstance() {
        if (instance == null) {
            synchronized (DatabaseConnectionSingleton.class) {
                if (instance == null) {
                    instance = new DatabaseConnectionSingleton();
                }
            }
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}