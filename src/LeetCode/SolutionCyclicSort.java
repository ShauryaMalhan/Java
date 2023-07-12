package LeetCode;

import java.util.Arrays;

class SolutionCyclicSort {
    public static void main(String[] args) {
        int i = 0;
        int[] arr = {1, 2};
        while(i < arr.length){
            int correct = arr[i];
            if(arr[i] == arr.length || arr[i] == arr[correct]){
                i++;
            }
            else if (arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
        }
        System.out.println(Arrays.toString(arr));
        int ans = 0;
        for(int j = 0; j < arr.length; j++){
            if(arr[j] != j){
                ans = j;
                break;
            }else if(j == arr.length - 1){
                ans = j + 1;
            }
        }
        System.out.println(ans);
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}