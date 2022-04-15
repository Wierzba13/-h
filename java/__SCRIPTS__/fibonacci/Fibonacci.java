import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj do jakiej liczby wypisac ciag Fibonacciego: ");
        int finish = s.nextInt();
        System.out.println("-------------------------------------------------");
    
        double tab[] = new double[finish];
        tab[1] = 1;
        tab[0] = 1;
        for (int i = 2; i < finish; i++) tab[i] = tab[i - 2] + tab[i - 1];
        
        for (int i = 0; i < finish; i++) System.out.println((int)tab[i]); 
    }
}
