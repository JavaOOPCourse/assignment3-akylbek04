public class StreamingService extends Service
        implements PremiumFeature {
    boolean isPremium;

    public StreamingService(String serviceName, Integer serviceId ){
        super(serviceName, serviceId);
        this.isPremium = false;
    }
    @Override
    public void performService() {
        if(getIsActive()){
            System.out.println("StreamingService performs service");
        }else{
            System.out.println("StreamingService must be activated");
        }
    }

    @Override
    public void upgradeToPremium() {
        this.isPremium = true;
        System.out.println("Upgraded StreamingService to premium");
    }
}