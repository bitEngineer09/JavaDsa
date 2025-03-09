package Lectures._6_BinarySearch;

import java.util.Arrays;

public class _6_FirstLastPositionInSortedArray {
    public static void main(String[] args) {
        int[] arr = {5,7,9,9,9,12,13,15};
        final int[] range = findRange(arr, 9);
        System.out.println(Arrays.toString(range));
    }

    static int[] findRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        int start = search(nums, target, true);  // true means: are you trying to find the start value
        int end = search(nums, target, false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }


    // this function just return the index value of the target
    static int search(int[] nums, int target, boolean findStartIndex) {
        // findStartIndex matlab ki (e = m - 1) karega, whenever it finds mid value = target
        // otherwise it will do (s = m + 1)
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            }
            else if (target < nums[mid]) {
                end = mid - 1;
            }
            else {
                // potential ans found
                ans = mid;
                if (findStartIndex) { // if(findStartIndex == true) -> can also be written
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
