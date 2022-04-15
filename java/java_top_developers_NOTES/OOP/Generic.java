package OOP;

/*  Typy generyczne

    pozwalaja przypisac pozniej do zmiennej wartosc, ktorej typu wczesniej nie znamy,
    wykorzystujemy tu litere ktora podana w <> po nazwie klasy (tu 'Y' - parametr typu klasy)

    konwencja mowi jednak by nazywac parametr typu klasy nastepujaco:
    T - type
    E - element
    V - value
    K - key

    Typ Y musi rozszerzac klase o nazwie 'ClassName'
    public class Generic<Y extends ClassName> {}

    Wildcard (?) - Lista elementow dziedziczacych po klasie 'ClassName'
    List<? extends ClassName>
*/

public class Generic<Y> {
    private Y variable1;

    public void setVariable1(Y arg) {
        this.variable1 = arg;
    }
    public Y getVariable1() { return this.variable1;  }
}
