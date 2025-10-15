public class Diesel extends MotorType {
    private final String type = "diesel";
    @Override
    public void verbruiken() {
        System.out.println("De motor verbruikt " + type);
    }
}