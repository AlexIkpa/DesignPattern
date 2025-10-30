public class Garage implements Autoservice{
    @Override
    public void Aservice(String service) {
        if( service.equals("reparatie")){
            System.out.println("repareren");
        }else if (service.equals("onderhoud")){
            System.out.println("onderhouden");
        }else if (service.equals("modificatie")){
            System.out.println("modificeren");
        }
    }
}
