public class Customer extends User {
    public Customer(String name, Integer id){
        super(name, id);
    }

    @Override
    public void manageService(Service s) {
        System.out.println("customer cannot manage services");
    }

    @Override
    public void useService(Service s) {
        System.out.println("customer using service");
        s.performService();
    }
}