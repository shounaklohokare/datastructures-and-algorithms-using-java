import java.util.*;

public class QuickSort {

    public static void main(String[] args) {

        int[] arr = { 5, 4, 3, 2, 1, 8, 9, 10, -1, 4343, 69 };

        sort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));

    }

    static void sort(int[] nums, int lo, int hi) {

        if (lo >= hi) {
            return;
        }

        int s = lo;
        int e = hi;

        int m = s + (e - s) / 2; // pivot index

        int pivot = nums[m]; // pivot

        while (s <= e) {

            while (nums[s] < pivot) {
                s++; // if element at left of pivot
                     // is less than pivot then ignore and increment s pointer
            }

            while (pivot < nums[e]) {
                e--; // if element at right of pivot
                     // is greater than pivot then ignore and decrement e pointer
            }

            if (s <= e) {
                int temp = nums[s]; // after above loops we reach at stage where
                nums[s] = nums[e]; // where s points to element that should be at right of pivot
                nums[e] = temp; // and e points to element that should be left of pivot
                s++; // thus we swap
                e--;
            }

        }
        // after execution of above loop pivot is at right position

        // we sort again from start to pivot - 1, as e decrements it will point to pivot
        // - 1
        sort(nums, lo, e);
        // we sort again from pivot+1 to end, as s increments it will point to pivot + 1
        sort(nums, s, hi);

    }
}
