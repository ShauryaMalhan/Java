package Arrays;
import java.util.Arrays;
public class PassinginFunctions {
    public static void main(String[] args) {
        int[] nums = {3, 4, 56, 89};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
            arr[0] = 99;
    }
}
// Arrays are immutable while strings are not