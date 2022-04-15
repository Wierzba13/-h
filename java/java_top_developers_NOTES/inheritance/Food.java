package Inheritance;

public class Food extends Product {
    // Nadpisuje implementacje z klasy nadrzednej (takie same parametry i ich typy oraz nazwa metody)
    @Override
    public double getPrice(double price) {
        System.out.println("PRICE FROM FOOD CLASS");
        return price;
    }
}
