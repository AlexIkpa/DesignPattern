//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Garage garage = new Garage();
    Dealership dealership = new Dealership();
    Klant klant = new Klant(dealership);
    klant.autoservice.Aservice();







    }
}