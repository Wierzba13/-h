//Raul Wierzbinski
import java.util.Scanner;

public class Nwd {
    public static void nwd(int a, int b) {
        if(a != b) {
            if(a > b) {
                a = a-b;
                nwd(a, b);
            } else {
                b = b-a;
                nwd(a, b);
            }
        } else {
            System.out.println("Nwd: " + a);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj A: ");
        int a = scanner.nextInt();
        System.out.println("Podaj B: ");
        int b = scanner.nextInt();
        scanner.close();

        nwd(a, b);
    }
}