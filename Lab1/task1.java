import java.util.*;

public class task1 {
    public static void main (String [] args ) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); 
        int b = sc.nextInt();
        
        int low;
        int high;

        if ( a < b ) { 
            low = a;
            high = b;
        }
        else {
            low = b;
            high = a;
        }

        int count = 0;

        for (int i = low+1; i < high; i++) { 
            boolean prime = true;
            if (i < 2){
                prime = false;
            }
            else {
                for (int j = 2; j * j <= i; j++) {
                    if (i % j == 0) {
                        prime = false;
                    }
                }
            }
            if (prime) {
                count++;
            }
        }
        System.out.println("There are "+ count +" prime numbers between "+ low + " and "+ high + ".");
    }
}