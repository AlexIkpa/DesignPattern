public class Dealership implements Autoservice {

    Diesel Diesel = new Diesel();

    Sedan Sedan = new Sedan();
    Hatchback hatchback = new Hatchback();
    Elektrisch Emotor = new Elektrisch();


    Auto Mercedes_C = new Auto(Diesel, Sedan, true);
    Auto BMW_i8 = new Auto(Emotor, Sedan, true);
    Auto Volkswagen_golf = new Auto(Diesel, hatchback, true);


    Auto[] autos = {
            Mercedes_C,
            BMW_i8,
            Volkswagen_golf
    };

    public Dealership() {


    }

    @Override
    public void Aservice(String service) {
        if (service.equals("Mercedes_C") && autos[0].Available()) {
            System.out.println("Mercedes_C gekocht!");
            autos[0].setAvailable(false);
        } else if (service.equals("BMW_i8") && autos[1].Available()) {
            System.out.println("BMW_i8 gekocht!");
            autos[1].setAvailable(false);
        } else if (service.equals("Volkswagen_golf") && autos[2].Available()) {
            System.out.println("Volkswagen_golf gekocht!");
            autos[2].setAvailable(false);
        } else {
            System.out.println("jammer niet op voorraad");
        }

        if (service.equals("Verkoop auto")) {
            System.out.println("Auto verkocht!");
        }
    }
}
