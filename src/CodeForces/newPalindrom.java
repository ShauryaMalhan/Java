package CodeForces;

import java.util.Scanner;

public class newPalindrom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) {
            String str = in.next();
            Character[] arr = new Character[str.length()];
            for (int i = 0; i < str.length(); i++) {
                arr[i] = str.charAt(i);
            }
            int mid = arr.length / 2;
            String k = "NO";
            if(str.length() % 2 != 0){
                for (int i = mid + 1; i < arr.length - 1; i++) {
                    if (arr[i] != arr[i + 1]) {
                        k = "YES";
                        break;
                    }
                }
            }else{
                for (int i = mid; i < arr.length - 1; i++) {
                    if (arr[i] != arr[i + 1]) {
                        k = "YES";
                        break;
                    }
                }
            }
            System.out.println(k);
        }
    }
}