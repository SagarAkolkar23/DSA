package sortingAlgorithms;

import java.util.Arrays;

public class MergeSort {

    // Function to divide the array into two halves and recursively sort them
    static int[] mergeSort(int[] a) {
        // Base case: If the array has only one element, it's already sorted
        if (a.length == 1) {
            return a;
        }

        // Find the middle index to split the array into two halves
        int mid = a.length / 2;

        // Recursively sort the left half of the array
        int[] left = mergeSort(Arrays.copyOfRange(a, 0, mid));

        // Recursively sort the right half of the array
        int[] right = mergeSort(Arrays.copyOfRange(a, mid, a.length));

        // Merge the sorted halves into a single sorted array
        return merge(left, right);
    }

    // Function to merge two sorted arrays into one sorted array
    static int[] merge(int[] first, int[] second) {
        // Create a new array to store the merged result
        int[] mix = new int[first.length + second.length];

        // Indices to track the current position in 'first', 'second', and 'mix'
        int i = 0; // Index for the 'first' array
        int j = 0; // Index for the 'second' array
        int k = 0; // Index for the 'mix' array

        // Merge elements from 'first' and 'second' while maintaining sorted order
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i]; // Take the smaller element from 'first'
                i++;
            } else {
                mix[k] = second[j]; // Take the smaller element from 'second'
                j++;
            }
            k++;
        }

        // Add remaining elements from the 'first' array, if any
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        // Add remaining elements from the 'second' array, if any
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        // Return the merged and sorted array
        return mix;
    }

    public static void main(String[] args) {
        // Input array to be sorted
        int[] a = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        // Print the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(mergeSort(a)));
    }
}
