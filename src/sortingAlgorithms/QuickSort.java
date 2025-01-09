package sortingAlgorithms;

public class QuickSort {

    // Function to partition the array
    public static int partition(int[] array, int low, int high) {
        // Choose the last element as the pivot
        int pivot = array[high];
        // Index of the smaller element, initialized to one less than 'low'
        int i = low - 1;

        // Iterate through the array from 'low' to 'high - 1'
        for (int j = low; j < high; j++) {
            // If the current element is smaller than or equal to the pivot
            if (array[j] <= pivot) {
                i++; // Move the index of the smaller element forward

                // Swap the current element with the element at index 'i'
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap the pivot element with the element at index 'i + 1'
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        // Return the partition index
        return i + 1;
    }

    // Function to implement Quick Sort
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) { // Ensure there are at least two elements to sort
            // Find the partition index
            int partitionIndex = partition(array, low, high);

            // Recursively sort elements before and after the partition
            quickSort(array, low, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, high);
        }
    }

    // Main method to test the Quick Sort algorithm
    public static void main(String[] args) {
        int[] array = {10, 7, 8, 9, 1, 5}; // Sample array
        int n = array.length;

        System.out.println("Original Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        // Call Quick Sort
        quickSort(array, 0, n - 1);

        System.out.println("\nSorted Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
