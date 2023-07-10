package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Introduction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] rnos = new int[5];
        int[] rnos2 = {23, 45, 67, 3, 45};
        int[] arr = new int[5];
        // input using for loops
        for (int i = 0; i < rnos.length; i++) {
            rnos[i] = in.nextInt();
        }
//        for(int num : arr){
//            System.out.println(num); // Here num is the element of the array
//        }
        System.out.println(Arrays.toString(rnos));
    }
}
