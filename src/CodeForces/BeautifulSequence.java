package CodeForces;

import java.util.ArrayList;
import java.util.Scanner;

public class BeautifulSequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            ArrayList<Long> obj = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                obj.add(in.nextLong());
            }
            String ans = "NO";
            for (int i = 1; i < n + 1; i++) {
                if(obj.get(i - 1) <= i){
                    ans = "YES";
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}
