public class Sedan extends AutoType {
    private final String type = "sedan";
    @Override
    public void rijden() {
        System.out.println("De auto is een " + type);
    }
}