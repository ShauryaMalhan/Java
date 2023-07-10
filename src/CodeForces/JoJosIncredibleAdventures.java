package CodeForces;

import java.util.Scanner;

public class JoJosIncredibleAdventures {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            String str = in.next();
            long n = str.length();
            if(str.length() == 1 && str.charAt(0) == '1'){
                System.out.println(1);
            } else if (str.length() == 1 && str.charAt(0) == '0') {
                System.out.println(0);
            }else {
                int k = -1;
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == '0') {
                        k = i;
                        break;
                    }
                }
                if (k == -1) {
                    long ans = n * n;
                    System.out.println(ans);
                } else {
                    str = str.substring(k + 1) + str.substring(0, k + 1);
                    long sum = 0;
                    long max = 0;
                    for (int i = 0; i < str.length(); i++) {
                        if (str.charAt(i) == '1') {
                            sum++;
                        } else {
                            max = Math.max(max, sum);
                            sum = 0;
                        }
                        if (i == str.length() - 1) {
                            max = Math.max(max, sum);
                        }
                    }
                    int i = 1;
                    long j = max;
                    long ans = 0;
                    while (i <= j) {
                        long d = i * j;
                        ans = Math.max(d, ans);
                        i++;
                        j--;
                    }
                    System.out.println(ans);
                }
            }
        }
    }
}