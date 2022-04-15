//Raul Wierzbinski
import java.util.Scanner;

public class Main {
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
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj A: ");
        int a = scan.nextInt();
        System.out.println("Podaj B: ");
        int b = scan.nextInt();

        nwd(a, b);
    }
}