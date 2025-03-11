package Lectures._6_BinarySearch;

public class _11_SearchInRotatedArrayDuplicatesAllowed {
    public static void main(String[] args) {
        int[] arr = {3,5,1};
        System.out.println(findPivotWithDuplicates(arr));
        System.out.println(search(arr,3));
    }

    static int search(int[] nums, int target) {
        int pivot = findPivotWithDuplicates(nums);
        // if pivot is not found, it means the array is not rotated
        if (pivot == -1) {
            // just do the normal binary search
            return binary(nums, target,0,nums.length - 1);
        }

        // if pivot is found, we have 2 asc sorted arrays
        if (nums[pivot] == target) {
            return pivot;
        }

        if (target >= nums[0]) { // search space is reduced to { s to (p - 1) }
            return binary(nums, target, 0, pivot-1);
        }
        // search space is reduced to { (p + 1) to (arr.length - 1) }
        return binary(nums, target, pivot + 1, nums.length - 1);

    }

    // this will not work for pivot values
    static int findPivotWithDuplicates(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // 4 Cases
            if (mid < end && nums[mid] > nums[mid + 1]) {  // mid < end esliye kiya kyuki agar mid end hua, to mid + 1 out of bound error aaega
                return mid;
            } if (mid > start && nums[mid] < nums[mid - 1]){
                return mid;
            } if (nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    static int binary(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            if (target < nums[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
