package date_time_numericObj;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class WrapperClass {
    public static void main(String[] args) {
        /*
            Float - float
            Integer - int
            itp..

            Float pisane z duzej litery to 'opakowania' - klasa lub referencja, ktora potrafia przyjac 'null',
            typy danych pisane z malej litery to typy prymitywne gwarantujace przypisanie domyslnej wartosci,
                                                                    jezeli nie przypiszemy wartosci sami.
        */


//        int a = 20;
//        Integer b = 13;
//        System.out.println(a+b);
//        System.out.println(Integer.MAX_VALUE);
//
//        Float c = Float.valueOf(a);
//        float d = Float.parseFloat(b.toString());
//        System.out.println(c);
//        System.out.println(d);

        /*
            Nie można zrobić bezpośredniego przypisania wartości BigInteger przykładowo do wartości int (ani odwrotnie),
            pomimo że BigInteger przechowywałaby liczbę z zakresu int.
            Jest to spowodowane tym, że klasa BigInteger jest typem obiektowym, a do zmiennych typu int nie
            można przypisywać obiektów.
            Nie istnieje też żadna automatyczna konwersja między takimi wartościami.

            BigDecimal i BigInteger służą do przechowywania liczb z DOKLADNA precyzja
           Uzywa sie ich rowniez aby można było ich używać jako obiektów
        */

//        BigDecimal price = BigDecimal.valueOf(1.85);
//        BigDecimal rate = BigDecimal.valueOf(0.065);

//        price = price.subtract(price.multiply(rate)).setScale(3, RoundingMode.HALF_UP);
//        System.out.println(price);

        BigDecimal price = BigDecimal.valueOf(1932.58);
        BigDecimal extra = BigDecimal.valueOf(137.28);
        BigDecimal tax = BigDecimal.valueOf(0.038);
        /* Set precision to 5 */
        MathContext mc = new MathContext(15);


        /* +++ dodawanie +++ */
        BigDecimal sum = price.add(extra);
        System.out.println("Dodawanie: \t" + sum);

        /* --- odejmowanie --- */
        System.out.println("Odejmowanie: \t" + price.subtract(extra));

        /* *** mnozenie *** */
        System.out.println("Mnozenie: \t" + price.multiply(tax));


        /* /// dzielenie /// */
        System.out.println("Dzielenie: ");
        System.out.println(price.divide(tax, RoundingMode.HALF_UP));
        System.out.println(price.divide(tax, mc));

        /* ** potegowanie ** */
        System.out.println("Potegowanie: \t" + price.pow(3));

        /* kilka dzialan jednoczesnie */
        System.out.println("Kilka dzialan na raz: \t" + price.multiply(tax).add(BigDecimal.valueOf(2)));

        System.out.println("---------------------------------");

        System.out.println("Zaokraglanie: \t" + price.multiply(tax).add(BigDecimal.valueOf(2)).setScale(3, RoundingMode.HALF_UP));
    }
}