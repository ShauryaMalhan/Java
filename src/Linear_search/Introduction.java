package Linear_search;

public class Introduction {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 19;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }
    // Search in the Array: Return the index if item found
    // Otherwise if index not found return -1
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            //check for target at every index
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        //Target not found
        return -1;
    }
}
