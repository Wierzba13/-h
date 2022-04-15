/* 
    author: Raul Wierzbiński
*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);    
        System.out.println("LICZBY MUSZA BYC LICZBAMI CALKOWITYMI!");
        System.out.println("Podaj początek ciągu: ");
        int start = scan.nextInt();    
        System.out.println("Podaj koniec ciągu: ");
        int finish = scan.nextInt(); 
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
            System.out.println("Początek przedziału musi być mniejszy od końca");
        }
    }
}