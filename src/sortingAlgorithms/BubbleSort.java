package sortingAlgorithms;

import java.util.Arrays;

public class BubbleSort {

    // Function to perform Bubble Sort on an array
    static void bubble(int[] a) {
        // Outer loop to iterate through the entire array
        int i = 0; // 'i' tracks the number of passes
        int j = 0; // 'j' tracks comparisons within the current pass

        while (i < a.length) { // Continue until all passes are complete
            // Inner loop to compare adjacent elements
            while (j < a.length - i - 1) { // Reduce the range as larger elements are bubbled to the end
                // Swap if the current element is greater than the next
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1); // Swap adjacent elements
                }
                j++; // Move to the next pair of elements
            }
            i++; // Increment the pass counter
            j = 0; // Reset 'j' to start from the beginning for the next pass
        }
    }

    // Function to swap two elements in the array
    static void swap(int[] v, int a, int b) {
        int temp = v[a]; // Store the value of the first element in a temporary variable
        v[a] = v[b];     // Assign the value of the second element to the first
        v[b] = temp;     // Assign the temporary value to the second element
    }

    public static void main(String[] args) {
        // Input array to be sorted
        int[] a = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        // Perform Bubble Sort on the array
        bubble(a);

        // Print the sorted array
        System.out.println(Arrays.toString(a));
    }
}
