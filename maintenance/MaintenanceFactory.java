package java.maintenance;

public class MaintenanceFactory {
    public static AbstractMaintenance create(String type) throws Exception {
        switch (type) {
            case "EmergencyMaintenance":
                return new EmergencyMaintenance();
            case "CompleteOverhaul":
                return new CompleteOverhaul();
            case "LightOverhaul":
                return new LightOverhaul();
            case "SeatingConfiguration":
                return new SeatingConfiguration();
            default:
                throw new Exception("UnsupportedType");
        }
    }
}
