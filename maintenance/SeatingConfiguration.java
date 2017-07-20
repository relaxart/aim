package java.maintenance;

public class SeatingConfiguration extends AbstractMaintenance {
    private String configCode;

    public String getConfigCode() {
        return configCode;
    }

    public void setConfigCode(String configCode) {
        this.configCode = configCode;
    }

    @Override
    public String toString() {
        return "SeatingConfiguration";
    }
}
