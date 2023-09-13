# JAVA NOTES

## Modyfikatory dostepu

| Modyfikator   | Klasa    | Pakiet | Podklasa | Inni |
|:----- |:-------:|:----------------:|:----------------:|:----------------:|
| public | + | + | + | + |
| protected | + | + | + | - |
| private | + | - | - | - |  

## Typy prymitywne i referencyjne

Typy prymitywne

| Typ   | bits    | domyslna wartosc |
|:----- |:-------:| ----------------:|
| byte  | 8bits   | 0 |
| short | 16bits  | 0 |
| int   | 32bits  | 0 |
| long  | 64bits  | 0 |
| float  | 32bits  | 0.0 |
| double  | 64bits  | 0.0 |
| char  | 16bits  | \u0000 (*) |
| boolean  | 8bits  | false |

\* Jest to znak o zerowym kodzie Unicode i reprezentuje brak znaku lub znak pusty

short => int ~ rzutowanie niejawne (kompilator zrobi to automatycznie), gdyz short ma mniejsza wartosc niz int  
int => short ~ rzutowanie jawne, gdyz int ma wiekszy zakres niz short

* Float (pisane z duzej litery - to 'opakowania') - klasa lub referencja, ktora potrafia przyjac `null`.  
* Typy danych pisane z malej litery to typy prymitywne gwarantujace przypisanie domyslnej wartosci, jezeli nie przypiszemy wartosci sami.
* W typach prymitywnych operujemy w kodzie bezposrednio na ich wartosciach, a nie na referencjach do nich.

```java
int a = 20;
Integer b = 13;
System.out.println(a+b); // 33
System.out.println(Integer.MAX_VALUE);

Float c = Float.valueOf(a);
float d = Float.parseFloat(b.toString());
System.out.println(c); // 20.0
System.out.println(d); // 13.0

// BigDecimal nie mozna przypisac wartosci double i odwrotnie
BigDecimal price = BigDecimal.valueOf(1932.58);
```

## Blok static

Kod w tym bloku kodu zostanie wykonany tylko raz, podczas ladowania klasy do pamieci

```java
public class ExampleClass {
    public static int number = 0;

    static {
        number = 42;
    }

    public static void main(String[] args) {
        System.out.println(number); // 42
    }
}
```

## Przeciążanie metody

* Przeciazenie metody to implementacja wariantu metody ktora to przyjmuje inny typ danych dla jej argumentow lub jej inna ilosc.
* Podczas wywolywania metody JVM automatycznie wybierze odpowiedni wariant metody na podstawie podanych argumentow
* Aby przeciazyc metode musza byc spelnione nastepujacy warunek **nazwa i zwracany przez metode typ danych jest identyczny**

## Metody varargs - metody z nieznana liczba argumentow

W języku Java można tworzyć metody, które przyjmują zmienną liczbę argumentów (zwane także metodami *varargs*), dzięki czemu do takich metod  można przekazywać różną liczbę argumentów.

* Aby zadeklarować taką metodę, należy użyć trzech kropek `...` po typie argumentu.
* Argumenty varargs są traktowane jak tablica danego typu.

```java
public class ExampleClass {

    static double sumMoney(double... numbers) {
        double sum = 0;

        for (double number : numbers) {
            sum += number;
        }

        return sum;
    }

    public static void main(String[] args) {
        double totalMoney1 = sumMoney(20.0, 15.0, 3.0);
        double totalMoney2 = sumMoney(15.0, 30.0, 40.0);

        System.out.println(totalMoney1); // 38.0
        System.out.println(totalMoney2); // 85.0
    }
}
```

## Przeslanianie metod

W hierarchii klas metoda klasy pochodnej moze miec taki sam typ zwracany i sygnature jak metoda w klasie bazowej. Mowimy wtedy o przeslanianiu metody klasy bazowej. Wywolanie przeslonietej metody przez klase pochodna spowoduje **ZAWSZE** wywolanie implementacji metody zdefiniowanej w klasie pochodnej.

```java
class Animal {
    void sound() {
        System.out.println("Default sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("HauHau");
    }
}

class Cat extends Animal {
    //code there...
}

class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.sound(); // HauHau
        cat.sound(); // Default sound
    }
}
```

## Konstruktor

Jest to metoda wywolywana podczas tworzenia obiektu. Przyklad wywolania domyslnego konstruktora:

```java
Person obj = new Person();
```

Wazne informacje dot. konstruktora:

1. metoda konstruktora musi miec nazwe taka sama jak klasa

    ```java
    public Person() {}
    ```

2. wywołanie metody super() powoduje wywołanie konstruktora klasy nadrzędnej

    ```java
    public Person() {
        super(args);
        super.metoda(args);
    }
    ```

3. konstruktor mozna przeciazac, aby wiec w konstrutorze wywolac konstruktor tej samej klasy uzywamy:

    ```java
    this(arguments...)
    ```

