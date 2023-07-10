// Given an array nums of integers, return how many of them contain an even number of digits.

package LeetCode;
import java.util.ArrayList;
import java.util.Scanner;

public class findNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            num.add(in.nextInt());
        }
        int ans = EvenDigitNumbers(num);
        System.out.println(ans);
    }
    static int EvenDigitNumbers(ArrayList<Integer> nums){
        int sum;
        int c = 0;
        for (int element : nums) {
            String size = Integer.toString(element);
            sum = size.length();
            if (sum % 2 == 0) {
                c += 1;
            }
        }
        return c;
    }
    static int EvenDigitNumbers2(int num){
        // How to find the size of a number
        return (int)(Math.log10(num)) + 1;
    }
}