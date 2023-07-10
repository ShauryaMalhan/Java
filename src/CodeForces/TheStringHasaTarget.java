package CodeForces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TheStringHasaTarget {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            String b = in.next();
            int a = 0;
            ArrayList<Character> ans = new ArrayList<>();
            char[] str = b.toCharArray();
            Arrays.sort(str);
            for (int i = n - 1; i >= 0; i--) {
                if(b.charAt(i) == str[0]){
                    ans.add(b.charAt(i));
                    a = i;
                    break;
                }
            }
            for (int i = 0; i < n; i++) {
                if(i == a){
                    System.out.print(ans.get(i));
                    continue;
                }
                ans.add(b.charAt(i));
                System.out.print(ans.get(i));
            }
            System.out.println();
        }
    }
}