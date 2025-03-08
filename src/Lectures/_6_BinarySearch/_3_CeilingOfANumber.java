package Lectures._6_BinarySearch;

public class _3_CeilingOfANumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,8,14,16,18};
        System.out.println(Ceil(arr, 30));
    }

    // return index: smallest number >= target
    static int Ceil(int[] arr, int target) {
        int start = 0;
        int end = arr.length;

        // but what if the target is greater than the greatest element in the array
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return start;
    }
}
