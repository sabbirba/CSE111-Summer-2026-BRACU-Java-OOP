import java.util.*;

public class task2 {
    public static void main (String [] args ) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            char prev;
            if ( ch == 'a') {
                prev = 'z';                
            }
            else {
                prev = (char)(ch-1);
            }
        result += prev;
        }
    System.out.println(result);
    }
}