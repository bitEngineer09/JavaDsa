package Lectures._6_BinarySearch;

// Google, Amazon
// https://leetcode.com/problems/find-in-mountain-array/submissions/1570417124/

public class _10_SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {3,5,1};
        System.out.println(findPivot(arr));
        System.out.println(search(arr,3));
    }

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
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

    // this will not work for duplicate pivot values
    static int  findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // 4 Cases
            if (mid < end && nums[mid] > nums[mid + 1]) {  // mid < end esliye kiya kyuki agar mid end hua, to mid + 1 out of bound error aaega
                return mid;
            } if (mid > start && nums[mid] < nums[mid - 1]){
                return mid - 1;
            } if (nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    // this will work for duplicate pivot values
    static int findPivotInDplicates(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && nums[mid] > nums[mid + 1]) {  // mid < end esliye kiya kyuki agar mid end hua, to mid + 1 out of bound error aaega
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]){
                return mid - 1;
            }

            if (nums[mid] == nums[start] && nums[mid] == nums[end]) {
                // skip the duplicates
                // Note: what if these elements at start and end were pivot ??
                // check if start is pivot
                if (nums[start] > nums[start + 1]) {
                    return start;
                }
                start++;

                // check if end is pivot
                if (nums[end] < nums[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            else if (nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
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
