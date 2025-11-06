import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Dealership dealership = new Dealership();
        String input;
        Scanner lezer = new Scanner(System.in);


        Klant klant = new Klant(garage, dealership);

        System.out.println("wat voor auto wil je hebben?");
        input = lezer.next();
        klant.dealership.Aservice(input);

        System.out.println("wil je nog een service bij de garage?");
        input = lezer.next();
        klant.garage.Aservice(input);

        Klant klant1 = new Klant(dealership,garage);
        System.out.println("rijke jongeman wil je 2e auto kopen?");
        input = lezer.next();
        klant.dealership.Aservice(input);

    }
}