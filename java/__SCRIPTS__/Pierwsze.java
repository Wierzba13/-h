import java.util.Scanner;

public class Pierwsze {
          
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj poczatek zakresu: ");
        int start = scanner.nextInt();
        System.out.println("Podaj koniec zakresu: ");
        int finish = scanner.nextInt();
        scanner.close();
        System.out.println("-------------------------------------------------");
         
        for (int i = start; i < finish; i++) {
            boolean result = true;
            if(i < 2) {
                result = false;
            }
            else for(int j = 2; j <= i / 2; j++) {
                if(i % j == 0) {
                    result = false;
                    break; 
                }
            }

            if(result) System.out.println(i);
        }
    }
}
