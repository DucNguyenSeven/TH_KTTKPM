package nguyenhongduc;

import nguyenhongduc.observer.TemperatureSensor;
import nguyenhongduc.observer.DisplayDevice;
import nguyenhongduc.project_management.Task;
import nguyenhongduc.project_management.TeamMember;
import nguyenhongduc.stock_market.Investor;
import nguyenhongduc.stock_market.Stock;

public class Main {
    public static void main(String[] args) {

        /*Design Pattern:
        Làm một trường hợp khi có một đối tượng nào đó có bất kỳ một sự thay đổi thuộc tính nào đó thì nó sẽ gọi một
        phương thức nào đó của đối tượng khác chạy, hoặc thông báo cho các đối đượng khác biết.*/

        /*
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

        */

        // 🔹 Trường hợp 1: Thông báo khi giá cổ phiếu thay đổi
        System.out.println("\n📈 Stock Market Updates:");
        Stock appleStock = new Stock("Apple", 150.0);
        Investor investor1 = new Investor("Alice");
        Investor investor2 = new Investor("Bob");

        appleStock.addObserver(investor1);
        appleStock.addObserver(investor2);
        appleStock.setPrice(155.5);
        appleStock.setPrice(160.0);

        // 🔹 Trường hợp 2: Thông báo khi trạng thái công việc thay đổi
        System.out.println("\n📌 Project Management Updates:");
        Task task = new Task("Develop Login Feature", "To Do");
        TeamMember member1 = new TeamMember("Charlie");
        TeamMember member2 = new TeamMember("David");

        task.addObserver(member1);
        task.addObserver(member2);
        task.setStatus("In Progress");
        task.setStatus("Completed");
    }
}