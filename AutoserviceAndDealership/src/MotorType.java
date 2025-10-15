public abstract class MotorType {
    private final String type = new String();
    public void verbruiken() {
        System.out.println("De motor verbruikt " + type);
    }
}