package Binary_Search;

import java.util.Scanner;

public class perfectSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        boolean ans = isPerfectSquare(a);
        System.out.println(ans);
    }
    static boolean isPerfectSquare(int num) {
        int start = 1;
        int end = num;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(end / mid == mid){
                return true;
            }
            if(end / mid < mid){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return false;
    }
}
