package CodeForces;

import java.util.ArrayList;
import java.util.Scanner;

public class SkiResort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            long n = in.nextInt();
            long k = in.nextInt();
            long q = in.nextInt();
            ArrayList<Long> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr.add(in.nextLong());
            }
            long sum = 0;
            long ans = 0;
            for (int i = 0; i < n; i++) {
                if(arr.get(i) <= q){
                    sum++;
                }else{
                    sum = 0;
                }if(sum >= k){
                    ans += sum - k + 1;
                }
            }
            System.out.println(ans);
        }
    }
}
