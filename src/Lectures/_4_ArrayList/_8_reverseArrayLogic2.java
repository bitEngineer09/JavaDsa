package Lectures._4_ArrayList;

import java.util.Arrays;
public class _8_reverseArrayLogic2 {
    public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6};
    reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
