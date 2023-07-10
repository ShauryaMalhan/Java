package CodeForces;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class ArrayMerging {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) {
            int n = in.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            ArrayList<Integer> b = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                a.add(in.nextInt());
            }
            for (int i = 0; i < n; i++) {
                b.add(in.nextInt());
            }
            int[] fora = new int[2*n];
            int[] forb = new int[2*n];
            int sum = 1;
            int diff = 1;
            if(a.size() == 1){
                fora[a.get(0) - 1] = sum;
            }
            if(b.size() == 1){
                forb[b.get(0) - 1] = diff;
            }
            for (int i = 1; i < n; i++) {
                if(a.get(i).equals(a.get(i - 1))){
                    sum++;
                    if(i == a.size() - 1){
                        int curr = a.get(i);
                        if(fora[curr - 1] < sum){
                            fora[curr - 1] = sum;
                        }
                    }
                }else{
                    int curr = a.get(i - 1);
                    if(fora[curr - 1] < sum){
                        fora[curr - 1] = sum;
                    }
                    sum = 1;
                    if(i == a.size() - 1){
                        curr = a.get(i);
                        if(fora[curr - 1] < sum){
                            fora[curr - 1] = sum;
                        }
                    }
                }
                if(Objects.equals(b.get(i), b.get(i - 1))){
                    diff++;
                    if(i == b.size() - 1){
                        int curr = b.get(i);
                        if(forb[curr - 1] < diff){
                            forb[curr - 1] = diff;
                        }
                    }
                }else{
                    int curr = b.get(i - 1);
                    if(forb[curr - 1] < diff){
                        forb[curr - 1] = diff;
                    }
                    diff = 1;
                    if(i == b.size() - 1){
                        curr = b.get(i);
                        if(forb[curr - 1] < diff){
                            forb[curr - 1] = diff;
                        }
                    }
                }
            }
            int max = 0;
            for (int i = 0; i < 2*n; i++) {
                fora[i] = fora[i] + forb[i];
                max = Math.max(max, fora[i]);
            }
            System.out.println(max);
        }
    }
}