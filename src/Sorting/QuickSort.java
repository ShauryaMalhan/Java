package Sorting;

import java.util.*;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        quicksort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    static void quicksort(int[] nums, int low, int hi){
        if(low >= hi){
            return;
        }
        int s = low;
        int e = hi;
        int mid = s + (e - s) / 2;
        int pivot = nums[mid];
        while(s <= e){
            // Also a reason why it is already sorted it will not swap.
            while(nums[s] < pivot){
                s++;
            }
            while(nums[e] > pivot){
                e--;
            }
            if(s <= e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }
        // Now my pivot is in correct index so please sort my 2 halves
        quicksort(nums, low, e);
        quicksort(nums, s, hi);
    }
}
