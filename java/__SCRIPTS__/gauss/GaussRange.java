/* 
    author: Raul Wierzbiński
*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    
        System.out.println("LICZBY MUSZA BYC LICZBAMI CALKOWITYMI!");
        System.out.println("Podaj początek ciagu: ");
        int start = scanner.nextInt();    
        System.out.println("Podaj koniec ciagu: ");
        int finish = scanner.nextInt(); 
        scanner.close();
        System.out.println("--------------------------");
        double sum = start + finish;
        
        
        if(start < finish) {
            double result = 0;

            if((finish - start) % 2 == 0) {
                result = ((finish - start) / 2) * sum;
            } else {
                result = (Math.round(((finish - start) / 2)) +1)  * sum;
            }
    
            System.out.println("SUMA WYNOSI: " + result);
        } else {
            System.out.println("Poczatek przedzialu musi być mniejszy od konca");
        }
    }
}