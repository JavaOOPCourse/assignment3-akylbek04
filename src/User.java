public abstract class User {
    String name;
    Integer id;

    public User(String name, Integer id){
        this.name = name;
        this.id = id;
    }

    abstract public void manageService(Service s);

    abstract public void useService(Service s);
}