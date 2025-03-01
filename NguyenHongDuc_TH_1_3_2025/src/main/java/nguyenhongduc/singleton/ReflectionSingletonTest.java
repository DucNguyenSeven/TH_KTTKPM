package nguyenhongduc.singleton;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {
    public static void main(String[] args) {
        EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instanceTwo = null;

        try {
            Constructor<EagerInitializedSingleton> constructor = EagerInitializedSingleton.class.getDeclaredConstructor();
            constructor.setAccessible(true); // Cho phép truy cập private constructor
            instanceTwo = constructor.newInstance(); // Tạo instance mới bằng Reflection
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Kiểm tra kết quả
        System.out.println("Instance One HashCode: " + instanceOne.hashCode());
        System.out.println("Instance Two HashCode: " + instanceTwo.hashCode());
    }
}