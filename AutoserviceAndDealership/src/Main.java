//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Dealership dealership = new Dealership();



        Klant klant = new Klant(garage, dealership);
        Klant klant1 = new Klant(garage, dealership);
        klant1.dealership.Aservice("koop Mercedes_C");
        klant1.dealership.Aservice("koop BMW_i8");
        klant1.dealership.Aservice("koop Volkswagen_golf");
        klant.garage.Aservice("reparatie");
        klant.dealership.Aservice("koop Mercedes_C");
        klant.dealership.Aservice("koop BMW_i8");
        klant.dealership.Aservice("koop Volkswagen_golf");


    }
}