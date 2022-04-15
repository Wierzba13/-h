package Inheritance;

public class Weather {
    static {
        System.out.println("STATIC INITIALIZER");
    }
    {
        System.out.println("INSTANCE INITIALIZER");
    }
    public Weather() {
        System.out.println("CONTRUCTOR");
    }
}
