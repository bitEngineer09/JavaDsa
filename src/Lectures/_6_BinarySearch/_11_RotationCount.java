package Lectures._6_BinarySearch;

public class _11_RotationCount {
    public static void main(String[] args) {
        int[] arr = {3, 5,7,8, 1,2};
        System.out.println(countRotations(arr));
    }
    static int countRotations(int[] arr) {
        int pivot = findPivot(arr);
        return pivot + 1;
    }

    // use this when array doesn't have duplicates
    static int findPivot(int[] nums) {
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