public class Admin extends User {

    public Admin(String name, Integer id){
        super(name, id);
    }

    @Override
    public void manageService(Service s) {
        System.out.println("admin managing service");
    }

    @Override
    public void useService(Service s) {
        System.out.println("admin using service");
        s.performService();
    }
}