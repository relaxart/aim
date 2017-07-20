package java.maintenance;

import java.util.Date;

public abstract class AbstractMaintenance {
    private Integer id;
    private Integer duration;
    private Date startDate;
    private Aircraft airplane;
    private MaintenanceBase base;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Aircraft getAirplane() {
        return airplane;
    }

    public void setAircraft(Aircraft airplane) {
        this.airplane = airplane;
    }

    public MaintenanceBase getBase() {
        return base;
    }

    public void setBase(MaintenanceBase base) {
        this.base = base;
    }
}
