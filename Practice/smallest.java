import java.util.*;

public class smallest {
    public static void main (String [] args ) {
        int [] arr = {5, 2, 4, 6, 9};
        int small = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < small) {
                small = arr[i];
            }
       
        }
        arr[0] = 100;
        arr[1] = 101;
        arr[2] = 102;
        arr[3] = 103;
        arr[4] = 104;
        System.out.println("Smallest: " + small);
        System.out.println("Updates array elements:");
        for (int i = 0; i < arr.length; i++ ) {
            System.out.println("Index " + i + " : " + arr[i] );
    }
}
}