package OOP;

public class Main {
    public static void main(String[] args) {
/*      Notatki z OOP

            MODYFIKATORY:
                <MODYFIKATOR>    <KLASA>    <PAKIET>    <PODKLASA>  <INNI>  <POPRAWNY DLA KLASY>
                * public        tak         tak         tak         tak     tak
                * protected     tak         tak         tak         nie     nie
                * brak          tak         tak         nie         nie     tak
                * private       tak         nie         nie         nie     nie


            0. static i final
                final - sluzy do definiowania stalych
                static - pozwala zdefiniowac atrybut/metode ktora nalezy do wszystkich instancji danej klasy,
                         mozna uzyskac do niej dostep bez tworzenia instancji klasy

            1. Kod w tym bloku kodu zostanie wykonany tylko raz, podczas ladowania klasy do pamieci
            static {
                code...
            }

            2. Przeciążanie metody
                To napisanie dla metody wariantu który przyjmuje inny typ danych jej argumentów
                !! nazwa i zwracany przez metode typ danych jest identyczny !!
                !! moze zawierac rozna ilosc argumentow (wtedy jvm wybierze odpowiednia poprzez podane argumenty !!

            3. Wiele argumentów dla metody
                public double sumMoney(double... moneys) {}
                metoda ta przyjmuje wiele argumentow typu double zapisywanych do tablicy o nazwie moneys

            4. Konstruktor
                metoda wywolywana podczas tworzenia obiektu - Person obj = new Person();
                metoda konstruktora musi miec nazwe taka sama jak klasa
                    public Person() {}
                wywołanie metody super() powoduje wywołanie konstruktora klasy nadrzędnej
                    super(args);
                    super.metoda(args);

                * konstruktor mozna przeciazac, aby wiec w konstrutorze wywolac konstruktor tej samej klasy uzywamy:
                    this(arguments...)

            5. Enkapsulacja/Hermentyzacja - proces ukrywania danych np. za pomoca 'access modifier' jak public, private itp, itd
            6. Prywatne metody mozna wywolac w innej metodzie TEJ SAMEJ KLASY

            7. getter/setter
            to metoda umozliwiajaca odczytanie, ustawienie zmiennej, do ktorej nie mamy bezposredniego dostepu

            8. Immutable objects
            obiekty stworzone tylko do odczytu - nie mozesz zmienic w nich wartosci po wywolaniu konstruktora
            Aby to uzystakc trzeba:
                - deklarowac zmienne klasy jako prywatne
                - nie deklarowac setterow

            9. Instance initializer
            { code... }
            public Constructor() {}
            Kod ktory wykona sie przed wywolaniem konstruktora

            10. Java Memory
            W javie pamiec dzielimy na: stack & heap
            stack to pamiec dla watku, lokoalne zmienne, metody (przechowuje typy prymitywne i referencje do obiektow)
            heap to pamiec wspoldzielona, dostepna z roznych watkow i metod (przechowuja Klasy i Obiekty)
*/

        /*
        Person adi = new Person();
        adi.setMoney(20);
        System.out.println(adi.getMoney());
        System.out.println("------------------------------");
        Person seba = new Person();
        seba.setMoney(20.34);
        System.out.println(seba.getMoney());
        System.out.println("------------------------------");

        System.out.println(seba.sumMoney(20, 35));
        */

        Weather weather;
        weather = Weather.COLD;
        System.out.println(weather);
        System.out.println(Weather.HOT.getCaution());
        System.out.println(Weather.HOT);


//        Generic obj1 = new Generic();
//        Generic obj2 = new Generic();
//
//        obj1.setVariable1("Siema");
//        obj2.setVariable1(12);
//
//        System.out.println(obj1.getVariable1());
//        System.out.println(obj2.getVariable1());

//        Person p1 = new Person();
//        Generic<Person> objX = new Generic<>();
//        objX.setVariable1(p1);
//        System.out.println(objX.getVariable1());
    }
}
