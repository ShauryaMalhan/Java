package Binary_Search;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        // 1. Find the pivot in the array, largest in the array
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(peakInRotatoryArray(arr));
        int[] arr1 = {7, 7, 7, 0, 1, 2};
        System.out.println(peakInDupplicateRotatoryArray(arr1));
    }
    static int peakInRotatoryArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }else if(mid > start && arr[mid] < arr[mid + 1]){
                return mid - 1;
            }else if(arr[mid] <= arr[start]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
    static int peakInDupplicateRotatoryArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }else if(mid > start && arr[mid] < arr[mid + 1]){
                return mid - 1;
            }
            // If elements at start mid and end are duplicate then skip the start and end
            // What if these elements at start and end are at the pivot
            // Check if start is pivot
            if(arr[start] == arr[mid] && arr[mid] == arr[end]){
                if(arr[start] > arr[start + 1]){
                    return start;
                }
                start++;
                //check for end
                if(arr[end] == arr[end - 1]){
                    return end - 1;
                }
                end--;
            }
            // left side is sorted so pivot is in right
            else if (arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]) {
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
}