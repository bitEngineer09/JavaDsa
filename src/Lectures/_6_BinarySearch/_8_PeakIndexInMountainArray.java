package Lectures._6_BinarySearch;

// badhta ghat ta hua array, just like mountains
// also known as bitonic array
// [1,2,3,4,5,6,7,3,2,1]

public class _8_PeakIndexInMountainArray {
    public static void main(String[] args) {
            int[] arr = {1,3,5,7,9,11,8,6,4,2};
        System.out.println(peak(arr));
    }
    static int peak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]) {
                // we are in decreasing part of array
                // this may be ans but look at left, that's why end != mid - 1;
                end = mid;
            }
            else {
                // we are in ascending part of array
                start = mid + 1; // coz we know that, mid + 1 element > mid element
            }
        }
        // in the end, start == end pointing to largest number because of 2 checks above
        // start and end are always trying to find the max element in above two checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say

        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of the above line is the best possible ans.
        return start; // return start or end cuz both are equal
    }
}
