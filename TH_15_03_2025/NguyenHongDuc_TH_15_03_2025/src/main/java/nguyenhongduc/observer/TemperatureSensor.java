package nguyenhongduc.observer;

import java.util.ArrayList;
import java.util.List;

public class TemperatureSensor {
    private float temperature;
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        System.out.println("🔹 Temperature changed to: " + temperature + "°C");
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }
}