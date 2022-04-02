package basicJavaPrograms;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = { 5, 4, 3, 2, 1 };

        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) { // i will change from range 1 to length-1
            int last = arr.length - i - 1; // each time last will point to last element then penultimate element
                                           // followed by pre-penultimate element and so on with the help of i
            int max = findMax(arr, last); // will find value of the maximum element from 0 to last element
            swap(arr, last, max); // will swap value the last element and max element
        }

    }

    static int findMax(int[] arr, int last) {
        // will find the maximum element from 0 to last
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i <= last; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }

        return index;
    }

    static void swap(int[] arr, int a, int b) {
        // will swap the two elements in arr
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }
}
