import java.util.*;

public class CyclicSort {

    public static void main(String[] args) {

        int[] arr = { 3, 5, 1, 6, 2, 4 };

        cyclicSort(arr);

        System.out.println(Arrays.toString(arr));

    }

    static void cyclicSort(int[] arr) {
        // cyclic sort works only if the array contains 1 to n elements
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1; // we compute the correct index of current element
            if (arr[i] != arr[correctIndex]) { // then we check whether the element at ith index is equal to that
                                               // element at the correct index
                // if they are not equal then we swap them
                swap(arr, i, correctIndex);
            } else {
                // if they are equal then we increment the value of i by 1
                i++;
            }
        }
    }

    static void swap(int[] arr, int x, int y) {
        int tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
    }

}
