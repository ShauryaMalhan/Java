package CodeForces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SortwithStep {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int a = in.nextInt();
            int k = in.nextInt();
            int[] arr = new int[a];
            for (int i = 0; i < a; i++) {
                arr[i] = in.nextInt();
            }
            int[] final1 = Arrays.copyOf(arr, a);
            Arrays.sort(final1);
            for (int i = 0; i < a; i++) {
                arr[i] = arr[i] - final1[i];
            }
            ArrayList<Integer> arr1 = new ArrayList<>();
            for (int i = 0; i < a; i++) {
                if(arr[i] % k != 0){
                    arr1.add(arr[i]);
                }
            }
            int ans = -1;
            if(arr1.size() == 0){
                ans = 0;
            }else if(arr1.size() == 2 && (arr1.get(0) + arr1.get(1)) % k == 0){
                ans = 1;
            }
            System.out.println(ans);
        }
    }
}