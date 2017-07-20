package java.maintenance;

import java.util.Date;

public class MaintenanceScheduleBuilder {

    private AbstractMaintenance maintenance;

    public MaintenanceScheduleBuilder(AbstractMaintenance maintenance) {
        this.maintenance = maintenance;
    }

    public void assignDate(Date date) {
        this.maintenance.setStartDate(date);
    }

    public void assignAircraft(Aircraft aircraft) {
        this.maintenance.setAircraft(aircraft);
    }

    public void assingBase(MaintenanceBase base) {
        this.maintenance.setBase(base);
    }

    public void applySeatConfiguration(String code) throws Exception {
        if (this.maintenance.getClass() == SeatingConfiguration.class) {
            SeatingConfiguration m = (SeatingConfiguration) this.maintenance;
            m.setConfigCode(code);
        } else {
            throw new Exception("Wrong maintenance type");
        }
    }
}
