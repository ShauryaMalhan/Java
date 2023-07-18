/* Whatever arguments are required for future function call they are passed as 
    arguments ans the arguments required for only the function are passed in the body.

    MAKE SURE TO RETURN THE RESULT OF A FUNCTION CALL OF THE RETURN TYPE
 */
package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 55, 66, 77};
        int target = 55;
        System.out.println(search(arr, target, 0, arr.length - 1));
    }
    static int search(int[] arr, int target, int s, int e){
        if(s > e){
            return -1;
        }
        int m = s + (e - s) / 2;
        if(arr[m] == target){
            return m;
        }
        if(target < arr[m]){
            return search(arr, target, s, m - 1);
        }
        return search(arr, target, m + 1, e);
    }
}
