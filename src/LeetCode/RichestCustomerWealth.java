package LeetCode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int n = in.nextInt();
        int k = in.nextInt();
        int m = 0;
        for (int j = 0; j < n; j++) {
            list.add(new ArrayList<>());
        }
        while (m < n){
            for (int i = 0; i < k; i++) {
                int c = in.nextInt();
                list.get(m).add(c);
            }
            m++;
        }
        System.out.println(list);
        int ans = wealth(list);
        System.out.println(ans);
    }
    static int wealth(ArrayList<ArrayList<Integer>> obj){
        ArrayList<Integer> max = new ArrayList<>();
        for (ArrayList<Integer> integers : obj) {
            int sum = 0;
            for (Integer integer : integers) {
                sum += integer;
                max.add(sum);
            }
        }
        return Collections.max(max);
    }
}
