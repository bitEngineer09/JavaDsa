package Striver._2_Recursion;

import java.util.Arrays;

public class _7_ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        revArray(arr,0, 6);
        System.out.println(Arrays.toString(arr));
    }

    // by taking two pointer variables
    static void reverseArray(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int temp =  arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr, start + 1, end - 1);
    }

    // by taking only one variable
    static void revArray(int[] arr, int i, int n) {
        if (i >= n/2) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;
        revArray(arr,i + 1, n);
    }
}
