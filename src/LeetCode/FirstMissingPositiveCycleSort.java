package LeetCode;

import java.util.Arrays;

class FirstMissingPositiveCycleSort {
    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
        cyclic_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclic_sort(int[] arr){
        int i = 0;
        while(i < arr.length){
            if(arr[i] > 0){
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]){
                    swap(arr, i, correct);
                }else{
                    i++;
                }
            }else{
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j + 1){
                System.out.println(j + 1);
                break;
            }else if(j == arr.length - 1){
                System.out.println(arr.length);
            }
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}