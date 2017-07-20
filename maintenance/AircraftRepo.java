package java.maintenance;

import java.util.ArrayList;

public class AircraftRepo extends BaseRepo {
    public AircraftRepo(Database db) {
        super(db);
    }

    public ArrayList<Aircraft> getAll() {
        return new ArrayList<>();
    }
}
