/* 
    author: Raul Wierzbiński
*/

import java.util.Scanner;

public class Main {
    public static int bonifacy(int x) {
        if(x <= 1) {
            return x;
        }
        return bonifacy(x - 1) + bonifacy(x - 2);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = 0;
        System.out.println("Podaj n-ty element ciagu");
        x = scan.nextInt();
        System.out.println(bonifacy(x));
    }
}