package nguyenhongduc.singleton;

public class ThreadSafeSingleton {

    private static volatile ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {}

    // 🔹 Cách 1: Synchronized Method (Dễ hiểu nhưng chậm)
    public static synchronized ThreadSafeSingleton getInstanceWithSyncMethod() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

    // 🔹 Cách 2: Double-Checked Locking (Tối ưu hiệu suất)
    public static ThreadSafeSingleton getInstanceWithDoubleLocking() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }

    public void showMessage(String methodType) {
        System.out.println(Thread.currentThread().getName() + " - " + methodType + " - Instance HashCode: " + this.hashCode());
    }
}