public class Auto {
    private MotorType motorType;
    private AutoType autoType;

    private Boolean available;

    public Auto(MotorType motorType, AutoType autoType, Boolean available) {
        this.motorType = motorType;
        this.autoType = autoType;
        this.available = available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public Boolean Available() {
        return available;
    }
}