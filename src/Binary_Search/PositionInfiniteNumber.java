package Binary_Search;

public class PositionInfiniteNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 8, 10, 12, 17, 1, 20, 23, 25, 28, 30,
                34, 37, 39, 40, 45, 56, 58, 59, 60, 62, 67, 69, 70, 71, 78};
        int target = 58;
        int ans = ans(arr, target);
        System.out.println(ans);
    }
    static int ans(int[] arr, int target){
        // First find the range
        // First start with a box of side 2
        int start = 0;
        int end = 1;

        //Condition for the target to lie in the range
        while(target > arr[end]){
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return search(arr, target, start, end);
    }
    static int search(int[] arr, int target, int start, int end){
        // As infinite array cannot use start and ending
        while (start <= end) {
            int mid = start + (end - start) / 2;
             if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }else if (target == arr[mid]) {
                return mid;
            }
        }
        return -1;
    }
}