package nguyenhongduc.singleton;

public class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton() {}

    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Lazy Initialization Singleton Instance: " + this.hashCode());
    }
}