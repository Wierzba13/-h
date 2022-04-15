import java.util.Scanner;

public class Armstrong {
    public static boolean isArm(int n) {
        int temp = n;
        int r, sum = 0;
        String txt = Integer.toString(n);
        int charNr = txt.length();
//         System.out.println("WAZNE " + charNr);
        
        while(n > 0) {
            
            r = n % 10;
            n = n / 10;
            sum = sum + (int)Math.pow(r, charNr); //r*r*r
        }
        if(temp == sum) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj początek zakresu: ");
        int start = s.nextInt();
        System.out.println("Podaj koniec zakresu: ");
        int finish = s.nextInt();
        System.out.println("-------------------------------------------------");
        
        for(int i = start; i < finish; i++) {
            
            if(isArm(i)) {
                System.out.println(i);
            }
            
        }
    }
}
