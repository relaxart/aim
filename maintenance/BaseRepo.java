package java.maintenance;

public abstract class BaseRepo {
    protected Database db;

    public BaseRepo(Database db) {
        this.db = db;
    }
}
