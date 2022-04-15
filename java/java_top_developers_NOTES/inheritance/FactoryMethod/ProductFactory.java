package Inheritance.FactoryMethod;

public class ProductFactory {
    public static Product createProduct(String productType) {
        switch (productType) {
            case "FOOD":
                return new Food("food");
            case "DRINK":
                return new Drink("drink");
            default:
                return new Product("Other");
        }
    }
}
