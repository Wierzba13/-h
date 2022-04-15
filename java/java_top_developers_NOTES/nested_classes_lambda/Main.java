package nested_classes_lambda;


public class Main {
    public static void main(String[] args) {
/*
    0. Klasy zagnieżdżone
        To klasy znajdujące się w innej klasie

    1. Zagnieżdżona klasa prywatna
        Dostep do jej metod i atrybutow (nawet tych prywatnych) mamy tylko z klasy w ktorej znajduje sie owa klasa zagnieżdżona

    2. this
        this w klasie zagnieżdżonej odnosi się tylko do tej klasy (nie działa na klase w której się znajduje)

    3. Anonimowe Klasy Zagnieżdżone
        Umozliwiaja przy tworzeniu instancji, nadpisanie metod dla tylko tej konkretnej instancji
        Ulatwia korzystanie z interfejsow funkcyjnych
0
    4. Funkcyjny odpowiednik Klasy anonimowej (funkcja anonimowa)
    5. Odwolanie do metody
        <Class>::<staticMethodName>
        <Class>::<instanceMethod>
        <Object>::<instanceMethod>
        <Class>::new    // Referencja do konstruktora

        Zamiast:
            (s) -> <Class>.<staticMethod>(s)
        Uzywac:
            <Class>::<staticMethod>
*/


/* KLASY ZAGNIEŻDŻONE

//        Outer outer = new Outer();
//        Outer.InnerClass inner = new Outer.InnerClass();

//        Outer.outerMethod();
//        Outer.InnerClass.innerMethod();
//        String secInner = inner.secondInner();
//        System.out.println(secInner);
//        outer.testPrivateInnerClass();

        // // Klasa anonimowa
//        outer.printHello();
//        Outer secOuter = new Outer() {
//            @Override
//            public void printHello() {
//                System.out.println("Hello World! Override.");
//            }
//        };
//        secOuter.printHello();

*/

/* LAMBDA
*/




    }
}
