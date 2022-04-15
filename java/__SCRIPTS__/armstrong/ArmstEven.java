/* 
    author: Raul Wierzbiński
*/

import java.util.Scanner;

public class Main {
    public static boolean isArm(int n) {
        int temp = n;
        int r, sum = 0;
        String txt = Integer.toString(n);
        int charNr = txt.length();
        
        while(n > 0) {
            
            r = n % 10;
            n = n / 10;
            sum = sum + (int)Math.pow(r, charNr);
        }
        if(temp == sum) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type start number: ");
        int ra_wierzbinski = scan.nextInt();
        int count = ra_wierzbinski + 1;
        int index = 0;
        int[] numbers = new int[10];

        for(int i = ra_wierzbinski; i < count; i++) {
            if(numbers[9] != 0) break;
            if(i > 10) {
                if(isArm(i)) {
                    numbers[index] = i;
                    index++;
                }
            }
            count++;
        }

        for(int i = 0; i < 10; i++) {
            if(i % 2 != 0) {
                System.out.println("ELEMENT: " + numbers[i]);
            }
        }
    }
}