package neo.factory;

public class TestCoffeeFactory {
    public static void main(String[] args) {
        Coffee coffee = neo.factory.CoffeeFactory.getCoffee("americano");
        coffee.make();
    }
}







