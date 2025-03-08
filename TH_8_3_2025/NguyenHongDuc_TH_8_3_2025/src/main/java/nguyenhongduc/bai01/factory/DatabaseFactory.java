package nguyenhongduc.bai01.factory;

public class DatabaseFactory {
    public static Database getDatabase(String type) {
        if (type.equalsIgnoreCase("mariadb")) {
            return new MariaDBDatabase();
        }
        throw new IllegalArgumentException("Unknown database type: " + type);
    }
}