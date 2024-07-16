package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int arr[]) {
        boolean swapped;
        // Outer loop to traverse the entire array
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    // Set the swapped flag to true as a swap occurred
                    swapped = true;
                }
            }
            // If no elements were swapped in the inner loop, the array is sorted
            if (!swapped) {
                break; // Break out of the loop early to optimize performance
            }
        }
    }
}
