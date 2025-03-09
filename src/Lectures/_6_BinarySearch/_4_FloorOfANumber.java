package Lectures._6_BinarySearch;

public class _4_FloorOfANumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,8,14,16,18};
        System.out.println(Floor(arr, -2));
    }

    // returns index: greatest number <= target
    static int Floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length;
        // if target is smaller than the smallest element is array
        if (target < arr[0]) {
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
        return end; // will execute when while condn becomes false.
                    // e target s -> e is the greatest number <= target
    }
}
