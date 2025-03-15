package nguyenhongduc.stock_market;

public class Investor implements Observer {
    private String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(double price) {
        System.out.println("📢 Investor " + name + " notified: New Stock Price = $" + price);
    }
}