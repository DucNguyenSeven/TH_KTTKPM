package nguyenhongduc.singleton;

public enum EnumSingleton {
    INSTANCE;

    public void showMessage() {
        System.out.println(Thread.currentThread().getName() + " - Enum Singleton Instance: " + this.hashCode());
    }
}