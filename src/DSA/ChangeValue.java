package DSA;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        // create an array
        int[] arr = {1, 3, 2, 45, 6};
        change(arr);
        System.out.println(Arrays.toString(arr));
        // When we modify something it changes but when a new object is made it does not change
    }
    static void change(int[] nums){
        nums[0] = 99;

    }
}
