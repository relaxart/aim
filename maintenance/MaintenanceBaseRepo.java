package java.maintenance;

import java.util.ArrayList;

public class MaintenanceBaseRepo extends BaseRepo {
    public MaintenanceBaseRepo(Database db) {
        super(db);
    }

    public ArrayList<MaintenanceBase> getAvailable() {
        return new ArrayList<>();
    }
}
