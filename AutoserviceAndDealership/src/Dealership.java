public class Dealership implements Autoservice{
    @Override
    public void Aservice(String service) {
        if(service.equals("koopAuto")) {
            System.out.println("autotje verkopen");
        }else if (service.equals("verkoopAuto")){
            System.out.println("autotje kopen");
        }
}}
