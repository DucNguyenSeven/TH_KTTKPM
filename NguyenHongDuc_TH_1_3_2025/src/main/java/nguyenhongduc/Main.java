package nguyenhongduc;

import nguyenhongduc.singleton.EagerInitializedSingleton;

public class Main {
    public static void main(String[] args) {

        System.out.println("Demo Eager Initialization Singleton\n");
        EagerInitializedSingleton singleton1 = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton singleton2 = EagerInitializedSingleton.getInstance();

        singleton1.showMessage();
        singleton2.showMessage();

    }
}