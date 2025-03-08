package nguyenhongduc;

import nguyenhongduc.bai01.singleton.DatabaseConnectionSingleton;
import nguyenhongduc.bai01.factory.Database;
import nguyenhongduc.bai01.factory.DatabaseFactory;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {

        // 🔹 Singleton: Sử dụng chung một kết nối đến MariaDB
        System.out.println("\n🟢 Connecting to MariaDB using Singleton...");
        DatabaseConnectionSingleton dbSingleton = DatabaseConnectionSingleton.getInstance();
        Connection conn = dbSingleton.getConnection();
        System.out.println("Database Connection HashCode: " + conn.hashCode());

        // 🔹 Factory: Tạo kết nối MariaDB
        System.out.println("\n🟢 Creating MariaDB Database using Factory...");
        Database mariadb = DatabaseFactory.getDatabase("mariadb");
        mariadb.connect();
    }
}