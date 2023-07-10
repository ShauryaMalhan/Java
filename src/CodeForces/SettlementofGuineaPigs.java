package CodeForces;

import java.util.ArrayList;
import java.util.Scanner;

public class SettlementofGuineaPigs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            ArrayList<Integer> obj = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                obj.add(in.nextInt());
            }
            int a = 0;
            int k = 0;
            int ans = 0;
            for (int i = 0; i < n; i++) {
                if(obj.get(i) == 1){
                    a++;
                }else{
                    k += a;
                    a = 0;
                }
                int temp = 0;
                if(k != 0){
                    temp = k / 2 + 1;
                }
                ans = Math.max(ans, temp + a);
            }
            System.out.println(ans);
        }
    }
}