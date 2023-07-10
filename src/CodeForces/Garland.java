package CodeForces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Garland {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            String n = in.next();
            int[] arr = new int[4];
            for (int i = 0; i < 4; i++) {
                arr[i] = n.charAt(i);
            }
            Arrays.sort(arr);
            if(arr[0] == arr[1] && arr[1] == arr[2] && arr[2] == arr[3]){
                System.out.println(-1);
            }else if(arr[0] == arr[1] && arr[1] == arr[2] || arr[1] == arr[2] && arr[2] == arr[3]){
                System.out.println(6);
            }else{
                System.out.println(4);
            }
        }
    }
}
