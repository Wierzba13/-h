package JavaStreams;

public class Main {
    public static void main(String[] args) {
/*
    0. Stream to niezmienny przeplyw elementow
    1. BaseStream definiuje podstawowe zachowania strumieni
    2. DoubleStream, IntStream, LongStreeam, Stream - pozwalaja strumieniowac dane typu prymitywnego wplywajac pozytywnie na wydajnosc

    Stream.of(args)
    Arrays.stream(arrayName)

    3. Funkcjonalne interfejsy dla strumieni:
        * Predicate = wykonuje testy/sprawdza dane       .filter()
        * Function = rzutuje typy                       .map()
        * UnaryOperator = konwertuje wartosci           .map()
        * Consumer = przerabia elementy                 .peek() .forEach()
        * Supplier = produkuje elementy                 .generate()

    4. Funckje strumieni:
        a) Kontynuujace strumien:
            - filter
            - flatMap
            - map
            - sorted
            -takeWhile
        b) Konczace strumien:
            - forEach
            - count
            - sum
            - average
            - findAny
            - allMatch
   5. Predicate - warunki
        * .and() = &&
        * .or() = ||
        * .negate() = !
        * .isEqual() =  ==
        * .not() =  !=
        * .andThen() = do laczenia funkcji razem
    6. Collectors
        Predefiniowane implementacje interfejsu 'Collector' dostarczane przez klase 'Collectors':
            * obliczajace streszczona wartosc jak min max average sum                                   Collectors.summarizingDouble()
            * mappujace i laczace strumienie elementow                                                  Collectors.joining(), Collectors.mapping()
            * zebrane elementy strumienia w kolekcje jak lista, zbior lub mapa                          Collectors.toList()

*/



    }
}
