// Find the ceiling number which is the smallest number greater than the target number
package Binary_Search;
public class CeilingNumberQuestion {
    public static void main(String[] args) {
        int[] arr = {-89, -78, -60, -34, -22, -18, -8, 0, 3, 6, 14, 16, 17, 23, 45, 56, 78, 89};
        int target = 80;
        System.out.println(Ceiling(arr, target));
        System.out.println(floor(arr, target));
    }
    static int Ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        if(target > arr[arr.length -1]){
            return -1;
        }
        while (start <= end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return arr[mid];
            }
            if(target > arr[mid]){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
        }
        return start;
    }
    static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return arr[mid];
            }
            if(target > arr[mid]){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
        }
        return end;
    }
}