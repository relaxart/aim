package java.maintenance;

public class Aircraft {
    private String id;
    private Boolean isWideBody;
    private Integer hoursBeforeLightOverhaul;
    private Integer hoursBeforeCompleteOverhaul;
    private Integer maxEconomySeats;
    private Integer firstClassSeats;
    private Integer businessClassSeats;

    public boolean hasWideBody() {
        return isWideBody;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setWideBody(boolean wideBody) {
        isWideBody = wideBody;
    }

    public Integer getHoursBeforeLightOverhaul() {
        return hoursBeforeLightOverhaul;
    }

    public void setHoursBeforeLightOverhaul(Integer hoursBeforeLightOverhaul) {
        this.hoursBeforeLightOverhaul = hoursBeforeLightOverhaul;
    }

    public Integer getHoursBeforeCompleteOverhaul() {
        return hoursBeforeCompleteOverhaul;
    }

    public void setHoursBeforeCompleteOverhaul(Integer hoursBeforeCompleteOverhaul) {
        this.hoursBeforeCompleteOverhaul = hoursBeforeCompleteOverhaul;
    }

    public Integer getMaxEconomySeats() {
        return maxEconomySeats;
    }

    public void setMaxEconomySeats(Integer maxEconomySeats) {
        this.maxEconomySeats = maxEconomySeats;
    }

    public Integer getFirstClassSeats() {
        return firstClassSeats;
    }

    public void setFirstClassSeats(Integer firstClassSeats) {
        this.firstClassSeats = firstClassSeats;
    }

    public Integer getBusinessClassSeats() {
        return businessClassSeats;
    }

    public void setBusinessClassSeats(Integer businessClassSeats) {
        this.businessClassSeats = businessClassSeats;
    }
}
