package neo.factory;

public class Espresso implements Coffee {

    @Override
    public void make() {
        System.out.println("Espresso is ready!");
    }
}