## Enkapsulacja/Hermentyzacja

Proces ukrywania danych np. za pomoca 'access modifier' jak public, private itp, itd

## Immutable objects

Obiekty stworzone tylko do odczytu - nie mozesz zmienic w nich wartosci po wywolaniu konstruktora
Aby to uzystakc trzeba:

* deklarowac zmienne klasy jako prywatne
* nie deklarowac setterow

## Instance initializer

Kod ktory wykona sie przed wywolaniem konstruktora, przydatny mechanizm do wykonania operacji inicjalizacyjnych, które są wspólne dla wszystkich konstruktorów w danej klasie.

```java
{ 
    // code... 
}

public Constructor() {
    // code ...
}
```

## Java Memory

W javie pamiec dzielimy na: **stack oraz heap**

### Stack (stos)

* krotki czas zycia zmiennych (od klamry do klamry) - zmienne lokalne
* szybszy dostep do pamieci
* alokacja pamieci odbywa sie automatycznie
* pamiec na stosie jest przydzielana statycznie oraz jest ograniczona
* stos wykorzystywany do przechowywania danych krotkotrwalych

### Heap (Sterta)

* nieuzywane obiekty sa usuwane przez garbage collector
* wolniejszy dostep do pamieci poniewaz sterta wymaga alokacji i dealokacji oraz obslugi garbage collectora
* alokacja pamieci jest manualna - programista musi jawnie tworzyc/usuwac obiekty
* pamiec na stercie jest przydzielana dynamicznie w miare potrzeb - to tu przechowuje sie obiekty o zmiennych rozmiarach

## Typy generyczne (generics)

Pozwalaja na zaprojektowanie klasy bez znajomosci typu danych ktory bedziemy wykorzystywac. Bedzie on nadany pozniej - co pozwala na wieksza uniwersalnosc zaimplementowanej klasy. Wykorzystujemy tu operator diamentu `<>`

| Litera  | Opis            |
| :------ |:---------------:|
| T | type |
| E | element |
| V | value |
| K | key |

```java
// Typ T musi rozszerzac klase o nazwie 'ClassName'
public class Generic<T extends ClassName> {
    // code ...
}

// Wildcard (?) - Lista elementow dziedziczacych po klasie 'ClassName'
List<? extends ClassName>
```

## Enum

To specjalny 'typ klasy' przechowywjacy okreslony zbior wartosci (tu nt, pogody ).

* Wartosci w ENUM sa **public static final**.

```java
public enum Weather {
    WARM("Its WARM!"),
    HOT("Its HOT!"),
    COLD("Its COLD!");

    private String caution;
    //constructor
    Weather(String caution) {
        this.caution = caution;
    }

    //see Main.java in OOP pack
    public String getCaution() {
        return this.caution;
    }
}

class Main {
    public static void main(String args[]) {
        Weather weather;
        weather = Weather.COLD;
        System.out.println(weather);
        System.out.println(Weather.HOT.getCaution());
    }
}
```

## ArrayList

Jest to dynamiczna tablica (lista), która automatycznie dostosowuje swój rozmiar do liczby elementów w niej przechowywanych. Oznacza to, że nie musisz z góry określać jej rozmiaru i możesz elastycznie dodawać i usuwać elementy.

```java
List<String> shopList = new ArrayList<>();
shopList.add("pizza");
shopList.add("bread");
shopList.add("milk");

// Stala ilosc elementow
List<String> test = List.of("Hello", "World");
```

## HashSet

* nie pozwala na duplikaty
* domyslny rozmiar to 16 elementow, przy 75% zapelnienia tworzony jest nowy 2x wiekszy

```java
Set<Integer> set1 = new HashSet<>();
set1.add(15);

Set<Integer> set2 = Set.of(15, 22, 15); // error: duplicate element - 15
```

## ArrayDeque

Dodajesz elementy na gore/dol stosu i zdejmujesz je z gory/dolu
**Nie dopuszcza 'null'**

```java
Deque<String> deq1 = new ArrayDeque<>();
```

## HashMap<K, V>

Zestaw klucz-wartosc, gdzie:
klucz - index wskazujacy na wartosc

```java
Map<Integer, String> assocc = new HashMap<>();
```

## Logger

```java
import java.util.logging.*;

private static Logger logger = Logger.getLogger(handle_exceptions.Main.class.getName());
```

* Uzywaj nazwy loggera takiej jak nazwa klasy
* Ustawianie domyslnego levelu:

    ```java
    logger.setLevel(Level.INFO);
    ```

