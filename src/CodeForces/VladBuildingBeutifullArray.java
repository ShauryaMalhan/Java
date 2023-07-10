package CodeForces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class VladBuildingBeutifullArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int i = 0;
        while(i < T) {
            int n = in.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                arr.add(in.nextInt());
            }
            Collections.sort(arr);
            String k = "YES";
            if(arr.get(0) % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    if (arr.get(j) % 2 != 0) {
                        k = "NO";
                        break;
                    }
                }
            }
            System.out.println(k);
            i++;
        }
    }
}
