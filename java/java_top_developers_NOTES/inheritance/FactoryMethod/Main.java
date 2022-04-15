package Inheritance.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        Product prod1 = ProductFactory.createProduct("FOOD");
        Product prod2 = ProductFactory.createProduct("DRINK");
        Product prod3= ProductFactory.createProduct("other");

        System.out.println("-------------------------");

        Food f1 = (Food) prod1;
        f1.foodSayHello();

    }
}
