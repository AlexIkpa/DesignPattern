public class Garage implements Autoservice{
    @Override
    public void Aservice(String service) {
        if( service.equals("reparatie")){
            System.out.println("*bezig met repareren");
            System.out.println("reparatie succesvol");
        }else if (service.equals("onderhoud")){
            System.out.println("*bezig met onderhouden*");
            System.out.println("onderhoud succesvol!");
        }else if (service.equals("modificatie")){
            System.out.println("*bezig met modificeren");
            System.out.println("modificeren succesvol!");
        }
    }
}
