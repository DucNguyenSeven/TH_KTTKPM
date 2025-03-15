package nguyenhongduc.project_management;

public class TeamMember implements Observer {
    private String name;

    public TeamMember(String name) {
        this.name = name;
    }

    @Override
    public void update(String status) {
        System.out.println("📢 Team Member " + name + " notified: Task Status = " + status);
    }
}