* Kazdy wyjatek jest reprezentowany przez odpowiednia klase ktora moze dziedziczyc z innych wyzej w hierarchii
* W javie rozrozniamy wyjatki oznaczone i nieoznaczone
  
    | Typ  | Opis  |
    | :--- | :-----|
    | oznaczone | Musza byc 'zlapane'. Programista nie jest im winny (np. uszkodzenie dysku) |
    | nieoznaczone | Moga ale nie musza byc 'zlapane'. Czesto z winy programista (np. NullPointerExceptions) |

* Mozemy tworzyc wlasne wyjatki, ale klasa je implementujace musi rozszerzac klase Exception
  
## Dziedziczenie

* Każda klasa, domyslnie rozszerza klase 'Object' (chyba ze sami wskazemy inna za pomoca slowa kluczowego extends)
* hashCode() - tozsamosc obiektu w kodzie 16-tkowym (cos w rodzaju ID)
* equals() - sluzy do porownywania obiektow
* this - odwolanie sie do zmiennej/metody w biezacej klasie
* super - odwolanie sie do zmiennej/metody w nadrzednej klasie
* Implementacja domyslnego konstruktora

    ```java
     public Product() {
        super();
    }
    ```

## Klasa abstrakcyjna

* Moze zawierac metody abstrakcyjne ale nie musi.
* Jezeli chociaz jedna metoda jest abstrakcyjna to klasa rowniez musi byc abstrakcyjna.
* Metody abstrakcyjne MUSISZ rozszerzyc w klasie rozszerzajacej

`Klasy abstrakcyjne sluza jako zdefiniowanie pewnego rodzaju abstrakcyjnego szablonu dla klas je rozszerzajacych.`

```java
abstract class Product {
    // Metoda abstrakcyjna NIE moze zawierac implementacji ani nawet nawiasow klamrowych {}
    // Metoda abstrakcyjna NIE może być statyczna
    abstract String methodName(arguments);

    public String getName() {
        return this.name;
    }
}

public class Food extends Product {
    String methodName(arguments) {
        // method code...
    }
}
```

## Interfejsy (Interfaces)

* moga zawierac STALE, nie zmienne
* metody interface'u sa domyslnie `public abstract`
* atrybuty interface'u sa domyslnie `public static final`
* interface nie moze zawierac konstruktora
* w interface mozna implementowac metode za pomoca slowa kluczowego `default`
* interface jest odpowiednim typem referencyjnym
* Klasa moze implementowac wiele interfejsow (rozszerzac moze tylko 1 klase abstrakcyjna)

```java
public interface <InterfaceName> {
    public static final String male = "MALE"; // STALA

    void sayHello();
    
    public default boolean isAdult(int age) {
        return age >= 18;
    }
}

```

Functional Interface - jest to interface, który posiada tylko jedną metodę abstrakcyjną.

Interface moze rozszerzac inny interface

```java
public interface X extends Y {
    // interface body...
}
```

W takim przypadku klasa implementujaca interface X musi rowniez zaimplementowac metody z interface'u Y

```java
// przyklad implementacji wlasnej adnotacji
public @interface ExampleAdnotation {}
```

Dopuszczalne jest deklarowanie zmiennej typu interfejsu, ale przypisanie jej wartosci moze odbyc sie tylko za pomoca operatora `new` dla klasy ktora implementuje owy interfejs

```java
Comparable x;

x = new Employee(); // poprawne tylko jesli klasa Employee implementuje interfejs Comparable
```

Rowniez za pomoca operatora `instanceof` mozna sprawdzic czy obiekt nalezy do klasy implementujacej dany interfejs

```java
if(exampleObject instanceof Comparable) {
    ...
}
```

## Watki (Threads)

* Wątek (Thread) - sciezka wykonania mogaca obejmowac serie roznych wywolan metod.
* Akcja watku jest implementowana za pomoca metody 'run' z interfejsu 'Runnable'
* Watek alokuje czesc CPU w czasie do wykonania swojego zadania
* Jezeli zaczniemy watek X wczesniej od watku Y nie oznacza to ze dzialanie watku X zakonczy sie szybciej niz watku Y
* return w metodach 'run' lub 'main' zakanczaja watek

Stany watku

| Stan | Opis |
| :--- | :--: |
| NEW |  Watek jeszcze sie nie rozpoczal |
| RUNNABLE | Watek jest wykonywany |
| BLOCKED | Watek jest zablokowany |
| WAITING | Watek czeka tak dlugo az dostanie sygnal od innego watku |
| TIMED_WAITING | Watek czeka określony okres czasu |
| TERMINATED | Watek sie zakonczyl |

```java
Thread t = new Thread(new ForLoopX(1000L)); // L means its Long value
t.start(); // start thread

Runnable run = () -> {
    // Thread logic here ...
    for (int i = 0; i < 1000; i++) continue;
};

Thread t2 = new Thread(run);
t2.start();
t2.stop();

try {
    Thread.sleep(3000); // 'Zamrozenie' programu na 3s (1s = 1000ms)
} catch (InterruptedException e) {
    e.getMessage();
}

System.out.println(t2.isAlive());
System.out.println(t2.getState());
System.out.println(t2.getId());
System.out.println(t2.getName());
```

