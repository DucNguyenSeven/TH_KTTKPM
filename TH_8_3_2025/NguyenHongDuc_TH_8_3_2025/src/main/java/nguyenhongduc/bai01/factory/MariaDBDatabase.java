package nguyenhongduc.bai01.factory;

public class MariaDBDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("Connected to MariaDB (Factory)");
    }
}