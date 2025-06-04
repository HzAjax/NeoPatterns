package neo.proxy;

public class RealDatabase implements Database {
    private String name;

    public RealDatabase(String name) {
        this.name = name;
    }

    public void connect() {
        System.out.println("Connected to " + name);
    }
}
