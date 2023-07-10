package Binary_Search;

public class SortedArray {
    public static void main(String[] args) {
        // Find the middle element
        // If target > mid then search in the right else search in left
        // If the middle element is equal to my target element then answer
        // If start > end then element not found in ascending
        // important: K(Total number of levels in the worst case) = logN
        int[] arr = {-14, -10, -9, -6, -3, -1, 0, 2, 5, 7, 9, 13, 18, 20, 34, 90};
        int target = 18;
        int ans = binarysearch(arr, target);
        System.out.println(ans);
    }
    // return the index
    static int binarysearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        while (start <= end){
            //find the middle element
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
