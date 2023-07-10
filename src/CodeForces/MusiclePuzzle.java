package CodeForces;

import java.util.*;

public class MusiclePuzzle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) {
            int n = in.nextInt();
            String str = in.next();
            HashSet<String> final1 = new HashSet<>();
            for (int i = 0; i < n - 1; i++) {
                final1.add(str.charAt(i) + "" + str.charAt(i + 1));
            }
            System.out.println(final1.size());
        }
    }
}