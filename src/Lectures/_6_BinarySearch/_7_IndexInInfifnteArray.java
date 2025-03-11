package Lectures._6_BinarySearch;

// find position of element in a sorted infinte array
// esme hume length function use nahi karna varna cheating ho jaaegi

public class _7_IndexInInfifnteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(ans(arr, target));
    }

    // this fn finds the range
    static int ans(int[] nums, int target) {
        // first start with the box of size 2
        int start = 0;
        int end = 1;

        // target agar bada hai end se to hee aage badho
        while (target > nums[end]) {
            int tempNewStart = end + 1; // this is my new start
            // double the box value
            // end = previous end + size of previous array

            end = end + (end - (start - 1))*2;
            start = tempNewStart;  // newStart uper assign esliye nhi kiya coz it is using in finding end.
        }
        return binarySearch(nums, target, start, end);
    }

    static int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            }
            else if (target <  nums[mid]){
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
