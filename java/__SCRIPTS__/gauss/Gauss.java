/* 
    author: Raul Wierzbiński
*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);    
        System.out.println("LICZBY MUSZA BYC LICZBAMI CALKOWITYMI!");
        int start = 1;    
        System.out.println("Podaj koniec ciągu: ");
        int finish = scan.nextInt(); 
        System.out.println("--------------------------");
        int sum = start + finish;
        int c = 0;
        int mid = (finish + start) / 2;

        if(start < finish) {
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