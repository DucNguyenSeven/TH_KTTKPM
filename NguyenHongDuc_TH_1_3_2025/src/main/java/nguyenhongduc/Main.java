package nguyenhongduc;

import nguyenhongduc.singleton.EagerInitializedSingleton;
import nguyenhongduc.singleton.StaticBlockSingleton;

public class Main {
    public static void main(String[] args) {

//        // Demo Eager Initialization Singleton
//        System.out.println("Demo Eager Initialization Singleton\n");
//        EagerInitializedSingleton eagerSingleton1 = EagerInitializedSingleton.getInstance();
//        EagerInitializedSingleton eagerSingleton2 = EagerInitializedSingleton.getInstance();
//
//        eagerSingleton1.showMessage();
//        eagerSingleton2.showMessage();

        // Demo Static Block Initialization Singleton
        System.out.println("\nDemo Static Block Initialization Singleton\n");
        StaticBlockSingleton staticSingleton1 = StaticBlockSingleton.getInstance();
        StaticBlockSingleton staticSingleton2 = StaticBlockSingleton.getInstance();

        staticSingleton1.showMessage();
        staticSingleton2.showMessage();

    }
}