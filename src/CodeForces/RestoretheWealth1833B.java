package CodeForces;
import java.util.*;

public class RestoretheWealth1833B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while(T-- > 0){
            int n = in.nextInt();
            int m = in.nextInt();
            List<Pair1> sc = new ArrayList<>();
            ArrayList<Integer> b = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                int k = in.nextInt();
                sc.add(new Pair1(k, j));
            }
            sc.sort(new SortByVal());
            for (int j = 0; j < n; j++) {
                b.add(in.nextInt());
            }
            Collections.sort(b);
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[sc.get(j).get_index()] = b.get(j);
            }
            for (int j = 0; j < n; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
    static class Pair1{
        int val;
        int index;
        public Pair1(int val, int index){
            this.val = val;
            this.index = index;
        }
        public int get_val(){
            return val;
        }
        public int get_index(){
            return index;
        }
    }
    static class SortByVal implements Comparator<Pair1> {
        @Override
        public int compare(Pair1 a, Pair1 b) {
            return a.get_val() - b.get_val();
        }
    }
}