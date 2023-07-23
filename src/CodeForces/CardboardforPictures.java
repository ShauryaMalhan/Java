package CodeForces;

import java.util.*;

public class CardboardforPictures {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            long n = in.nextInt();
            long c = in.nextLong();
            long sum = 0;
            long alpha = 0;
            ArrayList<Long> obj = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                obj.add(in.nextLong());
                sum += obj.get(i) * obj.get(i);
                alpha += obj.get(i);
            }
            long start = 1;
            long end = (long)1e9;
            long ans = 0;
            while(start <= end){
                long mid = start + (end - start) / 2;
                long d = 4 * n * mid + 4 * alpha + (sum - c) / mid;
                if(d == 0){
                    ans = mid;
                    break;
                }else if(d >= 0){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
            System.out.println(ans);
        }
    }
}
