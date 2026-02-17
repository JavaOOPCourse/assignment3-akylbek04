public class ConsultationService extends Service
        implements Billable {

    public ConsultationService(String serviceName, Integer serviceId ){
        super(serviceName, serviceId);
    }

    @Override
    public void performService() {
        if(getIsActive()){
            System.out.println("ConsultationService performs service");
        }else{
            System.out.println("ConsultationService must be activated");
        }
    }

    @Override
    public void generateBill() {
        System.out.println("Billing info for " + getServiceName() + " is processing");
    }
}