## Klasy zagniezdzone

To klasy znajdujące się w innej klasie
`this` w klasie zagnieżdżonej odnosi się tylko do tej klasy (nie działa na klase w której się znajduje)

* Zagnieżdżona klasa prywatna
    1. Dostep do jej metod i atrybutow (nawet tych prywatnych) mamy tylko z klasy w ktorej znajduje sie owa klasa zagnieżdżona
* Anonimowe Klasy Zagnieżdżone
    1. Umozliwiaja przy tworzeniu instancji, nadpisanie metod dla tylko tej konkretnej instancji Ulatwia korzystanie z interfejsow funkcyjnych

## Lambda (Funkcje anonimowe)

Sa to funkcje do ktorych nie mozemy sie pozniej odwolac, wykorzystywane w okreslonych sytuacjach, np.

```java
// Suma liczb parzystych od 2 do 20
IntStream.rangeClosed(1,10).map((int x) -> {return x * 2}).sum(); 
```

## STREAMY

* Stream to niezmienny przeplyw elementow
* BaseStream definiuje podstawowe zachowania strumieni
* DoubleStream, IntStream, LongStreeam, Stream - pozwalaja strumieniowac dane typu prymitywnego wplywajac pozytywnie na wydajnosc

Funkcjonalne interfejsy dla strumieni:

| Nazwa   | Opis    | przykladowa metoda |
|:----- |:-------:| ----------------:|
| Predicate  | wykonuje testy/sprawdza dane | | .filter() |
| Function   | rzutuje typy | | .map() |
| UnaryOperator   | konwertuje wartosci | | .map() |
| Consumer    | przerabia elementy | | .peek() forEach() |
| Supplier    | produkuje elementy | | .generate() |

### Funckje strumieni

1. Kontynuujace strumien:
    * filter
    * flatMap
    * map
    * sorted
    * takeWhile
2. Konczace strumien:
    * forEach
    * count
    * sum
    * average
    * findAny
    * allMatch

Predicate - warunki

* .and() = &&
* .or() = ||
* .negate() = !
* .isEqual() =  ==
* .not() =  !=
* .andThen() = do laczenia funkcji razem

## Serializacja (Serialization)

to proces konwertowania obiektu w strumien bajtow (zapisywany w pliku .ser albo przesylany przez siec). Dzieki temu obiekt 'zapisuje swoj stan' po zakonczeniu programu. Klasa ktorej obiekty bedziemy serializowac musi implementowac interfejs `Serializable` oraz pierwsza klasa w hierarchii dziedziczenia, która nie jest serializowalna musi mieć dostępny konstruktor bezparametrowy.

* Pola statyczne sie nie serializuja !
* Pola oznaczone keywordem `transient` nie sa serializowane
* serialVersionUID to unikalna versja ID dla zserializowanej klasy (identyczny po deserializacji)

***Deserializacja*** - proces odwrotny do serializacji = konwersja strumienia bajtow w obiekt.

```java
class User implements Serializable {
    String name;
    String password;
    
    public void sayHello() {
        System.out.println("Hello " + name);
    }
}

class MainSerializable {
    public static void main(String[] args) throws FileNotFoundException {
        User user = new User();
        user.name = "wierzba";
        user.password = "passwd";
        
        FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        
        out.writeObject(user);
        out.close();
        fileOut.close();
        System.out.println("Object info saved!");
        
        long serialVersionUID = ObjectStreamClass.lookup(User.getClass()).getSerialVersionUID(); 
        System.out.println(serialVersionUID);
    }
}

class MainDeserialization {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {
           User user = null;    // Dzialamy na utworzonej klasie a nie tej zserializowanej !!!
           FileInputStream fileIn = new FileInputStream("UserInfo.ser");
           ObjectInputStream in = new ObjectInputStream(fileIn);
           
           user = (User) in.readObject();
           
           in.close();
           fileIn.close();
           
           System.out.println(user.name);
           System.out.println(user.password);
           user.sayHello();
    }
}
```

## SOLID

[Youtube video about SOLID - pretty good](https://www.youtube.com/watch?v=_jDNAf3CzeY)

* Single responsibility ~ kazda klasa powinna miec 1 uzytecznosc oraz nie byc przeladowana funkcjonalnosciami
* Open-Closed ~ klasa powinna byc otwarta na rozszerzanie, a zamknieta na modyfikacje (nie powinienes przepisywac istniejacej klasy do zaimplementowania nowych funkcjonalnosci)
* Liskov substitution ~ 
* Interface segregation ~ interfejsy nie powinny narzucac klasom czego nie moga robic.
* Dependency Inversion ~ komponenty powinny zalezec od abstrakcji
