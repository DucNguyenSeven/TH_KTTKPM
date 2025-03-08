package nguyenhongduc;

import nguyenhongduc.singleton.*;

public class Main {
    public static void main(String[] args) {

//        // Demo Eager Initialization Singleton
//        System.out.println("Demo Eager Initialization Singleton\n");
//        EagerInitializedSingleton eagerSingleton1 = EagerInitializedSingleton.getInstance();
//        EagerInitializedSingleton eagerSingleton2 = EagerInitializedSingleton.getInstance();
//
//        eagerSingleton1.showMessage();
//        eagerSingleton2.showMessage();

//        // Demo Static Block Initialization Singleton
//        System.out.println("\nDemo Static Block Initialization Singleton\n");
//        StaticBlockSingleton staticSingleton1 = StaticBlockSingleton.getInstance();
//        StaticBlockSingleton staticSingleton2 = StaticBlockSingleton.getInstance();
//
//        staticSingleton1.showMessage();
//        staticSingleton2.showMessage();

//        // Demo Lazy Initialization Singleton
//        System.out.println("\nDemo Lazy Initialization Singleton\n");
//        LazyInitializedSingleton lazySingleton1 = LazyInitializedSingleton.getInstance();
//        LazyInitializedSingleton lazySingleton2 = LazyInitializedSingleton.getInstance();
//
//        lazySingleton1.showMessage();
//        lazySingleton2.showMessage();

//        // Demo Thread Safe Singleton
//        System.out.println("\nChecking Singleton Instances in Multi-threading\n");
//
//        Runnable syncTask = () -> {
//            ThreadSafeSingleton instance = ThreadSafeSingleton.getInstanceWithSyncMethod();
//            System.out.println(Thread.currentThread().getName() + " - Sync Method: " + instance.hashCode());
//        };
//
//        Runnable doubleLockTask = () -> {
//            ThreadSafeSingleton instance = ThreadSafeSingleton.getInstanceWithDoubleLocking();
//            System.out.println(Thread.currentThread().getName() + " - Double Lock: " + instance.hashCode());
//        };
//
//        Thread t1 = new Thread(syncTask, "Thread-1");
//        Thread t2 = new Thread(syncTask, "Thread-2");
//        Thread t3 = new Thread(syncTask, "Thread-3");
//
//        Thread t4 = new Thread(doubleLockTask, "Thread-4");
//        Thread t5 = new Thread(doubleLockTask, "Thread-5");
//        Thread t6 = new Thread(doubleLockTask, "Thread-6");
//
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
//        t5.start();
//        t6.start();

//        // Demo Bill Pugh Singleton
//        System.out.println("\nChecking Bill Pugh Singleton in Multi-threading\n");
//
//        Runnable task = () -> {
//            BillPughSingleton instance = BillPughSingleton.getInstance();
//            instance.showMessage();
//        };
//
//        // Tạo và chạy các thread để kiểm tra
//        Thread thread1 = new Thread(task, "Thread-1");
//        Thread thread2 = new Thread(task, "Thread-2");
//        Thread thread3 = new Thread(task, "Thread-3");
//
//        thread1.start();
//        thread2.start();
//        thread3.start();
        // Demo Enum Singleton
        System.out.println("\nChecking Enum Singleton in Multi-threading\n");

        Runnable task = () -> {
            EnumSingleton instance = EnumSingleton.INSTANCE;
            instance.showMessage();
        };

        Thread thread1 = new Thread(task, "Thread-1");
        Thread thread2 = new Thread(task, "Thread-2");
        Thread thread3 = new Thread(task, "Thread-3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}