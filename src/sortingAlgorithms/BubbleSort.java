package sortingAlgorithms;

import java.util.Arrays;


public class BubbleSort {

    static void bubble(int[] a){
        int i = 0;
        int j = 0;
        while(i<a.length){
            while(j<a.length-i-1){
                if(a[j]>a[j+1]){
                    swap(a,j,j+1);
                }
                j++;
            }
            i++;
            j = 0;
        }
    }
    static void swap(int[] v, int a, int b){
        int temp = v[a];
        v[a] = v[b];
        v[b] = temp;
    }

    public static void main(String[] args) {
        int[] a = {9,8,7,6,5,4,3,2,1};
        bubble(a);
        System.out.println(Arrays.toString(a));

    }
}
