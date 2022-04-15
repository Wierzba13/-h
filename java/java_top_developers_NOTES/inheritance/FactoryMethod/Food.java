package Inheritance.FactoryMethod;

public class Food extends Product {
    public Food(String type) {
        super(type);
        System.out.println("from FOOD class");
    }
    public void foodSayHello() {
        System.out.println("Hello from food class :)");
    }
}
