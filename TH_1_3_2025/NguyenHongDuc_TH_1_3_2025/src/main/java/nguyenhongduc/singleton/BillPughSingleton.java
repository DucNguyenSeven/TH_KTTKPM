package nguyenhongduc.singleton;

public class BillPughSingleton {

    private BillPughSingleton() {}

    // Static inner helper class responsible for holding the Singleton instance
    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public void showMessage() {
        System.out.println(Thread.currentThread().getName() + " - Bill Pugh Singleton Instance: " + this.hashCode());
    }
}