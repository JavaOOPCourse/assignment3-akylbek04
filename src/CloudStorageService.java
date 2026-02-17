public class CloudStorageService extends Service
        implements PremiumFeature, Billable {

    boolean isPremium;

    public CloudStorageService(String serviceName, Integer serviceId ){
        super(serviceName, serviceId);
        this.isPremium = false;
    }

    @Override
    public void performService() {
        if(getIsActive()){
            System.out.println("CloudStorageService performs service");
        }else{
            System.out.println("CloudStorageService must be activated");
        }
    }

    @Override
    public void upgradeToPremium() {
        this.isPremium = true;
        System.out.println("Upgraded CloudStorageService to premium");
    }

    @Override
    public void generateBill() {
        System.out.println("Billing info for " + getServiceName() + " is processing..");
    }
}