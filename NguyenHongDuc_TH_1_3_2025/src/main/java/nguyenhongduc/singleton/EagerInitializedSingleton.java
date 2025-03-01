package nguyenhongduc.singleton;

public class EagerInitializedSingleton {

    // Tạo instance khi class được load
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    // Constructor private để ngăn việc tạo instance mới
    private EagerInitializedSingleton() {}

    // Phương thức trả về instance duy nhất
    public static EagerInitializedSingleton getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Eager Initialization Singleton Instance: " + this.hashCode());
    }
}