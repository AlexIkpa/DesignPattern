public class Elektrisch extends MotorType {
    private final String type = "elektrisch";
    @Override
    public void verbruiken() {
        System.out.println("De motor verbruikt " + type);
    }
}