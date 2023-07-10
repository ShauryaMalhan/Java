package CodeForces;

import java.util.*;
public class Arraypair {
        // Converts arr[0..n-1] to reduced form.
        public static void convert(int arr[], int n)
        {
            // Make a copy of the input array
            int[] sorted_arr = Arrays.copyOf(arr, n);

            // Sort the copy in non-decreasing order
            Arrays.sort(sorted_arr);

            // Map each element of the sorted array to its index
            // in the range 0 to n-1
            HashMap<Integer, Integer> mp
                    = new HashMap<Integer, Integer>();
            for (int i = 0; i < n; i++) {
                mp.put(sorted_arr[i], i);
            }

            // Replace each element of the input array with its
            // corresponding index
            for (int i = 0; i < n; i++) {
                arr[i] = mp.get(arr[i]);
            }
        }

        // Utility function to print an array.
        public static void printArr(int arr[], int n)
        {
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        // Driver program to test above method
        public static void main(String[] args)
        {
            int arr[] = { 10, 20, 15, 12, 11, 50 };
            int n = arr.length;

            System.out.println("Given Array is ");
            printArr(arr, n);

            convert(arr, n);

            System.out.println("\n\nConverted Array is ");
            printArr(arr, n);
        }
    }