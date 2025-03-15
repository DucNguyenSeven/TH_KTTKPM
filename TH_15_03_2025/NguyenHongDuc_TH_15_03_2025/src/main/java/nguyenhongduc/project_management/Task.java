package nguyenhongduc.project_management;

import java.util.ArrayList;
import java.util.List;

public class Task {
    private String name;
    private String status;
    private List<Observer> observers = new ArrayList<>();

    public Task(String name, String status) {
        this.name = name;
        this.status = status;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setStatus(String status) {
        this.status = status;
        System.out.println("📌 Task " + name + " status changed to: " + status);
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(status);
        }
    }
}