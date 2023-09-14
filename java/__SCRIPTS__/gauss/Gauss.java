/* 
    @author: Raul Wierzbiński
*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    
        System.out.println("LICZBY MUSZA BYC LICZBAMI CALKOWITYMI!");
        int start = 1;    
        System.out.println("Podaj koniec ciagu: ");
        int finish = scanner.nextInt(); 
        scanner.close();
        System.out.println("--------------------------");

        if(start < finish) {
            int sum = start + finish;
            int mid = (sum) / 2;
            int c = 0;
            
            for(int i = start; i <= finish; i++) {
                c++;
            }
            int result = mid * sum;
    
            System.out.println("SUMA WYNOSI: " + result);
        } else {
            System.out.println("Początek przedziału musi być mniejszy od końca");
        }
    }
}