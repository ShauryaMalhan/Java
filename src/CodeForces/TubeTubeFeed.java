package CodeForces;

import java.util.ArrayList;
import java.util.Scanner;

public class TubeTubeFeed {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        while(q-- > 0){
            int n = in.nextInt();
            int t = in.nextInt();
            ArrayList<Integer> obj = new ArrayList<>();
            ArrayList<Integer> obj1 = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                obj.add(in.nextInt());
            }
            for (int i = 0; i < n; i++) {
                obj1.add(in.nextInt());
            }
            int c = -1;
            int max = -1;
            for (int i = 0; i < n; i++) {
                int sum = t - i;
                if(sum >= obj.get(i) && obj1.get(i) > max){
                    max = obj1.get(i);
                    c = i;
                }
            }
            if(c == -1){
                System.out.println(-1);
            }else{
                System.out.println(c + 1);
            }
        }
    }
}