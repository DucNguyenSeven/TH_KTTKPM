package nguyenhongduc;

import nguyenhongduc.observer.TemperatureSensor;
import nguyenhongduc.observer.DisplayDevice;

public class Main {
    public static void main(String[] args) {

        // Tạo đối tượng cảm biến nhiệt độ
        TemperatureSensor sensor = new TemperatureSensor();

        // Tạo các thiết bị hiển thị nhiệt độ
        DisplayDevice phoneDisplay = new DisplayDevice("Phone Display");
        DisplayDevice laptopDisplay = new DisplayDevice("Laptop Display");

        // Đăng ký các thiết bị với cảm biến
        sensor.addObserver(phoneDisplay);
        sensor.addObserver(laptopDisplay);

        // Thay đổi nhiệt độ (các thiết bị sẽ tự động cập nhật)
        sensor.setTemperature(25.0f);
        sensor.setTemperature(30.5f);

        // Bỏ đăng ký một thiết bị
        sensor.removeObserver(phoneDisplay);

        // Thay đổi nhiệt độ (chỉ còn Laptop nhận thông báo)
        sensor.setTemperature(28.0f);
    }
}