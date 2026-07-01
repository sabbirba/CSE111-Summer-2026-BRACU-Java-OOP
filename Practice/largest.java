public class largest {
    public static void main (String [] args ){
        int [] arr = {5, 2, 3, 5, 8};
        int large = arr[0];
    for (int i = 0; i < arr.length; i++){
        if (arr[i] > large){
            large = arr[i];
        System.out.println("Largest: " + large);
        }
    }
    arr[0] = 111;
    arr[1] = 112;
    arr[2] = 113;
    arr[3] = 114;
    arr[4] = 115;
    System.out.println("Updated Arrays:");
    for (int i = 0; i < arr.length; i++) { 
        System.out.println("Index " + i + " : " + arr[i]);
    }
    }
}