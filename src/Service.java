public abstract class Service {
    private final String serviceName;
    private final Integer serviceId;
    private boolean isActive;

    public Service(String serviceName, Integer serviceId){
        this.serviceName = serviceName;
        this.serviceId = serviceId;
        this.isActive = false;
    }

    public void activateService(){
        this.isActive = true;
        System.out.println("Successfully activated");
    }

    public void deactivateService(){
        this.isActive = false;
        System.out.println("Successfully deactivated");
    }

    public String getServiceName(){
        return this.serviceName;
    }

    public boolean getIsActive(){
        return this.isActive;
    }

    abstract void performService();
}