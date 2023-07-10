package Binary_Search;

import java.util.Arrays;

public class    OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        // To find if a sorted array is ascending or descending is by comparing first and last terms
        int[] arr = {-14, -10, -9, -6, -3, -1, 0, 2, 5, 7, 9, 13, 18, 20, 34, 90};
        int target = 18;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(Arrays.toString(arr));
        System.out.println(ans);
        int[] arr2 = {98, 89, 69, 43, 11, 0, -1, -9, -24, -35, -67, -79, -89};
        int target2 = -24;
        System.out.println(Arrays.toString(arr2));
        System.out.println(orderAgnosticBS(arr2, target2));
    }
    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        // find whether the array is sorted in ascending or descending order
        boolean isAsc = arr[start] < arr[end];

        while (start <= end){
            //find the middle element
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }
            if(isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            }
            else{
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}