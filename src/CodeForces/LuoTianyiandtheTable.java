package CodeForces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LuoTianyiandtheTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int r = in.nextInt();
            int c = in.nextInt();
            int n = r * c;
            ArrayList<Integer> obj = new ArrayList<>();
            for (int i = 0; i < r*c; i++) {
                obj.add(in.nextInt());
            }
            Collections.sort(obj);
            int sum1 = (obj.get(n - 1) - obj.get(0)) + (obj.get(n - 1) - obj.get(1));
            int sum2 = (obj.get(n - 1) - obj.get(0)) + (obj.get(n - 2) - obj.get(0));
            int max;
            if(r == 1 || c == 1){
                max = (obj.get(n - 1) - obj.get(0)) * (n - 1);
            }else if(c > r){
                if(sum1 > sum2){
                    int diff = obj.get(n - 1) - obj.get(0);
                    int diff1 = obj.get(n - 1) - obj.get(1);
                    max = (diff * (c - 1) * r) + (diff1 * (r - 1));
                }else{
                    int diff = obj.get(n - 1) - obj.get(0);
                    int diff1 = obj.get(n - 2) - obj.get(0);
                    max = (diff * (c - 1) * r) + (diff1 * (r - 1));
                }

            }else{
                if(sum1 > sum2) {
                    int diff = obj.get(n - 1) - obj.get(0);
                    int diff1 = obj.get(n - 1) - obj.get(1);
                    max = (diff * (r - 1) * c) + (diff1 * (c - 1));
                }else{
                    int diff = obj.get(n - 1) - obj.get(0);
                    int diff1 = obj.get(n - 2) - obj.get(0);
                    max = (diff * (r - 1) * c) + (diff1 * (c - 1));
                }
            }
            System.out.println(max);
        }
    }
}
