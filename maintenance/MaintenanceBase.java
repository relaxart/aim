package java.maintenance;

public class MaintenanceBase {
    private String name;
    private String location;

    public MaintenanceBase(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }
}
