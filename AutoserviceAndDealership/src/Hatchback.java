public class Hatchback extends AutoType {
    private final String type = "hatchback";
    @Override
    public void rijden() {
        System.out.println("De auto is een " + type);
    }
}