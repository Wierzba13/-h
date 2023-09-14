//Raul Wierzbinski
import java.util.Scanner;

public class Nww {
    public static int nwd(int a, int b) {
        while(a != b) {
            if(a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        System.out.println("Nwd: " + a);
        return a;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj A: ");
        int a = scanner.nextInt();
        System.out.println("Podaj B: ");
        int b = scanner.nextInt();
        scanner.close();
        
        System.out.println("Nww: " + ((a * b) / nwd(a, b)));
    }
}