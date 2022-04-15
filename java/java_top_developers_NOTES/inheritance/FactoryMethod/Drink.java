package Inheritance.FactoryMethod;

public class Drink extends Product {
    public Drink(String type) {
        super(type);
        System.out.println("from DRINK class");
    }
}
