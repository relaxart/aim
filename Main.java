package java;

import java.maintenance.AbstractMaintenance;
import java.maintenance.MaintenanceFactory;
import java.maintenance.MaintenanceScheduleBuilder;

public class Main {
    public static void main(String[] args) throws Exception {
        //dummy application

        AbstractMaintenance maintenance = MaintenanceFactory.create("EmergencyMaintenance");
        MaintenanceScheduleBuilder builder = new MaintenanceScheduleBuilder(maintenance);

    }
}
