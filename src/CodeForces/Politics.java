package CodeForces;

import java.util.ArrayList;
import java.util.Scanner;

public class Politics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            int m = in.nextInt();
            String str = in.next();
            ArrayList<String> obj = new ArrayList<>();
            for (int i = 0; i < n - 1; i++) {
                obj.add(in.next());
            }
            int c = 0;
            for (int i = 0; i < n - 1; i++) {
                int ans = str.compareTo(obj.get(i));
                if (ans == 0) {
                    c++;
                }
            }
            System.out.println(c + 1);
        }
    }
}
