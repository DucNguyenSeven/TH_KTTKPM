package nguyenhongduc.singleton;

public class StaticBlockSingleton {

    private static StaticBlockSingleton instance;

    private StaticBlockSingleton() {}

    // Static block initialization with exception handling
    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred while creating singleton instance");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Static Block Singleton Instance: " + this.hashCode());
    }
}