/* 
    author: Raul Wierzbiński
*/

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    /* 
        source of function below: http://www.algorytm.org/algorytmy-arytmetyczne/ciag-fibonacciego/fib-j.html
    */
    public static int fib(int n){
        if ((n==1)||(n==2))
            return 1;
        else
            return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj od jakiej liczby wypisac ciag Fibonacciego: ");
        int ra_wierzbinski = scan.nextInt();
        System.out.println("-------------------------------------------------");
       
        LinkedList<Integer> numbers = new LinkedList<>();
        
        for(int i= ra_wierzbinski+1; i < Math.pow(ra_wierzbinski, 2); i++) {
            if(numbers.size() > 10) break;
            numbers.add(fib(i));
        }

        for(int i = 0; i < 11; i++) {
            if(i % 2 != 0) {
                System.out.println(numbers.get(i));
            } 
        }
        
    }
}