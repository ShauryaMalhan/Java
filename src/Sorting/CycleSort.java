package Sorting;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        // When Given Numbers from 1 to n use cyclic sort
        int[] arr = {3, 5, 2, 1, 4};
        cyclic_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclic_sort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
