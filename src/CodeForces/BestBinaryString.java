package CodeForces;

import java.util.Scanner;

public class BestBinaryString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            String a = in.next();
            int n = a.length();
            char[] arr = new char[n];
            for (int i = 0; i < n; i++) {
                arr[i] = a.charAt(i);
            }
            if(arr[0] == '?'){
                arr[0] = '0';
            }
            for (int i = 1; i < n; i++) {
                if(arr[i] == '?'){
                    if(arr[i - 1] == '1'){
                        arr[i] = '1';
                    }else{
                        arr[i] = '0';
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i]);
            }
            System.out.println();
        }
    }
}
