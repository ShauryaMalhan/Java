package CodeForces;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class SorttheSubarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0) {
            int n = in.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            ArrayList<Integer> arr1 = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr.add(in.nextInt());
            }
            for (int i = 0; i < n; i++) {
                arr1.add(in.nextInt());
            }
            int p = 0;
            int q = 0;
            for (int i = 0; i < n; i++) {
                if(!Objects.equals(arr.get(i), arr1.get(i))){
                    p = i;
                    break;
                }
            }
            for (int i = n - 1; i >= 0; i--) {
                if(!Objects.equals(arr.get(i), arr1.get(i))){
                    q = i;
                    break;
                }
            }
            for (int i = p; i > 0; i--) {
                if(arr1.get(i) >= arr1.get(i - 1)){
                    p = i - 1;
                }else{
                    break;
                }
            }
            for (int i = q; i < n - 1; i++) {
                if(arr1.get(i) <= arr1.get(i + 1)){
                    q = i + 1;
                }else{
                    break;
                }
            }
            System.out.println((p + 1 ) + " " + (q + 1));
        }
    }
}
