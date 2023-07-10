package CodeForces;
import java.util.Scanner;

public class TwinPermutations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int i = 0;
        while(i < T){
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = in.nextInt();
            }
            int sum = n + 1;
            int[] res = new int[n];
            for (int j = 0; j < n; j++) {
                res[j] = sum - arr[j];
            }
            for (int j = 0; j < n; j++) {
                System.out.print(res[j] + " ");
            }
            System.out.println();
            i++;
        }
    }
}
