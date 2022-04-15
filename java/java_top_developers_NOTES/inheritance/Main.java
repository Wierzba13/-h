package Inheritance;

public class Main {
    public static void main(String[] args) {
/*
        1. Każda klasa, domyslnie rozszerza klase 'Object'
            (chyba ze sami wskazemy inna za pomoca slowa kluczowego extends)

        2. hashCode() - tozsamosc obiektu w kodzie 16-tkowym (cos w rodzaju ID)
        3. equals() - sluzy do porownywania obiektow

        3. Standardowa hierarchoa klas:
            Superclass - najbardziej ogolne atrybuty, zachowania
            Subclass - bardziej specyficzne atrybuty, zachowania ktore rozszerzaja klase rodzica
            Subclass dziedziczy atrybuty i metody od rodzica i moze zdefiniowac wlasne

        4. Rzutowanie typow
        Food implementuje metode getBestBefore()
        Product implementuje getName()

            Food x1 = new Food();
            Product x2 = new Drink();
            x1.toString(); // dziedziczenie z Object
            x1.getName(); // dziedziczenie z Product
            x1.getBestBefore(); // dziedziczenie z Food
            Product x3 = x1;
            x3.toString(); // success
            x3.getName(); // success
            x3.getBestBefore(); // error
            Object x4 = x1;
            x4.toString(); // success
            x4.getName(); // error
            x4.getBestBefore(); // error

            Mozna wykonywac metody zaimplementowane w danej klasie - do reszty tracimy dostep

        5. Odwolywanie sie
            this - biezaca klasa
            super - klasa nadrzedna

        6. Implementacja domyslnego konstruktora
        public Product() {
            super();
        }

        7. Klasa abstrakcyjna
            Moze zawierac metody abstrakcyjne ale nie musi.
            Jezeli chociaz jedna metoda jest abstrakcyjna to klasa rowniez musi byc abstrakcyjna.
            Metody abstrakcyjne MUSISZ rozszerzyc w klasie rozszerzajacej
        <public> abstract class Product {
            <public> abstract <String> methodName(arguments);
            public String getName() {
                return this.name;
            }
        }
        public class Food extends Product {
            <public> abstract <String> methodName(arguments) {
                // method code...
            }
        }



*/

//        Weather weather = new Weather();

//        Product prod1 = new Product();
//        Food food1 = new Food();
//        System.out.println(prod1.getPrice(20));
//        System.out.println(food1.getPrice(20));


    }
}
