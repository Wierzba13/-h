import java.util.Scanner;

public class Fizzbuzz {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj początek zakresu: ");
        int start = s.nextInt();
        System.out.println("Podaj koniec zakresu: ");
        int finish = s.nextInt();
        System.out.println("-------------------------------------------------");
        
        for (int i = start; i <= finish; i++) {
            boolean fizzOrBuzz = false;
            if (i % 3 == 0) {
                System.out.print("Fizz");
                fizzOrBuzz = true;
            }
            if (i % 5 == 0) {
                System.out.print("Buzz");
                fizzOrBuzz = true;
            }

            if (fizzOrBuzz) {
                System.out.println();
            } else {
                System.out.println(String.valueOf(i));
            }
        }
    }
}
