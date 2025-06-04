package neo.factory;

public class Americano implements Coffee {

    @Override
    public void make() {
        System.out.println("Americano is ready!");
    }
}
