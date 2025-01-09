package sortingAlgorithms;

import java.util.Arrays;

import static sortingAlgorithms.BubbleSort.swap;

//Majorly used for partially sorted data or hybrid sorting algorithms
public class InsertionSort {
    static void Insertion(int[] a){

        // I is index upto which array is sorted
        for(int i = 0;i < a.length-1;i++){
            //j is index of number next to sorted part of array
            for(int j = i+1;j > 0; j--){
                // If element at index j is less than its previous element,
                // then we need swap this two elements
                // This swapping will continue unless j is greater than 0
                // once it reaches zero it means the array is sorted upto index i
                if(a[j] < a[j-1]){
                    swap(a, j, j-1);
                }
                // If element at j is greater than element at j-1
                // which means this element is greatest in the sorted part and
                // it should be kept there only so the loop breaks here
                else{
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {7,6,5,4,3,2,1};
        Insertion(a);
        System.out.println(Arrays.toString(a));
    }
}
