package multithreading;

public class Main {
    public static void main(String[] args) {
/*
    Wątek (Thread) - sciezka wykonania mogaca obejmowac serie roznych wywolan metod.
    Akcja watku jest implementowana za pomoca metody 'run' z interfejsu 'Runnable'
    Watek alokuje czesc CPU w czasie do wykonania swojego zadania
    Jezeli zaczniemy watek X wczesniej od watku Y nie oznacza to ze dzialanie watku X zakonczy sie szybciej niz watku Y
    return w metodach 'run' lub 'main' zakanczaja watek


    STANY WATKU:

        NEW                 Watek jeszcze sie nie rozpoczal
        RUNNABLE            Watek jest wykonywany
        BLOCKED             Watek jest zablokowany
        WAITING             Watek czeka tak dlugo az dostanie sygnal od innego watku
        TIMED_WAITING       Watek czeka określony okres czasu
        TERMINATED          Watek sie zakonczyl
*/

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

    }
}
