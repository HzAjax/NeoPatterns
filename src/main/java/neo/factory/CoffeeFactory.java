package neo.factory;

public class CoffeeFactory {
    public static Coffee getCoffee(String type) {
        return switch (type.toLowerCase()) {
            case "espresso" -> new Espresso();
            case "americano" -> new Americano();
            default -> throw new IllegalArgumentException("Unknown coffee type");
        };
    }
}
